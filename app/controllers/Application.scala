package controllers

import java.text.SimpleDateFormat
import java.util.Date
import javax.inject._

import play.api._
import play.api.mvc._

import scala.concurrent.Future

class Application @Inject() (components: ControllerComponents)
    extends AbstractController(components) {
  def index = Action.async {
    val date = new Date()
    val dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date)
    Future.successful {Ok(views.html.index(dateStr))}

  }
}
