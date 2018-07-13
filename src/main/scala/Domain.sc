val inc1 = (n :Int) => n + 1

val square = (n :Int) => n * n

val think = wait(100)

think

(1 to 100) map inc1

(1 to 100) map square

val incNsquare = inc1 andThen square

val t0 = System.currentTimeMillis()
(1 to 1000) map incNsquare
val t1 =System.currentTimeMillis()

(1 to 1000).par map incNsquare
val t2 = System.currentTimeMillis()

println("seriel Millisec: " + (t1 - t0))
val squareNinc = inc1 compose square
println("parallel Millisec: " + (t2 - t1))
//
squareNinc(4)
//
val p1List = List(1,4,6,8,99, 12)
val p2List = List(1,4,6,8,98)
p1List == p2List
p1List intersect p2List
p1List diff p2List
p2List diff p1List
p1List foreach println _
//
var names = Set("Josef", "Ferdinand")
names = names + "Josef"
names = names + "Werner"
var fullnames = Map ("Vogt" -> "Werner", "Stich" -> "Lorenz")
fullnames = fullnames + ("Vogt" -> "Laura")
fullnames = fullnames + ("Schmachtenberg" -> "Dirk")
fullnames contains("Stich")
fullnames contains  ("Lorenz")
fullnames.values.exists(v => v == "Lorenz")
fullnames filterKeys(_.length == 4)
fullnames.getOrElse("Vog", "Nobody")
fullnames.get("Vog")
fullnames - ("Vogt")
fullnames += ("Schmitt" -> "Helmut")
fullnames
//
val ints = List(1 ,2, 3, 4,5, 6, 7,7, 8, 1 , 11, 12, 8, 14, 12, 10 ,5)
val uniqueInts = Set(1, 2) ++ ints
//uniqueInts = Set() ++ ints
uniqueInts filter( _ > 8)
ints distinct
//
import scala.collection.immutable.SortedSet
val intsSorted = SortedSet[Int]() ++ ints
//
// Case Class, mit einem Vorzug über die Attribute zu iterieren, könnte für einen Vergleich zweier Instanzen gut sein
case class Person(firstname: String, lastname: String, sex: Char, age: Int)
val ich = Person("Werner", "Vogt", 'M', 56)
val du  = Person("Werner", "Vogt", 'M', 55)
ich.age
du.age
ich == du
var count = 0
for (x <- ich.productIterator) {
   println(x, du.productElement(count))
  count = count+1
}

//
// Algebraische Datentypen (ADT); Einsatzmöglichkeit analog Java-ENUM ?
// data Bool = True | False; Typ-Beispiel aus Haskell
abstract class Bool
case object True extends Bool
case object False extends Bool
case object Undef extends Bool
var ttrue: Bool = Undef
ttrue = False

//
import scala.sys.process._
//val xlist = "ls" #| "grep .scala" #&& Seq("sh", "-c", "scalac *.scala") #|| "echo nothing found" lines

val dirContents = "dir".!!
