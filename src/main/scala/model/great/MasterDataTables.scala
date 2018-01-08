package model.great

object MasterDataTables extends {
  val profile = slick.jdbc.OracleProfile
} with MasterDataTables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait MasterDataTables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  import model.great.AdminTables._
  import model.great.CommonTables._
  import model.great.BackOfficeTables._
  import model.great.GuaranteeAllTables._

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(GreatAccountingArea.schema, GreatAccountingAreaHistory.schema, GreatBusinessPartner.schema, GreatBusinessPartnerHistory.schema, GreatCountry.schema, GreatCountryHistory.schema, GreatCurrency.schema, GreatCurrencyHistory.schema, GreatFxRates.schema, GreatGlineAccount.schema, GreatGlineAccountHistory.schema, GreatGlineContract.schema, GreatGlineContractHistory.schema, GreatGlineReservation.schema, GreatGlineReservationHist.schema, GreatGlineReservations.schema, GreatGlineReservationsHist.schema, GreatLanguage.schema, GreatLatestFxRates.schema, GreatOrg.schema, GreatOrgHistory.schema, GreatRatings.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table GreatAccountingArea
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(160,true)
    *  @param `type` Database column TYPE SqlType(VARCHAR2)
    *  @param iso3166Alpha3Code Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true)
    *  @param reserveRate Database column RESERVE_RATE SqlType(NUMBER)
    *  @param defaultRateOverwritten Database column DEFAULT_RATE_OVERWRITTEN SqlType(VARCHAR2)
    *  @param usgReserveRate Database column USG_RESERVE_RATE SqlType(NUMBER)
    *  @param extern Database column EXTERN SqlType(CHAR)
    *  @param active Database column ACTIVE SqlType(CHAR)
    *  @param hgbRating Database column HGB_RATING SqlType(CHAR), Length(3,false)
    *  @param usgRating Database column USG_RATING SqlType(CHAR), Length(3,false) */
  case class GreatAccountingAreaRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], name: Option[String], `type`: Option[Char], iso3166Alpha3Code: Option[String], reserveRate: Option[scala.math.BigDecimal], defaultRateOverwritten: Option[Char], usgReserveRate: Option[scala.math.BigDecimal], extern: Option[Char], active: Option[Char], hgbRating: Option[String], usgRating: Option[String])
  /** GetResult implicit for fetching GreatAccountingAreaRow objects using plain SQL queries */
  implicit def GetResultGreatAccountingAreaRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatAccountingAreaRow] = GR{
    prs => import prs._
      GreatAccountingAreaRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[Char], <<?[String], <<?[scala.math.BigDecimal], <<?[Char], <<?[scala.math.BigDecimal], <<?[Char], <<?[Char], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_ACCOUNTING_AREA. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatAccountingArea(_tableTag: Tag) extends profile.api.Table[GreatAccountingAreaRow](_tableTag, Some("WERNER2"), "GREAT_ACCOUNTING_AREA") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, name, `type`, iso3166Alpha3Code, reserveRate, defaultRateOverwritten, usgReserveRate, extern, active, hgbRating, usgRating) <> (GreatAccountingAreaRow.tupled, GreatAccountingAreaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, name, `type`, iso3166Alpha3Code, reserveRate, defaultRateOverwritten, usgReserveRate, extern, active, hgbRating, usgRating).shaped.<>({r=>import r._; _1.map(_=> GreatAccountingAreaRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column NAME SqlType(VARCHAR2), Length(160,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(160,varying=true))
    /** Database column TYPE SqlType(VARCHAR2)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Char]] = column[Option[Char]]("TYPE")
    /** Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true) */
    val iso3166Alpha3Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA3_CODE", O.Length(3,varying=true))
    /** Database column RESERVE_RATE SqlType(NUMBER) */
    val reserveRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RESERVE_RATE")
    /** Database column DEFAULT_RATE_OVERWRITTEN SqlType(VARCHAR2) */
    val defaultRateOverwritten: Rep[Option[Char]] = column[Option[Char]]("DEFAULT_RATE_OVERWRITTEN")
    /** Database column USG_RESERVE_RATE SqlType(NUMBER) */
    val usgReserveRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_RESERVE_RATE")
    /** Database column EXTERN SqlType(CHAR) */
    val extern: Rep[Option[Char]] = column[Option[Char]]("EXTERN")
    /** Database column ACTIVE SqlType(CHAR) */
    val active: Rep[Option[Char]] = column[Option[Char]]("ACTIVE")
    /** Database column HGB_RATING SqlType(CHAR), Length(3,false) */
    val hgbRating: Rep[Option[String]] = column[Option[String]]("HGB_RATING", O.Length(3,varying=false))
    /** Database column USG_RATING SqlType(CHAR), Length(3,false) */
    val usgRating: Rep[Option[String]] = column[Option[String]]("USG_RATING", O.Length(3,varying=false))

    /** Foreign key referencing GreatCountry (database name AA_FK_ISO_3166_ALPHA3_CODE) */
    lazy val greatCountryFk = foreignKey("AA_FK_ISO_3166_ALPHA3_CODE", iso3166Alpha3Code, GreatCountry)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatAccountingArea */
  lazy val GreatAccountingArea = new TableQuery(tag => new GreatAccountingArea(tag))

  /** Entity class storing rows of table GreatAccountingAreaHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(160,true)
    *  @param `type` Database column TYPE SqlType(VARCHAR2)
    *  @param iso3166Alpha3Code Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true)
    *  @param reserveRate Database column RESERVE_RATE SqlType(NUMBER)
    *  @param defaultRateOverwritten Database column DEFAULT_RATE_OVERWRITTEN SqlType(VARCHAR2)
    *  @param usgReserveRate Database column USG_RESERVE_RATE SqlType(NUMBER)
    *  @param extern Database column EXTERN SqlType(CHAR)
    *  @param active Database column ACTIVE SqlType(CHAR)
    *  @param hgbRating Database column HGB_RATING SqlType(CHAR), Length(3,false)
    *  @param usgRating Database column USG_RATING SqlType(CHAR), Length(3,false) */
  case class GreatAccountingAreaHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], name: Option[String], `type`: Option[Char], iso3166Alpha3Code: Option[String], reserveRate: Option[scala.math.BigDecimal], defaultRateOverwritten: Option[Char], usgReserveRate: Option[scala.math.BigDecimal], extern: Option[Char], active: Option[Char], hgbRating: Option[String], usgRating: Option[String])
  /** GetResult implicit for fetching GreatAccountingAreaHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatAccountingAreaHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]], e6: GR[Option[scala.math.BigDecimal]]): GR[GreatAccountingAreaHistoryRow] = GR{
    prs => import prs._
      GreatAccountingAreaHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<?[String], <<?[Char], <<?[String], <<?[scala.math.BigDecimal], <<?[Char], <<?[scala.math.BigDecimal], <<?[Char], <<?[Char], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_ACCOUNTING_AREA_HISTORY. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatAccountingAreaHistory(_tableTag: Tag) extends profile.api.Table[GreatAccountingAreaHistoryRow](_tableTag, Some("WERNER2"), "GREAT_ACCOUNTING_AREA_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, name, `type`, iso3166Alpha3Code, reserveRate, defaultRateOverwritten, usgReserveRate, extern, active, hgbRating, usgRating) <> (GreatAccountingAreaHistoryRow.tupled, GreatAccountingAreaHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, name, `type`, iso3166Alpha3Code, reserveRate, defaultRateOverwritten, usgReserveRate, extern, active, hgbRating, usgRating).shaped.<>({r=>import r._; _1.map(_=> GreatAccountingAreaHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column NAME SqlType(VARCHAR2), Length(160,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(160,varying=true))
    /** Database column TYPE SqlType(VARCHAR2)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Char]] = column[Option[Char]]("TYPE")
    /** Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true) */
    val iso3166Alpha3Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA3_CODE", O.Length(3,varying=true))
    /** Database column RESERVE_RATE SqlType(NUMBER) */
    val reserveRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RESERVE_RATE")
    /** Database column DEFAULT_RATE_OVERWRITTEN SqlType(VARCHAR2) */
    val defaultRateOverwritten: Rep[Option[Char]] = column[Option[Char]]("DEFAULT_RATE_OVERWRITTEN")
    /** Database column USG_RESERVE_RATE SqlType(NUMBER) */
    val usgReserveRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_RESERVE_RATE")
    /** Database column EXTERN SqlType(CHAR) */
    val extern: Rep[Option[Char]] = column[Option[Char]]("EXTERN")
    /** Database column ACTIVE SqlType(CHAR) */
    val active: Rep[Option[Char]] = column[Option[Char]]("ACTIVE")
    /** Database column HGB_RATING SqlType(CHAR), Length(3,false) */
    val hgbRating: Rep[Option[String]] = column[Option[String]]("HGB_RATING", O.Length(3,varying=false))
    /** Database column USG_RATING SqlType(CHAR), Length(3,false) */
    val usgRating: Rep[Option[String]] = column[Option[String]]("USG_RATING", O.Length(3,varying=false))

    /** Primary key of GreatAccountingAreaHistory (database name AAHIS_PK_OBJECTIDC) */
    val pk = primaryKey("AAHIS_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatAccountingAreaHistory */
  lazy val GreatAccountingAreaHistory = new TableQuery(tag => new GreatAccountingAreaHistory(tag))

  /** Entity class storing rows of table GreatCountry
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param iso3166Alpha2Code Database column ISO_3166_ALPHA2_CODE SqlType(VARCHAR2), Length(2,true)
    *  @param hgbForeignUnited Database column HGB_FOREIGN_UNITED SqlType(NUMBER)
    *  @param hgbForeignOther Database column HGB_FOREIGN_OTHER SqlType(NUMBER)
    *  @param usgForeignUnited Database column USG_FOREIGN_UNITED SqlType(NUMBER)
    *  @param usgForeignOther Database column USG_FOREIGN_OTHER SqlType(NUMBER)
    *  @param hgbForeignUnitedRating Database column HGB_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false)
    *  @param hgbForeignOtherRating Database column HGB_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false)
    *  @param usgForeignUnitedRating Database column USG_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false)
    *  @param usgForeignOtherRating Database column USG_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false) */
  case class GreatCountryRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], iso3166Alpha2Code: Option[String], hgbForeignUnited: Option[scala.math.BigDecimal], hgbForeignOther: Option[scala.math.BigDecimal], usgForeignUnited: Option[scala.math.BigDecimal], usgForeignOther: Option[scala.math.BigDecimal], hgbForeignUnitedRating: Option[String], hgbForeignOtherRating: Option[String], usgForeignUnitedRating: Option[String], usgForeignOtherRating: Option[String])
  /** GetResult implicit for fetching GreatCountryRow objects using plain SQL queries */
  implicit def GetResultGreatCountryRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[GreatCountryRow] = GR{
    prs => import prs._
      GreatCountryRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_COUNTRY. Objects of this class serve as prototypes for rows in queries. */
  class GreatCountry(_tableTag: Tag) extends profile.api.Table[GreatCountryRow](_tableTag, Some("WERNER2"), "GREAT_COUNTRY") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, iso3166Alpha2Code, hgbForeignUnited, hgbForeignOther, usgForeignUnited, usgForeignOther, hgbForeignUnitedRating, hgbForeignOtherRating, usgForeignUnitedRating, usgForeignOtherRating) <> (GreatCountryRow.tupled, GreatCountryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, iso3166Alpha2Code, hgbForeignUnited, hgbForeignOther, usgForeignUnited, usgForeignOther, hgbForeignUnitedRating, hgbForeignOtherRating, usgForeignUnitedRating, usgForeignOtherRating).shaped.<>({r=>import r._; _1.map(_=> GreatCountryRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column ISO_3166_ALPHA2_CODE SqlType(VARCHAR2), Length(2,true) */
    val iso3166Alpha2Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA2_CODE", O.Length(2,varying=true))
    /** Database column HGB_FOREIGN_UNITED SqlType(NUMBER) */
    val hgbForeignUnited: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HGB_FOREIGN_UNITED")
    /** Database column HGB_FOREIGN_OTHER SqlType(NUMBER) */
    val hgbForeignOther: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HGB_FOREIGN_OTHER")
    /** Database column USG_FOREIGN_UNITED SqlType(NUMBER) */
    val usgForeignUnited: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_FOREIGN_UNITED")
    /** Database column USG_FOREIGN_OTHER SqlType(NUMBER) */
    val usgForeignOther: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_FOREIGN_OTHER")
    /** Database column HGB_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false) */
    val hgbForeignUnitedRating: Rep[Option[String]] = column[Option[String]]("HGB_FOREIGN_UNITED_RATING", O.Length(3,varying=false))
    /** Database column HGB_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false) */
    val hgbForeignOtherRating: Rep[Option[String]] = column[Option[String]]("HGB_FOREIGN_OTHER_RATING", O.Length(3,varying=false))
    /** Database column USG_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false) */
    val usgForeignUnitedRating: Rep[Option[String]] = column[Option[String]]("USG_FOREIGN_UNITED_RATING", O.Length(3,varying=false))
    /** Database column USG_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false) */
    val usgForeignOtherRating: Rep[Option[String]] = column[Option[String]]("USG_FOREIGN_OTHER_RATING", O.Length(3,varying=false))
  }
  /** Collection-like TableQuery object for table GreatCountry */
  lazy val GreatCountry = new TableQuery(tag => new GreatCountry(tag))

  /** Entity class storing rows of table GreatCountryHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param iso3166Alpha2Code Database column ISO_3166_ALPHA2_CODE SqlType(VARCHAR2), Length(2,true)
    *  @param hgbForeignUnited Database column HGB_FOREIGN_UNITED SqlType(NUMBER)
    *  @param hgbForeignOther Database column HGB_FOREIGN_OTHER SqlType(NUMBER)
    *  @param usgForeignUnited Database column USG_FOREIGN_UNITED SqlType(NUMBER)
    *  @param usgForeignOther Database column USG_FOREIGN_OTHER SqlType(NUMBER)
    *  @param hgbForeignUnitedRating Database column HGB_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false)
    *  @param hgbForeignOtherRating Database column HGB_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false)
    *  @param usgForeignUnitedRating Database column USG_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false)
    *  @param usgForeignOtherRating Database column USG_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false) */
  case class GreatCountryHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], iso3166Alpha2Code: Option[String], hgbForeignUnited: Option[scala.math.BigDecimal], hgbForeignOther: Option[scala.math.BigDecimal], usgForeignUnited: Option[scala.math.BigDecimal], usgForeignOther: Option[scala.math.BigDecimal], hgbForeignUnitedRating: Option[String], hgbForeignOtherRating: Option[String], usgForeignUnitedRating: Option[String], usgForeignOtherRating: Option[String])
  /** GetResult implicit for fetching GreatCountryHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatCountryHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[scala.math.BigDecimal]]): GR[GreatCountryHistoryRow] = GR{
    prs => import prs._
      GreatCountryHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_COUNTRY_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatCountryHistory(_tableTag: Tag) extends profile.api.Table[GreatCountryHistoryRow](_tableTag, Some("WERNER2"), "GREAT_COUNTRY_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, iso3166Alpha2Code, hgbForeignUnited, hgbForeignOther, usgForeignUnited, usgForeignOther, hgbForeignUnitedRating, hgbForeignOtherRating, usgForeignUnitedRating, usgForeignOtherRating) <> (GreatCountryHistoryRow.tupled, GreatCountryHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, iso3166Alpha2Code, hgbForeignUnited, hgbForeignOther, usgForeignUnited, usgForeignOther, hgbForeignUnitedRating, hgbForeignOtherRating, usgForeignUnitedRating, usgForeignOtherRating).shaped.<>({r=>import r._; _1.map(_=> GreatCountryHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column ISO_3166_ALPHA2_CODE SqlType(VARCHAR2), Length(2,true) */
    val iso3166Alpha2Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA2_CODE", O.Length(2,varying=true))
    /** Database column HGB_FOREIGN_UNITED SqlType(NUMBER) */
    val hgbForeignUnited: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HGB_FOREIGN_UNITED")
    /** Database column HGB_FOREIGN_OTHER SqlType(NUMBER) */
    val hgbForeignOther: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HGB_FOREIGN_OTHER")
    /** Database column USG_FOREIGN_UNITED SqlType(NUMBER) */
    val usgForeignUnited: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_FOREIGN_UNITED")
    /** Database column USG_FOREIGN_OTHER SqlType(NUMBER) */
    val usgForeignOther: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_FOREIGN_OTHER")
    /** Database column HGB_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false) */
    val hgbForeignUnitedRating: Rep[Option[String]] = column[Option[String]]("HGB_FOREIGN_UNITED_RATING", O.Length(3,varying=false))
    /** Database column HGB_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false) */
    val hgbForeignOtherRating: Rep[Option[String]] = column[Option[String]]("HGB_FOREIGN_OTHER_RATING", O.Length(3,varying=false))
    /** Database column USG_FOREIGN_UNITED_RATING SqlType(CHAR), Length(3,false) */
    val usgForeignUnitedRating: Rep[Option[String]] = column[Option[String]]("USG_FOREIGN_UNITED_RATING", O.Length(3,varying=false))
    /** Database column USG_FOREIGN_OTHER_RATING SqlType(CHAR), Length(3,false) */
    val usgForeignOtherRating: Rep[Option[String]] = column[Option[String]]("USG_FOREIGN_OTHER_RATING", O.Length(3,varying=false))

    /** Primary key of GreatCountryHistory (database name CH_PK_OBJECTIDC) */
    val pk = primaryKey("CH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatCountryHistory */
  lazy val GreatCountryHistory = new TableQuery(tag => new GreatCountryHistory(tag))

  /** Entity class storing rows of table GreatCurrency
    *  @param objectidc Database column OBJECTIDC SqlType(CHAR), PrimaryKey, Length(3,false)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param numDecimalDigits Database column NUM_DECIMAL_DIGITS SqlType(NUMBER)
    *  @param textDe Database column TEXT_DE SqlType(VARCHAR2), Length(500,true)
    *  @param textEn Database column TEXT_EN SqlType(VARCHAR2), Length(500,true)
    *  @param textEs Database column TEXT_ES SqlType(VARCHAR2), Length(500,true)
    *  @param startDate Database column START_DATE SqlType(DATE)
    *  @param endDate Database column END_DATE SqlType(DATE)
    *  @param fxtype Database column FXTYPE SqlType(CHAR) */
  case class GreatCurrencyRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], numDecimalDigits: scala.math.BigDecimal, textDe: Option[String], textEn: Option[String], textEs: Option[String], startDate: Option[java.sql.Timestamp], endDate: Option[java.sql.Timestamp], fxtype: Option[Char])
  /** GetResult implicit for fetching GreatCurrencyRow objects using plain SQL queries */
  implicit def GetResultGreatCurrencyRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[scala.math.BigDecimal], e5: GR[Option[Char]]): GR[GreatCurrencyRow] = GR{
    prs => import prs._
      GreatCurrencyRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char]))
  }
  /** Table description of table GREAT_CURRENCY. Objects of this class serve as prototypes for rows in queries. */
  class GreatCurrency(_tableTag: Tag) extends profile.api.Table[GreatCurrencyRow](_tableTag, Some("WERNER2"), "GREAT_CURRENCY") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, numDecimalDigits, textDe, textEn, textEs, startDate, endDate, fxtype) <> (GreatCurrencyRow.tupled, GreatCurrencyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, Rep.Some(numDecimalDigits), textDe, textEn, textEs, startDate, endDate, fxtype).shaped.<>({r=>import r._; _1.map(_=> GreatCurrencyRow.tupled((_1.get, _2, _3, _4, _5.get, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(CHAR), PrimaryKey, Length(3,false) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(3,varying=false))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column NUM_DECIMAL_DIGITS SqlType(NUMBER) */
    val numDecimalDigits: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("NUM_DECIMAL_DIGITS")
    /** Database column TEXT_DE SqlType(VARCHAR2), Length(500,true) */
    val textDe: Rep[Option[String]] = column[Option[String]]("TEXT_DE", O.Length(500,varying=true))
    /** Database column TEXT_EN SqlType(VARCHAR2), Length(500,true) */
    val textEn: Rep[Option[String]] = column[Option[String]]("TEXT_EN", O.Length(500,varying=true))
    /** Database column TEXT_ES SqlType(VARCHAR2), Length(500,true) */
    val textEs: Rep[Option[String]] = column[Option[String]]("TEXT_ES", O.Length(500,varying=true))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("START_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("END_DATE")
    /** Database column FXTYPE SqlType(CHAR) */
    val fxtype: Rep[Option[Char]] = column[Option[Char]]("FXTYPE")
  }
  /** Collection-like TableQuery object for table GreatCurrency */
  lazy val GreatCurrency = new TableQuery(tag => new GreatCurrency(tag))

  /** Entity class storing rows of table GreatCurrencyHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param numDecimalDigits Database column NUM_DECIMAL_DIGITS SqlType(NUMBER)
    *  @param textDe Database column TEXT_DE SqlType(VARCHAR2), Length(500,true)
    *  @param textEn Database column TEXT_EN SqlType(VARCHAR2), Length(500,true)
    *  @param textEs Database column TEXT_ES SqlType(VARCHAR2), Length(500,true)
    *  @param startDate Database column START_DATE SqlType(DATE)
    *  @param endDate Database column END_DATE SqlType(DATE)
    *  @param fxtype Database column FXTYPE SqlType(CHAR) */
  case class GreatCurrencyHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], numDecimalDigits: scala.math.BigDecimal, textDe: Option[String], textEn: Option[String], textEs: Option[String], startDate: Option[java.sql.Timestamp], endDate: Option[java.sql.Timestamp], fxtype: Option[Char])
  /** GetResult implicit for fetching GreatCurrencyHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatCurrencyHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]]): GR[GreatCurrencyHistoryRow] = GR{
    prs => import prs._
      GreatCurrencyHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char]))
  }
  /** Table description of table GREAT_CURRENCY_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatCurrencyHistory(_tableTag: Tag) extends profile.api.Table[GreatCurrencyHistoryRow](_tableTag, Some("WERNER2"), "GREAT_CURRENCY_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, numDecimalDigits, textDe, textEn, textEs, startDate, endDate, fxtype) <> (GreatCurrencyHistoryRow.tupled, GreatCurrencyHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, Rep.Some(numDecimalDigits), textDe, textEn, textEs, startDate, endDate, fxtype).shaped.<>({r=>import r._; _1.map(_=> GreatCurrencyHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8.get, _9, _10, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column NUM_DECIMAL_DIGITS SqlType(NUMBER) */
    val numDecimalDigits: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("NUM_DECIMAL_DIGITS")
    /** Database column TEXT_DE SqlType(VARCHAR2), Length(500,true) */
    val textDe: Rep[Option[String]] = column[Option[String]]("TEXT_DE", O.Length(500,varying=true))
    /** Database column TEXT_EN SqlType(VARCHAR2), Length(500,true) */
    val textEn: Rep[Option[String]] = column[Option[String]]("TEXT_EN", O.Length(500,varying=true))
    /** Database column TEXT_ES SqlType(VARCHAR2), Length(500,true) */
    val textEs: Rep[Option[String]] = column[Option[String]]("TEXT_ES", O.Length(500,varying=true))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("START_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("END_DATE")
    /** Database column FXTYPE SqlType(CHAR) */
    val fxtype: Rep[Option[Char]] = column[Option[Char]]("FXTYPE")

    /** Primary key of GreatCurrencyHistory (database name CURRH_PK_OBJECTIDC) */
    val pk = primaryKey("CURRH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatCurrencyHistory */
  lazy val GreatCurrencyHistory = new TableQuery(tag => new GreatCurrencyHistory(tag))



  /** Row type of table GreatBusinessPartner */
  type GreatBusinessPartnerRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatBusinessPartnerRow providing default values if available in the database schema. */
  def GreatBusinessPartnerRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], bic: Option[String], name: Option[String], appendix1: Option[String], appendix2: Option[String], appendix3: Option[String], street: Option[String], zip: Option[String], city: Option[String], iso3166Alpha3Code: Option[String], telephone: Option[String], telefax: Option[String], email: Option[String], conditions: Option[String], commentary: Option[String], active: Option[Char], contactUserKey1: Option[String], contactUserKey2: Option[String], contactUserKey3: Option[String], contactUserKey4: Option[String], duns: Option[String], dunsDo: Option[String], dunsGu: Option[String], ifa: Option[String], region: Option[String], telephoneCmd: Option[String], cmdStatus: Option[Char], `type`: Option[Char], migration: Option[String], temporary: Option[Char], gmsId: Option[String], globalGmsId: Option[String], gmsCheck: Option[Char], spRating: Option[String], spRatingDate: Option[java.sql.Timestamp], fitchRating: Option[String], fitchRatingDate: Option[java.sql.Timestamp], moodyRating: Option[String], moodyRatingDate: Option[java.sql.Timestamp], lcCommentary: Option[String], lcBics: Option[String], lcConsultant1: Option[String], lcConsultant2: Option[String], lcTransactionmanager1: Option[String], lcTransactionmanager2: Option[String]): GreatBusinessPartnerRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: bic :: name :: appendix1 :: appendix2 :: appendix3 :: street :: zip :: city :: iso3166Alpha3Code :: telephone :: telefax :: email :: conditions :: commentary :: active :: contactUserKey1 :: contactUserKey2 :: contactUserKey3 :: contactUserKey4 :: duns :: dunsDo :: dunsGu :: ifa :: region :: telephoneCmd :: cmdStatus :: `type` :: migration :: temporary :: gmsId :: globalGmsId :: gmsCheck :: spRating :: spRatingDate :: fitchRating :: fitchRatingDate :: moodyRating :: moodyRatingDate :: lcCommentary :: lcBics :: lcConsultant1 :: lcConsultant2 :: lcTransactionmanager1 :: lcTransactionmanager2 :: HNil
  }
  /** GetResult implicit for fetching GreatBusinessPartnerRow objects using plain SQL queries */
  implicit def GetResultGreatBusinessPartnerRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatBusinessPartnerRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BUSINESS_PARTNER. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatBusinessPartner(_tableTag: Tag) extends profile.api.Table[GreatBusinessPartnerRow](_tableTag, Some("WERNER2"), "GREAT_BUSINESS_PARTNER") {
    def * = objectidc :: objectversionc :: lastuserc :: updatetimec :: bic :: name :: appendix1 :: appendix2 :: appendix3 :: street :: zip :: city :: iso3166Alpha3Code :: telephone :: telefax :: email :: conditions :: commentary :: active :: contactUserKey1 :: contactUserKey2 :: contactUserKey3 :: contactUserKey4 :: duns :: dunsDo :: dunsGu :: ifa :: region :: telephoneCmd :: cmdStatus :: `type` :: migration :: temporary :: gmsId :: globalGmsId :: gmsCheck :: spRating :: spRatingDate :: fitchRating :: fitchRatingDate :: moodyRating :: moodyRatingDate :: lcCommentary :: lcBics :: lcConsultant1 :: lcConsultant2 :: lcTransactionmanager1 :: lcTransactionmanager2 :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column BIC SqlType(VARCHAR2), Length(11,true) */
    val bic: Rep[Option[String]] = column[Option[String]]("BIC", O.Length(11,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(52,varying=true))
    /** Database column APPENDIX1 SqlType(VARCHAR2), Length(500,true) */
    val appendix1: Rep[Option[String]] = column[Option[String]]("APPENDIX1", O.Length(500,varying=true))
    /** Database column APPENDIX2 SqlType(VARCHAR2), Length(200,true) */
    val appendix2: Rep[Option[String]] = column[Option[String]]("APPENDIX2", O.Length(200,varying=true))
    /** Database column APPENDIX3 SqlType(VARCHAR2), Length(200,true) */
    val appendix3: Rep[Option[String]] = column[Option[String]]("APPENDIX3", O.Length(200,varying=true))
    /** Database column STREET SqlType(VARCHAR2), Length(200,true) */
    val street: Rep[Option[String]] = column[Option[String]]("STREET", O.Length(200,varying=true))
    /** Database column ZIP SqlType(VARCHAR2), Length(14,true) */
    val zip: Rep[Option[String]] = column[Option[String]]("ZIP", O.Length(14,varying=true))
    /** Database column CITY SqlType(VARCHAR2), Length(52,true) */
    val city: Rep[Option[String]] = column[Option[String]]("CITY", O.Length(52,varying=true))
    /** Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true) */
    val iso3166Alpha3Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA3_CODE", O.Length(3,varying=true))
    /** Database column TELEPHONE SqlType(VARCHAR2), Length(32,true) */
    val telephone: Rep[Option[String]] = column[Option[String]]("TELEPHONE", O.Length(32,varying=true))
    /** Database column TELEFAX SqlType(VARCHAR2), Length(32,true) */
    val telefax: Rep[Option[String]] = column[Option[String]]("TELEFAX", O.Length(32,varying=true))
    /** Database column EMAIL SqlType(VARCHAR2), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("EMAIL", O.Length(100,varying=true))
    /** Database column CONDITIONS SqlType(VARCHAR2), Length(1024,true) */
    val conditions: Rep[Option[String]] = column[Option[String]]("CONDITIONS", O.Length(1024,varying=true))
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(128,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(128,varying=true))
    /** Database column ACTIVE SqlType(CHAR) */
    val active: Rep[Option[Char]] = column[Option[Char]]("ACTIVE")
    /** Database column CONTACT_USER_KEY_1 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey1: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_1", O.Length(10,varying=true))
    /** Database column CONTACT_USER_KEY_2 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey2: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_2", O.Length(10,varying=true))
    /** Database column CONTACT_USER_KEY_3 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey3: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_3", O.Length(10,varying=true))
    /** Database column CONTACT_USER_KEY_4 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey4: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_4", O.Length(10,varying=true))
    /** Database column DUNS SqlType(VARCHAR2), Length(9,true) */
    val duns: Rep[Option[String]] = column[Option[String]]("DUNS", O.Length(9,varying=true))
    /** Database column DUNS_DO SqlType(VARCHAR2), Length(9,true) */
    val dunsDo: Rep[Option[String]] = column[Option[String]]("DUNS_DO", O.Length(9,varying=true))
    /** Database column DUNS_GU SqlType(VARCHAR2), Length(9,true) */
    val dunsGu: Rep[Option[String]] = column[Option[String]]("DUNS_GU", O.Length(9,varying=true))
    /** Database column IFA SqlType(VARCHAR2), Length(10,true) */
    val ifa: Rep[Option[String]] = column[Option[String]]("IFA", O.Length(10,varying=true))
    /** Database column REGION SqlType(VARCHAR2), Length(20,true) */
    val region: Rep[Option[String]] = column[Option[String]]("REGION", O.Length(20,varying=true))
    /** Database column TELEPHONE_CMD SqlType(VARCHAR2), Length(32,true) */
    val telephoneCmd: Rep[Option[String]] = column[Option[String]]("TELEPHONE_CMD", O.Length(32,varying=true))
    /** Database column CMD_STATUS SqlType(CHAR) */
    val cmdStatus: Rep[Option[Char]] = column[Option[Char]]("CMD_STATUS")
    /** Database column TYPE SqlType(VARCHAR2)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Char]] = column[Option[Char]]("TYPE")
    /** Database column MIGRATION SqlType(VARCHAR2), Length(128,true) */
    val migration: Rep[Option[String]] = column[Option[String]]("MIGRATION", O.Length(128,varying=true))
    /** Database column TEMPORARY SqlType(CHAR) */
    val temporary: Rep[Option[Char]] = column[Option[Char]]("TEMPORARY")
    /** Database column GMS_ID SqlType(VARCHAR2), Length(10,true) */
    val gmsId: Rep[Option[String]] = column[Option[String]]("GMS_ID", O.Length(10,varying=true))
    /** Database column GLOBAL_GMS_ID SqlType(VARCHAR2), Length(10,true) */
    val globalGmsId: Rep[Option[String]] = column[Option[String]]("GLOBAL_GMS_ID", O.Length(10,varying=true))
    /** Database column GMS_CHECK SqlType(CHAR) */
    val gmsCheck: Rep[Option[Char]] = column[Option[Char]]("GMS_CHECK")
    /** Database column SP_RATING SqlType(VARCHAR2), Length(10,true) */
    val spRating: Rep[Option[String]] = column[Option[String]]("SP_RATING", O.Length(10,varying=true))
    /** Database column SP_RATING_DATE SqlType(DATE) */
    val spRatingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SP_RATING_DATE")
    /** Database column FITCH_RATING SqlType(VARCHAR2), Length(10,true) */
    val fitchRating: Rep[Option[String]] = column[Option[String]]("FITCH_RATING", O.Length(10,varying=true))
    /** Database column FITCH_RATING_DATE SqlType(DATE) */
    val fitchRatingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FITCH_RATING_DATE")
    /** Database column MOODY_RATING SqlType(VARCHAR2), Length(10,true) */
    val moodyRating: Rep[Option[String]] = column[Option[String]]("MOODY_RATING", O.Length(10,varying=true))
    /** Database column MOODY_RATING_DATE SqlType(DATE) */
    val moodyRatingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MOODY_RATING_DATE")
    /** Database column LC_COMMENTARY SqlType(VARCHAR2), Length(512,true) */
    val lcCommentary: Rep[Option[String]] = column[Option[String]]("LC_COMMENTARY", O.Length(512,varying=true))
    /** Database column LC_BICS SqlType(VARCHAR2), Length(59,true) */
    val lcBics: Rep[Option[String]] = column[Option[String]]("LC_BICS", O.Length(59,varying=true))
    /** Database column LC_CONSULTANT_1 SqlType(VARCHAR2), Length(10,true) */
    val lcConsultant1: Rep[Option[String]] = column[Option[String]]("LC_CONSULTANT_1", O.Length(10,varying=true))
    /** Database column LC_CONSULTANT_2 SqlType(VARCHAR2), Length(10,true) */
    val lcConsultant2: Rep[Option[String]] = column[Option[String]]("LC_CONSULTANT_2", O.Length(10,varying=true))
    /** Database column LC_TRANSACTIONMANAGER_1 SqlType(VARCHAR2), Length(10,true) */
    val lcTransactionmanager1: Rep[Option[String]] = column[Option[String]]("LC_TRANSACTIONMANAGER_1", O.Length(10,varying=true))
    /** Database column LC_TRANSACTIONMANAGER_2 SqlType(VARCHAR2), Length(10,true) */
    val lcTransactionmanager2: Rep[Option[String]] = column[Option[String]]("LC_TRANSACTIONMANAGER_2", O.Length(10,varying=true))

    /** Foreign key referencing GreatCountry (database name BA_FK_ISO_3166_ALPHA3_CODE) */
    lazy val greatCountryFk = foreignKey("BA_FK_ISO_3166_ALPHA3_CODE", iso3166Alpha3Code :: HNil, GreatCountry)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_CONTACT_USER_KEY_1) */
    lazy val greatDivisionUserFk2 = foreignKey("BA_FK_CONTACT_USER_KEY_1", contactUserKey1 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_CONTACT_USER_KEY_2) */
    lazy val greatDivisionUserFk3 = foreignKey("BA_FK_CONTACT_USER_KEY_2", contactUserKey2 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_CONTACT_USER_KEY_3) */
    lazy val greatDivisionUserFk4 = foreignKey("BA_FK_CONTACT_USER_KEY_3", contactUserKey3 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_CONTACT_USER_KEY_4) */
    lazy val greatDivisionUserFk5 = foreignKey("BA_FK_CONTACT_USER_KEY_4", contactUserKey4 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_LC_CONSULTANT_1) */
    lazy val greatDivisionUserFk6 = foreignKey("BA_FK_LC_CONSULTANT_1", lcConsultant1 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_LC_CONSULTANT_2) */
    lazy val greatDivisionUserFk7 = foreignKey("BA_FK_LC_CONSULTANT_2", lcConsultant2 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_LC_TRANSACTIONMANAGER_1) */
    lazy val greatDivisionUserFk8 = foreignKey("BA_FK_LC_TRANSACTIONMANAGER_1", lcTransactionmanager1 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BA_FK_LC_TRANSACTIONMANAGER_2) */
    lazy val greatDivisionUserFk9 = foreignKey("BA_FK_LC_TRANSACTIONMANAGER_2", lcTransactionmanager2 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBusinessPartner */
  lazy val GreatBusinessPartner = new TableQuery(tag => new GreatBusinessPartner(tag))

  /** Row type of table GreatBusinessPartnerHistory */
  type GreatBusinessPartnerHistoryRow = HCons[String,HCons[scala.math.BigDecimal,HCons[Option[String],HCons[String,HCons[String,HCons[Char,HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatBusinessPartnerHistoryRow providing default values if available in the database schema. */
  def GreatBusinessPartnerHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], bic: Option[String], name: Option[String], appendix1: Option[String], appendix2: Option[String], appendix3: Option[String], street: Option[String], zip: Option[String], city: Option[String], iso3166Alpha3Code: Option[String], telephone: Option[String], telefax: Option[String], email: Option[String], conditions: Option[String], commentary: Option[String], active: Option[Char], contactUserKey1: Option[String], contactUserKey2: Option[String], contactUserKey3: Option[String], contactUserKey4: Option[String], duns: Option[String], dunsDo: Option[String], dunsGu: Option[String], ifa: Option[String], region: Option[String], telephoneCmd: Option[String], cmdStatus: Option[Char], `type`: Option[Char], migration: Option[String], temporary: Option[Char], gmsId: Option[String], globalGmsId: Option[String], gmsCheck: Option[Char], spRating: Option[String], spRatingDate: Option[java.sql.Timestamp], fitchRating: Option[String], fitchRatingDate: Option[java.sql.Timestamp], moodyRating: Option[String], moodyRatingDate: Option[java.sql.Timestamp], lcCommentary: Option[String], lcBics: Option[String], lcConsultant1: Option[String], lcConsultant2: Option[String], lcTransactionmanager1: Option[String], lcTransactionmanager2: Option[String]): GreatBusinessPartnerHistoryRow = {
    objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: bic :: name :: appendix1 :: appendix2 :: appendix3 :: street :: zip :: city :: iso3166Alpha3Code :: telephone :: telefax :: email :: conditions :: commentary :: active :: contactUserKey1 :: contactUserKey2 :: contactUserKey3 :: contactUserKey4 :: duns :: dunsDo :: dunsGu :: ifa :: region :: telephoneCmd :: cmdStatus :: `type` :: migration :: temporary :: gmsId :: globalGmsId :: gmsCheck :: spRating :: spRatingDate :: fitchRating :: fitchRatingDate :: moodyRating :: moodyRatingDate :: lcCommentary :: lcBics :: lcConsultant1 :: lcConsultant2 :: lcTransactionmanager1 :: lcTransactionmanager2 :: HNil
  }
  /** GetResult implicit for fetching GreatBusinessPartnerHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatBusinessPartnerHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]]): GR[GreatBusinessPartnerHistoryRow] = GR{
    prs => import prs._
      <<[String] :: <<[scala.math.BigDecimal] :: <<?[String] :: <<[String] :: <<[String] :: <<[Char] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BUSINESS_PARTNER_HISTORY. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatBusinessPartnerHistory(_tableTag: Tag) extends profile.api.Table[GreatBusinessPartnerHistoryRow](_tableTag, Some("WERNER2"), "GREAT_BUSINESS_PARTNER_HISTORY") {
    def * = objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: bic :: name :: appendix1 :: appendix2 :: appendix3 :: street :: zip :: city :: iso3166Alpha3Code :: telephone :: telefax :: email :: conditions :: commentary :: active :: contactUserKey1 :: contactUserKey2 :: contactUserKey3 :: contactUserKey4 :: duns :: dunsDo :: dunsGu :: ifa :: region :: telephoneCmd :: cmdStatus :: `type` :: migration :: temporary :: gmsId :: globalGmsId :: gmsCheck :: spRating :: spRatingDate :: fitchRating :: fitchRatingDate :: moodyRating :: moodyRatingDate :: lcCommentary :: lcBics :: lcConsultant1 :: lcConsultant2 :: lcTransactionmanager1 :: lcTransactionmanager2 :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column BIC SqlType(VARCHAR2), Length(11,true) */
    val bic: Rep[Option[String]] = column[Option[String]]("BIC", O.Length(11,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(52,varying=true))
    /** Database column APPENDIX1 SqlType(VARCHAR2), Length(500,true) */
    val appendix1: Rep[Option[String]] = column[Option[String]]("APPENDIX1", O.Length(500,varying=true))
    /** Database column APPENDIX2 SqlType(VARCHAR2), Length(200,true) */
    val appendix2: Rep[Option[String]] = column[Option[String]]("APPENDIX2", O.Length(200,varying=true))
    /** Database column APPENDIX3 SqlType(VARCHAR2), Length(200,true) */
    val appendix3: Rep[Option[String]] = column[Option[String]]("APPENDIX3", O.Length(200,varying=true))
    /** Database column STREET SqlType(VARCHAR2), Length(200,true) */
    val street: Rep[Option[String]] = column[Option[String]]("STREET", O.Length(200,varying=true))
    /** Database column ZIP SqlType(VARCHAR2), Length(14,true) */
    val zip: Rep[Option[String]] = column[Option[String]]("ZIP", O.Length(14,varying=true))
    /** Database column CITY SqlType(VARCHAR2), Length(52,true) */
    val city: Rep[Option[String]] = column[Option[String]]("CITY", O.Length(52,varying=true))
    /** Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true) */
    val iso3166Alpha3Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA3_CODE", O.Length(3,varying=true))
    /** Database column TELEPHONE SqlType(VARCHAR2), Length(32,true) */
    val telephone: Rep[Option[String]] = column[Option[String]]("TELEPHONE", O.Length(32,varying=true))
    /** Database column TELEFAX SqlType(VARCHAR2), Length(32,true) */
    val telefax: Rep[Option[String]] = column[Option[String]]("TELEFAX", O.Length(32,varying=true))
    /** Database column EMAIL SqlType(VARCHAR2), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("EMAIL", O.Length(100,varying=true))
    /** Database column CONDITIONS SqlType(VARCHAR2), Length(1024,true) */
    val conditions: Rep[Option[String]] = column[Option[String]]("CONDITIONS", O.Length(1024,varying=true))
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(128,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(128,varying=true))
    /** Database column ACTIVE SqlType(CHAR) */
    val active: Rep[Option[Char]] = column[Option[Char]]("ACTIVE")
    /** Database column CONTACT_USER_KEY_1 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey1: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_1", O.Length(10,varying=true))
    /** Database column CONTACT_USER_KEY_2 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey2: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_2", O.Length(10,varying=true))
    /** Database column CONTACT_USER_KEY_3 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey3: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_3", O.Length(10,varying=true))
    /** Database column CONTACT_USER_KEY_4 SqlType(VARCHAR2), Length(10,true) */
    val contactUserKey4: Rep[Option[String]] = column[Option[String]]("CONTACT_USER_KEY_4", O.Length(10,varying=true))
    /** Database column DUNS SqlType(VARCHAR2), Length(9,true) */
    val duns: Rep[Option[String]] = column[Option[String]]("DUNS", O.Length(9,varying=true))
    /** Database column DUNS_DO SqlType(VARCHAR2), Length(9,true) */
    val dunsDo: Rep[Option[String]] = column[Option[String]]("DUNS_DO", O.Length(9,varying=true))
    /** Database column DUNS_GU SqlType(VARCHAR2), Length(9,true) */
    val dunsGu: Rep[Option[String]] = column[Option[String]]("DUNS_GU", O.Length(9,varying=true))
    /** Database column IFA SqlType(VARCHAR2), Length(10,true) */
    val ifa: Rep[Option[String]] = column[Option[String]]("IFA", O.Length(10,varying=true))
    /** Database column REGION SqlType(VARCHAR2), Length(20,true) */
    val region: Rep[Option[String]] = column[Option[String]]("REGION", O.Length(20,varying=true))
    /** Database column TELEPHONE_CMD SqlType(VARCHAR2), Length(32,true) */
    val telephoneCmd: Rep[Option[String]] = column[Option[String]]("TELEPHONE_CMD", O.Length(32,varying=true))
    /** Database column CMD_STATUS SqlType(CHAR) */
    val cmdStatus: Rep[Option[Char]] = column[Option[Char]]("CMD_STATUS")
    /** Database column TYPE SqlType(VARCHAR2)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Char]] = column[Option[Char]]("TYPE")
    /** Database column MIGRATION SqlType(VARCHAR2), Length(128,true) */
    val migration: Rep[Option[String]] = column[Option[String]]("MIGRATION", O.Length(128,varying=true))
    /** Database column TEMPORARY SqlType(CHAR) */
    val temporary: Rep[Option[Char]] = column[Option[Char]]("TEMPORARY")
    /** Database column GMS_ID SqlType(VARCHAR2), Length(10,true) */
    val gmsId: Rep[Option[String]] = column[Option[String]]("GMS_ID", O.Length(10,varying=true))
    /** Database column GLOBAL_GMS_ID SqlType(VARCHAR2), Length(10,true) */
    val globalGmsId: Rep[Option[String]] = column[Option[String]]("GLOBAL_GMS_ID", O.Length(10,varying=true))
    /** Database column GMS_CHECK SqlType(CHAR) */
    val gmsCheck: Rep[Option[Char]] = column[Option[Char]]("GMS_CHECK")
    /** Database column SP_RATING SqlType(VARCHAR2), Length(10,true) */
    val spRating: Rep[Option[String]] = column[Option[String]]("SP_RATING", O.Length(10,varying=true))
    /** Database column SP_RATING_DATE SqlType(DATE) */
    val spRatingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SP_RATING_DATE")
    /** Database column FITCH_RATING SqlType(VARCHAR2), Length(10,true) */
    val fitchRating: Rep[Option[String]] = column[Option[String]]("FITCH_RATING", O.Length(10,varying=true))
    /** Database column FITCH_RATING_DATE SqlType(DATE) */
    val fitchRatingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FITCH_RATING_DATE")
    /** Database column MOODY_RATING SqlType(VARCHAR2), Length(10,true) */
    val moodyRating: Rep[Option[String]] = column[Option[String]]("MOODY_RATING", O.Length(10,varying=true))
    /** Database column MOODY_RATING_DATE SqlType(DATE) */
    val moodyRatingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MOODY_RATING_DATE")
    /** Database column LC_COMMENTARY SqlType(VARCHAR2), Length(512,true) */
    val lcCommentary: Rep[Option[String]] = column[Option[String]]("LC_COMMENTARY", O.Length(512,varying=true))
    /** Database column LC_BICS SqlType(VARCHAR2), Length(59,true) */
    val lcBics: Rep[Option[String]] = column[Option[String]]("LC_BICS", O.Length(59,varying=true))
    /** Database column LC_CONSULTANT_1 SqlType(VARCHAR2), Length(10,true) */
    val lcConsultant1: Rep[Option[String]] = column[Option[String]]("LC_CONSULTANT_1", O.Length(10,varying=true))
    /** Database column LC_CONSULTANT_2 SqlType(VARCHAR2), Length(10,true) */
    val lcConsultant2: Rep[Option[String]] = column[Option[String]]("LC_CONSULTANT_2", O.Length(10,varying=true))
    /** Database column LC_TRANSACTIONMANAGER_1 SqlType(VARCHAR2), Length(10,true) */
    val lcTransactionmanager1: Rep[Option[String]] = column[Option[String]]("LC_TRANSACTIONMANAGER_1", O.Length(10,varying=true))
    /** Database column LC_TRANSACTIONMANAGER_2 SqlType(VARCHAR2), Length(10,true) */
    val lcTransactionmanager2: Rep[Option[String]] = column[Option[String]]("LC_TRANSACTIONMANAGER_2", O.Length(10,varying=true))

    /** Primary key of GreatBusinessPartnerHistory (database name BANKH_PK_OBJECTIDC) */
    val pk = primaryKey("BANKH_PK_OBJECTIDC", objectidc :: objectversionc :: HNil)

    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_CONTACT_USER_KEY_1) */
    lazy val greatDivisionUserFk1 = foreignKey("BANKH_FK_CONTACT_USER_KEY_1", contactUserKey1 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_CONTACT_USER_KEY_2) */
    lazy val greatDivisionUserFk2 = foreignKey("BANKH_FK_CONTACT_USER_KEY_2", contactUserKey2 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_CONTACT_USER_KEY_3) */
    lazy val greatDivisionUserFk3 = foreignKey("BANKH_FK_CONTACT_USER_KEY_3", contactUserKey3 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_CONTACT_USER_KEY_4) */
    lazy val greatDivisionUserFk4 = foreignKey("BANKH_FK_CONTACT_USER_KEY_4", contactUserKey4 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_LC_CONSULTANT_1) */
    lazy val greatDivisionUserFk5 = foreignKey("BANKH_FK_LC_CONSULTANT_1", lcConsultant1 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_LC_CONSULTANT_2) */
    lazy val greatDivisionUserFk6 = foreignKey("BANKH_FK_LC_CONSULTANT_2", lcConsultant2 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_LC_TRANSACTIONMANAG6) */
    lazy val greatDivisionUserFk7 = foreignKey("BANKH_FK_LC_TRANSACTIONMANAG6", lcTransactionmanager1 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name BANKH_FK_LC_TRANSACTIONMANAG7) */
    lazy val greatDivisionUserFk8 = foreignKey("BANKH_FK_LC_TRANSACTIONMANAG7", lcTransactionmanager2 :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBusinessPartnerHistory */
  lazy val GreatBusinessPartnerHistory = new TableQuery(tag => new GreatBusinessPartnerHistory(tag))


  /** Entity class storing rows of table GreatFxRates
    *  @param fxtype Database column FXTYPE SqlType(CHAR)
    *  @param fxdate Database column FXDATE SqlType(DATE)
    *  @param isoCode Database column ISO_CODE SqlType(CHAR), Length(3,false)
    *  @param rate Database column RATE SqlType(NUMBER) */
  case class GreatFxRatesRow(fxtype: Char, fxdate: java.sql.Timestamp, isoCode: String, rate: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatFxRatesRow objects using plain SQL queries */
  implicit def GetResultGreatFxRatesRow(implicit e0: GR[Char], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[scala.math.BigDecimal]): GR[GreatFxRatesRow] = GR{
    prs => import prs._
      GreatFxRatesRow.tupled((<<[Char], <<[java.sql.Timestamp], <<[String], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_FX_RATES. Objects of this class serve as prototypes for rows in queries. */
  class GreatFxRates(_tableTag: Tag) extends profile.api.Table[GreatFxRatesRow](_tableTag, Some("WERNER2"), "GREAT_FX_RATES") {
    def * = (fxtype, fxdate, isoCode, rate) <> (GreatFxRatesRow.tupled, GreatFxRatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(fxtype), Rep.Some(fxdate), Rep.Some(isoCode), Rep.Some(rate)).shaped.<>({r=>import r._; _1.map(_=> GreatFxRatesRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FXTYPE SqlType(CHAR) */
    val fxtype: Rep[Char] = column[Char]("FXTYPE")
    /** Database column FXDATE SqlType(DATE) */
    val fxdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("FXDATE")
    /** Database column ISO_CODE SqlType(CHAR), Length(3,false) */
    val isoCode: Rep[String] = column[String]("ISO_CODE", O.Length(3,varying=false))
    /** Database column RATE SqlType(NUMBER) */
    val rate: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("RATE")

    /** Primary key of GreatFxRates (database name FX_PK_FXTYPE) */
    val pk = primaryKey("FX_PK_FXTYPE", (fxtype, fxdate, isoCode))
  }
  /** Collection-like TableQuery object for table GreatFxRates */
  lazy val GreatFxRates = new TableQuery(tag => new GreatFxRates(tag))


  /** Entity class storing rows of table GreatLanguage
    *  @param iso639Code Database column ISO_639_CODE SqlType(CHAR), PrimaryKey, Length(2,false)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(30,true)
    *  @param systemLanguage Database column SYSTEM_LANGUAGE SqlType(CHAR) */
  case class GreatLanguageRow(iso639Code: String, name: Option[String], systemLanguage: Option[Char])
  /** GetResult implicit for fetching GreatLanguageRow objects using plain SQL queries */
  implicit def GetResultGreatLanguageRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Char]]): GR[GreatLanguageRow] = GR{
    prs => import prs._
      GreatLanguageRow.tupled((<<[String], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_LANGUAGE. Objects of this class serve as prototypes for rows in queries. */
  class GreatLanguage(_tableTag: Tag) extends profile.api.Table[GreatLanguageRow](_tableTag, Some("WERNER2"), "GREAT_LANGUAGE") {
    def * = (iso639Code, name, systemLanguage) <> (GreatLanguageRow.tupled, GreatLanguageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(iso639Code), name, systemLanguage).shaped.<>({r=>import r._; _1.map(_=> GreatLanguageRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ISO_639_CODE SqlType(CHAR), PrimaryKey, Length(2,false) */
    val iso639Code: Rep[String] = column[String]("ISO_639_CODE", O.PrimaryKey, O.Length(2,varying=false))
    /** Database column NAME SqlType(VARCHAR2), Length(30,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(30,varying=true))
    /** Database column SYSTEM_LANGUAGE SqlType(CHAR) */
    val systemLanguage: Rep[Option[Char]] = column[Option[Char]]("SYSTEM_LANGUAGE")
  }
  /** Collection-like TableQuery object for table GreatLanguage */
  lazy val GreatLanguage = new TableQuery(tag => new GreatLanguage(tag))

  /** Entity class storing rows of table GreatLatestFxRates
    *  @param isoCode Database column ISO_CODE SqlType(CHAR), PrimaryKey, Length(3,false)
    *  @param rate Database column RATE SqlType(NUMBER) */
  case class GreatLatestFxRatesRow(isoCode: String, rate: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatLatestFxRatesRow objects using plain SQL queries */
  implicit def GetResultGreatLatestFxRatesRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal]): GR[GreatLatestFxRatesRow] = GR{
    prs => import prs._
      GreatLatestFxRatesRow.tupled((<<[String], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_LATEST_FX_RATES. Objects of this class serve as prototypes for rows in queries. */
  class GreatLatestFxRates(_tableTag: Tag) extends profile.api.Table[GreatLatestFxRatesRow](_tableTag, Some("WERNER2"), "GREAT_LATEST_FX_RATES") {
    def * = (isoCode, rate) <> (GreatLatestFxRatesRow.tupled, GreatLatestFxRatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(isoCode), Rep.Some(rate)).shaped.<>({r=>import r._; _1.map(_=> GreatLatestFxRatesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ISO_CODE SqlType(CHAR), PrimaryKey, Length(3,false) */
    val isoCode: Rep[String] = column[String]("ISO_CODE", O.PrimaryKey, O.Length(3,varying=false))
    /** Database column RATE SqlType(NUMBER) */
    val rate: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("RATE")
  }
  /** Collection-like TableQuery object for table GreatLatestFxRates */
  lazy val GreatLatestFxRates = new TableQuery(tag => new GreatLatestFxRates(tag))



  /** Entity class storing rows of table GreatOrg
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param shortName Database column SHORT_NAME SqlType(VARCHAR2), Length(146,true)
    *  @param areCode Database column ARE_CODE SqlType(VARCHAR2), Length(4,true)
    *  @param functions Database column FUNCTIONS SqlType(VARCHAR2), Length(60,true)
    *  @param divisionShortName Database column DIVISION_SHORT_NAME SqlType(VARCHAR2), Length(3,true)
    *  @param external Database column EXTERNAL SqlType(CHAR)
    *  @param active Database column ACTIVE SqlType(CHAR)
    *  @param ifa Database column IFA SqlType(VARCHAR2), Length(10,true)
    *  @param address Database column ADDRESS SqlType(VARCHAR2), Length(160,true)
    *  @param temporary Database column TEMPORARY SqlType(CHAR)
    *  @param divisionShortNameOld Database column DIVISION_SHORT_NAME_OLD SqlType(VARCHAR2), Length(3,true) */
  case class GreatOrgRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], shortName: Option[String], areCode: Option[String], functions: Option[String], divisionShortName: Option[String], external: Option[Char], active: Option[Char], ifa: Option[String], address: Option[String], temporary: Option[Char], divisionShortNameOld: Option[String])
  /** GetResult implicit for fetching GreatOrgRow objects using plain SQL queries */
  implicit def GetResultGreatOrgRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatOrgRow] = GR{
    prs => import prs._
      GreatOrgRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char], <<?[Char], <<?[String], <<?[String], <<?[Char], <<?[String]))
  }
  /** Table description of table GREAT_ORG. Objects of this class serve as prototypes for rows in queries. */
  class GreatOrg(_tableTag: Tag) extends profile.api.Table[GreatOrgRow](_tableTag, Some("WERNER2"), "GREAT_ORG") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, shortName, areCode, functions, divisionShortName, external, active, ifa, address, temporary, divisionShortNameOld) <> (GreatOrgRow.tupled, GreatOrgRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, shortName, areCode, functions, divisionShortName, external, active, ifa, address, temporary, divisionShortNameOld).shaped.<>({r=>import r._; _1.map(_=> GreatOrgRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column SHORT_NAME SqlType(VARCHAR2), Length(146,true) */
    val shortName: Rep[Option[String]] = column[Option[String]]("SHORT_NAME", O.Length(146,varying=true))
    /** Database column ARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val areCode: Rep[Option[String]] = column[Option[String]]("ARE_CODE", O.Length(4,varying=true))
    /** Database column FUNCTIONS SqlType(VARCHAR2), Length(60,true) */
    val functions: Rep[Option[String]] = column[Option[String]]("FUNCTIONS", O.Length(60,varying=true))
    /** Database column DIVISION_SHORT_NAME SqlType(VARCHAR2), Length(3,true) */
    val divisionShortName: Rep[Option[String]] = column[Option[String]]("DIVISION_SHORT_NAME", O.Length(3,varying=true))
    /** Database column EXTERNAL SqlType(CHAR) */
    val external: Rep[Option[Char]] = column[Option[Char]]("EXTERNAL")
    /** Database column ACTIVE SqlType(CHAR) */
    val active: Rep[Option[Char]] = column[Option[Char]]("ACTIVE")
    /** Database column IFA SqlType(VARCHAR2), Length(10,true) */
    val ifa: Rep[Option[String]] = column[Option[String]]("IFA", O.Length(10,varying=true))
    /** Database column ADDRESS SqlType(VARCHAR2), Length(160,true) */
    val address: Rep[Option[String]] = column[Option[String]]("ADDRESS", O.Length(160,varying=true))
    /** Database column TEMPORARY SqlType(CHAR) */
    val temporary: Rep[Option[Char]] = column[Option[Char]]("TEMPORARY")
    /** Database column DIVISION_SHORT_NAME_OLD SqlType(VARCHAR2), Length(3,true) */
    val divisionShortNameOld: Rep[Option[String]] = column[Option[String]]("DIVISION_SHORT_NAME_OLD", O.Length(3,varying=true))

    /** Foreign key referencing GreatAccountingArea (database name ORG_FK_ARE_CODE) */
    lazy val greatAccountingAreaFk = foreignKey("ORG_FK_ARE_CODE", areCode, GreatAccountingArea)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatOrg */
  lazy val GreatOrg = new TableQuery(tag => new GreatOrg(tag))

  /** Entity class storing rows of table GreatOrgHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param shortName Database column SHORT_NAME SqlType(VARCHAR2), Length(146,true)
    *  @param areCode Database column ARE_CODE SqlType(VARCHAR2), Length(4,true)
    *  @param functions Database column FUNCTIONS SqlType(VARCHAR2), Length(60,true)
    *  @param divisionShortName Database column DIVISION_SHORT_NAME SqlType(VARCHAR2), Length(3,true)
    *  @param external Database column EXTERNAL SqlType(CHAR)
    *  @param active Database column ACTIVE SqlType(CHAR)
    *  @param ifa Database column IFA SqlType(VARCHAR2), Length(10,true)
    *  @param address Database column ADDRESS SqlType(VARCHAR2), Length(160,true)
    *  @param temporary Database column TEMPORARY SqlType(CHAR)
    *  @param divisionShortNameOld Database column DIVISION_SHORT_NAME_OLD SqlType(VARCHAR2), Length(3,true) */
  case class GreatOrgHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], shortName: Option[String], areCode: Option[String], functions: Option[String], divisionShortName: Option[String], external: Option[Char], active: Option[Char], ifa: Option[String], address: Option[String], temporary: Option[Char], divisionShortNameOld: Option[String])
  /** GetResult implicit for fetching GreatOrgHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatOrgHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]]): GR[GreatOrgHistoryRow] = GR{
    prs => import prs._
      GreatOrgHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char], <<?[Char], <<?[String], <<?[String], <<?[Char], <<?[String]))
  }
  /** Table description of table GREAT_ORG_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatOrgHistory(_tableTag: Tag) extends profile.api.Table[GreatOrgHistoryRow](_tableTag, Some("WERNER2"), "GREAT_ORG_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, shortName, areCode, functions, divisionShortName, external, active, ifa, address, temporary, divisionShortNameOld) <> (GreatOrgHistoryRow.tupled, GreatOrgHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, shortName, areCode, functions, divisionShortName, external, active, ifa, address, temporary, divisionShortNameOld).shaped.<>({r=>import r._; _1.map(_=> GreatOrgHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column SHORT_NAME SqlType(VARCHAR2), Length(146,true) */
    val shortName: Rep[Option[String]] = column[Option[String]]("SHORT_NAME", O.Length(146,varying=true))
    /** Database column ARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val areCode: Rep[Option[String]] = column[Option[String]]("ARE_CODE", O.Length(4,varying=true))
    /** Database column FUNCTIONS SqlType(VARCHAR2), Length(60,true) */
    val functions: Rep[Option[String]] = column[Option[String]]("FUNCTIONS", O.Length(60,varying=true))
    /** Database column DIVISION_SHORT_NAME SqlType(VARCHAR2), Length(3,true) */
    val divisionShortName: Rep[Option[String]] = column[Option[String]]("DIVISION_SHORT_NAME", O.Length(3,varying=true))
    /** Database column EXTERNAL SqlType(CHAR) */
    val external: Rep[Option[Char]] = column[Option[Char]]("EXTERNAL")
    /** Database column ACTIVE SqlType(CHAR) */
    val active: Rep[Option[Char]] = column[Option[Char]]("ACTIVE")
    /** Database column IFA SqlType(VARCHAR2), Length(10,true) */
    val ifa: Rep[Option[String]] = column[Option[String]]("IFA", O.Length(10,varying=true))
    /** Database column ADDRESS SqlType(VARCHAR2), Length(160,true) */
    val address: Rep[Option[String]] = column[Option[String]]("ADDRESS", O.Length(160,varying=true))
    /** Database column TEMPORARY SqlType(CHAR) */
    val temporary: Rep[Option[Char]] = column[Option[Char]]("TEMPORARY")
    /** Database column DIVISION_SHORT_NAME_OLD SqlType(VARCHAR2), Length(3,true) */
    val divisionShortNameOld: Rep[Option[String]] = column[Option[String]]("DIVISION_SHORT_NAME_OLD", O.Length(3,varying=true))

    /** Primary key of GreatOrgHistory (database name ORGH_PK_OBJECTIDC) */
    val pk = primaryKey("ORGH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatOrgHistory */
  lazy val GreatOrgHistory = new TableQuery(tag => new GreatOrgHistory(tag))



  /** Entity class storing rows of table GreatRatings
    *  @param code Database column CODE SqlType(CHAR), Length(3,false)
    *  @param lifetime Database column LIFETIME SqlType(NUMBER)
    *  @param rate Database column RATE SqlType(NUMBER) */
  case class GreatRatingsRow(code: String, lifetime: scala.math.BigDecimal, rate: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatRatingsRow objects using plain SQL queries */
  implicit def GetResultGreatRatingsRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal]): GR[GreatRatingsRow] = GR{
    prs => import prs._
      GreatRatingsRow.tupled((<<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_RATINGS. Objects of this class serve as prototypes for rows in queries. */
  class GreatRatings(_tableTag: Tag) extends profile.api.Table[GreatRatingsRow](_tableTag, Some("WERNER2"), "GREAT_RATINGS") {
    def * = (code, lifetime, rate) <> (GreatRatingsRow.tupled, GreatRatingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(code), Rep.Some(lifetime), Rep.Some(rate)).shaped.<>({r=>import r._; _1.map(_=> GreatRatingsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CODE SqlType(CHAR), Length(3,false) */
    val code: Rep[String] = column[String]("CODE", O.Length(3,varying=false))
    /** Database column LIFETIME SqlType(NUMBER) */
    val lifetime: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("LIFETIME")
    /** Database column RATE SqlType(NUMBER) */
    val rate: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("RATE")

    /** Primary key of GreatRatings (database name RA_PK_CODE) */
    val pk = primaryKey("RA_PK_CODE", (code, lifetime))
  }
  /** Collection-like TableQuery object for table GreatRatings */
  lazy val GreatRatings = new TableQuery(tag => new GreatRatings(tag))


  /** Entity class storing rows of table GreatGlineAccount
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param activeFlag Database column ACTIVE_FLAG SqlType(CHAR)
    *  @param contractId Database column CONTRACT_ID SqlType(VARCHAR2), Length(10,true)
    *  @param businessPartnerId Database column BUSINESS_PARTNER_ID SqlType(VARCHAR2), Length(10,true)
    *  @param bareId Database column BARE_ID SqlType(VARCHAR2), Length(10,true)
    *  @param limit Database column LIMIT SqlType(NUMBER)
    *  @param upperConsumptionPercentage Database column UPPER_CONSUMPTION_PERCENTAGE SqlType(NUMBER)
    *  @param accountNumber Database column ACCOUNT_NUMBER SqlType(NUMBER)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(150,true)
    *  @param expiringFlag Database column EXPIRING_FLAG SqlType(CHAR)
    *  @param fixedLimitFlag Database column FIXED_LIMIT_FLAG SqlType(CHAR)
    *  @param losId Database column LOS_ID SqlType(VARCHAR2), Length(10,true) */
  case class GreatGlineAccountRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], activeFlag: Char, contractId: String, businessPartnerId: String, bareId: String, limit: Option[scala.math.BigDecimal], upperConsumptionPercentage: Option[scala.math.BigDecimal], accountNumber: scala.math.BigDecimal, name: String, expiringFlag: Option[Char], fixedLimitFlag: Option[Char], losId: Option[String])
  /** GetResult implicit for fetching GreatGlineAccountRow objects using plain SQL queries */
  implicit def GetResultGreatGlineAccountRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Char], e5: GR[scala.math.BigDecimal], e6: GR[Option[Char]]): GR[GreatGlineAccountRow] = GR{
    prs => import prs._
      GreatGlineAccountRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<[Char], <<[String], <<[String], <<[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<?[Char], <<?[Char], <<?[String]))
  }
  /** Table description of table GREAT_GLINE_ACCOUNT. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineAccount(_tableTag: Tag) extends profile.api.Table[GreatGlineAccountRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_ACCOUNT") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, activeFlag, contractId, businessPartnerId, bareId, limit, upperConsumptionPercentage, accountNumber, name, expiringFlag, fixedLimitFlag, losId) <> (GreatGlineAccountRow.tupled, GreatGlineAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, Rep.Some(activeFlag), Rep.Some(contractId), Rep.Some(businessPartnerId), Rep.Some(bareId), limit, upperConsumptionPercentage, Rep.Some(accountNumber), Rep.Some(name), expiringFlag, fixedLimitFlag, losId).shaped.<>({r=>import r._; _1.map(_=> GreatGlineAccountRow.tupled((_1.get, _2, _3, _4, _5.get, _6.get, _7.get, _8.get, _9, _10, _11.get, _12.get, _13, _14, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column ACTIVE_FLAG SqlType(CHAR) */
    val activeFlag: Rep[Char] = column[Char]("ACTIVE_FLAG")
    /** Database column CONTRACT_ID SqlType(VARCHAR2), Length(10,true) */
    val contractId: Rep[String] = column[String]("CONTRACT_ID", O.Length(10,varying=true))
    /** Database column BUSINESS_PARTNER_ID SqlType(VARCHAR2), Length(10,true) */
    val businessPartnerId: Rep[String] = column[String]("BUSINESS_PARTNER_ID", O.Length(10,varying=true))
    /** Database column BARE_ID SqlType(VARCHAR2), Length(10,true) */
    val bareId: Rep[String] = column[String]("BARE_ID", O.Length(10,varying=true))
    /** Database column LIMIT SqlType(NUMBER) */
    val limit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LIMIT")
    /** Database column UPPER_CONSUMPTION_PERCENTAGE SqlType(NUMBER) */
    val upperConsumptionPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_CONSUMPTION_PERCENTAGE")
    /** Database column ACCOUNT_NUMBER SqlType(NUMBER) */
    val accountNumber: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ACCOUNT_NUMBER")
    /** Database column NAME SqlType(VARCHAR2), Length(150,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(150,varying=true))
    /** Database column EXPIRING_FLAG SqlType(CHAR) */
    val expiringFlag: Rep[Option[Char]] = column[Option[Char]]("EXPIRING_FLAG")
    /** Database column FIXED_LIMIT_FLAG SqlType(CHAR) */
    val fixedLimitFlag: Rep[Option[Char]] = column[Option[Char]]("FIXED_LIMIT_FLAG")
    /** Database column LOS_ID SqlType(VARCHAR2), Length(10,true) */
    val losId: Rep[Option[String]] = column[Option[String]]("LOS_ID", O.Length(10,varying=true))

    /** Foreign key referencing GreatBareDependants (database name GLA_FK_BARE_ID) */
    lazy val greatBareDependantsFk = foreignKey("GLA_FK_BARE_ID", bareId, GreatBareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBusinessPartner (database name GLA_FK_BUSINESS_PARTNER_ID) */
    lazy val greatBusinessPartnerFk = foreignKey("GLA_FK_BUSINESS_PARTNER_ID", businessPartnerId, GreatBusinessPartner)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineContract (database name GLA_FK_CONTRACT_ID) */
    lazy val greatGlineContractFk = foreignKey("GLA_FK_CONTRACT_ID", contractId, GreatGlineContract)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name GLA_FK_LOS_ID) */
    lazy val greatGuaranteeFileFk = foreignKey("GLA_FK_LOS_ID", losId, GreatGuaranteeFile)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGlineAccount */
  lazy val GreatGlineAccount = new TableQuery(tag => new GreatGlineAccount(tag))

  /** Entity class storing rows of table GreatGlineAccountHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param activeFlag Database column ACTIVE_FLAG SqlType(CHAR)
    *  @param contractId Database column CONTRACT_ID SqlType(VARCHAR2), Length(10,true)
    *  @param businessPartnerId Database column BUSINESS_PARTNER_ID SqlType(VARCHAR2), Length(10,true)
    *  @param bareId Database column BARE_ID SqlType(VARCHAR2), Length(10,true)
    *  @param limit Database column LIMIT SqlType(NUMBER)
    *  @param upperConsumptionPercentage Database column UPPER_CONSUMPTION_PERCENTAGE SqlType(NUMBER)
    *  @param lineNumber Database column LINE_NUMBER SqlType(VARCHAR2), Length(10,true)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(150,true)
    *  @param expiringFlag Database column EXPIRING_FLAG SqlType(CHAR)
    *  @param fixedLimitFlag Database column FIXED_LIMIT_FLAG SqlType(CHAR)
    *  @param losId Database column LOS_ID SqlType(VARCHAR2), Length(10,true) */
  case class GreatGlineAccountHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], activeFlag: Char, contractId: String, businessPartnerId: String, bareId: String, limit: Option[scala.math.BigDecimal], upperConsumptionPercentage: Option[scala.math.BigDecimal], lineNumber: String, name: String, expiringFlag: Option[Char], fixedLimitFlag: Option[Char], losId: Option[String])
  /** GetResult implicit for fetching GreatGlineAccountHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatGlineAccountHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[scala.math.BigDecimal]], e6: GR[Option[Char]]): GR[GreatGlineAccountHistoryRow] = GR{
    prs => import prs._
      GreatGlineAccountHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<[Char], <<[String], <<[String], <<[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[String], <<[String], <<?[Char], <<?[Char], <<?[String]))
  }
  /** Table description of table GREAT_GLINE_ACCOUNT_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineAccountHistory(_tableTag: Tag) extends profile.api.Table[GreatGlineAccountHistoryRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_ACCOUNT_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, activeFlag, contractId, businessPartnerId, bareId, limit, upperConsumptionPercentage, lineNumber, name, expiringFlag, fixedLimitFlag, losId) <> (GreatGlineAccountHistoryRow.tupled, GreatGlineAccountHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, Rep.Some(activeFlag), Rep.Some(contractId), Rep.Some(businessPartnerId), Rep.Some(bareId), limit, upperConsumptionPercentage, Rep.Some(lineNumber), Rep.Some(name), expiringFlag, fixedLimitFlag, losId).shaped.<>({r=>import r._; _1.map(_=> GreatGlineAccountHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8.get, _9.get, _10.get, _11.get, _12, _13, _14.get, _15.get, _16, _17, _18)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column ACTIVE_FLAG SqlType(CHAR) */
    val activeFlag: Rep[Char] = column[Char]("ACTIVE_FLAG")
    /** Database column CONTRACT_ID SqlType(VARCHAR2), Length(10,true) */
    val contractId: Rep[String] = column[String]("CONTRACT_ID", O.Length(10,varying=true))
    /** Database column BUSINESS_PARTNER_ID SqlType(VARCHAR2), Length(10,true) */
    val businessPartnerId: Rep[String] = column[String]("BUSINESS_PARTNER_ID", O.Length(10,varying=true))
    /** Database column BARE_ID SqlType(VARCHAR2), Length(10,true) */
    val bareId: Rep[String] = column[String]("BARE_ID", O.Length(10,varying=true))
    /** Database column LIMIT SqlType(NUMBER) */
    val limit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LIMIT")
    /** Database column UPPER_CONSUMPTION_PERCENTAGE SqlType(NUMBER) */
    val upperConsumptionPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_CONSUMPTION_PERCENTAGE")
    /** Database column LINE_NUMBER SqlType(VARCHAR2), Length(10,true) */
    val lineNumber: Rep[String] = column[String]("LINE_NUMBER", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(150,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(150,varying=true))
    /** Database column EXPIRING_FLAG SqlType(CHAR) */
    val expiringFlag: Rep[Option[Char]] = column[Option[Char]]("EXPIRING_FLAG")
    /** Database column FIXED_LIMIT_FLAG SqlType(CHAR) */
    val fixedLimitFlag: Rep[Option[Char]] = column[Option[Char]]("FIXED_LIMIT_FLAG")
    /** Database column LOS_ID SqlType(VARCHAR2), Length(10,true) */
    val losId: Rep[Option[String]] = column[Option[String]]("LOS_ID", O.Length(10,varying=true))

    /** Primary key of GreatGlineAccountHistory (database name GLAH_PK_OBJECTIDC) */
    val pk = primaryKey("GLAH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatGlineAccountHistory */
  lazy val GreatGlineAccountHistory = new TableQuery(tag => new GreatGlineAccountHistory(tag))

  /** Row type of table GreatGlineContract */
  type GreatGlineContractRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[String,HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Char,HCons[Char,HCons[Char,HCons[Char,HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatGlineContractRow providing default values if available in the database schema. */
  def GreatGlineContractRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], businessPartnerId: String, bareId: String, limit: Option[scala.math.BigDecimal], currency: Option[String], startDate: java.sql.Timestamp, endDate: java.sql.Timestamp, externalLimitFlag: Char, externalStartDateFlag: Char, externalEndDateFlag: Char, usageRestrictedFlag: Char, usageRestrictedReason: Option[String], reminderStartDate: Option[java.sql.Timestamp], reminderPeriod: Option[Char], currencyPeriodType: Option[Char], interestDayQuotient: Option[Char], commentary: Option[String], responsibleUsers: Option[String], upperConsumptionPercentage: Option[scala.math.BigDecimal], activeFlag: Option[Char], contractNumber: Option[scala.math.BigDecimal], name: Option[String], expiringFlag: Option[Char], fixedLimitFlag: Option[Char], conditionsCommentary: Option[String], contractType: Option[Char], tappApprovalId: Option[String], contractLang: Option[String], contractUnderlyingLaw: Option[String], contrBasedonSiemensStandard: Option[Char], coverageOfFacility: Option[String], additionalCoverageInfo: Option[String], commitmentFeePercentage: Option[scala.math.BigDecimal], onetimeSetupfeeAmount: Option[scala.math.BigDecimal], onetimeSetupfeeWkz: Option[String], onetimeSetupfeePercentage: Option[scala.math.BigDecimal], utilizationFeeAmount: Option[scala.math.BigDecimal], utilizationFeeWkz: Option[String], utilizationFeePercentage: Option[scala.math.BigDecimal], interestratePercentage: Option[scala.math.BigDecimal], referenceratePercentage: Option[scala.math.BigDecimal], creditspreadPercentage: Option[scala.math.BigDecimal], otherFees: Option[String], ratingtrgCl: Option[Char], quotRatingtrgCl: Option[String], changeOfControltrg: Option[Char], quotChangeOfControltrg: Option[String], crossdefaultTrgCl: Option[Char], quotCrossdefaulttrgCl: Option[String], materialAdverseChtrgCl: Option[Char], quotMaterialAdverseChtrgCl: Option[String], anyOtherRelTrgProv: Option[Char], quotOtherRelTrgCl: Option[String], resultOfTrgCls: Option[String], financialCovenant: Option[Char], quotFinancialCovenant: Option[String], resultOfFinancialCovenant: Option[String], informationCovenant: Option[Char], quotInformationCovenant: Option[String], resultOfInformationCovenant: Option[String], otherCovenant: Option[Char], quotOtherCovenant: Option[String], resultOfOtherCovenant: Option[String], contractContainsNoCovenants: Option[Char]): GreatGlineContractRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: businessPartnerId :: bareId :: limit :: currency :: startDate :: endDate :: externalLimitFlag :: externalStartDateFlag :: externalEndDateFlag :: usageRestrictedFlag :: usageRestrictedReason :: reminderStartDate :: reminderPeriod :: currencyPeriodType :: interestDayQuotient :: commentary :: responsibleUsers :: upperConsumptionPercentage :: activeFlag :: contractNumber :: name :: expiringFlag :: fixedLimitFlag :: conditionsCommentary :: contractType :: tappApprovalId :: contractLang :: contractUnderlyingLaw :: contrBasedonSiemensStandard :: coverageOfFacility :: additionalCoverageInfo :: commitmentFeePercentage :: onetimeSetupfeeAmount :: onetimeSetupfeeWkz :: onetimeSetupfeePercentage :: utilizationFeeAmount :: utilizationFeeWkz :: utilizationFeePercentage :: interestratePercentage :: referenceratePercentage :: creditspreadPercentage :: otherFees :: ratingtrgCl :: quotRatingtrgCl :: changeOfControltrg :: quotChangeOfControltrg :: crossdefaultTrgCl :: quotCrossdefaulttrgCl :: materialAdverseChtrgCl :: quotMaterialAdverseChtrgCl :: anyOtherRelTrgProv :: quotOtherRelTrgCl :: resultOfTrgCls :: financialCovenant :: quotFinancialCovenant :: resultOfFinancialCovenant :: informationCovenant :: quotInformationCovenant :: resultOfInformationCovenant :: otherCovenant :: quotOtherCovenant :: resultOfOtherCovenant :: contractContainsNoCovenants :: HNil
  }
  /** GetResult implicit for fetching GreatGlineContractRow objects using plain SQL queries */
  implicit def GetResultGreatGlineContractRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[java.sql.Timestamp], e5: GR[Char], e6: GR[Option[Char]]): GR[GreatGlineContractRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<[String] :: <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Char] :: <<[Char] :: <<[Char] :: <<[Char] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_GLINE_CONTRACT. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineContract(_tableTag: Tag) extends profile.api.Table[GreatGlineContractRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_CONTRACT") {
    def * = objectidc :: objectversionc :: lastuserc :: updatetimec :: businessPartnerId :: bareId :: limit :: currency :: startDate :: endDate :: externalLimitFlag :: externalStartDateFlag :: externalEndDateFlag :: usageRestrictedFlag :: usageRestrictedReason :: reminderStartDate :: reminderPeriod :: currencyPeriodType :: interestDayQuotient :: commentary :: responsibleUsers :: upperConsumptionPercentage :: activeFlag :: contractNumber :: name :: expiringFlag :: fixedLimitFlag :: conditionsCommentary :: contractType :: tappApprovalId :: contractLang :: contractUnderlyingLaw :: contrBasedonSiemensStandard :: coverageOfFacility :: additionalCoverageInfo :: commitmentFeePercentage :: onetimeSetupfeeAmount :: onetimeSetupfeeWkz :: onetimeSetupfeePercentage :: utilizationFeeAmount :: utilizationFeeWkz :: utilizationFeePercentage :: interestratePercentage :: referenceratePercentage :: creditspreadPercentage :: otherFees :: ratingtrgCl :: quotRatingtrgCl :: changeOfControltrg :: quotChangeOfControltrg :: crossdefaultTrgCl :: quotCrossdefaulttrgCl :: materialAdverseChtrgCl :: quotMaterialAdverseChtrgCl :: anyOtherRelTrgProv :: quotOtherRelTrgCl :: resultOfTrgCls :: financialCovenant :: quotFinancialCovenant :: resultOfFinancialCovenant :: informationCovenant :: quotInformationCovenant :: resultOfInformationCovenant :: otherCovenant :: quotOtherCovenant :: resultOfOtherCovenant :: contractContainsNoCovenants :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column BUSINESS_PARTNER_ID SqlType(VARCHAR2), Length(10,true) */
    val businessPartnerId: Rep[String] = column[String]("BUSINESS_PARTNER_ID", O.Length(10,varying=true))
    /** Database column BARE_ID SqlType(VARCHAR2), Length(10,true) */
    val bareId: Rep[String] = column[String]("BARE_ID", O.Length(10,varying=true))
    /** Database column LIMIT SqlType(NUMBER) */
    val limit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LIMIT")
    /** Database column CURRENCY SqlType(CHAR), Length(3,false) */
    val currency: Rep[Option[String]] = column[Option[String]]("CURRENCY", O.Length(3,varying=false))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("START_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("END_DATE")
    /** Database column EXTERNAL_LIMIT_FLAG SqlType(CHAR) */
    val externalLimitFlag: Rep[Char] = column[Char]("EXTERNAL_LIMIT_FLAG")
    /** Database column EXTERNAL_START_DATE_FLAG SqlType(CHAR) */
    val externalStartDateFlag: Rep[Char] = column[Char]("EXTERNAL_START_DATE_FLAG")
    /** Database column EXTERNAL_END_DATE_FLAG SqlType(CHAR) */
    val externalEndDateFlag: Rep[Char] = column[Char]("EXTERNAL_END_DATE_FLAG")
    /** Database column USAGE_RESTRICTED_FLAG SqlType(CHAR) */
    val usageRestrictedFlag: Rep[Char] = column[Char]("USAGE_RESTRICTED_FLAG")
    /** Database column USAGE_RESTRICTED_REASON SqlType(VARCHAR2), Length(200,true) */
    val usageRestrictedReason: Rep[Option[String]] = column[Option[String]]("USAGE_RESTRICTED_REASON", O.Length(200,varying=true))
    /** Database column REMINDER_START_DATE SqlType(DATE) */
    val reminderStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("REMINDER_START_DATE")
    /** Database column REMINDER_PERIOD SqlType(VARCHAR2) */
    val reminderPeriod: Rep[Option[Char]] = column[Option[Char]]("REMINDER_PERIOD")
    /** Database column CURRENCY_PERIOD_TYPE SqlType(CHAR) */
    val currencyPeriodType: Rep[Option[Char]] = column[Option[Char]]("CURRENCY_PERIOD_TYPE")
    /** Database column INTEREST_DAY_QUOTIENT SqlType(CHAR) */
    val interestDayQuotient: Rep[Option[Char]] = column[Option[Char]]("INTEREST_DAY_QUOTIENT")
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(1024,varying=true))
    /** Database column RESPONSIBLE_USERS SqlType(VARCHAR2), Length(200,true) */
    val responsibleUsers: Rep[Option[String]] = column[Option[String]]("RESPONSIBLE_USERS", O.Length(200,varying=true))
    /** Database column UPPER_CONSUMPTION_PERCENTAGE SqlType(NUMBER) */
    val upperConsumptionPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_CONSUMPTION_PERCENTAGE")
    /** Database column ACTIVE_FLAG SqlType(CHAR) */
    val activeFlag: Rep[Option[Char]] = column[Option[Char]]("ACTIVE_FLAG")
    /** Database column CONTRACT_NUMBER SqlType(NUMBER) */
    val contractNumber: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CONTRACT_NUMBER")
    /** Database column NAME SqlType(VARCHAR2), Length(150,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(150,varying=true))
    /** Database column EXPIRING_FLAG SqlType(CHAR) */
    val expiringFlag: Rep[Option[Char]] = column[Option[Char]]("EXPIRING_FLAG")
    /** Database column FIXED_LIMIT_FLAG SqlType(CHAR) */
    val fixedLimitFlag: Rep[Option[Char]] = column[Option[Char]]("FIXED_LIMIT_FLAG")
    /** Database column CONDITIONS_COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
    val conditionsCommentary: Rep[Option[String]] = column[Option[String]]("CONDITIONS_COMMENTARY", O.Length(1024,varying=true))
    /** Database column CONTRACT_TYPE SqlType(VARCHAR2) */
    val contractType: Rep[Option[Char]] = column[Option[Char]]("CONTRACT_TYPE")
    /** Database column TAPP_APPROVAL_ID SqlType(VARCHAR2), Length(10,true) */
    val tappApprovalId: Rep[Option[String]] = column[Option[String]]("TAPP_APPROVAL_ID", O.Length(10,varying=true))
    /** Database column CONTRACT_LANG SqlType(VARCHAR2), Length(2,true) */
    val contractLang: Rep[Option[String]] = column[Option[String]]("CONTRACT_LANG", O.Length(2,varying=true))
    /** Database column CONTRACT_UNDERLYING_LAW SqlType(VARCHAR2), Length(3,true) */
    val contractUnderlyingLaw: Rep[Option[String]] = column[Option[String]]("CONTRACT_UNDERLYING_LAW", O.Length(3,varying=true))
    /** Database column CONTR_BASEDON_SIEMENS_STANDARD SqlType(VARCHAR2) */
    val contrBasedonSiemensStandard: Rep[Option[Char]] = column[Option[Char]]("CONTR_BASEDON_SIEMENS_STANDARD")
    /** Database column COVERAGE_OF_FACILITY SqlType(VARCHAR2), Length(2,true) */
    val coverageOfFacility: Rep[Option[String]] = column[Option[String]]("COVERAGE_OF_FACILITY", O.Length(2,varying=true))
    /** Database column ADDITIONAL_COVERAGE_INFO SqlType(VARCHAR2), Length(50,true) */
    val additionalCoverageInfo: Rep[Option[String]] = column[Option[String]]("ADDITIONAL_COVERAGE_INFO", O.Length(50,varying=true))
    /** Database column COMMITMENT_FEE_PERCENTAGE SqlType(NUMBER) */
    val commitmentFeePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COMMITMENT_FEE_PERCENTAGE")
    /** Database column ONETIME_SETUPFEE_AMOUNT SqlType(NUMBER) */
    val onetimeSetupfeeAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ONETIME_SETUPFEE_AMOUNT")
    /** Database column ONETIME_SETUPFEE_WKZ SqlType(CHAR), Length(3,false) */
    val onetimeSetupfeeWkz: Rep[Option[String]] = column[Option[String]]("ONETIME_SETUPFEE_WKZ", O.Length(3,varying=false))
    /** Database column ONETIME_SETUPFEE_PERCENTAGE SqlType(NUMBER) */
    val onetimeSetupfeePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ONETIME_SETUPFEE_PERCENTAGE")
    /** Database column UTILIZATION_FEE_AMOUNT SqlType(NUMBER) */
    val utilizationFeeAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UTILIZATION_FEE_AMOUNT")
    /** Database column UTILIZATION_FEE_WKZ SqlType(CHAR), Length(3,false) */
    val utilizationFeeWkz: Rep[Option[String]] = column[Option[String]]("UTILIZATION_FEE_WKZ", O.Length(3,varying=false))
    /** Database column UTILIZATION_FEE_PERCENTAGE SqlType(NUMBER) */
    val utilizationFeePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UTILIZATION_FEE_PERCENTAGE")
    /** Database column INTERESTRATE_PERCENTAGE SqlType(NUMBER) */
    val interestratePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("INTERESTRATE_PERCENTAGE")
    /** Database column REFERENCERATE_PERCENTAGE SqlType(NUMBER) */
    val referenceratePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("REFERENCERATE_PERCENTAGE")
    /** Database column CREDITSPREAD_PERCENTAGE SqlType(NUMBER) */
    val creditspreadPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREDITSPREAD_PERCENTAGE")
    /** Database column OTHER_FEES SqlType(VARCHAR2), Length(50,true) */
    val otherFees: Rep[Option[String]] = column[Option[String]]("OTHER_FEES", O.Length(50,varying=true))
    /** Database column RATINGTRG_CL SqlType(VARCHAR2) */
    val ratingtrgCl: Rep[Option[Char]] = column[Option[Char]]("RATINGTRG_CL")
    /** Database column QUOT_RATINGTRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotRatingtrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_RATINGTRG_CL", O.Length(1024,varying=true))
    /** Database column CHANGE_OF_CONTROLTRG SqlType(VARCHAR2) */
    val changeOfControltrg: Rep[Option[Char]] = column[Option[Char]]("CHANGE_OF_CONTROLTRG")
    /** Database column QUOT_CHANGE_OF_CONTROLTRG SqlType(VARCHAR2), Length(1024,true) */
    val quotChangeOfControltrg: Rep[Option[String]] = column[Option[String]]("QUOT_CHANGE_OF_CONTROLTRG", O.Length(1024,varying=true))
    /** Database column CROSSDEFAULT_TRG_CL SqlType(VARCHAR2) */
    val crossdefaultTrgCl: Rep[Option[Char]] = column[Option[Char]]("CROSSDEFAULT_TRG_CL")
    /** Database column QUOT_CROSSDEFAULTTRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotCrossdefaulttrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_CROSSDEFAULTTRG_CL", O.Length(1024,varying=true))
    /** Database column MATERIAL_ADVERSE_CHTRG_CL SqlType(VARCHAR2) */
    val materialAdverseChtrgCl: Rep[Option[Char]] = column[Option[Char]]("MATERIAL_ADVERSE_CHTRG_CL")
    /** Database column QUOT_MATERIAL_ADVERSE_CHTRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotMaterialAdverseChtrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_MATERIAL_ADVERSE_CHTRG_CL", O.Length(1024,varying=true))
    /** Database column ANY_OTHER_REL_TRG_PROV SqlType(VARCHAR2) */
    val anyOtherRelTrgProv: Rep[Option[Char]] = column[Option[Char]]("ANY_OTHER_REL_TRG_PROV")
    /** Database column QUOT_OTHER_REL_TRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotOtherRelTrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_OTHER_REL_TRG_CL", O.Length(1024,varying=true))
    /** Database column RESULT_OF_TRG_CLS SqlType(VARCHAR2), Length(1024,true) */
    val resultOfTrgCls: Rep[Option[String]] = column[Option[String]]("RESULT_OF_TRG_CLS", O.Length(1024,varying=true))
    /** Database column FINANCIAL_COVENANT SqlType(VARCHAR2) */
    val financialCovenant: Rep[Option[Char]] = column[Option[Char]]("FINANCIAL_COVENANT")
    /** Database column QUOT_FINANCIAL_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val quotFinancialCovenant: Rep[Option[String]] = column[Option[String]]("QUOT_FINANCIAL_COVENANT", O.Length(1024,varying=true))
    /** Database column RESULT_OF_FINANCIAL_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val resultOfFinancialCovenant: Rep[Option[String]] = column[Option[String]]("RESULT_OF_FINANCIAL_COVENANT", O.Length(1024,varying=true))
    /** Database column INFORMATION_COVENANT SqlType(VARCHAR2) */
    val informationCovenant: Rep[Option[Char]] = column[Option[Char]]("INFORMATION_COVENANT")
    /** Database column QUOT_INFORMATION_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val quotInformationCovenant: Rep[Option[String]] = column[Option[String]]("QUOT_INFORMATION_COVENANT", O.Length(1024,varying=true))
    /** Database column RESULT_OF_INFORMATION_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val resultOfInformationCovenant: Rep[Option[String]] = column[Option[String]]("RESULT_OF_INFORMATION_COVENANT", O.Length(1024,varying=true))
    /** Database column OTHER_COVENANT SqlType(VARCHAR2) */
    val otherCovenant: Rep[Option[Char]] = column[Option[Char]]("OTHER_COVENANT")
    /** Database column QUOT_OTHER_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val quotOtherCovenant: Rep[Option[String]] = column[Option[String]]("QUOT_OTHER_COVENANT", O.Length(1024,varying=true))
    /** Database column RESULT_OF_OTHER_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val resultOfOtherCovenant: Rep[Option[String]] = column[Option[String]]("RESULT_OF_OTHER_COVENANT", O.Length(1024,varying=true))
    /** Database column CONTRACT_CONTAINS_NO_COVENANTS SqlType(VARCHAR2) */
    val contractContainsNoCovenants: Rep[Option[Char]] = column[Option[Char]]("CONTRACT_CONTAINS_NO_COVENANTS")

    /** Foreign key referencing GreatBareDependants (database name GLC_FK_BARE_ID) */
    lazy val greatBareDependantsFk = foreignKey("GLC_FK_BARE_ID", bareId :: HNil, GreatBareDependants)(r => r.objectidc :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBusinessPartner (database name GLC_FK_BUSINESS_PARTNER_ID) */
    lazy val greatBusinessPartnerFk = foreignKey("GLC_FK_BUSINESS_PARTNER_ID", businessPartnerId :: HNil, GreatBusinessPartner)(r => r.objectidc :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name GLC_FK_CURRENCY) */
    lazy val greatCurrencyFk = foreignKey("GLC_FK_CURRENCY", currency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGlineContract */
  lazy val GreatGlineContract = new TableQuery(tag => new GreatGlineContract(tag))

  /** Row type of table GreatGlineContractHistory */
  type GreatGlineContractHistoryRow = HCons[String,HCons[scala.math.BigDecimal,HCons[Option[String],HCons[String,HCons[String,HCons[Char,HCons[Option[java.sql.Timestamp],HCons[String,HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Char,HCons[Char,HCons[Char,HCons[Char,HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatGlineContractHistoryRow providing default values if available in the database schema. */
  def GreatGlineContractHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], businessPartnerId: String, bareId: String, limit: Option[scala.math.BigDecimal], currency: Option[String], startDate: java.sql.Timestamp, endDate: java.sql.Timestamp, externalLimitFlag: Char, externalStartDateFlag: Char, externalEndDateFlag: Char, usageRestrictedFlag: Char, usageRestrictedReason: Option[String], reminderStartDate: Option[java.sql.Timestamp], reminderPeriod: Option[Char], currencyPeriodType: Option[Char], interestDayQuotient: Option[Char], commentary: Option[String], responsibleUsers: Option[String], upperConsumptionPercentage: Option[scala.math.BigDecimal], activeFlag: Option[Char], contractNumber: Option[String], name: Option[String], expiringFlag: Option[Char], fixedLimitFlag: Option[Char], conditionsCommentary: Option[String], contractType: Option[Char], tappApprovalId: Option[String], contractLang: Option[String], contractUnderlyingLaw: Option[String], contrBasedonSiemensStandard: Option[Char], coverageOfFacility: Option[String], additionalCoverageInfo: Option[String], commitmentFeePercentage: Option[scala.math.BigDecimal], onetimeSetupfeeAmount: Option[scala.math.BigDecimal], onetimeSetupfeeWkz: Option[String], onetimeSetupfeePercentage: Option[scala.math.BigDecimal], utilizationFeeAmount: Option[scala.math.BigDecimal], utilizationFeeWkz: Option[String], utilizationFeePercentage: Option[scala.math.BigDecimal], interestratePercentage: Option[scala.math.BigDecimal], referenceratePercentage: Option[scala.math.BigDecimal], creditspreadPercentage: Option[scala.math.BigDecimal], otherFees: Option[String], ratingtrgCl: Option[Char], quotRatingtrgCl: Option[String], changeOfControltrg: Option[Char], quotChangeOfControltrg: Option[String], crossdefaultTrgCl: Option[Char], quotCrossdefaulttrgCl: Option[String], materialAdverseChtrgCl: Option[Char], quotMaterialAdverseChtrgCl: Option[String], anyOtherRelTrgProv: Option[Char], quotOtherRelTrgCl: Option[String], resultOfTrgCls: Option[String], financialCovenant: Option[Char], quotFinancialCovenant: Option[String], resultOfFinancialCovenant: Option[String], informationCovenant: Option[Char], quotInformationCovenant: Option[String], resultOfInformationCovenant: Option[String], otherCovenant: Option[Char], quotOtherCovenant: Option[String], resultOfOtherCovenant: Option[String], contractContainsNoCovenants: Option[Char]): GreatGlineContractHistoryRow = {
    objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: businessPartnerId :: bareId :: limit :: currency :: startDate :: endDate :: externalLimitFlag :: externalStartDateFlag :: externalEndDateFlag :: usageRestrictedFlag :: usageRestrictedReason :: reminderStartDate :: reminderPeriod :: currencyPeriodType :: interestDayQuotient :: commentary :: responsibleUsers :: upperConsumptionPercentage :: activeFlag :: contractNumber :: name :: expiringFlag :: fixedLimitFlag :: conditionsCommentary :: contractType :: tappApprovalId :: contractLang :: contractUnderlyingLaw :: contrBasedonSiemensStandard :: coverageOfFacility :: additionalCoverageInfo :: commitmentFeePercentage :: onetimeSetupfeeAmount :: onetimeSetupfeeWkz :: onetimeSetupfeePercentage :: utilizationFeeAmount :: utilizationFeeWkz :: utilizationFeePercentage :: interestratePercentage :: referenceratePercentage :: creditspreadPercentage :: otherFees :: ratingtrgCl :: quotRatingtrgCl :: changeOfControltrg :: quotChangeOfControltrg :: crossdefaultTrgCl :: quotCrossdefaulttrgCl :: materialAdverseChtrgCl :: quotMaterialAdverseChtrgCl :: anyOtherRelTrgProv :: quotOtherRelTrgCl :: resultOfTrgCls :: financialCovenant :: quotFinancialCovenant :: resultOfFinancialCovenant :: informationCovenant :: quotInformationCovenant :: resultOfInformationCovenant :: otherCovenant :: quotOtherCovenant :: resultOfOtherCovenant :: contractContainsNoCovenants :: HNil
  }
  /** GetResult implicit for fetching GreatGlineContractHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatGlineContractHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[scala.math.BigDecimal]], e6: GR[java.sql.Timestamp], e7: GR[Option[Char]]): GR[GreatGlineContractHistoryRow] = GR{
    prs => import prs._
      <<[String] :: <<[scala.math.BigDecimal] :: <<?[String] :: <<[String] :: <<[String] :: <<[Char] :: <<?[java.sql.Timestamp] :: <<[String] :: <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Char] :: <<[Char] :: <<[Char] :: <<[Char] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_GLINE_CONTRACT_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineContractHistory(_tableTag: Tag) extends profile.api.Table[GreatGlineContractHistoryRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_CONTRACT_HISTORY") {
    def * = objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: businessPartnerId :: bareId :: limit :: currency :: startDate :: endDate :: externalLimitFlag :: externalStartDateFlag :: externalEndDateFlag :: usageRestrictedFlag :: usageRestrictedReason :: reminderStartDate :: reminderPeriod :: currencyPeriodType :: interestDayQuotient :: commentary :: responsibleUsers :: upperConsumptionPercentage :: activeFlag :: contractNumber :: name :: expiringFlag :: fixedLimitFlag :: conditionsCommentary :: contractType :: tappApprovalId :: contractLang :: contractUnderlyingLaw :: contrBasedonSiemensStandard :: coverageOfFacility :: additionalCoverageInfo :: commitmentFeePercentage :: onetimeSetupfeeAmount :: onetimeSetupfeeWkz :: onetimeSetupfeePercentage :: utilizationFeeAmount :: utilizationFeeWkz :: utilizationFeePercentage :: interestratePercentage :: referenceratePercentage :: creditspreadPercentage :: otherFees :: ratingtrgCl :: quotRatingtrgCl :: changeOfControltrg :: quotChangeOfControltrg :: crossdefaultTrgCl :: quotCrossdefaulttrgCl :: materialAdverseChtrgCl :: quotMaterialAdverseChtrgCl :: anyOtherRelTrgProv :: quotOtherRelTrgCl :: resultOfTrgCls :: financialCovenant :: quotFinancialCovenant :: resultOfFinancialCovenant :: informationCovenant :: quotInformationCovenant :: resultOfInformationCovenant :: otherCovenant :: quotOtherCovenant :: resultOfOtherCovenant :: contractContainsNoCovenants :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column ACTIVEC SqlType(CHAR) */
    val activec: Rep[Char] = column[Char]("ACTIVEC")
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column BUSINESS_PARTNER_ID SqlType(VARCHAR2), Length(10,true) */
    val businessPartnerId: Rep[String] = column[String]("BUSINESS_PARTNER_ID", O.Length(10,varying=true))
    /** Database column BARE_ID SqlType(VARCHAR2), Length(10,true) */
    val bareId: Rep[String] = column[String]("BARE_ID", O.Length(10,varying=true))
    /** Database column LIMIT SqlType(NUMBER) */
    val limit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LIMIT")
    /** Database column CURRENCY SqlType(CHAR), Length(3,false) */
    val currency: Rep[Option[String]] = column[Option[String]]("CURRENCY", O.Length(3,varying=false))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("START_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("END_DATE")
    /** Database column EXTERNAL_LIMIT_FLAG SqlType(CHAR) */
    val externalLimitFlag: Rep[Char] = column[Char]("EXTERNAL_LIMIT_FLAG")
    /** Database column EXTERNAL_START_DATE_FLAG SqlType(CHAR) */
    val externalStartDateFlag: Rep[Char] = column[Char]("EXTERNAL_START_DATE_FLAG")
    /** Database column EXTERNAL_END_DATE_FLAG SqlType(CHAR) */
    val externalEndDateFlag: Rep[Char] = column[Char]("EXTERNAL_END_DATE_FLAG")
    /** Database column USAGE_RESTRICTED_FLAG SqlType(CHAR) */
    val usageRestrictedFlag: Rep[Char] = column[Char]("USAGE_RESTRICTED_FLAG")
    /** Database column USAGE_RESTRICTED_REASON SqlType(VARCHAR2), Length(200,true) */
    val usageRestrictedReason: Rep[Option[String]] = column[Option[String]]("USAGE_RESTRICTED_REASON", O.Length(200,varying=true))
    /** Database column REMINDER_START_DATE SqlType(DATE) */
    val reminderStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("REMINDER_START_DATE")
    /** Database column REMINDER_PERIOD SqlType(VARCHAR2) */
    val reminderPeriod: Rep[Option[Char]] = column[Option[Char]]("REMINDER_PERIOD")
    /** Database column CURRENCY_PERIOD_TYPE SqlType(CHAR) */
    val currencyPeriodType: Rep[Option[Char]] = column[Option[Char]]("CURRENCY_PERIOD_TYPE")
    /** Database column INTEREST_DAY_QUOTIENT SqlType(CHAR) */
    val interestDayQuotient: Rep[Option[Char]] = column[Option[Char]]("INTEREST_DAY_QUOTIENT")
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(1024,varying=true))
    /** Database column RESPONSIBLE_USERS SqlType(VARCHAR2), Length(200,true) */
    val responsibleUsers: Rep[Option[String]] = column[Option[String]]("RESPONSIBLE_USERS", O.Length(200,varying=true))
    /** Database column UPPER_CONSUMPTION_PERCENTAGE SqlType(NUMBER) */
    val upperConsumptionPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_CONSUMPTION_PERCENTAGE")
    /** Database column ACTIVE_FLAG SqlType(CHAR) */
    val activeFlag: Rep[Option[Char]] = column[Option[Char]]("ACTIVE_FLAG")
    /** Database column CONTRACT_NUMBER SqlType(VARCHAR2), Length(10,true) */
    val contractNumber: Rep[Option[String]] = column[Option[String]]("CONTRACT_NUMBER", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(150,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(150,varying=true))
    /** Database column EXPIRING_FLAG SqlType(CHAR) */
    val expiringFlag: Rep[Option[Char]] = column[Option[Char]]("EXPIRING_FLAG")
    /** Database column FIXED_LIMIT_FLAG SqlType(CHAR) */
    val fixedLimitFlag: Rep[Option[Char]] = column[Option[Char]]("FIXED_LIMIT_FLAG")
    /** Database column CONDITIONS_COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
    val conditionsCommentary: Rep[Option[String]] = column[Option[String]]("CONDITIONS_COMMENTARY", O.Length(1024,varying=true))
    /** Database column CONTRACT_TYPE SqlType(VARCHAR2) */
    val contractType: Rep[Option[Char]] = column[Option[Char]]("CONTRACT_TYPE")
    /** Database column TAPP_APPROVAL_ID SqlType(VARCHAR2), Length(10,true) */
    val tappApprovalId: Rep[Option[String]] = column[Option[String]]("TAPP_APPROVAL_ID", O.Length(10,varying=true))
    /** Database column CONTRACT_LANG SqlType(VARCHAR2), Length(2,true) */
    val contractLang: Rep[Option[String]] = column[Option[String]]("CONTRACT_LANG", O.Length(2,varying=true))
    /** Database column CONTRACT_UNDERLYING_LAW SqlType(VARCHAR2), Length(3,true) */
    val contractUnderlyingLaw: Rep[Option[String]] = column[Option[String]]("CONTRACT_UNDERLYING_LAW", O.Length(3,varying=true))
    /** Database column CONTR_BASEDON_SIEMENS_STANDARD SqlType(VARCHAR2) */
    val contrBasedonSiemensStandard: Rep[Option[Char]] = column[Option[Char]]("CONTR_BASEDON_SIEMENS_STANDARD")
    /** Database column COVERAGE_OF_FACILITY SqlType(VARCHAR2), Length(2,true) */
    val coverageOfFacility: Rep[Option[String]] = column[Option[String]]("COVERAGE_OF_FACILITY", O.Length(2,varying=true))
    /** Database column ADDITIONAL_COVERAGE_INFO SqlType(VARCHAR2), Length(50,true) */
    val additionalCoverageInfo: Rep[Option[String]] = column[Option[String]]("ADDITIONAL_COVERAGE_INFO", O.Length(50,varying=true))
    /** Database column COMMITMENT_FEE_PERCENTAGE SqlType(NUMBER) */
    val commitmentFeePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COMMITMENT_FEE_PERCENTAGE")
    /** Database column ONETIME_SETUPFEE_AMOUNT SqlType(NUMBER) */
    val onetimeSetupfeeAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ONETIME_SETUPFEE_AMOUNT")
    /** Database column ONETIME_SETUPFEE_WKZ SqlType(CHAR), Length(3,false) */
    val onetimeSetupfeeWkz: Rep[Option[String]] = column[Option[String]]("ONETIME_SETUPFEE_WKZ", O.Length(3,varying=false))
    /** Database column ONETIME_SETUPFEE_PERCENTAGE SqlType(NUMBER) */
    val onetimeSetupfeePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ONETIME_SETUPFEE_PERCENTAGE")
    /** Database column UTILIZATION_FEE_AMOUNT SqlType(NUMBER) */
    val utilizationFeeAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UTILIZATION_FEE_AMOUNT")
    /** Database column UTILIZATION_FEE_WKZ SqlType(CHAR), Length(3,false) */
    val utilizationFeeWkz: Rep[Option[String]] = column[Option[String]]("UTILIZATION_FEE_WKZ", O.Length(3,varying=false))
    /** Database column UTILIZATION_FEE_PERCENTAGE SqlType(NUMBER) */
    val utilizationFeePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UTILIZATION_FEE_PERCENTAGE")
    /** Database column INTERESTRATE_PERCENTAGE SqlType(NUMBER) */
    val interestratePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("INTERESTRATE_PERCENTAGE")
    /** Database column REFERENCERATE_PERCENTAGE SqlType(NUMBER) */
    val referenceratePercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("REFERENCERATE_PERCENTAGE")
    /** Database column CREDITSPREAD_PERCENTAGE SqlType(NUMBER) */
    val creditspreadPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREDITSPREAD_PERCENTAGE")
    /** Database column OTHER_FEES SqlType(VARCHAR2), Length(50,true) */
    val otherFees: Rep[Option[String]] = column[Option[String]]("OTHER_FEES", O.Length(50,varying=true))
    /** Database column RATINGTRG_CL SqlType(VARCHAR2) */
    val ratingtrgCl: Rep[Option[Char]] = column[Option[Char]]("RATINGTRG_CL")
    /** Database column QUOT_RATINGTRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotRatingtrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_RATINGTRG_CL", O.Length(1024,varying=true))
    /** Database column CHANGE_OF_CONTROLTRG SqlType(VARCHAR2) */
    val changeOfControltrg: Rep[Option[Char]] = column[Option[Char]]("CHANGE_OF_CONTROLTRG")
    /** Database column QUOT_CHANGE_OF_CONTROLTRG SqlType(VARCHAR2), Length(1024,true) */
    val quotChangeOfControltrg: Rep[Option[String]] = column[Option[String]]("QUOT_CHANGE_OF_CONTROLTRG", O.Length(1024,varying=true))
    /** Database column CROSSDEFAULT_TRG_CL SqlType(VARCHAR2) */
    val crossdefaultTrgCl: Rep[Option[Char]] = column[Option[Char]]("CROSSDEFAULT_TRG_CL")
    /** Database column QUOT_CROSSDEFAULTTRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotCrossdefaulttrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_CROSSDEFAULTTRG_CL", O.Length(1024,varying=true))
    /** Database column MATERIAL_ADVERSE_CHTRG_CL SqlType(VARCHAR2) */
    val materialAdverseChtrgCl: Rep[Option[Char]] = column[Option[Char]]("MATERIAL_ADVERSE_CHTRG_CL")
    /** Database column QUOT_MATERIAL_ADVERSE_CHTRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotMaterialAdverseChtrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_MATERIAL_ADVERSE_CHTRG_CL", O.Length(1024,varying=true))
    /** Database column ANY_OTHER_REL_TRG_PROV SqlType(VARCHAR2) */
    val anyOtherRelTrgProv: Rep[Option[Char]] = column[Option[Char]]("ANY_OTHER_REL_TRG_PROV")
    /** Database column QUOT_OTHER_REL_TRG_CL SqlType(VARCHAR2), Length(1024,true) */
    val quotOtherRelTrgCl: Rep[Option[String]] = column[Option[String]]("QUOT_OTHER_REL_TRG_CL", O.Length(1024,varying=true))
    /** Database column RESULT_OF_TRG_CLS SqlType(VARCHAR2), Length(1024,true) */
    val resultOfTrgCls: Rep[Option[String]] = column[Option[String]]("RESULT_OF_TRG_CLS", O.Length(1024,varying=true))
    /** Database column FINANCIAL_COVENANT SqlType(VARCHAR2) */
    val financialCovenant: Rep[Option[Char]] = column[Option[Char]]("FINANCIAL_COVENANT")
    /** Database column QUOT_FINANCIAL_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val quotFinancialCovenant: Rep[Option[String]] = column[Option[String]]("QUOT_FINANCIAL_COVENANT", O.Length(1024,varying=true))
    /** Database column RESULT_OF_FINANCIAL_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val resultOfFinancialCovenant: Rep[Option[String]] = column[Option[String]]("RESULT_OF_FINANCIAL_COVENANT", O.Length(1024,varying=true))
    /** Database column INFORMATION_COVENANT SqlType(VARCHAR2) */
    val informationCovenant: Rep[Option[Char]] = column[Option[Char]]("INFORMATION_COVENANT")
    /** Database column QUOT_INFORMATION_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val quotInformationCovenant: Rep[Option[String]] = column[Option[String]]("QUOT_INFORMATION_COVENANT", O.Length(1024,varying=true))
    /** Database column RESULT_OF_INFORMATION_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val resultOfInformationCovenant: Rep[Option[String]] = column[Option[String]]("RESULT_OF_INFORMATION_COVENANT", O.Length(1024,varying=true))
    /** Database column OTHER_COVENANT SqlType(VARCHAR2) */
    val otherCovenant: Rep[Option[Char]] = column[Option[Char]]("OTHER_COVENANT")
    /** Database column QUOT_OTHER_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val quotOtherCovenant: Rep[Option[String]] = column[Option[String]]("QUOT_OTHER_COVENANT", O.Length(1024,varying=true))
    /** Database column RESULT_OF_OTHER_COVENANT SqlType(VARCHAR2), Length(1024,true) */
    val resultOfOtherCovenant: Rep[Option[String]] = column[Option[String]]("RESULT_OF_OTHER_COVENANT", O.Length(1024,varying=true))
    /** Database column CONTRACT_CONTAINS_NO_COVENANTS SqlType(VARCHAR2) */
    val contractContainsNoCovenants: Rep[Option[Char]] = column[Option[Char]]("CONTRACT_CONTAINS_NO_COVENANTS")

    /** Primary key of GreatGlineContractHistory (database name GLCH_PK_OBJECTIDC) */
    val pk = primaryKey("GLCH_PK_OBJECTIDC", objectidc :: objectversionc :: HNil)
  }
  /** Collection-like TableQuery object for table GreatGlineContractHistory */
  lazy val GreatGlineContractHistory = new TableQuery(tag => new GreatGlineContractHistory(tag))

  /** Entity class storing rows of table GreatGlineReservation
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param parentId Database column PARENT_ID SqlType(VARCHAR2), Length(10,true)
    *  @param parentVersion Database column PARENT_VERSION SqlType(NUMBER)
    *  @param reservedAmount Database column RESERVED_AMOUNT SqlType(NUMBER)
    *  @param reservedAmountCurrency Database column RESERVED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false)
    *  @param project Database column PROJECT SqlType(VARCHAR2), Length(50,true)
    *  @param ownerId Database column OWNER_ID SqlType(VARCHAR2), Length(10,true)
    *  @param reservationTimestamp Database column RESERVATION_TIMESTAMP SqlType(TIMESTAMP(6))
    *  @param expiryDate Database column EXPIRY_DATE SqlType(DATE)
    *  @param reminderStartDate Database column REMINDER_START_DATE SqlType(DATE)
    *  @param reminderPeriodType Database column REMINDER_PERIOD_TYPE SqlType(CHAR)
    *  @param guaranteeEndDate Database column GUARANTEE_END_DATE SqlType(DATE)
    *  @param guaranteePartnerOrgId Database column GUARANTEE_PARTNER_ORG_ID SqlType(VARCHAR2), Length(10,true)
    *  @param guaranteeRespAppId Database column GUARANTEE_RESP_APP_ID SqlType(VARCHAR2), Length(10,true)
    *  @param guaranteeRespAppName Database column GUARANTEE_RESP_APP_NAME SqlType(VARCHAR2), Length(82,true)
    *  @param guaranteeId Database column GUARANTEE_ID SqlType(VARCHAR2), Length(10,true)
    *  @param reservationType Database column RESERVATION_TYPE SqlType(CHAR)
    *  @param firstEntryFlag Database column FIRST_ENTRY_FLAG SqlType(CHAR)
    *  @param conditions Database column CONDITIONS SqlType(VARCHAR2), Length(1024,true)
    *  @param commentary Database column COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
  case class GreatGlineReservationRow(objectidc: String, parentId: Option[String], parentVersion: Option[scala.math.BigDecimal], reservedAmount: Option[scala.math.BigDecimal], reservedAmountCurrency: Option[String], project: Option[String], ownerId: Option[String], reservationTimestamp: Option[java.sql.Timestamp], expiryDate: Option[java.sql.Timestamp], reminderStartDate: Option[java.sql.Timestamp], reminderPeriodType: Option[Char], guaranteeEndDate: Option[java.sql.Timestamp], guaranteePartnerOrgId: Option[String], guaranteeRespAppId: Option[String], guaranteeRespAppName: Option[String], guaranteeId: Option[String], reservationType: Option[Char], firstEntryFlag: Option[Char], conditions: Option[String], commentary: Option[String])
  /** GetResult implicit for fetching GreatGlineReservationRow objects using plain SQL queries */
  implicit def GetResultGreatGlineReservationRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatGlineReservationRow] = GR{
    prs => import prs._
      GreatGlineReservationRow.tupled((<<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char], <<?[Char], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_GLINE_RESERVATION. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineReservation(_tableTag: Tag) extends profile.api.Table[GreatGlineReservationRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_RESERVATION") {
    def * = (objectidc, parentId, parentVersion, reservedAmount, reservedAmountCurrency, project, ownerId, reservationTimestamp, expiryDate, reminderStartDate, reminderPeriodType, guaranteeEndDate, guaranteePartnerOrgId, guaranteeRespAppId, guaranteeRespAppName, guaranteeId, reservationType, firstEntryFlag, conditions, commentary) <> (GreatGlineReservationRow.tupled, GreatGlineReservationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), parentId, parentVersion, reservedAmount, reservedAmountCurrency, project, ownerId, reservationTimestamp, expiryDate, reminderStartDate, reminderPeriodType, guaranteeEndDate, guaranteePartnerOrgId, guaranteeRespAppId, guaranteeRespAppName, guaranteeId, reservationType, firstEntryFlag, conditions, commentary).shaped.<>({r=>import r._; _1.map(_=> GreatGlineReservationRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column PARENT_ID SqlType(VARCHAR2), Length(10,true) */
    val parentId: Rep[Option[String]] = column[Option[String]]("PARENT_ID", O.Length(10,varying=true))
    /** Database column PARENT_VERSION SqlType(NUMBER) */
    val parentVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PARENT_VERSION")
    /** Database column RESERVED_AMOUNT SqlType(NUMBER) */
    val reservedAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RESERVED_AMOUNT")
    /** Database column RESERVED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val reservedAmountCurrency: Rep[Option[String]] = column[Option[String]]("RESERVED_AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column PROJECT SqlType(VARCHAR2), Length(50,true) */
    val project: Rep[Option[String]] = column[Option[String]]("PROJECT", O.Length(50,varying=true))
    /** Database column OWNER_ID SqlType(VARCHAR2), Length(10,true) */
    val ownerId: Rep[Option[String]] = column[Option[String]]("OWNER_ID", O.Length(10,varying=true))
    /** Database column RESERVATION_TIMESTAMP SqlType(TIMESTAMP(6)) */
    val reservationTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RESERVATION_TIMESTAMP")
    /** Database column EXPIRY_DATE SqlType(DATE) */
    val expiryDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXPIRY_DATE")
    /** Database column REMINDER_START_DATE SqlType(DATE) */
    val reminderStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("REMINDER_START_DATE")
    /** Database column REMINDER_PERIOD_TYPE SqlType(CHAR) */
    val reminderPeriodType: Rep[Option[Char]] = column[Option[Char]]("REMINDER_PERIOD_TYPE")
    /** Database column GUARANTEE_END_DATE SqlType(DATE) */
    val guaranteeEndDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("GUARANTEE_END_DATE")
    /** Database column GUARANTEE_PARTNER_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteePartnerOrgId: Rep[Option[String]] = column[Option[String]]("GUARANTEE_PARTNER_ORG_ID", O.Length(10,varying=true))
    /** Database column GUARANTEE_RESP_APP_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteeRespAppId: Rep[Option[String]] = column[Option[String]]("GUARANTEE_RESP_APP_ID", O.Length(10,varying=true))
    /** Database column GUARANTEE_RESP_APP_NAME SqlType(VARCHAR2), Length(82,true) */
    val guaranteeRespAppName: Rep[Option[String]] = column[Option[String]]("GUARANTEE_RESP_APP_NAME", O.Length(82,varying=true))
    /** Database column GUARANTEE_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteeId: Rep[Option[String]] = column[Option[String]]("GUARANTEE_ID", O.Length(10,varying=true))
    /** Database column RESERVATION_TYPE SqlType(CHAR) */
    val reservationType: Rep[Option[Char]] = column[Option[Char]]("RESERVATION_TYPE")
    /** Database column FIRST_ENTRY_FLAG SqlType(CHAR) */
    val firstEntryFlag: Rep[Option[Char]] = column[Option[Char]]("FIRST_ENTRY_FLAG")
    /** Database column CONDITIONS SqlType(VARCHAR2), Length(1024,true) */
    val conditions: Rep[Option[String]] = column[Option[String]]("CONDITIONS", O.Length(1024,varying=true))
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(1024,varying=true))

    /** Foreign key referencing GreatCurrency (database name GLRV_FK_RESERVED_AMOUNT_CURR1) */
    lazy val greatCurrencyFk = foreignKey("GLRV_FK_RESERVED_AMOUNT_CURR1", reservedAmountCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GLRV_FK_GUARANTEE_RESP_APP_ID) */
    lazy val greatDivisionUserFk2 = foreignKey("GLRV_FK_GUARANTEE_RESP_APP_ID", guaranteeRespAppId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GLRV_FK_OWNER_ID) */
    lazy val greatDivisionUserFk3 = foreignKey("GLRV_FK_OWNER_ID", ownerId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineReservations (database name GLRV_FK_PARENT_ID) */
    lazy val greatGlineReservationsFk = foreignKey("GLRV_FK_PARENT_ID", parentId, GreatGlineReservations)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name GLRV_FK_GUARANTEE_PARTNER_OR3) */
    lazy val greatOrgFk = foreignKey("GLRV_FK_GUARANTEE_PARTNER_OR3", guaranteePartnerOrgId, GreatOrg)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGlineReservation */
  lazy val GreatGlineReservation = new TableQuery(tag => new GreatGlineReservation(tag))

  /** Entity class storing rows of table GreatGlineReservationHist
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param parentId Database column PARENT_ID SqlType(VARCHAR2), Length(10,true)
    *  @param parentVersion Database column PARENT_VERSION SqlType(NUMBER)
    *  @param reservedAmount Database column RESERVED_AMOUNT SqlType(NUMBER)
    *  @param reservedAmountCurrency Database column RESERVED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false)
    *  @param project Database column PROJECT SqlType(VARCHAR2), Length(50,true)
    *  @param ownerId Database column OWNER_ID SqlType(VARCHAR2), Length(10,true)
    *  @param reservationTimestamp Database column RESERVATION_TIMESTAMP SqlType(TIMESTAMP(6))
    *  @param expiryDate Database column EXPIRY_DATE SqlType(DATE)
    *  @param reminderStartDate Database column REMINDER_START_DATE SqlType(DATE)
    *  @param reminderPeriodType Database column REMINDER_PERIOD_TYPE SqlType(CHAR)
    *  @param guaranteeEndDate Database column GUARANTEE_END_DATE SqlType(DATE)
    *  @param guaranteePartnerOrgId Database column GUARANTEE_PARTNER_ORG_ID SqlType(VARCHAR2), Length(10,true)
    *  @param guaranteeRespAppId Database column GUARANTEE_RESP_APP_ID SqlType(VARCHAR2), Length(10,true)
    *  @param guaranteeRespAppName Database column GUARANTEE_RESP_APP_NAME SqlType(VARCHAR2), Length(82,true)
    *  @param guaranteeId Database column GUARANTEE_ID SqlType(VARCHAR2), Length(10,true)
    *  @param reservationType Database column RESERVATION_TYPE SqlType(CHAR)
    *  @param firstEntryFlag Database column FIRST_ENTRY_FLAG SqlType(CHAR)
    *  @param conditions Database column CONDITIONS SqlType(VARCHAR2), Length(1024,true)
    *  @param commentary Database column COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
  case class GreatGlineReservationHistRow(objectidc: String, parentId: Option[String], parentVersion: scala.math.BigDecimal, reservedAmount: Option[scala.math.BigDecimal], reservedAmountCurrency: Option[String], project: Option[String], ownerId: Option[String], reservationTimestamp: Option[java.sql.Timestamp], expiryDate: Option[java.sql.Timestamp], reminderStartDate: Option[java.sql.Timestamp], reminderPeriodType: Option[Char], guaranteeEndDate: Option[java.sql.Timestamp], guaranteePartnerOrgId: Option[String], guaranteeRespAppId: Option[String], guaranteeRespAppName: Option[String], guaranteeId: Option[String], reservationType: Option[Char], firstEntryFlag: Option[Char], conditions: Option[String], commentary: Option[String])
  /** GetResult implicit for fetching GreatGlineReservationHistRow objects using plain SQL queries */
  implicit def GetResultGreatGlineReservationHistRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[scala.math.BigDecimal], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]]): GR[GreatGlineReservationHistRow] = GR{
    prs => import prs._
      GreatGlineReservationHistRow.tupled((<<[String], <<?[String], <<[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char], <<?[Char], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_GLINE_RESERVATION_HIST. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineReservationHist(_tableTag: Tag) extends profile.api.Table[GreatGlineReservationHistRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_RESERVATION_HIST") {
    def * = (objectidc, parentId, parentVersion, reservedAmount, reservedAmountCurrency, project, ownerId, reservationTimestamp, expiryDate, reminderStartDate, reminderPeriodType, guaranteeEndDate, guaranteePartnerOrgId, guaranteeRespAppId, guaranteeRespAppName, guaranteeId, reservationType, firstEntryFlag, conditions, commentary) <> (GreatGlineReservationHistRow.tupled, GreatGlineReservationHistRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), parentId, Rep.Some(parentVersion), reservedAmount, reservedAmountCurrency, project, ownerId, reservationTimestamp, expiryDate, reminderStartDate, reminderPeriodType, guaranteeEndDate, guaranteePartnerOrgId, guaranteeRespAppId, guaranteeRespAppName, guaranteeId, reservationType, firstEntryFlag, conditions, commentary).shaped.<>({r=>import r._; _1.map(_=> GreatGlineReservationHistRow.tupled((_1.get, _2, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column PARENT_ID SqlType(VARCHAR2), Length(10,true) */
    val parentId: Rep[Option[String]] = column[Option[String]]("PARENT_ID", O.Length(10,varying=true))
    /** Database column PARENT_VERSION SqlType(NUMBER) */
    val parentVersion: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PARENT_VERSION")
    /** Database column RESERVED_AMOUNT SqlType(NUMBER) */
    val reservedAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RESERVED_AMOUNT")
    /** Database column RESERVED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val reservedAmountCurrency: Rep[Option[String]] = column[Option[String]]("RESERVED_AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column PROJECT SqlType(VARCHAR2), Length(50,true) */
    val project: Rep[Option[String]] = column[Option[String]]("PROJECT", O.Length(50,varying=true))
    /** Database column OWNER_ID SqlType(VARCHAR2), Length(10,true) */
    val ownerId: Rep[Option[String]] = column[Option[String]]("OWNER_ID", O.Length(10,varying=true))
    /** Database column RESERVATION_TIMESTAMP SqlType(TIMESTAMP(6)) */
    val reservationTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RESERVATION_TIMESTAMP")
    /** Database column EXPIRY_DATE SqlType(DATE) */
    val expiryDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXPIRY_DATE")
    /** Database column REMINDER_START_DATE SqlType(DATE) */
    val reminderStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("REMINDER_START_DATE")
    /** Database column REMINDER_PERIOD_TYPE SqlType(CHAR) */
    val reminderPeriodType: Rep[Option[Char]] = column[Option[Char]]("REMINDER_PERIOD_TYPE")
    /** Database column GUARANTEE_END_DATE SqlType(DATE) */
    val guaranteeEndDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("GUARANTEE_END_DATE")
    /** Database column GUARANTEE_PARTNER_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteePartnerOrgId: Rep[Option[String]] = column[Option[String]]("GUARANTEE_PARTNER_ORG_ID", O.Length(10,varying=true))
    /** Database column GUARANTEE_RESP_APP_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteeRespAppId: Rep[Option[String]] = column[Option[String]]("GUARANTEE_RESP_APP_ID", O.Length(10,varying=true))
    /** Database column GUARANTEE_RESP_APP_NAME SqlType(VARCHAR2), Length(82,true) */
    val guaranteeRespAppName: Rep[Option[String]] = column[Option[String]]("GUARANTEE_RESP_APP_NAME", O.Length(82,varying=true))
    /** Database column GUARANTEE_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteeId: Rep[Option[String]] = column[Option[String]]("GUARANTEE_ID", O.Length(10,varying=true))
    /** Database column RESERVATION_TYPE SqlType(CHAR) */
    val reservationType: Rep[Option[Char]] = column[Option[Char]]("RESERVATION_TYPE")
    /** Database column FIRST_ENTRY_FLAG SqlType(CHAR) */
    val firstEntryFlag: Rep[Option[Char]] = column[Option[Char]]("FIRST_ENTRY_FLAG")
    /** Database column CONDITIONS SqlType(VARCHAR2), Length(1024,true) */
    val conditions: Rep[Option[String]] = column[Option[String]]("CONDITIONS", O.Length(1024,varying=true))
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(1024,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(1024,varying=true))

    /** Primary key of GreatGlineReservationHist (database name GLRVH_PK_OBJECTIDC) */
    val pk = primaryKey("GLRVH_PK_OBJECTIDC", (objectidc, parentVersion))

    /** Foreign key referencing GreatCurrency (database name GLRVH_FK_RESERVED_AMOUNT_CUR1) */
    lazy val greatCurrencyFk = foreignKey("GLRVH_FK_RESERVED_AMOUNT_CUR1", reservedAmountCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GLRVH_FK_GUARANTEE_RESP_APP_ID) */
    lazy val greatDivisionUserFk2 = foreignKey("GLRVH_FK_GUARANTEE_RESP_APP_ID", guaranteeRespAppId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GLRVH_FK_OWNER_ID) */
    lazy val greatDivisionUserFk3 = foreignKey("GLRVH_FK_OWNER_ID", ownerId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineReservationsHist (database name GLRVH_FK_PARENT_VERSION) */
    lazy val greatGlineReservationsHistFk = foreignKey("GLRVH_FK_PARENT_VERSION", (parentId, parentVersion), GreatGlineReservationsHist)(r => (Rep.Some(r.objectidc), r.objectversionc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name GLRVH_FK_GUARANTEE_PARTNER_O3) */
    lazy val greatOrgFk = foreignKey("GLRVH_FK_GUARANTEE_PARTNER_O3", guaranteePartnerOrgId, GreatOrg)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGlineReservationHist */
  lazy val GreatGlineReservationHist = new TableQuery(tag => new GreatGlineReservationHist(tag))

  /** Entity class storing rows of table GreatGlineReservations
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param lineAccountId Database column LINE_ACCOUNT_ID SqlType(VARCHAR2), Length(10,true) */
  case class GreatGlineReservationsRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], lineAccountId: String)
  /** GetResult implicit for fetching GreatGlineReservationsRow objects using plain SQL queries */
  implicit def GetResultGreatGlineReservationsRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[GreatGlineReservationsRow] = GR{
    prs => import prs._
      GreatGlineReservationsRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table GREAT_GLINE_RESERVATIONS. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineReservations(_tableTag: Tag) extends profile.api.Table[GreatGlineReservationsRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_RESERVATIONS") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, lineAccountId) <> (GreatGlineReservationsRow.tupled, GreatGlineReservationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, Rep.Some(lineAccountId)).shaped.<>({r=>import r._; _1.map(_=> GreatGlineReservationsRow.tupled((_1.get, _2, _3, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column LINE_ACCOUNT_ID SqlType(VARCHAR2), Length(10,true) */
    val lineAccountId: Rep[String] = column[String]("LINE_ACCOUNT_ID", O.Length(10,varying=true))

    /** Foreign key referencing GreatGlineAccount (database name GLRVS_FK_LINE_ACCOUNT_ID) */
    lazy val greatGlineAccountFk = foreignKey("GLRVS_FK_LINE_ACCOUNT_ID", lineAccountId, GreatGlineAccount)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGlineReservations */
  lazy val GreatGlineReservations = new TableQuery(tag => new GreatGlineReservations(tag))

  /** Entity class storing rows of table GreatGlineReservationsHist
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param lineAccountId Database column LINE_ACCOUNT_ID SqlType(VARCHAR2), Length(10,true) */
  case class GreatGlineReservationsHistRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], updatereasonc: String, updatecategoryc: String, lineAccountId: String)
  /** GetResult implicit for fetching GreatGlineReservationsHistRow objects using plain SQL queries */
  implicit def GetResultGreatGlineReservationsHistRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[GreatGlineReservationsHistRow] = GR{
    prs => import prs._
      GreatGlineReservationsHistRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String]))
  }
  /** Table description of table GREAT_GLINE_RESERVATIONS_HIST. Objects of this class serve as prototypes for rows in queries. */
  class GreatGlineReservationsHist(_tableTag: Tag) extends profile.api.Table[GreatGlineReservationsHistRow](_tableTag, Some("WERNER2"), "GREAT_GLINE_RESERVATIONS_HIST") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, updatereasonc, updatecategoryc, lineAccountId) <> (GreatGlineReservationsHistRow.tupled, GreatGlineReservationsHistRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, updatetimec, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(lineAccountId)).shaped.<>({r=>import r._; _1.map(_=> GreatGlineReservationsHistRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true) */
    val updatereasonc: Rep[String] = column[String]("UPDATEREASONC", O.Length(10,varying=true))
    /** Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true) */
    val updatecategoryc: Rep[String] = column[String]("UPDATECATEGORYC", O.Length(20,varying=true))
    /** Database column LINE_ACCOUNT_ID SqlType(VARCHAR2), Length(10,true) */
    val lineAccountId: Rep[String] = column[String]("LINE_ACCOUNT_ID", O.Length(10,varying=true))

    /** Primary key of GreatGlineReservationsHist (database name GLRVSH_PK_OBJECTIDC) */
    val pk = primaryKey("GLRVSH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatGlineReservationsHist */
  lazy val GreatGlineReservationsHist = new TableQuery(tag => new GreatGlineReservationsHist(tag))


}
