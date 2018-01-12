package model.great

trait DbProfile {
  val profile = slick.jdbc.H2Profile
  //val profile = slick.jdbc.OracleProfile
  //val profile = slick.jdbc.PostgresProfile
}
