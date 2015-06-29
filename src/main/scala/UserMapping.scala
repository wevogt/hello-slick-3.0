import model.masterdata._
//import org.scalatest.fixture
import slick.profile.SqlProfile.ColumnOption.{Nullable, NotNull}

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.language.postfixOps

//import slick.driver.H2Driver.api._
import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object UserMapping extends App {

  //  val db = Database.forConfig("h2mem1")
  val db = Database.forConfig("pgtest")
  // the base query for the Users table
  val users = TableQuery[UserTable]

  val us = User.create("Robin", Some(100))
  //us.id = 7
  //us.filter(_.id === 7).map(println)
  //val norma: User =  us.getById(7)

  println("all users: " + Some(Users.countUsers))

  val norma :Future[User] =  Users.getById(1)
  //val norma :Future[Option[User]] =  Users.findById(7)

  println("Norma = : " + norma.toString)

  val allUsers = Users.getAll().map(println)

  try {
    Await.result(db.run(DBIO.seq(
      // create the schema
      /*
            users.schema.create,

            // insert two User instances
            users += User("John Doe"),
            users += User("Fred Smith"),
            users += User("Norma Jean"),
            users += User("James Dean"),
      */

      // print the users (select * from USERS)
      users.result.map(println)

    )), Duration.Inf)
  } finally db.close

/*
  // finding Norma Jean
  val normaId: Long  = 7
  try {
//    Await.result(users findById(normaId), Duration.Inf).get
    Await.result(users.filter(_.id === normaId), Duration.Inf).get
  } finally db.close
*/
}
