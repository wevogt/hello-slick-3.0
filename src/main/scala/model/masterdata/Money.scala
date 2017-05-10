package model.masterdata

import java.math.MathContext

/**
 * Created by werner on 30.08.15.
 */

// ToDo Klarheit ueber ID, Symbol und sprachabhaengige Texte/Darstellung

// mit spez. Konstruktor der als Default 0,00 € zulaesst
case class Money (val amount :BigDecimal = 0, val curr :Currency = Currency("EUR", 2, "€", "Euro", "euro", new java.sql.Date(System.currentTimeMillis()), None, 'D'))  {

  val locale = new java.util.Locale("de", "DE")
  val formatter = java.text.NumberFormat.getCurrencyInstance

  val cformat = java.text.NumberFormat.getCurrencyInstance
  val format = java.text.NumberFormat.getNumberInstance

  val mathContext :MathContext = java.math.MathContext.DECIMAL64

  def + (m :Money) :Money = {
    //require(m.curr == curr, throw new RuntimeException() )  // nur Money gleichem IsoCode3 addieren !
    assert(m.curr == curr, println("for adding Moneys, currencies have to be equal")) // nur Money gleichem IsoCode3 addieren !
    Money(amount.bigDecimal.add(m.amount.bigDecimal), curr)
//    if (curr == m.curr) {
//      Money(amount.bigDecimal.add(m.amount.bigDecimal), curr)
//    } else {
//     throw new RuntimeException()
//    }
  }

  def - (m :Money) = {
    assert(m.curr == curr, println("for subtracting Moneys, currencies have to be equal")) // nur Money gleichem IsoCode3 addieren !
    Money(amount.bigDecimal.subtract(m.amount.bigDecimal), curr)
  }

  //ToDo so spät wie mögl. runden, d.h. Zwischenergebnisse nicht; wie erkennt man ein Endergebnis ?
  def * (factor :BigDecimal ) = Money(amount.bigDecimal.multiply(factor.bigDecimal).round(mathContext), curr)

/*
  // ToDo weitere Operatoren wie % und autom. Umrechnung bei unterschiedl. Waehrungen
  def convertTo (targetCurrency: Currency) :Money = amount * targetCurrency.getLatestRate(targetCurrency.isocode)
  // Money mit "alten" Currency(FxRates) neu mit aktuellstem Kurs berechnen
  // amount / old.Rate * new.Rate
  def reCalc : Money = amount / ???? * ????
*/

  //override def toString :String => println(f"$amount%.2f $curr.objectidc")

  // Formatierung abh. von curr.decimalDigits, Diff. zw. Dezimal- und Tausendertrennzeichen über Client-Einstellungen
  override def toString :String = curr.decimalDigits match {

    case 0 => f"$amount%.0f ${curr.nameDE}"
    case 1 => f"$amount%.1f ${curr.nameDE}"
    //case 2 => format.format(amount)
    case 2 => f"$amount%.2f ${curr.nameDE}"
    case 3 => f"$amount%.3f ${curr.nameDE}"
    case _ => f"$amount%.4f ${curr.nameDE}"

  }
  //println(f"$name is $age years old, and weighs $weight%.2f pounds.")
}


