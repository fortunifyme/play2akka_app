/*
package services

import java.time.{ZoneId, ZonedDateTime}
import java.time.format.DateTimeFormatter

import model.SunInfo
import play.api.libs.ws.WSClient

import scala.concurrent.Future

class SunService(wsClient: WSClient) {

  def getSunInfo(lat: Double, lon: Double): Future[SunInfo] = {
    val responseF = wsClient.url("http://samples.openweathermap.org/data/2.5" +
      s"/weather?lat=$lat&lon=$lon&appid=b6907d289e10d714a6e88b30761fae22").get()
    responseF.map { response =>
      val json = response.json
      val sunriseTimeStr = (json \ "sys" \ "sunrise").as[String]
      val sunsetTimeStr = (json \ "sys" \ "sunset").as[String]
      val sunriseTime = ZonedDateTime.parse(sunriseTimeStr)
      val sunsetTime = ZonedDateTime.parse(sunsetTimeStr)
      val formatter = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.of("Australia/Sydney"))
      val sunInfo = SunInfo(sunriseTime.format(formatter), sunsetTime.format(formatter))
      sunInfo
    }

  }
}
*/


package services

import model.SunInfo
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import play.api.libs.ws.WSClient

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


class SunService(wsClient: WSClient) {
  def getSunInfo(lat: Double, lon: Double): Future[SunInfo] = {
    println("1 99999999 ")
    val responseF = wsClient.url("http://api.sunrise-sunset.org/json?" +
      s"lat=$lat&lng=$lon&formatted=0").get()
    println("2 99999999 ")
    responseF.map { response =>
      val json = response.json
      val sunriseTimeStr = (json \ "results" \ "sunrise").as[String]
      val sunsetTimeStr = (json \ "results" \ "sunset").as[String]
      val sunriseTime = ZonedDateTime.parse(sunriseTimeStr)
      val sunsetTime = ZonedDateTime.parse(sunsetTimeStr)
      val formatter = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.of("Australia/Sydney"))
      val sunInfo = SunInfo(sunriseTime.format(formatter), sunsetTime.format(formatter))
      println(sunInfo.toString + "3 99999999 ")
      sunInfo
    }
  }
}
