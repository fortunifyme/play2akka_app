package controllers

import java.text.SimpleDateFormat
import java.util.Date
import javax.inject._

import akka.actor.ActorSystem
import model.SunInfo
import play.api._
import play.api.libs.ws.WSClient
import play.api.mvc._
import services.{SunService, WeatherService}
import java.util.concurrent.TimeUnit

import actors.StatsActor
import akka.util.Timeout
import akka.pattern.ask

import scala.concurrent.Future

import actors.StatsActor
import akka.actor.ActorSystem
import akka.util.Timeout

import play.api.libs.json.Json
import play.api.mvc._
import akka.pattern.ask
import services._

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.data.Form
import play.api.data.Forms._

class Application @Inject()(components: ControllerComponents, sunService: SunService,
                            weatherService: WeatherService, actorSystem: ActorSystem)
  extends AbstractController(components) {




  def index: Action[AnyContent] = Action.async {
    val lat = 55.7558
    val lon = 37.6173
    val sunInfoF = sunService.getSunInfo(lat, lon)
    val temperatureF = weatherService.getTemperature(lat, lon)
    implicit  val timeout: Timeout = Timeout(5,TimeUnit.SECONDS)
    val requestsF = (actorSystem.actorSelection(StatsActor.path) ? StatsActor.GetStats).mapTo[Int]


    for {
      sunInfo <- sunInfoF
      temperature <- temperatureF
      requests <- requestsF
    } yield {

      Ok(views.html.index(sunInfo, temperature, requests))
    }


  }


}
