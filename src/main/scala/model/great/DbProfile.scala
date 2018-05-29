package model.great

import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import com.typesafe.config.ConfigFactory

trait DbProfile {
  //val profile = slick.jdbc.H2Profile
  //val profile = slick.jdbc.OracleProfile
  //val profile = slick.jdbc.PostgresProfile

  lazy val dbConfig = DatabaseConfig.forConfig[JdbcProfile](ConfigFactory.load().getString("stage.dbEnv"))
  lazy val profile = dbConfig.profile

}
