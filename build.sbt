name := """hello-slick-3.0"""

/*mainClass in Compile := Some("HelloSlick") */

scalaVersion := "2.11.7"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.175",
  "org.hsqldb" % "hsqldb" % "2.3.3",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.typesafe.play" %% "play" % "2.4.0",
  "javax.mail" % "mail" % "1.4.7",
  "io.circe" %% "circe-core" % "0.2.1",
  "io.circe" %% "circe-generic" % "0.2.1",
  "io.circe" %% "circe-parse" % "0.2.1"

)

scalacOptions ++= Seq("-deprecation", "-feature")
