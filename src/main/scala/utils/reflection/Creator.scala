package utils.reflection

import scala.util.Try
import shapeless._
import java.text.SimpleDateFormat
import java.sql.Date

trait Creator[A] { def apply(s: String): Option[A] }

object Creator {
  def create[A](s: String)(implicit c: Creator[A]): Option[A] = c(s)

  def instance[A](parse: String => Option[A]): Creator[A] = new Creator[A] {
    def apply(s: String): Option[A] = parse(s)
  }

  implicit val charCreator: Creator[Char] = instance(s => Try(s.toList(0)).toOption)
  implicit val stringCreate: Creator[String] = instance(Some(_))
  implicit val intCreate: Creator[Int] = instance(s => Try(s.toInt).toOption)
  implicit val doubleCreate: Creator[Double] =
    instance(s => Try(s.toDouble).toOption)

  var simpleDateFormat: SimpleDateFormat = new SimpleDateFormat("dd.mm.yyyy")
  implicit val dateCreate: Creator[Date] = instance(s => Try(new java.sql.Date(simpleDateFormat.parse(s).getTime())).toOption)

  implicit val hnilCreator: Creator[HNil] =
    instance(s => if (s.isEmpty) Some(HNil) else None)

  private[this] val NextCell = "^([^,]+)(?:,(.+))?$".r

  implicit def hconsCreate[H: Creator, T <: HList: Creator]: Creator[H :: T] =
    instance {
      case NextCell(cell, rest) => for {
        h <- create[H](cell)
        t <- create[T](Option(rest).getOrElse(""))
      } yield h :: t
      case _ => None
    }

  implicit def caseClassCreate[C, R <: HList](implicit
                                              gen: Generic.Aux[C, R],
                                              rc: Creator[R]
                                             ): Creator[C] = instance(s => rc(s).map(gen.from))
}