/* wg. z_trail.Futures.Prog_3
fork in run := true
javaOptions += "-Dscala.concurrent.context.maxThreads=4"
*/
name := """hello-slick-3.0"""

/*mainClass in Compile := Some("HelloSlick") */

scalaVersion := "2.12.6"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.2.1",
  "com.typesafe.slick" %% "slick-codegen" % "3.2.1",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.1",
  "com.typesafe.play" %% "play" % "2.6.11",

//  "org.scalatest" %% "scalatest" % "3.2.0-SNAP4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.scalactic" %% "scalactic" % "3.0.4" % "test",

  "com.h2database" % "h2" % "1.4.194",
  "org.hsqldb" % "hsqldb" % "2.3.3",
  "org.postgresql" % "postgresql" % "9.4.1212",
  // Oracle ojdbc-Treiber, Eintrag aus lokalem Maven Repository nach ~/.sbt/preloaded/oracle/com/ojdbc8/12.2.0.1/ojdbc8-12.2.0.1.pom
  "oracle.com" % "ojdbc8" % "12.2.0.1",

//  "com.typesafe.play" %% "play" % "2.5.13",
//  "com.typesafe.play" %% "play-json" % "2.5.13",

  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.chuusai" %% "shapeless" % "2.3.2",
  "javax.mail" % "mail" % "1.4.7"
)

scalacOptions ++= Seq("-deprecation", "-feature")

// Einstellungen um gleiches Verhalten von Tests in IDE und sbt zu erhalten
// https://www.scala-sbt.org/1.x/docs/Forking.html
javaOptions += "-D=file.encoding=CP1252"
//val root = Project("root", file("."))
//Compile / run / fork := true
// fork in run := true
fork := true