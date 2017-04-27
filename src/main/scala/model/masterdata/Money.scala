package model.masterdata

import java.math.MathContext

/**
 * Created by werner on 30.08.15.
 */

// ToDo Klarheit ueber ID, Symbol und sprachabhaengige Texte/Darstellung

// mit spez. Konstruktor der als Default 0,00 € zulaesst
case class Money (var amount :BigDecimal = 0,  curr :Currency = new Currency("EUR", 2, "€", "EUR", "EUR", new java.sql.Date(System.currentTimeMillis()), None, 'D'))  {

  val locale = new java.util.Locale("de", "DE")
  val formatter = java.text.NumberFormat.getCurrencyInstance

  val cformat = java.text.NumberFormat.getCurrencyInstance
  val format = java.text.NumberFormat.getNumberInstance

  def + (m :Money) = Money(amount.bigDecimal.add(m.amount.bigDecimal), curr)
  def - (m :Money) = Money(amount.bigDecimal.subtract(m.amount.bigDecimal), curr)

  //ToDo wann soll gerundet werden, z.B. Zwischeergenisse nicht, wie erkennt man ein Endergebnis ?
//  def * (factor :BigDecimal ) = Money(amount.bigDecimal.multiply(factor.bigDecimal), curr)
  def * (factor :BigDecimal ) = Money(amount.bigDecimal.multiply(factor.bigDecimal).round(MathContext), curr)

/*
  // ToDo weitere Operatoren wie % und autom. Umrechnung bei unterschiedl. Waehrungen
  def convertTo (targetCurrency: Currency) :Money = amount * targetCurrency.getLatestRate(targetCurrency.isocode)
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


