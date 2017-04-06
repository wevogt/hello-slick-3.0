name := """hello-slick-3.0"""

/*mainClass in Compile := Some("HelloSlick") */

scalaVersion := "2.12.1"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
  "com.h2database" % "h2" % "1.3.175",
  "org.hsqldb" % "hsqldb" % "2.3.3",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test",
  "com.typesafe.play" % "play_2.11" % "2.5.13",
  "com.typesafe.play" % "play-json_2.11" % "2.5.13",
//  "io.circe" % "circe-core_2.12" % "0.7.0",
//  "io.circe" % "circe-generic_2.12" % "0.7.0",
//  "io.circe" % "circe-parser_2.12" % "0.7.0",
  "com.chuusai" %% "shapeless" % "2.3.2",
  "javax.mail" % "mail" % "1.4.7"

)

scalacOptions ++= Seq("-deprecation", "-feature")
