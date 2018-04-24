// @GENERATOR:play-routes-compiler
// @SOURCE:/home/osboxes/Desktop/play-scala-seed/conf/routes
// @DATE:Tue Apr 24 14:10:31 MSK 2018


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
