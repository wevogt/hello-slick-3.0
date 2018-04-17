package model.masterdata

import com.typesafe.config.ConfigFactory
import slick.SlickException

trait MultiDatabase {
  lazy val env :Option[String] = Option(ConfigFactory.load().getString("stage.projectPhase"))

  lazy val profile =
    env match {
      case Some("development") | Some("test") => slick.jdbc.H2Profile
      case Some("qa") | Some("prod") =>  slick.jdbc.OracleProfile
      case Some("qa2") | Some("prod") =>  slick.jdbc.SQLServerProfile
      case _ => throw new SlickException("message")
    }

}