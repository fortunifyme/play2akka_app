import com.softwaremill.macwire._
import _root_.controllers.{Application, AssetsComponents}
import play.api.ApplicationLoader.Context
import play.api._
import play.api.libs.ws.ahc.AhcWSComponents
import play.api.mvc._
import play.api.routing.Router
import play.filters.HttpFiltersComponents
import router.Routes
import services.{SunService, WeatherService}

class AppApplicationLoader extends ApplicationLoader {
  def load(context: Context) = {
    LoggerConfigurator(context.environment.classLoader).foreach { configurator =>
      configurator.configure(context.environment)
    }
    new AppComponents(context).application
  }
}

class AppComponents(context: Context) extends BuiltInComponentsFromContext(context)
  with AhcWSComponents with AssetsComponents with HttpFiltersComponents  {

  override lazy val controllerComponents: DefaultControllerComponents = wire[DefaultControllerComponents]
  lazy val prefix: String = "/"
  lazy val router: Router = wire[Routes]
  lazy val applicationController: Application = wire[Application]

  lazy val sunService =  wire[SunService]
  lazy val weatherService =  wire[WeatherService]


}
