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

  val us = User
  //us.id = 7
  //us.filter(_.id === 7).map(println)
  //val norma: User =  us.getById(7)

  println("count all users: " + Users.countUsers)
  //println("count all users: " + Some(Users.countUsers))

  val norma :Future[Option[User]] =  Users.getById(7)
  // Evaluate-Expression im Debugger: Some(norma).get.value.asInstanceOf[Some[User]].x.asInstanceOf[Success].get.asInstanceOf[Some].x.asInstanceOf[User].name

  println("Norma = : " + norma.toString)

  //val allUsers = Await.result(Users.getAll().map(println), Duration.Inf)
  val allUsers = Users.getAll()

  println("all users: " + allUsers.result.getDumpInfo)

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
