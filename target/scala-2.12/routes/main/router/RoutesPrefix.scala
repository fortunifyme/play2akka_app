
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/osboxes/IdeaProjects/play_akka_focused/scala-web-project/conf/routes
// @DATE:Tue Apr 24 16:01:25 MSK 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
