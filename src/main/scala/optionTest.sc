
case class User (
  id: Int,
  firstName: String,
  lastName: String,
  age: Int,
  gender: Option[String]
)

object UserRepository {
  private val users = Map(
  1 -> User(1, "John", "Doe", 32, Some("male")),
  2 -> User(2, "Johanna", "Doe", 30, None))

  def findById(id: Int): Option[User] = users.get(id)
  def findAll = users.values
}

val user1 = UserRepository.findById(1)
if (user1.isDefined) {
  println(user1.get.firstName)
}

val user = User(2, "Johanna", "Doe", 30, None)
println("Gender: " + user.gender.getOrElse("not specified"))
user.gender match {
  case Some(gender) => println(s"Gender: $gender")
  case None => println("Gender: not specified")
}

val user2 = UserRepository.findById(2)
user2.flatMap(_.gender) match {
  case Some(gender) => println(s"Gender: $gender")
  case None => println("Gender: not specified")
}

val gender1 = UserRepository.findById(1).map(_.gender)
val gender2 = UserRepository.findById(2).flatMap(_.gender)
val gender3 = UserRepository.findById(3).flatMap(_.gender)
