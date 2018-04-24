// @GENERATOR:play-routes-compiler
// @SOURCE:/home/osboxes/Desktop/play-scala-seed/conf/routes
// @DATE:Tue Apr 24 15:00:59 MSK 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def at(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public" ), ("file", "index.html"))); _rrc
      Call("GET", _prefix)
    }
  
  }


}
