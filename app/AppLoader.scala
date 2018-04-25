import com.softwaremill.macwire._
import _root_.controllers.{Application, AssetsComponents}
import actors.StatsActor
import actors.StatsActor.Ping
import akka.actor.{ActorRef, Props}
import filter.StatsFilter
import play.api.ApplicationLoader.Context
import play.api._
import play.api.libs.ws.ahc.AhcWSComponents
import play.api.mvc._
import play.api.routing.Router
import play.core.WebCommands
import play.filters.HttpFiltersComponents
import router.Routes
import services.{SunService, WeatherService}

import scala.concurrent.Future

class AppApplicationLoader extends ApplicationLoader {
  def load(context: Context) = {
    LoggerConfigurator(context.environment.classLoader).foreach { configurator =>
      configurator.configure(context.environment)
    }
    new AppComponents(context).application
  }
}

class AppComponents(context: Context) extends BuiltInComponentsFromContext(context)
  with AhcWSComponents with AssetsComponents with HttpFiltersComponents {

  override lazy val controllerComponents: DefaultControllerComponents = wire[DefaultControllerComponents]
  lazy val prefix: String = "/"
  lazy val router: Router = wire[Routes]
  lazy val applicationController: Application = wire[Application]

  lazy val sunService: SunService = wire[SunService]
  lazy val weatherService: WeatherService = wire[WeatherService]

  applicationLifecycle.addStopHook { () =>


    Logger.info("The app is about to stop")
    Future.successful(Unit)
  }
  /**
    * if you wanna perform some task before application is started
    */
  val onStart: Unit = {
    Logger.info("The app is about to start")
    statsActor ! Ping
  }

  lazy val statsFilter: Filter = wire[StatsFilter]
  override lazy val httpFilters = Seq(statsFilter)

  lazy val statsActor: ActorRef = actorSystem.actorOf(
    Props(wire[StatsActor]), StatsActor.name)


}
