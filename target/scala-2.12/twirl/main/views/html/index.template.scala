
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <link rel="shortcut icon" type="image/png"
           href=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("images/favicon.png")),format.raw/*7.64*/("""">
    </head>
    <body>
        <h1>Hello Play</h1>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 16:01:25 MSK 2018
                  SOURCE: /home/osboxes/IdeaProjects/play_akka_focused/scala-web-project/app/views/index.scala.html
                  HASH: a94ac0ef6ba0426d8b6d779c5813d762f71d94ab
                  MATRIX: 722->1|818->3|845->4|1012->145|1026->151|1085->190
                  LINES: 21->1|26->1|27->2|32->7|32->7|32->7
                  -- GENERATED --
              */
          