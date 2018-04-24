
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(timeStr:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <link rel="shortcut icon" type="image/png"
           href=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("images/favicon.png")),format.raw/*7.64*/("""">
    </head>
    <body>
        <h1>Hello World</h1>
        <div> Current time: """),_display_(/*11.30*/timeStr),format.raw/*11.37*/(""" """),format.raw/*11.38*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(timeStr:String): play.twirl.api.HtmlFormat.Appendable = apply(timeStr)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (timeStr) => apply(timeStr)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 16:33:25 MSK 2018
                  SOURCE: /home/osboxes/IdeaProjects/play_akka_focused/scala-web-project/app/views/index.scala.html
                  HASH: 9f6393b9747fd410575f8c3405d95869c2423cce
                  MATRIX: 729->1|840->17|867->18|1034->159|1048->165|1107->204|1218->288|1246->295|1275->296
                  LINES: 21->1|26->1|27->2|32->7|32->7|32->7|36->11|36->11|36->11
                  -- GENERATED --
              */
          