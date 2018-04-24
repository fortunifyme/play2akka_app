package controllers

import java.text.SimpleDateFormat
import java.util.Date
import javax.inject._

import model.SunInfo
import play.api._
import play.api.libs.ws.WSClient
import play.api.mvc._
import services.{SunService, WeatherService}


import scala.concurrent.Future

/*class Application @Inject()(components: ControllerComponents, sunService: SunService,
                            weatherService: WeatherService)*/
class Application @Inject()(components: ControllerComponents, wsClient:WSClient)
  extends AbstractController(components) {

  val sunService = new SunService(wsClient)
  val weatherService = new WeatherService(wsClient)

  /**
    * important import !!! error => Cannot find an implicit ExecutionContext. You might pass....
    */
  import scala.concurrent.ExecutionContext.Implicits.global
  def index = Action.async {
    val lat = -33.8830
    val lon = 151.2167
    val sunInfoF = sunService.getSunInfo(lat, lon)
    val temperatureF = weatherService.getTemperature(lat, lon)
    println("9 999999 ")
    // println(sunInfoF)

    for {
      sunInfo <- sunInfoF
      temperature <- temperatureF
    } yield {
      println("9 999999 ")
      Ok(views.html.index(sunInfo , temperature))
    }

   // Ok(views.html.index(sunInfoF, temperatureF))

  }

  /* val date = new Date()
   val dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date)
   Future.successful {Ok(views.html.index(dateStr))}*/


}
