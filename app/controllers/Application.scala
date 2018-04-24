package controllers

import java.text.SimpleDateFormat
import java.util.Date
import javax.inject._

import play.api._
import play.api.mvc._

class Application @Inject() (components: ControllerComponents)
    extends AbstractController(components) {
  def index = Action {
    val date = new Date()
    val dateStr = new SimpleDateFormat().format(date)
    Ok(views.html.index(dateStr))
  }
}
