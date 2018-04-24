name := """scala-web-project"""
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
/**
  * need to make the fingerprint works
  * to see fingerprint work u need to start sbt in production mode "runProd"
  */
pipelineStages := Seq(digest)

libraryDependencies ++= Seq(
  jdbc,
  ehcache,
  ws,
  guice
)

// no need to cause we'll not use scalaz in this project
// resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
