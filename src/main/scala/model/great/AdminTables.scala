package model.great

object AdminTables extends {
  val profile = slick.jdbc.OracleProfile
} with AdminTables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait AdminTables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  import model.great.MasterDataTables._
  import model.great.CommonTables._
  import model.great.BackOfficeTables._
  import model.great.GuaranteeTables._


  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array (BareDependants.schema, BareDependantsHistory.schema, BareRights.schema, BusinessUnits.schema, Division.schema, DivisioncodeInSector.schema, DivisionLimits.schema, DivisionReportRight.schema, DivisionUser.schema, DownloadColumn.schema, DownloadFormat.schema, DownloadFormatRef.schema, GroupStructure.schema, GroupStructureHistory.schema, Person.schema, User.schema, UserAccount.schema, UserDeputies.schema, UserGroup.schema, UserInDivision.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema
  // ToDo: im "alten" DB-Schema, beginnt jeder Tabellenname mit GREAT; spaeter moechte ich hier z.B. "COM" furr Common setzten um in der DB eine Struktur zu erhalten
  val tablePrefix = "GREAT_"


  /** Row type of table Division */
  type divisionRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for DivisionRow providing default values if available in the database schema. */
  def DivisionRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], kind: Option[String], name: Option[String], description: Option[String], address: Option[String], isLive: Option[Char], email: Option[String], parent: Option[String], telephone: Option[String], country: Option[String], currency: Option[String], isArchiving: Option[Char], barcodeAddress: Option[String], language: Option[String], disabled: Option[Char], mainContactUser: Option[String], showNationalFields: Option[Char], inheritShowNationalFields: Option[Char], archiveCountryIsocode2: Option[String], archiveUrl: Option[String]): divisionRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: kind :: name :: description :: address :: isLive :: email :: parent :: telephone :: country :: currency :: isArchiving :: barcodeAddress :: language :: disabled :: mainContactUser :: showNationalFields :: inheritShowNationalFields :: archiveCountryIsocode2 :: archiveUrl :: HNil
  }
  /** GetResult implicit for fetching DivisionRow objects using plain SQL queries */
  implicit def GetResultDivisionRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[divisionRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_DIVISION. Objects of this class serve as prototypes for rows in queries. */
  class Division(_tableTag: Tag) extends profile.api.Table[divisionRow](_tableTag, Some("WERNER2"), tablePrefix + "DIVISION") {
    def * = objectidc :: objectversionc :: lastuserc :: updatetimec :: kind :: name :: description :: address :: isLive :: email :: parent :: telephone :: country :: currency :: isArchiving :: barcodeAddress :: language :: disabled :: mainContactUser :: showNationalFields :: inheritShowNationalFields :: archiveCountryIsocode2 :: archiveUrl :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column KIND SqlType(VARCHAR2), Length(12,true) */
    val kind: Rep[Option[String]] = column[Option[String]]("KIND", O.Length(12,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(52,varying=true))
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(1024,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(1024,varying=true))
    /** Database column ADDRESS SqlType(VARCHAR2), Length(1024,true) */
    val address: Rep[Option[String]] = column[Option[String]]("ADDRESS", O.Length(1024,varying=true))
    /** Database column IS_LIVE SqlType(CHAR) */
    val isLive: Rep[Option[Char]] = column[Option[Char]]("IS_LIVE")
    /** Database column EMAIL SqlType(VARCHAR2), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("EMAIL", O.Length(100,varying=true))
    /** Database column PARENT SqlType(VARCHAR2), Length(10,true) */
    val parent: Rep[Option[String]] = column[Option[String]]("PARENT", O.Length(10,varying=true))
    /** Database column TELEPHONE SqlType(VARCHAR2), Length(32,true) */
    val telephone: Rep[Option[String]] = column[Option[String]]("TELEPHONE", O.Length(32,varying=true))
    /** Database column COUNTRY SqlType(VARCHAR2), Length(10,true) */
    val country: Rep[Option[String]] = column[Option[String]]("COUNTRY", O.Length(10,varying=true))
    /** Database column CURRENCY SqlType(CHAR), Length(3,false) */
    val currency: Rep[Option[String]] = column[Option[String]]("CURRENCY", O.Length(3,varying=false))
    /** Database column IS_ARCHIVING SqlType(CHAR) */
    val isArchiving: Rep[Option[Char]] = column[Option[Char]]("IS_ARCHIVING")
    /** Database column BARCODE_ADDRESS SqlType(VARCHAR2), Length(480,true) */
    val barcodeAddress: Rep[Option[String]] = column[Option[String]]("BARCODE_ADDRESS", O.Length(480,varying=true))
    /** Database column LANGUAGE SqlType(CHAR), Length(2,false) */
    val language: Rep[Option[String]] = column[Option[String]]("LANGUAGE", O.Length(2,varying=false))
    /** Database column DISABLED SqlType(CHAR) */
    val disabled: Rep[Option[Char]] = column[Option[Char]]("DISABLED")
    /** Database column MAIN_CONTACT_USER SqlType(VARCHAR2), Length(10,true) */
    val mainContactUser: Rep[Option[String]] = column[Option[String]]("MAIN_CONTACT_USER", O.Length(10,varying=true))
    /** Database column SHOW_NATIONAL_FIELDS SqlType(CHAR) */
    val showNationalFields: Rep[Option[Char]] = column[Option[Char]]("SHOW_NATIONAL_FIELDS")
    /** Database column INHERIT_SHOW_NATIONAL_FIELDS SqlType(CHAR) */
    val inheritShowNationalFields: Rep[Option[Char]] = column[Option[Char]]("INHERIT_SHOW_NATIONAL_FIELDS")
    /** Database column ARCHIVE_COUNTRY_ISOCODE2 SqlType(VARCHAR2), Length(2,true) */
    val archiveCountryIsocode2: Rep[Option[String]] = column[Option[String]]("ARCHIVE_COUNTRY_ISOCODE2", O.Length(2,varying=true))
    /** Database column ARCHIVE_URL SqlType(VARCHAR2), Length(256,true) */
    val archiveUrl: Rep[Option[String]] = column[Option[String]]("ARCHIVE_URL", O.Length(256,varying=true))

    /** Index over (name) (database name DIV_IDX0) */
    val index1 = index("DIV_IDX0", name :: HNil)
    /** Index over (parent) (database name DIV_IDX1) */
    val index2 = index("DIV_IDX1", parent :: HNil)
    /** Uniqueness Index over (archiveCountryIsocode2) (database name DIV_UDX2) */
    val index3 = index("DIV_UDX2", archiveCountryIsocode2 :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table Division */
  lazy val Division = new TableQuery(tag => new Division(tag))

  /** Entity class storing rows of table DivisioncodeInSector
    *  @param division Database column DIVISION SqlType(VARCHAR2), Length(3,true)
    *  @param sector Database column SECTOR SqlType(VARCHAR2), Length(50,true) */
  case class DivisioncodeInSectorRow(division: String, sector: String)
  /** GetResult implicit for fetching DivisioncodeInSectorRow objects using plain SQL queries */
  implicit def GetResultDivisioncodeInSectorRow(implicit e0: GR[String]): GR[DivisioncodeInSectorRow] = GR{
    prs => import prs._
      DivisioncodeInSectorRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_DIVISIONCODE_IN_SECTOR. Objects of this class serve as prototypes for rows in queries. */
  class DivisioncodeInSector(_tableTag: Tag) extends profile.api.Table[DivisioncodeInSectorRow](_tableTag, Some("WERNER2"), tablePrefix + "DIVISIONCODE_IN_SECTOR") {
    def * = (division, sector) <> (DivisioncodeInSectorRow.tupled, DivisioncodeInSectorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(division), Rep.Some(sector)).shaped.<>({r=>import r._; _1.map(_=> DivisioncodeInSectorRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISION SqlType(VARCHAR2), Length(3,true) */
    val division: Rep[String] = column[String]("DIVISION", O.Length(3,varying=true))
    /** Database column SECTOR SqlType(VARCHAR2), Length(50,true) */
    val sector: Rep[String] = column[String]("SECTOR", O.Length(50,varying=true))

    /** Primary key of DivisioncodeInSector (database name DIVIS_PK_DIVISION) */
    val pk = primaryKey("DIVIS_PK_DIVISION", (division, sector))
  }
  /** Collection-like TableQuery object for table DivisioncodeInSector */
  lazy val DivisioncodeInSector = new TableQuery(tag => new DivisioncodeInSector(tag))

  /** Entity class storing rows of table DivisionLimits
    *  @param divisioncode Database column DIVISIONCODE SqlType(VARCHAR2), PrimaryKey, Length(3,true)
    *  @param limit Database column LIMIT SqlType(NUMBER) */
  case class DivisionLimitsRow(divisioncode: String, limit: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching DivisionLimitsRow objects using plain SQL queries */
  implicit def GetResultDivisionLimitsRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]]): GR[DivisionLimitsRow] = GR{
    prs => import prs._
      DivisionLimitsRow.tupled((<<[String], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_DIVISION_LIMITS. Objects of this class serve as prototypes for rows in queries. */
  class DivisionLimits(_tableTag: Tag) extends profile.api.Table[DivisionLimitsRow](_tableTag, Some("WERNER2"), tablePrefix + "DIVISION_LIMITS") {
    def * = (divisioncode, limit) <> (DivisionLimitsRow.tupled, DivisionLimitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(divisioncode), limit).shaped.<>({r=>import r._; _1.map(_=> DivisionLimitsRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISIONCODE SqlType(VARCHAR2), PrimaryKey, Length(3,true) */
    val divisioncode: Rep[String] = column[String]("DIVISIONCODE", O.PrimaryKey, O.Length(3,varying=true))
    /** Database column LIMIT SqlType(NUMBER) */
    val limit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LIMIT")
  }
  /** Collection-like TableQuery object for table DivisionLimits */
  lazy val DivisionLimits = new TableQuery(tag => new DivisionLimits(tag))

  /** Entity class storing rows of table DivisionReportRight
    *  @param report Database column REPORT SqlType(CHAR), Length(5,false)
    *  @param generalAvailability Database column GENERAL_AVAILABILITY SqlType(CHAR), Length(3,false)
    *  @param division Database column DIVISION SqlType(VARCHAR2), Length(10,true)
    *  @param divisioncodeviewerFlag Database column DIVISIONCODEVIEWER_FLAG SqlType(CHAR)
    *  @param bareViewerFlag Database column BARE_VIEWER_FLAG SqlType(CHAR) */
  case class DivisionReportRightRow(report: Option[String], generalAvailability: Option[String], division: Option[String], divisioncodeviewerFlag: Option[Char], bareViewerFlag: Option[Char])
  /** GetResult implicit for fetching DivisionReportRightRow objects using plain SQL queries */
  implicit def GetResultDivisionReportRightRow(implicit e0: GR[Option[String]], e1: GR[Option[Char]]): GR[DivisionReportRightRow] = GR{
    prs => import prs._
      DivisionReportRightRow.tupled((<<?[String], <<?[String], <<?[String], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_DIVISION_REPORT_RIGHT. Objects of this class serve as prototypes for rows in queries. */
  class DivisionReportRight(_tableTag: Tag) extends profile.api.Table[DivisionReportRightRow](_tableTag, Some("WERNER2"), tablePrefix + "DIVISION_REPORT_RIGHT") {
    def * = (report, generalAvailability, division, divisioncodeviewerFlag, bareViewerFlag) <> (DivisionReportRightRow.tupled, DivisionReportRightRow.unapply)

    /** Database column REPORT SqlType(CHAR), Length(5,false) */
    val report: Rep[Option[String]] = column[Option[String]]("REPORT", O.Length(5,varying=false))
    /** Database column GENERAL_AVAILABILITY SqlType(CHAR), Length(3,false) */
    val generalAvailability: Rep[Option[String]] = column[Option[String]]("GENERAL_AVAILABILITY", O.Length(3,varying=false))
    /** Database column DIVISION SqlType(VARCHAR2), Length(10,true) */
    val division: Rep[Option[String]] = column[Option[String]]("DIVISION", O.Length(10,varying=true))
    /** Database column DIVISIONCODEVIEWER_FLAG SqlType(CHAR) */
    val divisioncodeviewerFlag: Rep[Option[Char]] = column[Option[Char]]("DIVISIONCODEVIEWER_FLAG")
    /** Database column BARE_VIEWER_FLAG SqlType(CHAR) */
    val bareViewerFlag: Rep[Option[Char]] = column[Option[Char]]("BARE_VIEWER_FLAG")
  }
  /** Collection-like TableQuery object for table DivisionReportRight */
  lazy val DivisionReportRight = new TableQuery(tag => new DivisionReportRight(tag))

  /** Entity class storing rows of table DivisionUser
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param userAccountIdc Database column USER_ACCOUNT_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param roles Database column ROLES SqlType(VARCHAR2), Length(31,true)
    *  @param viewerType Database column VIEWER_TYPE SqlType(VARCHAR2), Length(4,true)
    *  @param upperLimitAmount Database column UPPER_LIMIT_AMOUNT SqlType(NUMBER)
    *  @param upperLimitCurrency Database column UPPER_LIMIT_CURRENCY SqlType(CHAR), Length(3,false)
    *  @param isActive Database column IS_ACTIVE SqlType(CHAR)
    *  @param isAbsent Database column IS_ABSENT SqlType(CHAR)
    *  @param isDefault Database column IS_DEFAULT SqlType(CHAR) */
  case class DivisionUserRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], userAccountIdc: Option[String], divisionIdc: Option[String], roles: Option[String], viewerType: Option[String], upperLimitAmount: Option[scala.math.BigDecimal], upperLimitCurrency: Option[String], isActive: Option[Char], isAbsent: Option[Char], isDefault: Option[Char])
  /** GetResult implicit for fetching DivisionUserRow objects using plain SQL queries */
  implicit def GetResultDivisionUserRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[DivisionUserRow] = GR{
    prs => import prs._
      DivisionUserRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_DIVISION_USER. Objects of this class serve as prototypes for rows in queries. */
  class DivisionUser(_tableTag: Tag) extends profile.api.Table[DivisionUserRow](_tableTag, Some("WERNER2"), tablePrefix + "DIVISION_USER") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, userAccountIdc, divisionIdc, roles, viewerType, upperLimitAmount, upperLimitCurrency, isActive, isAbsent, isDefault) <> (DivisionUserRow.tupled, DivisionUserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, userAccountIdc, divisionIdc, roles, viewerType, upperLimitAmount, upperLimitCurrency, isActive, isAbsent, isDefault).shaped.<>({r=>import r._; _1.map(_=> DivisionUserRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column USER_ACCOUNT_IDC SqlType(VARCHAR2), Length(10,true) */
    val userAccountIdc: Rep[Option[String]] = column[Option[String]]("USER_ACCOUNT_IDC", O.Length(10,varying=true))
    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[Option[String]] = column[Option[String]]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column ROLES SqlType(VARCHAR2), Length(31,true) */
    val roles: Rep[Option[String]] = column[Option[String]]("ROLES", O.Length(31,varying=true))
    /** Database column VIEWER_TYPE SqlType(VARCHAR2), Length(4,true) */
    val viewerType: Rep[Option[String]] = column[Option[String]]("VIEWER_TYPE", O.Length(4,varying=true))
    /** Database column UPPER_LIMIT_AMOUNT SqlType(NUMBER) */
    val upperLimitAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_LIMIT_AMOUNT")
    /** Database column UPPER_LIMIT_CURRENCY SqlType(CHAR), Length(3,false) */
    val upperLimitCurrency: Rep[Option[String]] = column[Option[String]]("UPPER_LIMIT_CURRENCY", O.Length(3,varying=false))
    /** Database column IS_ACTIVE SqlType(CHAR) */
    val isActive: Rep[Option[Char]] = column[Option[Char]]("IS_ACTIVE")
    /** Database column IS_ABSENT SqlType(CHAR) */
    val isAbsent: Rep[Option[Char]] = column[Option[Char]]("IS_ABSENT")
    /** Database column IS_DEFAULT SqlType(CHAR) */
    val isDefault: Rep[Option[Char]] = column[Option[Char]]("IS_DEFAULT")

    /** Foreign key referencing UserAccount (database name DU_FK_USER_ACCOUNT_IDC) */
    lazy val userAccountFk = foreignKey("DU_FK_USER_ACCOUNT_IDC", userAccountIdc, UserAccount)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table DivisionUser */
  lazy val DivisionUser = new TableQuery(tag => new DivisionUser(tag))

  /** Entity class storing rows of table DownloadColumn
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param formatIdc Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param pos Database column POS SqlType(NUMBER)
    *  @param col Database column COL SqlType(VARCHAR2), Length(32,true) */
  case class DownloadColumnRow(objectidc: String, formatIdc: Option[String], pos: Option[scala.math.BigDecimal], col: Option[String])
  /** GetResult implicit for fetching DownloadColumnRow objects using plain SQL queries */
  implicit def GetResultDownloadColumnRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]]): GR[DownloadColumnRow] = GR{
    prs => import prs._
      DownloadColumnRow.tupled((<<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_DOWNLOAD_COLUMN. Objects of this class serve as prototypes for rows in queries. */
  class DownloadColumn(_tableTag: Tag) extends profile.api.Table[DownloadColumnRow](_tableTag, Some("WERNER2"), tablePrefix + "DOWNLOAD_COLUMN") {
    def * = (objectidc, formatIdc, pos, col) <> (DownloadColumnRow.tupled, DownloadColumnRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), formatIdc, pos, col).shaped.<>({r=>import r._; _1.map(_=> DownloadColumnRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true) */
    val formatIdc: Rep[Option[String]] = column[Option[String]]("FORMAT_IDC", O.Length(10,varying=true))
    /** Database column POS SqlType(NUMBER) */
    val pos: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POS")
    /** Database column COL SqlType(VARCHAR2), Length(32,true) */
    val col: Rep[Option[String]] = column[Option[String]]("COL", O.Length(32,varying=true))

    /** Foreign key referencing DownloadFormat (database name DLC_FK_FORMAT_IDC) */
    lazy val downloadFormatFk = foreignKey("DLC_FK_FORMAT_IDC", formatIdc, DownloadFormat)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table DownloadColumn */
  lazy val DownloadColumn = new TableQuery(tag => new DownloadColumn(tag))

  /** Entity class storing rows of table DownloadFormat
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param owner Database column OWNER SqlType(VARCHAR2), Length(10,true)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(52,true)
    *  @param published Database column PUBLISHED SqlType(VARCHAR2) */
  case class DownloadFormatRow(objectidc: String, owner: Option[String], name: String, published: Option[Char])
  /** GetResult implicit for fetching DownloadFormatRow objects using plain SQL queries */
  implicit def GetResultDownloadFormatRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Char]]): GR[DownloadFormatRow] = GR{
    prs => import prs._
      DownloadFormatRow.tupled((<<[String], <<?[String], <<[String], <<?[Char]))
  }
  /** Table description of table GREAT_DOWNLOAD_FORMAT. Objects of this class serve as prototypes for rows in queries. */
  class DownloadFormat(_tableTag: Tag) extends profile.api.Table[DownloadFormatRow](_tableTag, Some("WERNER2"), tablePrefix + "DOWNLOAD_FORMAT") {
    def * = (objectidc, owner, name, published) <> (DownloadFormatRow.tupled, DownloadFormatRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), owner, Rep.Some(name), published).shaped.<>({r=>import r._; _1.map(_=> DownloadFormatRow.tupled((_1.get, _2, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OWNER SqlType(VARCHAR2), Length(10,true) */
    val owner: Rep[Option[String]] = column[Option[String]]("OWNER", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(52,varying=true))
    /** Database column PUBLISHED SqlType(VARCHAR2) */
    val published: Rep[Option[Char]] = column[Option[Char]]("PUBLISHED")

    /** Foreign key referencing DivisionUser (database name DF_FK_OWNER) */
    lazy val divisionUserFk = foreignKey("DF_FK_OWNER", owner, DivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table DownloadFormat */
  lazy val DownloadFormat = new TableQuery(tag => new DownloadFormat(tag))

  /** Entity class storing rows of table DownloadFormatRef
    *  @param formatIdc Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param `type` Database column TYPE SqlType(CHAR) */
  case class DownloadFormatRefRow(formatIdc: String, userIdc: String, `type`: Char)
  /** GetResult implicit for fetching DownloadFormatRefRow objects using plain SQL queries */
  implicit def GetResultDownloadFormatRefRow(implicit e0: GR[String], e1: GR[Char]): GR[DownloadFormatRefRow] = GR{
    prs => import prs._
      DownloadFormatRefRow.tupled((<<[String], <<[String], <<[Char]))
  }
  /** Table description of table GREAT_DOWNLOAD_FORMAT_REF. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class DownloadFormatRef(_tableTag: Tag) extends profile.api.Table[DownloadFormatRefRow](_tableTag, Some("WERNER2"), tablePrefix + "DOWNLOAD_FORMAT_REF") {
    def * = (formatIdc, userIdc, `type`) <> (DownloadFormatRefRow.tupled, DownloadFormatRefRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(formatIdc), Rep.Some(userIdc), Rep.Some(`type`)).shaped.<>({r=>import r._; _1.map(_=> DownloadFormatRefRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true) */
    val formatIdc: Rep[String] = column[String]("FORMAT_IDC", O.Length(10,varying=true))
    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))
    /** Database column TYPE SqlType(CHAR)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Char] = column[Char]("TYPE")

    /** Primary key of DownloadFormatRef (database name DFR_PK_FORMAT_IDC) */
    val pk = primaryKey("DFR_PK_FORMAT_IDC", (formatIdc, userIdc, `type`))
  }
  /** Collection-like TableQuery object for table DownloadFormatRef */
  lazy val DownloadFormatRef = new TableQuery(tag => new DownloadFormatRef(tag))


  /** Entity class storing rows of table BusinessUnits
    *  @param code Database column CODE SqlType(VARCHAR2), Length(10,true)
    *  @param version Database column VERSION SqlType(NUMBER)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(30,true)
    *  @param parent Database column PARENT SqlType(VARCHAR2), Length(30,true)
    *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true)
    *  @param mandatory Database column MANDATORY SqlType(CHAR) */
  case class BusinessUnitsRow(code: String, version: scala.math.BigDecimal, name: String, parent: String, description: Option[String], mandatory: Option[Char])
  /** GetResult implicit for fetching BusinessUnitsRow objects using plain SQL queries */
  implicit def GetResultBusinessUnitsRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Option[Char]]): GR[BusinessUnitsRow] = GR{
    prs => import prs._
      BusinessUnitsRow.tupled((<<[String], <<[scala.math.BigDecimal], <<[String], <<[String], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BUSINESS_UNITS. Objects of this class serve as prototypes for rows in queries. */
  class BusinessUnits(_tableTag: Tag) extends profile.api.Table[BusinessUnitsRow](_tableTag, Some("WERNER2"), tablePrefix + "BUSINESS_UNITS") {
    def * = (code, version, name, parent, description, mandatory) <> (BusinessUnitsRow.tupled, BusinessUnitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(code), Rep.Some(version), Rep.Some(name), Rep.Some(parent), description, mandatory).shaped.<>({r=>import r._; _1.map(_=> BusinessUnitsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CODE SqlType(VARCHAR2), Length(10,true) */
    val code: Rep[String] = column[String]("CODE", O.Length(10,varying=true))
    /** Database column VERSION SqlType(NUMBER) */
    val version: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("VERSION")
    /** Database column NAME SqlType(VARCHAR2), Length(30,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(30,varying=true))
    /** Database column PARENT SqlType(VARCHAR2), Length(30,true) */
    val parent: Rep[String] = column[String]("PARENT", O.Length(30,varying=true))
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(200,varying=true))
    /** Database column MANDATORY SqlType(CHAR) */
    val mandatory: Rep[Option[Char]] = column[Option[Char]]("MANDATORY")

    /** Primary key of BusinessUnits (database name BU_PK_CODE) */
    val pk = primaryKey("BU_PK_CODE", (code, version, name, parent))

    /** Foreign key referencing GroupStructureHistory (database name BU_FK_CODE) */
    lazy val groupStructureHistoryFk = foreignKey("BU_FK_CODE", (code, version), GroupStructureHistory)(r => (r.objectidc, r.objectversionc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BusinessUnits */
  lazy val BusinessUnits = new TableQuery(tag => new BusinessUnits(tag))


  /** Row type of table BareDependants */
  type BareDependantsRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for BareDependantsRow providing default values if available in the database schema. */
  def BareDependantsRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], invoicingPermitted: Option[Char], parent: Option[String], currencyIsoCode: Option[String], toBeExcludedFromBsReport: Option[Char], balanceSheetRecUserId: Option[String], disclosureArePattern: Option[String], periodicDefGroupComRec: Option[String], periodicDefBankComRec: Option[String], periodicDefIndBankComRec: Option[String], periodicDefInsuranceComRec: Option[String], singularDefGroupComRec: Option[String], singularDefBankComRec: Option[String], singularDefIndBankComRec: Option[String], singularDefInsurComRec: Option[String], individualParticipation: Option[Char], invFirstPassDate: Option[java.sql.Timestamp], considerStartPeriod: Option[Char], invStartDate: Option[java.sql.Timestamp], invCurrencyIsoCode: Option[String], aOrgId: Option[String], salesOffice: Option[String], billingSystem: Option[Char], fileNamePrefix: Option[String], sapUserName: Option[String], serverUpload: Option[Char], minAccAmountProv: Option[scala.math.BigDecimal], minAccAmountProvCur: Option[String], creationFeeGroup: Option[scala.math.BigDecimal], creationFeeGroupCur: Option[String], creationFeeDirect: Option[scala.math.BigDecimal], creationFeeDirectCur: Option[String], creationFeeIndirect: Option[scala.math.BigDecimal], creationFeeIndirectCur: Option[String], creationFeeInsur: Option[scala.math.BigDecimal], creationFeeInsurCur: Option[String], amendmFeeGroup: Option[scala.math.BigDecimal], amendmFeeGroupCur: Option[String], amendmFeeDirect: Option[scala.math.BigDecimal], amendmFeeDirectCur: Option[String], amendmFeeIndirect: Option[scala.math.BigDecimal], amendmFeeIndirectCur: Option[String], amendmFeeInsur: Option[scala.math.BigDecimal], amendmFeeInsurCur: Option[String], courierChGroup: Option[scala.math.BigDecimal], courierChGroupCur: Option[String], courierChDirect: Option[scala.math.BigDecimal], courierChDirectCur: Option[String], courierChIndirect: Option[scala.math.BigDecimal], courierChIndirectCur: Option[String], courierChInsur: Option[scala.math.BigDecimal], courierChInsurCur: Option[String], expensesGroup: Option[scala.math.BigDecimal], expensesGroupCur: Option[String], expensesDirect: Option[scala.math.BigDecimal], expensesDirectCur: Option[String], expensesIndirect: Option[scala.math.BigDecimal], expensesIndirectCur: Option[String], expensesInsur: Option[scala.math.BigDecimal], expensesInsurCur: Option[String], referableAvalComm: Option[Char], referableMinComm: Option[Char], referableFixComm: Option[Char], referableProcessingFee: Option[Char], referableMinFee: Option[Char], referableFixFee: Option[Char], validFrom: Option[java.sql.Timestamp], currencyPeriod: Option[Char], dayCountFractionPlQl: Option[Char], groupCommPortion: Option[scala.math.BigDecimal], thirdPartyCommPortion: Option[scala.math.BigDecimal], minNominalComm: Option[scala.math.BigDecimal], minNominalCommCur: Option[String], minNominalCommPeriod: Option[Char], minObligoComm: Option[scala.math.BigDecimal], minObligoCommCur: Option[String], minObligoCommPeriod: Option[Char], fixComm: Option[scala.math.BigDecimal], fixCommCur: Option[String], fixCommPeriod: Option[Char], groupFeePortion: Option[scala.math.BigDecimal], thirdPartyFeePortion: Option[scala.math.BigDecimal], minFee: Option[scala.math.BigDecimal], minFeeCur: Option[String], minFeePeriod: Option[Char], minObligoFee: Option[scala.math.BigDecimal], minObligoFeeCur: Option[String], minObligoFeePeriod: Option[Char], fixFee: Option[scala.math.BigDecimal], fixFeeCur: Option[String], fixFeePeriod: Option[Char], matNumberPeriodicFee: Option[String], matNumberSingular: Option[String], matNumberCreationFee: Option[String], matNumberSupplementFee: Option[String], matNumberCourierCost: Option[String], matNumberExpenses: Option[String], matNumberCharges: Option[String]): BareDependantsRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: invoicingPermitted :: parent :: currencyIsoCode :: toBeExcludedFromBsReport :: balanceSheetRecUserId :: disclosureArePattern :: periodicDefGroupComRec :: periodicDefBankComRec :: periodicDefIndBankComRec :: periodicDefInsuranceComRec :: singularDefGroupComRec :: singularDefBankComRec :: singularDefIndBankComRec :: singularDefInsurComRec :: individualParticipation :: invFirstPassDate :: considerStartPeriod :: invStartDate :: invCurrencyIsoCode :: aOrgId :: salesOffice :: billingSystem :: fileNamePrefix :: sapUserName :: serverUpload :: minAccAmountProv :: minAccAmountProvCur :: creationFeeGroup :: creationFeeGroupCur :: creationFeeDirect :: creationFeeDirectCur :: creationFeeIndirect :: creationFeeIndirectCur :: creationFeeInsur :: creationFeeInsurCur :: amendmFeeGroup :: amendmFeeGroupCur :: amendmFeeDirect :: amendmFeeDirectCur :: amendmFeeIndirect :: amendmFeeIndirectCur :: amendmFeeInsur :: amendmFeeInsurCur :: courierChGroup :: courierChGroupCur :: courierChDirect :: courierChDirectCur :: courierChIndirect :: courierChIndirectCur :: courierChInsur :: courierChInsurCur :: expensesGroup :: expensesGroupCur :: expensesDirect :: expensesDirectCur :: expensesIndirect :: expensesIndirectCur :: expensesInsur :: expensesInsurCur :: referableAvalComm :: referableMinComm :: referableFixComm :: referableProcessingFee :: referableMinFee :: referableFixFee :: validFrom :: currencyPeriod :: dayCountFractionPlQl :: groupCommPortion :: thirdPartyCommPortion :: minNominalComm :: minNominalCommCur :: minNominalCommPeriod :: minObligoComm :: minObligoCommCur :: minObligoCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: groupFeePortion :: thirdPartyFeePortion :: minFee :: minFeeCur :: minFeePeriod :: minObligoFee :: minObligoFeeCur :: minObligoFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: matNumberPeriodicFee :: matNumberSingular :: matNumberCreationFee :: matNumberSupplementFee :: matNumberCourierCost :: matNumberExpenses :: matNumberCharges :: HNil
  }
  /** GetResult implicit for fetching BareDependantsRow objects using plain SQL queries */
  implicit def GetResultBareDependantsRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[BareDependantsRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BARE_DEPENDANTS. Objects of this class serve as prototypes for rows in queries. */
  class BareDependants(_tableTag: Tag) extends profile.api.Table[BareDependantsRow](_tableTag, Some("WERNER2"), tablePrefix + "BARE_DEPENDANTS") {
    def * = objectidc :: objectversionc :: lastuserc :: updatetimec :: invoicingPermitted :: parent :: currencyIsoCode :: toBeExcludedFromBsReport :: balanceSheetRecUserId :: disclosureArePattern :: periodicDefGroupComRec :: periodicDefBankComRec :: periodicDefIndBankComRec :: periodicDefInsuranceComRec :: singularDefGroupComRec :: singularDefBankComRec :: singularDefIndBankComRec :: singularDefInsurComRec :: individualParticipation :: invFirstPassDate :: considerStartPeriod :: invStartDate :: invCurrencyIsoCode :: aOrgId :: salesOffice :: billingSystem :: fileNamePrefix :: sapUserName :: serverUpload :: minAccAmountProv :: minAccAmountProvCur :: creationFeeGroup :: creationFeeGroupCur :: creationFeeDirect :: creationFeeDirectCur :: creationFeeIndirect :: creationFeeIndirectCur :: creationFeeInsur :: creationFeeInsurCur :: amendmFeeGroup :: amendmFeeGroupCur :: amendmFeeDirect :: amendmFeeDirectCur :: amendmFeeIndirect :: amendmFeeIndirectCur :: amendmFeeInsur :: amendmFeeInsurCur :: courierChGroup :: courierChGroupCur :: courierChDirect :: courierChDirectCur :: courierChIndirect :: courierChIndirectCur :: courierChInsur :: courierChInsurCur :: expensesGroup :: expensesGroupCur :: expensesDirect :: expensesDirectCur :: expensesIndirect :: expensesIndirectCur :: expensesInsur :: expensesInsurCur :: referableAvalComm :: referableMinComm :: referableFixComm :: referableProcessingFee :: referableMinFee :: referableFixFee :: validFrom :: currencyPeriod :: dayCountFractionPlQl :: groupCommPortion :: thirdPartyCommPortion :: minNominalComm :: minNominalCommCur :: minNominalCommPeriod :: minObligoComm :: minObligoCommCur :: minObligoCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: groupFeePortion :: thirdPartyFeePortion :: minFee :: minFeeCur :: minFeePeriod :: minObligoFee :: minObligoFeeCur :: minObligoFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: matNumberPeriodicFee :: matNumberSingular :: matNumberCreationFee :: matNumberSupplementFee :: matNumberCourierCost :: matNumberExpenses :: matNumberCharges :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column INVOICING_PERMITTED SqlType(CHAR) */
    val invoicingPermitted: Rep[Option[Char]] = column[Option[Char]]("INVOICING_PERMITTED")
    /** Database column PARENT SqlType(VARCHAR2), Length(4,true) */
    val parent: Rep[Option[String]] = column[Option[String]]("PARENT", O.Length(4,varying=true))
    /** Database column CURRENCY_ISO_CODE SqlType(CHAR), Length(3,false) */
    val currencyIsoCode: Rep[Option[String]] = column[Option[String]]("CURRENCY_ISO_CODE", O.Length(3,varying=false))
    /** Database column TO_BE_EXCLUDED_FROM_BS_REPORT SqlType(CHAR) */
    val toBeExcludedFromBsReport: Rep[Option[Char]] = column[Option[Char]]("TO_BE_EXCLUDED_FROM_BS_REPORT")
    /** Database column BALANCE_SHEET_REC_USER_ID SqlType(VARCHAR2), Length(40,true) */
    val balanceSheetRecUserId: Rep[Option[String]] = column[Option[String]]("BALANCE_SHEET_REC_USER_ID", O.Length(40,varying=true))
    /** Database column DISCLOSURE_ARE_PATTERN SqlType(VARCHAR2), Length(200,true) */
    val disclosureArePattern: Rep[Option[String]] = column[Option[String]]("DISCLOSURE_ARE_PATTERN", O.Length(200,varying=true))
    /** Database column PERIODIC_DEF_GROUP_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefGroupComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_GROUP_COM_REC", O.Length(5,varying=true))
    /** Database column PERIODIC_DEF_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefBankComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column PERIODIC_DEF_IND_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefIndBankComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_IND_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column PERIODIC_DEF_INSURANCE_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefInsuranceComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_INSURANCE_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_GROUP_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefGroupComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_GROUP_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefBankComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_IND_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefIndBankComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_IND_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_INSUR_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefInsurComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_INSUR_COM_REC", O.Length(5,varying=true))
    /** Database column INDIVIDUAL_PARTICIPATION SqlType(CHAR) */
    val individualParticipation: Rep[Option[Char]] = column[Option[Char]]("INDIVIDUAL_PARTICIPATION")
    /** Database column INV_FIRST_PASS_DATE SqlType(DATE) */
    val invFirstPassDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INV_FIRST_PASS_DATE")
    /** Database column CONSIDER_START_PERIOD SqlType(CHAR) */
    val considerStartPeriod: Rep[Option[Char]] = column[Option[Char]]("CONSIDER_START_PERIOD")
    /** Database column INV_START_DATE SqlType(DATE) */
    val invStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INV_START_DATE")
    /** Database column INV_CURRENCY_ISO_CODE SqlType(CHAR), Length(3,false) */
    val invCurrencyIsoCode: Rep[Option[String]] = column[Option[String]]("INV_CURRENCY_ISO_CODE", O.Length(3,varying=false))
    /** Database column A_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val aOrgId: Rep[Option[String]] = column[Option[String]]("A_ORG_ID", O.Length(10,varying=true))
    /** Database column SALES_OFFICE SqlType(VARCHAR2), Length(4,true) */
    val salesOffice: Rep[Option[String]] = column[Option[String]]("SALES_OFFICE", O.Length(4,varying=true))
    /** Database column BILLING_SYSTEM SqlType(CHAR) */
    val billingSystem: Rep[Option[Char]] = column[Option[Char]]("BILLING_SYSTEM")
    /** Database column FILE_NAME_PREFIX SqlType(VARCHAR2), Length(50,true) */
    val fileNamePrefix: Rep[Option[String]] = column[Option[String]]("FILE_NAME_PREFIX", O.Length(50,varying=true))
    /** Database column SAP_USER_NAME SqlType(VARCHAR2), Length(12,true) */
    val sapUserName: Rep[Option[String]] = column[Option[String]]("SAP_USER_NAME", O.Length(12,varying=true))
    /** Database column SERVER_UPLOAD SqlType(CHAR) */
    val serverUpload: Rep[Option[Char]] = column[Option[Char]]("SERVER_UPLOAD")
    /** Database column MIN_ACC_AMOUNT_PROV SqlType(NUMBER) */
    val minAccAmountProv: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_ACC_AMOUNT_PROV")
    /** Database column MIN_ACC_AMOUNT_PROV_CUR SqlType(CHAR), Length(3,false) */
    val minAccAmountProvCur: Rep[Option[String]] = column[Option[String]]("MIN_ACC_AMOUNT_PROV_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_GROUP SqlType(NUMBER) */
    val creationFeeGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_GROUP")
    /** Database column CREATION_FEE_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeGroupCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_GROUP_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_DIRECT SqlType(NUMBER) */
    val creationFeeDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_DIRECT")
    /** Database column CREATION_FEE_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeDirectCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_INDIRECT SqlType(NUMBER) */
    val creationFeeIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_INDIRECT")
    /** Database column CREATION_FEE_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeIndirectCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_INSUR SqlType(NUMBER) */
    val creationFeeInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_INSUR")
    /** Database column CREATION_FEE_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeInsurCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_INSUR_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_GROUP SqlType(NUMBER) */
    val amendmFeeGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_GROUP")
    /** Database column AMENDM_FEE_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeGroupCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_GROUP_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_DIRECT SqlType(NUMBER) */
    val amendmFeeDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_DIRECT")
    /** Database column AMENDM_FEE_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeDirectCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_INDIRECT SqlType(NUMBER) */
    val amendmFeeIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_INDIRECT")
    /** Database column AMENDM_FEE_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeIndirectCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_INSUR SqlType(NUMBER) */
    val amendmFeeInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_INSUR")
    /** Database column AMENDM_FEE_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeInsurCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_INSUR_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_GROUP SqlType(NUMBER) */
    val courierChGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_GROUP")
    /** Database column COURIER_CH_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val courierChGroupCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_GROUP_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_DIRECT SqlType(NUMBER) */
    val courierChDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_DIRECT")
    /** Database column COURIER_CH_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val courierChDirectCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_INDIRECT SqlType(NUMBER) */
    val courierChIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_INDIRECT")
    /** Database column COURIER_CH_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val courierChIndirectCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_INSUR SqlType(NUMBER) */
    val courierChInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_INSUR")
    /** Database column COURIER_CH_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val courierChInsurCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_INSUR_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_GROUP SqlType(NUMBER) */
    val expensesGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_GROUP")
    /** Database column EXPENSES_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val expensesGroupCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_GROUP_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_DIRECT SqlType(NUMBER) */
    val expensesDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_DIRECT")
    /** Database column EXPENSES_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val expensesDirectCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_INDIRECT SqlType(NUMBER) */
    val expensesIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_INDIRECT")
    /** Database column EXPENSES_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val expensesIndirectCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_INSUR SqlType(NUMBER) */
    val expensesInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_INSUR")
    /** Database column EXPENSES_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val expensesInsurCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_INSUR_CUR", O.Length(3,varying=false))
    /** Database column REFERABLE_AVAL_COMM SqlType(CHAR) */
    val referableAvalComm: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_AVAL_COMM")
    /** Database column REFERABLE_MIN_COMM SqlType(CHAR) */
    val referableMinComm: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_MIN_COMM")
    /** Database column REFERABLE_FIX_COMM SqlType(CHAR) */
    val referableFixComm: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_FIX_COMM")
    /** Database column REFERABLE_PROCESSING_FEE SqlType(CHAR) */
    val referableProcessingFee: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_PROCESSING_FEE")
    /** Database column REFERABLE_MIN_FEE SqlType(CHAR) */
    val referableMinFee: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_MIN_FEE")
    /** Database column REFERABLE_FIX_FEE SqlType(CHAR) */
    val referableFixFee: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_FIX_FEE")
    /** Database column VALID_FROM SqlType(DATE) */
    val validFrom: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VALID_FROM")
    /** Database column CURRENCY_PERIOD SqlType(CHAR) */
    val currencyPeriod: Rep[Option[Char]] = column[Option[Char]]("CURRENCY_PERIOD")
    /** Database column DAY_COUNT_FRACTION_PL_QL SqlType(CHAR) */
    val dayCountFractionPlQl: Rep[Option[Char]] = column[Option[Char]]("DAY_COUNT_FRACTION_PL_QL")
    /** Database column GROUP_COMM_PORTION SqlType(NUMBER) */
    val groupCommPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GROUP_COMM_PORTION")
    /** Database column THIRD_PARTY_COMM_PORTION SqlType(NUMBER) */
    val thirdPartyCommPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("THIRD_PARTY_COMM_PORTION")
    /** Database column MIN_NOMINAL_COMM SqlType(NUMBER) */
    val minNominalComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_NOMINAL_COMM")
    /** Database column MIN_NOMINAL_COMM_CUR SqlType(CHAR), Length(3,false) */
    val minNominalCommCur: Rep[Option[String]] = column[Option[String]]("MIN_NOMINAL_COMM_CUR", O.Length(3,varying=false))
    /** Database column MIN_NOMINAL_COMM_PERIOD SqlType(CHAR) */
    val minNominalCommPeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_NOMINAL_COMM_PERIOD")
    /** Database column MIN_OBLIGO_COMM SqlType(NUMBER) */
    val minObligoComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_OBLIGO_COMM")
    /** Database column MIN_OBLIGO_COMM_CUR SqlType(CHAR), Length(3,false) */
    val minObligoCommCur: Rep[Option[String]] = column[Option[String]]("MIN_OBLIGO_COMM_CUR", O.Length(3,varying=false))
    /** Database column MIN_OBLIGO_COMM_PERIOD SqlType(CHAR) */
    val minObligoCommPeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_OBLIGO_COMM_PERIOD")
    /** Database column FIX_COMM SqlType(NUMBER) */
    val fixComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIX_COMM")
    /** Database column FIX_COMM_CUR SqlType(CHAR), Length(3,false) */
    val fixCommCur: Rep[Option[String]] = column[Option[String]]("FIX_COMM_CUR", O.Length(3,varying=false))
    /** Database column FIX_COMM_PERIOD SqlType(CHAR) */
    val fixCommPeriod: Rep[Option[Char]] = column[Option[Char]]("FIX_COMM_PERIOD")
    /** Database column GROUP_FEE_PORTION SqlType(NUMBER) */
    val groupFeePortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GROUP_FEE_PORTION")
    /** Database column THIRD_PARTY_FEE_PORTION SqlType(NUMBER) */
    val thirdPartyFeePortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("THIRD_PARTY_FEE_PORTION")
    /** Database column MIN_FEE SqlType(NUMBER) */
    val minFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_FEE")
    /** Database column MIN_FEE_CUR SqlType(CHAR), Length(3,false) */
    val minFeeCur: Rep[Option[String]] = column[Option[String]]("MIN_FEE_CUR", O.Length(3,varying=false))
    /** Database column MIN_FEE_PERIOD SqlType(CHAR) */
    val minFeePeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_FEE_PERIOD")
    /** Database column MIN_OBLIGO_FEE SqlType(NUMBER) */
    val minObligoFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_OBLIGO_FEE")
    /** Database column MIN_OBLIGO_FEE_CUR SqlType(CHAR), Length(3,false) */
    val minObligoFeeCur: Rep[Option[String]] = column[Option[String]]("MIN_OBLIGO_FEE_CUR", O.Length(3,varying=false))
    /** Database column MIN_OBLIGO_FEE_PERIOD SqlType(CHAR) */
    val minObligoFeePeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_OBLIGO_FEE_PERIOD")
    /** Database column FIX_FEE SqlType(NUMBER) */
    val fixFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIX_FEE")
    /** Database column FIX_FEE_CUR SqlType(CHAR), Length(3,false) */
    val fixFeeCur: Rep[Option[String]] = column[Option[String]]("FIX_FEE_CUR", O.Length(3,varying=false))
    /** Database column FIX_FEE_PERIOD SqlType(CHAR) */
    val fixFeePeriod: Rep[Option[Char]] = column[Option[Char]]("FIX_FEE_PERIOD")
    /** Database column MAT_NUMBER_PERIODIC_FEE SqlType(VARCHAR2), Length(18,true) */
    val matNumberPeriodicFee: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_PERIODIC_FEE", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_SINGULAR SqlType(VARCHAR2), Length(18,true) */
    val matNumberSingular: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_SINGULAR", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_CREATION_FEE SqlType(VARCHAR2), Length(18,true) */
    val matNumberCreationFee: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_CREATION_FEE", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_SUPPLEMENT_FEE SqlType(VARCHAR2), Length(18,true) */
    val matNumberSupplementFee: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_SUPPLEMENT_FEE", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_COURIER_COST SqlType(VARCHAR2), Length(18,true) */
    val matNumberCourierCost: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_COURIER_COST", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_EXPENSES SqlType(VARCHAR2), Length(18,true) */
    val matNumberExpenses: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_EXPENSES", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_CHARGES SqlType(VARCHAR2), Length(18,true) */
    val matNumberCharges: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_CHARGES", O.Length(18,varying=true))

    /** Foreign key referencing AccountingArea (database name B_FK_OBJECTIDC) */
    lazy val accountingAreaFk = foreignKey("B_FK_OBJECTIDC", objectidc :: HNil, AccountingArea)(r => r.objectidc :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing BareDependants (database name B_FK_PARENT) */
    lazy val bareDependantsFk = foreignKey("B_FK_PARENT", parent :: HNil, BareDependants)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_PERIODIC_DEF_BANK_COM_REC) */
    lazy val commissionReceiverFk3 = foreignKey("B_FK_PERIODIC_DEF_BANK_COM_REC", periodicDefBankComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_PERIODIC_DEF_GROUP_COM_3) */
    lazy val commissionReceiverFk4 = foreignKey("B_FK_PERIODIC_DEF_GROUP_COM_3", periodicDefGroupComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_PERIODIC_DEF_IND_BANK_C5) */
    lazy val commissionReceiverFk5 = foreignKey("B_FK_PERIODIC_DEF_IND_BANK_C5", periodicDefIndBankComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_PERIODIC_DEF_INSURANCE_6) */
    lazy val commissionReceiverFk6 = foreignKey("B_FK_PERIODIC_DEF_INSURANCE_6", periodicDefInsuranceComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_SINGULAR_DEF_BANK_COM_REC) */
    lazy val commissionReceiverFk7 = foreignKey("B_FK_SINGULAR_DEF_BANK_COM_REC", singularDefBankComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_SINGULAR_DEF_GROUP_COM_7) */
    lazy val commissionReceiverFk8 = foreignKey("B_FK_SINGULAR_DEF_GROUP_COM_7", singularDefGroupComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_SINGULAR_DEF_IND_BANK_C9) */
    lazy val commissionReceiverFk9 = foreignKey("B_FK_SINGULAR_DEF_IND_BANK_C9", singularDefIndBankComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name B_FK_SINGULAR_DEF_INSUR_COM_10) */
    lazy val commissionReceiverFk10 = foreignKey("B_FK_SINGULAR_DEF_INSUR_COM_10", singularDefInsurComRec :: HNil, CommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_AMENDM_FEE_DIRECT_CUR) */
    lazy val currencyFk11 = foreignKey("B_FK_AMENDM_FEE_DIRECT_CUR", amendmFeeDirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_AMENDM_FEE_GROUP_CUR) */
    lazy val currencyFk12 = foreignKey("B_FK_AMENDM_FEE_GROUP_CUR", amendmFeeGroupCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_AMENDM_FEE_INDIRECT_CUR) */
    lazy val currencyFk13 = foreignKey("B_FK_AMENDM_FEE_INDIRECT_CUR", amendmFeeIndirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_AMENDM_FEE_INSUR_CUR) */
    lazy val currencyFk14 = foreignKey("B_FK_AMENDM_FEE_INSUR_CUR", amendmFeeInsurCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_COURIER_CH_DIRECT_CUR) */
    lazy val currencyFk15 = foreignKey("B_FK_COURIER_CH_DIRECT_CUR", courierChDirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_COURIER_CH_GROUP_CUR) */
    lazy val currencyFk16 = foreignKey("B_FK_COURIER_CH_GROUP_CUR", courierChGroupCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_COURIER_CH_INDIRECT_CUR) */
    lazy val currencyFk17 = foreignKey("B_FK_COURIER_CH_INDIRECT_CUR", courierChIndirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_COURIER_CH_INSUR_CUR) */
    lazy val currencyFk18 = foreignKey("B_FK_COURIER_CH_INSUR_CUR", courierChInsurCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_CREATION_FEE_DIRECT_CUR) */
    lazy val currencyFk19 = foreignKey("B_FK_CREATION_FEE_DIRECT_CUR", creationFeeDirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_CREATION_FEE_GROUP_CUR) */
    lazy val currencyFk20 = foreignKey("B_FK_CREATION_FEE_GROUP_CUR", creationFeeGroupCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_CREATION_FEE_INDIRECT_CUR) */
    lazy val currencyFk21 = foreignKey("B_FK_CREATION_FEE_INDIRECT_CUR", creationFeeIndirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_CREATION_FEE_INSUR_CUR) */
    lazy val currencyFk22 = foreignKey("B_FK_CREATION_FEE_INSUR_CUR", creationFeeInsurCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_CURRENCY_ISO_CODE) */
    lazy val currencyFk23 = foreignKey("B_FK_CURRENCY_ISO_CODE", currencyIsoCode :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_EXPENSES_DIRECT_CUR) */
    lazy val currencyFk24 = foreignKey("B_FK_EXPENSES_DIRECT_CUR", expensesDirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_EXPENSES_GROUP_CUR) */
    lazy val currencyFk25 = foreignKey("B_FK_EXPENSES_GROUP_CUR", expensesGroupCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_EXPENSES_INDIRECT_CUR) */
    lazy val currencyFk26 = foreignKey("B_FK_EXPENSES_INDIRECT_CUR", expensesIndirectCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_EXPENSES_INSUR_CUR) */
    lazy val currencyFk27 = foreignKey("B_FK_EXPENSES_INSUR_CUR", expensesInsurCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_FIX_COMM_CUR) */
    lazy val currencyFk28 = foreignKey("B_FK_FIX_COMM_CUR", fixCommCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_FIX_FEE_CUR) */
    lazy val currencyFk29 = foreignKey("B_FK_FIX_FEE_CUR", fixFeeCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_INV_CURRENCY_ISO_CODE) */
    lazy val currencyFk30 = foreignKey("B_FK_INV_CURRENCY_ISO_CODE", invCurrencyIsoCode :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_MIN_ACC_AMOUNT_PROV_CUR) */
    lazy val currencyFk31 = foreignKey("B_FK_MIN_ACC_AMOUNT_PROV_CUR", minAccAmountProvCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_MIN_FEE_CUR) */
    lazy val cgurrencyFk32 = foreignKey("B_FK_MIN_FEE_CUR", minFeeCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_MIN_NOMINAL_COMM_CUR) */
    lazy val currencyFk33 = foreignKey("B_FK_MIN_NOMINAL_COMM_CUR", minNominalCommCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_MIN_OBLIGO_COMM_CUR) */
    lazy val currencyFk34 = foreignKey("B_FK_MIN_OBLIGO_COMM_CUR", minObligoCommCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name B_FK_MIN_OBLIGO_FEE_CUR) */
    lazy val currencyFk35 = foreignKey("B_FK_MIN_OBLIGO_FEE_CUR", minObligoFeeCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing DivisionUser (database name B_FK_BALANCE_SHEET_REC_USER_ID) */
    lazy val divisionUserFk = foreignKey("B_FK_BALANCE_SHEET_REC_USER_ID", balanceSheetRecUserId :: HNil, DivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Org (database name B_FK_A_ORG_ID) */
    lazy val orgFk = foreignKey("B_FK_A_ORG_ID", aOrgId :: HNil, Org)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BareDependants */
  lazy val BareDependants = new TableQuery(tag => new BareDependants(tag))

  /** Row type of table BareDependantsHistory */
  type BareDependantsHistoryRow = HCons[String,HCons[scala.math.BigDecimal,HCons[Option[String],HCons[String,HCons[String,HCons[Char,HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for BareDependantsHistoryRow providing default values if available in the database schema. */
  def BareDependantsHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], invoicingPermitted: Option[Char], parent: Option[String], currencyIsoCode: Option[String], toBeExcludedFromBsReport: Option[Char], balanceSheetRecUserId: Option[String], disclosureArePattern: Option[String], periodicDefGroupComRec: Option[String], periodicDefBankComRec: Option[String], periodicDefIndBankComRec: Option[String], periodicDefInsuranceComRec: Option[String], singularDefGroupComRec: Option[String], singularDefBankComRec: Option[String], singularDefIndBankComRec: Option[String], singularDefInsurComRec: Option[String], individualParticipation: Option[Char], invFirstPassDate: Option[java.sql.Timestamp], considerStartPeriod: Option[Char], invStartDate: Option[java.sql.Timestamp], invCurrencyIsoCode: Option[String], aOrgId: Option[String], salesOffice: Option[String], billingSystem: Option[Char], fileNamePrefix: Option[String], sapUserName: Option[String], serverUpload: Option[Char], minAccAmountProv: Option[scala.math.BigDecimal], minAccAmountProvCur: Option[String], creationFeeGroup: Option[scala.math.BigDecimal], creationFeeGroupCur: Option[String], creationFeeDirect: Option[scala.math.BigDecimal], creationFeeDirectCur: Option[String], creationFeeIndirect: Option[scala.math.BigDecimal], creationFeeIndirectCur: Option[String], creationFeeInsur: Option[scala.math.BigDecimal], creationFeeInsurCur: Option[String], amendmFeeGroup: Option[scala.math.BigDecimal], amendmFeeGroupCur: Option[String], amendmFeeDirect: Option[scala.math.BigDecimal], amendmFeeDirectCur: Option[String], amendmFeeIndirect: Option[scala.math.BigDecimal], amendmFeeIndirectCur: Option[String], amendmFeeInsur: Option[scala.math.BigDecimal], amendmFeeInsurCur: Option[String], courierChGroup: Option[scala.math.BigDecimal], courierChGroupCur: Option[String], courierChDirect: Option[scala.math.BigDecimal], courierChDirectCur: Option[String], courierChIndirect: Option[scala.math.BigDecimal], courierChIndirectCur: Option[String], courierChInsur: Option[scala.math.BigDecimal], courierChInsurCur: Option[String], expensesGroup: Option[scala.math.BigDecimal], expensesGroupCur: Option[String], expensesDirect: Option[scala.math.BigDecimal], expensesDirectCur: Option[String], expensesIndirect: Option[scala.math.BigDecimal], expensesIndirectCur: Option[String], expensesInsur: Option[scala.math.BigDecimal], expensesInsurCur: Option[String], referableAvalComm: Option[Char], referableMinComm: Option[Char], referableFixComm: Option[Char], referableProcessingFee: Option[Char], referableMinFee: Option[Char], referableFixFee: Option[Char], validFrom: Option[java.sql.Timestamp], currencyPeriod: Option[Char], dayCountFractionPlQl: Option[Char], groupCommPortion: Option[scala.math.BigDecimal], thirdPartyCommPortion: Option[scala.math.BigDecimal], minNominalComm: Option[scala.math.BigDecimal], minNominalCommCur: Option[String], minNominalCommPeriod: Option[Char], minObligoComm: Option[scala.math.BigDecimal], minObligoCommCur: Option[String], minObligoCommPeriod: Option[Char], fixComm: Option[scala.math.BigDecimal], fixCommCur: Option[String], fixCommPeriod: Option[Char], groupFeePortion: Option[scala.math.BigDecimal], thirdPartyFeePortion: Option[scala.math.BigDecimal], minFee: Option[scala.math.BigDecimal], minFeeCur: Option[String], minFeePeriod: Option[Char], minObligoFee: Option[scala.math.BigDecimal], minObligoFeeCur: Option[String], minObligoFeePeriod: Option[Char], fixFee: Option[scala.math.BigDecimal], fixFeeCur: Option[String], fixFeePeriod: Option[Char], matNumberPeriodicFee: Option[String], matNumberSingular: Option[String], matNumberCreationFee: Option[String], matNumberSupplementFee: Option[String], matNumberCourierCost: Option[String], matNumberExpenses: Option[String], matNumberCharges: Option[String], groupCommissionRecSet: Option[String], bankCommissionRecSet: Option[String], indBankCommissionRecSet: Option[String], insuranceCommissionRecSet: Option[String]): BareDependantsHistoryRow = {
    objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: invoicingPermitted :: parent :: currencyIsoCode :: toBeExcludedFromBsReport :: balanceSheetRecUserId :: disclosureArePattern :: periodicDefGroupComRec :: periodicDefBankComRec :: periodicDefIndBankComRec :: periodicDefInsuranceComRec :: singularDefGroupComRec :: singularDefBankComRec :: singularDefIndBankComRec :: singularDefInsurComRec :: individualParticipation :: invFirstPassDate :: considerStartPeriod :: invStartDate :: invCurrencyIsoCode :: aOrgId :: salesOffice :: billingSystem :: fileNamePrefix :: sapUserName :: serverUpload :: minAccAmountProv :: minAccAmountProvCur :: creationFeeGroup :: creationFeeGroupCur :: creationFeeDirect :: creationFeeDirectCur :: creationFeeIndirect :: creationFeeIndirectCur :: creationFeeInsur :: creationFeeInsurCur :: amendmFeeGroup :: amendmFeeGroupCur :: amendmFeeDirect :: amendmFeeDirectCur :: amendmFeeIndirect :: amendmFeeIndirectCur :: amendmFeeInsur :: amendmFeeInsurCur :: courierChGroup :: courierChGroupCur :: courierChDirect :: courierChDirectCur :: courierChIndirect :: courierChIndirectCur :: courierChInsur :: courierChInsurCur :: expensesGroup :: expensesGroupCur :: expensesDirect :: expensesDirectCur :: expensesIndirect :: expensesIndirectCur :: expensesInsur :: expensesInsurCur :: referableAvalComm :: referableMinComm :: referableFixComm :: referableProcessingFee :: referableMinFee :: referableFixFee :: validFrom :: currencyPeriod :: dayCountFractionPlQl :: groupCommPortion :: thirdPartyCommPortion :: minNominalComm :: minNominalCommCur :: minNominalCommPeriod :: minObligoComm :: minObligoCommCur :: minObligoCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: groupFeePortion :: thirdPartyFeePortion :: minFee :: minFeeCur :: minFeePeriod :: minObligoFee :: minObligoFeeCur :: minObligoFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: matNumberPeriodicFee :: matNumberSingular :: matNumberCreationFee :: matNumberSupplementFee :: matNumberCourierCost :: matNumberExpenses :: matNumberCharges :: groupCommissionRecSet :: bankCommissionRecSet :: indBankCommissionRecSet :: insuranceCommissionRecSet :: HNil
  }
  /** GetResult implicit for fetching BareDependantsHistoryRow objects using plain SQL queries */
  implicit def GetResultBareDependantsHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]], e6: GR[Option[scala.math.BigDecimal]]): GR[BareDependantsHistoryRow] = GR{
    prs => import prs._
      <<[String] :: <<[scala.math.BigDecimal] :: <<?[String] :: <<[String] :: <<[String] :: <<[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BARE_DEPENDANTS_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class BareDependantsHistory(_tableTag: Tag) extends profile.api.Table[BareDependantsHistoryRow](_tableTag, Some("WERNER2"), tablePrefix + "BARE_DEPENDANTS_HISTORY") {
    def * = objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: invoicingPermitted :: parent :: currencyIsoCode :: toBeExcludedFromBsReport :: balanceSheetRecUserId :: disclosureArePattern :: periodicDefGroupComRec :: periodicDefBankComRec :: periodicDefIndBankComRec :: periodicDefInsuranceComRec :: singularDefGroupComRec :: singularDefBankComRec :: singularDefIndBankComRec :: singularDefInsurComRec :: individualParticipation :: invFirstPassDate :: considerStartPeriod :: invStartDate :: invCurrencyIsoCode :: aOrgId :: salesOffice :: billingSystem :: fileNamePrefix :: sapUserName :: serverUpload :: minAccAmountProv :: minAccAmountProvCur :: creationFeeGroup :: creationFeeGroupCur :: creationFeeDirect :: creationFeeDirectCur :: creationFeeIndirect :: creationFeeIndirectCur :: creationFeeInsur :: creationFeeInsurCur :: amendmFeeGroup :: amendmFeeGroupCur :: amendmFeeDirect :: amendmFeeDirectCur :: amendmFeeIndirect :: amendmFeeIndirectCur :: amendmFeeInsur :: amendmFeeInsurCur :: courierChGroup :: courierChGroupCur :: courierChDirect :: courierChDirectCur :: courierChIndirect :: courierChIndirectCur :: courierChInsur :: courierChInsurCur :: expensesGroup :: expensesGroupCur :: expensesDirect :: expensesDirectCur :: expensesIndirect :: expensesIndirectCur :: expensesInsur :: expensesInsurCur :: referableAvalComm :: referableMinComm :: referableFixComm :: referableProcessingFee :: referableMinFee :: referableFixFee :: validFrom :: currencyPeriod :: dayCountFractionPlQl :: groupCommPortion :: thirdPartyCommPortion :: minNominalComm :: minNominalCommCur :: minNominalCommPeriod :: minObligoComm :: minObligoCommCur :: minObligoCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: groupFeePortion :: thirdPartyFeePortion :: minFee :: minFeeCur :: minFeePeriod :: minObligoFee :: minObligoFeeCur :: minObligoFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: matNumberPeriodicFee :: matNumberSingular :: matNumberCreationFee :: matNumberSupplementFee :: matNumberCourierCost :: matNumberExpenses :: matNumberCharges :: groupCommissionRecSet :: bankCommissionRecSet :: indBankCommissionRecSet :: insuranceCommissionRecSet :: HNil

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
    /** Database column INVOICING_PERMITTED SqlType(CHAR) */
    val invoicingPermitted: Rep[Option[Char]] = column[Option[Char]]("INVOICING_PERMITTED")
    /** Database column PARENT SqlType(VARCHAR2), Length(4,true) */
    val parent: Rep[Option[String]] = column[Option[String]]("PARENT", O.Length(4,varying=true))
    /** Database column CURRENCY_ISO_CODE SqlType(CHAR), Length(3,false) */
    val currencyIsoCode: Rep[Option[String]] = column[Option[String]]("CURRENCY_ISO_CODE", O.Length(3,varying=false))
    /** Database column TO_BE_EXCLUDED_FROM_BS_REPORT SqlType(CHAR) */
    val toBeExcludedFromBsReport: Rep[Option[Char]] = column[Option[Char]]("TO_BE_EXCLUDED_FROM_BS_REPORT")
    /** Database column BALANCE_SHEET_REC_USER_ID SqlType(VARCHAR2), Length(40,true) */
    val balanceSheetRecUserId: Rep[Option[String]] = column[Option[String]]("BALANCE_SHEET_REC_USER_ID", O.Length(40,varying=true))
    /** Database column DISCLOSURE_ARE_PATTERN SqlType(VARCHAR2), Length(200,true) */
    val disclosureArePattern: Rep[Option[String]] = column[Option[String]]("DISCLOSURE_ARE_PATTERN", O.Length(200,varying=true))
    /** Database column PERIODIC_DEF_GROUP_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefGroupComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_GROUP_COM_REC", O.Length(5,varying=true))
    /** Database column PERIODIC_DEF_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefBankComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column PERIODIC_DEF_IND_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefIndBankComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_IND_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column PERIODIC_DEF_INSURANCE_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val periodicDefInsuranceComRec: Rep[Option[String]] = column[Option[String]]("PERIODIC_DEF_INSURANCE_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_GROUP_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefGroupComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_GROUP_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefBankComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_IND_BANK_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefIndBankComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_IND_BANK_COM_REC", O.Length(5,varying=true))
    /** Database column SINGULAR_DEF_INSUR_COM_REC SqlType(VARCHAR2), Length(5,true) */
    val singularDefInsurComRec: Rep[Option[String]] = column[Option[String]]("SINGULAR_DEF_INSUR_COM_REC", O.Length(5,varying=true))
    /** Database column INDIVIDUAL_PARTICIPATION SqlType(CHAR) */
    val individualParticipation: Rep[Option[Char]] = column[Option[Char]]("INDIVIDUAL_PARTICIPATION")
    /** Database column INV_FIRST_PASS_DATE SqlType(DATE) */
    val invFirstPassDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INV_FIRST_PASS_DATE")
    /** Database column CONSIDER_START_PERIOD SqlType(CHAR) */
    val considerStartPeriod: Rep[Option[Char]] = column[Option[Char]]("CONSIDER_START_PERIOD")
    /** Database column INV_START_DATE SqlType(DATE) */
    val invStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INV_START_DATE")
    /** Database column INV_CURRENCY_ISO_CODE SqlType(CHAR), Length(3,false) */
    val invCurrencyIsoCode: Rep[Option[String]] = column[Option[String]]("INV_CURRENCY_ISO_CODE", O.Length(3,varying=false))
    /** Database column A_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val aOrgId: Rep[Option[String]] = column[Option[String]]("A_ORG_ID", O.Length(10,varying=true))
    /** Database column SALES_OFFICE SqlType(VARCHAR2), Length(4,true) */
    val salesOffice: Rep[Option[String]] = column[Option[String]]("SALES_OFFICE", O.Length(4,varying=true))
    /** Database column BILLING_SYSTEM SqlType(CHAR) */
    val billingSystem: Rep[Option[Char]] = column[Option[Char]]("BILLING_SYSTEM")
    /** Database column FILE_NAME_PREFIX SqlType(VARCHAR2), Length(50,true) */
    val fileNamePrefix: Rep[Option[String]] = column[Option[String]]("FILE_NAME_PREFIX", O.Length(50,varying=true))
    /** Database column SAP_USER_NAME SqlType(VARCHAR2), Length(12,true) */
    val sapUserName: Rep[Option[String]] = column[Option[String]]("SAP_USER_NAME", O.Length(12,varying=true))
    /** Database column SERVER_UPLOAD SqlType(CHAR) */
    val serverUpload: Rep[Option[Char]] = column[Option[Char]]("SERVER_UPLOAD")
    /** Database column MIN_ACC_AMOUNT_PROV SqlType(NUMBER) */
    val minAccAmountProv: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_ACC_AMOUNT_PROV")
    /** Database column MIN_ACC_AMOUNT_PROV_CUR SqlType(CHAR), Length(3,false) */
    val minAccAmountProvCur: Rep[Option[String]] = column[Option[String]]("MIN_ACC_AMOUNT_PROV_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_GROUP SqlType(NUMBER) */
    val creationFeeGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_GROUP")
    /** Database column CREATION_FEE_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeGroupCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_GROUP_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_DIRECT SqlType(NUMBER) */
    val creationFeeDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_DIRECT")
    /** Database column CREATION_FEE_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeDirectCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_INDIRECT SqlType(NUMBER) */
    val creationFeeIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_INDIRECT")
    /** Database column CREATION_FEE_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeIndirectCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column CREATION_FEE_INSUR SqlType(NUMBER) */
    val creationFeeInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE_INSUR")
    /** Database column CREATION_FEE_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val creationFeeInsurCur: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_INSUR_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_GROUP SqlType(NUMBER) */
    val amendmFeeGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_GROUP")
    /** Database column AMENDM_FEE_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeGroupCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_GROUP_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_DIRECT SqlType(NUMBER) */
    val amendmFeeDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_DIRECT")
    /** Database column AMENDM_FEE_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeDirectCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_INDIRECT SqlType(NUMBER) */
    val amendmFeeIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_INDIRECT")
    /** Database column AMENDM_FEE_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeIndirectCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column AMENDM_FEE_INSUR SqlType(NUMBER) */
    val amendmFeeInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMENDM_FEE_INSUR")
    /** Database column AMENDM_FEE_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val amendmFeeInsurCur: Rep[Option[String]] = column[Option[String]]("AMENDM_FEE_INSUR_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_GROUP SqlType(NUMBER) */
    val courierChGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_GROUP")
    /** Database column COURIER_CH_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val courierChGroupCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_GROUP_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_DIRECT SqlType(NUMBER) */
    val courierChDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_DIRECT")
    /** Database column COURIER_CH_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val courierChDirectCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_INDIRECT SqlType(NUMBER) */
    val courierChIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_INDIRECT")
    /** Database column COURIER_CH_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val courierChIndirectCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column COURIER_CH_INSUR SqlType(NUMBER) */
    val courierChInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CH_INSUR")
    /** Database column COURIER_CH_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val courierChInsurCur: Rep[Option[String]] = column[Option[String]]("COURIER_CH_INSUR_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_GROUP SqlType(NUMBER) */
    val expensesGroup: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_GROUP")
    /** Database column EXPENSES_GROUP_CUR SqlType(CHAR), Length(3,false) */
    val expensesGroupCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_GROUP_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_DIRECT SqlType(NUMBER) */
    val expensesDirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_DIRECT")
    /** Database column EXPENSES_DIRECT_CUR SqlType(CHAR), Length(3,false) */
    val expensesDirectCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_DIRECT_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_INDIRECT SqlType(NUMBER) */
    val expensesIndirect: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_INDIRECT")
    /** Database column EXPENSES_INDIRECT_CUR SqlType(CHAR), Length(3,false) */
    val expensesIndirectCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_INDIRECT_CUR", O.Length(3,varying=false))
    /** Database column EXPENSES_INSUR SqlType(NUMBER) */
    val expensesInsur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES_INSUR")
    /** Database column EXPENSES_INSUR_CUR SqlType(CHAR), Length(3,false) */
    val expensesInsurCur: Rep[Option[String]] = column[Option[String]]("EXPENSES_INSUR_CUR", O.Length(3,varying=false))
    /** Database column REFERABLE_AVAL_COMM SqlType(CHAR) */
    val referableAvalComm: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_AVAL_COMM")
    /** Database column REFERABLE_MIN_COMM SqlType(CHAR) */
    val referableMinComm: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_MIN_COMM")
    /** Database column REFERABLE_FIX_COMM SqlType(CHAR) */
    val referableFixComm: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_FIX_COMM")
    /** Database column REFERABLE_PROCESSING_FEE SqlType(CHAR) */
    val referableProcessingFee: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_PROCESSING_FEE")
    /** Database column REFERABLE_MIN_FEE SqlType(CHAR) */
    val referableMinFee: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_MIN_FEE")
    /** Database column REFERABLE_FIX_FEE SqlType(CHAR) */
    val referableFixFee: Rep[Option[Char]] = column[Option[Char]]("REFERABLE_FIX_FEE")
    /** Database column VALID_FROM SqlType(DATE) */
    val validFrom: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VALID_FROM")
    /** Database column CURRENCY_PERIOD SqlType(CHAR) */
    val currencyPeriod: Rep[Option[Char]] = column[Option[Char]]("CURRENCY_PERIOD")
    /** Database column DAY_COUNT_FRACTION_PL_QL SqlType(CHAR) */
    val dayCountFractionPlQl: Rep[Option[Char]] = column[Option[Char]]("DAY_COUNT_FRACTION_PL_QL")
    /** Database column GROUP_COMM_PORTION SqlType(NUMBER) */
    val groupCommPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GROUP_COMM_PORTION")
    /** Database column THIRD_PARTY_COMM_PORTION SqlType(NUMBER) */
    val thirdPartyCommPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("THIRD_PARTY_COMM_PORTION")
    /** Database column MIN_NOMINAL_COMM SqlType(NUMBER) */
    val minNominalComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_NOMINAL_COMM")
    /** Database column MIN_NOMINAL_COMM_CUR SqlType(CHAR), Length(3,false) */
    val minNominalCommCur: Rep[Option[String]] = column[Option[String]]("MIN_NOMINAL_COMM_CUR", O.Length(3,varying=false))
    /** Database column MIN_NOMINAL_COMM_PERIOD SqlType(CHAR) */
    val minNominalCommPeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_NOMINAL_COMM_PERIOD")
    /** Database column MIN_OBLIGO_COMM SqlType(NUMBER) */
    val minObligoComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_OBLIGO_COMM")
    /** Database column MIN_OBLIGO_COMM_CUR SqlType(CHAR), Length(3,false) */
    val minObligoCommCur: Rep[Option[String]] = column[Option[String]]("MIN_OBLIGO_COMM_CUR", O.Length(3,varying=false))
    /** Database column MIN_OBLIGO_COMM_PERIOD SqlType(CHAR) */
    val minObligoCommPeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_OBLIGO_COMM_PERIOD")
    /** Database column FIX_COMM SqlType(NUMBER) */
    val fixComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIX_COMM")
    /** Database column FIX_COMM_CUR SqlType(CHAR), Length(3,false) */
    val fixCommCur: Rep[Option[String]] = column[Option[String]]("FIX_COMM_CUR", O.Length(3,varying=false))
    /** Database column FIX_COMM_PERIOD SqlType(CHAR) */
    val fixCommPeriod: Rep[Option[Char]] = column[Option[Char]]("FIX_COMM_PERIOD")
    /** Database column GROUP_FEE_PORTION SqlType(NUMBER) */
    val groupFeePortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GROUP_FEE_PORTION")
    /** Database column THIRD_PARTY_FEE_PORTION SqlType(NUMBER) */
    val thirdPartyFeePortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("THIRD_PARTY_FEE_PORTION")
    /** Database column MIN_FEE SqlType(NUMBER) */
    val minFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_FEE")
    /** Database column MIN_FEE_CUR SqlType(CHAR), Length(3,false) */
    val minFeeCur: Rep[Option[String]] = column[Option[String]]("MIN_FEE_CUR", O.Length(3,varying=false))
    /** Database column MIN_FEE_PERIOD SqlType(CHAR) */
    val minFeePeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_FEE_PERIOD")
    /** Database column MIN_OBLIGO_FEE SqlType(NUMBER) */
    val minObligoFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_OBLIGO_FEE")
    /** Database column MIN_OBLIGO_FEE_CUR SqlType(CHAR), Length(3,false) */
    val minObligoFeeCur: Rep[Option[String]] = column[Option[String]]("MIN_OBLIGO_FEE_CUR", O.Length(3,varying=false))
    /** Database column MIN_OBLIGO_FEE_PERIOD SqlType(CHAR) */
    val minObligoFeePeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_OBLIGO_FEE_PERIOD")
    /** Database column FIX_FEE SqlType(NUMBER) */
    val fixFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIX_FEE")
    /** Database column FIX_FEE_CUR SqlType(CHAR), Length(3,false) */
    val fixFeeCur: Rep[Option[String]] = column[Option[String]]("FIX_FEE_CUR", O.Length(3,varying=false))
    /** Database column FIX_FEE_PERIOD SqlType(CHAR) */
    val fixFeePeriod: Rep[Option[Char]] = column[Option[Char]]("FIX_FEE_PERIOD")
    /** Database column MAT_NUMBER_PERIODIC_FEE SqlType(VARCHAR2), Length(18,true) */
    val matNumberPeriodicFee: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_PERIODIC_FEE", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_SINGULAR SqlType(VARCHAR2), Length(18,true) */
    val matNumberSingular: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_SINGULAR", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_CREATION_FEE SqlType(VARCHAR2), Length(18,true) */
    val matNumberCreationFee: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_CREATION_FEE", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_SUPPLEMENT_FEE SqlType(VARCHAR2), Length(18,true) */
    val matNumberSupplementFee: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_SUPPLEMENT_FEE", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_COURIER_COST SqlType(VARCHAR2), Length(18,true) */
    val matNumberCourierCost: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_COURIER_COST", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_EXPENSES SqlType(VARCHAR2), Length(18,true) */
    val matNumberExpenses: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_EXPENSES", O.Length(18,varying=true))
    /** Database column MAT_NUMBER_CHARGES SqlType(VARCHAR2), Length(18,true) */
    val matNumberCharges: Rep[Option[String]] = column[Option[String]]("MAT_NUMBER_CHARGES", O.Length(18,varying=true))
    /** Database column GROUP_COMMISSION_REC_SET SqlType(VARCHAR2), Length(385,true) */
    val groupCommissionRecSet: Rep[Option[String]] = column[Option[String]]("GROUP_COMMISSION_REC_SET", O.Length(385,varying=true))
    /** Database column BANK_COMMISSION_REC_SET SqlType(VARCHAR2), Length(385,true) */
    val bankCommissionRecSet: Rep[Option[String]] = column[Option[String]]("BANK_COMMISSION_REC_SET", O.Length(385,varying=true))
    /** Database column IND_BANK_COMMISSION_REC_SET SqlType(VARCHAR2), Length(385,true) */
    val indBankCommissionRecSet: Rep[Option[String]] = column[Option[String]]("IND_BANK_COMMISSION_REC_SET", O.Length(385,varying=true))
    /** Database column INSURANCE_COMMISSION_REC_SET SqlType(VARCHAR2), Length(385,true) */
    val insuranceCommissionRecSet: Rep[Option[String]] = column[Option[String]]("INSURANCE_COMMISSION_REC_SET", O.Length(385,varying=true))

    /** Primary key of BareDependantsHistory (database name BH_PK_OBJECTIDC) */
    val pk = primaryKey("BH_PK_OBJECTIDC", objectidc :: objectversionc :: HNil)
  }
  /** Collection-like TableQuery object for table BareDependantsHistory */
  lazy val BareDependantsHistory = new TableQuery(tag => new BareDependantsHistory(tag))

  /** Entity class storing rows of table BareRights
    *  @param bareCode Database column BARE_CODE SqlType(VARCHAR2), Length(4,true)
    *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param group Database column GROUP_ SqlType(CHAR)
    *  @param bank Database column BANK SqlType(CHAR)
    *  @param insurance Database column INSURANCE SqlType(CHAR)
    *  @param finFinc Database column FIN_FINC SqlType(CHAR)
    *  @param acc Database column ACC SqlType(CHAR) */
  case class BareRightsRow(bareCode: String, divisionIdc: String, group: Option[Char], bank: Option[Char], insurance: Option[Char], finFinc: Option[Char], acc: Option[Char])
  /** GetResult implicit for fetching BareRightsRow objects using plain SQL queries */
  implicit def GetResultBareRightsRow(implicit e0: GR[String], e1: GR[Option[Char]]): GR[BareRightsRow] = GR{
    prs => import prs._
      BareRightsRow.tupled((<<[String], <<[String], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_BARE_RIGHTS. Objects of this class serve as prototypes for rows in queries. */
  class BareRights(_tableTag: Tag) extends profile.api.Table[BareRightsRow](_tableTag, Some("WERNER2"), tablePrefix + "BARE_RIGHTS") {
    def * = (bareCode, divisionIdc, group, bank, insurance, finFinc, acc) <> (BareRightsRow.tupled, BareRightsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(bareCode), Rep.Some(divisionIdc), group, bank, insurance, finFinc, acc).shaped.<>({r=>import r._; _1.map(_=> BareRightsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val bareCode: Rep[String] = column[String]("BARE_CODE", O.Length(4,varying=true))
    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[String] = column[String]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column GROUP_ SqlType(CHAR) */
    val group: Rep[Option[Char]] = column[Option[Char]]("GROUP_")
    /** Database column BANK SqlType(CHAR) */
    val bank: Rep[Option[Char]] = column[Option[Char]]("BANK")
    /** Database column INSURANCE SqlType(CHAR) */
    val insurance: Rep[Option[Char]] = column[Option[Char]]("INSURANCE")
    /** Database column FIN_FINC SqlType(CHAR) */
    val finFinc: Rep[Option[Char]] = column[Option[Char]]("FIN_FINC")
    /** Database column ACC SqlType(CHAR) */
    val acc: Rep[Option[Char]] = column[Option[Char]]("ACC")

    /** Primary key of BareRights (database name BR_PK_BARE_CODE) */
    val pk = primaryKey("BR_PK_BARE_CODE", (bareCode, divisionIdc))

    /** Foreign key referencing BareDependants (database name BR_FK_BARE_CODE) */
    lazy val bareDependantsFk = foreignKey("BR_FK_BARE_CODE", bareCode, BareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Division (database name BR_FK_DIVISION_IDC) */
    lazy val divisionFk = foreignKey("BR_FK_DIVISION_IDC", divisionIdc, Division)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BareRights */
  lazy val BareRights = new TableQuery(tag => new BareRights(tag))



  /** Entity class storing rows of table GroupStructure
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param isUnitMandatory Database column IS_UNIT_MANDATORY SqlType(CHAR) */
  case class GroupStructureRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], isUnitMandatory: Option[Char])
  /** GetResult implicit for fetching GroupStructureRow objects using plain SQL queries */
  implicit def GetResultGroupStructureRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GroupStructureRow] = GR{
    prs => import prs._
      GroupStructureRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[Char]))
  }
  /** Table description of table GREAT_GROUP_STRUCTURE. Objects of this class serve as prototypes for rows in queries. */
  class GroupStructure(_tableTag: Tag) extends profile.api.Table[GroupStructureRow](_tableTag, Some("WERNER2"), tablePrefix + "GROUP_STRUCTURE") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, isUnitMandatory) <> (GroupStructureRow.tupled, GroupStructureRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, isUnitMandatory).shaped.<>({r=>import r._; _1.map(_=> GroupStructureRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column IS_UNIT_MANDATORY SqlType(CHAR) */
    val isUnitMandatory: Rep[Option[Char]] = column[Option[Char]]("IS_UNIT_MANDATORY")
  }
  /** Collection-like TableQuery object for table GroupStructure */
  lazy val GroupStructure = new TableQuery(tag => new GroupStructure(tag))

  /** Entity class storing rows of table GroupStructureHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param isUnitMandatory Database column IS_UNIT_MANDATORY SqlType(CHAR) */
  case class GroupStructureHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], isUnitMandatory: Option[Char])
  /** GetResult implicit for fetching GroupStructureHistoryRow objects using plain SQL queries */
  implicit def GetResultGroupStructureHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]]): GR[GroupStructureHistoryRow] = GR{
    prs => import prs._
      GroupStructureHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<?[Char]))
  }
  /** Table description of table GREAT_GROUP_STRUCTURE_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GroupStructureHistory(_tableTag: Tag) extends profile.api.Table[GroupStructureHistoryRow](_tableTag, Some("WERNER2"), tablePrefix + "GROUP_STRUCTURE_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, isUnitMandatory) <> (GroupStructureHistoryRow.tupled, GroupStructureHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, isUnitMandatory).shaped.<>({r=>import r._; _1.map(_=> GroupStructureHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column IS_UNIT_MANDATORY SqlType(CHAR) */
    val isUnitMandatory: Rep[Option[Char]] = column[Option[Char]]("IS_UNIT_MANDATORY")

    /** Primary key of GroupStructureHistory (database name GSH_PK_OBJECTIDC) */
    val pk = primaryKey("GSH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GroupStructureHistory */
  lazy val GroupStructureHistory = new TableQuery(tag => new GroupStructureHistory(tag))



  /** Entity class storing rows of table Person
    *  @param personKey Database column PERSON_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(82,true)
    *  @param appendix1 Database column APPENDIX1 SqlType(VARCHAR2), Length(500,true)
    *  @param appendix2 Database column APPENDIX2 SqlType(VARCHAR2), Length(200,true)
    *  @param appendix3 Database column APPENDIX3 SqlType(VARCHAR2), Length(200,true)
    *  @param iso3166Alpha3Code Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true)
    *  @param zip Database column ZIP SqlType(VARCHAR2), Length(14,true)
    *  @param city Database column CITY SqlType(VARCHAR2), Length(52,true)
    *  @param street Database column STREET SqlType(VARCHAR2), Length(200,true)
    *  @param telephone Database column TELEPHONE SqlType(VARCHAR2), Length(32,true)
    *  @param telefax Database column TELEFAX SqlType(VARCHAR2), Length(32,true)
    *  @param email Database column EMAIL SqlType(VARCHAR2), Length(100,true)
    *  @param ifa Database column IFA SqlType(VARCHAR2), Length(10,true)
    *  @param commentary Database column COMMENTARY SqlType(VARCHAR2), Length(128,true)
    *  @param employeeNumber Database column EMPLOYEE_NUMBER SqlType(VARCHAR2), Length(9,true)
    *  @param accountingAreaCode Database column ACCOUNTING_AREA_CODE SqlType(VARCHAR2), Length(4,true)
    *  @param nationalName Database column NATIONAL_NAME SqlType(NVARCHAR2), Length(82,true)
    *  @param nationalStreet Database column NATIONAL_STREET SqlType(NVARCHAR2), Length(200,true)
    *  @param nationalCity Database column NATIONAL_CITY SqlType(NVARCHAR2), Length(52,true)
    *  @param nationalAppendix1 Database column NATIONAL_APPENDIX1 SqlType(NVARCHAR2), Length(500,true)
    *  @param nationalAppendix2 Database column NATIONAL_APPENDIX2 SqlType(NVARCHAR2), Length(200,true)
    *  @param nationalAppendix3 Database column NATIONAL_APPENDIX3 SqlType(NVARCHAR2), Length(200,true) */
  case class PersonRow(personKey: String, name: Option[String], appendix1: Option[String], appendix2: Option[String], appendix3: Option[String], iso3166Alpha3Code: Option[String], zip: Option[String], city: Option[String], street: Option[String], telephone: Option[String], telefax: Option[String], email: Option[String], ifa: Option[String], commentary: Option[String], employeeNumber: Option[String], accountingAreaCode: Option[String], nationalName: Option[String], nationalStreet: Option[String], nationalCity: Option[String], nationalAppendix1: Option[String], nationalAppendix2: Option[String], nationalAppendix3: Option[String])
  /** GetResult implicit for fetching PersonRow objects using plain SQL queries */
  implicit def GetResultPersonRow(implicit e0: GR[String], e1: GR[Option[String]]): GR[PersonRow] = GR{
    prs => import prs._
      PersonRow.tupled((<<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_PERSON. Objects of this class serve as prototypes for rows in queries. */
  class Person(_tableTag: Tag) extends profile.api.Table[PersonRow](_tableTag, Some("WERNER2"), tablePrefix + "PERSON") {
    def * = (personKey, name, appendix1, appendix2, appendix3, iso3166Alpha3Code, zip, city, street, telephone, telefax, email, ifa, commentary, employeeNumber, accountingAreaCode, nationalName, nationalStreet, nationalCity, nationalAppendix1, nationalAppendix2, nationalAppendix3) <> (PersonRow.tupled, PersonRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(personKey), name, appendix1, appendix2, appendix3, iso3166Alpha3Code, zip, city, street, telephone, telefax, email, ifa, commentary, employeeNumber, accountingAreaCode, nationalName, nationalStreet, nationalCity, nationalAppendix1, nationalAppendix2, nationalAppendix3).shaped.<>({r=>import r._; _1.map(_=> PersonRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column PERSON_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val personKey: Rep[String] = column[String]("PERSON_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(82,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(82,varying=true))
    /** Database column APPENDIX1 SqlType(VARCHAR2), Length(500,true) */
    val appendix1: Rep[Option[String]] = column[Option[String]]("APPENDIX1", O.Length(500,varying=true))
    /** Database column APPENDIX2 SqlType(VARCHAR2), Length(200,true) */
    val appendix2: Rep[Option[String]] = column[Option[String]]("APPENDIX2", O.Length(200,varying=true))
    /** Database column APPENDIX3 SqlType(VARCHAR2), Length(200,true) */
    val appendix3: Rep[Option[String]] = column[Option[String]]("APPENDIX3", O.Length(200,varying=true))
    /** Database column ISO_3166_ALPHA3_CODE SqlType(VARCHAR2), Length(3,true) */
    val iso3166Alpha3Code: Rep[Option[String]] = column[Option[String]]("ISO_3166_ALPHA3_CODE", O.Length(3,varying=true))
    /** Database column ZIP SqlType(VARCHAR2), Length(14,true) */
    val zip: Rep[Option[String]] = column[Option[String]]("ZIP", O.Length(14,varying=true))
    /** Database column CITY SqlType(VARCHAR2), Length(52,true) */
    val city: Rep[Option[String]] = column[Option[String]]("CITY", O.Length(52,varying=true))
    /** Database column STREET SqlType(VARCHAR2), Length(200,true) */
    val street: Rep[Option[String]] = column[Option[String]]("STREET", O.Length(200,varying=true))
    /** Database column TELEPHONE SqlType(VARCHAR2), Length(32,true) */
    val telephone: Rep[Option[String]] = column[Option[String]]("TELEPHONE", O.Length(32,varying=true))
    /** Database column TELEFAX SqlType(VARCHAR2), Length(32,true) */
    val telefax: Rep[Option[String]] = column[Option[String]]("TELEFAX", O.Length(32,varying=true))
    /** Database column EMAIL SqlType(VARCHAR2), Length(100,true) */
    val email: Rep[Option[String]] = column[Option[String]]("EMAIL", O.Length(100,varying=true))
    /** Database column IFA SqlType(VARCHAR2), Length(10,true) */
    val ifa: Rep[Option[String]] = column[Option[String]]("IFA", O.Length(10,varying=true))
    /** Database column COMMENTARY SqlType(VARCHAR2), Length(128,true) */
    val commentary: Rep[Option[String]] = column[Option[String]]("COMMENTARY", O.Length(128,varying=true))
    /** Database column EMPLOYEE_NUMBER SqlType(VARCHAR2), Length(9,true) */
    val employeeNumber: Rep[Option[String]] = column[Option[String]]("EMPLOYEE_NUMBER", O.Length(9,varying=true))
    /** Database column ACCOUNTING_AREA_CODE SqlType(VARCHAR2), Length(4,true) */
    val accountingAreaCode: Rep[Option[String]] = column[Option[String]]("ACCOUNTING_AREA_CODE", O.Length(4,varying=true))
    /** Database column NATIONAL_NAME SqlType(NVARCHAR2), Length(82,true) */
    val nationalName: Rep[Option[String]] = column[Option[String]]("NATIONAL_NAME", O.Length(82,varying=true))
    /** Database column NATIONAL_STREET SqlType(NVARCHAR2), Length(200,true) */
    val nationalStreet: Rep[Option[String]] = column[Option[String]]("NATIONAL_STREET", O.Length(200,varying=true))
    /** Database column NATIONAL_CITY SqlType(NVARCHAR2), Length(52,true) */
    val nationalCity: Rep[Option[String]] = column[Option[String]]("NATIONAL_CITY", O.Length(52,varying=true))
    /** Database column NATIONAL_APPENDIX1 SqlType(NVARCHAR2), Length(500,true) */
    val nationalAppendix1: Rep[Option[String]] = column[Option[String]]("NATIONAL_APPENDIX1", O.Length(500,varying=true))
    /** Database column NATIONAL_APPENDIX2 SqlType(NVARCHAR2), Length(200,true) */
    val nationalAppendix2: Rep[Option[String]] = column[Option[String]]("NATIONAL_APPENDIX2", O.Length(200,varying=true))
    /** Database column NATIONAL_APPENDIX3 SqlType(NVARCHAR2), Length(200,true) */
    val nationalAppendix3: Rep[Option[String]] = column[Option[String]]("NATIONAL_APPENDIX3", O.Length(200,varying=true))

    /** Foreign key referencing AccountingArea (database name PERS_FK_ACCOUNTING_AREA_CODE) */
    lazy val accountingAreaFk = foreignKey("PERS_FK_ACCOUNTING_AREA_CODE", accountingAreaCode, AccountingArea)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Country (database name PERS_FK_ISO_3166_ALPHA3_CODE) */
    lazy val countryFk = foreignKey("PERS_FK_ISO_3166_ALPHA3_CODE", iso3166Alpha3Code, Country)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table Person */
  lazy val Person = new TableQuery(tag => new Person(tag))


  /** Row type of table User */
  type UserRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for UserRow providing default values if available in the database schema. */
  def UserRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], password: Option[String], isAbsent: Option[Char], language: Option[String], upperLimitAmount: Option[scala.math.BigDecimal], upperLimitCurrency: Option[String], divisionIdc: Option[String], personKey: Option[String], passwordCreationDate: Option[java.sql.Timestamp], passwordFifoList: Option[String], loginTrials: Option[scala.math.BigDecimal], loginTrialDate: Option[java.sql.Timestamp], department: Option[String], reset: Option[Char], isActive: Option[Char], viewerType: Option[String], roles: Option[String], gid: Option[String], organisationName: Option[String], organisationUnitName: Option[String], userAccountIdc: Option[String], isDefault: Option[Char]): UserRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: password :: isAbsent :: language :: upperLimitAmount :: upperLimitCurrency :: divisionIdc :: personKey :: passwordCreationDate :: passwordFifoList :: loginTrials :: loginTrialDate :: department :: reset :: isActive :: viewerType :: roles :: gid :: organisationName :: organisationUnitName :: userAccountIdc :: isDefault :: HNil
  }
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[UserRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_USER. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends profile.api.Table[UserRow](_tableTag, Some("WERNER2"), tablePrefix + "USER") {
    def * = objectidc :: objectversionc :: lastuserc :: updatetimec :: password :: isAbsent :: language :: upperLimitAmount :: upperLimitCurrency :: divisionIdc :: personKey :: passwordCreationDate :: passwordFifoList :: loginTrials :: loginTrialDate :: department :: reset :: isActive :: viewerType :: roles :: gid :: organisationName :: organisationUnitName :: userAccountIdc :: isDefault :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column PASSWORD SqlType(VARCHAR2), Length(16,true) */
    val password: Rep[Option[String]] = column[Option[String]]("PASSWORD", O.Length(16,varying=true))
    /** Database column IS_ABSENT SqlType(CHAR) */
    val isAbsent: Rep[Option[Char]] = column[Option[Char]]("IS_ABSENT")
    /** Database column LANGUAGE SqlType(CHAR), Length(2,false) */
    val language: Rep[Option[String]] = column[Option[String]]("LANGUAGE", O.Length(2,varying=false))
    /** Database column UPPER_LIMIT_AMOUNT SqlType(NUMBER) */
    val upperLimitAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_LIMIT_AMOUNT")
    /** Database column UPPER_LIMIT_CURRENCY SqlType(CHAR), Length(3,false) */
    val upperLimitCurrency: Rep[Option[String]] = column[Option[String]]("UPPER_LIMIT_CURRENCY", O.Length(3,varying=false))
    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[Option[String]] = column[Option[String]]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column PERSON_KEY SqlType(VARCHAR2), Length(10,true) */
    val personKey: Rep[Option[String]] = column[Option[String]]("PERSON_KEY", O.Length(10,varying=true))
    /** Database column PASSWORD_CREATION_DATE SqlType(DATE) */
    val passwordCreationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PASSWORD_CREATION_DATE")
    /** Database column PASSWORD_FIFO_LIST SqlType(VARCHAR2), Length(272,true) */
    val passwordFifoList: Rep[Option[String]] = column[Option[String]]("PASSWORD_FIFO_LIST", O.Length(272,varying=true))
    /** Database column LOGIN_TRIALS SqlType(NUMBER) */
    val loginTrials: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LOGIN_TRIALS")
    /** Database column LOGIN_TRIAL_DATE SqlType(DATE) */
    val loginTrialDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LOGIN_TRIAL_DATE")
    /** Database column DEPARTMENT SqlType(VARCHAR2), Length(50,true) */
    val department: Rep[Option[String]] = column[Option[String]]("DEPARTMENT", O.Length(50,varying=true))
    /** Database column RESET SqlType(CHAR) */
    val reset: Rep[Option[Char]] = column[Option[Char]]("RESET")
    /** Database column IS_ACTIVE SqlType(CHAR) */
    val isActive: Rep[Option[Char]] = column[Option[Char]]("IS_ACTIVE")
    /** Database column VIEWER_TYPE SqlType(VARCHAR2), Length(4,true) */
    val viewerType: Rep[Option[String]] = column[Option[String]]("VIEWER_TYPE", O.Length(4,varying=true))
    /** Database column ROLES SqlType(VARCHAR2), Length(31,true) */
    val roles: Rep[Option[String]] = column[Option[String]]("ROLES", O.Length(31,varying=true))
    /** Database column GID SqlType(VARCHAR2), Length(8,true) */
    val gid: Rep[Option[String]] = column[Option[String]]("GID", O.Length(8,varying=true))
    /** Database column ORGANISATION_NAME SqlType(VARCHAR2), Length(32,true) */
    val organisationName: Rep[Option[String]] = column[Option[String]]("ORGANISATION_NAME", O.Length(32,varying=true))
    /** Database column ORGANISATION_UNIT_NAME SqlType(VARCHAR2), Length(32,true) */
    val organisationUnitName: Rep[Option[String]] = column[Option[String]]("ORGANISATION_UNIT_NAME", O.Length(32,varying=true))
    /** Database column USER_ACCOUNT_IDC SqlType(VARCHAR2), Length(10,true) */
    val userAccountIdc: Rep[Option[String]] = column[Option[String]]("USER_ACCOUNT_IDC", O.Length(10,varying=true))
    /** Database column IS_DEFAULT SqlType(CHAR) */
    val isDefault: Rep[Option[Char]] = column[Option[Char]]("IS_DEFAULT")
  }
  /** Collection-like TableQuery object for table User */
  lazy val User = new TableQuery(tag => new User(tag))

  /** Entity class storing rows of table UserAccount
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param personKey Database column PERSON_KEY SqlType(VARCHAR2), Length(10,true)
    *  @param gid Database column GID SqlType(VARCHAR2), Length(8,true)
    *  @param password Database column PASSWORD SqlType(VARCHAR2), Length(16,true)
    *  @param passwordCreationDate Database column PASSWORD_CREATION_DATE SqlType(DATE)
    *  @param passwordFifoList Database column PASSWORD_FIFO_LIST SqlType(VARCHAR2), Length(272,true)
    *  @param loginTrials Database column LOGIN_TRIALS SqlType(NUMBER)
    *  @param loginTrialDate Database column LOGIN_TRIAL_DATE SqlType(DATE)
    *  @param reset Database column RESET SqlType(CHAR)
    *  @param language Database column LANGUAGE SqlType(CHAR), Length(2,false)
    *  @param department Database column DEPARTMENT SqlType(VARCHAR2), Length(50,true)
    *  @param organisationName Database column ORGANISATION_NAME SqlType(VARCHAR2), Length(32,true)
    *  @param organisationUnitName Database column ORGANISATION_UNIT_NAME SqlType(VARCHAR2), Length(32,true) */
  case class UserAccountRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], personKey: Option[String], gid: Option[String], password: Option[String], passwordCreationDate: Option[java.sql.Timestamp], passwordFifoList: Option[String], loginTrials: Option[scala.math.BigDecimal], loginTrialDate: Option[java.sql.Timestamp], reset: Option[Char], language: Option[String], department: Option[String], organisationName: Option[String], organisationUnitName: Option[String])
  /** GetResult implicit for fetching UserAccountRow objects using plain SQL queries */
  implicit def GetResultUserAccountRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[UserAccountRow] = GR{
    prs => import prs._
      UserAccountRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_USER_ACCOUNT. Objects of this class serve as prototypes for rows in queries. */
  class UserAccount(_tableTag: Tag) extends profile.api.Table[UserAccountRow](_tableTag, Some("WERNER2"), tablePrefix + "USER_ACCOUNT") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, personKey, gid, password, passwordCreationDate, passwordFifoList, loginTrials, loginTrialDate, reset, language, department, organisationName, organisationUnitName) <> (UserAccountRow.tupled, UserAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, personKey, gid, password, passwordCreationDate, passwordFifoList, loginTrials, loginTrialDate, reset, language, department, organisationName, organisationUnitName).shaped.<>({r=>import r._; _1.map(_=> UserAccountRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column PERSON_KEY SqlType(VARCHAR2), Length(10,true) */
    val personKey: Rep[Option[String]] = column[Option[String]]("PERSON_KEY", O.Length(10,varying=true))
    /** Database column GID SqlType(VARCHAR2), Length(8,true) */
    val gid: Rep[Option[String]] = column[Option[String]]("GID", O.Length(8,varying=true))
    /** Database column PASSWORD SqlType(VARCHAR2), Length(16,true) */
    val password: Rep[Option[String]] = column[Option[String]]("PASSWORD", O.Length(16,varying=true))
    /** Database column PASSWORD_CREATION_DATE SqlType(DATE) */
    val passwordCreationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PASSWORD_CREATION_DATE")
    /** Database column PASSWORD_FIFO_LIST SqlType(VARCHAR2), Length(272,true) */
    val passwordFifoList: Rep[Option[String]] = column[Option[String]]("PASSWORD_FIFO_LIST", O.Length(272,varying=true))
    /** Database column LOGIN_TRIALS SqlType(NUMBER) */
    val loginTrials: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LOGIN_TRIALS")
    /** Database column LOGIN_TRIAL_DATE SqlType(DATE) */
    val loginTrialDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LOGIN_TRIAL_DATE")
    /** Database column RESET SqlType(CHAR) */
    val reset: Rep[Option[Char]] = column[Option[Char]]("RESET")
    /** Database column LANGUAGE SqlType(CHAR), Length(2,false) */
    val language: Rep[Option[String]] = column[Option[String]]("LANGUAGE", O.Length(2,varying=false))
    /** Database column DEPARTMENT SqlType(VARCHAR2), Length(50,true) */
    val department: Rep[Option[String]] = column[Option[String]]("DEPARTMENT", O.Length(50,varying=true))
    /** Database column ORGANISATION_NAME SqlType(VARCHAR2), Length(32,true) */
    val organisationName: Rep[Option[String]] = column[Option[String]]("ORGANISATION_NAME", O.Length(32,varying=true))
    /** Database column ORGANISATION_UNIT_NAME SqlType(VARCHAR2), Length(32,true) */
    val organisationUnitName: Rep[Option[String]] = column[Option[String]]("ORGANISATION_UNIT_NAME", O.Length(32,varying=true))

    /** Foreign key referencing Language (database name UAC_FK_LANGUAGE) */
    lazy val languageFk = foreignKey("UAC_FK_LANGUAGE", language, Language)(r => Rep.Some(r.iso639Code), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Person (database name UAC_FK_PERSON_KEY) */
    lazy val personFk = foreignKey("UAC_FK_PERSON_KEY", personKey, Person)(r => Rep.Some(r.personKey), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table UserAccount */
  lazy val UserAccount = new TableQuery(tag => new UserAccount(tag))

  /** Entity class storing rows of table UserDeputies
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param deputyIdc Database column DEPUTY_IDC SqlType(VARCHAR2), Length(10,true) */
  case class UserDeputiesRow(userIdc: String, deputyIdc: String)
  /** GetResult implicit for fetching UserDeputiesRow objects using plain SQL queries */
  implicit def GetResultUserDeputiesRow(implicit e0: GR[String]): GR[UserDeputiesRow] = GR{
    prs => import prs._
      UserDeputiesRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_USER_DEPUTIES. Objects of this class serve as prototypes for rows in queries. */
  class UserDeputies(_tableTag: Tag) extends profile.api.Table[UserDeputiesRow](_tableTag, Some("WERNER2"), tablePrefix + "USER_DEPUTIES") {
    def * = (userIdc, deputyIdc) <> (UserDeputiesRow.tupled, UserDeputiesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userIdc), Rep.Some(deputyIdc)).shaped.<>({r=>import r._; _1.map(_=> UserDeputiesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))
    /** Database column DEPUTY_IDC SqlType(VARCHAR2), Length(10,true) */
    val deputyIdc: Rep[String] = column[String]("DEPUTY_IDC", O.Length(10,varying=true))

    /** Primary key of UserDeputies (database name UD_PK_USER_IDC) */
    val pk = primaryKey("UD_PK_USER_IDC", (userIdc, deputyIdc))

    /** Foreign key referencing DivisionUser (database name UD_FK_DEPUTY_IDC) */
    lazy val divisionUserFk1 = foreignKey("UD_FK_DEPUTY_IDC", deputyIdc, DivisionUser)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing DivisionUser (database name UD_FK_USER_IDC) */
    lazy val divisionUserFk2 = foreignKey("UD_FK_USER_IDC", userIdc, DivisionUser)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table UserDeputies */
  lazy val UserDeputies = new TableQuery(tag => new UserDeputies(tag))

  /** Entity class storing rows of table UserGroup
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(52,true)
    *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(1024,true)
    *  @param address Database column ADDRESS SqlType(VARCHAR2), Length(1024,true)
    *  @param extension Database column EXTENSION SqlType(VARCHAR2), Length(50,true)
    *  @param disabled Database column DISABLED SqlType(CHAR) */
  case class UserGroupRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], divisionIdc: Option[String], name: Option[String], description: Option[String], address: Option[String], extension: Option[String], disabled: Option[Char])
  /** GetResult implicit for fetching UserGroupRow objects using plain SQL queries */
  implicit def GetResultUserGroupRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[UserGroupRow] = GR{
    prs => import prs._
      UserGroupRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_USER_GROUP. Objects of this class serve as prototypes for rows in queries. */
  class UserGroup(_tableTag: Tag) extends profile.api.Table[UserGroupRow](_tableTag, Some("WERNER2"), tablePrefix + "USER_GROUP") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, divisionIdc, name, description, address, extension, disabled) <> (UserGroupRow.tupled, UserGroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, divisionIdc, name, description, address, extension, disabled).shaped.<>({r=>import r._; _1.map(_=> UserGroupRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[Option[String]] = column[Option[String]]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(52,varying=true))
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(1024,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(1024,varying=true))
    /** Database column ADDRESS SqlType(VARCHAR2), Length(1024,true) */
    val address: Rep[Option[String]] = column[Option[String]]("ADDRESS", O.Length(1024,varying=true))
    /** Database column EXTENSION SqlType(VARCHAR2), Length(50,true) */
    val extension: Rep[Option[String]] = column[Option[String]]("EXTENSION", O.Length(50,varying=true))
    /** Database column DISABLED SqlType(CHAR) */
    val disabled: Rep[Option[Char]] = column[Option[Char]]("DISABLED")

    /** Foreign key referencing Division (database name UG_FK_DIVISION_IDC) */
    lazy val divisionFk = foreignKey("UG_FK_DIVISION_IDC", divisionIdc, Division)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table UserGroup */
  lazy val UserGroup = new TableQuery(tag => new UserGroup(tag))

  /** Entity class storing rows of table UserInDivision
    *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param role Database column ROLE SqlType(VARCHAR2), Length(4,true) */
  case class UserInDivisionRow(divisionIdc: String, userIdc: String, role: String)
  /** GetResult implicit for fetching UserInDivisionRow objects using plain SQL queries */
  implicit def GetResultUserInDivisionRow(implicit e0: GR[String]): GR[UserInDivisionRow] = GR{
    prs => import prs._
      UserInDivisionRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table GREAT_USER_IN_DIVISION. Objects of this class serve as prototypes for rows in queries. */
  class UserInDivision(_tableTag: Tag) extends profile.api.Table[UserInDivisionRow](_tableTag, Some("WERNER2"), tablePrefix + "USER_IN_DIVISION") {
    def * = (divisionIdc, userIdc, role) <> (UserInDivisionRow.tupled, UserInDivisionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(divisionIdc), Rep.Some(userIdc), Rep.Some(role)).shaped.<>({r=>import r._; _1.map(_=> UserInDivisionRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[String] = column[String]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))
    /** Database column ROLE SqlType(VARCHAR2), Length(4,true) */
    val role: Rep[String] = column[String]("ROLE", O.Length(4,varying=true))

    /** Primary key of UserInDivision (database name UD_PK_DIVISION_IDC) */
    val pk = primaryKey("UD_PK_DIVISION_IDC", (divisionIdc, userIdc, role))
  }
  /** Collection-like TableQuery object for table UserInDivision */
  lazy val UserInDivision = new TableQuery(tag => new UserInDivision(tag))


  /** Entity class storing rows of table AppInGroup
    *  @param userGroupIdc Database column USER_GROUP_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
  case class AppInGroupRow(userGroupIdc: String, userIdc: String)
  /** GetResult implicit for fetching AppInGroupRow objects using plain SQL queries */
  implicit def GetResultAppInGroupRow(implicit e0: GR[String]): GR[AppInGroupRow] = GR{
    prs => import prs._
      AppInGroupRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_APP_IN_GROUP. Objects of this class serve as prototypes for rows in queries. */
  class AppInGroup(_tableTag: Tag) extends profile.api.Table[AppInGroupRow](_tableTag, Some("WERNER2"), tablePrefix + "APP_IN_GROUP") {
    def * = (userGroupIdc, userIdc) <> (AppInGroupRow.tupled, AppInGroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userGroupIdc), Rep.Some(userIdc)).shaped.<>({r=>import r._; _1.map(_=> AppInGroupRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column USER_GROUP_IDC SqlType(VARCHAR2), Length(10,true) */
    val userGroupIdc: Rep[String] = column[String]("USER_GROUP_IDC", O.Length(10,varying=true))
    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))

    /** Primary key of AppInGroup (database name APPIG_PK_USER_GROUP_IDC) */
    val pk = primaryKey("APPIG_PK_USER_GROUP_IDC", (userGroupIdc, userIdc))
  }
  /** Collection-like TableQuery object for table AppInGroup */
  lazy val AppInGroup = new TableQuery(tag => new AppInGroup(tag))

}
