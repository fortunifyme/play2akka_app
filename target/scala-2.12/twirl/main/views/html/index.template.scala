
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[model.SunInfo,Double,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(sunInfo:model.SunInfo , temperature : Double , counter : Int ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <link rel="shortcut icon" type="image/png"
           href=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("images/favicon.png")),format.raw/*7.64*/("""">
    </head>
    <body>
        <h1>Hello World</h1>
        <div> Current time: """),_display_(/*11.30*/sunInfo/*11.37*/.currTime),format.raw/*11.46*/("""</div>
        <div> sunrise time: """),_display_(/*12.30*/sunInfo/*12.37*/.sunrise),format.raw/*12.45*/(""" """),format.raw/*12.46*/("""</div>
        <div> sunset time: """),_display_(/*13.29*/sunInfo/*13.36*/.sunset),format.raw/*13.43*/(""" """),format.raw/*13.44*/("""</div>
        <div> Current temperature: """),_display_(/*14.37*/temperature),format.raw/*14.48*/("""</div>
        <div> Request number: """),_display_(/*15.32*/counter),format.raw/*15.39*/("""</div>


    </body>
</html>
"""))
      }
    }
  }

  def render(sunInfo:model.SunInfo,temperature:Double,counter:Int): play.twirl.api.HtmlFormat.Appendable = apply(sunInfo,temperature,counter)

  def f:((model.SunInfo,Double,Int) => play.twirl.api.HtmlFormat.Appendable) = (sunInfo,temperature,counter) => apply(sunInfo,temperature,counter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 25 13:15:14 MSK 2018
                  SOURCE: /home/osboxes/IdeaProjects/play_akka_focused/scala-web-project/app/views/index.scala.html
                  HASH: a0ee64ad2b25f6054848146ff31cf40ddcc5c456
                  MATRIX: 747->2|905->65|932->66|1099->207|1113->213|1172->252|1283->336|1299->343|1329->352|1392->388|1408->395|1437->403|1466->404|1528->439|1544->446|1572->453|1601->454|1671->497|1703->508|1768->546|1796->553
                  LINES: 21->1|26->1|27->2|32->7|32->7|32->7|36->11|36->11|36->11|37->12|37->12|37->12|37->12|38->13|38->13|38->13|38->13|39->14|39->14|40->15|40->15
                  -- GENERATED --
              */
          