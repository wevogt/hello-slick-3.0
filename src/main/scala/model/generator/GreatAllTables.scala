package model.generator

// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object GreatReverseEngineered extends {
  val profile = slick.jdbc.OracleProfile
} with GreatReverseEngineered

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait GreatReverseEngineered {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(GreatAccountConsumption.schema, GreatAccountingArea.schema, GreatAccountingAreaHistory.schema, GreatAnnotatedAmount.schema, GreatAppInGroup.schema, GreatArchivingBarcode.schema, GreatArchivingIxosResult.schema, GreatArchivingMetadata.schema, GreatArchivingTransported.schema, GreatAuditLog.schema, GreatBalanceSheetReportDef.schema, GreatBalanceSheetReportRun.schema, GreatBareBillingRun.schema, GreatBareDependants.schema, GreatBareDependantsHistory.schema, GreatBareRights.schema, GreatBatchDriver.schema, GreatBatchJobDescription.schema, GreatBatchJobRun.schema, GreatBillingRun.schema, GreatBookEntry.schema, GreatBookEntryRelation.schema, GreatBulkUpdateDef.schema, GreatBulkUpdateDokuments.schema, GreatBulkUpdateGuarantee.schema, GreatBulkUpdateRun.schema, GreatBulkUpdateValue.schema, GreatBusinessPartner.schema, GreatBusinessPartnerHistory.schema, GreatBusinessUnits.schema, GreatCommissionRecBareDep.schema, GreatCommissionReceiver.schema, GreatCommissionReceiverHist.schema, GreatConsumption.schema, GreatContractConsumption.schema, GreatCostItem.schema, GreatCountry.schema, GreatCountryHistory.schema, GreatCurrency.schema, GreatCurrencyHistory.schema, GreatDebtorPortion.schema, GreatDivision.schema, GreatDivisioncodeInSector.schema, GreatDivisionLimits.schema, GreatDivisionReportRight.schema, GreatDivisionUser.schema, GreatDownloadColumn.schema, GreatDownloadFormat.schema, GreatDownloadFormatRef.schema, GreatEnterprise.schema, GreatExemptions.schema, GreatFxRates.schema, GreatGassociation.schema, GreatGassociationHistory.schema, GreatGassociationMember.schema, GreatGlineAccount.schema, GreatGlineAccountHistory.schema, GreatGlineContract.schema, GreatGlineContractHistory.schema, GreatGlineReservation.schema, GreatGlineReservationHist.schema, GreatGlineReservations.schema, GreatGlineReservationsHist.schema, GreatGmsState.schema, GreatGmsTransfer.schema, GreatGmsTransferEntity.schema, GreatGroupStructure.schema, GreatGroupStructureHistory.schema, GreatGuarantee.schema, GreatGuaranteeAttachment.schema, GreatGuaranteeFile.schema, GreatGuaranteeScheduler2.schema, GreatImport.schema, GreatInternatTexts.schema, GreatInvoice.schema, GreatInvoiceEvent.schema, GreatInvoiceEvidence.schema, GreatInvoiceEvidencePos.schema, GreatInvoiceLineItem.schema, GreatInvoiceNumber.schema, GreatInvoicePass.schema, GreatInvPassCalendar.schema, GreatLanguage.schema, GreatLatestFxRates.schema, GreatMessageAttachment.schema, GreatMessageEvent.schema, GreatMessageInfo.schema, GreatOpenftParameter.schema, GreatOrg.schema, GreatOrgHistory.schema, GreatPayment.schema, GreatPerson.schema, GreatPriceScaleEntry.schema, GreatPriceScaleEntryHist.schema, GreatQuarterlyReserves.schema, GreatRatings.schema, GreatReconciliationProcess.schema, GreatReminderRun.schema, GreatRequest.schema, GreatServerstatsSnapshot.schema, GreatSettlement.schema, GreatSviewConstraint.schema, GreatUniqueIds.schema, GreatUnitAttributeChoice.schema, GreatUnitAttributes.schema, GreatUser.schema, GreatUserAccount.schema, GreatUserDeputies.schema, GreatUserGroup.schema, GreatUserInDivision.schema, GreatWorkflowStep.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table GreatAccountConsumption
   *  @param lineAccountIdc Database column LINE_ACCOUNT_IDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param utilizedVolume Database column UTILIZED_VOLUME SqlType(NUMBER)
   *  @param utilizedVolumeCur Database column UTILIZED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param requestedVolume Database column REQUESTED_VOLUME SqlType(NUMBER)
   *  @param requestedVolumeCur Database column REQUESTED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param reservedVolume Database column RESERVED_VOLUME SqlType(NUMBER)
   *  @param reservedVolumeCur Database column RESERVED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param enquiredVolume Database column ENQUIRED_VOLUME SqlType(NUMBER)
   *  @param enquiredVolumeCur Database column ENQUIRED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param freeSpace Database column FREE_SPACE SqlType(NUMBER)
   *  @param freeSpaceCur Database column FREE_SPACE_CUR SqlType(CHAR), Length(3,false)
   *  @param degreeOfUtilization Database column DEGREE_OF_UTILIZATION SqlType(NUMBER) */
  case class GreatAccountConsumptionRow(lineAccountIdc: String, utilizedVolume: Option[scala.math.BigDecimal], utilizedVolumeCur: Option[String], requestedVolume: Option[scala.math.BigDecimal], requestedVolumeCur: Option[String], reservedVolume: Option[scala.math.BigDecimal], reservedVolumeCur: Option[String], enquiredVolume: Option[scala.math.BigDecimal], enquiredVolumeCur: Option[String], freeSpace: Option[scala.math.BigDecimal], freeSpaceCur: Option[String], degreeOfUtilization: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatAccountConsumptionRow objects using plain SQL queries */
  implicit def GetResultGreatAccountConsumptionRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]]): GR[GreatAccountConsumptionRow] = GR{
    prs => import prs._
    GreatAccountConsumptionRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_ACCOUNT_CONSUMPTION. Objects of this class serve as prototypes for rows in queries. */
  class GreatAccountConsumption(_tableTag: Tag) extends profile.api.Table[GreatAccountConsumptionRow](_tableTag, Some("WERNER2"), "GREAT_ACCOUNT_CONSUMPTION") {
    def * = (lineAccountIdc, utilizedVolume, utilizedVolumeCur, requestedVolume, requestedVolumeCur, reservedVolume, reservedVolumeCur, enquiredVolume, enquiredVolumeCur, freeSpace, freeSpaceCur, degreeOfUtilization) <> (GreatAccountConsumptionRow.tupled, GreatAccountConsumptionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(lineAccountIdc), utilizedVolume, utilizedVolumeCur, requestedVolume, requestedVolumeCur, reservedVolume, reservedVolumeCur, enquiredVolume, enquiredVolumeCur, freeSpace, freeSpaceCur, degreeOfUtilization).shaped.<>({r=>import r._; _1.map(_=> GreatAccountConsumptionRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column LINE_ACCOUNT_IDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val lineAccountIdc: Rep[String] = column[String]("LINE_ACCOUNT_IDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column UTILIZED_VOLUME SqlType(NUMBER) */
    val utilizedVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UTILIZED_VOLUME")
    /** Database column UTILIZED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val utilizedVolumeCur: Rep[Option[String]] = column[Option[String]]("UTILIZED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column REQUESTED_VOLUME SqlType(NUMBER) */
    val requestedVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("REQUESTED_VOLUME")
    /** Database column REQUESTED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val requestedVolumeCur: Rep[Option[String]] = column[Option[String]]("REQUESTED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column RESERVED_VOLUME SqlType(NUMBER) */
    val reservedVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RESERVED_VOLUME")
    /** Database column RESERVED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val reservedVolumeCur: Rep[Option[String]] = column[Option[String]]("RESERVED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column ENQUIRED_VOLUME SqlType(NUMBER) */
    val enquiredVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ENQUIRED_VOLUME")
    /** Database column ENQUIRED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val enquiredVolumeCur: Rep[Option[String]] = column[Option[String]]("ENQUIRED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column FREE_SPACE SqlType(NUMBER) */
    val freeSpace: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FREE_SPACE")
    /** Database column FREE_SPACE_CUR SqlType(CHAR), Length(3,false) */
    val freeSpaceCur: Rep[Option[String]] = column[Option[String]]("FREE_SPACE_CUR", O.Length(3,varying=false))
    /** Database column DEGREE_OF_UTILIZATION SqlType(NUMBER) */
    val degreeOfUtilization: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEGREE_OF_UTILIZATION")

    /** Foreign key referencing GreatGlineAccount (database name GAC_FK_LINE_ACCOUNT_IDC) */
    lazy val greatGlineAccountFk = foreignKey("GAC_FK_LINE_ACCOUNT_IDC", lineAccountIdc, GreatGlineAccount)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatAccountConsumption */
  lazy val GreatAccountConsumption = new TableQuery(tag => new GreatAccountConsumption(tag))

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

  /** Entity class storing rows of table GreatAnnotatedAmount
   *  @param annotatedAmountKey Database column ANNOTATED_AMOUNT_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param amount Database column AMOUNT SqlType(NUMBER)
   *  @param currencyIsoCode Database column CURRENCY_ISO_CODE SqlType(CHAR), Length(3,false)
   *  @param parentKey Database column PARENT_KEY SqlType(VARCHAR2), Length(10,true) */
  case class GreatAnnotatedAmountRow(annotatedAmountKey: String, amount: Option[scala.math.BigDecimal], currencyIsoCode: Option[String], parentKey: Option[String])
  /** GetResult implicit for fetching GreatAnnotatedAmountRow objects using plain SQL queries */
  implicit def GetResultGreatAnnotatedAmountRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]]): GR[GreatAnnotatedAmountRow] = GR{
    prs => import prs._
    GreatAnnotatedAmountRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_ANNOTATED_AMOUNT. Objects of this class serve as prototypes for rows in queries. */
  class GreatAnnotatedAmount(_tableTag: Tag) extends profile.api.Table[GreatAnnotatedAmountRow](_tableTag, Some("WERNER2"), "GREAT_ANNOTATED_AMOUNT") {
    def * = (annotatedAmountKey, amount, currencyIsoCode, parentKey) <> (GreatAnnotatedAmountRow.tupled, GreatAnnotatedAmountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(annotatedAmountKey), amount, currencyIsoCode, parentKey).shaped.<>({r=>import r._; _1.map(_=> GreatAnnotatedAmountRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ANNOTATED_AMOUNT_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val annotatedAmountKey: Rep[String] = column[String]("ANNOTATED_AMOUNT_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column CURRENCY_ISO_CODE SqlType(CHAR), Length(3,false) */
    val currencyIsoCode: Rep[Option[String]] = column[Option[String]]("CURRENCY_ISO_CODE", O.Length(3,varying=false))
    /** Database column PARENT_KEY SqlType(VARCHAR2), Length(10,true) */
    val parentKey: Rep[Option[String]] = column[Option[String]]("PARENT_KEY", O.Length(10,varying=true))

    /** Foreign key referencing GreatCurrency (database name AAM_FK_CURRENCY_ISO_CODE) */
    lazy val greatCurrencyFk = foreignKey("AAM_FK_CURRENCY_ISO_CODE", currencyIsoCode, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (parentKey) (database name AAM_IDX0) */
    val index1 = index("AAM_IDX0", parentKey)
  }
  /** Collection-like TableQuery object for table GreatAnnotatedAmount */
  lazy val GreatAnnotatedAmount = new TableQuery(tag => new GreatAnnotatedAmount(tag))

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

  /** Entity class storing rows of table GreatArchivingBarcode
   *  @param barcode Database column BARCODE SqlType(VARCHAR2), PrimaryKey, Length(5,true)
   *  @param barcodeCreationDate Database column BARCODE_CREATION_DATE SqlType(DATE)
   *  @param barcodePrintAction Database column BARCODE_PRINT_ACTION SqlType(CHAR), Length(10,false)
   *  @param right Database column RIGHT SqlType(CHAR)
   *  @param userId Database column USER_ID SqlType(VARCHAR2), Length(10,true)
   *  @param function Database column FUNCTION SqlType(CHAR)
   *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(4000,true)
   *  @param guaranteeFileNumber Database column GUARANTEE_FILE_NUMBER SqlType(VARCHAR2), Length(20,true)
   *  @param guaranteeFileObjectidc Database column GUARANTEE_FILE_OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param guaranteeVersion Database column GUARANTEE_VERSION SqlType(NUMBER)
   *  @param guarantorType Database column GUARANTOR_TYPE SqlType(CHAR)
   *  @param maturityDate Database column MATURITY_DATE SqlType(DATE)
   *  @param archiveCountryIsocode2 Database column ARCHIVE_COUNTRY_ISOCODE2 SqlType(VARCHAR2), Length(2,true) */
  case class GreatArchivingBarcodeRow(barcode: String, barcodeCreationDate: Option[java.sql.Timestamp], barcodePrintAction: Option[String], right: Option[Char], userId: Option[String], function: Option[Char], description: Option[String], guaranteeFileNumber: Option[String], guaranteeFileObjectidc: Option[String], guaranteeVersion: Option[scala.math.BigDecimal], guarantorType: Option[Char], maturityDate: Option[java.sql.Timestamp], archiveCountryIsocode2: Option[String])
  /** GetResult implicit for fetching GreatArchivingBarcodeRow objects using plain SQL queries */
  implicit def GetResultGreatArchivingBarcodeRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[Char]], e4: GR[Option[scala.math.BigDecimal]]): GR[GreatArchivingBarcodeRow] = GR{
    prs => import prs._
    GreatArchivingBarcodeRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[Char], <<?[String], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[Char], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table GREAT_ARCHIVING_BARCODE. Objects of this class serve as prototypes for rows in queries. */
  class GreatArchivingBarcode(_tableTag: Tag) extends profile.api.Table[GreatArchivingBarcodeRow](_tableTag, Some("WERNER2"), "GREAT_ARCHIVING_BARCODE") {
    def * = (barcode, barcodeCreationDate, barcodePrintAction, right, userId, function, description, guaranteeFileNumber, guaranteeFileObjectidc, guaranteeVersion, guarantorType, maturityDate, archiveCountryIsocode2) <> (GreatArchivingBarcodeRow.tupled, GreatArchivingBarcodeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(barcode), barcodeCreationDate, barcodePrintAction, right, userId, function, description, guaranteeFileNumber, guaranteeFileObjectidc, guaranteeVersion, guarantorType, maturityDate, archiveCountryIsocode2).shaped.<>({r=>import r._; _1.map(_=> GreatArchivingBarcodeRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARCODE SqlType(VARCHAR2), PrimaryKey, Length(5,true) */
    val barcode: Rep[String] = column[String]("BARCODE", O.PrimaryKey, O.Length(5,varying=true))
    /** Database column BARCODE_CREATION_DATE SqlType(DATE) */
    val barcodeCreationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BARCODE_CREATION_DATE")
    /** Database column BARCODE_PRINT_ACTION SqlType(CHAR), Length(10,false) */
    val barcodePrintAction: Rep[Option[String]] = column[Option[String]]("BARCODE_PRINT_ACTION", O.Length(10,varying=false))
    /** Database column RIGHT SqlType(CHAR) */
    val right: Rep[Option[Char]] = column[Option[Char]]("RIGHT")
    /** Database column USER_ID SqlType(VARCHAR2), Length(10,true) */
    val userId: Rep[Option[String]] = column[Option[String]]("USER_ID", O.Length(10,varying=true))
    /** Database column FUNCTION SqlType(CHAR) */
    val function: Rep[Option[Char]] = column[Option[Char]]("FUNCTION")
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(4000,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(4000,varying=true))
    /** Database column GUARANTEE_FILE_NUMBER SqlType(VARCHAR2), Length(20,true) */
    val guaranteeFileNumber: Rep[Option[String]] = column[Option[String]]("GUARANTEE_FILE_NUMBER", O.Length(20,varying=true))
    /** Database column GUARANTEE_FILE_OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val guaranteeFileObjectidc: Rep[Option[String]] = column[Option[String]]("GUARANTEE_FILE_OBJECTIDC", O.Length(10,varying=true))
    /** Database column GUARANTEE_VERSION SqlType(NUMBER) */
    val guaranteeVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GUARANTEE_VERSION")
    /** Database column GUARANTOR_TYPE SqlType(CHAR) */
    val guarantorType: Rep[Option[Char]] = column[Option[Char]]("GUARANTOR_TYPE")
    /** Database column MATURITY_DATE SqlType(DATE) */
    val maturityDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MATURITY_DATE")
    /** Database column ARCHIVE_COUNTRY_ISOCODE2 SqlType(VARCHAR2), Length(2,true) */
    val archiveCountryIsocode2: Rep[Option[String]] = column[Option[String]]("ARCHIVE_COUNTRY_ISOCODE2", O.Length(2,varying=true))

    /** Foreign key referencing GreatDivisionUser (database name AB_FK_USER_ID) */
    lazy val greatDivisionUserFk = foreignKey("AB_FK_USER_ID", userId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuarantee (database name AB_FK_GUARANTEE_VERSION) */
    lazy val greatGuaranteeFk = foreignKey("AB_FK_GUARANTEE_VERSION", (guaranteeFileObjectidc, guaranteeVersion), GreatGuarantee)(r => (Rep.Some(r.fileIdValue), Rep.Some(r.guaranteeVersion)), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (guaranteeFileNumber) (database name AB_IDX0) */
    val index1 = index("AB_IDX0", guaranteeFileNumber)
  }
  /** Collection-like TableQuery object for table GreatArchivingBarcode */
  lazy val GreatArchivingBarcode = new TableQuery(tag => new GreatArchivingBarcode(tag))

  /** Entity class storing rows of table GreatArchivingIxosResult
   *  @param barcode Database column BARCODE SqlType(VARCHAR2), Length(5,true)
   *  @param ixosDataCreationTimestamp Database column IXOS_DATA_CREATION_TIMESTAMP SqlType(TIMESTAMP(6))
   *  @param ixosDsId Database column IXOS_DS_ID SqlType(VARCHAR2), Length(40,true)
   *  @param ixos28Barcode Database column IXOS_28_BARCODE SqlType(VARCHAR2), Length(28,true)
   *  @param ixosDocumentFormat Database column IXOS_DOCUMENT_FORMAT SqlType(VARCHAR2), Length(4,true)
   *  @param ixosFileSize Database column IXOS_FILE_SIZE SqlType(NUMBER)
   *  @param ixosArchivingDate Database column IXOS_ARCHIVING_DATE SqlType(DATE)
   *  @param ixosScanedPagesCount Database column IXOS_SCANED_PAGES_COUNT SqlType(NUMBER)
   *  @param ixosPictureFilename Database column IXOS_PICTURE_FILENAME SqlType(VARCHAR2), Length(50,true)
   *  @param ixosReceivedFileName Database column IXOS_RECEIVED_FILE_NAME SqlType(VARCHAR2), Length(50,true) */
  case class GreatArchivingIxosResultRow(barcode: String, ixosDataCreationTimestamp: java.sql.Timestamp, ixosDsId: Option[String], ixos28Barcode: Option[String], ixosDocumentFormat: Option[String], ixosFileSize: Option[scala.math.BigDecimal], ixosArchivingDate: Option[java.sql.Timestamp], ixosScanedPagesCount: Option[scala.math.BigDecimal], ixosPictureFilename: Option[String], ixosReceivedFileName: Option[String])
  /** GetResult implicit for fetching GreatArchivingIxosResultRow objects using plain SQL queries */
  implicit def GetResultGreatArchivingIxosResultRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[java.sql.Timestamp]]): GR[GreatArchivingIxosResultRow] = GR{
    prs => import prs._
    GreatArchivingIxosResultRow.tupled((<<[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_ARCHIVING_IXOS_RESULT. Objects of this class serve as prototypes for rows in queries. */
  class GreatArchivingIxosResult(_tableTag: Tag) extends profile.api.Table[GreatArchivingIxosResultRow](_tableTag, Some("WERNER2"), "GREAT_ARCHIVING_IXOS_RESULT") {
    def * = (barcode, ixosDataCreationTimestamp, ixosDsId, ixos28Barcode, ixosDocumentFormat, ixosFileSize, ixosArchivingDate, ixosScanedPagesCount, ixosPictureFilename, ixosReceivedFileName) <> (GreatArchivingIxosResultRow.tupled, GreatArchivingIxosResultRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(barcode), Rep.Some(ixosDataCreationTimestamp), ixosDsId, ixos28Barcode, ixosDocumentFormat, ixosFileSize, ixosArchivingDate, ixosScanedPagesCount, ixosPictureFilename, ixosReceivedFileName).shaped.<>({r=>import r._; _1.map(_=> GreatArchivingIxosResultRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARCODE SqlType(VARCHAR2), Length(5,true) */
    val barcode: Rep[String] = column[String]("BARCODE", O.Length(5,varying=true))
    /** Database column IXOS_DATA_CREATION_TIMESTAMP SqlType(TIMESTAMP(6)) */
    val ixosDataCreationTimestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("IXOS_DATA_CREATION_TIMESTAMP")
    /** Database column IXOS_DS_ID SqlType(VARCHAR2), Length(40,true) */
    val ixosDsId: Rep[Option[String]] = column[Option[String]]("IXOS_DS_ID", O.Length(40,varying=true))
    /** Database column IXOS_28_BARCODE SqlType(VARCHAR2), Length(28,true) */
    val ixos28Barcode: Rep[Option[String]] = column[Option[String]]("IXOS_28_BARCODE", O.Length(28,varying=true))
    /** Database column IXOS_DOCUMENT_FORMAT SqlType(VARCHAR2), Length(4,true) */
    val ixosDocumentFormat: Rep[Option[String]] = column[Option[String]]("IXOS_DOCUMENT_FORMAT", O.Length(4,varying=true))
    /** Database column IXOS_FILE_SIZE SqlType(NUMBER) */
    val ixosFileSize: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("IXOS_FILE_SIZE")
    /** Database column IXOS_ARCHIVING_DATE SqlType(DATE) */
    val ixosArchivingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("IXOS_ARCHIVING_DATE")
    /** Database column IXOS_SCANED_PAGES_COUNT SqlType(NUMBER) */
    val ixosScanedPagesCount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("IXOS_SCANED_PAGES_COUNT")
    /** Database column IXOS_PICTURE_FILENAME SqlType(VARCHAR2), Length(50,true) */
    val ixosPictureFilename: Rep[Option[String]] = column[Option[String]]("IXOS_PICTURE_FILENAME", O.Length(50,varying=true))
    /** Database column IXOS_RECEIVED_FILE_NAME SqlType(VARCHAR2), Length(50,true) */
    val ixosReceivedFileName: Rep[Option[String]] = column[Option[String]]("IXOS_RECEIVED_FILE_NAME", O.Length(50,varying=true))

    /** Primary key of GreatArchivingIxosResult (database name AIR_PK_BARCODE) */
    val pk = primaryKey("AIR_PK_BARCODE", (barcode, ixosDataCreationTimestamp))

    /** Foreign key referencing GreatArchivingBarcode (database name AIR_FK_BARCODE) */
    lazy val greatArchivingBarcodeFk = foreignKey("AIR_FK_BARCODE", barcode, GreatArchivingBarcode)(r => r.barcode, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (ixosDsId) (database name AIR_IDX0) */
    val index1 = index("AIR_IDX0", ixosDsId)
  }
  /** Collection-like TableQuery object for table GreatArchivingIxosResult */
  lazy val GreatArchivingIxosResult = new TableQuery(tag => new GreatArchivingIxosResult(tag))

  /** Entity class storing rows of table GreatArchivingMetadata
   *  @param barcode Database column BARCODE SqlType(VARCHAR2), Length(5,true)
   *  @param metaDataCreationTimestamp Database column META_DATA_CREATION_TIMESTAMP SqlType(TIMESTAMP(6))
   *  @param ixosDataCreationTimestamp Database column IXOS_DATA_CREATION_TIMESTAMP SqlType(TIMESTAMP(6))
   *  @param transportId Database column TRANSPORT_ID SqlType(VARCHAR2), Length(10,true)
   *  @param bare Database column BARE SqlType(VARCHAR2), Length(4,true) */
  case class GreatArchivingMetadataRow(barcode: String, metaDataCreationTimestamp: java.sql.Timestamp, ixosDataCreationTimestamp: Option[java.sql.Timestamp], transportId: Option[String], bare: Option[String])
  /** GetResult implicit for fetching GreatArchivingMetadataRow objects using plain SQL queries */
  implicit def GetResultGreatArchivingMetadataRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]]): GR[GreatArchivingMetadataRow] = GR{
    prs => import prs._
    GreatArchivingMetadataRow.tupled((<<[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_ARCHIVING_METADATA. Objects of this class serve as prototypes for rows in queries. */
  class GreatArchivingMetadata(_tableTag: Tag) extends profile.api.Table[GreatArchivingMetadataRow](_tableTag, Some("WERNER2"), "GREAT_ARCHIVING_METADATA") {
    def * = (barcode, metaDataCreationTimestamp, ixosDataCreationTimestamp, transportId, bare) <> (GreatArchivingMetadataRow.tupled, GreatArchivingMetadataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(barcode), Rep.Some(metaDataCreationTimestamp), ixosDataCreationTimestamp, transportId, bare).shaped.<>({r=>import r._; _1.map(_=> GreatArchivingMetadataRow.tupled((_1.get, _2.get, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARCODE SqlType(VARCHAR2), Length(5,true) */
    val barcode: Rep[String] = column[String]("BARCODE", O.Length(5,varying=true))
    /** Database column META_DATA_CREATION_TIMESTAMP SqlType(TIMESTAMP(6)) */
    val metaDataCreationTimestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("META_DATA_CREATION_TIMESTAMP")
    /** Database column IXOS_DATA_CREATION_TIMESTAMP SqlType(TIMESTAMP(6)) */
    val ixosDataCreationTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("IXOS_DATA_CREATION_TIMESTAMP")
    /** Database column TRANSPORT_ID SqlType(VARCHAR2), Length(10,true) */
    val transportId: Rep[Option[String]] = column[Option[String]]("TRANSPORT_ID", O.Length(10,varying=true))
    /** Database column BARE SqlType(VARCHAR2), Length(4,true) */
    val bare: Rep[Option[String]] = column[Option[String]]("BARE", O.Length(4,varying=true))

    /** Primary key of GreatArchivingMetadata (database name AMD_PK_BARCODE) */
    val pk = primaryKey("AMD_PK_BARCODE", (barcode, metaDataCreationTimestamp))

    /** Foreign key referencing GreatArchivingIxosResult (database name AMD_FK_IXOS_DATA_CREATION_TI0) */
    lazy val greatArchivingIxosResultFk = foreignKey("AMD_FK_IXOS_DATA_CREATION_TI0", (barcode, ixosDataCreationTimestamp), GreatArchivingIxosResult)(r => (r.barcode, Rep.Some(r.ixosDataCreationTimestamp)), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatArchivingTransported (database name AMD_FK_TRANSPORT_ID) */
    lazy val greatArchivingTransportedFk = foreignKey("AMD_FK_TRANSPORT_ID", transportId, GreatArchivingTransported)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBareDependants (database name AMD_FK_BARE) */
    lazy val greatBareDependantsFk = foreignKey("AMD_FK_BARE", bare, GreatBareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatArchivingMetadata */
  lazy val GreatArchivingMetadata = new TableQuery(tag => new GreatArchivingMetadata(tag))

  /** Entity class storing rows of table GreatArchivingTransported
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param transportDate Database column TRANSPORT_DATE SqlType(DATE) */
  case class GreatArchivingTransportedRow(objectidc: String, transportDate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching GreatArchivingTransportedRow objects using plain SQL queries */
  implicit def GetResultGreatArchivingTransportedRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]]): GR[GreatArchivingTransportedRow] = GR{
    prs => import prs._
    GreatArchivingTransportedRow.tupled((<<[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table GREAT_ARCHIVING_TRANSPORTED. Objects of this class serve as prototypes for rows in queries. */
  class GreatArchivingTransported(_tableTag: Tag) extends profile.api.Table[GreatArchivingTransportedRow](_tableTag, Some("WERNER2"), "GREAT_ARCHIVING_TRANSPORTED") {
    def * = (objectidc, transportDate) <> (GreatArchivingTransportedRow.tupled, GreatArchivingTransportedRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), transportDate).shaped.<>({r=>import r._; _1.map(_=> GreatArchivingTransportedRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column TRANSPORT_DATE SqlType(DATE) */
    val transportDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("TRANSPORT_DATE")
  }
  /** Collection-like TableQuery object for table GreatArchivingTransported */
  lazy val GreatArchivingTransported = new TableQuery(tag => new GreatArchivingTransported(tag))

  /** Entity class storing rows of table GreatAuditLog
   *  @param key Database column KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param who Database column WHO SqlType(VARCHAR2), Length(10,true)
   *  @param when Database column WHEN SqlType(DATE)
   *  @param what Database column WHAT SqlType(CLOB)
   *  @param division Database column DIVISION SqlType(VARCHAR2), Length(52,true) */
  case class GreatAuditLogRow(key: String, who: Option[String], when: Option[java.sql.Timestamp], what: Option[java.sql.Clob], division: Option[String])
  /** GetResult implicit for fetching GreatAuditLogRow objects using plain SQL queries */
  implicit def GetResultGreatAuditLogRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[java.sql.Clob]]): GR[GreatAuditLogRow] = GR{
    prs => import prs._
    GreatAuditLogRow.tupled((<<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Clob], <<?[String]))
  }
  /** Table description of table GREAT_AUDIT_LOG. Objects of this class serve as prototypes for rows in queries. */
  class GreatAuditLog(_tableTag: Tag) extends profile.api.Table[GreatAuditLogRow](_tableTag, Some("WERNER2"), "GREAT_AUDIT_LOG") {
    def * = (key, who, when, what, division) <> (GreatAuditLogRow.tupled, GreatAuditLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(key), who, when, what, division).shaped.<>({r=>import r._; _1.map(_=> GreatAuditLogRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val key: Rep[String] = column[String]("KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column WHO SqlType(VARCHAR2), Length(10,true) */
    val who: Rep[Option[String]] = column[Option[String]]("WHO", O.Length(10,varying=true))
    /** Database column WHEN SqlType(DATE) */
    val when: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("WHEN")
    /** Database column WHAT SqlType(CLOB) */
    val what: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("WHAT")
    /** Database column DIVISION SqlType(VARCHAR2), Length(52,true) */
    val division: Rep[Option[String]] = column[Option[String]]("DIVISION", O.Length(52,varying=true))
  }
  /** Collection-like TableQuery object for table GreatAuditLog */
  lazy val GreatAuditLog = new TableQuery(tag => new GreatAuditLog(tag))

  /** Row type of table GreatBalanceSheetReportDef */
  type GreatBalanceSheetReportDefRow = HCons[String,HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatBalanceSheetReportDefRow providing default values if available in the database schema. */
  def GreatBalanceSheetReportDefRow(idValue: String, kind: Option[String], reportDate: Option[java.sql.Timestamp], userName: Option[String], accEmail: Option[String], b40Active: Option[Char], b40EmailSubject: Option[String], b40EmailText: Option[String], b40CoverLetterFilePath: Option[String], b40DivisionTableFilePath: Option[String], b40ParameterFilePath: Option[String], frnActive: Option[Char], frnEmailSubject: Option[String], frnEmailText: Option[String], frnCoverLetterFilePath: Option[String], frnDivisionTableFilePath: Option[String], ownActive: Option[Char], ownEmailSubject: Option[String], ownEmailText: Option[String], ownCoverLetterFilePath: Option[String], ownDivisionTableFilePath: Option[String], bareCodes: Option[String], exdActive: Option[Char], exdEmailSubject: Option[String], exdEmailText: Option[String], exdCoverLetterFilePath: Option[String], exdReceivers: Option[String], sktfActive: Option[Char], sktfEmailSubject: Option[String], sktfEmailText: Option[String], sktfCoverLetterFilePath: Option[String], sktfReceivers: Option[String], rpaActive: Option[Char], rpaEmailSubject: Option[String], rpaEmailText: Option[String], rpaCoverLetterFilePath: Option[String], rpaMasterTableFilePath: Option[String]): GreatBalanceSheetReportDefRow = {
    idValue :: kind :: reportDate :: userName :: accEmail :: b40Active :: b40EmailSubject :: b40EmailText :: b40CoverLetterFilePath :: b40DivisionTableFilePath :: b40ParameterFilePath :: frnActive :: frnEmailSubject :: frnEmailText :: frnCoverLetterFilePath :: frnDivisionTableFilePath :: ownActive :: ownEmailSubject :: ownEmailText :: ownCoverLetterFilePath :: ownDivisionTableFilePath :: bareCodes :: exdActive :: exdEmailSubject :: exdEmailText :: exdCoverLetterFilePath :: exdReceivers :: sktfActive :: sktfEmailSubject :: sktfEmailText :: sktfCoverLetterFilePath :: sktfReceivers :: rpaActive :: rpaEmailSubject :: rpaEmailText :: rpaCoverLetterFilePath :: rpaMasterTableFilePath :: HNil
  }
  /** GetResult implicit for fetching GreatBalanceSheetReportDefRow objects using plain SQL queries */
  implicit def GetResultGreatBalanceSheetReportDefRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Char]]): GR[GreatBalanceSheetReportDefRow] = GR{
    prs => import prs._
    <<[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BALANCE_SHEET_REPORT_DEF. Objects of this class serve as prototypes for rows in queries. */
  class GreatBalanceSheetReportDef(_tableTag: Tag) extends profile.api.Table[GreatBalanceSheetReportDefRow](_tableTag, Some("WERNER2"), "GREAT_BALANCE_SHEET_REPORT_DEF") {
    def * = idValue :: kind :: reportDate :: userName :: accEmail :: b40Active :: b40EmailSubject :: b40EmailText :: b40CoverLetterFilePath :: b40DivisionTableFilePath :: b40ParameterFilePath :: frnActive :: frnEmailSubject :: frnEmailText :: frnCoverLetterFilePath :: frnDivisionTableFilePath :: ownActive :: ownEmailSubject :: ownEmailText :: ownCoverLetterFilePath :: ownDivisionTableFilePath :: bareCodes :: exdActive :: exdEmailSubject :: exdEmailText :: exdCoverLetterFilePath :: exdReceivers :: sktfActive :: sktfEmailSubject :: sktfEmailText :: sktfCoverLetterFilePath :: sktfReceivers :: rpaActive :: rpaEmailSubject :: rpaEmailText :: rpaCoverLetterFilePath :: rpaMasterTableFilePath :: HNil

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column KIND SqlType(VARCHAR2), Length(8,true) */
    val kind: Rep[Option[String]] = column[Option[String]]("KIND", O.Length(8,varying=true))
    /** Database column REPORT_DATE SqlType(DATE) */
    val reportDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("REPORT_DATE")
    /** Database column USER_NAME SqlType(VARCHAR2), Length(52,true) */
    val userName: Rep[Option[String]] = column[Option[String]]("USER_NAME", O.Length(52,varying=true))
    /** Database column ACC_EMAIL SqlType(VARCHAR2), Length(100,true) */
    val accEmail: Rep[Option[String]] = column[Option[String]]("ACC_EMAIL", O.Length(100,varying=true))
    /** Database column B40_ACTIVE SqlType(CHAR) */
    val b40Active: Rep[Option[Char]] = column[Option[Char]]("B40_ACTIVE")
    /** Database column B40_EMAIL_SUBJECT SqlType(VARCHAR2), Length(160,true) */
    val b40EmailSubject: Rep[Option[String]] = column[Option[String]]("B40_EMAIL_SUBJECT", O.Length(160,varying=true))
    /** Database column B40_EMAIL_TEXT SqlType(VARCHAR2), Length(4000,true) */
    val b40EmailText: Rep[Option[String]] = column[Option[String]]("B40_EMAIL_TEXT", O.Length(4000,varying=true))
    /** Database column B40_COVER_LETTER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val b40CoverLetterFilePath: Rep[Option[String]] = column[Option[String]]("B40_COVER_LETTER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column B40_DIVISION_TABLE_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val b40DivisionTableFilePath: Rep[Option[String]] = column[Option[String]]("B40_DIVISION_TABLE_FILE_PATH", O.Length(4000,varying=true))
    /** Database column B40_PARAMETER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val b40ParameterFilePath: Rep[Option[String]] = column[Option[String]]("B40_PARAMETER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column FRN_ACTIVE SqlType(CHAR) */
    val frnActive: Rep[Option[Char]] = column[Option[Char]]("FRN_ACTIVE")
    /** Database column FRN_EMAIL_SUBJECT SqlType(VARCHAR2), Length(160,true) */
    val frnEmailSubject: Rep[Option[String]] = column[Option[String]]("FRN_EMAIL_SUBJECT", O.Length(160,varying=true))
    /** Database column FRN_EMAIL_TEXT SqlType(VARCHAR2), Length(4000,true) */
    val frnEmailText: Rep[Option[String]] = column[Option[String]]("FRN_EMAIL_TEXT", O.Length(4000,varying=true))
    /** Database column FRN_COVER_LETTER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val frnCoverLetterFilePath: Rep[Option[String]] = column[Option[String]]("FRN_COVER_LETTER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column FRN_DIVISION_TABLE_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val frnDivisionTableFilePath: Rep[Option[String]] = column[Option[String]]("FRN_DIVISION_TABLE_FILE_PATH", O.Length(4000,varying=true))
    /** Database column OWN_ACTIVE SqlType(CHAR) */
    val ownActive: Rep[Option[Char]] = column[Option[Char]]("OWN_ACTIVE")
    /** Database column OWN_EMAIL_SUBJECT SqlType(VARCHAR2), Length(160,true) */
    val ownEmailSubject: Rep[Option[String]] = column[Option[String]]("OWN_EMAIL_SUBJECT", O.Length(160,varying=true))
    /** Database column OWN_EMAIL_TEXT SqlType(VARCHAR2), Length(4000,true) */
    val ownEmailText: Rep[Option[String]] = column[Option[String]]("OWN_EMAIL_TEXT", O.Length(4000,varying=true))
    /** Database column OWN_COVER_LETTER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val ownCoverLetterFilePath: Rep[Option[String]] = column[Option[String]]("OWN_COVER_LETTER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column OWN_DIVISION_TABLE_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val ownDivisionTableFilePath: Rep[Option[String]] = column[Option[String]]("OWN_DIVISION_TABLE_FILE_PATH", O.Length(4000,varying=true))
    /** Database column BARE_CODES SqlType(VARCHAR2), Length(4000,true) */
    val bareCodes: Rep[Option[String]] = column[Option[String]]("BARE_CODES", O.Length(4000,varying=true))
    /** Database column EXD_ACTIVE SqlType(CHAR) */
    val exdActive: Rep[Option[Char]] = column[Option[Char]]("EXD_ACTIVE")
    /** Database column EXD_EMAIL_SUBJECT SqlType(VARCHAR2), Length(160,true) */
    val exdEmailSubject: Rep[Option[String]] = column[Option[String]]("EXD_EMAIL_SUBJECT", O.Length(160,varying=true))
    /** Database column EXD_EMAIL_TEXT SqlType(VARCHAR2), Length(4000,true) */
    val exdEmailText: Rep[Option[String]] = column[Option[String]]("EXD_EMAIL_TEXT", O.Length(4000,varying=true))
    /** Database column EXD_COVER_LETTER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val exdCoverLetterFilePath: Rep[Option[String]] = column[Option[String]]("EXD_COVER_LETTER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column EXD_RECEIVERS SqlType(VARCHAR2), Length(4000,true) */
    val exdReceivers: Rep[Option[String]] = column[Option[String]]("EXD_RECEIVERS", O.Length(4000,varying=true))
    /** Database column SKTF_ACTIVE SqlType(CHAR) */
    val sktfActive: Rep[Option[Char]] = column[Option[Char]]("SKTF_ACTIVE")
    /** Database column SKTF_EMAIL_SUBJECT SqlType(VARCHAR2), Length(160,true) */
    val sktfEmailSubject: Rep[Option[String]] = column[Option[String]]("SKTF_EMAIL_SUBJECT", O.Length(160,varying=true))
    /** Database column SKTF_EMAIL_TEXT SqlType(VARCHAR2), Length(4000,true) */
    val sktfEmailText: Rep[Option[String]] = column[Option[String]]("SKTF_EMAIL_TEXT", O.Length(4000,varying=true))
    /** Database column SKTF_COVER_LETTER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val sktfCoverLetterFilePath: Rep[Option[String]] = column[Option[String]]("SKTF_COVER_LETTER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column SKTF_RECEIVERS SqlType(VARCHAR2), Length(4000,true) */
    val sktfReceivers: Rep[Option[String]] = column[Option[String]]("SKTF_RECEIVERS", O.Length(4000,varying=true))
    /** Database column RPA_ACTIVE SqlType(CHAR) */
    val rpaActive: Rep[Option[Char]] = column[Option[Char]]("RPA_ACTIVE")
    /** Database column RPA_EMAIL_SUBJECT SqlType(VARCHAR2), Length(160,true) */
    val rpaEmailSubject: Rep[Option[String]] = column[Option[String]]("RPA_EMAIL_SUBJECT", O.Length(160,varying=true))
    /** Database column RPA_EMAIL_TEXT SqlType(VARCHAR2), Length(4000,true) */
    val rpaEmailText: Rep[Option[String]] = column[Option[String]]("RPA_EMAIL_TEXT", O.Length(4000,varying=true))
    /** Database column RPA_COVER_LETTER_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val rpaCoverLetterFilePath: Rep[Option[String]] = column[Option[String]]("RPA_COVER_LETTER_FILE_PATH", O.Length(4000,varying=true))
    /** Database column RPA_MASTER_TABLE_FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val rpaMasterTableFilePath: Rep[Option[String]] = column[Option[String]]("RPA_MASTER_TABLE_FILE_PATH", O.Length(4000,varying=true))
  }
  /** Collection-like TableQuery object for table GreatBalanceSheetReportDef */
  lazy val GreatBalanceSheetReportDef = new TableQuery(tag => new GreatBalanceSheetReportDef(tag))

  /** Entity class storing rows of table GreatBalanceSheetReportRun
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param execTimestamp Database column EXEC_TIMESTAMP SqlType(DATE)
   *  @param userObjectidc Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param status Database column STATUS SqlType(VARCHAR2), Length(20,true)
   *  @param definitionIdValue Database column DEFINITION_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param zipFileLength Database column ZIP_FILE_LENGTH SqlType(NUMBER)
   *  @param zipFile Database column ZIP_FILE SqlType(BLOB)
   *  @param archived Database column ARCHIVED SqlType(CHAR)
   *  @param runKind Database column RUN_KIND SqlType(CHAR) */
  case class GreatBalanceSheetReportRunRow(idValue: String, execTimestamp: Option[java.sql.Timestamp], userObjectidc: Option[String], status: Option[String], definitionIdValue: Option[String], zipFileLength: Option[scala.math.BigDecimal], zipFile: Option[java.sql.Blob], archived: Option[Char], runKind: Option[Char])
  /** GetResult implicit for fetching GreatBalanceSheetReportRunRow objects using plain SQL queries */
  implicit def GetResultGreatBalanceSheetReportRunRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[java.sql.Blob]], e5: GR[Option[Char]]): GR[GreatBalanceSheetReportRunRow] = GR{
    prs => import prs._
    GreatBalanceSheetReportRunRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Blob], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_BALANCE_SHEET_REPORT_RUN. Objects of this class serve as prototypes for rows in queries. */
  class GreatBalanceSheetReportRun(_tableTag: Tag) extends profile.api.Table[GreatBalanceSheetReportRunRow](_tableTag, Some("WERNER2"), "GREAT_BALANCE_SHEET_REPORT_RUN") {
    def * = (idValue, execTimestamp, userObjectidc, status, definitionIdValue, zipFileLength, zipFile, archived, runKind) <> (GreatBalanceSheetReportRunRow.tupled, GreatBalanceSheetReportRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), execTimestamp, userObjectidc, status, definitionIdValue, zipFileLength, zipFile, archived, runKind).shaped.<>({r=>import r._; _1.map(_=> GreatBalanceSheetReportRunRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column EXEC_TIMESTAMP SqlType(DATE) */
    val execTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXEC_TIMESTAMP")
    /** Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val userObjectidc: Rep[Option[String]] = column[Option[String]]("USER_OBJECTIDC", O.Length(10,varying=true))
    /** Database column STATUS SqlType(VARCHAR2), Length(20,true) */
    val status: Rep[Option[String]] = column[Option[String]]("STATUS", O.Length(20,varying=true))
    /** Database column DEFINITION_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val definitionIdValue: Rep[Option[String]] = column[Option[String]]("DEFINITION_ID_VALUE", O.Length(10,varying=true))
    /** Database column ZIP_FILE_LENGTH SqlType(NUMBER) */
    val zipFileLength: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ZIP_FILE_LENGTH")
    /** Database column ZIP_FILE SqlType(BLOB) */
    val zipFile: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("ZIP_FILE")
    /** Database column ARCHIVED SqlType(CHAR) */
    val archived: Rep[Option[Char]] = column[Option[Char]]("ARCHIVED")
    /** Database column RUN_KIND SqlType(CHAR) */
    val runKind: Rep[Option[Char]] = column[Option[Char]]("RUN_KIND")
  }
  /** Collection-like TableQuery object for table GreatBalanceSheetReportRun */
  lazy val GreatBalanceSheetReportRun = new TableQuery(tag => new GreatBalanceSheetReportRun(tag))

  /** Entity class storing rows of table GreatBareBillingRun
   *  @param billingRunIdc Database column BILLING_RUN_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param bare Database column BARE SqlType(VARCHAR2), Length(10,true)
   *  @param endDate Database column END_DATE SqlType(DATE)
   *  @param onlyFlagged Database column ONLY_FLAGGED SqlType(CHAR) */
  case class GreatBareBillingRunRow(billingRunIdc: String, bare: String, endDate: java.sql.Timestamp, onlyFlagged: Char)
  /** GetResult implicit for fetching GreatBareBillingRunRow objects using plain SQL queries */
  implicit def GetResultGreatBareBillingRunRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Char]): GR[GreatBareBillingRunRow] = GR{
    prs => import prs._
    GreatBareBillingRunRow.tupled((<<[String], <<[String], <<[java.sql.Timestamp], <<[Char]))
  }
  /** Table description of table GREAT_BARE_BILLING_RUN. Objects of this class serve as prototypes for rows in queries. */
  class GreatBareBillingRun(_tableTag: Tag) extends profile.api.Table[GreatBareBillingRunRow](_tableTag, Some("WERNER2"), "GREAT_BARE_BILLING_RUN") {
    def * = (billingRunIdc, bare, endDate, onlyFlagged) <> (GreatBareBillingRunRow.tupled, GreatBareBillingRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(billingRunIdc), Rep.Some(bare), Rep.Some(endDate), Rep.Some(onlyFlagged)).shaped.<>({r=>import r._; _1.map(_=> GreatBareBillingRunRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BILLING_RUN_IDC SqlType(VARCHAR2), Length(10,true) */
    val billingRunIdc: Rep[String] = column[String]("BILLING_RUN_IDC", O.Length(10,varying=true))
    /** Database column BARE SqlType(VARCHAR2), Length(10,true) */
    val bare: Rep[String] = column[String]("BARE", O.Length(10,varying=true))
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("END_DATE")
    /** Database column ONLY_FLAGGED SqlType(CHAR) */
    val onlyFlagged: Rep[Char] = column[Char]("ONLY_FLAGGED")

    /** Primary key of GreatBareBillingRun (database name BBR_PK_BILLING_RUN_IDC) */
    val pk = primaryKey("BBR_PK_BILLING_RUN_IDC", (billingRunIdc, bare, endDate, onlyFlagged))

    /** Foreign key referencing GreatBareDependants (database name BBR_FK_BARE) */
    lazy val greatBareDependantsFk = foreignKey("BBR_FK_BARE", bare, GreatBareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBillingRun (database name BBR_FK_BILLING_RUN_IDC) */
    lazy val greatBillingRunFk = foreignKey("BBR_FK_BILLING_RUN_IDC", billingRunIdc, GreatBillingRun)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBareBillingRun */
  lazy val GreatBareBillingRun = new TableQuery(tag => new GreatBareBillingRun(tag))

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

  /** Entity class storing rows of table GreatBatchDriver
   *  @param schedulerDelaySeconds Database column SCHEDULER_DELAY_SECONDS SqlType(NUMBER)
   *  @param workerDelaySeconds Database column WORKER_DELAY_SECONDS SqlType(NUMBER)
   *  @param notifyingPerEmail Database column NOTIFYING_PER_EMAIL SqlType(CHAR) */
  case class GreatBatchDriverRow(schedulerDelaySeconds: Option[scala.math.BigDecimal], workerDelaySeconds: Option[scala.math.BigDecimal], notifyingPerEmail: Option[Char])
  /** GetResult implicit for fetching GreatBatchDriverRow objects using plain SQL queries */
  implicit def GetResultGreatBatchDriverRow(implicit e0: GR[Option[scala.math.BigDecimal]], e1: GR[Option[Char]]): GR[GreatBatchDriverRow] = GR{
    prs => import prs._
    GreatBatchDriverRow.tupled((<<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[Char]))
  }
  /** Table description of table GREAT_BATCH_DRIVER. Objects of this class serve as prototypes for rows in queries. */
  class GreatBatchDriver(_tableTag: Tag) extends profile.api.Table[GreatBatchDriverRow](_tableTag, Some("WERNER2"), "GREAT_BATCH_DRIVER") {
    def * = (schedulerDelaySeconds, workerDelaySeconds, notifyingPerEmail) <> (GreatBatchDriverRow.tupled, GreatBatchDriverRow.unapply)

    /** Database column SCHEDULER_DELAY_SECONDS SqlType(NUMBER) */
    val schedulerDelaySeconds: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SCHEDULER_DELAY_SECONDS")
    /** Database column WORKER_DELAY_SECONDS SqlType(NUMBER) */
    val workerDelaySeconds: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("WORKER_DELAY_SECONDS")
    /** Database column NOTIFYING_PER_EMAIL SqlType(CHAR) */
    val notifyingPerEmail: Rep[Option[Char]] = column[Option[Char]]("NOTIFYING_PER_EMAIL")
  }
  /** Collection-like TableQuery object for table GreatBatchDriver */
  lazy val GreatBatchDriver = new TableQuery(tag => new GreatBatchDriver(tag))

  /** Entity class storing rows of table GreatBatchJobDescription
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param status Database column STATUS SqlType(VARCHAR2), Length(30,true)
   *  @param jobsClassName Database column JOBS_CLASS_NAME SqlType(VARCHAR2), Length(500,true)
   *  @param repetitionType Database column REPETITION_TYPE SqlType(VARCHAR2), Length(30,true)
   *  @param firstTime Database column FIRST_TIME SqlType(DATE)
   *  @param configurationClassName Database column CONFIGURATION_CLASS_NAME SqlType(VARCHAR2), Length(500,true)
   *  @param arguments Database column ARGUMENTS SqlType(VARCHAR2), Length(4000,true)
   *  @param expirationPeriod Database column EXPIRATION_PERIOD SqlType(NUMBER)
   *  @param alwaysNotify Database column ALWAYS_NOTIFY SqlType(CHAR)
   *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(80,true)
   *  @param jobPriority Database column JOB_PRIORITY SqlType(NUMBER)
   *  @param considerDeadlines Database column CONSIDER_DEADLINES SqlType(CHAR) */
  case class GreatBatchJobDescriptionRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], status: Option[String], jobsClassName: Option[String], repetitionType: Option[String], firstTime: Option[java.sql.Timestamp], configurationClassName: Option[String], arguments: Option[String], expirationPeriod: Option[scala.math.BigDecimal], alwaysNotify: Option[Char], description: Option[String], jobPriority: Option[scala.math.BigDecimal], considerDeadlines: Option[Char])
  /** GetResult implicit for fetching GreatBatchJobDescriptionRow objects using plain SQL queries */
  implicit def GetResultGreatBatchJobDescriptionRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatBatchJobDescriptionRow] = GR{
    prs => import prs._
    GreatBatchJobDescriptionRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[Char], <<?[String], <<?[scala.math.BigDecimal], <<?[Char]))
  }
  /** Table description of table GREAT_BATCH_JOB_DESCRIPTION. Objects of this class serve as prototypes for rows in queries. */
  class GreatBatchJobDescription(_tableTag: Tag) extends profile.api.Table[GreatBatchJobDescriptionRow](_tableTag, Some("WERNER2"), "GREAT_BATCH_JOB_DESCRIPTION") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, status, jobsClassName, repetitionType, firstTime, configurationClassName, arguments, expirationPeriod, alwaysNotify, description, jobPriority, considerDeadlines) <> (GreatBatchJobDescriptionRow.tupled, GreatBatchJobDescriptionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, status, jobsClassName, repetitionType, firstTime, configurationClassName, arguments, expirationPeriod, alwaysNotify, description, jobPriority, considerDeadlines).shaped.<>({r=>import r._; _1.map(_=> GreatBatchJobDescriptionRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column STATUS SqlType(VARCHAR2), Length(30,true) */
    val status: Rep[Option[String]] = column[Option[String]]("STATUS", O.Length(30,varying=true))
    /** Database column JOBS_CLASS_NAME SqlType(VARCHAR2), Length(500,true) */
    val jobsClassName: Rep[Option[String]] = column[Option[String]]("JOBS_CLASS_NAME", O.Length(500,varying=true))
    /** Database column REPETITION_TYPE SqlType(VARCHAR2), Length(30,true) */
    val repetitionType: Rep[Option[String]] = column[Option[String]]("REPETITION_TYPE", O.Length(30,varying=true))
    /** Database column FIRST_TIME SqlType(DATE) */
    val firstTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FIRST_TIME")
    /** Database column CONFIGURATION_CLASS_NAME SqlType(VARCHAR2), Length(500,true) */
    val configurationClassName: Rep[Option[String]] = column[Option[String]]("CONFIGURATION_CLASS_NAME", O.Length(500,varying=true))
    /** Database column ARGUMENTS SqlType(VARCHAR2), Length(4000,true) */
    val arguments: Rep[Option[String]] = column[Option[String]]("ARGUMENTS", O.Length(4000,varying=true))
    /** Database column EXPIRATION_PERIOD SqlType(NUMBER) */
    val expirationPeriod: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPIRATION_PERIOD")
    /** Database column ALWAYS_NOTIFY SqlType(CHAR) */
    val alwaysNotify: Rep[Option[Char]] = column[Option[Char]]("ALWAYS_NOTIFY")
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(80,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(80,varying=true))
    /** Database column JOB_PRIORITY SqlType(NUMBER) */
    val jobPriority: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("JOB_PRIORITY")
    /** Database column CONSIDER_DEADLINES SqlType(CHAR) */
    val considerDeadlines: Rep[Option[Char]] = column[Option[Char]]("CONSIDER_DEADLINES")
  }
  /** Collection-like TableQuery object for table GreatBatchJobDescription */
  lazy val GreatBatchJobDescription = new TableQuery(tag => new GreatBatchJobDescription(tag))

  /** Entity class storing rows of table GreatBatchJobRun
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param jobsName Database column JOBS_NAME SqlType(VARCHAR2), Length(10,true)
   *  @param startDate Database column START_DATE SqlType(DATE)
   *  @param endDate Database column END_DATE SqlType(DATE)
   *  @param violationsString Database column VIOLATIONS_STRING SqlType(CLOB)
   *  @param stackTraceString Database column STACK_TRACE_STRING SqlType(VARCHAR2), Length(4000,true)
   *  @param manual Database column MANUAL SqlType(CHAR)
   *  @param arguments Database column ARGUMENTS SqlType(VARCHAR2), Length(4000,true)
   *  @param problems Database column PROBLEMS SqlType(CHAR) */
  case class GreatBatchJobRunRow(idValue: String, jobsName: Option[String], startDate: Option[java.sql.Timestamp], endDate: Option[java.sql.Timestamp], violationsString: Option[java.sql.Clob], stackTraceString: Option[String], manual: Option[Char], arguments: Option[String], problems: Option[Char])
  /** GetResult implicit for fetching GreatBatchJobRunRow objects using plain SQL queries */
  implicit def GetResultGreatBatchJobRunRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[java.sql.Clob]], e4: GR[Option[Char]]): GR[GreatBatchJobRunRow] = GR{
    prs => import prs._
    GreatBatchJobRunRow.tupled((<<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Clob], <<?[String], <<?[Char], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BATCH_JOB_RUN. Objects of this class serve as prototypes for rows in queries. */
  class GreatBatchJobRun(_tableTag: Tag) extends profile.api.Table[GreatBatchJobRunRow](_tableTag, Some("WERNER2"), "GREAT_BATCH_JOB_RUN") {
    def * = (idValue, jobsName, startDate, endDate, violationsString, stackTraceString, manual, arguments, problems) <> (GreatBatchJobRunRow.tupled, GreatBatchJobRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), jobsName, startDate, endDate, violationsString, stackTraceString, manual, arguments, problems).shaped.<>({r=>import r._; _1.map(_=> GreatBatchJobRunRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column JOBS_NAME SqlType(VARCHAR2), Length(10,true) */
    val jobsName: Rep[Option[String]] = column[Option[String]]("JOBS_NAME", O.Length(10,varying=true))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("START_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("END_DATE")
    /** Database column VIOLATIONS_STRING SqlType(CLOB) */
    val violationsString: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("VIOLATIONS_STRING")
    /** Database column STACK_TRACE_STRING SqlType(VARCHAR2), Length(4000,true) */
    val stackTraceString: Rep[Option[String]] = column[Option[String]]("STACK_TRACE_STRING", O.Length(4000,varying=true))
    /** Database column MANUAL SqlType(CHAR) */
    val manual: Rep[Option[Char]] = column[Option[Char]]("MANUAL")
    /** Database column ARGUMENTS SqlType(VARCHAR2), Length(4000,true) */
    val arguments: Rep[Option[String]] = column[Option[String]]("ARGUMENTS", O.Length(4000,varying=true))
    /** Database column PROBLEMS SqlType(CHAR) */
    val problems: Rep[Option[Char]] = column[Option[Char]]("PROBLEMS")
  }
  /** Collection-like TableQuery object for table GreatBatchJobRun */
  lazy val GreatBatchJobRun = new TableQuery(tag => new GreatBatchJobRun(tag))

  /** Entity class storing rows of table GreatBillingRun
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param bareGroup Database column BARE_GROUP SqlType(VARCHAR2), Length(4,true)
   *  @param execStart Database column EXEC_START SqlType(TIMESTAMP(6))
   *  @param execEnd Database column EXEC_END SqlType(TIMESTAMP(6))
   *  @param status Database column STATUS SqlType(CHAR)
   *  @param userAccount Database column USER_ACCOUNT SqlType(VARCHAR2), Length(10,true)
   *  @param endDate Database column END_DATE SqlType(DATE)
   *  @param onlyFlagged Database column ONLY_FLAGGED SqlType(CHAR)
   *  @param nrsValidation Database column NRS_VALIDATION SqlType(CHAR)
   *  @param protocol Database column PROTOCOL SqlType(BLOB)
   *  @param protocolLength Database column PROTOCOL_LENGTH SqlType(NUMBER)
   *  @param transportDescription Database column TRANSPORT_DESCRIPTION SqlType(VARCHAR2), Length(1000,true)
   *  @param transportStatus Database column TRANSPORT_STATUS SqlType(CHAR)
   *  @param concernedBaren Database column CONCERNED_BAREN SqlType(VARCHAR2), Length(600,true)
   *  @param testMode Database column TEST_MODE SqlType(CHAR) */
  case class GreatBillingRunRow(objectidc: String, bareGroup: Option[String], execStart: Option[java.sql.Timestamp], execEnd: Option[java.sql.Timestamp], status: Option[Char], userAccount: Option[String], endDate: Option[java.sql.Timestamp], onlyFlagged: Option[Char], nrsValidation: Option[Char], protocol: Option[java.sql.Blob], protocolLength: Option[scala.math.BigDecimal], transportDescription: Option[String], transportStatus: Option[Char], concernedBaren: Option[String], testMode: Option[Char])
  /** GetResult implicit for fetching GreatBillingRunRow objects using plain SQL queries */
  implicit def GetResultGreatBillingRunRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Char]], e4: GR[Option[java.sql.Blob]], e5: GR[Option[scala.math.BigDecimal]]): GR[GreatBillingRunRow] = GR{
    prs => import prs._
    GreatBillingRunRow.tupled((<<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char], <<?[String], <<?[java.sql.Timestamp], <<?[Char], <<?[Char], <<?[java.sql.Blob], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BILLING_RUN. Objects of this class serve as prototypes for rows in queries. */
  class GreatBillingRun(_tableTag: Tag) extends profile.api.Table[GreatBillingRunRow](_tableTag, Some("WERNER2"), "GREAT_BILLING_RUN") {
    def * = (objectidc, bareGroup, execStart, execEnd, status, userAccount, endDate, onlyFlagged, nrsValidation, protocol, protocolLength, transportDescription, transportStatus, concernedBaren, testMode) <> (GreatBillingRunRow.tupled, GreatBillingRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), bareGroup, execStart, execEnd, status, userAccount, endDate, onlyFlagged, nrsValidation, protocol, protocolLength, transportDescription, transportStatus, concernedBaren, testMode).shaped.<>({r=>import r._; _1.map(_=> GreatBillingRunRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column BARE_GROUP SqlType(VARCHAR2), Length(4,true) */
    val bareGroup: Rep[Option[String]] = column[Option[String]]("BARE_GROUP", O.Length(4,varying=true))
    /** Database column EXEC_START SqlType(TIMESTAMP(6)) */
    val execStart: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXEC_START")
    /** Database column EXEC_END SqlType(TIMESTAMP(6)) */
    val execEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXEC_END")
    /** Database column STATUS SqlType(CHAR) */
    val status: Rep[Option[Char]] = column[Option[Char]]("STATUS")
    /** Database column USER_ACCOUNT SqlType(VARCHAR2), Length(10,true) */
    val userAccount: Rep[Option[String]] = column[Option[String]]("USER_ACCOUNT", O.Length(10,varying=true))
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("END_DATE")
    /** Database column ONLY_FLAGGED SqlType(CHAR) */
    val onlyFlagged: Rep[Option[Char]] = column[Option[Char]]("ONLY_FLAGGED")
    /** Database column NRS_VALIDATION SqlType(CHAR) */
    val nrsValidation: Rep[Option[Char]] = column[Option[Char]]("NRS_VALIDATION")
    /** Database column PROTOCOL SqlType(BLOB) */
    val protocol: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("PROTOCOL")
    /** Database column PROTOCOL_LENGTH SqlType(NUMBER) */
    val protocolLength: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PROTOCOL_LENGTH")
    /** Database column TRANSPORT_DESCRIPTION SqlType(VARCHAR2), Length(1000,true) */
    val transportDescription: Rep[Option[String]] = column[Option[String]]("TRANSPORT_DESCRIPTION", O.Length(1000,varying=true))
    /** Database column TRANSPORT_STATUS SqlType(CHAR) */
    val transportStatus: Rep[Option[Char]] = column[Option[Char]]("TRANSPORT_STATUS")
    /** Database column CONCERNED_BAREN SqlType(VARCHAR2), Length(600,true) */
    val concernedBaren: Rep[Option[String]] = column[Option[String]]("CONCERNED_BAREN", O.Length(600,varying=true))
    /** Database column TEST_MODE SqlType(CHAR) */
    val testMode: Rep[Option[Char]] = column[Option[Char]]("TEST_MODE")

    /** Foreign key referencing GreatBareDependants (database name BRU_FK_BARE_GROUP) */
    lazy val greatBareDependantsFk = foreignKey("BRU_FK_BARE_GROUP", bareGroup, GreatBareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatUserAccount (database name BRU_FK_USER_ACCOUNT) */
    lazy val greatUserAccountFk = foreignKey("BRU_FK_USER_ACCOUNT", userAccount, GreatUserAccount)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBillingRun */
  lazy val GreatBillingRun = new TableQuery(tag => new GreatBillingRun(tag))

  /** Entity class storing rows of table GreatBookEntry
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param fileIdValue Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param debtorPosition Database column DEBTOR_POSITION SqlType(NUMBER)
   *  @param preciseCostType Database column PRECISE_COST_TYPE SqlType(VARCHAR2), Length(4,true)
   *  @param valueDate Database column VALUE_DATE SqlType(DATE)
   *  @param periodOfPerformanceBegin Database column PERIOD_OF_PERFORMANCE_BEGIN SqlType(DATE)
   *  @param periodOfPerformanceEnd Database column PERIOD_OF_PERFORMANCE_END SqlType(DATE)
   *  @param materialNumber Database column MATERIAL_NUMBER SqlType(VARCHAR2), Length(18,true)
   *  @param bare Database column BARE SqlType(VARCHAR2), Length(4,true)
   *  @param commissionReceiver Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true)
   *  @param targetAmount Database column TARGET_AMOUNT SqlType(NUMBER)
   *  @param targetAmountCur Database column TARGET_AMOUNT_CUR SqlType(CHAR), Length(3,false)
   *  @param purpose Database column PURPOSE SqlType(VARCHAR2)
   *  @param invoiceOrgId Database column INVOICE_ORG_ID SqlType(VARCHAR2), Length(10,true)
   *  @param invoiceOrgName Database column INVOICE_ORG_NAME SqlType(VARCHAR2), Length(146,true)
   *  @param orderNumber Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true)
   *  @param orderItem Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true)
   *  @param reason Database column REASON SqlType(VARCHAR2), Length(50,true)
   *  @param additionalPaymentPosition Database column ADDITIONAL_PAYMENT_POSITION SqlType(NUMBER)
   *  @param cancelledBookEntryIdValue Database column CANCELLED_BOOK_ENTRY_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param invoiceLineItemIdValue Database column INVOICE_LINE_ITEM_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
  case class GreatBookEntryRow(objectidc: String, fileIdValue: Option[String], debtorPosition: Option[scala.math.BigDecimal], preciseCostType: Option[String], valueDate: Option[java.sql.Timestamp], periodOfPerformanceBegin: Option[java.sql.Timestamp], periodOfPerformanceEnd: Option[java.sql.Timestamp], materialNumber: Option[String], bare: Option[String], commissionReceiver: Option[String], targetAmount: Option[scala.math.BigDecimal], targetAmountCur: Option[String], purpose: Option[Char], invoiceOrgId: Option[String], invoiceOrgName: Option[String], orderNumber: Option[String], orderItem: Option[String], reason: Option[String], additionalPaymentPosition: Option[scala.math.BigDecimal], cancelledBookEntryIdValue: Option[String], invoiceLineItemIdValue: Option[String])
  /** GetResult implicit for fetching GreatBookEntryRow objects using plain SQL queries */
  implicit def GetResultGreatBookEntryRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatBookEntryRow] = GR{
    prs => import prs._
    GreatBookEntryRow.tupled((<<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_BOOK_ENTRY. Objects of this class serve as prototypes for rows in queries. */
  class GreatBookEntry(_tableTag: Tag) extends profile.api.Table[GreatBookEntryRow](_tableTag, Some("WERNER2"), "GREAT_BOOK_ENTRY") {
    def * = (objectidc, fileIdValue, debtorPosition, preciseCostType, valueDate, periodOfPerformanceBegin, periodOfPerformanceEnd, materialNumber, bare, commissionReceiver, targetAmount, targetAmountCur, purpose, invoiceOrgId, invoiceOrgName, orderNumber, orderItem, reason, additionalPaymentPosition, cancelledBookEntryIdValue, invoiceLineItemIdValue) <> (GreatBookEntryRow.tupled, GreatBookEntryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), fileIdValue, debtorPosition, preciseCostType, valueDate, periodOfPerformanceBegin, periodOfPerformanceEnd, materialNumber, bare, commissionReceiver, targetAmount, targetAmountCur, purpose, invoiceOrgId, invoiceOrgName, orderNumber, orderItem, reason, additionalPaymentPosition, cancelledBookEntryIdValue, invoiceLineItemIdValue).shaped.<>({r=>import r._; _1.map(_=> GreatBookEntryRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[Option[String]] = column[Option[String]]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column DEBTOR_POSITION SqlType(NUMBER) */
    val debtorPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEBTOR_POSITION")
    /** Database column PRECISE_COST_TYPE SqlType(VARCHAR2), Length(4,true) */
    val preciseCostType: Rep[Option[String]] = column[Option[String]]("PRECISE_COST_TYPE", O.Length(4,varying=true))
    /** Database column VALUE_DATE SqlType(DATE) */
    val valueDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VALUE_DATE")
    /** Database column PERIOD_OF_PERFORMANCE_BEGIN SqlType(DATE) */
    val periodOfPerformanceBegin: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERIOD_OF_PERFORMANCE_BEGIN")
    /** Database column PERIOD_OF_PERFORMANCE_END SqlType(DATE) */
    val periodOfPerformanceEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERIOD_OF_PERFORMANCE_END")
    /** Database column MATERIAL_NUMBER SqlType(VARCHAR2), Length(18,true) */
    val materialNumber: Rep[Option[String]] = column[Option[String]]("MATERIAL_NUMBER", O.Length(18,varying=true))
    /** Database column BARE SqlType(VARCHAR2), Length(4,true) */
    val bare: Rep[Option[String]] = column[Option[String]]("BARE", O.Length(4,varying=true))
    /** Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true) */
    val commissionReceiver: Rep[Option[String]] = column[Option[String]]("COMMISSION_RECEIVER", O.Length(5,varying=true))
    /** Database column TARGET_AMOUNT SqlType(NUMBER) */
    val targetAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TARGET_AMOUNT")
    /** Database column TARGET_AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val targetAmountCur: Rep[Option[String]] = column[Option[String]]("TARGET_AMOUNT_CUR", O.Length(3,varying=false))
    /** Database column PURPOSE SqlType(VARCHAR2) */
    val purpose: Rep[Option[Char]] = column[Option[Char]]("PURPOSE")
    /** Database column INVOICE_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val invoiceOrgId: Rep[Option[String]] = column[Option[String]]("INVOICE_ORG_ID", O.Length(10,varying=true))
    /** Database column INVOICE_ORG_NAME SqlType(VARCHAR2), Length(146,true) */
    val invoiceOrgName: Rep[Option[String]] = column[Option[String]]("INVOICE_ORG_NAME", O.Length(146,varying=true))
    /** Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("ORDER_NUMBER", O.Length(35,varying=true))
    /** Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
    val orderItem: Rep[Option[String]] = column[Option[String]]("ORDER_ITEM", O.Length(6,varying=true))
    /** Database column REASON SqlType(VARCHAR2), Length(50,true) */
    val reason: Rep[Option[String]] = column[Option[String]]("REASON", O.Length(50,varying=true))
    /** Database column ADDITIONAL_PAYMENT_POSITION SqlType(NUMBER) */
    val additionalPaymentPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ADDITIONAL_PAYMENT_POSITION")
    /** Database column CANCELLED_BOOK_ENTRY_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val cancelledBookEntryIdValue: Rep[Option[String]] = column[Option[String]]("CANCELLED_BOOK_ENTRY_ID_VALUE", O.Length(10,varying=true))
    /** Database column INVOICE_LINE_ITEM_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val invoiceLineItemIdValue: Rep[Option[String]] = column[Option[String]]("INVOICE_LINE_ITEM_ID_VALUE", O.Length(10,varying=true))

    /** Foreign key referencing GreatBareDependants (database name BEY_FK_BARE) */
    lazy val greatBareDependantsFk = foreignKey("BEY_FK_BARE", bare, GreatBareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name BEY_FK_COMMISSION_RECEIVER) */
    lazy val greatCommissionReceiverFk = foreignKey("BEY_FK_COMMISSION_RECEIVER", commissionReceiver, GreatCommissionReceiver)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name BEY_FK_TARGET_AMOUNT_CUR) */
    lazy val greatCurrencyFk = foreignKey("BEY_FK_TARGET_AMOUNT_CUR", targetAmountCur, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name BEY_FK_FILE_ID_VALUE) */
    lazy val greatGuaranteeFileFk = foreignKey("BEY_FK_FILE_ID_VALUE", fileIdValue, GreatGuaranteeFile)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatInvoiceLineItem (database name BEY_FK_INVOICE_LINE_ITEM_ID_5) */
    lazy val greatInvoiceLineItemFk = foreignKey("BEY_FK_INVOICE_LINE_ITEM_ID_5", invoiceLineItemIdValue, GreatInvoiceLineItem)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name BEY_FK_INVOICE_ORG_ID) */
    lazy val greatOrgFk = foreignKey("BEY_FK_INVOICE_ORG_ID", invoiceOrgId, GreatOrg)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (fileIdValue,debtorPosition) (database name BEY_CDX0) */
    val index1 = index("BEY_CDX0", (fileIdValue, debtorPosition))
  }
  /** Collection-like TableQuery object for table GreatBookEntry */
  lazy val GreatBookEntry = new TableQuery(tag => new GreatBookEntry(tag))

  /** Entity class storing rows of table GreatBookEntryRelation
   *  @param masterBookEntryIdc Database column MASTER_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param detailBookEntryIdc Database column DETAIL_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
  case class GreatBookEntryRelationRow(masterBookEntryIdc: String, detailBookEntryIdc: String)
  /** GetResult implicit for fetching GreatBookEntryRelationRow objects using plain SQL queries */
  implicit def GetResultGreatBookEntryRelationRow(implicit e0: GR[String]): GR[GreatBookEntryRelationRow] = GR{
    prs => import prs._
    GreatBookEntryRelationRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_BOOK_ENTRY_RELATION. Objects of this class serve as prototypes for rows in queries. */
  class GreatBookEntryRelation(_tableTag: Tag) extends profile.api.Table[GreatBookEntryRelationRow](_tableTag, Some("WERNER2"), "GREAT_BOOK_ENTRY_RELATION") {
    def * = (masterBookEntryIdc, detailBookEntryIdc) <> (GreatBookEntryRelationRow.tupled, GreatBookEntryRelationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(masterBookEntryIdc), Rep.Some(detailBookEntryIdc)).shaped.<>({r=>import r._; _1.map(_=> GreatBookEntryRelationRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column MASTER_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
    val masterBookEntryIdc: Rep[String] = column[String]("MASTER_BOOK_ENTRY_IDC", O.Length(10,varying=true))
    /** Database column DETAIL_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
    val detailBookEntryIdc: Rep[String] = column[String]("DETAIL_BOOK_ENTRY_IDC", O.Length(10,varying=true))

    /** Primary key of GreatBookEntryRelation (database name BER_PK_MASTER_BOOK_ENTRY_IDC) */
    val pk = primaryKey("BER_PK_MASTER_BOOK_ENTRY_IDC", (masterBookEntryIdc, detailBookEntryIdc))

    /** Foreign key referencing GreatBookEntry (database name BER_FK_DETAIL_BOOK_ENTRY_IDC) */
    lazy val greatBookEntryFk1 = foreignKey("BER_FK_DETAIL_BOOK_ENTRY_IDC", detailBookEntryIdc, GreatBookEntry)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBookEntry (database name BER_FK_MASTER_BOOK_ENTRY_IDC) */
    lazy val greatBookEntryFk2 = foreignKey("BER_FK_MASTER_BOOK_ENTRY_IDC", masterBookEntryIdc, GreatBookEntry)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBookEntryRelation */
  lazy val GreatBookEntryRelation = new TableQuery(tag => new GreatBookEntryRelation(tag))

  /** Entity class storing rows of table GreatBulkUpdateDef
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param defTimestamp Database column DEF_TIMESTAMP SqlType(DATE)
   *  @param userObjectidc Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param reason Database column REASON SqlType(VARCHAR2), Length(128,true)
   *  @param log Database column LOG SqlType(CLOB) */
  case class GreatBulkUpdateDefRow(idValue: String, defTimestamp: Option[java.sql.Timestamp], userObjectidc: Option[String], reason: Option[String], log: Option[java.sql.Clob])
  /** GetResult implicit for fetching GreatBulkUpdateDefRow objects using plain SQL queries */
  implicit def GetResultGreatBulkUpdateDefRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[java.sql.Clob]]): GR[GreatBulkUpdateDefRow] = GR{
    prs => import prs._
    GreatBulkUpdateDefRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_BULK_UPDATE_DEF. Objects of this class serve as prototypes for rows in queries. */
  class GreatBulkUpdateDef(_tableTag: Tag) extends profile.api.Table[GreatBulkUpdateDefRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_DEF") {
    def * = (idValue, defTimestamp, userObjectidc, reason, log) <> (GreatBulkUpdateDefRow.tupled, GreatBulkUpdateDefRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), defTimestamp, userObjectidc, reason, log).shaped.<>({r=>import r._; _1.map(_=> GreatBulkUpdateDefRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column DEF_TIMESTAMP SqlType(DATE) */
    val defTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DEF_TIMESTAMP")
    /** Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val userObjectidc: Rep[Option[String]] = column[Option[String]]("USER_OBJECTIDC", O.Length(10,varying=true))
    /** Database column REASON SqlType(VARCHAR2), Length(128,true) */
    val reason: Rep[Option[String]] = column[Option[String]]("REASON", O.Length(128,varying=true))
    /** Database column LOG SqlType(CLOB) */
    val log: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("LOG")
  }
  /** Collection-like TableQuery object for table GreatBulkUpdateDef */
  lazy val GreatBulkUpdateDef = new TableQuery(tag => new GreatBulkUpdateDef(tag))

  /** Entity class storing rows of table GreatBulkUpdateDokuments
   *  @param definitionId Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true)
   *  @param name Database column NAME SqlType(VARCHAR2), Length(52,true)
   *  @param dokument Database column DOKUMENT SqlType(BLOB) */
  case class GreatBulkUpdateDokumentsRow(definitionId: String, name: String, dokument: Option[java.sql.Blob])
  /** GetResult implicit for fetching GreatBulkUpdateDokumentsRow objects using plain SQL queries */
  implicit def GetResultGreatBulkUpdateDokumentsRow(implicit e0: GR[String], e1: GR[Option[java.sql.Blob]]): GR[GreatBulkUpdateDokumentsRow] = GR{
    prs => import prs._
    GreatBulkUpdateDokumentsRow.tupled((<<[String], <<[String], <<?[java.sql.Blob]))
  }
  /** Table description of table GREAT_BULK_UPDATE_DOKUMENTS. Objects of this class serve as prototypes for rows in queries. */
  class GreatBulkUpdateDokuments(_tableTag: Tag) extends profile.api.Table[GreatBulkUpdateDokumentsRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_DOKUMENTS") {
    def * = (definitionId, name, dokument) <> (GreatBulkUpdateDokumentsRow.tupled, GreatBulkUpdateDokumentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(definitionId), Rep.Some(name), dokument).shaped.<>({r=>import r._; _1.map(_=> GreatBulkUpdateDokumentsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true) */
    val definitionId: Rep[String] = column[String]("DEFINITION_ID", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(52,varying=true))
    /** Database column DOKUMENT SqlType(BLOB) */
    val dokument: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("DOKUMENT")

    /** Primary key of GreatBulkUpdateDokuments (database name BUD_PK_DEFINITION_ID) */
    val pk = primaryKey("BUD_PK_DEFINITION_ID", (definitionId, name))

    /** Foreign key referencing GreatBulkUpdateDef (database name BUD_FK_DEFINITION_ID) */
    lazy val greatBulkUpdateDefFk = foreignKey("BUD_FK_DEFINITION_ID", definitionId, GreatBulkUpdateDef)(r => r.idValue, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBulkUpdateDokuments */
  lazy val GreatBulkUpdateDokuments = new TableQuery(tag => new GreatBulkUpdateDokuments(tag))

  /** Entity class storing rows of table GreatBulkUpdateGuarantee
   *  @param definitionId Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true)
   *  @param guaranteeId Database column GUARANTEE_ID SqlType(VARCHAR2), Length(10,true)
   *  @param version Database column VERSION SqlType(NUMBER)
   *  @param changed Database column CHANGED SqlType(CHAR)
   *  @param kind Database column KIND SqlType(VARCHAR2), Length(52,true)
   *  @param kindIndex Database column KIND_INDEX SqlType(NUMBER)
   *  @param debtorPortionPosition Database column DEBTOR_PORTION_POSITION SqlType(NUMBER)
   *  @param subSubstitutionValue Database column SUB_SUBSTITUTION_VALUE SqlType(VARCHAR2), Length(52,true)
   *  @param nrsSuccessful Database column NRS_SUCCESSFUL SqlType(CHAR) */
  case class GreatBulkUpdateGuaranteeRow(definitionId: String, guaranteeId: String, version: scala.math.BigDecimal, changed: Option[Char], kind: String, kindIndex: scala.math.BigDecimal, debtorPortionPosition: scala.math.BigDecimal, subSubstitutionValue: Option[String], nrsSuccessful: Option[Char])
  /** GetResult implicit for fetching GreatBulkUpdateGuaranteeRow objects using plain SQL queries */
  implicit def GetResultGreatBulkUpdateGuaranteeRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[Char]], e3: GR[Option[String]]): GR[GreatBulkUpdateGuaranteeRow] = GR{
    prs => import prs._
    GreatBulkUpdateGuaranteeRow.tupled((<<[String], <<[String], <<[scala.math.BigDecimal], <<?[Char], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BULK_UPDATE_GUARANTEE. Objects of this class serve as prototypes for rows in queries. */
  class GreatBulkUpdateGuarantee(_tableTag: Tag) extends profile.api.Table[GreatBulkUpdateGuaranteeRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_GUARANTEE") {
    def * = (definitionId, guaranteeId, version, changed, kind, kindIndex, debtorPortionPosition, subSubstitutionValue, nrsSuccessful) <> (GreatBulkUpdateGuaranteeRow.tupled, GreatBulkUpdateGuaranteeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(definitionId), Rep.Some(guaranteeId), Rep.Some(version), changed, Rep.Some(kind), Rep.Some(kindIndex), Rep.Some(debtorPortionPosition), subSubstitutionValue, nrsSuccessful).shaped.<>({r=>import r._; _1.map(_=> GreatBulkUpdateGuaranteeRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true) */
    val definitionId: Rep[String] = column[String]("DEFINITION_ID", O.Length(10,varying=true))
    /** Database column GUARANTEE_ID SqlType(VARCHAR2), Length(10,true) */
    val guaranteeId: Rep[String] = column[String]("GUARANTEE_ID", O.Length(10,varying=true))
    /** Database column VERSION SqlType(NUMBER) */
    val version: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("VERSION")
    /** Database column CHANGED SqlType(CHAR) */
    val changed: Rep[Option[Char]] = column[Option[Char]]("CHANGED")
    /** Database column KIND SqlType(VARCHAR2), Length(52,true) */
    val kind: Rep[String] = column[String]("KIND", O.Length(52,varying=true))
    /** Database column KIND_INDEX SqlType(NUMBER) */
    val kindIndex: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("KIND_INDEX")
    /** Database column DEBTOR_PORTION_POSITION SqlType(NUMBER) */
    val debtorPortionPosition: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("DEBTOR_PORTION_POSITION")
    /** Database column SUB_SUBSTITUTION_VALUE SqlType(VARCHAR2), Length(52,true) */
    val subSubstitutionValue: Rep[Option[String]] = column[Option[String]]("SUB_SUBSTITUTION_VALUE", O.Length(52,varying=true))
    /** Database column NRS_SUCCESSFUL SqlType(CHAR) */
    val nrsSuccessful: Rep[Option[Char]] = column[Option[Char]]("NRS_SUCCESSFUL")

    /** Primary key of GreatBulkUpdateGuarantee (database name BUG_PK_DEFINITION_ID) */
    val pk = primaryKey("BUG_PK_DEFINITION_ID", (definitionId, guaranteeId, version, kind, kindIndex, debtorPortionPosition))

    /** Foreign key referencing GreatBulkUpdateValue (database name BUG_FK_DEFINITION_ID) */
    lazy val greatBulkUpdateValueFk = foreignKey("BUG_FK_DEFINITION_ID", (definitionId, kind, kindIndex), GreatBulkUpdateValue)(r => (r.definitionId, r.kind, r.kindIndex), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuarantee (database name BUG_FK_VERSION) */
    lazy val greatGuaranteeFk = foreignKey("BUG_FK_VERSION", (guaranteeId, version), GreatGuarantee)(r => (r.fileIdValue, r.guaranteeVersion), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBulkUpdateGuarantee */
  lazy val GreatBulkUpdateGuarantee = new TableQuery(tag => new GreatBulkUpdateGuarantee(tag))

  /** Entity class storing rows of table GreatBulkUpdateRun
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param execTimestamp Database column EXEC_TIMESTAMP SqlType(DATE)
   *  @param userObjectidc Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param definitionIdValue Database column DEFINITION_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param log Database column LOG SqlType(CLOB) */
  case class GreatBulkUpdateRunRow(idValue: String, execTimestamp: Option[java.sql.Timestamp], userObjectidc: Option[String], definitionIdValue: Option[String], log: Option[java.sql.Clob])
  /** GetResult implicit for fetching GreatBulkUpdateRunRow objects using plain SQL queries */
  implicit def GetResultGreatBulkUpdateRunRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[java.sql.Clob]]): GR[GreatBulkUpdateRunRow] = GR{
    prs => import prs._
    GreatBulkUpdateRunRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_BULK_UPDATE_RUN. Objects of this class serve as prototypes for rows in queries. */
  class GreatBulkUpdateRun(_tableTag: Tag) extends profile.api.Table[GreatBulkUpdateRunRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_RUN") {
    def * = (idValue, execTimestamp, userObjectidc, definitionIdValue, log) <> (GreatBulkUpdateRunRow.tupled, GreatBulkUpdateRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), execTimestamp, userObjectidc, definitionIdValue, log).shaped.<>({r=>import r._; _1.map(_=> GreatBulkUpdateRunRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column EXEC_TIMESTAMP SqlType(DATE) */
    val execTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXEC_TIMESTAMP")
    /** Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val userObjectidc: Rep[Option[String]] = column[Option[String]]("USER_OBJECTIDC", O.Length(10,varying=true))
    /** Database column DEFINITION_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val definitionIdValue: Rep[Option[String]] = column[Option[String]]("DEFINITION_ID_VALUE", O.Length(10,varying=true))
    /** Database column LOG SqlType(CLOB) */
    val log: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("LOG")

    /** Foreign key referencing GreatBulkUpdateDef (database name BUR_FK_DEFINITION_ID_VALUE) */
    lazy val greatBulkUpdateDefFk = foreignKey("BUR_FK_DEFINITION_ID_VALUE", definitionIdValue, GreatBulkUpdateDef)(r => Rep.Some(r.idValue), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBulkUpdateRun */
  lazy val GreatBulkUpdateRun = new TableQuery(tag => new GreatBulkUpdateRun(tag))

  /** Entity class storing rows of table GreatBulkUpdateValue
   *  @param definitionId Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true)
   *  @param kind Database column KIND SqlType(VARCHAR2), Length(52,true)
   *  @param oldValue Database column OLD_VALUE SqlType(VARCHAR2), Length(52,true)
   *  @param newValue Database column NEW_VALUE SqlType(VARCHAR2), Length(52,true)
   *  @param subSubstitution Database column SUB_SUBSTITUTION SqlType(CHAR)
   *  @param kindIndex Database column KIND_INDEX SqlType(NUMBER) */
  case class GreatBulkUpdateValueRow(definitionId: String, kind: String, oldValue: Option[String], newValue: Option[String], subSubstitution: Option[Char], kindIndex: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatBulkUpdateValueRow objects using plain SQL queries */
  implicit def GetResultGreatBulkUpdateValueRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Char]], e3: GR[scala.math.BigDecimal]): GR[GreatBulkUpdateValueRow] = GR{
    prs => import prs._
    GreatBulkUpdateValueRow.tupled((<<[String], <<[String], <<?[String], <<?[String], <<?[Char], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_BULK_UPDATE_VALUE. Objects of this class serve as prototypes for rows in queries. */
  class GreatBulkUpdateValue(_tableTag: Tag) extends profile.api.Table[GreatBulkUpdateValueRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_VALUE") {
    def * = (definitionId, kind, oldValue, newValue, subSubstitution, kindIndex) <> (GreatBulkUpdateValueRow.tupled, GreatBulkUpdateValueRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(definitionId), Rep.Some(kind), oldValue, newValue, subSubstitution, Rep.Some(kindIndex)).shaped.<>({r=>import r._; _1.map(_=> GreatBulkUpdateValueRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true) */
    val definitionId: Rep[String] = column[String]("DEFINITION_ID", O.Length(10,varying=true))
    /** Database column KIND SqlType(VARCHAR2), Length(52,true) */
    val kind: Rep[String] = column[String]("KIND", O.Length(52,varying=true))
    /** Database column OLD_VALUE SqlType(VARCHAR2), Length(52,true) */
    val oldValue: Rep[Option[String]] = column[Option[String]]("OLD_VALUE", O.Length(52,varying=true))
    /** Database column NEW_VALUE SqlType(VARCHAR2), Length(52,true) */
    val newValue: Rep[Option[String]] = column[Option[String]]("NEW_VALUE", O.Length(52,varying=true))
    /** Database column SUB_SUBSTITUTION SqlType(CHAR) */
    val subSubstitution: Rep[Option[Char]] = column[Option[Char]]("SUB_SUBSTITUTION")
    /** Database column KIND_INDEX SqlType(NUMBER) */
    val kindIndex: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("KIND_INDEX")

    /** Primary key of GreatBulkUpdateValue (database name BUV_PK_DEFINITION_ID) */
    val pk = primaryKey("BUV_PK_DEFINITION_ID", (definitionId, kind, kindIndex))

    /** Foreign key referencing GreatBulkUpdateDef (database name BUV_FK_DEFINITION_ID) */
    lazy val greatBulkUpdateDefFk = foreignKey("BUV_FK_DEFINITION_ID", definitionId, GreatBulkUpdateDef)(r => r.idValue, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBulkUpdateValue */
  lazy val GreatBulkUpdateValue = new TableQuery(tag => new GreatBulkUpdateValue(tag))

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

  /** Entity class storing rows of table GreatCommissionRecBareDep
   *  @param bareCode Database column BARE_CODE SqlType(VARCHAR2), Length(4,true)
   *  @param commisionReceiverId Database column COMMISION_RECEIVER_ID SqlType(VARCHAR2), Length(5,true)
   *  @param kind Database column KIND SqlType(VARCHAR2) */
  case class GreatCommissionRecBareDepRow(bareCode: String, commisionReceiverId: String, kind: Char)
  /** GetResult implicit for fetching GreatCommissionRecBareDepRow objects using plain SQL queries */
  implicit def GetResultGreatCommissionRecBareDepRow(implicit e0: GR[String], e1: GR[Char]): GR[GreatCommissionRecBareDepRow] = GR{
    prs => import prs._
    GreatCommissionRecBareDepRow.tupled((<<[String], <<[String], <<[Char]))
  }
  /** Table description of table GREAT_COMMISSION_REC_BARE_DEP. Objects of this class serve as prototypes for rows in queries. */
  class GreatCommissionRecBareDep(_tableTag: Tag) extends profile.api.Table[GreatCommissionRecBareDepRow](_tableTag, Some("WERNER2"), "GREAT_COMMISSION_REC_BARE_DEP") {
    def * = (bareCode, commisionReceiverId, kind) <> (GreatCommissionRecBareDepRow.tupled, GreatCommissionRecBareDepRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(bareCode), Rep.Some(commisionReceiverId), Rep.Some(kind)).shaped.<>({r=>import r._; _1.map(_=> GreatCommissionRecBareDepRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val bareCode: Rep[String] = column[String]("BARE_CODE", O.Length(4,varying=true))
    /** Database column COMMISION_RECEIVER_ID SqlType(VARCHAR2), Length(5,true) */
    val commisionReceiverId: Rep[String] = column[String]("COMMISION_RECEIVER_ID", O.Length(5,varying=true))
    /** Database column KIND SqlType(VARCHAR2) */
    val kind: Rep[Char] = column[Char]("KIND")

    /** Primary key of GreatCommissionRecBareDep (database name GCRBD_PK_BARE_CODE) */
    val pk = primaryKey("GCRBD_PK_BARE_CODE", (bareCode, commisionReceiverId, kind))

    /** Foreign key referencing GreatBareDependants (database name GCRBD_FK_BARE_CODE) */
    lazy val greatBareDependantsFk = foreignKey("GCRBD_FK_BARE_CODE", bareCode, GreatBareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name GCRBD_FK_COMMISION_RECEIVER_ID) */
    lazy val greatCommissionReceiverFk = foreignKey("GCRBD_FK_COMMISION_RECEIVER_ID", commisionReceiverId, GreatCommissionReceiver)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatCommissionRecBareDep */
  lazy val GreatCommissionRecBareDep = new TableQuery(tag => new GreatCommissionRecBareDep(tag))

  /** Entity class storing rows of table GreatCommissionReceiver
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param names Database column NAMES SqlType(CLOB) */
  case class GreatCommissionReceiverRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], names: Option[java.sql.Clob])
  /** GetResult implicit for fetching GreatCommissionReceiverRow objects using plain SQL queries */
  implicit def GetResultGreatCommissionReceiverRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[java.sql.Clob]]): GR[GreatCommissionReceiverRow] = GR{
    prs => import prs._
    GreatCommissionReceiverRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_COMMISSION_RECEIVER. Objects of this class serve as prototypes for rows in queries. */
  class GreatCommissionReceiver(_tableTag: Tag) extends profile.api.Table[GreatCommissionReceiverRow](_tableTag, Some("WERNER2"), "GREAT_COMMISSION_RECEIVER") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, names) <> (GreatCommissionReceiverRow.tupled, GreatCommissionReceiverRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, names).shaped.<>({r=>import r._; _1.map(_=> GreatCommissionReceiverRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column NAMES SqlType(CLOB) */
    val names: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("NAMES")
  }
  /** Collection-like TableQuery object for table GreatCommissionReceiver */
  lazy val GreatCommissionReceiver = new TableQuery(tag => new GreatCommissionReceiver(tag))

  /** Entity class storing rows of table GreatCommissionReceiverHist
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
   *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
   *  @param activec Database column ACTIVEC SqlType(CHAR)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param names Database column NAMES SqlType(CLOB) */
  case class GreatCommissionReceiverHistRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], names: Option[java.sql.Clob])
  /** GetResult implicit for fetching GreatCommissionReceiverHistRow objects using plain SQL queries */
  implicit def GetResultGreatCommissionReceiverHistRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[java.sql.Clob]]): GR[GreatCommissionReceiverHistRow] = GR{
    prs => import prs._
    GreatCommissionReceiverHistRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_COMMISSION_RECEIVER_HIST. Objects of this class serve as prototypes for rows in queries. */
  class GreatCommissionReceiverHist(_tableTag: Tag) extends profile.api.Table[GreatCommissionReceiverHistRow](_tableTag, Some("WERNER2"), "GREAT_COMMISSION_RECEIVER_HIST") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, names) <> (GreatCommissionReceiverHistRow.tupled, GreatCommissionReceiverHistRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, names).shaped.<>({r=>import r._; _1.map(_=> GreatCommissionReceiverHistRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column NAMES SqlType(CLOB) */
    val names: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("NAMES")

    /** Primary key of GreatCommissionReceiverHist (database name CRH_PK_OBJECTIDC) */
    val pk = primaryKey("CRH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatCommissionReceiverHist */
  lazy val GreatCommissionReceiverHist = new TableQuery(tag => new GreatCommissionReceiverHist(tag))

  /** Entity class storing rows of table GreatConsumption
   *  @param fileIdValue Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param lineAccountIdc Database column LINE_ACCOUNT_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param guaranteeVersion Database column GUARANTEE_VERSION SqlType(NUMBER)
   *  @param partOfUsedAmount Database column PART_OF_USED_AMOUNT SqlType(NUMBER)
   *  @param partOfUsedAmountCur Database column PART_OF_USED_AMOUNT_CUR SqlType(CHAR), Length(3,false)
   *  @param partOfRequestedAmount Database column PART_OF_REQUESTED_AMOUNT SqlType(NUMBER)
   *  @param partOfRequestedAmountCur Database column PART_OF_REQUESTED_AMOUNT_CUR SqlType(CHAR), Length(3,false) */
  case class GreatConsumptionRow(fileIdValue: String, lineAccountIdc: String, guaranteeVersion: Option[scala.math.BigDecimal], partOfUsedAmount: Option[scala.math.BigDecimal], partOfUsedAmountCur: Option[String], partOfRequestedAmount: Option[scala.math.BigDecimal], partOfRequestedAmountCur: Option[String])
  /** GetResult implicit for fetching GreatConsumptionRow objects using plain SQL queries */
  implicit def GetResultGreatConsumptionRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]]): GR[GreatConsumptionRow] = GR{
    prs => import prs._
    GreatConsumptionRow.tupled((<<[String], <<[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_CONSUMPTION. Objects of this class serve as prototypes for rows in queries. */
  class GreatConsumption(_tableTag: Tag) extends profile.api.Table[GreatConsumptionRow](_tableTag, Some("WERNER2"), "GREAT_CONSUMPTION") {
    def * = (fileIdValue, lineAccountIdc, guaranteeVersion, partOfUsedAmount, partOfUsedAmountCur, partOfRequestedAmount, partOfRequestedAmountCur) <> (GreatConsumptionRow.tupled, GreatConsumptionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(fileIdValue), Rep.Some(lineAccountIdc), guaranteeVersion, partOfUsedAmount, partOfUsedAmountCur, partOfRequestedAmount, partOfRequestedAmountCur).shaped.<>({r=>import r._; _1.map(_=> GreatConsumptionRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[String] = column[String]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column LINE_ACCOUNT_IDC SqlType(VARCHAR2), Length(10,true) */
    val lineAccountIdc: Rep[String] = column[String]("LINE_ACCOUNT_IDC", O.Length(10,varying=true))
    /** Database column GUARANTEE_VERSION SqlType(NUMBER) */
    val guaranteeVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GUARANTEE_VERSION")
    /** Database column PART_OF_USED_AMOUNT SqlType(NUMBER) */
    val partOfUsedAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PART_OF_USED_AMOUNT")
    /** Database column PART_OF_USED_AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val partOfUsedAmountCur: Rep[Option[String]] = column[Option[String]]("PART_OF_USED_AMOUNT_CUR", O.Length(3,varying=false))
    /** Database column PART_OF_REQUESTED_AMOUNT SqlType(NUMBER) */
    val partOfRequestedAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PART_OF_REQUESTED_AMOUNT")
    /** Database column PART_OF_REQUESTED_AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val partOfRequestedAmountCur: Rep[Option[String]] = column[Option[String]]("PART_OF_REQUESTED_AMOUNT_CUR", O.Length(3,varying=false))

    /** Primary key of GreatConsumption (database name GCO_PK_FILE_ID_VALUE) */
    val pk = primaryKey("GCO_PK_FILE_ID_VALUE", (fileIdValue, lineAccountIdc))

    /** Foreign key referencing GreatGlineAccount (database name GCO_FK_LINE_ACCOUNT_IDC) */
    lazy val greatGlineAccountFk = foreignKey("GCO_FK_LINE_ACCOUNT_IDC", lineAccountIdc, GreatGlineAccount)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name GCO_FK_FILE_ID_VALUE) */
    lazy val greatGuaranteeFileFk = foreignKey("GCO_FK_FILE_ID_VALUE", fileIdValue, GreatGuaranteeFile)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatConsumption */
  lazy val GreatConsumption = new TableQuery(tag => new GreatConsumption(tag))

  /** Entity class storing rows of table GreatContractConsumption
   *  @param lineContractIdc Database column LINE_CONTRACT_IDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param utilizedVolume Database column UTILIZED_VOLUME SqlType(NUMBER)
   *  @param utilizedVolumeCur Database column UTILIZED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param requestedVolume Database column REQUESTED_VOLUME SqlType(NUMBER)
   *  @param requestedVolumeCur Database column REQUESTED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param reservedVolume Database column RESERVED_VOLUME SqlType(NUMBER)
   *  @param reservedVolumeCur Database column RESERVED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param enquiredVolume Database column ENQUIRED_VOLUME SqlType(NUMBER)
   *  @param enquiredVolumeCur Database column ENQUIRED_VOLUME_CUR SqlType(CHAR), Length(3,false)
   *  @param freeSpace Database column FREE_SPACE SqlType(NUMBER)
   *  @param freeSpaceCur Database column FREE_SPACE_CUR SqlType(CHAR), Length(3,false)
   *  @param degreeOfUtilization Database column DEGREE_OF_UTILIZATION SqlType(NUMBER) */
  case class GreatContractConsumptionRow(lineContractIdc: String, utilizedVolume: Option[scala.math.BigDecimal], utilizedVolumeCur: Option[String], requestedVolume: Option[scala.math.BigDecimal], requestedVolumeCur: Option[String], reservedVolume: Option[scala.math.BigDecimal], reservedVolumeCur: Option[String], enquiredVolume: Option[scala.math.BigDecimal], enquiredVolumeCur: Option[String], freeSpace: Option[scala.math.BigDecimal], freeSpaceCur: Option[String], degreeOfUtilization: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatContractConsumptionRow objects using plain SQL queries */
  implicit def GetResultGreatContractConsumptionRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]]): GR[GreatContractConsumptionRow] = GR{
    prs => import prs._
    GreatContractConsumptionRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_CONTRACT_CONSUMPTION. Objects of this class serve as prototypes for rows in queries. */
  class GreatContractConsumption(_tableTag: Tag) extends profile.api.Table[GreatContractConsumptionRow](_tableTag, Some("WERNER2"), "GREAT_CONTRACT_CONSUMPTION") {
    def * = (lineContractIdc, utilizedVolume, utilizedVolumeCur, requestedVolume, requestedVolumeCur, reservedVolume, reservedVolumeCur, enquiredVolume, enquiredVolumeCur, freeSpace, freeSpaceCur, degreeOfUtilization) <> (GreatContractConsumptionRow.tupled, GreatContractConsumptionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(lineContractIdc), utilizedVolume, utilizedVolumeCur, requestedVolume, requestedVolumeCur, reservedVolume, reservedVolumeCur, enquiredVolume, enquiredVolumeCur, freeSpace, freeSpaceCur, degreeOfUtilization).shaped.<>({r=>import r._; _1.map(_=> GreatContractConsumptionRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column LINE_CONTRACT_IDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val lineContractIdc: Rep[String] = column[String]("LINE_CONTRACT_IDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column UTILIZED_VOLUME SqlType(NUMBER) */
    val utilizedVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UTILIZED_VOLUME")
    /** Database column UTILIZED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val utilizedVolumeCur: Rep[Option[String]] = column[Option[String]]("UTILIZED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column REQUESTED_VOLUME SqlType(NUMBER) */
    val requestedVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("REQUESTED_VOLUME")
    /** Database column REQUESTED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val requestedVolumeCur: Rep[Option[String]] = column[Option[String]]("REQUESTED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column RESERVED_VOLUME SqlType(NUMBER) */
    val reservedVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RESERVED_VOLUME")
    /** Database column RESERVED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val reservedVolumeCur: Rep[Option[String]] = column[Option[String]]("RESERVED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column ENQUIRED_VOLUME SqlType(NUMBER) */
    val enquiredVolume: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ENQUIRED_VOLUME")
    /** Database column ENQUIRED_VOLUME_CUR SqlType(CHAR), Length(3,false) */
    val enquiredVolumeCur: Rep[Option[String]] = column[Option[String]]("ENQUIRED_VOLUME_CUR", O.Length(3,varying=false))
    /** Database column FREE_SPACE SqlType(NUMBER) */
    val freeSpace: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FREE_SPACE")
    /** Database column FREE_SPACE_CUR SqlType(CHAR), Length(3,false) */
    val freeSpaceCur: Rep[Option[String]] = column[Option[String]]("FREE_SPACE_CUR", O.Length(3,varying=false))
    /** Database column DEGREE_OF_UTILIZATION SqlType(NUMBER) */
    val degreeOfUtilization: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEGREE_OF_UTILIZATION")

    /** Foreign key referencing GreatGlineContract (database name GCC_FK_LINE_CONTRACT_IDC) */
    lazy val greatGlineContractFk = foreignKey("GCC_FK_LINE_CONTRACT_IDC", lineContractIdc, GreatGlineContract)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatContractConsumption */
  lazy val GreatContractConsumption = new TableQuery(tag => new GreatContractConsumption(tag))

  /** Row type of table GreatCostItem */
  type GreatCostItemRow = HCons[String,HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatCostItemRow providing default values if available in the database schema. */
  def GreatCostItemRow(objectidc: String, fileIdValue: Option[String], bookEntryIdc: Option[String], debtorPosition: Option[scala.math.BigDecimal], valueDate: Option[java.sql.Timestamp], preciseCostType: Option[String], materialNumber: Option[String], periodOfPerformanceBegin: Option[java.sql.Timestamp], periodOfPerformanceEnd: Option[java.sql.Timestamp], bare: Option[String], commissionReceiver: Option[String], purpose: Option[Char], orgId: Option[String], orgName: Option[String], orderNumber: Option[String], orderItem: Option[String], additionalPaymentPosition: Option[scala.math.BigDecimal], reason: Option[String], baseAmount: Option[scala.math.BigDecimal], sourceAmount: Option[scala.math.BigDecimal], sourceAmountCur: Option[String], percentage: Option[scala.math.BigDecimal], provInterestDayQuotient: Option[Char], days: Option[scala.math.BigDecimal], periodType: Option[Char], sourceFxRate: Option[scala.math.BigDecimal], sourceFxRateDate: Option[java.sql.Timestamp], sourceCurScale: Option[scala.math.BigDecimal], targetFxRate: Option[scala.math.BigDecimal], targetFxRateDate: Option[java.sql.Timestamp], targetCurScale: Option[scala.math.BigDecimal], targetAmountImputed: Option[scala.math.BigDecimal], targetAmount: Option[scala.math.BigDecimal], targetAmountCur: Option[String], cancelledBookEntry: Option[Char]): GreatCostItemRow = {
    objectidc :: fileIdValue :: bookEntryIdc :: debtorPosition :: valueDate :: preciseCostType :: materialNumber :: periodOfPerformanceBegin :: periodOfPerformanceEnd :: bare :: commissionReceiver :: purpose :: orgId :: orgName :: orderNumber :: orderItem :: additionalPaymentPosition :: reason :: baseAmount :: sourceAmount :: sourceAmountCur :: percentage :: provInterestDayQuotient :: days :: periodType :: sourceFxRate :: sourceFxRateDate :: sourceCurScale :: targetFxRate :: targetFxRateDate :: targetCurScale :: targetAmountImputed :: targetAmount :: targetAmountCur :: cancelledBookEntry :: HNil
  }
  /** GetResult implicit for fetching GreatCostItemRow objects using plain SQL queries */
  implicit def GetResultGreatCostItemRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatCostItemRow] = GR{
    prs => import prs._
    <<[String] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_COST_ITEM. Objects of this class serve as prototypes for rows in queries. */
  class GreatCostItem(_tableTag: Tag) extends profile.api.Table[GreatCostItemRow](_tableTag, Some("WERNER2"), "GREAT_COST_ITEM") {
    def * = objectidc :: fileIdValue :: bookEntryIdc :: debtorPosition :: valueDate :: preciseCostType :: materialNumber :: periodOfPerformanceBegin :: periodOfPerformanceEnd :: bare :: commissionReceiver :: purpose :: orgId :: orgName :: orderNumber :: orderItem :: additionalPaymentPosition :: reason :: baseAmount :: sourceAmount :: sourceAmountCur :: percentage :: provInterestDayQuotient :: days :: periodType :: sourceFxRate :: sourceFxRateDate :: sourceCurScale :: targetFxRate :: targetFxRateDate :: targetCurScale :: targetAmountImputed :: targetAmount :: targetAmountCur :: cancelledBookEntry :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[Option[String]] = column[Option[String]]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
    val bookEntryIdc: Rep[Option[String]] = column[Option[String]]("BOOK_ENTRY_IDC", O.Length(10,varying=true))
    /** Database column DEBTOR_POSITION SqlType(NUMBER) */
    val debtorPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEBTOR_POSITION")
    /** Database column VALUE_DATE SqlType(DATE) */
    val valueDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VALUE_DATE")
    /** Database column PRECISE_COST_TYPE SqlType(VARCHAR2), Length(4,true) */
    val preciseCostType: Rep[Option[String]] = column[Option[String]]("PRECISE_COST_TYPE", O.Length(4,varying=true))
    /** Database column MATERIAL_NUMBER SqlType(VARCHAR2), Length(18,true) */
    val materialNumber: Rep[Option[String]] = column[Option[String]]("MATERIAL_NUMBER", O.Length(18,varying=true))
    /** Database column PERIOD_OF_PERFORMANCE_BEGIN SqlType(DATE) */
    val periodOfPerformanceBegin: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERIOD_OF_PERFORMANCE_BEGIN")
    /** Database column PERIOD_OF_PERFORMANCE_END SqlType(DATE) */
    val periodOfPerformanceEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERIOD_OF_PERFORMANCE_END")
    /** Database column BARE SqlType(VARCHAR2), Length(4,true) */
    val bare: Rep[Option[String]] = column[Option[String]]("BARE", O.Length(4,varying=true))
    /** Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true) */
    val commissionReceiver: Rep[Option[String]] = column[Option[String]]("COMMISSION_RECEIVER", O.Length(5,varying=true))
    /** Database column PURPOSE SqlType(VARCHAR2) */
    val purpose: Rep[Option[Char]] = column[Option[Char]]("PURPOSE")
    /** Database column ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val orgId: Rep[Option[String]] = column[Option[String]]("ORG_ID", O.Length(10,varying=true))
    /** Database column ORG_NAME SqlType(VARCHAR2), Length(146,true) */
    val orgName: Rep[Option[String]] = column[Option[String]]("ORG_NAME", O.Length(146,varying=true))
    /** Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("ORDER_NUMBER", O.Length(35,varying=true))
    /** Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
    val orderItem: Rep[Option[String]] = column[Option[String]]("ORDER_ITEM", O.Length(6,varying=true))
    /** Database column ADDITIONAL_PAYMENT_POSITION SqlType(NUMBER) */
    val additionalPaymentPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ADDITIONAL_PAYMENT_POSITION")
    /** Database column REASON SqlType(VARCHAR2), Length(50,true) */
    val reason: Rep[Option[String]] = column[Option[String]]("REASON", O.Length(50,varying=true))
    /** Database column BASE_AMOUNT SqlType(NUMBER) */
    val baseAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BASE_AMOUNT")
    /** Database column SOURCE_AMOUNT SqlType(NUMBER) */
    val sourceAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SOURCE_AMOUNT")
    /** Database column SOURCE_AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val sourceAmountCur: Rep[Option[String]] = column[Option[String]]("SOURCE_AMOUNT_CUR", O.Length(3,varying=false))
    /** Database column PERCENTAGE SqlType(NUMBER) */
    val percentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PERCENTAGE")
    /** Database column PROV_INTEREST_DAY_QUOTIENT SqlType(CHAR) */
    val provInterestDayQuotient: Rep[Option[Char]] = column[Option[Char]]("PROV_INTEREST_DAY_QUOTIENT")
    /** Database column DAYS SqlType(NUMBER) */
    val days: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DAYS")
    /** Database column PERIOD_TYPE SqlType(CHAR) */
    val periodType: Rep[Option[Char]] = column[Option[Char]]("PERIOD_TYPE")
    /** Database column SOURCE_FX_RATE SqlType(NUMBER) */
    val sourceFxRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SOURCE_FX_RATE")
    /** Database column SOURCE_FX_RATE_DATE SqlType(DATE) */
    val sourceFxRateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("SOURCE_FX_RATE_DATE")
    /** Database column SOURCE_CUR_SCALE SqlType(NUMBER) */
    val sourceCurScale: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SOURCE_CUR_SCALE")
    /** Database column TARGET_FX_RATE SqlType(NUMBER) */
    val targetFxRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TARGET_FX_RATE")
    /** Database column TARGET_FX_RATE_DATE SqlType(DATE) */
    val targetFxRateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("TARGET_FX_RATE_DATE")
    /** Database column TARGET_CUR_SCALE SqlType(NUMBER) */
    val targetCurScale: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TARGET_CUR_SCALE")
    /** Database column TARGET_AMOUNT_IMPUTED SqlType(NUMBER) */
    val targetAmountImputed: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TARGET_AMOUNT_IMPUTED")
    /** Database column TARGET_AMOUNT SqlType(NUMBER) */
    val targetAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TARGET_AMOUNT")
    /** Database column TARGET_AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val targetAmountCur: Rep[Option[String]] = column[Option[String]]("TARGET_AMOUNT_CUR", O.Length(3,varying=false))
    /** Database column CANCELLED_BOOK_ENTRY SqlType(CHAR) */
    val cancelledBookEntry: Rep[Option[Char]] = column[Option[Char]]("CANCELLED_BOOK_ENTRY")

    /** Foreign key referencing GreatBareDependants (database name CIT_FK_BARE) */
    lazy val greatBareDependantsFk = foreignKey("CIT_FK_BARE", bare :: HNil, GreatBareDependants)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBookEntry (database name CIT_FK_BOOK_ENTRY_IDC) */
    lazy val greatBookEntryFk = foreignKey("CIT_FK_BOOK_ENTRY_IDC", bookEntryIdc :: HNil, GreatBookEntry)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name CIT_FK_COMMISSION_RECEIVER) */
    lazy val greatCommissionReceiverFk = foreignKey("CIT_FK_COMMISSION_RECEIVER", commissionReceiver :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name CIT_FK_TARGET_AMOUNT_CUR) */
    lazy val greatCurrencyFk = foreignKey("CIT_FK_TARGET_AMOUNT_CUR", targetAmountCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name CIT_FK_FILE_ID_VALUE) */
    lazy val greatGuaranteeFileFk = foreignKey("CIT_FK_FILE_ID_VALUE", fileIdValue :: HNil, GreatGuaranteeFile)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name CIT_FK_ORG_ID) */
    lazy val greatOrgFk = foreignKey("CIT_FK_ORG_ID", orgId :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatCostItem */
  lazy val GreatCostItem = new TableQuery(tag => new GreatCostItem(tag))

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

  /** Row type of table GreatDebtorPortion */
  type GreatDebtorPortionRow = HCons[String,HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatDebtorPortionRow providing default values if available in the database schema. */
  def GreatDebtorPortionRow(debtorPortionId: String, secured: Option[Char], relevantForBalanceSheet: Option[Char], references: Option[String], amount: Option[scala.math.BigDecimal], currency: Option[String], annotation: Option[String], settlementId: Option[String], currentLiabilityAmount: Option[scala.math.BigDecimal], currentLiabilityCurrency: Option[String], position: Option[scala.math.BigDecimal], debtorOrgId: Option[String], partnerOrgId: Option[String], invoiceOrgId: Option[String], orderNumber: Option[String], orderItem: Option[String], department: Option[String], businessUnit: Option[String], businessBranch: Option[String], artDerBesicherung: Option[Char], betragDerSicherheit: Option[scala.math.BigDecimal], wkzDerSicherheit: Option[String], abbauphase: Option[Char], awDesSchuldners: Option[scala.math.BigDecimal], awDesSicheheitengebers: Option[scala.math.BigDecimal], nameDesSicherheitengebers: Option[String], landDesSicherheitengebers: Option[String], betragDerSicherheitInEur: Option[scala.math.BigDecimal], risikobetrag: Option[scala.math.BigDecimal], unbesicherterBetragInEur: Option[scala.math.BigDecimal], auswpflBetragSicherheitEur: Option[scala.math.BigDecimal], pauschaleAwDesSchuldners: Option[scala.math.BigDecimal], verwendeteAwDesSchuldners: Option[scala.math.BigDecimal], sro: Option[scala.math.BigDecimal], sroInEur: Option[scala.math.BigDecimal], fehlerBeiSroErmittlung: Option[String], bestandsart: Option[Char], bestandsartManuellErfasst: Option[Char], garantielaufzeit: Option[scala.math.BigDecimal], letztesSchuldnerGeskz: Option[Char], letzteAktualisierungSro: Option[java.sql.Timestamp], angewandtePauschaleSchuldner: Option[scala.math.BigDecimal], angewandtePauschaleSichg: Option[scala.math.BigDecimal], verwendeteAwDesSichg: Option[scala.math.BigDecimal], referencesAnnotation: Option[String], iReferences: Option[String], iReferencesAnnotation: Option[String]): GreatDebtorPortionRow = {
    debtorPortionId :: secured :: relevantForBalanceSheet :: references :: amount :: currency :: annotation :: settlementId :: currentLiabilityAmount :: currentLiabilityCurrency :: position :: debtorOrgId :: partnerOrgId :: invoiceOrgId :: orderNumber :: orderItem :: department :: businessUnit :: businessBranch :: artDerBesicherung :: betragDerSicherheit :: wkzDerSicherheit :: abbauphase :: awDesSchuldners :: awDesSicheheitengebers :: nameDesSicherheitengebers :: landDesSicherheitengebers :: betragDerSicherheitInEur :: risikobetrag :: unbesicherterBetragInEur :: auswpflBetragSicherheitEur :: pauschaleAwDesSchuldners :: verwendeteAwDesSchuldners :: sro :: sroInEur :: fehlerBeiSroErmittlung :: bestandsart :: bestandsartManuellErfasst :: garantielaufzeit :: letztesSchuldnerGeskz :: letzteAktualisierungSro :: angewandtePauschaleSchuldner :: angewandtePauschaleSichg :: verwendeteAwDesSichg :: referencesAnnotation :: iReferences :: iReferencesAnnotation :: HNil
  }
  /** GetResult implicit for fetching GreatDebtorPortionRow objects using plain SQL queries */
  implicit def GetResultGreatDebtorPortionRow(implicit e0: GR[String], e1: GR[Option[Char]], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[java.sql.Timestamp]]): GR[GreatDebtorPortionRow] = GR{
    prs => import prs._
    <<[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_DEBTOR_PORTION. Objects of this class serve as prototypes for rows in queries. */
  class GreatDebtorPortion(_tableTag: Tag) extends profile.api.Table[GreatDebtorPortionRow](_tableTag, Some("WERNER2"), "GREAT_DEBTOR_PORTION") {
    def * = debtorPortionId :: secured :: relevantForBalanceSheet :: references :: amount :: currency :: annotation :: settlementId :: currentLiabilityAmount :: currentLiabilityCurrency :: position :: debtorOrgId :: partnerOrgId :: invoiceOrgId :: orderNumber :: orderItem :: department :: businessUnit :: businessBranch :: artDerBesicherung :: betragDerSicherheit :: wkzDerSicherheit :: abbauphase :: awDesSchuldners :: awDesSicheheitengebers :: nameDesSicherheitengebers :: landDesSicherheitengebers :: betragDerSicherheitInEur :: risikobetrag :: unbesicherterBetragInEur :: auswpflBetragSicherheitEur :: pauschaleAwDesSchuldners :: verwendeteAwDesSchuldners :: sro :: sroInEur :: fehlerBeiSroErmittlung :: bestandsart :: bestandsartManuellErfasst :: garantielaufzeit :: letztesSchuldnerGeskz :: letzteAktualisierungSro :: angewandtePauschaleSchuldner :: angewandtePauschaleSichg :: verwendeteAwDesSichg :: referencesAnnotation :: iReferences :: iReferencesAnnotation :: HNil

    /** Database column DEBTOR_PORTION_ID SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val debtorPortionId: Rep[String] = column[String]("DEBTOR_PORTION_ID", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column SECURED SqlType(CHAR) */
    val secured: Rep[Option[Char]] = column[Option[Char]]("SECURED")
    /** Database column RELEVANT_FOR_BALANCE_SHEET SqlType(CHAR) */
    val relevantForBalanceSheet: Rep[Option[Char]] = column[Option[Char]]("RELEVANT_FOR_BALANCE_SHEET")
    /** Database column REFERENCES SqlType(VARCHAR2), Length(168,true) */
    val references: Rep[Option[String]] = column[Option[String]]("REFERENCES", O.Length(168,varying=true))
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column CURRENCY SqlType(CHAR), Length(3,false) */
    val currency: Rep[Option[String]] = column[Option[String]]("CURRENCY", O.Length(3,varying=false))
    /** Database column ANNOTATION SqlType(VARCHAR2), Length(1024,true) */
    val annotation: Rep[Option[String]] = column[Option[String]]("ANNOTATION", O.Length(1024,varying=true))
    /** Database column SETTLEMENT_ID SqlType(VARCHAR2), Length(10,true) */
    val settlementId: Rep[Option[String]] = column[Option[String]]("SETTLEMENT_ID", O.Length(10,varying=true))
    /** Database column CURRENT_LIABILITY_AMOUNT SqlType(NUMBER) */
    val currentLiabilityAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CURRENT_LIABILITY_AMOUNT")
    /** Database column CURRENT_LIABILITY_CURRENCY SqlType(CHAR), Length(3,false) */
    val currentLiabilityCurrency: Rep[Option[String]] = column[Option[String]]("CURRENT_LIABILITY_CURRENCY", O.Length(3,varying=false))
    /** Database column POSITION SqlType(NUMBER) */
    val position: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POSITION")
    /** Database column DEBTOR_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val debtorOrgId: Rep[Option[String]] = column[Option[String]]("DEBTOR_ORG_ID", O.Length(10,varying=true))
    /** Database column PARTNER_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val partnerOrgId: Rep[Option[String]] = column[Option[String]]("PARTNER_ORG_ID", O.Length(10,varying=true))
    /** Database column INVOICE_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val invoiceOrgId: Rep[Option[String]] = column[Option[String]]("INVOICE_ORG_ID", O.Length(10,varying=true))
    /** Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("ORDER_NUMBER", O.Length(35,varying=true))
    /** Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
    val orderItem: Rep[Option[String]] = column[Option[String]]("ORDER_ITEM", O.Length(6,varying=true))
    /** Database column DEPARTMENT SqlType(VARCHAR2), Length(50,true) */
    val department: Rep[Option[String]] = column[Option[String]]("DEPARTMENT", O.Length(50,varying=true))
    /** Database column BUSINESS_UNIT SqlType(VARCHAR2), Length(32,true) */
    val businessUnit: Rep[Option[String]] = column[Option[String]]("BUSINESS_UNIT", O.Length(32,varying=true))
    /** Database column BUSINESS_BRANCH SqlType(VARCHAR2), Length(32,true) */
    val businessBranch: Rep[Option[String]] = column[Option[String]]("BUSINESS_BRANCH", O.Length(32,varying=true))
    /** Database column ART_DER_BESICHERUNG SqlType(VARCHAR2) */
    val artDerBesicherung: Rep[Option[Char]] = column[Option[Char]]("ART_DER_BESICHERUNG")
    /** Database column BETRAG_DER_SICHERHEIT SqlType(NUMBER) */
    val betragDerSicherheit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BETRAG_DER_SICHERHEIT")
    /** Database column WKZ_DER_SICHERHEIT SqlType(CHAR), Length(3,false) */
    val wkzDerSicherheit: Rep[Option[String]] = column[Option[String]]("WKZ_DER_SICHERHEIT", O.Length(3,varying=false))
    /** Database column ABBAUPHASE SqlType(VARCHAR2) */
    val abbauphase: Rep[Option[Char]] = column[Option[Char]]("ABBAUPHASE")
    /** Database column AW_DES_SCHULDNERS SqlType(NUMBER) */
    val awDesSchuldners: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AW_DES_SCHULDNERS")
    /** Database column AW_DES_SICHEHEITENGEBERS SqlType(NUMBER) */
    val awDesSicheheitengebers: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AW_DES_SICHEHEITENGEBERS")
    /** Database column NAME_DES_SICHERHEITENGEBERS SqlType(VARCHAR2), Length(52,true) */
    val nameDesSicherheitengebers: Rep[Option[String]] = column[Option[String]]("NAME_DES_SICHERHEITENGEBERS", O.Length(52,varying=true))
    /** Database column LAND_DES_SICHERHEITENGEBERS SqlType(VARCHAR2), Length(3,true) */
    val landDesSicherheitengebers: Rep[Option[String]] = column[Option[String]]("LAND_DES_SICHERHEITENGEBERS", O.Length(3,varying=true))
    /** Database column BETRAG_DER_SICHERHEIT_IN_EUR SqlType(NUMBER) */
    val betragDerSicherheitInEur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BETRAG_DER_SICHERHEIT_IN_EUR")
    /** Database column RISIKOBETRAG SqlType(NUMBER) */
    val risikobetrag: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("RISIKOBETRAG")
    /** Database column UNBESICHERTER_BETRAG_IN_EUR SqlType(NUMBER) */
    val unbesicherterBetragInEur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UNBESICHERTER_BETRAG_IN_EUR")
    /** Database column AUSWPFL_BETRAG_SICHERHEIT_EUR SqlType(NUMBER) */
    val auswpflBetragSicherheitEur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AUSWPFL_BETRAG_SICHERHEIT_EUR")
    /** Database column PAUSCHALE_AW_DES_SCHULDNERS SqlType(NUMBER) */
    val pauschaleAwDesSchuldners: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PAUSCHALE_AW_DES_SCHULDNERS")
    /** Database column VERWENDETE_AW_DES_SCHULDNERS SqlType(NUMBER) */
    val verwendeteAwDesSchuldners: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("VERWENDETE_AW_DES_SCHULDNERS")
    /** Database column SRO SqlType(NUMBER) */
    val sro: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SRO")
    /** Database column SRO_IN_EUR SqlType(NUMBER) */
    val sroInEur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SRO_IN_EUR")
    /** Database column FEHLER_BEI_SRO_ERMITTLUNG SqlType(VARCHAR2), Length(1000,true) */
    val fehlerBeiSroErmittlung: Rep[Option[String]] = column[Option[String]]("FEHLER_BEI_SRO_ERMITTLUNG", O.Length(1000,varying=true))
    /** Database column BESTANDSART SqlType(VARCHAR2) */
    val bestandsart: Rep[Option[Char]] = column[Option[Char]]("BESTANDSART")
    /** Database column BESTANDSART_MANUELL_ERFASST SqlType(VARCHAR2) */
    val bestandsartManuellErfasst: Rep[Option[Char]] = column[Option[Char]]("BESTANDSART_MANUELL_ERFASST")
    /** Database column GARANTIELAUFZEIT SqlType(NUMBER) */
    val garantielaufzeit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GARANTIELAUFZEIT")
    /** Database column LETZTES_SCHULDNER_GESKZ SqlType(VARCHAR2) */
    val letztesSchuldnerGeskz: Rep[Option[Char]] = column[Option[Char]]("LETZTES_SCHULDNER_GESKZ")
    /** Database column LETZTE_AKTUALISIERUNG_SRO SqlType(DATE) */
    val letzteAktualisierungSro: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LETZTE_AKTUALISIERUNG_SRO")
    /** Database column ANGEWANDTE_PAUSCHALE_SCHULDNER SqlType(NUMBER) */
    val angewandtePauschaleSchuldner: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ANGEWANDTE_PAUSCHALE_SCHULDNER")
    /** Database column ANGEWANDTE_PAUSCHALE_SICHG SqlType(NUMBER) */
    val angewandtePauschaleSichg: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ANGEWANDTE_PAUSCHALE_SICHG")
    /** Database column VERWENDETE_AW_DES_SICHG SqlType(NUMBER) */
    val verwendeteAwDesSichg: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("VERWENDETE_AW_DES_SICHG")
    /** Database column REFERENCES_ANNOTATION SqlType(VARCHAR2), Length(52,true) */
    val referencesAnnotation: Rep[Option[String]] = column[Option[String]]("REFERENCES_ANNOTATION", O.Length(52,varying=true))
    /** Database column I_REFERENCES SqlType(VARCHAR2), Length(168,true) */
    val iReferences: Rep[Option[String]] = column[Option[String]]("I_REFERENCES", O.Length(168,varying=true))
    /** Database column I_REFERENCES_ANNOTATION SqlType(VARCHAR2), Length(52,true) */
    val iReferencesAnnotation: Rep[Option[String]] = column[Option[String]]("I_REFERENCES_ANNOTATION", O.Length(52,varying=true))

    /** Foreign key referencing GreatCountry (database name DP_FK_LAND_DES_SICHERHEITENG3) */
    lazy val greatCountryFk = foreignKey("DP_FK_LAND_DES_SICHERHEITENG3", landDesSicherheitengebers :: HNil, GreatCountry)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name DP_FK_CURRENCY) */
    lazy val greatCurrencyFk2 = foreignKey("DP_FK_CURRENCY", currency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name DP_FK_CURRENT_LIABILITY_CURR1) */
    lazy val greatCurrencyFk3 = foreignKey("DP_FK_CURRENT_LIABILITY_CURR1", currentLiabilityCurrency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name DP_FK_WKZ_DER_SICHERHEIT) */
    lazy val greatCurrencyFk4 = foreignKey("DP_FK_WKZ_DER_SICHERHEIT", wkzDerSicherheit :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name DP_FK_DEBTOR_ORG_ID) */
    lazy val greatOrgFk5 = foreignKey("DP_FK_DEBTOR_ORG_ID", debtorOrgId :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name DP_FK_INVOICE_ORG_ID) */
    lazy val greatOrgFk6 = foreignKey("DP_FK_INVOICE_ORG_ID", invoiceOrgId :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name DP_FK_PARTNER_ORG_ID) */
    lazy val greatOrgFk7 = foreignKey("DP_FK_PARTNER_ORG_ID", partnerOrgId :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (settlementId) (database name DP_IDX0) */
    val index1 = index("DP_IDX0", settlementId :: HNil)
    /** Index over (references) (database name DP_IDX2) */
    val index2 = index("DP_IDX2", references :: HNil)
  }
  /** Collection-like TableQuery object for table GreatDebtorPortion */
  lazy val GreatDebtorPortion = new TableQuery(tag => new GreatDebtorPortion(tag))

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

  /** Entity class storing rows of table GreatEnterprise
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param guaranteeStockLocked Database column GUARANTEE_STOCK_LOCKED SqlType(VARCHAR2)
   *  @param globalMessages Database column GLOBAL_MESSAGES SqlType(CLOB) */
  case class GreatEnterpriseRow(objectidc: Option[String], objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], guaranteeStockLocked: Option[Char], globalMessages: Option[java.sql.Clob])
  /** GetResult implicit for fetching GreatEnterpriseRow objects using plain SQL queries */
  implicit def GetResultGreatEnterpriseRow(implicit e0: GR[Option[String]], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Char]], e4: GR[Option[java.sql.Clob]]): GR[GreatEnterpriseRow] = GR{
    prs => import prs._
    GreatEnterpriseRow.tupled((<<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[Char], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_ENTERPRISE. Objects of this class serve as prototypes for rows in queries. */
  class GreatEnterprise(_tableTag: Tag) extends profile.api.Table[GreatEnterpriseRow](_tableTag, Some("WERNER2"), "GREAT_ENTERPRISE") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, guaranteeStockLocked, globalMessages) <> (GreatEnterpriseRow.tupled, GreatEnterpriseRow.unapply)

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[Option[String]] = column[Option[String]]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column GUARANTEE_STOCK_LOCKED SqlType(VARCHAR2) */
    val guaranteeStockLocked: Rep[Option[Char]] = column[Option[Char]]("GUARANTEE_STOCK_LOCKED")
    /** Database column GLOBAL_MESSAGES SqlType(CLOB) */
    val globalMessages: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("GLOBAL_MESSAGES")
  }
  /** Collection-like TableQuery object for table GreatEnterprise */
  lazy val GreatEnterprise = new TableQuery(tag => new GreatEnterprise(tag))

  /** Row type of table GreatExemptions */
  type GreatExemptionsRow = HCons[String,HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatExemptionsRow providing default values if available in the database schema. */
  def GreatExemptionsRow(requestKey: String, exemptionRequired: Option[Char], existingPortfolio: Option[Char], teasId: Option[String], choiceOfLawPlace: Option[Char], obligationToReturn: Option[Char], limitationOfTime: Option[Char], amountLimitation: Option[Char], effectiveClause: Option[Char], reductionClause: Option[Char], formalCallingRequirements: Option[Char], nonDivestmentClause: Option[Char], indemnityClause: Option[Char], overCollateralization: Option[Char], callableOnFirstDemand: Option[Char], corpGuarInatBusinessTrans: Option[Char], guarInSiemensIntBusiness: Option[Char], benficNotPartyRespTransac: Option[Char], guarForObligOfMinorStakes: Option[Char], guarSecur3rdPartyObligatio: Option[Char], triggerClause: Option[Char], scorecardId: Option[String], exchangePeriod: Option[String], milleract: Option[Char], undefArbitraryTriggerEvent: Option[Char], supRating: Option[String], fitchRating: Option[String], moodysRating: Option[String], others: Option[String]): GreatExemptionsRow = {
    requestKey :: exemptionRequired :: existingPortfolio :: teasId :: choiceOfLawPlace :: obligationToReturn :: limitationOfTime :: amountLimitation :: effectiveClause :: reductionClause :: formalCallingRequirements :: nonDivestmentClause :: indemnityClause :: overCollateralization :: callableOnFirstDemand :: corpGuarInatBusinessTrans :: guarInSiemensIntBusiness :: benficNotPartyRespTransac :: guarForObligOfMinorStakes :: guarSecur3rdPartyObligatio :: triggerClause :: scorecardId :: exchangePeriod :: milleract :: undefArbitraryTriggerEvent :: supRating :: fitchRating :: moodysRating :: others :: HNil
  }
  /** GetResult implicit for fetching GreatExemptionsRow objects using plain SQL queries */
  implicit def GetResultGreatExemptionsRow(implicit e0: GR[String], e1: GR[Option[Char]], e2: GR[Option[String]]): GR[GreatExemptionsRow] = GR{
    prs => import prs._
    <<[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_EXEMPTIONS. Objects of this class serve as prototypes for rows in queries. */
  class GreatExemptions(_tableTag: Tag) extends profile.api.Table[GreatExemptionsRow](_tableTag, Some("WERNER2"), "GREAT_EXEMPTIONS") {
    def * = requestKey :: exemptionRequired :: existingPortfolio :: teasId :: choiceOfLawPlace :: obligationToReturn :: limitationOfTime :: amountLimitation :: effectiveClause :: reductionClause :: formalCallingRequirements :: nonDivestmentClause :: indemnityClause :: overCollateralization :: callableOnFirstDemand :: corpGuarInatBusinessTrans :: guarInSiemensIntBusiness :: benficNotPartyRespTransac :: guarForObligOfMinorStakes :: guarSecur3rdPartyObligatio :: triggerClause :: scorecardId :: exchangePeriod :: milleract :: undefArbitraryTriggerEvent :: supRating :: fitchRating :: moodysRating :: others :: HNil

    /** Database column REQUEST_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val requestKey: Rep[String] = column[String]("REQUEST_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column EXEMPTION_REQUIRED SqlType(CHAR) */
    val exemptionRequired: Rep[Option[Char]] = column[Option[Char]]("EXEMPTION_REQUIRED")
    /** Database column EXISTING_PORTFOLIO SqlType(CHAR) */
    val existingPortfolio: Rep[Option[Char]] = column[Option[Char]]("EXISTING_PORTFOLIO")
    /** Database column TEAS_ID SqlType(VARCHAR2), Length(20,true) */
    val teasId: Rep[Option[String]] = column[Option[String]]("TEAS_ID", O.Length(20,varying=true))
    /** Database column CHOICE_OF_LAW_PLACE SqlType(CHAR) */
    val choiceOfLawPlace: Rep[Option[Char]] = column[Option[Char]]("CHOICE_OF_LAW_PLACE")
    /** Database column OBLIGATION_TO_RETURN SqlType(CHAR) */
    val obligationToReturn: Rep[Option[Char]] = column[Option[Char]]("OBLIGATION_TO_RETURN")
    /** Database column LIMITATION_OF_TIME SqlType(CHAR) */
    val limitationOfTime: Rep[Option[Char]] = column[Option[Char]]("LIMITATION_OF_TIME")
    /** Database column AMOUNT_LIMITATION SqlType(CHAR) */
    val amountLimitation: Rep[Option[Char]] = column[Option[Char]]("AMOUNT_LIMITATION")
    /** Database column EFFECTIVE_CLAUSE SqlType(CHAR) */
    val effectiveClause: Rep[Option[Char]] = column[Option[Char]]("EFFECTIVE_CLAUSE")
    /** Database column REDUCTION_CLAUSE SqlType(CHAR) */
    val reductionClause: Rep[Option[Char]] = column[Option[Char]]("REDUCTION_CLAUSE")
    /** Database column FORMAL_CALLING_REQUIREMENTS SqlType(CHAR) */
    val formalCallingRequirements: Rep[Option[Char]] = column[Option[Char]]("FORMAL_CALLING_REQUIREMENTS")
    /** Database column NON_DIVESTMENT_CLAUSE SqlType(CHAR) */
    val nonDivestmentClause: Rep[Option[Char]] = column[Option[Char]]("NON_DIVESTMENT_CLAUSE")
    /** Database column INDEMNITY_CLAUSE SqlType(CHAR) */
    val indemnityClause: Rep[Option[Char]] = column[Option[Char]]("INDEMNITY_CLAUSE")
    /** Database column OVER_COLLATERALIZATION SqlType(CHAR) */
    val overCollateralization: Rep[Option[Char]] = column[Option[Char]]("OVER_COLLATERALIZATION")
    /** Database column CALLABLE_ON_FIRST_DEMAND SqlType(CHAR) */
    val callableOnFirstDemand: Rep[Option[Char]] = column[Option[Char]]("CALLABLE_ON_FIRST_DEMAND")
    /** Database column CORP_GUAR_INAT_BUSINESS_TRANS SqlType(CHAR) */
    val corpGuarInatBusinessTrans: Rep[Option[Char]] = column[Option[Char]]("CORP_GUAR_INAT_BUSINESS_TRANS")
    /** Database column GUAR_IN_SIEMENS_INT_BUSINESS SqlType(CHAR) */
    val guarInSiemensIntBusiness: Rep[Option[Char]] = column[Option[Char]]("GUAR_IN_SIEMENS_INT_BUSINESS")
    /** Database column BENFIC_NOT_PARTY_RESP_TRANSAC SqlType(CHAR) */
    val benficNotPartyRespTransac: Rep[Option[Char]] = column[Option[Char]]("BENFIC_NOT_PARTY_RESP_TRANSAC")
    /** Database column GUAR_FOR_OBLIG_OF_MINOR_STAKES SqlType(CHAR) */
    val guarForObligOfMinorStakes: Rep[Option[Char]] = column[Option[Char]]("GUAR_FOR_OBLIG_OF_MINOR_STAKES")
    /** Database column GUAR_SECUR_3RD_PARTY_OBLIGATIO SqlType(CHAR) */
    val guarSecur3rdPartyObligatio: Rep[Option[Char]] = column[Option[Char]]("GUAR_SECUR_3RD_PARTY_OBLIGATIO")
    /** Database column TRIGGER_CLAUSE SqlType(CHAR) */
    val triggerClause: Rep[Option[Char]] = column[Option[Char]]("TRIGGER_CLAUSE")
    /** Database column SCORECARD_ID SqlType(VARCHAR2), Length(20,true) */
    val scorecardId: Rep[Option[String]] = column[Option[String]]("SCORECARD_ID", O.Length(20,varying=true))
    /** Database column EXCHANGE_PERIOD SqlType(VARCHAR2), Length(3,true) */
    val exchangePeriod: Rep[Option[String]] = column[Option[String]]("EXCHANGE_PERIOD", O.Length(3,varying=true))
    /** Database column MILLERACT SqlType(CHAR) */
    val milleract: Rep[Option[Char]] = column[Option[Char]]("MILLERACT")
    /** Database column UNDEF_ARBITRARY_TRIGGER_EVENT SqlType(CHAR) */
    val undefArbitraryTriggerEvent: Rep[Option[Char]] = column[Option[Char]]("UNDEF_ARBITRARY_TRIGGER_EVENT")
    /** Database column SUP_RATING SqlType(VARCHAR2), Length(4,true) */
    val supRating: Rep[Option[String]] = column[Option[String]]("SUP_RATING", O.Length(4,varying=true))
    /** Database column FITCH_RATING SqlType(VARCHAR2), Length(4,true) */
    val fitchRating: Rep[Option[String]] = column[Option[String]]("FITCH_RATING", O.Length(4,varying=true))
    /** Database column MOODYS_RATING SqlType(VARCHAR2), Length(4,true) */
    val moodysRating: Rep[Option[String]] = column[Option[String]]("MOODYS_RATING", O.Length(4,varying=true))
    /** Database column OTHERS SqlType(VARCHAR2), Length(40,true) */
    val others: Rep[Option[String]] = column[Option[String]]("OTHERS", O.Length(40,varying=true))

    /** Foreign key referencing GreatRequest (database name GEXE_FK_REQUEST_KEY) */
    lazy val greatRequestFk = foreignKey("GEXE_FK_REQUEST_KEY", requestKey :: HNil, GreatRequest)(r => r.requestKey :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatExemptions */
  lazy val GreatExemptions = new TableQuery(tag => new GreatExemptions(tag))

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

  /** Entity class storing rows of table GreatGassociation
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param associationType Database column ASSOCIATION_TYPE SqlType(VARCHAR2)
   *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true) */
  case class GreatGassociationRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], associationType: Char, description: Option[String])
  /** GetResult implicit for fetching GreatGassociationRow objects using plain SQL queries */
  implicit def GetResultGreatGassociationRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Char]): GR[GreatGassociationRow] = GR{
    prs => import prs._
    GreatGassociationRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<[Char], <<?[String]))
  }
  /** Table description of table GREAT_GASSOCIATION. Objects of this class serve as prototypes for rows in queries. */
  class GreatGassociation(_tableTag: Tag) extends profile.api.Table[GreatGassociationRow](_tableTag, Some("WERNER2"), "GREAT_GASSOCIATION") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, associationType, description) <> (GreatGassociationRow.tupled, GreatGassociationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, Rep.Some(associationType), description).shaped.<>({r=>import r._; _1.map(_=> GreatGassociationRow.tupled((_1.get, _2, _3, _4, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column ASSOCIATION_TYPE SqlType(VARCHAR2) */
    val associationType: Rep[Char] = column[Char]("ASSOCIATION_TYPE")
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(200,varying=true))
  }
  /** Collection-like TableQuery object for table GreatGassociation */
  lazy val GreatGassociation = new TableQuery(tag => new GreatGassociation(tag))

  /** Entity class storing rows of table GreatGassociationHistory
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatereasonc Database column UPDATEREASONC SqlType(VARCHAR2), Length(10,true)
   *  @param updatecategoryc Database column UPDATECATEGORYC SqlType(VARCHAR2), Length(20,true)
   *  @param activec Database column ACTIVEC SqlType(CHAR)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param associationType Database column ASSOCIATION_TYPE SqlType(VARCHAR2)
   *  @param description Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true) */
  case class GreatGassociationHistoryRow(objectidc: String, objectversionc: scala.math.BigDecimal, lastuserc: Option[String], updatereasonc: String, updatecategoryc: String, activec: Char, updatetimec: Option[java.sql.Timestamp], associationType: Char, description: Option[String])
  /** GetResult implicit for fetching GreatGassociationHistoryRow objects using plain SQL queries */
  implicit def GetResultGreatGassociationHistoryRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Char], e4: GR[Option[java.sql.Timestamp]]): GR[GreatGassociationHistoryRow] = GR{
    prs => import prs._
    GreatGassociationHistoryRow.tupled((<<[String], <<[scala.math.BigDecimal], <<?[String], <<[String], <<[String], <<[Char], <<?[java.sql.Timestamp], <<[Char], <<?[String]))
  }
  /** Table description of table GREAT_GASSOCIATION_HISTORY. Objects of this class serve as prototypes for rows in queries. */
  class GreatGassociationHistory(_tableTag: Tag) extends profile.api.Table[GreatGassociationHistoryRow](_tableTag, Some("WERNER2"), "GREAT_GASSOCIATION_HISTORY") {
    def * = (objectidc, objectversionc, lastuserc, updatereasonc, updatecategoryc, activec, updatetimec, associationType, description) <> (GreatGassociationHistoryRow.tupled, GreatGassociationHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(objectversionc), lastuserc, Rep.Some(updatereasonc), Rep.Some(updatecategoryc), Rep.Some(activec), updatetimec, Rep.Some(associationType), description).shaped.<>({r=>import r._; _1.map(_=> GreatGassociationHistoryRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7, _8.get, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column ASSOCIATION_TYPE SqlType(VARCHAR2) */
    val associationType: Rep[Char] = column[Char]("ASSOCIATION_TYPE")
    /** Database column DESCRIPTION SqlType(VARCHAR2), Length(200,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(200,varying=true))

    /** Primary key of GreatGassociationHistory (database name GASH_PK_OBJECTIDC) */
    val pk = primaryKey("GASH_PK_OBJECTIDC", (objectidc, objectversionc))
  }
  /** Collection-like TableQuery object for table GreatGassociationHistory */
  lazy val GreatGassociationHistory = new TableQuery(tag => new GreatGassociationHistory(tag))

  /** Entity class storing rows of table GreatGassociationMember
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param associationIdValue Database column ASSOCIATION_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param fileIdValue Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param assigner Database column ASSIGNER SqlType(VARCHAR2), Length(10,true)
   *  @param assignTimestamp Database column ASSIGN_TIMESTAMP SqlType(TIMESTAMP(6))
   *  @param status Database column STATUS SqlType(VARCHAR2) */
  case class GreatGassociationMemberRow(objectidc: String, associationIdValue: String, fileIdValue: String, assigner: String, assignTimestamp: java.sql.Timestamp, status: Char)
  /** GetResult implicit for fetching GreatGassociationMemberRow objects using plain SQL queries */
  implicit def GetResultGreatGassociationMemberRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Char]): GR[GreatGassociationMemberRow] = GR{
    prs => import prs._
    GreatGassociationMemberRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[Char]))
  }
  /** Table description of table GREAT_GASSOCIATION_MEMBER. Objects of this class serve as prototypes for rows in queries. */
  class GreatGassociationMember(_tableTag: Tag) extends profile.api.Table[GreatGassociationMemberRow](_tableTag, Some("WERNER2"), "GREAT_GASSOCIATION_MEMBER") {
    def * = (objectidc, associationIdValue, fileIdValue, assigner, assignTimestamp, status) <> (GreatGassociationMemberRow.tupled, GreatGassociationMemberRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(associationIdValue), Rep.Some(fileIdValue), Rep.Some(assigner), Rep.Some(assignTimestamp), Rep.Some(status)).shaped.<>({r=>import r._; _1.map(_=> GreatGassociationMemberRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column ASSOCIATION_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val associationIdValue: Rep[String] = column[String]("ASSOCIATION_ID_VALUE", O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[String] = column[String]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column ASSIGNER SqlType(VARCHAR2), Length(10,true) */
    val assigner: Rep[String] = column[String]("ASSIGNER", O.Length(10,varying=true))
    /** Database column ASSIGN_TIMESTAMP SqlType(TIMESTAMP(6)) */
    val assignTimestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("ASSIGN_TIMESTAMP")
    /** Database column STATUS SqlType(VARCHAR2) */
    val status: Rep[Char] = column[Char]("STATUS")

    /** Uniqueness Index over (associationIdValue,fileIdValue,assignTimestamp) (database name GASM_CDX0) */
    val index1 = index("GASM_CDX0", (associationIdValue, fileIdValue, assignTimestamp), unique=true)
  }
  /** Collection-like TableQuery object for table GreatGassociationMember */
  lazy val GreatGassociationMember = new TableQuery(tag => new GreatGassociationMember(tag))

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

  /** Entity class storing rows of table GreatGmsState
   *  @param businessPartnerIdc Database column BUSINESS_PARTNER_IDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param gmsState Database column GMS_STATE SqlType(CHAR) */
  case class GreatGmsStateRow(businessPartnerIdc: String, gmsState: Option[Char])
  /** GetResult implicit for fetching GreatGmsStateRow objects using plain SQL queries */
  implicit def GetResultGreatGmsStateRow(implicit e0: GR[String], e1: GR[Option[Char]]): GR[GreatGmsStateRow] = GR{
    prs => import prs._
    GreatGmsStateRow.tupled((<<[String], <<?[Char]))
  }
  /** Table description of table GREAT_GMS_STATE. Objects of this class serve as prototypes for rows in queries. */
  class GreatGmsState(_tableTag: Tag) extends profile.api.Table[GreatGmsStateRow](_tableTag, Some("WERNER2"), "GREAT_GMS_STATE") {
    def * = (businessPartnerIdc, gmsState) <> (GreatGmsStateRow.tupled, GreatGmsStateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(businessPartnerIdc), gmsState).shaped.<>({r=>import r._; _1.map(_=> GreatGmsStateRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BUSINESS_PARTNER_IDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val businessPartnerIdc: Rep[String] = column[String]("BUSINESS_PARTNER_IDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column GMS_STATE SqlType(CHAR) */
    val gmsState: Rep[Option[Char]] = column[Option[Char]]("GMS_STATE")
  }
  /** Collection-like TableQuery object for table GreatGmsState */
  lazy val GreatGmsState = new TableQuery(tag => new GreatGmsState(tag))

  /** Entity class storing rows of table GreatGmsTransfer
   *  @param roleNumber Database column ROLE_NUMBER SqlType(NUMBER), PrimaryKey
   *  @param direction Database column DIRECTION SqlType(CHAR)
   *  @param timestamp Database column TIMESTAMP SqlType(TIMESTAMP(6))
   *  @param data Database column DATA SqlType(BLOB)
   *  @param log Database column LOG SqlType(BLOB) */
  case class GreatGmsTransferRow(roleNumber: scala.math.BigDecimal, direction: Option[Char], timestamp: Option[java.sql.Timestamp], data: Option[java.sql.Blob], log: Option[java.sql.Blob])
  /** GetResult implicit for fetching GreatGmsTransferRow objects using plain SQL queries */
  implicit def GetResultGreatGmsTransferRow(implicit e0: GR[scala.math.BigDecimal], e1: GR[Option[Char]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[java.sql.Blob]]): GR[GreatGmsTransferRow] = GR{
    prs => import prs._
    GreatGmsTransferRow.tupled((<<[scala.math.BigDecimal], <<?[Char], <<?[java.sql.Timestamp], <<?[java.sql.Blob], <<?[java.sql.Blob]))
  }
  /** Table description of table GREAT_GMS_TRANSFER. Objects of this class serve as prototypes for rows in queries. */
  class GreatGmsTransfer(_tableTag: Tag) extends profile.api.Table[GreatGmsTransferRow](_tableTag, Some("WERNER2"), "GREAT_GMS_TRANSFER") {
    def * = (roleNumber, direction, timestamp, data, log) <> (GreatGmsTransferRow.tupled, GreatGmsTransferRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(roleNumber), direction, timestamp, data, log).shaped.<>({r=>import r._; _1.map(_=> GreatGmsTransferRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ROLE_NUMBER SqlType(NUMBER), PrimaryKey */
    val roleNumber: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ROLE_NUMBER", O.PrimaryKey)
    /** Database column DIRECTION SqlType(CHAR) */
    val direction: Rep[Option[Char]] = column[Option[Char]]("DIRECTION")
    /** Database column TIMESTAMP SqlType(TIMESTAMP(6)) */
    val timestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("TIMESTAMP")
    /** Database column DATA SqlType(BLOB) */
    val data: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("DATA")
    /** Database column LOG SqlType(BLOB) */
    val log: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("LOG")
  }
  /** Collection-like TableQuery object for table GreatGmsTransfer */
  lazy val GreatGmsTransfer = new TableQuery(tag => new GreatGmsTransfer(tag))

  /** Entity class storing rows of table GreatGmsTransferEntity
   *  @param roleNumber Database column ROLE_NUMBER SqlType(NUMBER)
   *  @param businessPartnerIdc Database column BUSINESS_PARTNER_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param action Database column ACTION SqlType(CHAR) */
  case class GreatGmsTransferEntityRow(roleNumber: scala.math.BigDecimal, businessPartnerIdc: String, action: Option[Char])
  /** GetResult implicit for fetching GreatGmsTransferEntityRow objects using plain SQL queries */
  implicit def GetResultGreatGmsTransferEntityRow(implicit e0: GR[scala.math.BigDecimal], e1: GR[String], e2: GR[Option[Char]]): GR[GreatGmsTransferEntityRow] = GR{
    prs => import prs._
    GreatGmsTransferEntityRow.tupled((<<[scala.math.BigDecimal], <<[String], <<?[Char]))
  }
  /** Table description of table GREAT_GMS_TRANSFER_ENTITY. Objects of this class serve as prototypes for rows in queries. */
  class GreatGmsTransferEntity(_tableTag: Tag) extends profile.api.Table[GreatGmsTransferEntityRow](_tableTag, Some("WERNER2"), "GREAT_GMS_TRANSFER_ENTITY") {
    def * = (roleNumber, businessPartnerIdc, action) <> (GreatGmsTransferEntityRow.tupled, GreatGmsTransferEntityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(roleNumber), Rep.Some(businessPartnerIdc), action).shaped.<>({r=>import r._; _1.map(_=> GreatGmsTransferEntityRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ROLE_NUMBER SqlType(NUMBER) */
    val roleNumber: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ROLE_NUMBER")
    /** Database column BUSINESS_PARTNER_IDC SqlType(VARCHAR2), Length(10,true) */
    val businessPartnerIdc: Rep[String] = column[String]("BUSINESS_PARTNER_IDC", O.Length(10,varying=true))
    /** Database column ACTION SqlType(CHAR) */
    val action: Rep[Option[Char]] = column[Option[Char]]("ACTION")

    /** Primary key of GreatGmsTransferEntity (database name GGE_PK_ROLE_NUMBER) */
    val pk = primaryKey("GGE_PK_ROLE_NUMBER", (roleNumber, businessPartnerIdc))

    /** Foreign key referencing GreatGmsTransfer (database name GGE_FK_ROLE_NUMBER) */
    lazy val greatGmsTransferFk = foreignKey("GGE_FK_ROLE_NUMBER", roleNumber, GreatGmsTransfer)(r => r.roleNumber, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGmsTransferEntity */
  lazy val GreatGmsTransferEntity = new TableQuery(tag => new GreatGmsTransferEntity(tag))

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

  /** Row type of table GreatGuarantee */
  type GreatGuaranteeRow = HCons[String,HCons[scala.math.BigDecimal,HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatGuaranteeRow providing default values if available in the database schema. */
  def GreatGuaranteeRow(fileIdValue: String, guaranteeVersion: scala.math.BigDecimal, request: Option[String], settlement: Option[String], lastStep: Option[scala.math.BigDecimal], isOldStock: Option[Char], oldStockExNumber: Option[String], invToBeCorrected: Option[Char], invCorrected: Option[Char], lwsResponsibleEvent: Option[String], lwsSource: Option[String], lwsTarget: Option[String], rejectComment: Option[String], isGreat1Stock: Option[Char], gdSpecific1: Option[String], gdSpecific2: Option[String], gdSpecific3: Option[String], gdSpecific4: Option[String], gdSpecific5: Option[String], gdComment: Option[String], issuingFinDivision: Option[String], gdSpecific6: Option[String], gdSpecific7: Option[String], gdSpecific8: Option[String], gdSpecific9: Option[String], gdSpecific10: Option[String], originalGuaranteeId: Option[String], originalGuaranteeVersion: Option[scala.math.BigDecimal], maCodeName: Option[String], maInfo: Option[String], maGuaranteeNotTransfered: Option[Char], recallComment: Option[String]): GreatGuaranteeRow = {
    fileIdValue :: guaranteeVersion :: request :: settlement :: lastStep :: isOldStock :: oldStockExNumber :: invToBeCorrected :: invCorrected :: lwsResponsibleEvent :: lwsSource :: lwsTarget :: rejectComment :: isGreat1Stock :: gdSpecific1 :: gdSpecific2 :: gdSpecific3 :: gdSpecific4 :: gdSpecific5 :: gdComment :: issuingFinDivision :: gdSpecific6 :: gdSpecific7 :: gdSpecific8 :: gdSpecific9 :: gdSpecific10 :: originalGuaranteeId :: originalGuaranteeVersion :: maCodeName :: maInfo :: maGuaranteeNotTransfered :: recallComment :: HNil
  }
  /** GetResult implicit for fetching GreatGuaranteeRow objects using plain SQL queries */
  implicit def GetResultGreatGuaranteeRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[Char]]): GR[GreatGuaranteeRow] = GR{
    prs => import prs._
    <<[String] :: <<[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_GUARANTEE. Objects of this class serve as prototypes for rows in queries. */
  class GreatGuarantee(_tableTag: Tag) extends profile.api.Table[GreatGuaranteeRow](_tableTag, Some("WERNER2"), "GREAT_GUARANTEE") {
    def * = fileIdValue :: guaranteeVersion :: request :: settlement :: lastStep :: isOldStock :: oldStockExNumber :: invToBeCorrected :: invCorrected :: lwsResponsibleEvent :: lwsSource :: lwsTarget :: rejectComment :: isGreat1Stock :: gdSpecific1 :: gdSpecific2 :: gdSpecific3 :: gdSpecific4 :: gdSpecific5 :: gdComment :: issuingFinDivision :: gdSpecific6 :: gdSpecific7 :: gdSpecific8 :: gdSpecific9 :: gdSpecific10 :: originalGuaranteeId :: originalGuaranteeVersion :: maCodeName :: maInfo :: maGuaranteeNotTransfered :: recallComment :: HNil

    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[String] = column[String]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column GUARANTEE_VERSION SqlType(NUMBER) */
    val guaranteeVersion: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("GUARANTEE_VERSION")
    /** Database column REQUEST SqlType(VARCHAR2), Length(10,true) */
    val request: Rep[Option[String]] = column[Option[String]]("REQUEST", O.Length(10,varying=true))
    /** Database column SETTLEMENT SqlType(VARCHAR2), Length(10,true) */
    val settlement: Rep[Option[String]] = column[Option[String]]("SETTLEMENT", O.Length(10,varying=true))
    /** Database column LAST_STEP SqlType(NUMBER) */
    val lastStep: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LAST_STEP")
    /** Database column IS_OLD_STOCK SqlType(CHAR) */
    val isOldStock: Rep[Option[Char]] = column[Option[Char]]("IS_OLD_STOCK")
    /** Database column OLD_STOCK_EX_NUMBER SqlType(VARCHAR2), Length(32,true) */
    val oldStockExNumber: Rep[Option[String]] = column[Option[String]]("OLD_STOCK_EX_NUMBER", O.Length(32,varying=true))
    /** Database column INV_TO_BE_CORRECTED SqlType(CHAR) */
    val invToBeCorrected: Rep[Option[Char]] = column[Option[Char]]("INV_TO_BE_CORRECTED")
    /** Database column INV_CORRECTED SqlType(CHAR) */
    val invCorrected: Rep[Option[Char]] = column[Option[Char]]("INV_CORRECTED")
    /** Database column LWS_RESPONSIBLE_EVENT SqlType(VARCHAR2), Length(32,true) */
    val lwsResponsibleEvent: Rep[Option[String]] = column[Option[String]]("LWS_RESPONSIBLE_EVENT", O.Length(32,varying=true))
    /** Database column LWS_SOURCE SqlType(VARCHAR2), Length(32,true) */
    val lwsSource: Rep[Option[String]] = column[Option[String]]("LWS_SOURCE", O.Length(32,varying=true))
    /** Database column LWS_TARGET SqlType(VARCHAR2), Length(32,true) */
    val lwsTarget: Rep[Option[String]] = column[Option[String]]("LWS_TARGET", O.Length(32,varying=true))
    /** Database column REJECT_COMMENT SqlType(VARCHAR2), Length(1024,true) */
    val rejectComment: Rep[Option[String]] = column[Option[String]]("REJECT_COMMENT", O.Length(1024,varying=true))
    /** Database column IS_GREAT_1_STOCK SqlType(CHAR) */
    val isGreat1Stock: Rep[Option[Char]] = column[Option[Char]]("IS_GREAT_1_STOCK")
    /** Database column GD_SPECIFIC_1 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific1: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_1", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_2 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific2: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_2", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_3 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific3: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_3", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_4 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific4: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_4", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_5 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific5: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_5", O.Length(100,varying=true))
    /** Database column GD_COMMENT SqlType(VARCHAR2), Length(4000,true) */
    val gdComment: Rep[Option[String]] = column[Option[String]]("GD_COMMENT", O.Length(4000,varying=true))
    /** Database column ISSUING_FIN_DIVISION SqlType(VARCHAR2), Length(10,true) */
    val issuingFinDivision: Rep[Option[String]] = column[Option[String]]("ISSUING_FIN_DIVISION", O.Length(10,varying=true))
    /** Database column GD_SPECIFIC_6 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific6: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_6", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_7 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific7: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_7", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_8 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific8: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_8", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_9 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific9: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_9", O.Length(100,varying=true))
    /** Database column GD_SPECIFIC_10 SqlType(VARCHAR2), Length(100,true) */
    val gdSpecific10: Rep[Option[String]] = column[Option[String]]("GD_SPECIFIC_10", O.Length(100,varying=true))
    /** Database column ORIGINAL_GUARANTEE_ID SqlType(VARCHAR2), Length(20,true) */
    val originalGuaranteeId: Rep[Option[String]] = column[Option[String]]("ORIGINAL_GUARANTEE_ID", O.Length(20,varying=true))
    /** Database column ORIGINAL_GUARANTEE_VERSION SqlType(NUMBER) */
    val originalGuaranteeVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ORIGINAL_GUARANTEE_VERSION")
    /** Database column MA_CODE_NAME SqlType(VARCHAR2), Length(100,true) */
    val maCodeName: Rep[Option[String]] = column[Option[String]]("MA_CODE_NAME", O.Length(100,varying=true))
    /** Database column MA_INFO SqlType(VARCHAR2), Length(100,true) */
    val maInfo: Rep[Option[String]] = column[Option[String]]("MA_INFO", O.Length(100,varying=true))
    /** Database column MA_GUARANTEE_NOT_TRANSFERED SqlType(CHAR) */
    val maGuaranteeNotTransfered: Rep[Option[Char]] = column[Option[Char]]("MA_GUARANTEE_NOT_TRANSFERED")
    /** Database column RECALL_COMMENT SqlType(VARCHAR2), Length(1024,true) */
    val recallComment: Rep[Option[String]] = column[Option[String]]("RECALL_COMMENT", O.Length(1024,varying=true))

    /** Primary key of GreatGuarantee (database name G_PK_FILE_ID_VALUE) */
    val pk = primaryKey("G_PK_FILE_ID_VALUE", fileIdValue :: guaranteeVersion :: HNil)

    /** Foreign key referencing GreatDivision (database name G_FK_ISSUING_FIN_DIVISION) */
    lazy val greatDivisionFk = foreignKey("G_FK_ISSUING_FIN_DIVISION", issuingFinDivision :: HNil, GreatDivision)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatRequest (database name G_FK_REQUEST) */
    lazy val greatRequestFk = foreignKey("G_FK_REQUEST", request :: HNil, GreatRequest)(r => Rep.Some(r.requestKey) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatSettlement (database name G_FK_SETTLEMENT) */
    lazy val greatSettlementFk = foreignKey("G_FK_SETTLEMENT", settlement :: HNil, GreatSettlement)(r => Rep.Some(r.settlementKey) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGuarantee */
  lazy val GreatGuarantee = new TableQuery(tag => new GreatGuarantee(tag))

  /** Entity class storing rows of table GreatGuaranteeAttachment
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param name Database column NAME SqlType(VARCHAR2), Length(50,true)
   *  @param content Database column CONTENT SqlType(BLOB) */
  case class GreatGuaranteeAttachmentRow(objectidc: String, name: Option[String], content: Option[java.sql.Blob])
  /** GetResult implicit for fetching GreatGuaranteeAttachmentRow objects using plain SQL queries */
  implicit def GetResultGreatGuaranteeAttachmentRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Blob]]): GR[GreatGuaranteeAttachmentRow] = GR{
    prs => import prs._
    GreatGuaranteeAttachmentRow.tupled((<<[String], <<?[String], <<?[java.sql.Blob]))
  }
  /** Table description of table GREAT_GUARANTEE_ATTACHMENT. Objects of this class serve as prototypes for rows in queries. */
  class GreatGuaranteeAttachment(_tableTag: Tag) extends profile.api.Table[GreatGuaranteeAttachmentRow](_tableTag, Some("WERNER2"), "GREAT_GUARANTEE_ATTACHMENT") {
    def * = (objectidc, name, content) <> (GreatGuaranteeAttachmentRow.tupled, GreatGuaranteeAttachmentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), name, content).shaped.<>({r=>import r._; _1.map(_=> GreatGuaranteeAttachmentRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(50,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(50,varying=true))
    /** Database column CONTENT SqlType(BLOB) */
    val content: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("CONTENT")
  }
  /** Collection-like TableQuery object for table GreatGuaranteeAttachment */
  lazy val GreatGuaranteeAttachment = new TableQuery(tag => new GreatGuaranteeAttachment(tag))

  /** Row type of table GreatGuaranteeFile */
  type GreatGuaranteeFileRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatGuaranteeFileRow providing default values if available in the database schema. */
  def GreatGuaranteeFileRow(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], fileNumber: Option[String], serialNumber: Option[String], firstDeliveryDate: Option[java.sql.Timestamp], applicationDate: Option[java.sql.Timestamp], appGroup: Option[String], responsibleApp: Option[String], appConfirmer: Option[String], currentVersion: Option[scala.math.BigDecimal], legalVersion: Option[scala.math.BigDecimal], lastStep: Option[scala.math.BigDecimal], accountingVersion: Option[scala.math.BigDecimal], externalIdSource: Option[String], externalId: Option[String], commissionReceiver: Option[String], valueDate: Option[java.sql.Timestamp], maturedOn: Option[java.sql.Timestamp], maturedBy: Option[String], lwsResponsibleEvent: Option[String], lwsSource: Option[String], lwsTarget: Option[String], finDivisionAssignment: Option[Char], lastAcCompleteUser: Option[String], chargingStartDate: Option[java.sql.Timestamp], billingVersion: Option[scala.math.BigDecimal], changeBeforeChargingStart: Option[java.sql.Timestamp], lineVersion: Option[scala.math.BigDecimal], recallStateId: Option[String], recallStateComment: Option[String], recallStateUpdateDate: Option[java.sql.Timestamp], exercisedOn: Option[java.sql.Timestamp], exercisedBy: Option[String]): GreatGuaranteeFileRow = {
    objectidc :: objectversionc :: lastuserc :: updatetimec :: fileNumber :: serialNumber :: firstDeliveryDate :: applicationDate :: appGroup :: responsibleApp :: appConfirmer :: currentVersion :: legalVersion :: lastStep :: accountingVersion :: externalIdSource :: externalId :: commissionReceiver :: valueDate :: maturedOn :: maturedBy :: lwsResponsibleEvent :: lwsSource :: lwsTarget :: finDivisionAssignment :: lastAcCompleteUser :: chargingStartDate :: billingVersion :: changeBeforeChargingStart :: lineVersion :: recallStateId :: recallStateComment :: recallStateUpdateDate :: exercisedOn :: exercisedBy :: HNil
  }
  /** GetResult implicit for fetching GreatGuaranteeFileRow objects using plain SQL queries */
  implicit def GetResultGreatGuaranteeFileRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatGuaranteeFileRow] = GR{
    prs => import prs._
    <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_GUARANTEE_FILE. Objects of this class serve as prototypes for rows in queries. */
  class GreatGuaranteeFile(_tableTag: Tag) extends profile.api.Table[GreatGuaranteeFileRow](_tableTag, Some("WERNER2"), "GREAT_GUARANTEE_FILE") {
    def * = objectidc :: objectversionc :: lastuserc :: updatetimec :: fileNumber :: serialNumber :: firstDeliveryDate :: applicationDate :: appGroup :: responsibleApp :: appConfirmer :: currentVersion :: legalVersion :: lastStep :: accountingVersion :: externalIdSource :: externalId :: commissionReceiver :: valueDate :: maturedOn :: maturedBy :: lwsResponsibleEvent :: lwsSource :: lwsTarget :: finDivisionAssignment :: lastAcCompleteUser :: chargingStartDate :: billingVersion :: changeBeforeChargingStart :: lineVersion :: recallStateId :: recallStateComment :: recallStateUpdateDate :: exercisedOn :: exercisedBy :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column FILE_NUMBER SqlType(VARCHAR2), Length(20,true) */
    val fileNumber: Rep[Option[String]] = column[Option[String]]("FILE_NUMBER", O.Length(20,varying=true))
    /** Database column SERIAL_NUMBER SqlType(VARCHAR2), Length(10,true) */
    val serialNumber: Rep[Option[String]] = column[Option[String]]("SERIAL_NUMBER", O.Length(10,varying=true))
    /** Database column FIRST_DELIVERY_DATE SqlType(DATE) */
    val firstDeliveryDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FIRST_DELIVERY_DATE")
    /** Database column APPLICATION_DATE SqlType(DATE) */
    val applicationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("APPLICATION_DATE")
    /** Database column APP_GROUP SqlType(VARCHAR2), Length(10,true) */
    val appGroup: Rep[Option[String]] = column[Option[String]]("APP_GROUP", O.Length(10,varying=true))
    /** Database column RESPONSIBLE_APP SqlType(VARCHAR2), Length(10,true) */
    val responsibleApp: Rep[Option[String]] = column[Option[String]]("RESPONSIBLE_APP", O.Length(10,varying=true))
    /** Database column APP_CONFIRMER SqlType(VARCHAR2), Length(10,true) */
    val appConfirmer: Rep[Option[String]] = column[Option[String]]("APP_CONFIRMER", O.Length(10,varying=true))
    /** Database column CURRENT_VERSION SqlType(NUMBER) */
    val currentVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CURRENT_VERSION")
    /** Database column LEGAL_VERSION SqlType(NUMBER) */
    val legalVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LEGAL_VERSION")
    /** Database column LAST_STEP SqlType(NUMBER) */
    val lastStep: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LAST_STEP")
    /** Database column ACCOUNTING_VERSION SqlType(NUMBER) */
    val accountingVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ACCOUNTING_VERSION")
    /** Database column EXTERNAL_ID_SOURCE SqlType(VARCHAR2), Length(5,true) */
    val externalIdSource: Rep[Option[String]] = column[Option[String]]("EXTERNAL_ID_SOURCE", O.Length(5,varying=true))
    /** Database column EXTERNAL_ID SqlType(VARCHAR2), Length(20,true) */
    val externalId: Rep[Option[String]] = column[Option[String]]("EXTERNAL_ID", O.Length(20,varying=true))
    /** Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true) */
    val commissionReceiver: Rep[Option[String]] = column[Option[String]]("COMMISSION_RECEIVER", O.Length(5,varying=true))
    /** Database column VALUE_DATE SqlType(DATE) */
    val valueDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VALUE_DATE")
    /** Database column MATURED_ON SqlType(DATE) */
    val maturedOn: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MATURED_ON")
    /** Database column MATURED_BY SqlType(VARCHAR2), Length(10,true) */
    val maturedBy: Rep[Option[String]] = column[Option[String]]("MATURED_BY", O.Length(10,varying=true))
    /** Database column LWS_RESPONSIBLE_EVENT SqlType(VARCHAR2), Length(32,true) */
    val lwsResponsibleEvent: Rep[Option[String]] = column[Option[String]]("LWS_RESPONSIBLE_EVENT", O.Length(32,varying=true))
    /** Database column LWS_SOURCE SqlType(VARCHAR2), Length(32,true) */
    val lwsSource: Rep[Option[String]] = column[Option[String]]("LWS_SOURCE", O.Length(32,varying=true))
    /** Database column LWS_TARGET SqlType(VARCHAR2), Length(32,true) */
    val lwsTarget: Rep[Option[String]] = column[Option[String]]("LWS_TARGET", O.Length(32,varying=true))
    /** Database column FIN_DIVISION_ASSIGNMENT SqlType(CHAR) */
    val finDivisionAssignment: Rep[Option[Char]] = column[Option[Char]]("FIN_DIVISION_ASSIGNMENT")
    /** Database column LAST_AC_COMPLETE_USER SqlType(VARCHAR2), Length(10,true) */
    val lastAcCompleteUser: Rep[Option[String]] = column[Option[String]]("LAST_AC_COMPLETE_USER", O.Length(10,varying=true))
    /** Database column CHARGING_START_DATE SqlType(DATE) */
    val chargingStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CHARGING_START_DATE")
    /** Database column BILLING_VERSION SqlType(NUMBER) */
    val billingVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BILLING_VERSION")
    /** Database column CHANGE_BEFORE_CHARGING_START SqlType(DATE) */
    val changeBeforeChargingStart: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CHANGE_BEFORE_CHARGING_START")
    /** Database column LINE_VERSION SqlType(NUMBER) */
    val lineVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LINE_VERSION")
    /** Database column RECALL_STATE_ID SqlType(VARCHAR2), Length(10,true) */
    val recallStateId: Rep[Option[String]] = column[Option[String]]("RECALL_STATE_ID", O.Length(10,varying=true))
    /** Database column RECALL_STATE_COMMENT SqlType(VARCHAR2), Length(2000,true) */
    val recallStateComment: Rep[Option[String]] = column[Option[String]]("RECALL_STATE_COMMENT", O.Length(2000,varying=true))
    /** Database column RECALL_STATE_UPDATE_DATE SqlType(TIMESTAMP(6)) */
    val recallStateUpdateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("RECALL_STATE_UPDATE_DATE")
    /** Database column EXERCISED_ON SqlType(DATE) */
    val exercisedOn: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXERCISED_ON")
    /** Database column EXERCISED_BY SqlType(VARCHAR2), Length(10,true) */
    val exercisedBy: Rep[Option[String]] = column[Option[String]]("EXERCISED_BY", O.Length(10,varying=true))

    /** Foreign key referencing GreatCommissionReceiver (database name GFE_FK_COMMISSION_RECEIVER) */
    lazy val greatCommissionReceiverFk = foreignKey("GFE_FK_COMMISSION_RECEIVER", commissionReceiver :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GFE_FK_APP_CONFIRMER) */
    lazy val greatDivisionUserFk2 = foreignKey("GFE_FK_APP_CONFIRMER", appConfirmer :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GFE_FK_LAST_AC_COMPLETE_USER) */
    lazy val greatDivisionUserFk3 = foreignKey("GFE_FK_LAST_AC_COMPLETE_USER", lastAcCompleteUser :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name GFE_FK_RESPONSIBLE_APP) */
    lazy val greatDivisionUserFk4 = foreignKey("GFE_FK_RESPONSIBLE_APP", responsibleApp :: HNil, GreatDivisionUser)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatUserGroup (database name GFE_FK_APP_GROUP) */
    lazy val greatUserGroupFk = foreignKey("GFE_FK_APP_GROUP", appGroup :: HNil, GreatUserGroup)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (externalId) (database name GFE_IDX0) */
    val index1 = index("GFE_IDX0", externalId :: HNil)
    /** Index over (lineVersion) (database name GFE_IDX3) */
    val index2 = index("GFE_IDX3", lineVersion :: HNil)
  }
  /** Collection-like TableQuery object for table GreatGuaranteeFile */
  lazy val GreatGuaranteeFile = new TableQuery(tag => new GreatGuaranteeFile(tag))

  /** Entity class storing rows of table GreatGuaranteeScheduler2
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param objectversionc Database column OBJECTVERSIONC SqlType(NUMBER)
   *  @param lastuserc Database column LASTUSERC SqlType(VARCHAR2), Length(40,true)
   *  @param updatetimec Database column UPDATETIMEC SqlType(DATE)
   *  @param fileIdValue Database column FILE_ID_VALUE SqlType(NUMBER)
   *  @param reminderDate Database column REMINDER_DATE SqlType(DATE)
   *  @param reason Database column REASON SqlType(VARCHAR2), Length(50,true)
   *  @param done Database column DONE SqlType(VARCHAR2)
   *  @param userValueId Database column USER_VALUE_ID SqlType(VARCHAR2), Length(10,true) */
  case class GreatGuaranteeScheduler2Row(objectidc: String, objectversionc: Option[scala.math.BigDecimal], lastuserc: Option[String], updatetimec: Option[java.sql.Timestamp], fileIdValue: Option[scala.math.BigDecimal], reminderDate: Option[java.sql.Timestamp], reason: Option[String], done: Option[Char], userValueId: Option[String])
  /** GetResult implicit for fetching GreatGuaranteeScheduler2Row objects using plain SQL queries */
  implicit def GetResultGreatGuaranteeScheduler2Row(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatGuaranteeScheduler2Row] = GR{
    prs => import prs._
    GreatGuaranteeScheduler2Row.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[String], <<?[Char], <<?[String]))
  }
  /** Table description of table GREAT_GUARANTEE_SCHEDULER2. Objects of this class serve as prototypes for rows in queries. */
  class GreatGuaranteeScheduler2(_tableTag: Tag) extends profile.api.Table[GreatGuaranteeScheduler2Row](_tableTag, Some("WERNER2"), "GREAT_GUARANTEE_SCHEDULER2") {
    def * = (objectidc, objectversionc, lastuserc, updatetimec, fileIdValue, reminderDate, reason, done, userValueId) <> (GreatGuaranteeScheduler2Row.tupled, GreatGuaranteeScheduler2Row.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), objectversionc, lastuserc, updatetimec, fileIdValue, reminderDate, reason, done, userValueId).shaped.<>({r=>import r._; _1.map(_=> GreatGuaranteeScheduler2Row.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column OBJECTVERSIONC SqlType(NUMBER) */
    val objectversionc: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OBJECTVERSIONC")
    /** Database column LASTUSERC SqlType(VARCHAR2), Length(40,true) */
    val lastuserc: Rep[Option[String]] = column[Option[String]]("LASTUSERC", O.Length(40,varying=true))
    /** Database column UPDATETIMEC SqlType(DATE) */
    val updatetimec: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("UPDATETIMEC")
    /** Database column FILE_ID_VALUE SqlType(NUMBER) */
    val fileIdValue: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FILE_ID_VALUE")
    /** Database column REMINDER_DATE SqlType(DATE) */
    val reminderDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("REMINDER_DATE")
    /** Database column REASON SqlType(VARCHAR2), Length(50,true) */
    val reason: Rep[Option[String]] = column[Option[String]]("REASON", O.Length(50,varying=true))
    /** Database column DONE SqlType(VARCHAR2) */
    val done: Rep[Option[Char]] = column[Option[Char]]("DONE")
    /** Database column USER_VALUE_ID SqlType(VARCHAR2), Length(10,true) */
    val userValueId: Rep[Option[String]] = column[Option[String]]("USER_VALUE_ID", O.Length(10,varying=true))

    /** Foreign key referencing GreatDivisionUser (database name SCHED_FK_USER_VALUE_ID) */
    lazy val greatDivisionUserFk = foreignKey("SCHED_FK_USER_VALUE_ID", userValueId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatGuaranteeScheduler2 */
  lazy val GreatGuaranteeScheduler2 = new TableQuery(tag => new GreatGuaranteeScheduler2(tag))

  /** Entity class storing rows of table GreatImport
   *  @param md5 Database column MD5 SqlType(VARCHAR2), Length(32,true)
   *  @param importStart Database column IMPORT_START SqlType(TIMESTAMP(6))
   *  @param importType Database column IMPORT_TYPE SqlType(VARCHAR2), Length(8,true)
   *  @param edition Database column EDITION SqlType(VARCHAR2), Length(8,true)
   *  @param who Database column WHO SqlType(VARCHAR2), Length(40,true)
   *  @param state Database column STATE SqlType(VARCHAR2), Length(8,true)
   *  @param filename Database column FILENAME SqlType(VARCHAR2), Length(50,true)
   *  @param importEnd Database column IMPORT_END SqlType(TIMESTAMP(6))
   *  @param stepsDone Database column STEPS_DONE SqlType(NUMBER) */
  case class GreatImportRow(md5: String, importStart: java.sql.Timestamp, importType: Option[String], edition: Option[String], who: Option[String], state: Option[String], filename: Option[String], importEnd: Option[java.sql.Timestamp], stepsDone: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatImportRow objects using plain SQL queries */
  implicit def GetResultGreatImportRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[scala.math.BigDecimal]]): GR[GreatImportRow] = GR{
    prs => import prs._
    GreatImportRow.tupled((<<[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_IMPORT. Objects of this class serve as prototypes for rows in queries. */
  class GreatImport(_tableTag: Tag) extends profile.api.Table[GreatImportRow](_tableTag, Some("WERNER2"), "GREAT_IMPORT") {
    def * = (md5, importStart, importType, edition, who, state, filename, importEnd, stepsDone) <> (GreatImportRow.tupled, GreatImportRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(md5), Rep.Some(importStart), importType, edition, who, state, filename, importEnd, stepsDone).shaped.<>({r=>import r._; _1.map(_=> GreatImportRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column MD5 SqlType(VARCHAR2), Length(32,true) */
    val md5: Rep[String] = column[String]("MD5", O.Length(32,varying=true))
    /** Database column IMPORT_START SqlType(TIMESTAMP(6)) */
    val importStart: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("IMPORT_START")
    /** Database column IMPORT_TYPE SqlType(VARCHAR2), Length(8,true) */
    val importType: Rep[Option[String]] = column[Option[String]]("IMPORT_TYPE", O.Length(8,varying=true))
    /** Database column EDITION SqlType(VARCHAR2), Length(8,true) */
    val edition: Rep[Option[String]] = column[Option[String]]("EDITION", O.Length(8,varying=true))
    /** Database column WHO SqlType(VARCHAR2), Length(40,true) */
    val who: Rep[Option[String]] = column[Option[String]]("WHO", O.Length(40,varying=true))
    /** Database column STATE SqlType(VARCHAR2), Length(8,true) */
    val state: Rep[Option[String]] = column[Option[String]]("STATE", O.Length(8,varying=true))
    /** Database column FILENAME SqlType(VARCHAR2), Length(50,true) */
    val filename: Rep[Option[String]] = column[Option[String]]("FILENAME", O.Length(50,varying=true))
    /** Database column IMPORT_END SqlType(TIMESTAMP(6)) */
    val importEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("IMPORT_END")
    /** Database column STEPS_DONE SqlType(NUMBER) */
    val stepsDone: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("STEPS_DONE")

    /** Primary key of GreatImport (database name IMP_PK_MD5) */
    val pk = primaryKey("IMP_PK_MD5", (md5, importStart))
  }
  /** Collection-like TableQuery object for table GreatImport */
  lazy val GreatImport = new TableQuery(tag => new GreatImport(tag))

  /** Entity class storing rows of table GreatInternatTexts
   *  @param category Database column CATEGORY SqlType(VARCHAR2), Length(128,true)
   *  @param name Database column NAME SqlType(VARCHAR2), Length(64,true)
   *  @param language Database column LANGUAGE SqlType(VARCHAR2), Length(2,true)
   *  @param text Database column TEXT SqlType(VARCHAR2), Length(4000,true) */
  case class GreatInternatTextsRow(category: String, name: String, language: String, text: String)
  /** GetResult implicit for fetching GreatInternatTextsRow objects using plain SQL queries */
  implicit def GetResultGreatInternatTextsRow(implicit e0: GR[String]): GR[GreatInternatTextsRow] = GR{
    prs => import prs._
    GreatInternatTextsRow.tupled((<<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table GREAT_INTERNAT_TEXTS. Objects of this class serve as prototypes for rows in queries. */
  class GreatInternatTexts(_tableTag: Tag) extends profile.api.Table[GreatInternatTextsRow](_tableTag, Some("WERNER2"), "GREAT_INTERNAT_TEXTS") {
    def * = (category, name, language, text) <> (GreatInternatTextsRow.tupled, GreatInternatTextsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(category), Rep.Some(name), Rep.Some(language), Rep.Some(text)).shaped.<>({r=>import r._; _1.map(_=> GreatInternatTextsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column CATEGORY SqlType(VARCHAR2), Length(128,true) */
    val category: Rep[String] = column[String]("CATEGORY", O.Length(128,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(64,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(64,varying=true))
    /** Database column LANGUAGE SqlType(VARCHAR2), Length(2,true) */
    val language: Rep[String] = column[String]("LANGUAGE", O.Length(2,varying=true))
    /** Database column TEXT SqlType(VARCHAR2), Length(4000,true) */
    val text: Rep[String] = column[String]("TEXT", O.Length(4000,varying=true))

    /** Primary key of GreatInternatTexts (database name ITXT_PK_CATEGORY) */
    val pk = primaryKey("ITXT_PK_CATEGORY", (category, name, language))
  }
  /** Collection-like TableQuery object for table GreatInternatTexts */
  lazy val GreatInternatTexts = new TableQuery(tag => new GreatInternatTexts(tag))

  /** Row type of table GreatInvoice */
  type GreatInvoiceRow = HCons[String,HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatInvoiceRow providing default values if available in the database schema. */
  def GreatInvoiceRow(objectidc: String, invoiceNumber: Option[String], amount: Option[scala.math.BigDecimal], amountCur: Option[String], invoiceOrg: Option[String], invoiceOrgBy: Option[Char], invoiceOrgIv: Option[Char], invoiceAre: Option[String], invoiceAreName: Option[String], invoiceAreType: Option[Char], invoiceDivisionCode: Option[String], orderNumber: Option[String], commissionReceiver: Option[String], applicantName: Option[String], applicantPhone: Option[String], issuersOrg: Option[String], fileIdValue: Option[String], beneficiaryName: Option[String], beneficiaryCountry: Option[String], guarantorType: Option[Char], guarantorNumber: Option[String], guarantorName: Option[String], guarantorReferences: Option[String], billingRunIdc: Option[String]): GreatInvoiceRow = {
    objectidc :: invoiceNumber :: amount :: amountCur :: invoiceOrg :: invoiceOrgBy :: invoiceOrgIv :: invoiceAre :: invoiceAreName :: invoiceAreType :: invoiceDivisionCode :: orderNumber :: commissionReceiver :: applicantName :: applicantPhone :: issuersOrg :: fileIdValue :: beneficiaryName :: beneficiaryCountry :: guarantorType :: guarantorNumber :: guarantorName :: guarantorReferences :: billingRunIdc :: HNil
  }
  /** GetResult implicit for fetching GreatInvoiceRow objects using plain SQL queries */
  implicit def GetResultGreatInvoiceRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[Char]]): GR[GreatInvoiceRow] = GR{
    prs => import prs._
    <<[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_INVOICE. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoice(_tableTag: Tag) extends profile.api.Table[GreatInvoiceRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE") {
    def * = objectidc :: invoiceNumber :: amount :: amountCur :: invoiceOrg :: invoiceOrgBy :: invoiceOrgIv :: invoiceAre :: invoiceAreName :: invoiceAreType :: invoiceDivisionCode :: orderNumber :: commissionReceiver :: applicantName :: applicantPhone :: issuersOrg :: fileIdValue :: beneficiaryName :: beneficiaryCountry :: guarantorType :: guarantorNumber :: guarantorName :: guarantorReferences :: billingRunIdc :: HNil

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column INVOICE_NUMBER SqlType(VARCHAR2), Length(10,true) */
    val invoiceNumber: Rep[Option[String]] = column[Option[String]]("INVOICE_NUMBER", O.Length(10,varying=true))
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val amountCur: Rep[Option[String]] = column[Option[String]]("AMOUNT_CUR", O.Length(3,varying=false))
    /** Database column INVOICE_ORG SqlType(VARCHAR2), Length(10,true) */
    val invoiceOrg: Rep[Option[String]] = column[Option[String]]("INVOICE_ORG", O.Length(10,varying=true))
    /** Database column INVOICE_ORG_BY SqlType(CHAR) */
    val invoiceOrgBy: Rep[Option[Char]] = column[Option[Char]]("INVOICE_ORG_BY")
    /** Database column INVOICE_ORG_IV SqlType(CHAR) */
    val invoiceOrgIv: Rep[Option[Char]] = column[Option[Char]]("INVOICE_ORG_IV")
    /** Database column INVOICE_ARE SqlType(VARCHAR2), Length(4,true) */
    val invoiceAre: Rep[Option[String]] = column[Option[String]]("INVOICE_ARE", O.Length(4,varying=true))
    /** Database column INVOICE_ARE_NAME SqlType(VARCHAR2), Length(160,true) */
    val invoiceAreName: Rep[Option[String]] = column[Option[String]]("INVOICE_ARE_NAME", O.Length(160,varying=true))
    /** Database column INVOICE_ARE_TYPE SqlType(VARCHAR2) */
    val invoiceAreType: Rep[Option[Char]] = column[Option[Char]]("INVOICE_ARE_TYPE")
    /** Database column INVOICE_DIVISION_CODE SqlType(VARCHAR2), Length(3,true) */
    val invoiceDivisionCode: Rep[Option[String]] = column[Option[String]]("INVOICE_DIVISION_CODE", O.Length(3,varying=true))
    /** Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("ORDER_NUMBER", O.Length(35,varying=true))
    /** Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true) */
    val commissionReceiver: Rep[Option[String]] = column[Option[String]]("COMMISSION_RECEIVER", O.Length(5,varying=true))
    /** Database column APPLICANT_NAME SqlType(VARCHAR2), Length(82,true) */
    val applicantName: Rep[Option[String]] = column[Option[String]]("APPLICANT_NAME", O.Length(82,varying=true))
    /** Database column APPLICANT_PHONE SqlType(VARCHAR2), Length(32,true) */
    val applicantPhone: Rep[Option[String]] = column[Option[String]]("APPLICANT_PHONE", O.Length(32,varying=true))
    /** Database column ISSUERS_ORG SqlType(VARCHAR2), Length(10,true) */
    val issuersOrg: Rep[Option[String]] = column[Option[String]]("ISSUERS_ORG", O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[Option[String]] = column[Option[String]]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column BENEFICIARY_NAME SqlType(VARCHAR2), Length(82,true) */
    val beneficiaryName: Rep[Option[String]] = column[Option[String]]("BENEFICIARY_NAME", O.Length(82,varying=true))
    /** Database column BENEFICIARY_COUNTRY SqlType(VARCHAR2), Length(3,true) */
    val beneficiaryCountry: Rep[Option[String]] = column[Option[String]]("BENEFICIARY_COUNTRY", O.Length(3,varying=true))
    /** Database column GUARANTOR_TYPE SqlType(CHAR) */
    val guarantorType: Rep[Option[Char]] = column[Option[Char]]("GUARANTOR_TYPE")
    /** Database column GUARANTOR_NUMBER SqlType(VARCHAR2), Length(10,true) */
    val guarantorNumber: Rep[Option[String]] = column[Option[String]]("GUARANTOR_NUMBER", O.Length(10,varying=true))
    /** Database column GUARANTOR_NAME SqlType(VARCHAR2), Length(52,true) */
    val guarantorName: Rep[Option[String]] = column[Option[String]]("GUARANTOR_NAME", O.Length(52,varying=true))
    /** Database column GUARANTOR_REFERENCES SqlType(VARCHAR2), Length(168,true) */
    val guarantorReferences: Rep[Option[String]] = column[Option[String]]("GUARANTOR_REFERENCES", O.Length(168,varying=true))
    /** Database column BILLING_RUN_IDC SqlType(VARCHAR2), Length(10,true) */
    val billingRunIdc: Rep[Option[String]] = column[Option[String]]("BILLING_RUN_IDC", O.Length(10,varying=true))

    /** Foreign key referencing GreatAccountingArea (database name INV_FK_INVOICE_ARE) */
    lazy val greatAccountingAreaFk = foreignKey("INV_FK_INVOICE_ARE", invoiceAre :: HNil, GreatAccountingArea)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBillingRun (database name INV_FK_BILLING_RUN_IDC) */
    lazy val greatBillingRunFk = foreignKey("INV_FK_BILLING_RUN_IDC", billingRunIdc :: HNil, GreatBillingRun)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name INV_FK_COMMISSION_RECEIVER) */
    lazy val greatCommissionReceiverFk = foreignKey("INV_FK_COMMISSION_RECEIVER", commissionReceiver :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name INV_FK_AMOUNT_CUR) */
    lazy val greatCurrencyFk = foreignKey("INV_FK_AMOUNT_CUR", amountCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name INV_FK_FILE_ID_VALUE) */
    lazy val greatGuaranteeFileFk = foreignKey("INV_FK_FILE_ID_VALUE", fileIdValue :: HNil, GreatGuaranteeFile)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name INV_FK_INVOICE_ORG) */
    lazy val greatOrgFk6 = foreignKey("INV_FK_INVOICE_ORG", invoiceOrg :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name INV_FK_ISSUERS_ORG) */
    lazy val greatOrgFk7 = foreignKey("INV_FK_ISSUERS_ORG", issuersOrg :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatInvoice */
  lazy val GreatInvoice = new TableQuery(tag => new GreatInvoice(tag))

  /** Entity class storing rows of table GreatInvoiceEvent
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param fileIdValue Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param guaranteeVersionNumber Database column GUARANTEE_VERSION_NUMBER SqlType(NUMBER)
   *  @param debtorPortionPosition Database column DEBTOR_PORTION_POSITION SqlType(NUMBER)
   *  @param guaranteePurpose Database column GUARANTEE_PURPOSE SqlType(VARCHAR2)
   *  @param guarantorType Database column GUARANTOR_TYPE SqlType(CHAR)
   *  @param eventTimestamp Database column EVENT_TIMESTAMP SqlType(DATE)
   *  @param eventKind Database column EVENT_KIND SqlType(NUMBER)
   *  @param eventStatus Database column EVENT_STATUS SqlType(NUMBER)
   *  @param passId Database column PASS_ID SqlType(VARCHAR2), Length(10,true)
   *  @param eventActivityFlag Database column EVENT_ACTIVITY_FLAG SqlType(NUMBER)
   *  @param eventStartDate Database column EVENT_START_DATE SqlType(DATE)
   *  @param registeredChanges Database column REGISTERED_CHANGES SqlType(VARCHAR2), Length(16,true)
   *  @param guaranteeStartDate Database column GUARANTEE_START_DATE SqlType(DATE)
   *  @param avalCommPortion Database column AVAL_COMM_PORTION SqlType(NUMBER)
   *  @param chargeNumber Database column CHARGE_NUMBER SqlType(VARCHAR2), Length(10,true) */
  case class GreatInvoiceEventRow(idValue: String, fileIdValue: Option[String], guaranteeVersionNumber: Option[scala.math.BigDecimal], debtorPortionPosition: Option[scala.math.BigDecimal], guaranteePurpose: Option[Char], guarantorType: Option[Char], eventTimestamp: Option[java.sql.Timestamp], eventKind: Option[scala.math.BigDecimal], eventStatus: Option[scala.math.BigDecimal], passId: Option[String], eventActivityFlag: Option[scala.math.BigDecimal], eventStartDate: Option[java.sql.Timestamp], registeredChanges: Option[String], guaranteeStartDate: Option[java.sql.Timestamp], avalCommPortion: Option[scala.math.BigDecimal], chargeNumber: Option[String])
  /** GetResult implicit for fetching GreatInvoiceEventRow objects using plain SQL queries */
  implicit def GetResultGreatInvoiceEventRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[Char]], e4: GR[Option[java.sql.Timestamp]]): GR[GreatInvoiceEventRow] = GR{
    prs => import prs._
    GreatInvoiceEventRow.tupled((<<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[Char], <<?[Char], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_INVOICE_EVENT. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoiceEvent(_tableTag: Tag) extends profile.api.Table[GreatInvoiceEventRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE_EVENT") {
    def * = (idValue, fileIdValue, guaranteeVersionNumber, debtorPortionPosition, guaranteePurpose, guarantorType, eventTimestamp, eventKind, eventStatus, passId, eventActivityFlag, eventStartDate, registeredChanges, guaranteeStartDate, avalCommPortion, chargeNumber) <> (GreatInvoiceEventRow.tupled, GreatInvoiceEventRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), fileIdValue, guaranteeVersionNumber, debtorPortionPosition, guaranteePurpose, guarantorType, eventTimestamp, eventKind, eventStatus, passId, eventActivityFlag, eventStartDate, registeredChanges, guaranteeStartDate, avalCommPortion, chargeNumber).shaped.<>({r=>import r._; _1.map(_=> GreatInvoiceEventRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[Option[String]] = column[Option[String]]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column GUARANTEE_VERSION_NUMBER SqlType(NUMBER) */
    val guaranteeVersionNumber: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GUARANTEE_VERSION_NUMBER")
    /** Database column DEBTOR_PORTION_POSITION SqlType(NUMBER) */
    val debtorPortionPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEBTOR_PORTION_POSITION")
    /** Database column GUARANTEE_PURPOSE SqlType(VARCHAR2) */
    val guaranteePurpose: Rep[Option[Char]] = column[Option[Char]]("GUARANTEE_PURPOSE")
    /** Database column GUARANTOR_TYPE SqlType(CHAR) */
    val guarantorType: Rep[Option[Char]] = column[Option[Char]]("GUARANTOR_TYPE")
    /** Database column EVENT_TIMESTAMP SqlType(DATE) */
    val eventTimestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EVENT_TIMESTAMP")
    /** Database column EVENT_KIND SqlType(NUMBER) */
    val eventKind: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EVENT_KIND")
    /** Database column EVENT_STATUS SqlType(NUMBER) */
    val eventStatus: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EVENT_STATUS")
    /** Database column PASS_ID SqlType(VARCHAR2), Length(10,true) */
    val passId: Rep[Option[String]] = column[Option[String]]("PASS_ID", O.Length(10,varying=true))
    /** Database column EVENT_ACTIVITY_FLAG SqlType(NUMBER) */
    val eventActivityFlag: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EVENT_ACTIVITY_FLAG")
    /** Database column EVENT_START_DATE SqlType(DATE) */
    val eventStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EVENT_START_DATE")
    /** Database column REGISTERED_CHANGES SqlType(VARCHAR2), Length(16,true) */
    val registeredChanges: Rep[Option[String]] = column[Option[String]]("REGISTERED_CHANGES", O.Length(16,varying=true))
    /** Database column GUARANTEE_START_DATE SqlType(DATE) */
    val guaranteeStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("GUARANTEE_START_DATE")
    /** Database column AVAL_COMM_PORTION SqlType(NUMBER) */
    val avalCommPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AVAL_COMM_PORTION")
    /** Database column CHARGE_NUMBER SqlType(VARCHAR2), Length(10,true) */
    val chargeNumber: Rep[Option[String]] = column[Option[String]]("CHARGE_NUMBER", O.Length(10,varying=true))

    /** Index over (fileIdValue) (database name INET_IDX0) */
    val index1 = index("INET_IDX0", fileIdValue)
  }
  /** Collection-like TableQuery object for table GreatInvoiceEvent */
  lazy val GreatInvoiceEvent = new TableQuery(tag => new GreatInvoiceEvent(tag))

  /** Row type of table GreatInvoiceEvidence */
  type GreatInvoiceEvidenceRow = HCons[String,HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatInvoiceEvidenceRow providing default values if available in the database schema. */
  def GreatInvoiceEvidenceRow(invoiceEvidenceKey: String, invoicePassKey: Option[String], fileIdValue: Option[String], debtorPortionPosition: Option[scala.math.BigDecimal], minimalComnInvoiced: Option[Char], invoiceId: Option[String], fileNumber: Option[String], invoiceOrgId: Option[String], invoiceAreCode: Option[String], invoiceGroupAssoc: Option[Char], orderNumber: Option[String], orderItem: Option[String], countryOfPartner: Option[String], accountingPurpose: Option[Char], appName: Option[String], appPhone: Option[String], valueDate: Option[java.sql.Timestamp], guarantorType: Option[Char], commissionReceiver: Option[String], invoiceAreName: Option[String], bareCode: Option[String], minimalFeeInvoiced: Option[Char], divisionShortName: Option[String]): GreatInvoiceEvidenceRow = {
    invoiceEvidenceKey :: invoicePassKey :: fileIdValue :: debtorPortionPosition :: minimalComnInvoiced :: invoiceId :: fileNumber :: invoiceOrgId :: invoiceAreCode :: invoiceGroupAssoc :: orderNumber :: orderItem :: countryOfPartner :: accountingPurpose :: appName :: appPhone :: valueDate :: guarantorType :: commissionReceiver :: invoiceAreName :: bareCode :: minimalFeeInvoiced :: divisionShortName :: HNil
  }
  /** GetResult implicit for fetching GreatInvoiceEvidenceRow objects using plain SQL queries */
  implicit def GetResultGreatInvoiceEvidenceRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[Char]], e4: GR[Option[java.sql.Timestamp]]): GR[GreatInvoiceEvidenceRow] = GR{
    prs => import prs._
    <<[String] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_INVOICE_EVIDENCE. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoiceEvidence(_tableTag: Tag) extends profile.api.Table[GreatInvoiceEvidenceRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE_EVIDENCE") {
    def * = invoiceEvidenceKey :: invoicePassKey :: fileIdValue :: debtorPortionPosition :: minimalComnInvoiced :: invoiceId :: fileNumber :: invoiceOrgId :: invoiceAreCode :: invoiceGroupAssoc :: orderNumber :: orderItem :: countryOfPartner :: accountingPurpose :: appName :: appPhone :: valueDate :: guarantorType :: commissionReceiver :: invoiceAreName :: bareCode :: minimalFeeInvoiced :: divisionShortName :: HNil

    /** Database column INVOICE_EVIDENCE_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val invoiceEvidenceKey: Rep[String] = column[String]("INVOICE_EVIDENCE_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column INVOICE_PASS_KEY SqlType(VARCHAR2), Length(10,true) */
    val invoicePassKey: Rep[Option[String]] = column[Option[String]]("INVOICE_PASS_KEY", O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[Option[String]] = column[Option[String]]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column DEBTOR_PORTION_POSITION SqlType(NUMBER) */
    val debtorPortionPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEBTOR_PORTION_POSITION")
    /** Database column MINIMAL_COMN_INVOICED SqlType(CHAR) */
    val minimalComnInvoiced: Rep[Option[Char]] = column[Option[Char]]("MINIMAL_COMN_INVOICED")
    /** Database column INVOICE_ID SqlType(VARCHAR2), Length(14,true) */
    val invoiceId: Rep[Option[String]] = column[Option[String]]("INVOICE_ID", O.Length(14,varying=true))
    /** Database column FILE_NUMBER SqlType(VARCHAR2), Length(20,true) */
    val fileNumber: Rep[Option[String]] = column[Option[String]]("FILE_NUMBER", O.Length(20,varying=true))
    /** Database column INVOICE_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val invoiceOrgId: Rep[Option[String]] = column[Option[String]]("INVOICE_ORG_ID", O.Length(10,varying=true))
    /** Database column INVOICE_ARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val invoiceAreCode: Rep[Option[String]] = column[Option[String]]("INVOICE_ARE_CODE", O.Length(4,varying=true))
    /** Database column INVOICE_GROUP_ASSOC SqlType(CHAR) */
    val invoiceGroupAssoc: Rep[Option[Char]] = column[Option[Char]]("INVOICE_GROUP_ASSOC")
    /** Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("ORDER_NUMBER", O.Length(35,varying=true))
    /** Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
    val orderItem: Rep[Option[String]] = column[Option[String]]("ORDER_ITEM", O.Length(6,varying=true))
    /** Database column COUNTRY_OF_PARTNER SqlType(CHAR), Length(3,false) */
    val countryOfPartner: Rep[Option[String]] = column[Option[String]]("COUNTRY_OF_PARTNER", O.Length(3,varying=false))
    /** Database column ACCOUNTING_PURPOSE SqlType(CHAR) */
    val accountingPurpose: Rep[Option[Char]] = column[Option[Char]]("ACCOUNTING_PURPOSE")
    /** Database column APP_NAME SqlType(VARCHAR2), Length(82,true) */
    val appName: Rep[Option[String]] = column[Option[String]]("APP_NAME", O.Length(82,varying=true))
    /** Database column APP_PHONE SqlType(VARCHAR2), Length(32,true) */
    val appPhone: Rep[Option[String]] = column[Option[String]]("APP_PHONE", O.Length(32,varying=true))
    /** Database column VALUE_DATE SqlType(DATE) */
    val valueDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("VALUE_DATE")
    /** Database column GUARANTOR_TYPE SqlType(CHAR) */
    val guarantorType: Rep[Option[Char]] = column[Option[Char]]("GUARANTOR_TYPE")
    /** Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true) */
    val commissionReceiver: Rep[Option[String]] = column[Option[String]]("COMMISSION_RECEIVER", O.Length(5,varying=true))
    /** Database column INVOICE_ARE_NAME SqlType(VARCHAR2), Length(160,true) */
    val invoiceAreName: Rep[Option[String]] = column[Option[String]]("INVOICE_ARE_NAME", O.Length(160,varying=true))
    /** Database column BARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val bareCode: Rep[Option[String]] = column[Option[String]]("BARE_CODE", O.Length(4,varying=true))
    /** Database column MINIMAL_FEE_INVOICED SqlType(CHAR) */
    val minimalFeeInvoiced: Rep[Option[Char]] = column[Option[Char]]("MINIMAL_FEE_INVOICED")
    /** Database column DIVISION_SHORT_NAME SqlType(VARCHAR2), Length(3,true) */
    val divisionShortName: Rep[Option[String]] = column[Option[String]]("DIVISION_SHORT_NAME", O.Length(3,varying=true))

    /** Foreign key referencing GreatInvoicePass (database name INEV_FK_INVOICE_PASS_KEY) */
    lazy val greatInvoicePassFk = foreignKey("INEV_FK_INVOICE_PASS_KEY", invoicePassKey :: HNil, GreatInvoicePass)(r => Rep.Some(r.invoicePassKey) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (fileIdValue,debtorPortionPosition) (database name INEV_CDX0) */
    val index1 = index("INEV_CDX0", fileIdValue :: debtorPortionPosition :: HNil)
    /** Index over (fileIdValue) (database name INEV_IDX0) */
    val index2 = index("INEV_IDX0", fileIdValue :: HNil)
  }
  /** Collection-like TableQuery object for table GreatInvoiceEvidence */
  lazy val GreatInvoiceEvidence = new TableQuery(tag => new GreatInvoiceEvidence(tag))

  /** Row type of table GreatInvoiceEvidencePos */
  type GreatInvoiceEvidencePosRow = HCons[String,HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[java.sql.Timestamp],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatInvoiceEvidencePosRow providing default values if available in the database schema. */
  def GreatInvoiceEvidencePosRow(idValue: String, parentIdValue: Option[String], fxRate: Option[scala.math.BigDecimal], guaranteedAmountAmount: Option[scala.math.BigDecimal], guaranteedAmountCurrency: Option[String], invoicedAmountAmount: Option[scala.math.BigDecimal], invoicedAmountCurrency: Option[String], beginDate: Option[java.sql.Timestamp], endDate: Option[java.sql.Timestamp], avalCommissionNumberOfDays: Option[scala.math.BigDecimal], posComment: Option[String], avalCommissionPortion: Option[scala.math.BigDecimal], guarantorType: Option[Char], bankName: Option[String], bankReference: Option[String], beneficiaryCountry: Option[String], beneficiaryName: Option[String], paymentType: Option[Char], fxRateDate: Option[java.sql.Timestamp], calculatedAmountAmount: Option[scala.math.BigDecimal], calculatedAmountCurrency: Option[String], guaranteeVersion: Option[scala.math.BigDecimal], internalBankCode: Option[String], calculatedAmountInInvCur: Option[scala.math.BigDecimal], invoiceFxRate: Option[scala.math.BigDecimal], invoiceFxRateDate: Option[java.sql.Timestamp], insuranceNumber: Option[String]): GreatInvoiceEvidencePosRow = {
    idValue :: parentIdValue :: fxRate :: guaranteedAmountAmount :: guaranteedAmountCurrency :: invoicedAmountAmount :: invoicedAmountCurrency :: beginDate :: endDate :: avalCommissionNumberOfDays :: posComment :: avalCommissionPortion :: guarantorType :: bankName :: bankReference :: beneficiaryCountry :: beneficiaryName :: paymentType :: fxRateDate :: calculatedAmountAmount :: calculatedAmountCurrency :: guaranteeVersion :: internalBankCode :: calculatedAmountInInvCur :: invoiceFxRate :: invoiceFxRateDate :: insuranceNumber :: HNil
  }
  /** GetResult implicit for fetching GreatInvoiceEvidencePosRow objects using plain SQL queries */
  implicit def GetResultGreatInvoiceEvidencePosRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatInvoiceEvidencePosRow] = GR{
    prs => import prs._
    <<[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_INVOICE_EVIDENCE_POS. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoiceEvidencePos(_tableTag: Tag) extends profile.api.Table[GreatInvoiceEvidencePosRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE_EVIDENCE_POS") {
    def * = idValue :: parentIdValue :: fxRate :: guaranteedAmountAmount :: guaranteedAmountCurrency :: invoicedAmountAmount :: invoicedAmountCurrency :: beginDate :: endDate :: avalCommissionNumberOfDays :: posComment :: avalCommissionPortion :: guarantorType :: bankName :: bankReference :: beneficiaryCountry :: beneficiaryName :: paymentType :: fxRateDate :: calculatedAmountAmount :: calculatedAmountCurrency :: guaranteeVersion :: internalBankCode :: calculatedAmountInInvCur :: invoiceFxRate :: invoiceFxRateDate :: insuranceNumber :: HNil

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column PARENT_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val parentIdValue: Rep[Option[String]] = column[Option[String]]("PARENT_ID_VALUE", O.Length(10,varying=true))
    /** Database column FX_RATE SqlType(NUMBER) */
    val fxRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FX_RATE")
    /** Database column GUARANTEED_AMOUNT_AMOUNT SqlType(NUMBER) */
    val guaranteedAmountAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GUARANTEED_AMOUNT_AMOUNT")
    /** Database column GUARANTEED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val guaranteedAmountCurrency: Rep[Option[String]] = column[Option[String]]("GUARANTEED_AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column INVOICED_AMOUNT_AMOUNT SqlType(NUMBER) */
    val invoicedAmountAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("INVOICED_AMOUNT_AMOUNT")
    /** Database column INVOICED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val invoicedAmountCurrency: Rep[Option[String]] = column[Option[String]]("INVOICED_AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column BEGIN_DATE SqlType(DATE) */
    val beginDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("BEGIN_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("END_DATE")
    /** Database column AVAL_COMMISSION_NUMBER_OF_DAYS SqlType(NUMBER) */
    val avalCommissionNumberOfDays: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AVAL_COMMISSION_NUMBER_OF_DAYS")
    /** Database column POS_COMMENT SqlType(VARCHAR2), Length(1024,true) */
    val posComment: Rep[Option[String]] = column[Option[String]]("POS_COMMENT", O.Length(1024,varying=true))
    /** Database column AVAL_COMMISSION_PORTION SqlType(NUMBER) */
    val avalCommissionPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AVAL_COMMISSION_PORTION")
    /** Database column GUARANTOR_TYPE SqlType(CHAR) */
    val guarantorType: Rep[Option[Char]] = column[Option[Char]]("GUARANTOR_TYPE")
    /** Database column BANK_NAME SqlType(VARCHAR2), Length(52,true) */
    val bankName: Rep[Option[String]] = column[Option[String]]("BANK_NAME", O.Length(52,varying=true))
    /** Database column BANK_REFERENCE SqlType(VARCHAR2), Length(168,true) */
    val bankReference: Rep[Option[String]] = column[Option[String]]("BANK_REFERENCE", O.Length(168,varying=true))
    /** Database column BENEFICIARY_COUNTRY SqlType(CHAR), Length(3,false) */
    val beneficiaryCountry: Rep[Option[String]] = column[Option[String]]("BENEFICIARY_COUNTRY", O.Length(3,varying=false))
    /** Database column BENEFICIARY_NAME SqlType(VARCHAR2), Length(82,true) */
    val beneficiaryName: Rep[Option[String]] = column[Option[String]]("BENEFICIARY_NAME", O.Length(82,varying=true))
    /** Database column PAYMENT_TYPE SqlType(CHAR) */
    val paymentType: Rep[Option[Char]] = column[Option[Char]]("PAYMENT_TYPE")
    /** Database column FX_RATE_DATE SqlType(DATE) */
    val fxRateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FX_RATE_DATE")
    /** Database column CALCULATED_AMOUNT_AMOUNT SqlType(NUMBER) */
    val calculatedAmountAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CALCULATED_AMOUNT_AMOUNT")
    /** Database column CALCULATED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val calculatedAmountCurrency: Rep[Option[String]] = column[Option[String]]("CALCULATED_AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column GUARANTEE_VERSION SqlType(NUMBER) */
    val guaranteeVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("GUARANTEE_VERSION")
    /** Database column INTERNAL_BANK_CODE SqlType(VARCHAR2), Length(4,true) */
    val internalBankCode: Rep[Option[String]] = column[Option[String]]("INTERNAL_BANK_CODE", O.Length(4,varying=true))
    /** Database column CALCULATED_AMOUNT_IN_INV_CUR SqlType(NUMBER) */
    val calculatedAmountInInvCur: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CALCULATED_AMOUNT_IN_INV_CUR")
    /** Database column INVOICE_FX_RATE SqlType(NUMBER) */
    val invoiceFxRate: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("INVOICE_FX_RATE")
    /** Database column INVOICE_FX_RATE_DATE SqlType(DATE) */
    val invoiceFxRateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INVOICE_FX_RATE_DATE")
    /** Database column INSURANCE_NUMBER SqlType(VARCHAR2), Length(4,true) */
    val insuranceNumber: Rep[Option[String]] = column[Option[String]]("INSURANCE_NUMBER", O.Length(4,varying=true))

    /** Foreign key referencing GreatInvoiceEvidence (database name INEVP_FK_PARENT_ID_VALUE) */
    lazy val greatInvoiceEvidenceFk = foreignKey("INEVP_FK_PARENT_ID_VALUE", parentIdValue :: HNil, GreatInvoiceEvidence)(r => Rep.Some(r.invoiceEvidenceKey) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatInvoiceEvidencePos */
  lazy val GreatInvoiceEvidencePos = new TableQuery(tag => new GreatInvoiceEvidencePos(tag))

  /** Entity class storing rows of table GreatInvoiceLineItem
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param invoiceIdc Database column INVOICE_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param periodOfPerformanceBegin Database column PERIOD_OF_PERFORMANCE_BEGIN SqlType(DATE)
   *  @param periodOfPerformanceEnd Database column PERIOD_OF_PERFORMANCE_END SqlType(DATE)
   *  @param positionNumber Database column POSITION_NUMBER SqlType(NUMBER)
   *  @param text Database column TEXT SqlType(VARCHAR2), Length(700,true)
   *  @param amount Database column AMOUNT SqlType(NUMBER)
   *  @param amountCur Database column AMOUNT_CUR SqlType(CHAR), Length(3,false)
   *  @param costType Database column COST_TYPE SqlType(VARCHAR2), Length(4,true)
   *  @param materialNumber Database column MATERIAL_NUMBER SqlType(VARCHAR2), Length(18,true)
   *  @param debtorPosition Database column DEBTOR_POSITION SqlType(NUMBER)
   *  @param orderItem Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
  case class GreatInvoiceLineItemRow(objectidc: String, invoiceIdc: Option[String], periodOfPerformanceBegin: Option[java.sql.Timestamp], periodOfPerformanceEnd: Option[java.sql.Timestamp], positionNumber: Option[scala.math.BigDecimal], text: Option[String], amount: Option[scala.math.BigDecimal], amountCur: Option[String], costType: Option[String], materialNumber: Option[String], debtorPosition: Option[scala.math.BigDecimal], orderItem: Option[String])
  /** GetResult implicit for fetching GreatInvoiceLineItemRow objects using plain SQL queries */
  implicit def GetResultGreatInvoiceLineItemRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[scala.math.BigDecimal]]): GR[GreatInvoiceLineItemRow] = GR{
    prs => import prs._
    GreatInvoiceLineItemRow.tupled((<<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_INVOICE_LINE_ITEM. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoiceLineItem(_tableTag: Tag) extends profile.api.Table[GreatInvoiceLineItemRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE_LINE_ITEM") {
    def * = (objectidc, invoiceIdc, periodOfPerformanceBegin, periodOfPerformanceEnd, positionNumber, text, amount, amountCur, costType, materialNumber, debtorPosition, orderItem) <> (GreatInvoiceLineItemRow.tupled, GreatInvoiceLineItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), invoiceIdc, periodOfPerformanceBegin, periodOfPerformanceEnd, positionNumber, text, amount, amountCur, costType, materialNumber, debtorPosition, orderItem).shaped.<>({r=>import r._; _1.map(_=> GreatInvoiceLineItemRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column INVOICE_IDC SqlType(VARCHAR2), Length(10,true) */
    val invoiceIdc: Rep[Option[String]] = column[Option[String]]("INVOICE_IDC", O.Length(10,varying=true))
    /** Database column PERIOD_OF_PERFORMANCE_BEGIN SqlType(DATE) */
    val periodOfPerformanceBegin: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERIOD_OF_PERFORMANCE_BEGIN")
    /** Database column PERIOD_OF_PERFORMANCE_END SqlType(DATE) */
    val periodOfPerformanceEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERIOD_OF_PERFORMANCE_END")
    /** Database column POSITION_NUMBER SqlType(NUMBER) */
    val positionNumber: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POSITION_NUMBER")
    /** Database column TEXT SqlType(VARCHAR2), Length(700,true) */
    val text: Rep[Option[String]] = column[Option[String]]("TEXT", O.Length(700,varying=true))
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column AMOUNT_CUR SqlType(CHAR), Length(3,false) */
    val amountCur: Rep[Option[String]] = column[Option[String]]("AMOUNT_CUR", O.Length(3,varying=false))
    /** Database column COST_TYPE SqlType(VARCHAR2), Length(4,true) */
    val costType: Rep[Option[String]] = column[Option[String]]("COST_TYPE", O.Length(4,varying=true))
    /** Database column MATERIAL_NUMBER SqlType(VARCHAR2), Length(18,true) */
    val materialNumber: Rep[Option[String]] = column[Option[String]]("MATERIAL_NUMBER", O.Length(18,varying=true))
    /** Database column DEBTOR_POSITION SqlType(NUMBER) */
    val debtorPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DEBTOR_POSITION")
    /** Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
    val orderItem: Rep[Option[String]] = column[Option[String]]("ORDER_ITEM", O.Length(6,varying=true))

    /** Foreign key referencing GreatCurrency (database name ILI_FK_AMOUNT_CUR) */
    lazy val greatCurrencyFk = foreignKey("ILI_FK_AMOUNT_CUR", amountCur, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatInvoice (database name ILI_FK_INVOICE_IDC) */
    lazy val greatInvoiceFk = foreignKey("ILI_FK_INVOICE_IDC", invoiceIdc, GreatInvoice)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatInvoiceLineItem */
  lazy val GreatInvoiceLineItem = new TableQuery(tag => new GreatInvoiceLineItem(tag))

  /** Entity class storing rows of table GreatInvoiceNumber
   *  @param bareGroupId Database column BARE_GROUP_ID SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param currentInvoiceNumber Database column CURRENT_INVOICE_NUMBER SqlType(NUMBER) */
  case class GreatInvoiceNumberRow(bareGroupId: String, currentInvoiceNumber: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatInvoiceNumberRow objects using plain SQL queries */
  implicit def GetResultGreatInvoiceNumberRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal]): GR[GreatInvoiceNumberRow] = GR{
    prs => import prs._
    GreatInvoiceNumberRow.tupled((<<[String], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_INVOICE_NUMBER. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoiceNumber(_tableTag: Tag) extends profile.api.Table[GreatInvoiceNumberRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE_NUMBER") {
    def * = (bareGroupId, currentInvoiceNumber) <> (GreatInvoiceNumberRow.tupled, GreatInvoiceNumberRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(bareGroupId), Rep.Some(currentInvoiceNumber)).shaped.<>({r=>import r._; _1.map(_=> GreatInvoiceNumberRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARE_GROUP_ID SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val bareGroupId: Rep[String] = column[String]("BARE_GROUP_ID", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column CURRENT_INVOICE_NUMBER SqlType(NUMBER) */
    val currentInvoiceNumber: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("CURRENT_INVOICE_NUMBER")

    /** Foreign key referencing GreatBareDependants (database name INVN_FK_BARE_GROUP_ID) */
    lazy val greatBareDependantsFk = foreignKey("INVN_FK_BARE_GROUP_ID", bareGroupId, GreatBareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatInvoiceNumber */
  lazy val GreatInvoiceNumber = new TableQuery(tag => new GreatInvoiceNumber(tag))

  /** Entity class storing rows of table GreatInvoicePass
   *  @param invoicePassKey Database column INVOICE_PASS_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param userLoginName Database column USER_LOGIN_NAME SqlType(VARCHAR2), Length(16,true)
   *  @param generationDate Database column GENERATION_DATE SqlType(DATE)
   *  @param invoiceDate Database column INVOICE_DATE SqlType(DATE)
   *  @param fiscalYear Database column FISCAL_YEAR SqlType(NUMBER)
   *  @param fiscalQuart Database column FISCAL_QUART SqlType(NUMBER)
   *  @param filePath Database column FILE_PATH SqlType(VARCHAR2), Length(4000,true)
   *  @param fileName Database column FILE_NAME SqlType(VARCHAR2), Length(50,true)
   *  @param invoicedAmountAmount Database column INVOICED_AMOUNT_AMOUNT SqlType(NUMBER)
   *  @param invoicedAmountCurrency Database column INVOICED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param status Database column STATUS SqlType(NUMBER)
   *  @param minAccAmount Database column MIN_ACC_AMOUNT SqlType(NUMBER)
   *  @param minAccCurrency Database column MIN_ACC_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param kind Database column KIND SqlType(CHAR)
   *  @param lastNum Database column LAST_NUM SqlType(NUMBER)
   *  @param bareGroup Database column BARE_GROUP SqlType(VARCHAR2), Length(4,true)
   *  @param bareGroupVersion Database column BARE_GROUP_VERSION SqlType(NUMBER)
   *  @param plannedRunTime Database column PLANNED_RUN_TIME SqlType(DATE)
   *  @param violationsString Database column VIOLATIONS_STRING SqlType(CLOB) */
  case class GreatInvoicePassRow(invoicePassKey: String, userLoginName: Option[String], generationDate: Option[java.sql.Timestamp], invoiceDate: Option[java.sql.Timestamp], fiscalYear: Option[scala.math.BigDecimal], fiscalQuart: Option[scala.math.BigDecimal], filePath: Option[String], fileName: Option[String], invoicedAmountAmount: Option[scala.math.BigDecimal], invoicedAmountCurrency: Option[String], status: Option[scala.math.BigDecimal], minAccAmount: Option[scala.math.BigDecimal], minAccCurrency: Option[String], kind: Option[Char], lastNum: Option[scala.math.BigDecimal], bareGroup: Option[String], bareGroupVersion: Option[scala.math.BigDecimal], plannedRunTime: Option[java.sql.Timestamp], violationsString: Option[java.sql.Clob])
  /** GetResult implicit for fetching GreatInvoicePassRow objects using plain SQL queries */
  implicit def GetResultGreatInvoicePassRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[Char]], e5: GR[Option[java.sql.Clob]]): GR[GreatInvoicePassRow] = GR{
    prs => import prs._
    GreatInvoicePassRow.tupled((<<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_INVOICE_PASS. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvoicePass(_tableTag: Tag) extends profile.api.Table[GreatInvoicePassRow](_tableTag, Some("WERNER2"), "GREAT_INVOICE_PASS") {
    def * = (invoicePassKey, userLoginName, generationDate, invoiceDate, fiscalYear, fiscalQuart, filePath, fileName, invoicedAmountAmount, invoicedAmountCurrency, status, minAccAmount, minAccCurrency, kind, lastNum, bareGroup, bareGroupVersion, plannedRunTime, violationsString) <> (GreatInvoicePassRow.tupled, GreatInvoicePassRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(invoicePassKey), userLoginName, generationDate, invoiceDate, fiscalYear, fiscalQuart, filePath, fileName, invoicedAmountAmount, invoicedAmountCurrency, status, minAccAmount, minAccCurrency, kind, lastNum, bareGroup, bareGroupVersion, plannedRunTime, violationsString).shaped.<>({r=>import r._; _1.map(_=> GreatInvoicePassRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column INVOICE_PASS_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val invoicePassKey: Rep[String] = column[String]("INVOICE_PASS_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column USER_LOGIN_NAME SqlType(VARCHAR2), Length(16,true) */
    val userLoginName: Rep[Option[String]] = column[Option[String]]("USER_LOGIN_NAME", O.Length(16,varying=true))
    /** Database column GENERATION_DATE SqlType(DATE) */
    val generationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("GENERATION_DATE")
    /** Database column INVOICE_DATE SqlType(DATE) */
    val invoiceDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INVOICE_DATE")
    /** Database column FISCAL_YEAR SqlType(NUMBER) */
    val fiscalYear: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FISCAL_YEAR")
    /** Database column FISCAL_QUART SqlType(NUMBER) */
    val fiscalQuart: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FISCAL_QUART")
    /** Database column FILE_PATH SqlType(VARCHAR2), Length(4000,true) */
    val filePath: Rep[Option[String]] = column[Option[String]]("FILE_PATH", O.Length(4000,varying=true))
    /** Database column FILE_NAME SqlType(VARCHAR2), Length(50,true) */
    val fileName: Rep[Option[String]] = column[Option[String]]("FILE_NAME", O.Length(50,varying=true))
    /** Database column INVOICED_AMOUNT_AMOUNT SqlType(NUMBER) */
    val invoicedAmountAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("INVOICED_AMOUNT_AMOUNT")
    /** Database column INVOICED_AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val invoicedAmountCurrency: Rep[Option[String]] = column[Option[String]]("INVOICED_AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column STATUS SqlType(NUMBER) */
    val status: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("STATUS")
    /** Database column MIN_ACC_AMOUNT SqlType(NUMBER) */
    val minAccAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_ACC_AMOUNT")
    /** Database column MIN_ACC_CURRENCY SqlType(CHAR), Length(3,false) */
    val minAccCurrency: Rep[Option[String]] = column[Option[String]]("MIN_ACC_CURRENCY", O.Length(3,varying=false))
    /** Database column KIND SqlType(CHAR) */
    val kind: Rep[Option[Char]] = column[Option[Char]]("KIND")
    /** Database column LAST_NUM SqlType(NUMBER) */
    val lastNum: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("LAST_NUM")
    /** Database column BARE_GROUP SqlType(VARCHAR2), Length(4,true) */
    val bareGroup: Rep[Option[String]] = column[Option[String]]("BARE_GROUP", O.Length(4,varying=true))
    /** Database column BARE_GROUP_VERSION SqlType(NUMBER) */
    val bareGroupVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BARE_GROUP_VERSION")
    /** Database column PLANNED_RUN_TIME SqlType(DATE) */
    val plannedRunTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PLANNED_RUN_TIME")
    /** Database column VIOLATIONS_STRING SqlType(CLOB) */
    val violationsString: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("VIOLATIONS_STRING")

    /** Foreign key referencing GreatBareDependants (database name INVP_FK_BARE_GROUP) */
    lazy val greatBareDependantsFk = foreignKey("INVP_FK_BARE_GROUP", bareGroup, GreatBareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name INVP_FK_INVOICED_AMOUNT_CURR0) */
    lazy val greatCurrencyFk = foreignKey("INVP_FK_INVOICED_AMOUNT_CURR0", invoicedAmountCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (kind,fiscalYear) (database name INVP_CDX0) */
    val index1 = index("INVP_CDX0", (kind, fiscalYear))
    /** Index over (status) (database name INVP_IDX0) */
    val index2 = index("INVP_IDX0", status)
  }
  /** Collection-like TableQuery object for table GreatInvoicePass */
  lazy val GreatInvoicePass = new TableQuery(tag => new GreatInvoicePass(tag))

  /** Entity class storing rows of table GreatInvPassCalendar
   *  @param bareCode Database column BARE_CODE SqlType(VARCHAR2), Length(4,true)
   *  @param invPassKind Database column INV_PASS_KIND SqlType(VARCHAR2)
   *  @param day Database column DAY SqlType(NUMBER)
   *  @param month Database column MONTH SqlType(NUMBER) */
  case class GreatInvPassCalendarRow(bareCode: String, invPassKind: Char, day: scala.math.BigDecimal, month: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatInvPassCalendarRow objects using plain SQL queries */
  implicit def GetResultGreatInvPassCalendarRow(implicit e0: GR[String], e1: GR[Char], e2: GR[scala.math.BigDecimal]): GR[GreatInvPassCalendarRow] = GR{
    prs => import prs._
    GreatInvPassCalendarRow.tupled((<<[String], <<[Char], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_INV_PASS_CALENDAR. Objects of this class serve as prototypes for rows in queries. */
  class GreatInvPassCalendar(_tableTag: Tag) extends profile.api.Table[GreatInvPassCalendarRow](_tableTag, Some("WERNER2"), "GREAT_INV_PASS_CALENDAR") {
    def * = (bareCode, invPassKind, day, month) <> (GreatInvPassCalendarRow.tupled, GreatInvPassCalendarRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(bareCode), Rep.Some(invPassKind), Rep.Some(day), Rep.Some(month)).shaped.<>({r=>import r._; _1.map(_=> GreatInvPassCalendarRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column BARE_CODE SqlType(VARCHAR2), Length(4,true) */
    val bareCode: Rep[String] = column[String]("BARE_CODE", O.Length(4,varying=true))
    /** Database column INV_PASS_KIND SqlType(VARCHAR2) */
    val invPassKind: Rep[Char] = column[Char]("INV_PASS_KIND")
    /** Database column DAY SqlType(NUMBER) */
    val day: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("DAY")
    /** Database column MONTH SqlType(NUMBER) */
    val month: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("MONTH")

    /** Primary key of GreatInvPassCalendar (database name GIPC_PK_BARE_CODE) */
    val pk = primaryKey("GIPC_PK_BARE_CODE", (bareCode, invPassKind, day, month))
  }
  /** Collection-like TableQuery object for table GreatInvPassCalendar */
  lazy val GreatInvPassCalendar = new TableQuery(tag => new GreatInvPassCalendar(tag))

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

  /** Entity class storing rows of table GreatMessageAttachment
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param messageInfoId Database column MESSAGE_INFO_ID SqlType(VARCHAR2), Length(10,true)
   *  @param content Database column CONTENT SqlType(BLOB) */
  case class GreatMessageAttachmentRow(idValue: String, messageInfoId: Option[String], content: Option[java.sql.Blob])
  /** GetResult implicit for fetching GreatMessageAttachmentRow objects using plain SQL queries */
  implicit def GetResultGreatMessageAttachmentRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Blob]]): GR[GreatMessageAttachmentRow] = GR{
    prs => import prs._
    GreatMessageAttachmentRow.tupled((<<[String], <<?[String], <<?[java.sql.Blob]))
  }
  /** Table description of table GREAT_MESSAGE_ATTACHMENT. Objects of this class serve as prototypes for rows in queries. */
  class GreatMessageAttachment(_tableTag: Tag) extends profile.api.Table[GreatMessageAttachmentRow](_tableTag, Some("WERNER2"), "GREAT_MESSAGE_ATTACHMENT") {
    def * = (idValue, messageInfoId, content) <> (GreatMessageAttachmentRow.tupled, GreatMessageAttachmentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), messageInfoId, content).shaped.<>({r=>import r._; _1.map(_=> GreatMessageAttachmentRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column MESSAGE_INFO_ID SqlType(VARCHAR2), Length(10,true) */
    val messageInfoId: Rep[Option[String]] = column[Option[String]]("MESSAGE_INFO_ID", O.Length(10,varying=true))
    /** Database column CONTENT SqlType(BLOB) */
    val content: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("CONTENT")

    /** Foreign key referencing GreatMessageInfo (database name MSAT_FK_MESSAGE_INFO_ID) */
    lazy val greatMessageInfoFk = foreignKey("MSAT_FK_MESSAGE_INFO_ID", messageInfoId, GreatMessageInfo)(r => Rep.Some(r.idValue), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatMessageAttachment */
  lazy val GreatMessageAttachment = new TableQuery(tag => new GreatMessageAttachment(tag))

  /** Entity class storing rows of table GreatMessageEvent
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param status Database column STATUS SqlType(VARCHAR2)
   *  @param messageInfoId Database column MESSAGE_INFO_ID SqlType(VARCHAR2), Length(10,true)
   *  @param kind Database column KIND SqlType(VARCHAR2)
   *  @param deletable Database column DELETABLE SqlType(CHAR)
   *  @param recipientId Database column RECIPIENT_ID SqlType(VARCHAR2), Length(10,true)
   *  @param recipientEmail Database column RECIPIENT_EMAIL SqlType(VARCHAR2), Length(100,true)
   *  @param role Database column ROLE SqlType(VARCHAR2), Length(31,true)
   *  @param divisionId Database column DIVISION_ID SqlType(VARCHAR2), Length(10,true)
   *  @param userGroupId Database column USER_GROUP_ID SqlType(VARCHAR2), Length(10,true)
   *  @param referencedMessageId Database column REFERENCED_MESSAGE_ID SqlType(VARCHAR2), Length(10,true)
   *  @param creationTime Database column CREATION_TIME SqlType(TIMESTAMP(6))
   *  @param activityTime Database column ACTIVITY_TIME SqlType(TIMESTAMP(6))
   *  @param expirationTime Database column EXPIRATION_TIME SqlType(TIMESTAMP(6))
   *  @param messageboxType Database column MESSAGEBOX_TYPE SqlType(VARCHAR2)
   *  @param senderUserId Database column SENDER_USER_ID SqlType(VARCHAR2), Length(10,true)
   *  @param senderProcessType Database column SENDER_PROCESS_TYPE SqlType(VARCHAR2)
   *  @param category Database column CATEGORY SqlType(VARCHAR2)
   *  @param senderProcessId Database column SENDER_PROCESS_ID SqlType(VARCHAR2), Length(10,true) */
  case class GreatMessageEventRow(idValue: String, status: Option[Char], messageInfoId: Option[String], kind: Option[Char], deletable: Option[Char], recipientId: Option[String], recipientEmail: Option[String], role: Option[String], divisionId: Option[String], userGroupId: Option[String], referencedMessageId: Option[String], creationTime: Option[java.sql.Timestamp], activityTime: Option[java.sql.Timestamp], expirationTime: Option[java.sql.Timestamp], messageboxType: Option[Char], senderUserId: Option[String], senderProcessType: Option[Char], category: Option[Char], senderProcessId: Option[String])
  /** GetResult implicit for fetching GreatMessageEventRow objects using plain SQL queries */
  implicit def GetResultGreatMessageEventRow(implicit e0: GR[String], e1: GR[Option[Char]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[GreatMessageEventRow] = GR{
    prs => import prs._
    GreatMessageEventRow.tupled((<<[String], <<?[Char], <<?[String], <<?[Char], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char], <<?[String], <<?[Char], <<?[Char], <<?[String]))
  }
  /** Table description of table GREAT_MESSAGE_EVENT. Objects of this class serve as prototypes for rows in queries. */
  class GreatMessageEvent(_tableTag: Tag) extends profile.api.Table[GreatMessageEventRow](_tableTag, Some("WERNER2"), "GREAT_MESSAGE_EVENT") {
    def * = (idValue, status, messageInfoId, kind, deletable, recipientId, recipientEmail, role, divisionId, userGroupId, referencedMessageId, creationTime, activityTime, expirationTime, messageboxType, senderUserId, senderProcessType, category, senderProcessId) <> (GreatMessageEventRow.tupled, GreatMessageEventRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), status, messageInfoId, kind, deletable, recipientId, recipientEmail, role, divisionId, userGroupId, referencedMessageId, creationTime, activityTime, expirationTime, messageboxType, senderUserId, senderProcessType, category, senderProcessId).shaped.<>({r=>import r._; _1.map(_=> GreatMessageEventRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column STATUS SqlType(VARCHAR2) */
    val status: Rep[Option[Char]] = column[Option[Char]]("STATUS")
    /** Database column MESSAGE_INFO_ID SqlType(VARCHAR2), Length(10,true) */
    val messageInfoId: Rep[Option[String]] = column[Option[String]]("MESSAGE_INFO_ID", O.Length(10,varying=true))
    /** Database column KIND SqlType(VARCHAR2) */
    val kind: Rep[Option[Char]] = column[Option[Char]]("KIND")
    /** Database column DELETABLE SqlType(CHAR) */
    val deletable: Rep[Option[Char]] = column[Option[Char]]("DELETABLE")
    /** Database column RECIPIENT_ID SqlType(VARCHAR2), Length(10,true) */
    val recipientId: Rep[Option[String]] = column[Option[String]]("RECIPIENT_ID", O.Length(10,varying=true))
    /** Database column RECIPIENT_EMAIL SqlType(VARCHAR2), Length(100,true) */
    val recipientEmail: Rep[Option[String]] = column[Option[String]]("RECIPIENT_EMAIL", O.Length(100,varying=true))
    /** Database column ROLE SqlType(VARCHAR2), Length(31,true) */
    val role: Rep[Option[String]] = column[Option[String]]("ROLE", O.Length(31,varying=true))
    /** Database column DIVISION_ID SqlType(VARCHAR2), Length(10,true) */
    val divisionId: Rep[Option[String]] = column[Option[String]]("DIVISION_ID", O.Length(10,varying=true))
    /** Database column USER_GROUP_ID SqlType(VARCHAR2), Length(10,true) */
    val userGroupId: Rep[Option[String]] = column[Option[String]]("USER_GROUP_ID", O.Length(10,varying=true))
    /** Database column REFERENCED_MESSAGE_ID SqlType(VARCHAR2), Length(10,true) */
    val referencedMessageId: Rep[Option[String]] = column[Option[String]]("REFERENCED_MESSAGE_ID", O.Length(10,varying=true))
    /** Database column CREATION_TIME SqlType(TIMESTAMP(6)) */
    val creationTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CREATION_TIME")
    /** Database column ACTIVITY_TIME SqlType(TIMESTAMP(6)) */
    val activityTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ACTIVITY_TIME")
    /** Database column EXPIRATION_TIME SqlType(TIMESTAMP(6)) */
    val expirationTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXPIRATION_TIME")
    /** Database column MESSAGEBOX_TYPE SqlType(VARCHAR2) */
    val messageboxType: Rep[Option[Char]] = column[Option[Char]]("MESSAGEBOX_TYPE")
    /** Database column SENDER_USER_ID SqlType(VARCHAR2), Length(10,true) */
    val senderUserId: Rep[Option[String]] = column[Option[String]]("SENDER_USER_ID", O.Length(10,varying=true))
    /** Database column SENDER_PROCESS_TYPE SqlType(VARCHAR2) */
    val senderProcessType: Rep[Option[Char]] = column[Option[Char]]("SENDER_PROCESS_TYPE")
    /** Database column CATEGORY SqlType(VARCHAR2) */
    val category: Rep[Option[Char]] = column[Option[Char]]("CATEGORY")
    /** Database column SENDER_PROCESS_ID SqlType(VARCHAR2), Length(10,true) */
    val senderProcessId: Rep[Option[String]] = column[Option[String]]("SENDER_PROCESS_ID", O.Length(10,varying=true))

    /** Foreign key referencing GreatDivision (database name MSEV_FK_DIVISION_ID) */
    lazy val greatDivisionFk = foreignKey("MSEV_FK_DIVISION_ID", divisionId, GreatDivision)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name MSEV_FK_RECIPIENT_ID) */
    lazy val greatDivisionUserFk2 = foreignKey("MSEV_FK_RECIPIENT_ID", recipientId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatDivisionUser (database name MSEV_FK_SENDER_USER_ID) */
    lazy val greatDivisionUserFk3 = foreignKey("MSEV_FK_SENDER_USER_ID", senderUserId, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatMessageEvent (database name MSEV_FK_REFERENCED_MESSAGE_ID) */
    lazy val greatMessageEventFk = foreignKey("MSEV_FK_REFERENCED_MESSAGE_ID", referencedMessageId, GreatMessageEvent)(r => Rep.Some(r.idValue), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatMessageInfo (database name MSEV_FK_MESSAGE_INFO_ID) */
    lazy val greatMessageInfoFk = foreignKey("MSEV_FK_MESSAGE_INFO_ID", messageInfoId, GreatMessageInfo)(r => Rep.Some(r.idValue), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatUserGroup (database name MSEV_FK_USER_GROUP_ID) */
    lazy val greatUserGroupFk = foreignKey("MSEV_FK_USER_GROUP_ID", userGroupId, GreatUserGroup)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (messageboxType,kind,recipientId,creationTime) (database name MSEV_CDX0) */
    val index1 = index("MSEV_CDX0", (messageboxType, kind, recipientId, creationTime))
    /** Index over (messageboxType,kind,divisionId,role,creationTime) (database name MSEV_CDX1) */
    val index2 = index("MSEV_CDX1", (messageboxType, kind, divisionId, role, creationTime))
    /** Index over (messageboxType,kind,userGroupId,role,creationTime) (database name MSEV_CDX2) */
    val index3 = index("MSEV_CDX2", (messageboxType, kind, userGroupId, role, creationTime))
    /** Index over (messageboxType,senderProcessType,role,creationTime) (database name MSEV_CDX3) */
    val index4 = index("MSEV_CDX3", (messageboxType, senderProcessType, role, creationTime))
    /** Index over (messageboxType,senderUserId,status,creationTime) (database name MSEV_CDX4) */
    val index5 = index("MSEV_CDX4", (messageboxType, senderUserId, status, creationTime))
    /** Index over (messageboxType,status,role,divisionId) (database name MSEV_CDX5) */
    val index6 = index("MSEV_CDX5", (messageboxType, status, role, divisionId))
    /** Index over (messageboxType,status,role,userGroupId) (database name MSEV_CDX6) */
    val index7 = index("MSEV_CDX6", (messageboxType, status, role, userGroupId))
    /** Index over (messageboxType,status,senderProcessType,role,expirationTime) (database name MSEV_CDX7) */
    val index8 = index("MSEV_CDX7", (messageboxType, status, senderProcessType, role, expirationTime))
    /** Index over (messageboxType,senderProcessId,kind,recipientId,status) (database name MSEV_CDX8) */
    val index9 = index("MSEV_CDX8", (messageboxType, senderProcessId, kind, recipientId, status))
    /** Index over (expirationTime) (database name MSEV_IDX10) */
    val index10 = index("MSEV_IDX10", expirationTime)
    /** Index over (messageboxType) (database name MSEV_IDX11) */
    val index11 = index("MSEV_IDX11", messageboxType)
    /** Index over (senderProcessType) (database name MSEV_IDX13) */
    val index12 = index("MSEV_IDX13", senderProcessType)
    /** Index over (category) (database name MSEV_IDX14) */
    val index13 = index("MSEV_IDX14", category)
    /** Index over (senderProcessId) (database name MSEV_IDX15) */
    val index14 = index("MSEV_IDX15", senderProcessId)
    /** Index over (role) (database name MSEV_IDX5) */
    val index15 = index("MSEV_IDX5", role)
    /** Index over (kind) (database name MSEV_IDX6) */
    val index16 = index("MSEV_IDX6", kind)
    /** Index over (status) (database name MSEV_IDX7) */
    val index17 = index("MSEV_IDX7", status)
    /** Index over (creationTime) (database name MSEV_IDX8) */
    val index18 = index("MSEV_IDX8", creationTime)
    /** Index over (activityTime) (database name MSEV_IDX9) */
    val index19 = index("MSEV_IDX9", activityTime)
  }
  /** Collection-like TableQuery object for table GreatMessageEvent */
  lazy val GreatMessageEvent = new TableQuery(tag => new GreatMessageEvent(tag))

  /** Entity class storing rows of table GreatMessageInfo
   *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param subject Database column SUBJECT SqlType(CLOB)
   *  @param content Database column CONTENT SqlType(CLOB)
   *  @param parameter Database column PARAMETER SqlType(VARCHAR2), Length(3000,true)
   *  @param hasAttachment Database column HAS_ATTACHMENT SqlType(CHAR) */
  case class GreatMessageInfoRow(idValue: String, subject: Option[java.sql.Clob], content: Option[java.sql.Clob], parameter: Option[String], hasAttachment: Option[Char])
  /** GetResult implicit for fetching GreatMessageInfoRow objects using plain SQL queries */
  implicit def GetResultGreatMessageInfoRow(implicit e0: GR[String], e1: GR[Option[java.sql.Clob]], e2: GR[Option[String]], e3: GR[Option[Char]]): GR[GreatMessageInfoRow] = GR{
    prs => import prs._
    GreatMessageInfoRow.tupled((<<[String], <<?[java.sql.Clob], <<?[java.sql.Clob], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_MESSAGE_INFO. Objects of this class serve as prototypes for rows in queries. */
  class GreatMessageInfo(_tableTag: Tag) extends profile.api.Table[GreatMessageInfoRow](_tableTag, Some("WERNER2"), "GREAT_MESSAGE_INFO") {
    def * = (idValue, subject, content, parameter, hasAttachment) <> (GreatMessageInfoRow.tupled, GreatMessageInfoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), subject, content, parameter, hasAttachment).shaped.<>({r=>import r._; _1.map(_=> GreatMessageInfoRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val idValue: Rep[String] = column[String]("ID_VALUE", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column SUBJECT SqlType(CLOB) */
    val subject: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("SUBJECT")
    /** Database column CONTENT SqlType(CLOB) */
    val content: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("CONTENT")
    /** Database column PARAMETER SqlType(VARCHAR2), Length(3000,true) */
    val parameter: Rep[Option[String]] = column[Option[String]]("PARAMETER", O.Length(3000,varying=true))
    /** Database column HAS_ATTACHMENT SqlType(CHAR) */
    val hasAttachment: Rep[Option[Char]] = column[Option[Char]]("HAS_ATTACHMENT")

    /** Index over (parameter) (database name MSIN_IDX0) */
    val index1 = index("MSIN_IDX0", parameter)
  }
  /** Collection-like TableQuery object for table GreatMessageInfo */
  lazy val GreatMessageInfo = new TableQuery(tag => new GreatMessageInfo(tag))

  /** Entity class storing rows of table GreatOpenftParameter
   *  @param isProductionEnviroment Database column IS_PRODUCTION_ENVIROMENT SqlType(CHAR)
   *  @param bare Database column BARE SqlType(VARCHAR2), Length(10,true)
   *  @param destinationHost Database column DESTINATION_HOST SqlType(VARCHAR2), Length(50,true)
   *  @param ftacProfil Database column FTAC_PROFIL SqlType(VARCHAR2), Length(50,true) */
  case class GreatOpenftParameterRow(isProductionEnviroment: Option[Char], bare: String, destinationHost: String, ftacProfil: String)
  /** GetResult implicit for fetching GreatOpenftParameterRow objects using plain SQL queries */
  implicit def GetResultGreatOpenftParameterRow(implicit e0: GR[Option[Char]], e1: GR[String]): GR[GreatOpenftParameterRow] = GR{
    prs => import prs._
    GreatOpenftParameterRow.tupled((<<?[Char], <<[String], <<[String], <<[String]))
  }
  /** Table description of table GREAT_OPENFT_PARAMETER. Objects of this class serve as prototypes for rows in queries. */
  class GreatOpenftParameter(_tableTag: Tag) extends profile.api.Table[GreatOpenftParameterRow](_tableTag, Some("WERNER2"), "GREAT_OPENFT_PARAMETER") {
    def * = (isProductionEnviroment, bare, destinationHost, ftacProfil) <> (GreatOpenftParameterRow.tupled, GreatOpenftParameterRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (isProductionEnviroment, Rep.Some(bare), Rep.Some(destinationHost), Rep.Some(ftacProfil)).shaped.<>({r=>import r._; _2.map(_=> GreatOpenftParameterRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column IS_PRODUCTION_ENVIROMENT SqlType(CHAR) */
    val isProductionEnviroment: Rep[Option[Char]] = column[Option[Char]]("IS_PRODUCTION_ENVIROMENT")
    /** Database column BARE SqlType(VARCHAR2), Length(10,true) */
    val bare: Rep[String] = column[String]("BARE", O.Length(10,varying=true))
    /** Database column DESTINATION_HOST SqlType(VARCHAR2), Length(50,true) */
    val destinationHost: Rep[String] = column[String]("DESTINATION_HOST", O.Length(50,varying=true))
    /** Database column FTAC_PROFIL SqlType(VARCHAR2), Length(50,true) */
    val ftacProfil: Rep[String] = column[String]("FTAC_PROFIL", O.Length(50,varying=true))

    /** Primary key of GreatOpenftParameter (database name OFP_PK_BARE) */
    val pk = primaryKey("OFP_PK_BARE", (bare, destinationHost, ftacProfil))

    /** Foreign key referencing GreatBareDependants (database name OFP_FK_BARE) */
    lazy val greatBareDependantsFk = foreignKey("OFP_FK_BARE", bare, GreatBareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatOpenftParameter */
  lazy val GreatOpenftParameter = new TableQuery(tag => new GreatOpenftParameter(tag))

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

  /** Row type of table GreatPayment */
  type GreatPaymentRow = HCons[String,HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[scala.math.BigDecimal],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatPaymentRow providing default values if available in the database schema. */
  def GreatPaymentRow(paymentId: String, amount: Option[scala.math.BigDecimal], currency: Option[String], pdate: Option[java.sql.Timestamp], reason: Option[String], usage: Option[Char], dpPosition: Option[scala.math.BigDecimal], num: Option[String], fileIdValue: Option[String], commissionReceiver: Option[String], invoiceOrgId: Option[String], orderNumber: Option[String], orderItem: Option[String], costType: Option[String], advanceBilling: Option[Char], diffFromDp: Option[Char], state: Option[Char], lastChangeDate: Option[java.sql.Timestamp], lastUser: Option[String], confirmDate: Option[java.sql.Timestamp], confirmUser: Option[String], performanceStartDate: Option[java.sql.Timestamp], performanceEndDate: Option[java.sql.Timestamp], rejectComment: Option[String], cancelledBookEntryId: Option[String], additionalPaymentPosition: Option[scala.math.BigDecimal]): GreatPaymentRow = {
    paymentId :: amount :: currency :: pdate :: reason :: usage :: dpPosition :: num :: fileIdValue :: commissionReceiver :: invoiceOrgId :: orderNumber :: orderItem :: costType :: advanceBilling :: diffFromDp :: state :: lastChangeDate :: lastUser :: confirmDate :: confirmUser :: performanceStartDate :: performanceEndDate :: rejectComment :: cancelledBookEntryId :: additionalPaymentPosition :: HNil
  }
  /** GetResult implicit for fetching GreatPaymentRow objects using plain SQL queries */
  implicit def GetResultGreatPaymentRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[GreatPaymentRow] = GR{
    prs => import prs._
    <<[String] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[scala.math.BigDecimal] :: HNil
  }
  /** Table description of table GREAT_PAYMENT. Objects of this class serve as prototypes for rows in queries. */
  class GreatPayment(_tableTag: Tag) extends profile.api.Table[GreatPaymentRow](_tableTag, Some("WERNER2"), "GREAT_PAYMENT") {
    def * = paymentId :: amount :: currency :: pdate :: reason :: usage :: dpPosition :: num :: fileIdValue :: commissionReceiver :: invoiceOrgId :: orderNumber :: orderItem :: costType :: advanceBilling :: diffFromDp :: state :: lastChangeDate :: lastUser :: confirmDate :: confirmUser :: performanceStartDate :: performanceEndDate :: rejectComment :: cancelledBookEntryId :: additionalPaymentPosition :: HNil

    /** Database column PAYMENT_ID SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val paymentId: Rep[String] = column[String]("PAYMENT_ID", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column CURRENCY SqlType(CHAR), Length(3,false) */
    val currency: Rep[Option[String]] = column[Option[String]]("CURRENCY", O.Length(3,varying=false))
    /** Database column PDATE SqlType(DATE) */
    val pdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PDATE")
    /** Database column REASON SqlType(VARCHAR2), Length(50,true) */
    val reason: Rep[Option[String]] = column[Option[String]]("REASON", O.Length(50,varying=true))
    /** Database column USAGE SqlType(CHAR) */
    val usage: Rep[Option[Char]] = column[Option[Char]]("USAGE")
    /** Database column DP_POSITION SqlType(NUMBER) */
    val dpPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("DP_POSITION")
    /** Database column NUM SqlType(VARCHAR2), Length(10,true) */
    val num: Rep[Option[String]] = column[Option[String]]("NUM", O.Length(10,varying=true))
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[Option[String]] = column[Option[String]]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column COMMISSION_RECEIVER SqlType(VARCHAR2), Length(5,true) */
    val commissionReceiver: Rep[Option[String]] = column[Option[String]]("COMMISSION_RECEIVER", O.Length(5,varying=true))
    /** Database column INVOICE_ORG_ID SqlType(VARCHAR2), Length(10,true) */
    val invoiceOrgId: Rep[Option[String]] = column[Option[String]]("INVOICE_ORG_ID", O.Length(10,varying=true))
    /** Database column ORDER_NUMBER SqlType(VARCHAR2), Length(35,true) */
    val orderNumber: Rep[Option[String]] = column[Option[String]]("ORDER_NUMBER", O.Length(35,varying=true))
    /** Database column ORDER_ITEM SqlType(VARCHAR2), Length(6,true) */
    val orderItem: Rep[Option[String]] = column[Option[String]]("ORDER_ITEM", O.Length(6,varying=true))
    /** Database column COST_TYPE SqlType(CHAR), Length(4,false) */
    val costType: Rep[Option[String]] = column[Option[String]]("COST_TYPE", O.Length(4,varying=false))
    /** Database column ADVANCE_BILLING SqlType(CHAR) */
    val advanceBilling: Rep[Option[Char]] = column[Option[Char]]("ADVANCE_BILLING")
    /** Database column DIFF_FROM_DP SqlType(CHAR) */
    val diffFromDp: Rep[Option[Char]] = column[Option[Char]]("DIFF_FROM_DP")
    /** Database column STATE SqlType(CHAR) */
    val state: Rep[Option[Char]] = column[Option[Char]]("STATE")
    /** Database column LAST_CHANGE_DATE SqlType(DATE) */
    val lastChangeDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LAST_CHANGE_DATE")
    /** Database column LAST_USER SqlType(VARCHAR2), Length(10,true) */
    val lastUser: Rep[Option[String]] = column[Option[String]]("LAST_USER", O.Length(10,varying=true))
    /** Database column CONFIRM_DATE SqlType(DATE) */
    val confirmDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CONFIRM_DATE")
    /** Database column CONFIRM_USER SqlType(VARCHAR2), Length(10,true) */
    val confirmUser: Rep[Option[String]] = column[Option[String]]("CONFIRM_USER", O.Length(10,varying=true))
    /** Database column PERFORMANCE_START_DATE SqlType(DATE) */
    val performanceStartDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERFORMANCE_START_DATE")
    /** Database column PERFORMANCE_END_DATE SqlType(DATE) */
    val performanceEndDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("PERFORMANCE_END_DATE")
    /** Database column REJECT_COMMENT SqlType(VARCHAR2), Length(1024,true) */
    val rejectComment: Rep[Option[String]] = column[Option[String]]("REJECT_COMMENT", O.Length(1024,varying=true))
    /** Database column CANCELLED_BOOK_ENTRY_ID SqlType(VARCHAR2), Length(10,true) */
    val cancelledBookEntryId: Rep[Option[String]] = column[Option[String]]("CANCELLED_BOOK_ENTRY_ID", O.Length(10,varying=true))
    /** Database column ADDITIONAL_PAYMENT_POSITION SqlType(NUMBER) */
    val additionalPaymentPosition: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("ADDITIONAL_PAYMENT_POSITION")

    /** Foreign key referencing GreatCurrency (database name PAYM_FK_CURRENCY) */
    lazy val greatCurrencyFk = foreignKey("PAYM_FK_CURRENCY", currency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name PAYM_FK_INVOICE_ORG_ID) */
    lazy val greatOrgFk = foreignKey("PAYM_FK_INVOICE_ORG_ID", invoiceOrgId :: HNil, GreatOrg)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (fileIdValue) (database name PAYM_IDX0) */
    val index1 = index("PAYM_IDX0", fileIdValue :: HNil)
  }
  /** Collection-like TableQuery object for table GreatPayment */
  lazy val GreatPayment = new TableQuery(tag => new GreatPayment(tag))

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

  /** Entity class storing rows of table GreatPriceScaleEntry
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param lineId Database column LINE_ID SqlType(VARCHAR2), Length(10,true)
   *  @param upperLimit Database column UPPER_LIMIT SqlType(NUMBER)
   *  @param costType Database column COST_TYPE SqlType(CHAR)
   *  @param amount Database column AMOUNT SqlType(NUMBER)
   *  @param amountCurrency Database column AMOUNT_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param periodType Database column PERIOD_TYPE SqlType(CHAR)
   *  @param percentage Database column PERCENTAGE SqlType(NUMBER) */
  case class GreatPriceScaleEntryRow(objectidc: String, lineId: String, upperLimit: Option[scala.math.BigDecimal], costType: Char, amount: Option[scala.math.BigDecimal], amountCurrency: Option[String], periodType: Option[Char], percentage: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatPriceScaleEntryRow objects using plain SQL queries */
  implicit def GetResultGreatPriceScaleEntryRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Char], e3: GR[Option[String]], e4: GR[Option[Char]]): GR[GreatPriceScaleEntryRow] = GR{
    prs => import prs._
    GreatPriceScaleEntryRow.tupled((<<[String], <<[String], <<?[scala.math.BigDecimal], <<[Char], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_PRICE_SCALE_ENTRY. Objects of this class serve as prototypes for rows in queries. */
  class GreatPriceScaleEntry(_tableTag: Tag) extends profile.api.Table[GreatPriceScaleEntryRow](_tableTag, Some("WERNER2"), "GREAT_PRICE_SCALE_ENTRY") {
    def * = (objectidc, lineId, upperLimit, costType, amount, amountCurrency, periodType, percentage) <> (GreatPriceScaleEntryRow.tupled, GreatPriceScaleEntryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(lineId), upperLimit, Rep.Some(costType), amount, amountCurrency, periodType, percentage).shaped.<>({r=>import r._; _1.map(_=> GreatPriceScaleEntryRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column LINE_ID SqlType(VARCHAR2), Length(10,true) */
    val lineId: Rep[String] = column[String]("LINE_ID", O.Length(10,varying=true))
    /** Database column UPPER_LIMIT SqlType(NUMBER) */
    val upperLimit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_LIMIT")
    /** Database column COST_TYPE SqlType(CHAR) */
    val costType: Rep[Char] = column[Char]("COST_TYPE")
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val amountCurrency: Rep[Option[String]] = column[Option[String]]("AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column PERIOD_TYPE SqlType(CHAR) */
    val periodType: Rep[Option[Char]] = column[Option[Char]]("PERIOD_TYPE")
    /** Database column PERCENTAGE SqlType(NUMBER) */
    val percentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PERCENTAGE")

    /** Foreign key referencing GreatCurrency (database name PSE_FK_AMOUNT_CURRENCY) */
    lazy val greatCurrencyFk = foreignKey("PSE_FK_AMOUNT_CURRENCY", amountCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineContract (database name PSE_FK_LINE_ID) */
    lazy val greatGlineContractFk = foreignKey("PSE_FK_LINE_ID", lineId, GreatGlineContract)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatPriceScaleEntry */
  lazy val GreatPriceScaleEntry = new TableQuery(tag => new GreatPriceScaleEntry(tag))

  /** Entity class storing rows of table GreatPriceScaleEntryHist
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true)
   *  @param lineId Database column LINE_ID SqlType(VARCHAR2), Length(10,true)
   *  @param lineVersion Database column LINE_VERSION SqlType(NUMBER)
   *  @param upperLimit Database column UPPER_LIMIT SqlType(NUMBER)
   *  @param costType Database column COST_TYPE SqlType(CHAR)
   *  @param amount Database column AMOUNT SqlType(NUMBER)
   *  @param amountCurrency Database column AMOUNT_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param periodType Database column PERIOD_TYPE SqlType(CHAR)
   *  @param percentage Database column PERCENTAGE SqlType(NUMBER) */
  case class GreatPriceScaleEntryHistRow(objectidc: String, lineId: String, lineVersion: scala.math.BigDecimal, upperLimit: Option[scala.math.BigDecimal], costType: Char, amount: Option[scala.math.BigDecimal], amountCurrency: Option[String], periodType: Option[Char], percentage: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatPriceScaleEntryHistRow objects using plain SQL queries */
  implicit def GetResultGreatPriceScaleEntryHistRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Char], e4: GR[Option[String]], e5: GR[Option[Char]]): GR[GreatPriceScaleEntryHistRow] = GR{
    prs => import prs._
    GreatPriceScaleEntryHistRow.tupled((<<[String], <<[String], <<[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[Char], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_PRICE_SCALE_ENTRY_HIST. Objects of this class serve as prototypes for rows in queries. */
  class GreatPriceScaleEntryHist(_tableTag: Tag) extends profile.api.Table[GreatPriceScaleEntryHistRow](_tableTag, Some("WERNER2"), "GREAT_PRICE_SCALE_ENTRY_HIST") {
    def * = (objectidc, lineId, lineVersion, upperLimit, costType, amount, amountCurrency, periodType, percentage) <> (GreatPriceScaleEntryHistRow.tupled, GreatPriceScaleEntryHistRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), Rep.Some(lineId), Rep.Some(lineVersion), upperLimit, Rep.Some(costType), amount, amountCurrency, periodType, percentage).shaped.<>({r=>import r._; _1.map(_=> GreatPriceScaleEntryHistRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.Length(10,varying=true))
    /** Database column LINE_ID SqlType(VARCHAR2), Length(10,true) */
    val lineId: Rep[String] = column[String]("LINE_ID", O.Length(10,varying=true))
    /** Database column LINE_VERSION SqlType(NUMBER) */
    val lineVersion: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("LINE_VERSION")
    /** Database column UPPER_LIMIT SqlType(NUMBER) */
    val upperLimit: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("UPPER_LIMIT")
    /** Database column COST_TYPE SqlType(CHAR) */
    val costType: Rep[Char] = column[Char]("COST_TYPE")
    /** Database column AMOUNT SqlType(NUMBER) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("AMOUNT")
    /** Database column AMOUNT_CURRENCY SqlType(CHAR), Length(3,false) */
    val amountCurrency: Rep[Option[String]] = column[Option[String]]("AMOUNT_CURRENCY", O.Length(3,varying=false))
    /** Database column PERIOD_TYPE SqlType(CHAR) */
    val periodType: Rep[Option[Char]] = column[Option[Char]]("PERIOD_TYPE")
    /** Database column PERCENTAGE SqlType(NUMBER) */
    val percentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PERCENTAGE")

    /** Primary key of GreatPriceScaleEntryHist (database name PSEH_PK_OBJECTIDC) */
    val pk = primaryKey("PSEH_PK_OBJECTIDC", (objectidc, lineVersion))

    /** Foreign key referencing GreatCurrency (database name PSEH_FK_AMOUNT_CURRENCY) */
    lazy val greatCurrencyFk = foreignKey("PSEH_FK_AMOUNT_CURRENCY", amountCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineContractHistory (database name PSEH_FK_LINE_VERSION) */
    lazy val greatGlineContractHistoryFk = foreignKey("PSEH_FK_LINE_VERSION", (lineId, lineVersion), GreatGlineContractHistory)(r => (r.objectidc, r.objectversionc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatPriceScaleEntryHist */
  lazy val GreatPriceScaleEntryHist = new TableQuery(tag => new GreatPriceScaleEntryHist(tag))

  /** Entity class storing rows of table GreatQuarterlyReserves
   *  @param quarterlyReservesId Database column QUARTERLY_RESERVES_ID SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param baseLiabilityAmount Database column BASE_LIABILITY_AMOUNT SqlType(NUMBER)
   *  @param baseLiabilityCurrency Database column BASE_LIABILITY_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param done Database column DONE SqlType(CHAR)
   *  @param hgbCulculatedReserveAmount Database column HGB_CULCULATED_RESERVE_AMOUNT SqlType(NUMBER)
   *  @param hgbCalculatedCurrency Database column HGB_CALCULATED_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param usgCulculatedReserveAmount Database column USG_CULCULATED_RESERVE_AMOUNT SqlType(NUMBER)
   *  @param usgCalculatedCurrency Database column USG_CALCULATED_CURRENCY SqlType(CHAR), Length(3,false)
   *  @param debtorPortionId Database column DEBTOR_PORTION_ID SqlType(VARCHAR2), Length(10,true)
   *  @param hgbReservesPercentage Database column HGB_RESERVES_PERCENTAGE SqlType(NUMBER)
   *  @param usgReservesPercentage Database column USG_RESERVES_PERCENTAGE SqlType(NUMBER)
   *  @param calcReservesOrigAmount Database column CALC_RESERVES_ORIG_AMOUNT SqlType(NUMBER)
   *  @param calcReservesOrigCurrency Database column CALC_RESERVES_ORIG_CURRENCY SqlType(CHAR), Length(3,false) */
  case class GreatQuarterlyReservesRow(quarterlyReservesId: String, baseLiabilityAmount: Option[scala.math.BigDecimal], baseLiabilityCurrency: Option[String], done: Option[Char], hgbCulculatedReserveAmount: Option[scala.math.BigDecimal], hgbCalculatedCurrency: Option[String], usgCulculatedReserveAmount: Option[scala.math.BigDecimal], usgCalculatedCurrency: Option[String], debtorPortionId: Option[String], hgbReservesPercentage: Option[scala.math.BigDecimal], usgReservesPercentage: Option[scala.math.BigDecimal], calcReservesOrigAmount: Option[scala.math.BigDecimal], calcReservesOrigCurrency: Option[String])
  /** GetResult implicit for fetching GreatQuarterlyReservesRow objects using plain SQL queries */
  implicit def GetResultGreatQuarterlyReservesRow(implicit e0: GR[String], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]], e3: GR[Option[Char]]): GR[GreatQuarterlyReservesRow] = GR{
    prs => import prs._
    GreatQuarterlyReservesRow.tupled((<<[String], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[scala.math.BigDecimal], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_QUARTERLY_RESERVES. Objects of this class serve as prototypes for rows in queries. */
  class GreatQuarterlyReserves(_tableTag: Tag) extends profile.api.Table[GreatQuarterlyReservesRow](_tableTag, Some("WERNER2"), "GREAT_QUARTERLY_RESERVES") {
    def * = (quarterlyReservesId, baseLiabilityAmount, baseLiabilityCurrency, done, hgbCulculatedReserveAmount, hgbCalculatedCurrency, usgCulculatedReserveAmount, usgCalculatedCurrency, debtorPortionId, hgbReservesPercentage, usgReservesPercentage, calcReservesOrigAmount, calcReservesOrigCurrency) <> (GreatQuarterlyReservesRow.tupled, GreatQuarterlyReservesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(quarterlyReservesId), baseLiabilityAmount, baseLiabilityCurrency, done, hgbCulculatedReserveAmount, hgbCalculatedCurrency, usgCulculatedReserveAmount, usgCalculatedCurrency, debtorPortionId, hgbReservesPercentage, usgReservesPercentage, calcReservesOrigAmount, calcReservesOrigCurrency).shaped.<>({r=>import r._; _1.map(_=> GreatQuarterlyReservesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column QUARTERLY_RESERVES_ID SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val quarterlyReservesId: Rep[String] = column[String]("QUARTERLY_RESERVES_ID", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column BASE_LIABILITY_AMOUNT SqlType(NUMBER) */
    val baseLiabilityAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BASE_LIABILITY_AMOUNT")
    /** Database column BASE_LIABILITY_CURRENCY SqlType(CHAR), Length(3,false) */
    val baseLiabilityCurrency: Rep[Option[String]] = column[Option[String]]("BASE_LIABILITY_CURRENCY", O.Length(3,varying=false))
    /** Database column DONE SqlType(CHAR) */
    val done: Rep[Option[Char]] = column[Option[Char]]("DONE")
    /** Database column HGB_CULCULATED_RESERVE_AMOUNT SqlType(NUMBER) */
    val hgbCulculatedReserveAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HGB_CULCULATED_RESERVE_AMOUNT")
    /** Database column HGB_CALCULATED_CURRENCY SqlType(CHAR), Length(3,false) */
    val hgbCalculatedCurrency: Rep[Option[String]] = column[Option[String]]("HGB_CALCULATED_CURRENCY", O.Length(3,varying=false))
    /** Database column USG_CULCULATED_RESERVE_AMOUNT SqlType(NUMBER) */
    val usgCulculatedReserveAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_CULCULATED_RESERVE_AMOUNT")
    /** Database column USG_CALCULATED_CURRENCY SqlType(CHAR), Length(3,false) */
    val usgCalculatedCurrency: Rep[Option[String]] = column[Option[String]]("USG_CALCULATED_CURRENCY", O.Length(3,varying=false))
    /** Database column DEBTOR_PORTION_ID SqlType(VARCHAR2), Length(10,true) */
    val debtorPortionId: Rep[Option[String]] = column[Option[String]]("DEBTOR_PORTION_ID", O.Length(10,varying=true))
    /** Database column HGB_RESERVES_PERCENTAGE SqlType(NUMBER) */
    val hgbReservesPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("HGB_RESERVES_PERCENTAGE")
    /** Database column USG_RESERVES_PERCENTAGE SqlType(NUMBER) */
    val usgReservesPercentage: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("USG_RESERVES_PERCENTAGE")
    /** Database column CALC_RESERVES_ORIG_AMOUNT SqlType(NUMBER) */
    val calcReservesOrigAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CALC_RESERVES_ORIG_AMOUNT")
    /** Database column CALC_RESERVES_ORIG_CURRENCY SqlType(CHAR), Length(3,false) */
    val calcReservesOrigCurrency: Rep[Option[String]] = column[Option[String]]("CALC_RESERVES_ORIG_CURRENCY", O.Length(3,varying=false))

    /** Foreign key referencing GreatCurrency (database name QRES_FK_BASE_LIABILITY_CURRE0) */
    lazy val greatCurrencyFk1 = foreignKey("QRES_FK_BASE_LIABILITY_CURRE0", baseLiabilityCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name QRES_FK_CALC_RESERVES_ORIG_C3) */
    lazy val greatCurrencyFk2 = foreignKey("QRES_FK_CALC_RESERVES_ORIG_C3", calcReservesOrigCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name QRES_FK_HGB_CALCULATED_CURRE1) */
    lazy val greatCurrencyFk3 = foreignKey("QRES_FK_HGB_CALCULATED_CURRE1", hgbCalculatedCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name QRES_FK_USG_CALCULATED_CURRE2) */
    lazy val greatCurrencyFk4 = foreignKey("QRES_FK_USG_CALCULATED_CURRE2", usgCalculatedCurrency, GreatCurrency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (debtorPortionId) (database name QRES_IDX0) */
    val index1 = index("QRES_IDX0", debtorPortionId)
  }
  /** Collection-like TableQuery object for table GreatQuarterlyReserves */
  lazy val GreatQuarterlyReserves = new TableQuery(tag => new GreatQuarterlyReserves(tag))

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

  /** Entity class storing rows of table GreatReconciliationProcess
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param dispatchDate Database column DISPATCH_DATE SqlType(TIMESTAMP(6))
   *  @param fromUser Database column FROM_USER SqlType(VARCHAR2), Length(10,true)
   *  @param name Database column NAME SqlType(VARCHAR2), Length(64,true)
   *  @param listKey Database column LIST_KEY SqlType(VARCHAR2), Length(64,true)
   *  @param state Database column STATE SqlType(VARCHAR2), Length(32,true) */
  case class GreatReconciliationProcessRow(objectidc: String, dispatchDate: Option[java.sql.Timestamp], fromUser: Option[String], name: Option[String], listKey: Option[String], state: Option[String])
  /** GetResult implicit for fetching GreatReconciliationProcessRow objects using plain SQL queries */
  implicit def GetResultGreatReconciliationProcessRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]]): GR[GreatReconciliationProcessRow] = GR{
    prs => import prs._
    GreatReconciliationProcessRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_RECONCILIATION_PROCESS. Objects of this class serve as prototypes for rows in queries. */
  class GreatReconciliationProcess(_tableTag: Tag) extends profile.api.Table[GreatReconciliationProcessRow](_tableTag, Some("WERNER2"), "GREAT_RECONCILIATION_PROCESS") {
    def * = (objectidc, dispatchDate, fromUser, name, listKey, state) <> (GreatReconciliationProcessRow.tupled, GreatReconciliationProcessRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), dispatchDate, fromUser, name, listKey, state).shaped.<>({r=>import r._; _1.map(_=> GreatReconciliationProcessRow.tupled((_1.get, _2, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column DISPATCH_DATE SqlType(TIMESTAMP(6)) */
    val dispatchDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DISPATCH_DATE")
    /** Database column FROM_USER SqlType(VARCHAR2), Length(10,true) */
    val fromUser: Rep[Option[String]] = column[Option[String]]("FROM_USER", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(64,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(64,varying=true))
    /** Database column LIST_KEY SqlType(VARCHAR2), Length(64,true) */
    val listKey: Rep[Option[String]] = column[Option[String]]("LIST_KEY", O.Length(64,varying=true))
    /** Database column STATE SqlType(VARCHAR2), Length(32,true) */
    val state: Rep[Option[String]] = column[Option[String]]("STATE", O.Length(32,varying=true))

    /** Foreign key referencing GreatDivisionUser (database name RC_FK_FROM_USER) */
    lazy val greatDivisionUserFk = foreignKey("RC_FK_FROM_USER", fromUser, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatReconciliationProcess */
  lazy val GreatReconciliationProcess = new TableQuery(tag => new GreatReconciliationProcess(tag))

  /** Entity class storing rows of table GreatReminderRun
   *  @param objectidc Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param execStart Database column EXEC_START SqlType(TIMESTAMP(6))
   *  @param execEnd Database column EXEC_END SqlType(TIMESTAMP(6))
   *  @param status Database column STATUS SqlType(CHAR)
   *  @param divisionUser Database column DIVISION_USER SqlType(VARCHAR2), Length(10,true)
   *  @param startDate Database column START_DATE SqlType(DATE)
   *  @param endDate Database column END_DATE SqlType(DATE)
   *  @param purposes Database column PURPOSES SqlType(VARCHAR2), Length(100,true)
   *  @param baren Database column BAREN SqlType(VARCHAR2), Length(4000,true)
   *  @param protocol Database column PROTOCOL SqlType(BLOB)
   *  @param protocolLength Database column PROTOCOL_LENGTH SqlType(NUMBER) */
  case class GreatReminderRunRow(objectidc: String, execStart: Option[java.sql.Timestamp], execEnd: Option[java.sql.Timestamp], status: Option[Char], divisionUser: Option[String], startDate: Option[java.sql.Timestamp], endDate: Option[java.sql.Timestamp], purposes: Option[String], baren: Option[String], protocol: Option[java.sql.Blob], protocolLength: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatReminderRunRow objects using plain SQL queries */
  implicit def GetResultGreatReminderRunRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Char]], e3: GR[Option[String]], e4: GR[Option[java.sql.Blob]], e5: GR[Option[scala.math.BigDecimal]]): GR[GreatReminderRunRow] = GR{
    prs => import prs._
    GreatReminderRunRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Blob], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_REMINDER_RUN. Objects of this class serve as prototypes for rows in queries. */
  class GreatReminderRun(_tableTag: Tag) extends profile.api.Table[GreatReminderRunRow](_tableTag, Some("WERNER2"), "GREAT_REMINDER_RUN") {
    def * = (objectidc, execStart, execEnd, status, divisionUser, startDate, endDate, purposes, baren, protocol, protocolLength) <> (GreatReminderRunRow.tupled, GreatReminderRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), execStart, execEnd, status, divisionUser, startDate, endDate, purposes, baren, protocol, protocolLength).shaped.<>({r=>import r._; _1.map(_=> GreatReminderRunRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECTIDC SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val objectidc: Rep[String] = column[String]("OBJECTIDC", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column EXEC_START SqlType(TIMESTAMP(6)) */
    val execStart: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXEC_START")
    /** Database column EXEC_END SqlType(TIMESTAMP(6)) */
    val execEnd: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EXEC_END")
    /** Database column STATUS SqlType(CHAR) */
    val status: Rep[Option[Char]] = column[Option[Char]]("STATUS")
    /** Database column DIVISION_USER SqlType(VARCHAR2), Length(10,true) */
    val divisionUser: Rep[Option[String]] = column[Option[String]]("DIVISION_USER", O.Length(10,varying=true))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("START_DATE")
    /** Database column END_DATE SqlType(DATE) */
    val endDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("END_DATE")
    /** Database column PURPOSES SqlType(VARCHAR2), Length(100,true) */
    val purposes: Rep[Option[String]] = column[Option[String]]("PURPOSES", O.Length(100,varying=true))
    /** Database column BAREN SqlType(VARCHAR2), Length(4000,true) */
    val baren: Rep[Option[String]] = column[Option[String]]("BAREN", O.Length(4000,varying=true))
    /** Database column PROTOCOL SqlType(BLOB) */
    val protocol: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("PROTOCOL")
    /** Database column PROTOCOL_LENGTH SqlType(NUMBER) */
    val protocolLength: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("PROTOCOL_LENGTH")

    /** Foreign key referencing GreatDivisionUser (database name RRU_FK_DIVISION_USER) */
    lazy val greatDivisionUserFk = foreignKey("RRU_FK_DIVISION_USER", divisionUser, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatReminderRun */
  lazy val GreatReminderRun = new TableQuery(tag => new GreatReminderRun(tag))

  /** Row type of table GreatRequest */
  type GreatRequestRow = HCons[String,HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Blob],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatRequestRow providing default values if available in the database schema. */
  def GreatRequestRow(requestKey: String, startDate: Option[java.sql.Timestamp], `type`: Option[Char], purpose: Option[Char], distributeImmediately: Option[Char], distributionDate: Option[java.sql.Timestamp], distributionTargetType: Option[Char], invitationReference: Option[String], offerNumber: Option[String], deliveryObject: Option[String], contractReference: Option[String], contractDate: Option[java.sql.Timestamp], contractCountry: Option[String], standard: Option[Char], language: Option[String], rComment: Option[String], addendum: Option[String], distributionTarget: Option[String], beneficiaryType: Option[Char], thirdPartyBeneficiaryId: Option[String], beneficiaryPersonKey: Option[String], documentText: Option[java.sql.Blob], remarks: Option[String], beneficiaryIsVu: Option[Char], copyIssued: Option[Char], documentDebtorName: Option[String], gross: Option[Char], tenderClosingDate: Option[java.sql.Timestamp], offerDate: Option[java.sql.Timestamp], attachmentIdc: Option[String], eopFulfillment: Option[java.sql.Timestamp], documentReplaced: Option[Char], projectName: Option[String], oriBack2garant: Option[Char], nationalDeliveryObject: Option[String], nationalDocumentDebtorName: Option[String], bankAutoMature: Option[Char]): GreatRequestRow = {
    requestKey :: startDate :: `type` :: purpose :: distributeImmediately :: distributionDate :: distributionTargetType :: invitationReference :: offerNumber :: deliveryObject :: contractReference :: contractDate :: contractCountry :: standard :: language :: rComment :: addendum :: distributionTarget :: beneficiaryType :: thirdPartyBeneficiaryId :: beneficiaryPersonKey :: documentText :: remarks :: beneficiaryIsVu :: copyIssued :: documentDebtorName :: gross :: tenderClosingDate :: offerDate :: attachmentIdc :: eopFulfillment :: documentReplaced :: projectName :: oriBack2garant :: nationalDeliveryObject :: nationalDocumentDebtorName :: bankAutoMature :: HNil
  }
  /** GetResult implicit for fetching GreatRequestRow objects using plain SQL queries */
  implicit def GetResultGreatRequestRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Char]], e3: GR[Option[String]], e4: GR[Option[java.sql.Blob]]): GR[GreatRequestRow] = GR{
    prs => import prs._
    <<[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[java.sql.Blob] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_REQUEST. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatRequest(_tableTag: Tag) extends profile.api.Table[GreatRequestRow](_tableTag, Some("WERNER2"), "GREAT_REQUEST") {
    def * = requestKey :: startDate :: `type` :: purpose :: distributeImmediately :: distributionDate :: distributionTargetType :: invitationReference :: offerNumber :: deliveryObject :: contractReference :: contractDate :: contractCountry :: standard :: language :: rComment :: addendum :: distributionTarget :: beneficiaryType :: thirdPartyBeneficiaryId :: beneficiaryPersonKey :: documentText :: remarks :: beneficiaryIsVu :: copyIssued :: documentDebtorName :: gross :: tenderClosingDate :: offerDate :: attachmentIdc :: eopFulfillment :: documentReplaced :: projectName :: oriBack2garant :: nationalDeliveryObject :: nationalDocumentDebtorName :: bankAutoMature :: HNil

    /** Database column REQUEST_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val requestKey: Rep[String] = column[String]("REQUEST_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column START_DATE SqlType(DATE) */
    val startDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("START_DATE")
    /** Database column TYPE SqlType(VARCHAR2)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Char]] = column[Option[Char]]("TYPE")
    /** Database column PURPOSE SqlType(VARCHAR2) */
    val purpose: Rep[Option[Char]] = column[Option[Char]]("PURPOSE")
    /** Database column DISTRIBUTE_IMMEDIATELY SqlType(CHAR) */
    val distributeImmediately: Rep[Option[Char]] = column[Option[Char]]("DISTRIBUTE_IMMEDIATELY")
    /** Database column DISTRIBUTION_DATE SqlType(DATE) */
    val distributionDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("DISTRIBUTION_DATE")
    /** Database column DISTRIBUTION_TARGET_TYPE SqlType(VARCHAR2) */
    val distributionTargetType: Rep[Option[Char]] = column[Option[Char]]("DISTRIBUTION_TARGET_TYPE")
    /** Database column INVITATION_REFERENCE SqlType(VARCHAR2), Length(32,true) */
    val invitationReference: Rep[Option[String]] = column[Option[String]]("INVITATION_REFERENCE", O.Length(32,varying=true))
    /** Database column OFFER_NUMBER SqlType(VARCHAR2), Length(80,true) */
    val offerNumber: Rep[Option[String]] = column[Option[String]]("OFFER_NUMBER", O.Length(80,varying=true))
    /** Database column DELIVERY_OBJECT SqlType(VARCHAR2), Length(2000,true) */
    val deliveryObject: Rep[Option[String]] = column[Option[String]]("DELIVERY_OBJECT", O.Length(2000,varying=true))
    /** Database column CONTRACT_REFERENCE SqlType(VARCHAR2), Length(400,true) */
    val contractReference: Rep[Option[String]] = column[Option[String]]("CONTRACT_REFERENCE", O.Length(400,varying=true))
    /** Database column CONTRACT_DATE SqlType(DATE) */
    val contractDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CONTRACT_DATE")
    /** Database column CONTRACT_COUNTRY SqlType(VARCHAR2), Length(3,true) */
    val contractCountry: Rep[Option[String]] = column[Option[String]]("CONTRACT_COUNTRY", O.Length(3,varying=true))
    /** Database column STANDARD SqlType(CHAR) */
    val standard: Rep[Option[Char]] = column[Option[Char]]("STANDARD")
    /** Database column LANGUAGE SqlType(CHAR), Length(2,false) */
    val language: Rep[Option[String]] = column[Option[String]]("LANGUAGE", O.Length(2,varying=false))
    /** Database column R_COMMENT SqlType(VARCHAR2), Length(4000,true) */
    val rComment: Rep[Option[String]] = column[Option[String]]("R_COMMENT", O.Length(4000,varying=true))
    /** Database column ADDENDUM SqlType(VARCHAR2), Length(1024,true) */
    val addendum: Rep[Option[String]] = column[Option[String]]("ADDENDUM", O.Length(1024,varying=true))
    /** Database column DISTRIBUTION_TARGET SqlType(VARCHAR2), Length(10,true) */
    val distributionTarget: Rep[Option[String]] = column[Option[String]]("DISTRIBUTION_TARGET", O.Length(10,varying=true))
    /** Database column BENEFICIARY_TYPE SqlType(VARCHAR2) */
    val beneficiaryType: Rep[Option[Char]] = column[Option[Char]]("BENEFICIARY_TYPE")
    /** Database column THIRD_PARTY_BENEFICIARY_ID SqlType(VARCHAR2), Length(10,true) */
    val thirdPartyBeneficiaryId: Rep[Option[String]] = column[Option[String]]("THIRD_PARTY_BENEFICIARY_ID", O.Length(10,varying=true))
    /** Database column BENEFICIARY_PERSON_KEY SqlType(VARCHAR2), Length(10,true) */
    val beneficiaryPersonKey: Rep[Option[String]] = column[Option[String]]("BENEFICIARY_PERSON_KEY", O.Length(10,varying=true))
    /** Database column DOCUMENT_TEXT SqlType(BLOB) */
    val documentText: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("DOCUMENT_TEXT")
    /** Database column REMARKS SqlType(VARCHAR2), Length(240,true) */
    val remarks: Rep[Option[String]] = column[Option[String]]("REMARKS", O.Length(240,varying=true))
    /** Database column BENEFICIARY_IS_VU SqlType(CHAR) */
    val beneficiaryIsVu: Rep[Option[Char]] = column[Option[Char]]("BENEFICIARY_IS_VU")
    /** Database column COPY_ISSUED SqlType(CHAR) */
    val copyIssued: Rep[Option[Char]] = column[Option[Char]]("COPY_ISSUED")
    /** Database column DOCUMENT_DEBTOR_NAME SqlType(VARCHAR2), Length(256,true) */
    val documentDebtorName: Rep[Option[String]] = column[Option[String]]("DOCUMENT_DEBTOR_NAME", O.Length(256,varying=true))
    /** Database column GROSS SqlType(CHAR) */
    val gross: Rep[Option[Char]] = column[Option[Char]]("GROSS")
    /** Database column TENDER_CLOSING_DATE SqlType(DATE) */
    val tenderClosingDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("TENDER_CLOSING_DATE")
    /** Database column OFFER_DATE SqlType(DATE) */
    val offerDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("OFFER_DATE")
    /** Database column ATTACHMENT_IDC SqlType(VARCHAR2), Length(10,true) */
    val attachmentIdc: Rep[Option[String]] = column[Option[String]]("ATTACHMENT_IDC", O.Length(10,varying=true))
    /** Database column EOP_FULFILLMENT SqlType(DATE) */
    val eopFulfillment: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("EOP_FULFILLMENT")
    /** Database column DOCUMENT_REPLACED SqlType(CHAR) */
    val documentReplaced: Rep[Option[Char]] = column[Option[Char]]("DOCUMENT_REPLACED")
    /** Database column PROJECT_NAME SqlType(VARCHAR2), Length(50,true) */
    val projectName: Rep[Option[String]] = column[Option[String]]("PROJECT_NAME", O.Length(50,varying=true))
    /** Database column ORI_BACK2GARANT SqlType(CHAR) */
    val oriBack2garant: Rep[Option[Char]] = column[Option[Char]]("ORI_BACK2GARANT")
    /** Database column NATIONAL_DELIVERY_OBJECT SqlType(NVARCHAR2), Length(2000,true) */
    val nationalDeliveryObject: Rep[Option[String]] = column[Option[String]]("NATIONAL_DELIVERY_OBJECT", O.Length(2000,varying=true))
    /** Database column NATIONAL_DOCUMENT_DEBTOR_NAME SqlType(NVARCHAR2), Length(256,true) */
    val nationalDocumentDebtorName: Rep[Option[String]] = column[Option[String]]("NATIONAL_DOCUMENT_DEBTOR_NAME", O.Length(256,varying=true))
    /** Database column BANK_AUTO_MATURE SqlType(CHAR) */
    val bankAutoMature: Rep[Option[Char]] = column[Option[Char]]("BANK_AUTO_MATURE")

    /** Foreign key referencing GreatBusinessPartner (database name REQ_FK_THIRD_PARTY_BENEFICIA2) */
    lazy val greatBusinessPartnerFk = foreignKey("REQ_FK_THIRD_PARTY_BENEFICIA2", thirdPartyBeneficiaryId :: HNil, GreatBusinessPartner)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCountry (database name REQ_FK_CONTRACT_COUNTRY) */
    lazy val greatCountryFk = foreignKey("REQ_FK_CONTRACT_COUNTRY", contractCountry :: HNil, GreatCountry)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeAttachment (database name REQ_FK_ATTACHMENT_IDC) */
    lazy val greatGuaranteeAttachmentFk = foreignKey("REQ_FK_ATTACHMENT_IDC", attachmentIdc :: HNil, GreatGuaranteeAttachment)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatLanguage (database name REQ_FK_LANGUAGE) */
    lazy val greatLanguageFk = foreignKey("REQ_FK_LANGUAGE", language :: HNil, GreatLanguage)(r => Rep.Some(r.iso639Code) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatPerson (database name REQ_FK_BENEFICIARY_PERSON_KEY) */
    lazy val greatPersonFk5 = foreignKey("REQ_FK_BENEFICIARY_PERSON_KEY", beneficiaryPersonKey :: HNil, GreatPerson)(r => Rep.Some(r.personKey) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatPerson (database name REQ_FK_DISTRIBUTION_TARGET) */
    lazy val greatPersonFk6 = foreignKey("REQ_FK_DISTRIBUTION_TARGET", distributionTarget :: HNil, GreatPerson)(r => Rep.Some(r.personKey) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatRequest */
  lazy val GreatRequest = new TableQuery(tag => new GreatRequest(tag))

  /** Entity class storing rows of table GreatServerstatsSnapshot
   *  @param id Database column ID SqlType(VARCHAR2), PrimaryKey, Length(10,true)
   *  @param timestamp Database column TIMESTAMP SqlType(DATE)
   *  @param freememory Database column FREEMEMORY SqlType(NUMBER)
   *  @param totalmemory Database column TOTALMEMORY SqlType(NUMBER)
   *  @param numdbconnections Database column NUMDBCONNECTIONS SqlType(NUMBER)
   *  @param numbatchjobs Database column NUMBATCHJOBS SqlType(NUMBER)
   *  @param batchjobdurationmin Database column BATCHJOBDURATIONMIN SqlType(NUMBER)
   *  @param batchjobdurationavg Database column BATCHJOBDURATIONAVG SqlType(NUMBER)
   *  @param batchjobdurationmax Database column BATCHJOBDURATIONMAX SqlType(NUMBER)
   *  @param msopenedserversockets Database column MSOPENEDSERVERSOCKETS SqlType(NUMBER)
   *  @param msopenserversockets Database column MSOPENSERVERSOCKETS SqlType(NUMBER)
   *  @param msopenedclientsockets Database column MSOPENEDCLIENTSOCKETS SqlType(NUMBER)
   *  @param msopenclientsockets Database column MSOPENCLIENTSOCKETS SqlType(NUMBER)
   *  @param msmaxopenserversockets Database column MSMAXOPENSERVERSOCKETS SqlType(NUMBER)
   *  @param msmaxopenclientsockets Database column MSMAXOPENCLIENTSOCKETS SqlType(NUMBER)
   *  @param numusers Database column NUMUSERS SqlType(NUMBER) */
  case class GreatServerstatsSnapshotRow(id: String, timestamp: Option[java.sql.Timestamp], freememory: Option[scala.math.BigDecimal], totalmemory: Option[scala.math.BigDecimal], numdbconnections: Option[scala.math.BigDecimal], numbatchjobs: Option[scala.math.BigDecimal], batchjobdurationmin: Option[scala.math.BigDecimal], batchjobdurationavg: Option[scala.math.BigDecimal], batchjobdurationmax: Option[scala.math.BigDecimal], msopenedserversockets: Option[scala.math.BigDecimal], msopenserversockets: Option[scala.math.BigDecimal], msopenedclientsockets: Option[scala.math.BigDecimal], msopenclientsockets: Option[scala.math.BigDecimal], msmaxopenserversockets: Option[scala.math.BigDecimal], msmaxopenclientsockets: Option[scala.math.BigDecimal], numusers: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching GreatServerstatsSnapshotRow objects using plain SQL queries */
  implicit def GetResultGreatServerstatsSnapshotRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[scala.math.BigDecimal]]): GR[GreatServerstatsSnapshotRow] = GR{
    prs => import prs._
    GreatServerstatsSnapshotRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_SERVERSTATS_SNAPSHOT. Objects of this class serve as prototypes for rows in queries. */
  class GreatServerstatsSnapshot(_tableTag: Tag) extends profile.api.Table[GreatServerstatsSnapshotRow](_tableTag, Some("WERNER2"), "GREAT_SERVERSTATS_SNAPSHOT") {
    def * = (id, timestamp, freememory, totalmemory, numdbconnections, numbatchjobs, batchjobdurationmin, batchjobdurationavg, batchjobdurationmax, msopenedserversockets, msopenserversockets, msopenedclientsockets, msopenclientsockets, msmaxopenserversockets, msmaxopenclientsockets, numusers) <> (GreatServerstatsSnapshotRow.tupled, GreatServerstatsSnapshotRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), timestamp, freememory, totalmemory, numdbconnections, numbatchjobs, batchjobdurationmin, batchjobdurationavg, batchjobdurationmax, msopenedserversockets, msopenserversockets, msopenedclientsockets, msopenclientsockets, msmaxopenserversockets, msmaxopenclientsockets, numusers).shaped.<>({r=>import r._; _1.map(_=> GreatServerstatsSnapshotRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val id: Rep[String] = column[String]("ID", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column TIMESTAMP SqlType(DATE) */
    val timestamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("TIMESTAMP")
    /** Database column FREEMEMORY SqlType(NUMBER) */
    val freememory: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FREEMEMORY")
    /** Database column TOTALMEMORY SqlType(NUMBER) */
    val totalmemory: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("TOTALMEMORY")
    /** Database column NUMDBCONNECTIONS SqlType(NUMBER) */
    val numdbconnections: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("NUMDBCONNECTIONS")
    /** Database column NUMBATCHJOBS SqlType(NUMBER) */
    val numbatchjobs: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("NUMBATCHJOBS")
    /** Database column BATCHJOBDURATIONMIN SqlType(NUMBER) */
    val batchjobdurationmin: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BATCHJOBDURATIONMIN")
    /** Database column BATCHJOBDURATIONAVG SqlType(NUMBER) */
    val batchjobdurationavg: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BATCHJOBDURATIONAVG")
    /** Database column BATCHJOBDURATIONMAX SqlType(NUMBER) */
    val batchjobdurationmax: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("BATCHJOBDURATIONMAX")
    /** Database column MSOPENEDSERVERSOCKETS SqlType(NUMBER) */
    val msopenedserversockets: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MSOPENEDSERVERSOCKETS")
    /** Database column MSOPENSERVERSOCKETS SqlType(NUMBER) */
    val msopenserversockets: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MSOPENSERVERSOCKETS")
    /** Database column MSOPENEDCLIENTSOCKETS SqlType(NUMBER) */
    val msopenedclientsockets: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MSOPENEDCLIENTSOCKETS")
    /** Database column MSOPENCLIENTSOCKETS SqlType(NUMBER) */
    val msopenclientsockets: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MSOPENCLIENTSOCKETS")
    /** Database column MSMAXOPENSERVERSOCKETS SqlType(NUMBER) */
    val msmaxopenserversockets: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MSMAXOPENSERVERSOCKETS")
    /** Database column MSMAXOPENCLIENTSOCKETS SqlType(NUMBER) */
    val msmaxopenclientsockets: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MSMAXOPENCLIENTSOCKETS")
    /** Database column NUMUSERS SqlType(NUMBER) */
    val numusers: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("NUMUSERS")
  }
  /** Collection-like TableQuery object for table GreatServerstatsSnapshot */
  lazy val GreatServerstatsSnapshot = new TableQuery(tag => new GreatServerstatsSnapshot(tag))

  /** Row type of table GreatSettlement */
  type GreatSettlementRow = HCons[String,HCons[Option[java.sql.Timestamp],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[Char],HCons[Option[Char],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for GreatSettlementRow providing default values if available in the database schema. */
  def GreatSettlementRow(settlementKey: String, maturityDate: Option[java.sql.Timestamp], fixedMaturityDate: Option[Char], guarantorType: Option[Char], endedAtMaturity: Option[Char], groupUnitId: Option[String], approvedByExecutiveBoard: Option[Char], versandart: Option[Char], indirectBankDescription: Option[String], thirdPartyComment: Option[String], gross: Option[Char], attribute1: Option[String], attribute2: Option[String], attribute3: Option[String], attribute4: Option[String], attribute5: Option[String], attribute6: Option[String], attribute7: Option[String], attribute8: Option[String], attribute9: Option[String], attribute10: Option[String], commissionCostType: Option[Char], commPortion: Option[scala.math.BigDecimal], minComm: Option[scala.math.BigDecimal], minCommCur: Option[String], minCommPeriod: Option[Char], fixComm: Option[scala.math.BigDecimal], fixCommCur: Option[String], fixCommPeriod: Option[Char], commPortionStandard: Option[Char], minCommStandard: Option[Char], fixCommStandard: Option[Char], feeCostType: Option[Char], feePortion: Option[scala.math.BigDecimal], minFee: Option[scala.math.BigDecimal], minFeeCur: Option[String], minFeePeriod: Option[Char], fixFee: Option[scala.math.BigDecimal], fixFeeCur: Option[String], fixFeePeriod: Option[Char], feePortionStandard: Option[Char], minFeeStandard: Option[Char], fixFeeStandard: Option[Char], hasSupplementFee: Option[Char], posSupplementFee: Option[scala.math.BigDecimal], supplementFee: Option[scala.math.BigDecimal], supplementFeeCurrency: Option[String], hasCreationFee: Option[Char], posCreationFee: Option[scala.math.BigDecimal], creationFee: Option[scala.math.BigDecimal], creationFeeCurrency: Option[String], hasExpenses: Option[Char], posExpenses: Option[scala.math.BigDecimal], expenses: Option[scala.math.BigDecimal], expensesCurrency: Option[String], hasCourierCharges: Option[Char], posCourierCharges: Option[scala.math.BigDecimal], courierCharges: Option[scala.math.BigDecimal], courierChargesCurrency: Option[String], considerStartperiod: Option[Char], lineAccountIdc: Option[String], allInCondition: Option[Char], effectiveForBalancecalc: Option[Char]): GreatSettlementRow = {
    settlementKey :: maturityDate :: fixedMaturityDate :: guarantorType :: endedAtMaturity :: groupUnitId :: approvedByExecutiveBoard :: versandart :: indirectBankDescription :: thirdPartyComment :: gross :: attribute1 :: attribute2 :: attribute3 :: attribute4 :: attribute5 :: attribute6 :: attribute7 :: attribute8 :: attribute9 :: attribute10 :: commissionCostType :: commPortion :: minComm :: minCommCur :: minCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: commPortionStandard :: minCommStandard :: fixCommStandard :: feeCostType :: feePortion :: minFee :: minFeeCur :: minFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: feePortionStandard :: minFeeStandard :: fixFeeStandard :: hasSupplementFee :: posSupplementFee :: supplementFee :: supplementFeeCurrency :: hasCreationFee :: posCreationFee :: creationFee :: creationFeeCurrency :: hasExpenses :: posExpenses :: expenses :: expensesCurrency :: hasCourierCharges :: posCourierCharges :: courierCharges :: courierChargesCurrency :: considerStartperiod :: lineAccountIdc :: allInCondition :: effectiveForBalancecalc :: HNil
  }
  /** GetResult implicit for fetching GreatSettlementRow objects using plain SQL queries */
  implicit def GetResultGreatSettlementRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Char]], e3: GR[Option[String]], e4: GR[Option[scala.math.BigDecimal]]): GR[GreatSettlementRow] = GR{
    prs => import prs._
    <<[String] :: <<?[java.sql.Timestamp] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[Char] :: <<?[Char] :: HNil
  }
  /** Table description of table GREAT_SETTLEMENT. Objects of this class serve as prototypes for rows in queries. */
  class GreatSettlement(_tableTag: Tag) extends profile.api.Table[GreatSettlementRow](_tableTag, Some("WERNER2"), "GREAT_SETTLEMENT") {
    def * = settlementKey :: maturityDate :: fixedMaturityDate :: guarantorType :: endedAtMaturity :: groupUnitId :: approvedByExecutiveBoard :: versandart :: indirectBankDescription :: thirdPartyComment :: gross :: attribute1 :: attribute2 :: attribute3 :: attribute4 :: attribute5 :: attribute6 :: attribute7 :: attribute8 :: attribute9 :: attribute10 :: commissionCostType :: commPortion :: minComm :: minCommCur :: minCommPeriod :: fixComm :: fixCommCur :: fixCommPeriod :: commPortionStandard :: minCommStandard :: fixCommStandard :: feeCostType :: feePortion :: minFee :: minFeeCur :: minFeePeriod :: fixFee :: fixFeeCur :: fixFeePeriod :: feePortionStandard :: minFeeStandard :: fixFeeStandard :: hasSupplementFee :: posSupplementFee :: supplementFee :: supplementFeeCurrency :: hasCreationFee :: posCreationFee :: creationFee :: creationFeeCurrency :: hasExpenses :: posExpenses :: expenses :: expensesCurrency :: hasCourierCharges :: posCourierCharges :: courierCharges :: courierChargesCurrency :: considerStartperiod :: lineAccountIdc :: allInCondition :: effectiveForBalancecalc :: HNil

    /** Database column SETTLEMENT_KEY SqlType(VARCHAR2), PrimaryKey, Length(10,true) */
    val settlementKey: Rep[String] = column[String]("SETTLEMENT_KEY", O.PrimaryKey, O.Length(10,varying=true))
    /** Database column MATURITY_DATE SqlType(DATE) */
    val maturityDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MATURITY_DATE")
    /** Database column FIXED_MATURITY_DATE SqlType(CHAR) */
    val fixedMaturityDate: Rep[Option[Char]] = column[Option[Char]]("FIXED_MATURITY_DATE")
    /** Database column GUARANTOR_TYPE SqlType(CHAR) */
    val guarantorType: Rep[Option[Char]] = column[Option[Char]]("GUARANTOR_TYPE")
    /** Database column ENDED_AT_MATURITY SqlType(CHAR) */
    val endedAtMaturity: Rep[Option[Char]] = column[Option[Char]]("ENDED_AT_MATURITY")
    /** Database column GROUP_UNIT_ID SqlType(VARCHAR2), Length(4,true) */
    val groupUnitId: Rep[Option[String]] = column[Option[String]]("GROUP_UNIT_ID", O.Length(4,varying=true))
    /** Database column APPROVED_BY_EXECUTIVE_BOARD SqlType(CHAR) */
    val approvedByExecutiveBoard: Rep[Option[Char]] = column[Option[Char]]("APPROVED_BY_EXECUTIVE_BOARD")
    /** Database column VERSANDART SqlType(CHAR) */
    val versandart: Rep[Option[Char]] = column[Option[Char]]("VERSANDART")
    /** Database column INDIRECT_BANK_DESCRIPTION SqlType(VARCHAR2), Length(66,true) */
    val indirectBankDescription: Rep[Option[String]] = column[Option[String]]("INDIRECT_BANK_DESCRIPTION", O.Length(66,varying=true))
    /** Database column THIRD_PARTY_COMMENT SqlType(NVARCHAR2), Length(1024,true) */
    val thirdPartyComment: Rep[Option[String]] = column[Option[String]]("THIRD_PARTY_COMMENT", O.Length(1024,varying=true))
    /** Database column GROSS SqlType(CHAR) */
    val gross: Rep[Option[Char]] = column[Option[Char]]("GROSS")
    /** Database column ATTRIBUTE1 SqlType(NVARCHAR2), Length(100,true) */
    val attribute1: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE1", O.Length(100,varying=true))
    /** Database column ATTRIBUTE2 SqlType(NVARCHAR2), Length(100,true) */
    val attribute2: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE2", O.Length(100,varying=true))
    /** Database column ATTRIBUTE3 SqlType(NVARCHAR2), Length(100,true) */
    val attribute3: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE3", O.Length(100,varying=true))
    /** Database column ATTRIBUTE4 SqlType(NVARCHAR2), Length(100,true) */
    val attribute4: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE4", O.Length(100,varying=true))
    /** Database column ATTRIBUTE5 SqlType(NVARCHAR2), Length(100,true) */
    val attribute5: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE5", O.Length(100,varying=true))
    /** Database column ATTRIBUTE6 SqlType(NVARCHAR2), Length(100,true) */
    val attribute6: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE6", O.Length(100,varying=true))
    /** Database column ATTRIBUTE7 SqlType(NVARCHAR2), Length(100,true) */
    val attribute7: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE7", O.Length(100,varying=true))
    /** Database column ATTRIBUTE8 SqlType(NVARCHAR2), Length(100,true) */
    val attribute8: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE8", O.Length(100,varying=true))
    /** Database column ATTRIBUTE9 SqlType(NVARCHAR2), Length(100,true) */
    val attribute9: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE9", O.Length(100,varying=true))
    /** Database column ATTRIBUTE10 SqlType(NVARCHAR2), Length(100,true) */
    val attribute10: Rep[Option[String]] = column[Option[String]]("ATTRIBUTE10", O.Length(100,varying=true))
    /** Database column COMMISSION_COST_TYPE SqlType(CHAR) */
    val commissionCostType: Rep[Option[Char]] = column[Option[Char]]("COMMISSION_COST_TYPE")
    /** Database column COMM_PORTION SqlType(NUMBER) */
    val commPortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COMM_PORTION")
    /** Database column MIN_COMM SqlType(NUMBER) */
    val minComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_COMM")
    /** Database column MIN_COMM_CUR SqlType(CHAR), Length(3,false) */
    val minCommCur: Rep[Option[String]] = column[Option[String]]("MIN_COMM_CUR", O.Length(3,varying=false))
    /** Database column MIN_COMM_PERIOD SqlType(CHAR) */
    val minCommPeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_COMM_PERIOD")
    /** Database column FIX_COMM SqlType(NUMBER) */
    val fixComm: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIX_COMM")
    /** Database column FIX_COMM_CUR SqlType(CHAR), Length(3,false) */
    val fixCommCur: Rep[Option[String]] = column[Option[String]]("FIX_COMM_CUR", O.Length(3,varying=false))
    /** Database column FIX_COMM_PERIOD SqlType(CHAR) */
    val fixCommPeriod: Rep[Option[Char]] = column[Option[Char]]("FIX_COMM_PERIOD")
    /** Database column COMM_PORTION_STANDARD SqlType(CHAR) */
    val commPortionStandard: Rep[Option[Char]] = column[Option[Char]]("COMM_PORTION_STANDARD")
    /** Database column MIN_COMM_STANDARD SqlType(CHAR) */
    val minCommStandard: Rep[Option[Char]] = column[Option[Char]]("MIN_COMM_STANDARD")
    /** Database column FIX_COMM_STANDARD SqlType(CHAR) */
    val fixCommStandard: Rep[Option[Char]] = column[Option[Char]]("FIX_COMM_STANDARD")
    /** Database column FEE_COST_TYPE SqlType(CHAR) */
    val feeCostType: Rep[Option[Char]] = column[Option[Char]]("FEE_COST_TYPE")
    /** Database column FEE_PORTION SqlType(NUMBER) */
    val feePortion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FEE_PORTION")
    /** Database column MIN_FEE SqlType(NUMBER) */
    val minFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MIN_FEE")
    /** Database column MIN_FEE_CUR SqlType(CHAR), Length(3,false) */
    val minFeeCur: Rep[Option[String]] = column[Option[String]]("MIN_FEE_CUR", O.Length(3,varying=false))
    /** Database column MIN_FEE_PERIOD SqlType(CHAR) */
    val minFeePeriod: Rep[Option[Char]] = column[Option[Char]]("MIN_FEE_PERIOD")
    /** Database column FIX_FEE SqlType(NUMBER) */
    val fixFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIX_FEE")
    /** Database column FIX_FEE_CUR SqlType(CHAR), Length(3,false) */
    val fixFeeCur: Rep[Option[String]] = column[Option[String]]("FIX_FEE_CUR", O.Length(3,varying=false))
    /** Database column FIX_FEE_PERIOD SqlType(CHAR) */
    val fixFeePeriod: Rep[Option[Char]] = column[Option[Char]]("FIX_FEE_PERIOD")
    /** Database column FEE_PORTION_STANDARD SqlType(CHAR) */
    val feePortionStandard: Rep[Option[Char]] = column[Option[Char]]("FEE_PORTION_STANDARD")
    /** Database column MIN_FEE_STANDARD SqlType(CHAR) */
    val minFeeStandard: Rep[Option[Char]] = column[Option[Char]]("MIN_FEE_STANDARD")
    /** Database column FIX_FEE_STANDARD SqlType(CHAR) */
    val fixFeeStandard: Rep[Option[Char]] = column[Option[Char]]("FIX_FEE_STANDARD")
    /** Database column HAS_SUPPLEMENT_FEE SqlType(CHAR) */
    val hasSupplementFee: Rep[Option[Char]] = column[Option[Char]]("HAS_SUPPLEMENT_FEE")
    /** Database column POS_SUPPLEMENT_FEE SqlType(NUMBER) */
    val posSupplementFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POS_SUPPLEMENT_FEE")
    /** Database column SUPPLEMENT_FEE SqlType(NUMBER) */
    val supplementFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("SUPPLEMENT_FEE")
    /** Database column SUPPLEMENT_FEE_CURRENCY SqlType(CHAR), Length(3,false) */
    val supplementFeeCurrency: Rep[Option[String]] = column[Option[String]]("SUPPLEMENT_FEE_CURRENCY", O.Length(3,varying=false))
    /** Database column HAS_CREATION_FEE SqlType(CHAR) */
    val hasCreationFee: Rep[Option[Char]] = column[Option[Char]]("HAS_CREATION_FEE")
    /** Database column POS_CREATION_FEE SqlType(NUMBER) */
    val posCreationFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POS_CREATION_FEE")
    /** Database column CREATION_FEE SqlType(NUMBER) */
    val creationFee: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("CREATION_FEE")
    /** Database column CREATION_FEE_CURRENCY SqlType(CHAR), Length(3,false) */
    val creationFeeCurrency: Rep[Option[String]] = column[Option[String]]("CREATION_FEE_CURRENCY", O.Length(3,varying=false))
    /** Database column HAS_EXPENSES SqlType(CHAR) */
    val hasExpenses: Rep[Option[Char]] = column[Option[Char]]("HAS_EXPENSES")
    /** Database column POS_EXPENSES SqlType(NUMBER) */
    val posExpenses: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POS_EXPENSES")
    /** Database column EXPENSES SqlType(NUMBER) */
    val expenses: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("EXPENSES")
    /** Database column EXPENSES_CURRENCY SqlType(CHAR), Length(3,false) */
    val expensesCurrency: Rep[Option[String]] = column[Option[String]]("EXPENSES_CURRENCY", O.Length(3,varying=false))
    /** Database column HAS_COURIER_CHARGES SqlType(CHAR) */
    val hasCourierCharges: Rep[Option[Char]] = column[Option[Char]]("HAS_COURIER_CHARGES")
    /** Database column POS_COURIER_CHARGES SqlType(NUMBER) */
    val posCourierCharges: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("POS_COURIER_CHARGES")
    /** Database column COURIER_CHARGES SqlType(NUMBER) */
    val courierCharges: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("COURIER_CHARGES")
    /** Database column COURIER_CHARGES_CURRENCY SqlType(CHAR), Length(3,false) */
    val courierChargesCurrency: Rep[Option[String]] = column[Option[String]]("COURIER_CHARGES_CURRENCY", O.Length(3,varying=false))
    /** Database column CONSIDER_STARTPERIOD SqlType(CHAR) */
    val considerStartperiod: Rep[Option[Char]] = column[Option[Char]]("CONSIDER_STARTPERIOD")
    /** Database column LINE_ACCOUNT_IDC SqlType(VARCHAR2), Length(10,true) */
    val lineAccountIdc: Rep[Option[String]] = column[Option[String]]("LINE_ACCOUNT_IDC", O.Length(10,varying=true))
    /** Database column ALL_IN_CONDITION SqlType(CHAR) */
    val allInCondition: Rep[Option[Char]] = column[Option[Char]]("ALL_IN_CONDITION")
    /** Database column EFFECTIVE_FOR_BALANCECALC SqlType(CHAR) */
    val effectiveForBalancecalc: Rep[Option[Char]] = column[Option[Char]]("EFFECTIVE_FOR_BALANCECALC")

    /** Foreign key referencing GreatBareDependants (database name SET_FK_GROUP_UNIT_ID) */
    lazy val greatBareDependantsFk = foreignKey("SET_FK_GROUP_UNIT_ID", groupUnitId :: HNil, GreatBareDependants)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name SET_FK_COURIER_CHARGES_CURRE5) */
    lazy val greatCurrencyFk2 = foreignKey("SET_FK_COURIER_CHARGES_CURRE5", courierChargesCurrency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name SET_FK_CREATION_FEE_CURRENCY) */
    lazy val greatCurrencyFk3 = foreignKey("SET_FK_CREATION_FEE_CURRENCY", creationFeeCurrency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name SET_FK_EXPENSES_CURRENCY) */
    lazy val greatCurrencyFk4 = foreignKey("SET_FK_EXPENSES_CURRENCY", expensesCurrency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name SET_FK_FIX_COMM_CUR) */
    lazy val greatCurrencyFk5 = foreignKey("SET_FK_FIX_COMM_CUR", fixCommCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name SET_FK_MIN_COMM_CUR) */
    lazy val greatCurrencyFk6 = foreignKey("SET_FK_MIN_COMM_CUR", minCommCur :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name SET_FK_SUPPLEMENT_FEE_CURRENCY) */
    lazy val greatCurrencyFk7 = foreignKey("SET_FK_SUPPLEMENT_FEE_CURRENCY", supplementFeeCurrency :: HNil, GreatCurrency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineAccount (database name SET_FK_LINE_ACCOUNT_IDC) */
    lazy val greatGlineAccountFk = foreignKey("SET_FK_LINE_ACCOUNT_IDC", lineAccountIdc :: HNil, GreatGlineAccount)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatSettlement */
  lazy val GreatSettlement = new TableQuery(tag => new GreatSettlement(tag))

  /** Entity class storing rows of table GreatSviewConstraint
   *  @param userIdc Database column USER_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param constraint Database column CONSTRAINT SqlType(VARCHAR2), Length(30,true) */
  case class GreatSviewConstraintRow(userIdc: Option[String], constraint: Option[String])
  /** GetResult implicit for fetching GreatSviewConstraintRow objects using plain SQL queries */
  implicit def GetResultGreatSviewConstraintRow(implicit e0: GR[Option[String]]): GR[GreatSviewConstraintRow] = GR{
    prs => import prs._
    GreatSviewConstraintRow.tupled((<<?[String], <<?[String]))
  }
  /** Table description of table GREAT_SVIEW_CONSTRAINT. Objects of this class serve as prototypes for rows in queries. */
  class GreatSviewConstraint(_tableTag: Tag) extends profile.api.Table[GreatSviewConstraintRow](_tableTag, Some("WERNER2"), "GREAT_SVIEW_CONSTRAINT") {
    def * = (userIdc, constraint) <> (GreatSviewConstraintRow.tupled, GreatSviewConstraintRow.unapply)

    /** Database column USER_IDC SqlType(VARCHAR2), Length(10,true) */
    val userIdc: Rep[Option[String]] = column[Option[String]]("USER_IDC", O.Length(10,varying=true))
    /** Database column CONSTRAINT SqlType(VARCHAR2), Length(30,true) */
    val constraint: Rep[Option[String]] = column[Option[String]]("CONSTRAINT", O.Length(30,varying=true))

    /** Foreign key referencing GreatDivisionUser (database name SVIEW_FK_USER_IDC) */
    lazy val greatDivisionUserFk = foreignKey("SVIEW_FK_USER_IDC", userIdc, GreatDivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatSviewConstraint */
  lazy val GreatSviewConstraint = new TableQuery(tag => new GreatSviewConstraint(tag))

  /** Entity class storing rows of table GreatUniqueIds
   *  @param tablenamec Database column TABLENAMEC SqlType(VARCHAR2), PrimaryKey, Length(40,true)
   *  @param idc Database column IDC SqlType(NUMBER) */
  case class GreatUniqueIdsRow(tablenamec: String, idc: scala.math.BigDecimal)
  /** GetResult implicit for fetching GreatUniqueIdsRow objects using plain SQL queries */
  implicit def GetResultGreatUniqueIdsRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal]): GR[GreatUniqueIdsRow] = GR{
    prs => import prs._
    GreatUniqueIdsRow.tupled((<<[String], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_UNIQUE_IDS. Objects of this class serve as prototypes for rows in queries. */
  class GreatUniqueIds(_tableTag: Tag) extends profile.api.Table[GreatUniqueIdsRow](_tableTag, Some("WERNER2"), "GREAT_UNIQUE_IDS") {
    def * = (tablenamec, idc) <> (GreatUniqueIdsRow.tupled, GreatUniqueIdsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(tablenamec), Rep.Some(idc)).shaped.<>({r=>import r._; _1.map(_=> GreatUniqueIdsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column TABLENAMEC SqlType(VARCHAR2), PrimaryKey, Length(40,true) */
    val tablenamec: Rep[String] = column[String]("TABLENAMEC", O.PrimaryKey, O.Length(40,varying=true))
    /** Database column IDC SqlType(NUMBER) */
    val idc: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("IDC")
  }
  /** Collection-like TableQuery object for table GreatUniqueIds */
  lazy val GreatUniqueIds = new TableQuery(tag => new GreatUniqueIds(tag))

  /** Entity class storing rows of table GreatUnitAttributeChoice
   *  @param id Database column ID SqlType(NUMBER), PrimaryKey
   *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param kind Database column KIND SqlType(CHAR)
   *  @param fieldNumber Database column FIELD_NUMBER SqlType(NUMBER)
   *  @param idx Database column IDX SqlType(NUMBER)
   *  @param value Database column VALUE SqlType(NVARCHAR2), Length(100,true) */
  case class GreatUnitAttributeChoiceRow(id: scala.math.BigDecimal, divisionIdc: Option[String], kind: Option[Char], fieldNumber: Option[scala.math.BigDecimal], idx: Option[scala.math.BigDecimal], value: Option[String])
  /** GetResult implicit for fetching GreatUnitAttributeChoiceRow objects using plain SQL queries */
  implicit def GetResultGreatUnitAttributeChoiceRow(implicit e0: GR[scala.math.BigDecimal], e1: GR[Option[String]], e2: GR[Option[Char]], e3: GR[Option[scala.math.BigDecimal]]): GR[GreatUnitAttributeChoiceRow] = GR{
    prs => import prs._
    GreatUnitAttributeChoiceRow.tupled((<<[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table GREAT_UNIT_ATTRIBUTE_CHOICE. Objects of this class serve as prototypes for rows in queries. */
  class GreatUnitAttributeChoice(_tableTag: Tag) extends profile.api.Table[GreatUnitAttributeChoiceRow](_tableTag, Some("WERNER2"), "GREAT_UNIT_ATTRIBUTE_CHOICE") {
    def * = (id, divisionIdc, kind, fieldNumber, idx, value) <> (GreatUnitAttributeChoiceRow.tupled, GreatUnitAttributeChoiceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), divisionIdc, kind, fieldNumber, idx, value).shaped.<>({r=>import r._; _1.map(_=> GreatUnitAttributeChoiceRow.tupled((_1.get, _2, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(NUMBER), PrimaryKey */
    val id: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ID", O.PrimaryKey)
    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[Option[String]] = column[Option[String]]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column KIND SqlType(CHAR) */
    val kind: Rep[Option[Char]] = column[Option[Char]]("KIND")
    /** Database column FIELD_NUMBER SqlType(NUMBER) */
    val fieldNumber: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("FIELD_NUMBER")
    /** Database column IDX SqlType(NUMBER) */
    val idx: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("IDX")
    /** Database column VALUE SqlType(NVARCHAR2), Length(100,true) */
    val value: Rep[Option[String]] = column[Option[String]]("VALUE", O.Length(100,varying=true))

    /** Foreign key referencing GreatUnitAttributes (database name UAC_FK_FIELD_NUMBER) */
    lazy val greatUnitAttributesFk = foreignKey("UAC_FK_FIELD_NUMBER", (divisionIdc, kind, fieldNumber), GreatUnitAttributes)(r => (Rep.Some(r.divisionIdc), Rep.Some(r.kind), Rep.Some(r.fieldNumber)), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatUnitAttributeChoice */
  lazy val GreatUnitAttributeChoice = new TableQuery(tag => new GreatUnitAttributeChoice(tag))

  /** Entity class storing rows of table GreatUnitAttributes
   *  @param divisionIdc Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true)
   *  @param kind Database column KIND SqlType(CHAR)
   *  @param fieldNumber Database column FIELD_NUMBER SqlType(NUMBER)
   *  @param name Database column NAME SqlType(VARCHAR2), Length(52,true)
   *  @param mandatory Database column MANDATORY SqlType(CHAR)
   *  @param `type` Database column TYPE SqlType(CHAR) */
  case class GreatUnitAttributesRow(divisionIdc: String, kind: Char, fieldNumber: scala.math.BigDecimal, name: Option[String], mandatory: Option[Char], `type`: Option[Char])
  /** GetResult implicit for fetching GreatUnitAttributesRow objects using plain SQL queries */
  implicit def GetResultGreatUnitAttributesRow(implicit e0: GR[String], e1: GR[Char], e2: GR[scala.math.BigDecimal], e3: GR[Option[String]], e4: GR[Option[Char]]): GR[GreatUnitAttributesRow] = GR{
    prs => import prs._
    GreatUnitAttributesRow.tupled((<<[String], <<[Char], <<[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_UNIT_ATTRIBUTES. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class GreatUnitAttributes(_tableTag: Tag) extends profile.api.Table[GreatUnitAttributesRow](_tableTag, Some("WERNER2"), "GREAT_UNIT_ATTRIBUTES") {
    def * = (divisionIdc, kind, fieldNumber, name, mandatory, `type`) <> (GreatUnitAttributesRow.tupled, GreatUnitAttributesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(divisionIdc), Rep.Some(kind), Rep.Some(fieldNumber), name, mandatory, `type`).shaped.<>({r=>import r._; _1.map(_=> GreatUnitAttributesRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DIVISION_IDC SqlType(VARCHAR2), Length(10,true) */
    val divisionIdc: Rep[String] = column[String]("DIVISION_IDC", O.Length(10,varying=true))
    /** Database column KIND SqlType(CHAR) */
    val kind: Rep[Char] = column[Char]("KIND")
    /** Database column FIELD_NUMBER SqlType(NUMBER) */
    val fieldNumber: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FIELD_NUMBER")
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[Option[String]] = column[Option[String]]("NAME", O.Length(52,varying=true))
    /** Database column MANDATORY SqlType(CHAR) */
    val mandatory: Rep[Option[Char]] = column[Option[Char]]("MANDATORY")
    /** Database column TYPE SqlType(CHAR)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[Char]] = column[Option[Char]]("TYPE")

    /** Primary key of GreatUnitAttributes (database name UA_PK_DIVISION_IDC) */
    val pk = primaryKey("UA_PK_DIVISION_IDC", (divisionIdc, kind, fieldNumber))

    /** Foreign key referencing GreatDivision (database name UA_FK_DIVISION_IDC) */
    lazy val greatDivisionFk = foreignKey("UA_FK_DIVISION_IDC", divisionIdc, GreatDivision)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatUnitAttributes */
  lazy val GreatUnitAttributes = new TableQuery(tag => new GreatUnitAttributes(tag))

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

  /** Entity class storing rows of table GreatWorkflowStep
   *  @param stepNumber Database column STEP_NUMBER SqlType(NUMBER)
   *  @param fileIdValue Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true)
   *  @param guaranteeVersion Database column GUARANTEE_VERSION SqlType(NUMBER)
   *  @param responsibleEvent Database column RESPONSIBLE_EVENT SqlType(VARCHAR2), Length(32,true)
   *  @param source Database column SOURCE SqlType(VARCHAR2), Length(32,true)
   *  @param target Database column TARGET SqlType(VARCHAR2), Length(32,true)
   *  @param timeStamp Database column TIME_STAMP SqlType(DATE)
   *  @param responsibleUser Database column RESPONSIBLE_USER SqlType(VARCHAR2), Length(10,true)
   *  @param changesString Database column CHANGES_STRING SqlType(NCLOB), Length(4000,false) */
  case class GreatWorkflowStepRow(stepNumber: scala.math.BigDecimal, fileIdValue: String, guaranteeVersion: scala.math.BigDecimal, responsibleEvent: Option[String], source: Option[String], target: Option[String], timeStamp: Option[java.sql.Timestamp], responsibleUser: Option[String], changesString: Option[String])
  /** GetResult implicit for fetching GreatWorkflowStepRow objects using plain SQL queries */
  implicit def GetResultGreatWorkflowStepRow(implicit e0: GR[scala.math.BigDecimal], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[GreatWorkflowStepRow] = GR{
    prs => import prs._
    GreatWorkflowStepRow.tupled((<<[scala.math.BigDecimal], <<[String], <<[scala.math.BigDecimal], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_WORKFLOW_STEP. Objects of this class serve as prototypes for rows in queries. */
  class GreatWorkflowStep(_tableTag: Tag) extends profile.api.Table[GreatWorkflowStepRow](_tableTag, Some("WERNER2"), "GREAT_WORKFLOW_STEP") {
    def * = (stepNumber, fileIdValue, guaranteeVersion, responsibleEvent, source, target, timeStamp, responsibleUser, changesString) <> (GreatWorkflowStepRow.tupled, GreatWorkflowStepRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(stepNumber), Rep.Some(fileIdValue), Rep.Some(guaranteeVersion), responsibleEvent, source, target, timeStamp, responsibleUser, changesString).shaped.<>({r=>import r._; _1.map(_=> GreatWorkflowStepRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column STEP_NUMBER SqlType(NUMBER) */
    val stepNumber: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("STEP_NUMBER")
    /** Database column FILE_ID_VALUE SqlType(VARCHAR2), Length(10,true) */
    val fileIdValue: Rep[String] = column[String]("FILE_ID_VALUE", O.Length(10,varying=true))
    /** Database column GUARANTEE_VERSION SqlType(NUMBER) */
    val guaranteeVersion: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("GUARANTEE_VERSION")
    /** Database column RESPONSIBLE_EVENT SqlType(VARCHAR2), Length(32,true) */
    val responsibleEvent: Rep[Option[String]] = column[Option[String]]("RESPONSIBLE_EVENT", O.Length(32,varying=true))
    /** Database column SOURCE SqlType(VARCHAR2), Length(32,true) */
    val source: Rep[Option[String]] = column[Option[String]]("SOURCE", O.Length(32,varying=true))
    /** Database column TARGET SqlType(VARCHAR2), Length(32,true) */
    val target: Rep[Option[String]] = column[Option[String]]("TARGET", O.Length(32,varying=true))
    /** Database column TIME_STAMP SqlType(DATE) */
    val timeStamp: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("TIME_STAMP")
    /** Database column RESPONSIBLE_USER SqlType(VARCHAR2), Length(10,true) */
    val responsibleUser: Rep[Option[String]] = column[Option[String]]("RESPONSIBLE_USER", O.Length(10,varying=true))
    /** Database column CHANGES_STRING SqlType(NCLOB), Length(4000,false) */
    val changesString: Rep[Option[String]] = column[Option[String]]("CHANGES_STRING", O.Length(4000,varying=false))

    /** Primary key of GreatWorkflowStep (database name WS_PK_STEP_NUMBER) */
    val pk = primaryKey("WS_PK_STEP_NUMBER", (stepNumber, fileIdValue, guaranteeVersion))
  }
  /** Collection-like TableQuery object for table GreatWorkflowStep */
  lazy val GreatWorkflowStep = new TableQuery(tag => new GreatWorkflowStep(tag))
}
