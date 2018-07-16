package repositories.model

import repositories.dbCommon.Db

case class User(id: Option[Int], email: String, firstName: Option[String], lastName: Option[String])
case class UserUpdate(firstName: Option[String], lastName: Option[String])

trait UsersTable { this: Db => import config.profile.api._

  private[repositories] class Users(tag: Tag) extends Table[User] (tag, "USERS") {
    //Columns
    def id        = column[Int] ("USER_ID", O.PrimaryKey, O.AutoInc)
    def email     = column[String]("USER_EMAIL", O.Length(512))
    def firstName = column[Option[String]]("USER_FIRST_NAME", O.Length(64))
    def lastName  = column[Option[String]]("USER_LAST_NAME", O.Length(64))

    // Indexes
    def emailIndex = index("USER_EMAIL_IDX", email, true)

    // Select
    def * = (id.?, email, firstName, lastName) <> (User.tupled, User.unapply)
  }

  lazy val users: TableQuery[Users] = TableQuery[Users]
}


