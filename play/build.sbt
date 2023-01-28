name := """app"""

version := "1.0-SNAPSHOT"

lazy val common = (project in file("modules/common"))
  .enablePlugins(PlayJava)

lazy val media = (project in file("modules/media"))
  .enablePlugins(PlayJava)
  .dependsOn(common)
  .aggregate(common)

lazy val admin = (project in file("modules/admin"))
  .enablePlugins(PlayJava)
  .dependsOn(common)
  .aggregate(common)

lazy val main = (project in file("."))
  .enablePlugins(PlayJava)
  .dependsOn(common, media, admin)
  .aggregate(common, media, admin)


scalaVersion := "2.12.6"

libraryDependencies += "org.webjars" % "swagger-ui" % "3.32.5"
libraryDependencies += "javax.validation" % "validation-api" % "2.0.1.Final"
libraryDependencies += guice
libraryDependencies += "com.auth0" % "java-jwt" % "3.18.1"
libraryDependencies += "com.auth0" % "jwks-rsa" % "0.19.0"
libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.6"

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.12.2"
libraryDependencies += "javax.annotation" % "javax.annotation-api" % "1.3.2"
