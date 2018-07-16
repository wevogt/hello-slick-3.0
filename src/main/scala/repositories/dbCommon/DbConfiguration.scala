package repositories.dbCommon

import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

trait DbConfiguration {
  lazy val config = DatabaseConfig.forConfig[JdbcProfile]("db")
}

trait Db {
  val config: DatabaseConfig[JdbcProfile]
  val db: JdbcProfile#Backend#Database = config.db
}
