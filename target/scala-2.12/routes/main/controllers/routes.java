// @GENERATOR:play-routes-compiler
// @SOURCE:/home/osboxes/Desktop/play-scala-seed/conf/routes
// @DATE:Tue Apr 24 15:00:59 MSK 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
