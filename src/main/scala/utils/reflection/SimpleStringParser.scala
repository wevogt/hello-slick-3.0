package utils.reflection

import io.circe._
import io.circe.generic.auto._
import io.circe.parse._
import io.circe.syntax._

/**
  * Created by werner on 19.01.16.
  *
  * Source: https://meta.plasm.us/posts/2015/11/08/type-classes-and-generic-derivation/
  *
  */
trait RowParser[A] {
  def apply(s: String): A
}

case class Person(name: String, age: Double)
case class Book(title: String, author: String, year: Int)
case class Country(name: String, population: Int, area: Double)

object SimpleStringParser extends App {

  val amy = Creator.create[Person]("Amy,54.2")
  val fred = Creator.create[Person]("Fred,23")
  val hamlet = Creator.create[Book]("Hamlet,Shakespeare,1600")
  val finland = Creator.create[Country]("Finland,4500000,338424")

  val personParser: RowParser[Person] = new RowParser[Person] {
    def apply(s: String): Person = s.split(",").toList match {
      case List(name, age) => Person(name, age.toDouble)
    }
  }
  println(personParser("Amy,54.2"))
  println(amy)

  val bookParser: RowParser[Book] = new RowParser[Book] {
    def apply(s: String): Book = s.split(",").toList match {
      case List(title, author, year) => Book(title, author, year.toInt)
    }
  }
  println(bookParser("Hamlet,Shakespeare,1600"))

}
