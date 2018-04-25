package services

import java.text.SimpleDateFormat

import model.SunInfo
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

import play.api.libs.ws.WSClient

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


class SunService(wsClient: WSClient) {
  def getSunInfo(lat: Double, lon: Double): Future[SunInfo] = {
    val responseF = wsClient.url("http://api.sunrise-sunset.org/json?" +
      s"lat=$lat&lng=$lon&formatted=0").get()
    responseF.map { response =>
      val json = response.json
      val sunriseTimeStr = (json \ "results" \ "sunrise").as[String]
      val sunsetTimeStr = (json \ "results" \ "sunset").as[String]
      val sunriseTime = ZonedDateTime.parse(sunriseTimeStr)
      val sunsetTime = ZonedDateTime.parse(sunsetTimeStr)
      val formatter = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.of("Europe/Moscow"))
      val date = new Date()
      val dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date)
      val sunInfo = SunInfo(sunriseTime.format(formatter), sunsetTime.format(formatter), dateStr)
      sunInfo
    }
  }
}
