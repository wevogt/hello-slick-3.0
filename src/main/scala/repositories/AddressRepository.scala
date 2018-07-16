package repositories

import repositories.dbCommon.Db
import repositories.model.{AddressesTable, Address}
import slick.basic.DatabaseConfig
import slick.dbio.DBIOAction
import slick.jdbc.JdbcProfile

class AddressesRepository(val config: DatabaseConfig[JdbcProfile]) extends Db with AddressesTable {
  import config.profile.api._
  import scala.concurrent.ExecutionContext.Implicits.global


  def init() = db.run(DBIOAction.seq(addresses.schema.create))
  def drop() = db.run(DBIOAction.seq(addresses.schema.drop))

  def insert(address: Address) = db
    .run(addresses returning addresses.map(_.id) += address)
    .map(id => address.copy(id = Some(id)))

}
