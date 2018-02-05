package model.masterdata

import play.api.Play
import play.api.PlayException

import slick.SlickException

import slick.jdbc.SQLServerProfile
import slick.jdbc.H2Profile
import slick.jdbc.OracleProfile

trait MultiDatabase {
  lazy val profile = {
    Play.current.configuration.getString("development.stage") match {
      case Some("dev") | Some("test") => H2Profile
      case Some("qa") | Some("prod") =>  OracleProfile
      case Some("qa2") | Some("prod") =>  SQLServerProfile
      case _ => throw new SlickException("message")
    }
  }
}