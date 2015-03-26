import java.sql.Date
import java.util.{Calendar, Date}
import scala.collection.SeqLike._


val today: java.sql.Date  = new java.sql.Date(System.currentTimeMillis())
val yesterday: java.sql.Date = new java.sql.Date(today.getTime - (60*60*24*1000))

val current = Calendar.getInstance().getTime()
println(current.toString.formatted("dd.mm.yyyy"))

val types = List('D','M')
types.contains('D')
types.foreach( _ =='M')

