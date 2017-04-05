import model.masterdata._
//import org.scalatest.fixture

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.language.postfixOps

import slick.jdbc.H2Profile.api._
//import slick.driver.H2Driver.api._
//import slick.driver.PostgresDriver.api._

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object UserMapping extends App {

  val db = Database.forConfig("h2mem1")
  //val db = Database.forConfig("pgtest")
  // the base query for the Users table
  val users = TableQuery[UserTable]

  val uRobin = User.create("Robin Hood", Some(100))

  println("count all users: " + Users.countUsers)

  val norma :User =  Users.getById(3).getOrElse(uRobin)
  println("\nUser = " + norma.name)

  val nobody :User =  Users.getById(11).getOrElse(uRobin)
  println("\nUserNobody = " + nobody.name +"\n")


  val allUsers = Users.getAll()

  for ( u:User <- allUsers) {
    println("User-Id: " + u.id.get + ", Name: " + u.name)
  }

//  println("\nall users: " + allUsers.result.getDumpInfo)

/*
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
*/

/*
  // finding Norma Jean
  val normaId: Long  = 7
  try {
//    Await.result(users findById(normaId), Duration.Inf).get
    Await.result(users.filter(_.id === normaId), Duration.Inf).get
  } finally db.close
*/
}
