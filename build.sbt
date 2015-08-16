name := """hello-slick-3.0"""

/*mainClass in Compile := Some("HelloSlick") */

scalaVersion := "2.11.6"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.0.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.175",
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc41",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.typesafe.play" %% "play" % "2.4.0",
  "javax.mail" % "mail" % "1.4.7"
)

scalacOptions ++= Seq("-deprecation", "-feature")
