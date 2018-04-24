
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[model.SunInfo,Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(sunInfo:model.SunInfo , temperature : Double ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <link rel="shortcut icon" type="image/png"
           href=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("images/favicon.png")),format.raw/*7.64*/("""">
    </head>
    <body>
        <h1>Hello World</h1>
        <div> Current time: """),_display_(/*11.30*/sunInfo/*11.37*/.sunrise),format.raw/*11.45*/(""" """),format.raw/*11.46*/("""</div>
        <div> Current time: """),_display_(/*12.30*/sunInfo/*12.37*/.sunset),format.raw/*12.44*/(""" """),format.raw/*12.45*/("""</div>
        <div> Current temperature: """),_display_(/*13.37*/temperature),format.raw/*13.48*/("""</div>

    </body>
</html>
"""))
      }
    }
  }

  def render(sunInfo:model.SunInfo,temperature:Double): play.twirl.api.HtmlFormat.Appendable = apply(sunInfo,temperature)

  def f:((model.SunInfo,Double) => play.twirl.api.HtmlFormat.Appendable) = (sunInfo,temperature) => apply(sunInfo,temperature)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 19:16:52 MSK 2018
                  SOURCE: /home/osboxes/IdeaProjects/play_akka_focused/scala-web-project/app/views/index.scala.html
                  HASH: e078208afd1501dd611c444982b69088af6e5a88
                  MATRIX: 743->2|885->49|912->50|1079->191|1093->197|1152->236|1263->320|1279->327|1308->335|1337->336|1400->372|1416->379|1444->386|1473->387|1543->430|1575->441
                  LINES: 21->1|26->1|27->2|32->7|32->7|32->7|36->11|36->11|36->11|36->11|37->12|37->12|37->12|37->12|38->13|38->13
                  -- GENERATED --
              */
          