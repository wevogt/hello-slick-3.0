
var Zahl = 123
println(Zahl)
println("Zahl")
println(65 + 17)
println("65 + 17")
var satz = "Scala macht Spass."
satz
println(satz)
def greet(name: String) = {
  print("Hallo ")
  println(name)
}

greet("Jack")

67 toChar

'C' toInt

'C' + 1

'S' + 'c' + 'a' + 'l'+ 'a'

('C' + 3) toChar

var zeichen = 'b'

zeichen toInt

(zeichen + 100) toChar

for (x <- "EHUJ") {
  print( ((x toInt) -3) toChar)
}
println("")

'a' toUpper

'B' toLower

((('C' +100) toInt) toChar) toInt

('C' + 32) toChar

def ord(zeich: Char) = { (zeich toUpper) - 'A'}
ord('z')
ord('W')

def chr(i :Int) = { (i + 'A' ) toChar }

chr(0)

('B' toInt) % 65

(('B' toInt) + 32) toChar

