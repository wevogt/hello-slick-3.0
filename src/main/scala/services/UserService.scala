package services

import model.masterdata._
import scala.language.postfixOps

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object UserService {

  def getUserById(userId: Int): Option[User] = UserDAO.getById(userId)

  def getUserByName(userName: String) :Option[User] = UserDAO.findUserByName(userName)

  def getAllUsers: List[User] = UserDAO.getAll()

/*
  val allUsers = UserDAO.getAll()
  for ( u:User <- allUsers) {
    println("User-Id: " + u.id.get + ", Name: " + u.name)
  }
*/

//  println("\nall users: " + allUsers.result.getDumpInfo)

}
