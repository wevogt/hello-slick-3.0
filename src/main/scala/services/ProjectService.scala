package services

import model.projectdomain._

import scala.language.postfixOps

/**
 * Created by mhsvw001 on 09.06.2015.
 */
object ProjectService {
  
  def getProjectById(projectId: Int): Option[Project] = ProjectDAO.getById(projectId)

  def getProjectByName(projectName: String) :Option[Project] = ProjectDAO.findProjectByName(projectName)

  def getAllProjects: List[Project] = ProjectDAO.getAll()

/*
  val allUsers = UserDAO.getAll()
  for ( u:User <- allUsers) {
    println("User-Id: " + u.id.get + ", Name: " + u.name)
  }
*/

//  println("\nall users: " + allUsers.result.getDumpInfo)

}
