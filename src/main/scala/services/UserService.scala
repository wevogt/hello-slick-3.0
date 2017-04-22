package services

import model.masterdata._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import scala.language.postfixOps

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object UserService {


  def getUserById(userId: Int): Option[User] = UserDAO.getById(userId)

  def getUserByName(userName: String) :Option[User] = UserDAO.findUserByName(userName)

  def getAllUsers: Future[List[User]] = UserDAO.getAll()

  def getAllUsersSynchron: List[User] = UserDAO.getAllSynchron()
    //UserDAO.getAll().map { x => Option(x) }


  def addUser(user: User) = UserDAO.insert(user)

  def updateUser(user: User) = UserDAO.update(user)

  def deleteUserByName(userName: String): Future[Int] = UserDAO.deleteUserByName(userName)

  /*
    val allUsers = UserDAO.getAll()
    for ( u:User <- allUsers) {
      println("User-Id: " + u.id.get + ", Name: " + u.name)
    }
  */

//  println("\nall users: " + allUsers.result.getDumpInfo)

}
