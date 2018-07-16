package repositories.model

import repositories.dbCommon.Db


case class Address(id: Option[Int], userId: Int,
                   addressLine: String, city: String, postalCode: String)

trait AddressesTable  { this: Db =>   import config.profile.api._

  private[repositories] class Addresses(tag: Tag) extends Table[Address](tag, "ADDRESSES") {
    // Columns
    def id             = column[Int]("ADDRESS_ID", O.PrimaryKey, O.AutoInc)
    def addressLine = column[String]("ADDRESS_LINE")
    def city        = column[String]("CITY")
    def postalCode  = column[String]("POSTAL_CODE")

    // ForeignKey
    def userId        = column[Int]("USER_ID")
    /*
        def userFk = foreignKey("USER_FK", userId, users)
    //    (_.id, ForeignKeyAction.Restrict, ForeignKeyAction.Cascade)
        (_.id, ForeignKeyAction.Restrict, ForeignKeyAction.Cascade)
    */

    // Select
    def * = (id.?, userId, addressLine, city, postalCode) <>
      (Address.tupled, Address.unapply)
  }

  lazy val addresses: TableQuery[Addresses] = TableQuery[Addresses]
}
