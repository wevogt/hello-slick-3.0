package model.great

import model.generator.GreatReverseEngineered

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


  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array (GreatAuditLog.schema, GreatBareDependants.schema, GreatBareDependantsHistory.schema, GreatBareRights.schema, GreatBatchDriver.schema, GreatBatchJobDescription.schema, GreatBatchJobRun.schema, GreatBillingRun.schema, GreatBookEntry.schema, GreatBookEntryRelation.schema, GreatBulkUpdateDef.schema, GreatBulkUpdateDokuments.schema, GreatBulkUpdateGuarantee.schema, GreatBulkUpdateRun.schema, GreatBulkUpdateValue.schema, GreatBusinessPartner.schema, GreatBusinessPartnerHistory.schema, GreatBusinessUnits.schema, GreatCommissionRecBareDep.schema, GreatCommissionReceiver.schema, GreatCommissionReceiverHist.schema, GreatConsumption.schema, GreatContractConsumption.schema, GreatCostItem.schema, GreatCountry.schema, GreatCountryHistory.schema, GreatCurrency.schema, GreatCurrencyHistory.schema, GreatDebtorPortion.schema, GreatDivision.schema, GreatDivisioncodeInSector.schema, GreatDivisionLimits.schema, GreatDivisionReportRight.schema, GreatDivisionUser.schema, GreatDownloadColumn.schema, GreatDownloadFormat.schema, GreatDownloadFormatRef.schema, GreatEnterprise.schema, GreatExemptions.schema, GreatFxRates.schema, GreatGassociation.schema, GreatGassociationHistory.schema, GreatGassociationMember.schema, GreatGlineAccount.schema, GreatGlineAccountHistory.schema, GreatGlineContract.schema, GreatGlineContractHistory.schema, GreatGlineReservation.schema, GreatGlineReservationHist.schema, GreatGlineReservations.schema, GreatGlineReservationsHist.schema, GreatGmsState.schema, GreatGmsTransfer.schema, GreatGmsTransferEntity.schema, GreatGroupStructure.schema, GreatGroupStructureHistory.schema, GreatGuarantee.schema, GreatGuaranteeAttachment.schema, GreatGuaranteeFile.schema, GreatGuaranteeScheduler2.schema, GreatImport.schema, GreatInternatTexts.schema, GreatInvoice.schema, GreatInvoiceEvent.schema, GreatInvoiceEvidence.schema, GreatInvoiceEvidencePos.schema, GreatInvoiceLineItem.schema, GreatInvoiceNumber.schema, GreatInvoicePass.schema, GreatInvPassCalendar.schema, GreatLanguage.schema, GreatLatestFxRates.schema, GreatMessageAttachment.schema, GreatMessageEvent.schema, GreatMessageInfo.schema, GreatOpenftParameter.schema, GreatOrg.schema, GreatOrgHistory.schema, GreatPayment.schema, GreatPerson.schema, GreatPriceScaleEntry.schema, GreatPriceScaleEntryHist.schema, GreatQuarterlyReserves.schema, GreatRatings.schema, GreatReconciliationProcess.schema, GreatReminderRun.schema, GreatRequest.schema, GreatServerstatsSnapshot.schema, GreatSettlement.schema, GreatSviewConstraint.schema, GreatUniqueIds.schema, GreatUser.schema, GreatUserAccount.schema, GreatUserDeputies.schema, GreatUserGroup.schema, GreatUserInDivision.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema


  /** Row type of table GreatDivision */
  type GreatDivisionRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatDivisionRow providing default values if available in the database schema. */
  def GreatDivisionRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], kind: Option[String], name: Option[String], description: Option[String], address: Option[String], isLive: Option[Char], email: Option[String], parent: Option[String], telephone: Option[String], country: Option[String], currency: Option[String], isArchiving: Option[Char], barcodeAddress: Option[String], language: Option[String], disabled: Option[Char], mainContactUser: Option[String], showNationalFields: Option[Char], inheritShowNationalFields: Option[Char], archiveCountryIsocode2: Option[String], archiveUrl: Option[String]): GreatDivisionRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: kind :: name :: description :: address :: isLive :: email :: parent :: telephone :: country :: currency :: isArchiving :: barcodeAddress :: language :: disabled :: mainContactUser :: showNationalFields :: inheritShowNationalFields :: archiveCountryIsocode2 :: archiveUrl :: HNil
  }
  /** GetResult implicit for fetching GreatDivisionRow objects using plain SQL queries */
  implicit def GetResultGreatDivisionRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatDivisionRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_DIVISION. Objects of this class serve as prototypes for rows in queries. */
  class GreatDivision(_tableTag: Tag) extends profile.api.Table[GreatDivisionRow](_tableTag, Some("WERNER2"), "GREAT_DIVISION") {
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
  /** Collection-like TableQuery object for table GreatDivision */
  lazy val GreatDivision = new TableQuery(tag => new GreatDivision(tag))

  /** Entity class storing rows of table GreatDivisioncodeInSector
    *  @param division Database column DIVISION SqlType(VARCHAR2), Length(3,true)
    *  @param sector Database column SECTOR SqlType(VARCHAR2), Length(50,true) */
  case class GreatDivisioncodeInSectorRow(division: String, sector: String)
  /** GetResult implicit for fetching GreatDivisioncodeInSectorRow objects using plain SQL queries */
  implicit def GetResultGreatDivisioncodeInSectorRow(implicit e0: GR[String]): GR[GreatDivisioncodeInSectorRow] = GR{
    prs => import prs._
      GreatDivisioncodeInSectorRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_DIVISIONCODE_IN_SECTOR. Objects of this class serve as prototypes for rows in queries. */
  class GreatDivisioncodeInSector(_tableTag: Tag) extends profile.api.Table[GreatDivisioncodeInSectorRow](_tableTag, Some("WERNER2"), "GREAT_DIVISIONCODE_IN_SECTOR") {
    def * = (division, sector) <> (GreatDivisioncodeInSectorRow.tupled, GreatDivisioncodeInSectorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(division), Rep.Some(sector)).shaped.<>({r=>import r._; _1.map(_=> GreatDivisioncodeInSectorRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISION SqlType(VARCHAR2), Length(3,true) */
    val division: Rep[String] = column[String]("DIVISION", O.Length(3,varying=true))
    /** Database column SECTOR SqlType(VARCHAR2), Length(50,true) */
    val sector: Rep[String] = column[String]("SECTOR", O.Length(50,varying=true))

    /** Primary key of GreatDivisioncodeInSector (database name DIVIS_PK_DIVISION) */
    val pk = primaryKey("DIVIS_PK_DIVISION", (division, sector))
  }
  /** Collection-like TableQuery object for table GreatDivisioncodeInSector */
  lazy val GreatDivisioncodeInSector = new TableQuery(tag => new GreatDivisioncodeInSector(tag))

  /** Entity class storing rows of table GreatDivisionLimits
    *  @param divisioncode Database column DIVISIONCODE SqlType(VARCHAR2), PrimaryKey, Length(3,true)
    *  @param limit Database column LIMIT SqlType(NUMBER) */
  case class GreatDivisionLimitsRow(divisioncode: String, limit: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatDivisionLimitsRow objects using plain SQL queries */
  implicit def GetResultGreatDivisionLimitsRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]]): GR[GreatDivisionLimitsRow] = GR{
    prs => import prs._
      GreatDivisionLimitsRow.tupled((<<[String], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_DIVISION_LIMITS. Objects of this class serve as prototypes for rows in queries. */
  class GreatDivisionLimits(_tableTag: Tag) extends profile.api.Table[GreatDivisionLimitsRow](_tableTag, Some("WERNER2"), "GREAT_DIVISION_LIMITS") {
    def * = (divisioncode, limit) <> (GreatDivisionLimitsRow.tupled, GreatDivisionLimitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(divisioncode), limit).shaped.<>({r=>import r._; _1.map(_=> GreatDivisionLimitsRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISIONCODE SqlType(VARCHAR2), PrimaryKey, Length(3,true) */
    val divisioncode: Rep[String] = column[String]("DIVISIONCODE", O.PrimaryKey, O.Length(3,varying=true))
    /** Database column LIMIT SqlType(NUMBER) */
    val limit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LIMIT")
  }
  /** Collection-like TableQuery object for table GreatDivisionLimits */
  lazy val GreatDivisionLimits = new TableQuery(tag => new GreatDivisionLimits(tag))

  /** Entity class storing rows of table GreatDivisionReportRight
    *  @param report Database column REPORT SqlType(CHAR), Length(5,false)
    *  @param generalAvailability Database column GENERAL_AVAILABILITY SqlType(CHAR), Length(3,false)
    *  @param division Database column DIVISION SqlType(VARCHAR2), Length(10,true)
    *  @param divisioncodeviewerFlag Database column DIVISIONCODEVIEWER_FLAG SqlType(CHAR)
    *  @param bareViewerFlag Database column BARE_VIEWER_FLAG SqlType(CHAR) */
  case class GreatDivisionReportRightRow(report: Option[String], generalAvailability: Option[String], division: Option[String], divisioncodeviewerFlag: Option[Char], bareViewerFlag: Option[Char])
  /** GetResult implicit for fetching GreatDivisionReportRightRow objects using plain SQL queries */
  implicit def GetResultGreatDivisionReportRightRow(implicit e0: GR[Option[String]], e1: GR[Option[Char]]): GR[GreatDivisionReportRightRow] = GR{
    prs => import prs._
      GreatDivisionReportRightRow.tupled((<<?[String], <<?[String], <<?[String], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_DIVISION_REPORT_RIGHT. Objects of this class serve as prototypes for rows in queries. */
  class GreatDivisionReportRight(_tableTag: Tag) extends profile.api.Table[GreatDivisionReportRightRow](_tableTag, Some("WERNER2"), "GREAT_DIVISION_REPORT_RIGHT") {
    def * = (report, generalAvailability, division, divisioncodeviewerFlag, bareViewerFlag) <> (GreatDivisionReportRightRow.tupled, GreatDivisionReportRightRow.unapply)

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
  /** Collection-like TableQuery object for table GreatDivisionReportRight */
  lazy val GreatDivisionReportRight = new TableQuery(tag => new GreatDivisionReportRight(tag))

  /** Entity class storing rows of table GreatDivisionUser
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
  case class GreatDivisionUserRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], userAccountIdc: Option[String], divisionIdc: Option[String], roles: Option[String], viewerType: Option[String], upperLimitAmount: Option[scala.math.BigDecimal], upperLimitCurrency: Option[String], isActive: Option[Char], isAbsent: Option[Char], isDefault: Option[Char])
  /** GetResult implicit for fetching GreatDivisionUserRow objects using plain SQL queries */
  implicit def GetResultGreatDivisionUserRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatDivisionUserRow] = GR{
    prs => import prs._
      GreatDivisionUserRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_DIVISION_USER. Objects of this class serve as prototypes for rows in queries. */
  class GreatDivisionUser(_tableTag: Tag) extends profile.api.Table[GreatDivisionUserRow](_tableTag, Some("WERNER2"), "GREAT_DIVISION_USER") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, userAccountIdc, divisionIdc, roles, viewerType, upperLimitAmount, upperLimitCurrency, isActive, isAbsent, isDefault) <> (GreatDivisionUserRow.tupled, GreatDivisionUserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, userAccountIdc, divisionIdc, roles, viewerType, upperLimitAmount, upperLimitCurrency, isActive, isAbsent, isDefault).shaped.<>({r=>import r._; _1.map(_=> GreatDivisionUserRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing GreatUserAccount (database name DU_FK_USER_ACCOUNT_IDC) */
    lazy val greatUserAccountFk = foreignKey("DU_FK_USER_ACCOUNT_IDC", userAccountIdc, GreatUserAccount)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatDivisionUser */
  lazy val GreatDivisionUser = new TableQuery(tag => new GreatDivisionUser(tag))

  /** Entity class storing rows of table GreatDownloadColumn
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param formatIdc Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param pos Database column POS SqlType(NUMBER)
    *  @param col Database column COL SqlType(VARCHAR2), Length(32,true) */
  case class GreatDownloadColumnRow(objectidc: String, formatIdc: Option[String], pos: Option[scala.math.BigDecimal], col: Option[String])
  /** GetResult implicit for fetching GreatDownloadColumnRow objects using plain SQL queries */
  implicit def GetResultGreatDownloadColumnRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]]): GR[GreatDownloadColumnRow] = GR{
    prs => import prs._
      GreatDownloadColumnRow.tupled((<<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_DOWNLOAD_COLUMN. Objects of this class serve as prototypes for rows in queries. */
  class GreatDownloadColumn(_tableTag: Tag) extends profile.api.Table[GreatDownloadColumnRow](_tableTag, Some("WERNER2"), "GREAT_DOWNLOAD_COLUMN") {
    def * = (objectidc, formatIdc, pos, col) <> (GreatDownloadColumnRow.tupled, GreatDownloadColumnRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), formatIdc, pos, col).shaped.<>({r=>import r._; _1.map(_=> GreatDownloadColumnRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true) */
    val formatIdc: Rep[Option[String]] = column[Option[String]]("FORMAT_IDC", O.Length(10,varying=true))
    /** Database column POS SqlType(NUMBER) */
    val pos: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POS")
    /** Database column COL SqlType(VARCHAR2), Length(32,true) */
    val col: Rep[Option[String]] = column[Option[String]]("COL", O.Length(32,varying=true))

    /** Foreign key referencing GreatDownloadFormat (database name DLC_FK_FORMAT_IDC) */
    lazy val greatDownloadFormatFk = foreignKey("DLC_FK_FORMAT_IDC", formatIdc, GreatDownloadFormat)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatDownloadColumn */
  lazy val GreatDownloadColumn = new TableQuery(tag => new GreatDownloadColumn(tag))

  /** Entity class storing rows of table GreatDownloadFormat
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param owner Database column OWNER SqlType(VARCHAR2), Length(10,true)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(52,true)
    *  @param published Database column PUBLISHED SqlType(VARCHAR2) */
  case class GreatDownloadFormatRow(objectidc: String, owner: Option[String], name: String, published: Option[Char])
  /** GetResult implicit for fetching GreatDownloadFormatRow objects using plain SQL queries */
  implicit def GetResultGreatDownloadFormatRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Char]]): GR[GreatDownloadFormatRow] = GR{
    prs => import prs._
      GreatDownloadFormatRow.tupled((<<[String], <<?[String], <<[String], <<?[Char]))
  }
  /** Table description of table GREAT_DOWNLOAD_FORMAT. Objects of this class serve as prototypes for rows in queries. */
  class GreatDownloadFormat(_tableTag: Tag) extends profile.api.Table[GreatDownloadFormatRow](_tableTag, Some("WERNER2"), "GREAT_DOWNLOAD_FORMAT") {
    def * = (objectidc, owner, name, published) <> (GreatDownloadFormatRow.tupled, GreatDownloadFormatRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), owner, Rep.Some(name), published).shaped.<>({r=>import r._; _1.map(_=> GreatDownloadFormatRow.tupled((_1.get, _2, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OWNER SqlType(VARCHAR2), Length(10,true) */
    val owner: Rep[Option[String]] = column[Option[String]]("OWNER", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(52,varying=true))
    /** Database column PUBLISHED SqlType(VARCHAR2) */
    val published: Rep[Option[Char]] = column[Option[Char]]("PUBLISHED")

    /** Foreign key referencing GreatDivisionUser (database name DF_FK_OWNER) */
    lazy val greatDivisionUserFk = foreignKey("DF_FK_OWNER", owner, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatDownloadFormat */
  lazy val GreatDownloadFormat = new TableQuery(tag => new GreatDownloadFormat(tag))

  /** Entity class storing rows of table GreatDownloadFormatRef
    *  @param formatIdc Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param `type` Database column TYPE SqlType(CHAR) */
  case class GreatDownloadFormatRefRow(formatIdc: String, userIdc: String, `type`: Char)
  /** GetResult implicit for fetching GreatDownloadFormatRefRow objects using plain SQL queries */
  implicit def GetResultGreatDownloadFormatRefRow(implicit e0: GR[String], e1: GR[Char]): GR[GreatDownloadFormatRefRow] = GR{
    prs => import prs._
      GreatDownloadFormatRefRow.tupled((<<[String], <<[String], <<[Char]))
  }
  /** Table description of table GREAT_DOWNLOAD_FORMAT_REF. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatDownloadFormatRef(_tableTag: Tag) extends profile.api.Table[GreatDownloadFormatRefRow](_tableTag, Some("WERNER2"), "GREAT_DOWNLOAD_FORMAT_REF") {
    def * = (formatIdc, userIdc, `type`) <> (GreatDownloadFormatRefRow.tupled, GreatDownloadFormatRefRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(formatIdc), Rep.Some(userIdc), Rep.Some(`type`)).shaped.<>({r=>import r._; _1.map(_=> GreatDownloadFormatRefRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FORMAT_IDC SqlType(VARCHAR2), Length(10,true) */
    val formatIdc: Rep[String] = column[String]("FORMAT_IDC", O.Length(10,varying=true))
    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))
    /** Database column TYPE SqlType(CHAR)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Char] = column[Char]("TYPE")

    /** Primary key of GreatDownloadFormatRef (database name DFR_PK_FORMAT_IDC) */
    val pk = primaryKey("DFR_PK_FORMAT_IDC", (formatIdc, userIdc, `type`))
  }
  /** Collection-like TableQuery object for table GreatDownloadFormatRef */
  lazy val GreatDownloadFormatRef = new TableQuery(tag => new GreatDownloadFormatRef(tag))


  /** Entity class storing rows of table GreatBusinessUnits
    *  @param code Database column CODE SqlType(VARCHAR2), Length(10,true)
    *  @param version Database column VERSION SqlType(NUMBER)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(30,true)
    *  @param parent Database column PARENT SqlType(VARCHAR2), Length(30,true)
    *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true)
    *  @param mandatory Database column MANDATORY SqlType(CHAR) */
  case class GreatBusinessUnitsRow(code: String, version: scala.math.BigDecimal, name: String, parent: String, description: Option[String], mandatory: Option[Char])
  /** GetResult implicit for fetching GreatBusinessUnitsRow objects using plain SQL queries */
  implicit def GetResultGreatBusinessUnitsRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Option[Char]]): GR[GreatBusinessUnitsRow] = GR{
    prs => import prs._
      GreatBusinessUnitsRow.tupled((<<[String], <<[scala.math.BigDecimal], <<[String], <<[String], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BUSINESS_UNITS. Objects of this class serve as prototypes for rows in queries. */
  class GreatBusinessUnits(_tableTag: Tag) extends profile.api.Table[GreatBusinessUnitsRow](_tableTag, Some("WERNER2"), "GREAT_BUSINESS_UNITS") {
    def * = (code, version, name, parent, description, mandatory) <> (GreatBusinessUnitsRow.tupled, GreatBusinessUnitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(code), Rep.Some(version), Rep.Some(name), Rep.Some(parent), description, mandatory).shaped.<>({r=>import r._; _1.map(_=> GreatBusinessUnitsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Primary key of GreatBusinessUnits (database name BU_PK_CODE) */
    val pk = primaryKey("BU_PK_CODE", (code, version, name, parent))

    /** Foreign key referencing GreatGroupStructureHistory (database name BU_FK_CODE) */
    lazy val greatGroupStructureHistoryFk = foreignKey("BU_FK_CODE", (code, version), GreatGroupStructureHistory)(r => (r.objectidc, r.objectversionc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBusinessUnits */
  lazy val GreatBusinessUnits = new TableQuery(tag => new GreatBusinessUnits(tag))


  /** Row type of table GreatBareDependants */
  type GreatBareDependantsRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatBareDependantsRow providing default values if available in the database schema. */
  def GreatBareDependantsRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], invoicingPermitted: Option[Char], parent: Option[String], currencyIsoCode: Option[String], toBeExcludedFromBsReport: Option[Char], balanceSheetRecUserId: Option[String], disclosureArePattern: Option[String], periodicDefGroupComRec: Option[String], periodicDefBankComRec: Option[String], periodicDefIndBankComRec: Option[String], periodicDefInsuranceComRec: Option[String], singularDefGroupComRec: Option[String], singularDefBankComRec: Option[String], singularDefIndBankComRec: Option[String], singularDefInsurComRec: Option[String], individualParticipation: Option[Char], invFirstPassDate: Option[java.sql.Timestamp], considerStartPeriod: Option[Char], invStartDate: Option[java.sql.Timestamp], invCurrencyIsoCode: Option[String], aOrgId: Option[String], salesOffice: Option[String], billingSystem: Option[Char], fileNamePrefix: Option[String], sapUserName: Option[String], serverUpload: Option[Char], minAccAmountProv: Option[scala.math.BigDecimal], minAccAmountProvCur: Option[String], creationFeeGroup: Option[scala.math.BigDecimal], creationFeeGroupCur: Option[String], creationFeeDirect: Option[scala.math.BigDecimal], creationFeeDirectCur: Option[String], creationFeeIndirect: Option[scala.math.BigDecimal], creationFeeIndirectCur: Option[String], creationFeeInsur: Option[scala.math.BigDecimal], creationFeeInsurCur: Option[String], amendmFeeGroup: Option[scala.math.BigDecimal], amendmFeeGroupCur: Option[String], amendmFeeDirect: Option[scala.math.BigDecimal], amendmFeeDirectCur: Option[String], amendmFeeIndirect: Option[scala.math.BigDecimal], amendmFeeIndirectCur: Option[String], amendmFeeInsur: Option[scala.math.BigDecimal], amendmFeeInsurCur: Option[String], courierChGroup: Option[scala.math.BigDecimal], courierChGroupCur: Option[String], courierChDirect: Option[scala.math.BigDecimal], courierChDirectCur: Option[String], courierChIndirect: Option[scala.math.BigDecimal], courierChIndirectCur: Option[String], courierChInsur: Option[scala.math.BigDecimal], courierChInsurCur: Option[String], expensesGroup: Option[scala.math.BigDecimal], expensesGroupCur: Option[String], expensesDirect: Option[scala.math.BigDecimal], expensesDirectCur: Option[String], expensesIndirect: Option[scala.math.BigDecimal], expensesIndirectCur: Option[String], expensesInsur: Option[scala.math.BigDecimal], expensesInsurCur: Option[String], referableAvalComm: Option[Char], referableMinComm: Option[Char], referableFixComm: Option[Char], referableProcessingFee: Option[Char], referableMinFee: Option[Char], referableFixFee: Option[Char], validFrom: Option[java.sql.Timestamp], currencyPeriod: Option[Char], dayCountFractionPlQl: Option[Char], groupCommPortion: Option[scala.math.BigDecimal], thirdPartyCommPortion: Option[scala.math.BigDecimal], minNominalComm: Option[scala.math.BigDecimal], minNominalCommCur: Option[String], minNominalCommPeriod: Option[Char], minObligoComm: Option[scala.math.BigDecimal], minObligoCommCur: Option[String], minObligoCommPeriod: Option[Char], fixComm: Option[scala.math.BigDecimal], fixCommCur: Option[String], fixCommPeriod: Option[Char], groupFeePortion: Option[scala.math.BigDecimal], thirdPartyFeePortion: Option[scala.math.BigDecimal], minFee: Option[scala.math.BigDecimal], minFeeCur: Option[String], minFeePeriod: Option[Char], minObligoFee: Option[scala.math.BigDecimal], minObligoFeeCur: Option[String], minObligoFeePeriod: Option[Char], fixFee: Option[scala.math.BigDecimal], fixFeeCur: Option[String], fixFeePeriod: Option[Char], matNumberPeriodicFee: Option[String], matNumberSingular: Option[String], matNumberCreationFee: Option[String], matNumberSupplementFee: Option[String], matNumberCourierCost: Option[String], matNumberExpenses: Option[String], matNumberCharges: Option[String]): GreatBareDependantsRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: invoicingPermitted :: parent :: currencyIsoCode :: toBeExcludedFromBsReport :: balanceSheetRecUserId :: disclosureArePattern :: periodicDefGroupComRec :: periodicDefBankComRec :: periodicDefIndBankComRec :: periodicDefInsuranceComRec :: singularDefGroupComRec :: singularDefBankComRec :: singularDefIndBankComRec :: singularDefInsurComRec :: individualParticipation :: invFirstPassDate :: considerStartPeriod :: invStartDate :: invCurrencyIsoCode :: aOrgId :: salesOffice :: billingSystem :: fileNamePrefix :: sapUserName :: serverUpload :: minAccAmountProv :: minAccAmountProvCur :: creationFeeGroup :: creationFeeGroupCur :: creationFeeDirect :: creationFeeDirectCur :: creationFeeIndirect :: creationFeeIndirectCur :: creationFeeInsur :: creationFeeInsurCur :: amendmFeeGroup :: amendmFeeGroupCur :: amendmFeeDirect :: amendmFeeDirectCur :: amendmFeeIndirect :: amendmFeeIndirectCur :: amendmFeeInsur :: amendmFeeInsurCur :: courierChGroup :: courierChGroupCur :: courierChDirect :: courierChDirectCur :: courierChIndirect :: courierChIndirectCur :: courierChInsur :: courierChInsurCur :: expensesGroup :: expensesGroupCur :: expensesDirect :: expensesDirectCur :: expensesIndirect :: expensesIndirectCur :: expensesInsur :: expensesInsurCur :: referableAvalComm :: referableMinComm :: referableFixComm :: referableProcessingFee :: referableMinFee :: referableFixFee :: validFrom :: currencyPeriod :: dayCountFractionPlQl :: groupCommPortion :: thirdPartyCommPortion :: minNominalComm :: minNominalCommCur :: minNominalCommPeriod :: minObligoComm :: minObligoCommCur :: minObligoCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: groupFeePortion :: thirdPartyFeePortion :: minFee :: minFeeCur :: minFeePeriod :: minObligoFee :: minObligoFeeCur :: minObligoFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: matNumberPeriodicFee :: matNumberSingular :: matNumberCreationFee :: matNumberSupplementFee :: matNumberCourierCost :: matNumberExpenses :: matNumberCharges :: HNil
  }
  /** GetResult implicit for fetching GreatBareDependantsRow objects using plain SQL queries */
  implicit def GetResultGreatBareDependantsRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatBareDependantsRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BARE_DEPENDANTS. Objects of this class serve as prototypes for rows in queries. */
  class GreatBareDependants(_tableTag: Tag) extends profile.api.Table[GreatBareDependantsRow](_tableTag, Some("WERNER2"), "GREAT_BARE_DEPENDANTS") {
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

    /** Foreign key referencing GreatAccountingArea (database name B_FK_OBJECTIDC) */
    lazy val greatAccountingAreaFk = foreignKey("B_FK_OBJECTIDC", objectidc :: HNil, GreatAccountingArea)(r => r.objectidc :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBareDependants (database name B_FK_PARENT) */
    lazy val greatBareDependantsFk = foreignKey("B_FK_PARENT", parent :: HNil, GreatBareDependants)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_PERIODIC_DEF_BANK_COM_REC) */
    lazy val greatCommissionReceiverFk3 = foreignKey("B_FK_PERIODIC_DEF_BANK_COM_REC", periodicDefBankComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_PERIODIC_DEF_GROUP_COM_3) */
    lazy val greatCommissionReceiverFk4 = foreignKey("B_FK_PERIODIC_DEF_GROUP_COM_3", periodicDefGroupComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_PERIODIC_DEF_IND_BANK_C5) */
    lazy val greatCommissionReceiverFk5 = foreignKey("B_FK_PERIODIC_DEF_IND_BANK_C5", periodicDefIndBankComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_PERIODIC_DEF_INSURANCE_6) */
    lazy val greatCommissionReceiverFk6 = foreignKey("B_FK_PERIODIC_DEF_INSURANCE_6", periodicDefInsuranceComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_SINGULAR_DEF_BANK_COM_REC) */
    lazy val greatCommissionReceiverFk7 = foreignKey("B_FK_SINGULAR_DEF_BANK_COM_REC", singularDefBankComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_SINGULAR_DEF_GROUP_COM_7) */
    lazy val greatCommissionReceiverFk8 = foreignKey("B_FK_SINGULAR_DEF_GROUP_COM_7", singularDefGroupComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_SINGULAR_DEF_IND_BANK_C9) */
    lazy val greatCommissionReceiverFk9 = foreignKey("B_FK_SINGULAR_DEF_IND_BANK_C9", singularDefIndBankComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name B_FK_SINGULAR_DEF_INSUR_COM_10) */
    lazy val greatCommissionReceiverFk10 = foreignKey("B_FK_SINGULAR_DEF_INSUR_COM_10", singularDefInsurComRec :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_AMENDM_FEE_DIRECT_CUR) */
    lazy val greatCurrencyFk11 = foreignKey("B_FK_AMENDM_FEE_DIRECT_CUR", amendmFeeDirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_AMENDM_FEE_GROUP_CUR) */
    lazy val greatCurrencyFk12 = foreignKey("B_FK_AMENDM_FEE_GROUP_CUR", amendmFeeGroupCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_AMENDM_FEE_INDIRECT_CUR) */
    lazy val greatCurrencyFk13 = foreignKey("B_FK_AMENDM_FEE_INDIRECT_CUR", amendmFeeIndirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_AMENDM_FEE_INSUR_CUR) */
    lazy val greatCurrencyFk14 = foreignKey("B_FK_AMENDM_FEE_INSUR_CUR", amendmFeeInsurCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_COURIER_CH_DIRECT_CUR) */
    lazy val greatCurrencyFk15 = foreignKey("B_FK_COURIER_CH_DIRECT_CUR", courierChDirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_COURIER_CH_GROUP_CUR) */
    lazy val greatCurrencyFk16 = foreignKey("B_FK_COURIER_CH_GROUP_CUR", courierChGroupCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_COURIER_CH_INDIRECT_CUR) */
    lazy val greatCurrencyFk17 = foreignKey("B_FK_COURIER_CH_INDIRECT_CUR", courierChIndirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_COURIER_CH_INSUR_CUR) */
    lazy val greatCurrencyFk18 = foreignKey("B_FK_COURIER_CH_INSUR_CUR", courierChInsurCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_CREATION_FEE_DIRECT_CUR) */
    lazy val greatCurrencyFk19 = foreignKey("B_FK_CREATION_FEE_DIRECT_CUR", creationFeeDirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_CREATION_FEE_GROUP_CUR) */
    lazy val greatCurrencyFk20 = foreignKey("B_FK_CREATION_FEE_GROUP_CUR", creationFeeGroupCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_CREATION_FEE_INDIRECT_CUR) */
    lazy val greatCurrencyFk21 = foreignKey("B_FK_CREATION_FEE_INDIRECT_CUR", creationFeeIndirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_CREATION_FEE_INSUR_CUR) */
    lazy val greatCurrencyFk22 = foreignKey("B_FK_CREATION_FEE_INSUR_CUR", creationFeeInsurCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_CURRENCY_ISO_CODE) */
    lazy val greatCurrencyFk23 = foreignKey("B_FK_CURRENCY_ISO_CODE", currencyIsoCode :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_EXPENSES_DIRECT_CUR) */
    lazy val greatCurrencyFk24 = foreignKey("B_FK_EXPENSES_DIRECT_CUR", expensesDirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_EXPENSES_GROUP_CUR) */
    lazy val greatCurrencyFk25 = foreignKey("B_FK_EXPENSES_GROUP_CUR", expensesGroupCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_EXPENSES_INDIRECT_CUR) */
    lazy val greatCurrencyFk26 = foreignKey("B_FK_EXPENSES_INDIRECT_CUR", expensesIndirectCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_EXPENSES_INSUR_CUR) */
    lazy val greatCurrencyFk27 = foreignKey("B_FK_EXPENSES_INSUR_CUR", expensesInsurCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_FIX_COMM_CUR) */
    lazy val greatCurrencyFk28 = foreignKey("B_FK_FIX_COMM_CUR", fixCommCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_FIX_FEE_CUR) */
    lazy val greatCurrencyFk29 = foreignKey("B_FK_FIX_FEE_CUR", fixFeeCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_INV_CURRENCY_ISO_CODE) */
    lazy val greatCurrencyFk30 = foreignKey("B_FK_INV_CURRENCY_ISO_CODE", invCurrencyIsoCode :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_MIN_ACC_AMOUNT_PROV_CUR) */
    lazy val greatCurrencyFk31 = foreignKey("B_FK_MIN_ACC_AMOUNT_PROV_CUR", minAccAmountProvCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_MIN_FEE_CUR) */
    lazy val greatCurrencyFk32 = foreignKey("B_FK_MIN_FEE_CUR", minFeeCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_MIN_NOMINAL_COMM_CUR) */
    lazy val greatCurrencyFk33 = foreignKey("B_FK_MIN_NOMINAL_COMM_CUR", minNominalCommCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_MIN_OBLIGO_COMM_CUR) */
    lazy val greatCurrencyFk34 = foreignKey("B_FK_MIN_OBLIGO_COMM_CUR", minObligoCommCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name B_FK_MIN_OBLIGO_FEE_CUR) */
    lazy val greatCurrencyFk35 = foreignKey("B_FK_MIN_OBLIGO_FEE_CUR", minObligoFeeCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name B_FK_BALANCE_SHEET_REC_USER_ID) */
    lazy val greatDivisionUserFk = foreignKey("B_FK_BALANCE_SHEET_REC_USER_ID", balanceSheetRecUserId :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name B_FK_A_ORG_ID) */
    lazy val greatOrgFk = foreignKey("B_FK_A_ORG_ID", aOrgId :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBareDependants */
  lazy val GreatBareDependants = new TableQuery(tag => new GreatBareDependants(tag))

  /** Row type of table GreatBareDependantsHistory */
  type GreatBareDependantsHistoryRow = HCons[String,HCons[scala.math.BigDecimal,HCons[Option[String],HCons[String,HCons[String,HCons[Char,HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatBareDependantsHistoryRow providing default values if available in the database schema. */
  def GreatBareDependantsHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], invoicingPermitted: Option[Char], parent: Option[String], currencyIsoCode: Option[String], toBeExcludedFromBsReport: Option[Char], balanceSheetRecUserId: Option[String], disclosureArePattern: Option[String], periodicDefGroupComRec: Option[String], periodicDefBankComRec: Option[String], periodicDefIndBankComRec: Option[String], periodicDefInsuranceComRec: Option[String], singularDefGroupComRec: Option[String], singularDefBankComRec: Option[String], singularDefIndBankComRec: Option[String], singularDefInsurComRec: Option[String], individualParticipation: Option[Char], invFirstPassDate: Option[java.sql.Timestamp], considerStartPeriod: Option[Char], invStartDate: Option[java.sql.Timestamp], invCurrencyIsoCode: Option[String], aOrgId: Option[String], salesOffice: Option[String], billingSystem: Option[Char], fileNamePrefix: Option[String], sapUserName: Option[String], serverUpload: Option[Char], minAccAmountProv: Option[scala.math.BigDecimal], minAccAmountProvCur: Option[String], creationFeeGroup: Option[scala.math.BigDecimal], creationFeeGroupCur: Option[String], creationFeeDirect: Option[scala.math.BigDecimal], creationFeeDirectCur: Option[String], creationFeeIndirect: Option[scala.math.BigDecimal], creationFeeIndirectCur: Option[String], creationFeeInsur: Option[scala.math.BigDecimal], creationFeeInsurCur: Option[String], amendmFeeGroup: Option[scala.math.BigDecimal], amendmFeeGroupCur: Option[String], amendmFeeDirect: Option[scala.math.BigDecimal], amendmFeeDirectCur: Option[String], amendmFeeIndirect: Option[scala.math.BigDecimal], amendmFeeIndirectCur: Option[String], amendmFeeInsur: Option[scala.math.BigDecimal], amendmFeeInsurCur: Option[String], courierChGroup: Option[scala.math.BigDecimal], courierChGroupCur: Option[String], courierChDirect: Option[scala.math.BigDecimal], courierChDirectCur: Option[String], courierChIndirect: Option[scala.math.BigDecimal], courierChIndirectCur: Option[String], courierChInsur: Option[scala.math.BigDecimal], courierChInsurCur: Option[String], expensesGroup: Option[scala.math.BigDecimal], expensesGroupCur: Option[String], expensesDirect: Option[scala.math.BigDecimal], expensesDirectCur: Option[String], expensesIndirect: Option[scala.math.BigDecimal], expensesIndirectCur: Option[String], expensesInsur: Option[scala.math.BigDecimal], expensesInsurCur: Option[String], referableAvalComm: Option[Char], referableMinComm: Option[Char], referableFixComm: Option[Char], referableProcessingFee: Option[Char], referableMinFee: Option[Char], referableFixFee: Option[Char], validFrom: Option[java.sql.Timestamp], currencyPeriod: Option[Char], dayCountFractionPlQl: Option[Char], groupCommPortion: Option[scala.math.BigDecimal], thirdPartyCommPortion: Option[scala.math.BigDecimal], minNominalComm: Option[scala.math.BigDecimal], minNominalCommCur: Option[String], minNominalCommPeriod: Option[Char], minObligoComm: Option[scala.math.BigDecimal], minObligoCommCur: Option[String], minObligoCommPeriod: Option[Char], fixComm: Option[scala.math.BigDecimal], fixCommCur: Option[String], fixCommPeriod: Option[Char], groupFeePortion: Option[scala.math.BigDecimal], thirdPartyFeePortion: Option[scala.math.BigDecimal], minFee: Option[scala.math.BigDecimal], minFeeCur: Option[String], minFeePeriod: Option[Char], minObligoFee: Option[scala.math.BigDecimal], minObligoFeeCur: Option[String], minObligoFeePeriod: Option[Char], fixFee: Option[scala.math.BigDecimal], fixFeeCur: Option[String], fixFeePeriod: Option[Char], matNumberPeriodicFee: Option[String], matNumberSingular: Option[String], matNumberCreationFee: Option[String], matNumberSupplementFee: Option[String], matNumberCourierCost: Option[String], matNumberExpenses: Option[String], matNumberCharges: Option[String], groupCommissionRecSet: Option[String], bankCommissionRecSet: Option[String], indBankCommissionRecSet: Option[String], insuranceCommissionRecSet: Option[String]): GreatBareDependantsHistoryRow = {
    objectidc :: objectversionc :: lastuserc :: updatereasonc :: updatecategoryc :: activec :: updatetimec :: invoicingPermitted :: parent :: currencyIsoCode :: toBeExcludedFromBsReport :: balanceSheetRecUserId :: disclosureArePattern :: periodicDefGroupComRec :: periodicDefBankComRec :: periodicDefIndBankComRec :: periodicDefInsuranceComRec :: singularDefGroupComRec :: singularDefBankComRec :: singularDefIndBankComRec :: singularDefInsurComRec :: individualParticipation :: invFirstPassDate :: considerStartPeriod :: invStartDate :: invCurrencyIsoCode :: aOrgId :: salesOffice :: billingSystem :: fileNamePrefix :: sapUserName :: serverUpload :: minAccAmountProv :: minAccAmountProvCur :: creationFeeGroup :: creationFeeGroupCur :: creationFeeDirect :: creationFeeDirectCur :: creationFeeIndirect :: creationFeeIndirectCur :: creationFeeInsur :: creationFeeInsurCur :: amendmFeeGroup :: amendmFeeGroupCur :: amendmFeeDirect :: amendmFeeDirectCur :: amendmFeeIndirect :: amendmFeeIndirectCur :: amendmFeeInsur :: amendmFeeInsurCur :: courierChGroup :: courierChGroupCur :: courierChDirect :: courierChDirectCur :: courierChIndirect :: courierChIndirectCur :: courierChInsur :: courierChInsurCur :: expensesGroup :: expensesGroupCur :: expensesDirect :: expensesDirectCur :: expensesIndirect :: expensesIndirectCur :: expensesInsur :: expensesInsurCur :: referableAvalComm :: referableMinComm :: referableFixComm :: referableProcessingFee :: referableMinFee :: referableFixFee :: validFrom :: currencyPeriod :: dayCountFractionPlQl :: groupCommPortion :: thirdPartyCommPortion :: minNominalComm :: minNominalCommCur :: minNominalCommPeriod :: minObligoComm :: minObligoCommCur :: minObligoCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: groupFeePortion :: thirdPartyFeePortion :: minFee :: minFeeCur :: minFeePeriod :: minObligoFee :: minObligoFeeCur :: minObligoFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: matNumberPeriodicFee :: matNumberSingular :: matNumberCreationFee :: matNumberSupplementFee :: matNumberCourierCost :: matNumberExpenses :: matNumberCharges :: groupCommissionRecSet :: bankCommissionRecSet :: indBankCommissionRecSet :: insuranceCommissionRecSet :: HNil
  }
  /** GetResult implicit for fetching GreatBareDependantsHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatBareDependantsHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]], e6: GR[Option[scala.math.BigDecimal]]): GR[GreatBareDependantsHistoryRow] = GR{
    prs => import prs._
      <<[String] :: <<[scala.math.BigDecimal] :: <<?[String] :: <<[String] :: <<[String] :: <<[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BARE_DEPENDANTS_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatBareDependantsHistory(_tableTag: Tag) extends profile.api.Table[GreatBareDependantsHistoryRow](_tableTag, Some("WERNER2"), "GREAT_BARE_DEPENDANTS_HISTORY") {
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

    /** Primary key of GreatBareDependantsHistory (database name BH_PK_OBJECTIDC) */
    val pk = primaryKey("BH_PK_OBJECTIDC", objectidc :: objectversionc :: HNil)
  }
  /** Collection-like TableQuery object for table GreatBareDependantsHistory */
  lazy val GreatBareDependantsHistory = new TableQuery(tag => new GreatBareDependantsHistory(tag))

  /** Entity class storing rows of table GreatBareRights
    *  @param bareCode Database column BARE_CODE SqlType(VARCHAR2), Length(4,true)
    *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param group Database column GROUP_ SqlType(CHAR)
    *  @param bank Database column BANK SqlType(CHAR)
    *  @param insurance Database column INSURANCE SqlType(CHAR)
    *  @param finFinc Database column FIN_FINC SqlType(CHAR)
    *  @param acc Database column ACC SqlType(CHAR) */
  case class GreatBareRightsRow(bareCode: String, divisionIdc: String, group: Option[Char], bank: Option[Char], insurance: Option[Char], finFinc: Option[Char], acc: Option[Char])
  /** GetResult implicit for fetching GreatBareRightsRow objects using plain SQL queries */
  implicit def GetResultGreatBareRightsRow(implicit e0: GR[String], e1: GR[Option[Char]]): GR[GreatBareRightsRow] = GR{
    prs => import prs._
      GreatBareRightsRow.tupled((<<[String], <<[String], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_BARE_RIGHTS. Objects of this class serve as prototypes for rows in queries. */
  class GreatBareRights(_tableTag: Tag) extends profile.api.Table[GreatBareRightsRow](_tableTag, Some("WERNER2"), "GREAT_BARE_RIGHTS") {
    def * = (bareCode, divisionIdc, group, bank, insurance, finFinc, acc) <> (GreatBareRightsRow.tupled, GreatBareRightsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(bareCode), Rep.Some(divisionIdc), group, bank, insurance, finFinc, acc).shaped.<>({r=>import r._; _1.map(_=> GreatBareRightsRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Primary key of GreatBareRights (database name BR_PK_BARE_CODE) */
    val pk = primaryKey("BR_PK_BARE_CODE", (bareCode, divisionIdc))

    /** Foreign key referencing GreatBareDependants (database name BR_FK_BARE_CODE) */
    lazy val greatBareDependantsFk = foreignKey("BR_FK_BARE_CODE", bareCode, GreatBareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivision (database name BR_FK_DIVISION_IDC) */
    lazy val greatDivisionFk = foreignKey("BR_FK_DIVISION_IDC", divisionIdc, GreatDivision)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBareRights */
  lazy val GreatBareRights = new TableQuery(tag => new GreatBareRights(tag))



  /** Entity class storing rows of table GreatGroupStructure
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param isUnitMandatory Database column IS_UNIT_MANDATORY SqlType(CHAR) */
  case class GreatGroupStructureRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], isUnitMandatory: Option[Char])
  /** GetResult implicit for fetching GreatGroupStructureRow objects using plain SQL queries */
  implicit def GetResultGreatGroupStructureRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatGroupStructureRow] = GR{
    prs => import prs._
      GreatGroupStructureRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[Char]))
  }
  /** Table description of table GREAT_GROUP_STRUCTURE. Objects of this class serve as prototypes for rows in queries. */
  class GreatGroupStructure(_tableTag: Tag) extends profile.api.Table[GreatGroupStructureRow](_tableTag, Some("WERNER2"), "GREAT_GROUP_STRUCTURE") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, isUnitMandatory) <> (GreatGroupStructureRow.tupled, GreatGroupStructureRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, isUnitMandatory).shaped.<>({r=>import r._; _1.map(_=> GreatGroupStructureRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
  /** Collection-like TableQuery object for table GreatGroupStructure */
  lazy val GreatGroupStructure = new TableQuery(tag => new GreatGroupStructure(tag))

  /** Entity class storing rows of table GreatGroupStructureHistory
    *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
    *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
    *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
    *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
    *  @param activec Database column ACTIVEC SqlType(CHAR)
    *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
    *  @param isUnitMandatory Database column IS_UNIT_MANDATORY SqlType(CHAR) */
  case class GreatGroupStructureHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], isUnitMandatory: Option[Char])
  /** GetResult implicit for fetching GreatGroupStructureHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatGroupStructureHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Char]]): GR[GreatGroupStructureHistoryRow] = GR{
    prs => import prs._
      GreatGroupStructureHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<?[Char]))
  }
  /** Table description of table GREAT_GROUP_STRUCTURE_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatGroupStructureHistory(_tableTag: Tag) extends profile.api.Table[GreatGroupStructureHistoryRow](_tableTag, Some("WERNER2"), "GREAT_GROUP_STRUCTURE_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, isUnitMandatory) <> (GreatGroupStructureHistoryRow.tupled, GreatGroupStructureHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, isUnitMandatory).shaped.<>({r=>import r._; _1.map(_=> GreatGroupStructureHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Primary key of GreatGroupStructureHistory (database name GSH_PK_OBJECTIDC) */
    val pk = primaryKey("GSH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatGroupStructureHistory */
  lazy val GreatGroupStructureHistory = new TableQuery(tag => new GreatGroupStructureHistory(tag))



  /** Entity class storing rows of table GreatPerson
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
  case class GreatPersonRow(personKey: String, name: Option[String], appendix1: Option[String], appendix2: Option[String], appendix3: Option[String], iso3166Alpha3Code: Option[String], zip: Option[String], city: Option[String], street: Option[String], telephone: Option[String], telefax: Option[String], email: Option[String], ifa: Option[String], commentary: Option[String], employeeNumber: Option[String], accountingAreaCode: Option[String], nationalName: Option[String], nationalStreet: Option[String], nationalCity: Option[String], nationalAppendix1: Option[String], nationalAppendix2: Option[String], nationalAppendix3: Option[String])
  /** GetResult implicit for fetching GreatPersonRow objects using plain SQL queries */
  implicit def GetResultGreatPersonRow(implicit e0: GR[String], e1: GR[Option[String]]): GR[GreatPersonRow] = GR{
    prs => import prs._
      GreatPersonRow.tupled((<<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_PERSON. Objects of this class serve as prototypes for rows in queries. */
  class GreatPerson(_tableTag: Tag) extends profile.api.Table[GreatPersonRow](_tableTag, Some("WERNER2"), "GREAT_PERSON") {
    def * = (personKey, name, appendix1, appendix2, appendix3, iso3166Alpha3Code, zip, city, street, telephone, telefax, email, ifa, commentary, employeeNumber, accountingAreaCode, nationalName, nationalStreet, nationalCity, nationalAppendix1, nationalAppendix2, nationalAppendix3) <> (GreatPersonRow.tupled, GreatPersonRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(personKey), name, appendix1, appendix2, appendix3, iso3166Alpha3Code, zip, city, street, telephone, telefax, email, ifa, commentary, employeeNumber, accountingAreaCode, nationalName, nationalStreet, nationalCity, nationalAppendix1, nationalAppendix2, nationalAppendix3).shaped.<>({r=>import r._; _1.map(_=> GreatPersonRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing GreatAccountingArea (database name PERS_FK_ACCOUNTING_AREA_CODE) */
    lazy val greatAccountingAreaFk = foreignKey("PERS_FK_ACCOUNTING_AREA_CODE", accountingAreaCode, GreatAccountingArea)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCountry (database name PERS_FK_ISO_3166_ALPHA3_CODE) */
    lazy val greatCountryFk = foreignKey("PERS_FK_ISO_3166_ALPHA3_CODE", iso3166Alpha3Code, GreatCountry)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatPerson */
  lazy val GreatPerson = new TableQuery(tag => new GreatPerson(tag))


  /** Row type of table GreatUser */
  type GreatUserRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatUserRow providing default values if available in the database schema. */
  def GreatUserRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], password: Option[String], isAbsent: Option[Char], language: Option[String], upperLimitAmount: Option[scala.math.BigDecimal], upperLimitCurrency: Option[String], divisionIdc: Option[String], personKey: Option[String], passwordCreationDate: Option[java.sql.Timestamp], passwordFifoList: Option[String], loginTrials: Option[scala.math.BigDecimal], loginTrialDate: Option[java.sql.Timestamp], department: Option[String], reset: Option[Char], isActive: Option[Char], viewerType: Option[String], roles: Option[String], gid: Option[String], organisationName: Option[String], organisationUnitName: Option[String], userAccountIdc: Option[String], isDefault: Option[Char]): GreatUserRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: password :: isAbsent :: language :: upperLimitAmount :: upperLimitCurrency :: divisionIdc :: personKey :: passwordCreationDate :: passwordFifoList :: loginTrials :: loginTrialDate :: department :: reset :: isActive :: viewerType :: roles :: gid :: organisationName :: organisationUnitName :: userAccountIdc :: isDefault :: HNil
  }
  /** GetResult implicit for fetching GreatUserRow objects using plain SQL queries */
  implicit def GetResultGreatUserRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatUserRow] = GR{
    prs => import prs._
      <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_USER. Objects of this class serve as prototypes for rows in queries. */
  class GreatUser(_tableTag: Tag) extends profile.api.Table[GreatUserRow](_tableTag, Some("WERNER2"), "GREAT_USER") {
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
  /** Collection-like TableQuery object for table GreatUser */
  lazy val GreatUser = new TableQuery(tag => new GreatUser(tag))

  /** Entity class storing rows of table GreatUserAccount
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
  case class GreatUserAccountRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], personKey: Option[String], gid: Option[String], password: Option[String], passwordCreationDate: Option[java.sql.Timestamp], passwordFifoList: Option[String], loginTrials: Option[scala.math.BigDecimal], loginTrialDate: Option[java.sql.Timestamp], reset: Option[Char], language: Option[String], department: Option[String], organisationName: Option[String], organisationUnitName: Option[String])
  /** GetResult implicit for fetching GreatUserAccountRow objects using plain SQL queries */
  implicit def GetResultGreatUserAccountRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatUserAccountRow] = GR{
    prs => import prs._
      GreatUserAccountRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_USER_ACCOUNT. Objects of this class serve as prototypes for rows in queries. */
  class GreatUserAccount(_tableTag: Tag) extends profile.api.Table[GreatUserAccountRow](_tableTag, Some("WERNER2"), "GREAT_USER_ACCOUNT") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, personKey, gid, password, passwordCreationDate, passwordFifoList, loginTrials, loginTrialDate, reset, language, department, organisationName, organisationUnitName) <> (GreatUserAccountRow.tupled, GreatUserAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, personKey, gid, password, passwordCreationDate, passwordFifoList, loginTrials, loginTrialDate, reset, language, department, organisationName, organisationUnitName).shaped.<>({r=>import r._; _1.map(_=> GreatUserAccountRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing GreatLanguage (database name UAC_FK_LANGUAGE) */
    lazy val greatLanguageFk = foreignKey("UAC_FK_LANGUAGE", language, GreatLanguage)(r => Rep.Some(r.iso639Code), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatPerson (database name UAC_FK_PERSON_KEY) */
    lazy val greatPersonFk = foreignKey("UAC_FK_PERSON_KEY", personKey, GreatPerson)(r => Rep.Some(r.personKey), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatUserAccount */
  lazy val GreatUserAccount = new TableQuery(tag => new GreatUserAccount(tag))

  /** Entity class storing rows of table GreatUserDeputies
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param deputyIdc Database column DEPUTY_IDC SqlType(VARCHAR2), Length(10,true) */
  case class GreatUserDeputiesRow(userIdc: String, deputyIdc: String)
  /** GetResult implicit for fetching GreatUserDeputiesRow objects using plain SQL queries */
  implicit def GetResultGreatUserDeputiesRow(implicit e0: GR[String]): GR[GreatUserDeputiesRow] = GR{
    prs => import prs._
      GreatUserDeputiesRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_USER_DEPUTIES. Objects of this class serve as prototypes for rows in queries. */
  class GreatUserDeputies(_tableTag: Tag) extends profile.api.Table[GreatUserDeputiesRow](_tableTag, Some("WERNER2"), "GREAT_USER_DEPUTIES") {
    def * = (userIdc, deputyIdc) <> (GreatUserDeputiesRow.tupled, GreatUserDeputiesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userIdc), Rep.Some(deputyIdc)).shaped.<>({r=>import r._; _1.map(_=> GreatUserDeputiesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))
    /** Database column DEPUTY_IDC SqlType(VARCHAR2), Length(10,true) */
    val deputyIdc: Rep[String] = column[String]("DEPUTY_IDC", O.Length(10,varying=true))

    /** Primary key of GreatUserDeputies (database name UD_PK_USER_IDC) */
    val pk = primaryKey("UD_PK_USER_IDC", (userIdc, deputyIdc))

    /** Foreign key referencing GreatDivisionUser (database name UD_FK_DEPUTY_IDC) */
    lazy val greatDivisionUserFk1 = foreignKey("UD_FK_DEPUTY_IDC", deputyIdc, GreatDivisionUser)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name UD_FK_USER_IDC) */
    lazy val greatDivisionUserFk2 = foreignKey("UD_FK_USER_IDC", userIdc, GreatDivisionUser)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatUserDeputies */
  lazy val GreatUserDeputies = new TableQuery(tag => new GreatUserDeputies(tag))

  /** Entity class storing rows of table GreatUserGroup
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
  case class GreatUserGroupRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], divisionIdc: Option[String], name: Option[String], description: Option[String], address: Option[String], extension: Option[String], disabled: Option[Char])
  /** GetResult implicit for fetching GreatUserGroupRow objects using plain SQL queries */
  implicit def GetResultGreatUserGroupRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatUserGroupRow] = GR{
    prs => import prs._
      GreatUserGroupRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_USER_GROUP. Objects of this class serve as prototypes for rows in queries. */
  class GreatUserGroup(_tableTag: Tag) extends profile.api.Table[GreatUserGroupRow](_tableTag, Some("WERNER2"), "GREAT_USER_GROUP") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, divisionIdc, name, description, address, extension, disabled) <> (GreatUserGroupRow.tupled, GreatUserGroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, divisionIdc, name, description, address, extension, disabled).shaped.<>({r=>import r._; _1.map(_=> GreatUserGroupRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing GreatDivision (database name UG_FK_DIVISION_IDC) */
    lazy val greatDivisionFk = foreignKey("UG_FK_DIVISION_IDC", divisionIdc, GreatDivision)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatUserGroup */
  lazy val GreatUserGroup = new TableQuery(tag => new GreatUserGroup(tag))

  /** Entity class storing rows of table GreatUserInDivision
    *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param role Database column ROLE SqlType(VARCHAR2), Length(4,true) */
  case class GreatUserInDivisionRow(divisionIdc: String, userIdc: String, role: String)
  /** GetResult implicit for fetching GreatUserInDivisionRow objects using plain SQL queries */
  implicit def GetResultGreatUserInDivisionRow(implicit e0: GR[String]): GR[GreatUserInDivisionRow] = GR{
    prs => import prs._
      GreatUserInDivisionRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table GREAT_USER_IN_DIVISION. Objects of this class serve as prototypes for rows in queries. */
  class GreatUserInDivision(_tableTag: Tag) extends profile.api.Table[GreatUserInDivisionRow](_tableTag, Some("WERNER2"), "GREAT_USER_IN_DIVISION") {
    def * = (divisionIdc, userIdc, role) <> (GreatUserInDivisionRow.tupled, GreatUserInDivisionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(divisionIdc), Rep.Some(userIdc), Rep.Some(role)).shaped.<>({r=>import r._; _1.map(_=> GreatUserInDivisionRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[String] = column[String]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))
    /** Database column ROLE SqlType(VARCHAR2), Length(4,true) */
    val role: Rep[String] = column[String]("ROLE", O.Length(4,varying=true))

    /** Primary key of GreatUserInDivision (database name UD_PK_DIVISION_IDC) */
    val pk = primaryKey("UD_PK_DIVISION_IDC", (divisionIdc, userIdc, role))
  }
  /** Collection-like TableQuery object for table GreatUserInDivision */
  lazy val GreatUserInDivision = new TableQuery(tag => new GreatUserInDivision(tag))


  /** Entity class storing rows of table GreatAppInGroup
    *  @param userGroupIdc Database column USER_GROUP_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
  case class GreatAppInGroupRow(userGroupIdc: String, userIdc: String)
  /** GetResult implicit for fetching GreatAppInGroupRow objects using plain SQL queries */
  implicit def GetResultGreatAppInGroupRow(implicit e0: GR[String]): GR[GreatAppInGroupRow] = GR{
    prs => import prs._
      GreatAppInGroupRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_APP_IN_GROUP. Objects of this class serve as prototypes for rows in queries. */
  class GreatAppInGroup(_tableTag: Tag) extends profile.api.Table[GreatAppInGroupRow](_tableTag, Some("WERNER2"), "GREAT_APP_IN_GROUP") {
    def * = (userGroupIdc, userIdc) <> (GreatAppInGroupRow.tupled, GreatAppInGroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userGroupIdc), Rep.Some(userIdc)).shaped.<>({r=>import r._; _1.map(_=> GreatAppInGroupRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column USER_GROUP_IDC SqlType(VARCHAR2), Length(10,true) */
    val userGroupIdc: Rep[String] = column[String]("USER_GROUP_IDC", O.Length(10,varying=true))
    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[String] = column[String]("USER_IDC", O.Length(10,varying=true))

    /** Primary key of GreatAppInGroup (database name APPIG_PK_USER_GROUP_IDC) */
    val pk = primaryKey("APPIG_PK_USER_GROUP_IDC", (userGroupIdc, userIdc))
  }
  /** Collection-like TableQuery object for table GreatAppInGroup */
  lazy val GreatAppInGroup = new TableQuery(tag => new GreatAppInGroup(tag))

}
