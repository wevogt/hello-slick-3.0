package model.great

object BackOfficeTables extends {
  val profile = slick.jdbc.OracleProfile
} with BackOfficeTables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait BackOfficeTables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  import model.great.MasterDataTables._
  import model.great.AdminTables._
  import model.great.CommonTables._
  import model.great.GuaranteeAllTables._

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(BalanceSheetReportDef.schema, BalanceSheetReportRun.schema, GreatBareBillingRun.schema, BillingRun.schema, BookEntry.schema, BookEntryRelation.schema, BulkUpdateDef.schema, BulkUpdateDokuments.schema, BulkUpdateGuarantee.schema, BulkUpdateRun.schema, BulkUpdateValue.schema, GreatCommissionRecBareDep.schema, GreatCommissionReceiver.schema, GreatCommissionReceiverHist.schema, GreatCostItem.schema, GreatInvoice.schema, GreatInvoiceEvent.schema, GreatInvoiceEvidence.schema, GreatInvoiceEvidencePos.schema, GreatInvoiceLineItem.schema, GreatInvoiceNumber.schema, GreatInvoicePass.schema, GreatInvPassCalendar.schema, GreatPayment.schema, GreatPriceScaleEntry.schema, GreatPriceScaleEntryHist.schema, GreatQuarterlyReserves.schema, GreatReconciliationProcess.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema
  val tablePrefix = "GREAT_"

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
  case class BillingRunRow(objectidc: String, bareGroup: Option[String], execStart: Option[java.sql.Timestamp], execEnd: Option[java.sql.Timestamp], status: Option[Char], userAccount: Option[String], endDate: Option[java.sql.Timestamp], onlyFlagged: Option[Char], nrsValidation: Option[Char], protocol: Option[java.sql.Blob], protocolLength: Option[scala.math.BigDecimal], transportDescription: Option[String], transportStatus: Option[Char], concernedBaren: Option[String], testMode: Option[Char])
  /** GetResult implicit for fetching BillingRunRow objects using plain SQL queries */
  implicit def GetResultBillingRunRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Char]], e4: GR[Option[java.sql.Blob]], e5: GR[Option[scala.math.BigDecimal]]): GR[BillingRunRow] = GR{
    prs => import prs._
      BillingRunRow.tupled((<<[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Char], <<?[String], <<?[java.sql.Timestamp], <<?[Char], <<?[Char], <<?[java.sql.Blob], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BILLING_RUN. Objects of this class serve as prototypes for rows in queries. */
  class BillingRun(_tableTag: Tag) extends profile.api.Table[BillingRunRow](_tableTag, Some("WERNER2"), "GREAT_BILLING_RUN") {
    def * = (objectidc, bareGroup, execStart, execEnd, status, userAccount, endDate, onlyFlagged, nrsValidation, protocol, protocolLength, transportDescription, transportStatus, concernedBaren, testMode) <> (BillingRunRow.tupled, BillingRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), bareGroup, execStart, execEnd, status, userAccount, endDate, onlyFlagged, nrsValidation, protocol, protocolLength, transportDescription, transportStatus, concernedBaren, testMode).shaped.<>({r=>import r._; _1.map(_=> BillingRunRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing BareDependants (database name BRU_FK_BARE_GROUP) */
    lazy val bareDependantsFk = foreignKey("BRU_FK_BARE_GROUP", bareGroup, BareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing UserAccount (database name BRU_FK_USER_ACCOUNT) */
    lazy val userAccountFk = foreignKey("BRU_FK_USER_ACCOUNT", userAccount, UserAccount)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BillingRun */
  lazy val BillingRun = new TableQuery(tag => new BillingRun(tag))

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
  case class BookEntryRow(objectidc: String, fileIdValue: Option[String], debtorPosition: Option[scala.math.BigDecimal], preciseCostType: Option[String], valueDate: Option[java.sql.Timestamp], periodOfPerformanceBegin: Option[java.sql.Timestamp], periodOfPerformanceEnd: Option[java.sql.Timestamp], materialNumber: Option[String], bare: Option[String], commissionReceiver: Option[String], targetAmount: Option[scala.math.BigDecimal], targetAmountCur: Option[String], purpose: Option[Char], invoiceOrgId: Option[String], invoiceOrgName: Option[String], orderNumber: Option[String], orderItem: Option[String], reason: Option[String], additionalPaymentPosition: Option[scala.math.BigDecimal], cancelledBookEntryIdValue: Option[String], invoiceLineItemIdValue: Option[String])
  /** GetResult implicit for fetching BookEntryRow objects using plain SQL queries */
  implicit def GetResultBookEntryRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Char]]): GR[BookEntryRow] = GR{
    prs => import prs._
      BookEntryRow.tupled((<<[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[Char], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String]))
  }
  /** Table description of table GREAT_BOOK_ENTRY. Objects of this class serve as prototypes for rows in queries. */
  class BookEntry(_tableTag: Tag) extends profile.api.Table[BookEntryRow](_tableTag, Some("WERNER2"), "GREAT_BOOK_ENTRY") {
    def * = (objectidc, fileIdValue, debtorPosition, preciseCostType, valueDate, periodOfPerformanceBegin, periodOfPerformanceEnd, materialNumber, bare, commissionReceiver, targetAmount, targetAmountCur, purpose, invoiceOrgId, invoiceOrgName, orderNumber, orderItem, reason, additionalPaymentPosition, cancelledBookEntryIdValue, invoiceLineItemIdValue) <> (BookEntryRow.tupled, BookEntryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(objectidc), fileIdValue, debtorPosition, preciseCostType, valueDate, periodOfPerformanceBegin, periodOfPerformanceEnd, materialNumber, bare, commissionReceiver, targetAmount, targetAmountCur, purpose, invoiceOrgId, invoiceOrgName, orderNumber, orderItem, reason, additionalPaymentPosition, cancelledBookEntryIdValue, invoiceLineItemIdValue).shaped.<>({r=>import r._; _1.map(_=> BookEntryRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing BareDependants (database name BEY_FK_BARE) */
    lazy val bareDependantsFk = foreignKey("BEY_FK_BARE", bare, BareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing CommissionReceiver (database name BEY_FK_COMMISSION_RECEIVER) */
    lazy val commissionReceiverFk = foreignKey("BEY_FK_COMMISSION_RECEIVER", commissionReceiver, GreatCommissionReceiver)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Currency (database name BEY_FK_TARGET_AMOUNT_CUR) */
    lazy val currencyFk = foreignKey("BEY_FK_TARGET_AMOUNT_CUR", targetAmountCur, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GuaranteeFile (database name BEY_FK_FILE_ID_VALUE) */
    lazy val guaranteeFileFk = foreignKey("BEY_FK_FILE_ID_VALUE", fileIdValue, GreatGuaranteeFile)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing InvoiceLineItem (database name BEY_FK_INVOICE_LINE_ITEM_ID_5) */
    lazy val invoiceLineItemFk = foreignKey("BEY_FK_INVOICE_LINE_ITEM_ID_5", invoiceLineItemIdValue, GreatInvoiceLineItem)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Org (database name BEY_FK_INVOICE_ORG_ID) */
    lazy val orgFk = foreignKey("BEY_FK_INVOICE_ORG_ID", invoiceOrgId, Org)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (fileIdValue,debtorPosition) (database name BEY_CDX0) */
    val index1 = index("BEY_CDX0", (fileIdValue, debtorPosition))
  }
  /** Collection-like TableQuery object for table BookEntry */
  lazy val BookEntry = new TableQuery(tag => new BookEntry(tag))

  /** Entity class storing rows of table GreatBookEntryRelation
    *  @param masterBookEntryIdc Database column MASTER_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true)
    *  @param detailBookEntryIdc Database column DETAIL_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
  case class BookEntryRelationRow(masterBookEntryIdc: String, detailBookEntryIdc: String)
  /** GetResult implicit for fetching BookEntryRelationRow objects using plain SQL queries */
  implicit def GetResultBookEntryRelationRow(implicit e0: GR[String]): GR[BookEntryRelationRow] = GR{
    prs => import prs._
      BookEntryRelationRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table GREAT_BOOK_ENTRY_RELATION. Objects of this class serve as prototypes for rows in queries. */
  class BookEntryRelation(_tableTag: Tag) extends profile.api.Table[BookEntryRelationRow](_tableTag, Some("WERNER2"), "GREAT_BOOK_ENTRY_RELATION") {
    def * = (masterBookEntryIdc, detailBookEntryIdc) <> (BookEntryRelationRow.tupled, BookEntryRelationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(masterBookEntryIdc), Rep.Some(detailBookEntryIdc)).shaped.<>({r=>import r._; _1.map(_=> BookEntryRelationRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column MASTER_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
    val masterBookEntryIdc: Rep[String] = column[String]("MASTER_BOOK_ENTRY_IDC", O.Length(10,varying=true))
    /** Database column DETAIL_BOOK_ENTRY_IDC SqlType(VARCHAR2), Length(10,true) */
    val detailBookEntryIdc: Rep[String] = column[String]("DETAIL_BOOK_ENTRY_IDC", O.Length(10,varying=true))

    /** Primary key of BookEntryRelation (database name BER_PK_MASTER_BOOK_ENTRY_IDC) */
    val pk = primaryKey("BER_PK_MASTER_BOOK_ENTRY_IDC", (masterBookEntryIdc, detailBookEntryIdc))

    /** Foreign key referencing BookEntry (database name BER_FK_DETAIL_BOOK_ENTRY_IDC) */
    lazy val bookEntryFk1 = foreignKey("BER_FK_DETAIL_BOOK_ENTRY_IDC", detailBookEntryIdc, BookEntry)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing BookEntry (database name BER_FK_MASTER_BOOK_ENTRY_IDC) */
    lazy val bookEntryFk2 = foreignKey("BER_FK_MASTER_BOOK_ENTRY_IDC", masterBookEntryIdc, BookEntry)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BookEntryRelation */
  lazy val BookEntryRelation = new TableQuery(tag => new BookEntryRelation(tag))

  /** Entity class storing rows of table GreatBulkUpdateDef
    *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param defTimestamp Database column DEF_TIMESTAMP SqlType(DATE)
    *  @param userObjectidc Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param reason Database column REASON SqlType(VARCHAR2), Length(128,true)
    *  @param log Database column LOG SqlType(CLOB) */
  case class BulkUpdateDefRow(idValue: String, defTimestamp: Option[java.sql.Timestamp], userObjectidc: Option[String], reason: Option[String], log: Option[java.sql.Clob])
  /** GetResult implicit for fetching BulkUpdateDefRow objects using plain SQL queries */
  implicit def GetResultBulkUpdateDefRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[java.sql.Clob]]): GR[BulkUpdateDefRow] = GR{
    prs => import prs._
      BulkUpdateDefRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_BULK_UPDATE_DEF. Objects of this class serve as prototypes for rows in queries. */
  class BulkUpdateDef(_tableTag: Tag) extends profile.api.Table[BulkUpdateDefRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_DEF") {
    def * = (idValue, defTimestamp, userObjectidc, reason, log) <> (BulkUpdateDefRow.tupled, BulkUpdateDefRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), defTimestamp, userObjectidc, reason, log).shaped.<>({r=>import r._; _1.map(_=> BulkUpdateDefRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
  /** Collection-like TableQuery object for table BulkUpdateDef */
  lazy val BulkUpdateDef = new TableQuery(tag => new BulkUpdateDef(tag))

  /** Entity class storing rows of table GreatBulkUpdateDokuments
    *  @param definitionId Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true)
    *  @param name Database column NAME SqlType(VARCHAR2), Length(52,true)
    *  @param dokument Database column DOKUMENT SqlType(BLOB) */
  case class BulkUpdateDokumentsRow(definitionId: String, name: String, dokument: Option[java.sql.Blob])
  /** GetResult implicit for fetching BulkUpdateDokumentsRow objects using plain SQL queries */
  implicit def GetResultBulkUpdateDokumentsRow(implicit e0: GR[String], e1: GR[Option[java.sql.Blob]]): GR[BulkUpdateDokumentsRow] = GR{
    prs => import prs._
      BulkUpdateDokumentsRow.tupled((<<[String], <<[String], <<?[java.sql.Blob]))
  }
  /** Table description of table GREAT_BULK_UPDATE_DOKUMENTS. Objects of this class serve as prototypes for rows in queries. */
  class BulkUpdateDokuments(_tableTag: Tag) extends profile.api.Table[BulkUpdateDokumentsRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_DOKUMENTS") {
    def * = (definitionId, name, dokument) <> (BulkUpdateDokumentsRow.tupled, BulkUpdateDokumentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(definitionId), Rep.Some(name), dokument).shaped.<>({r=>import r._; _1.map(_=> BulkUpdateDokumentsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true) */
    val definitionId: Rep[String] = column[String]("DEFINITION_ID", O.Length(10,varying=true))
    /** Database column NAME SqlType(VARCHAR2), Length(52,true) */
    val name: Rep[String] = column[String]("NAME", O.Length(52,varying=true))
    /** Database column DOKUMENT SqlType(BLOB) */
    val dokument: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("DOKUMENT")

    /** Primary key of BulkUpdateDokuments (database name BUD_PK_DEFINITION_ID) */
    val pk = primaryKey("BUD_PK_DEFINITION_ID", (definitionId, name))

    /** Foreign key referencing BulkUpdateDef (database name BUD_FK_DEFINITION_ID) */
    lazy val bulkUpdateDefFk = foreignKey("BUD_FK_DEFINITION_ID", definitionId, BulkUpdateDef)(r => r.idValue, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BulkUpdateDokuments */
  lazy val BulkUpdateDokuments = new TableQuery(tag => new BulkUpdateDokuments(tag))

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
  case class BulkUpdateGuaranteeRow(definitionId: String, guaranteeId: String, version: scala.math.BigDecimal, changed: Option[Char], kind: String, kindIndex: scala.math.BigDecimal, debtorPortionPosition: scala.math.BigDecimal, subSubstitutionValue: Option[String], nrsSuccessful: Option[Char])
  /** GetResult implicit for fetching BulkUpdateGuaranteeRow objects using plain SQL queries */
  implicit def GetResultBulkUpdateGuaranteeRow(implicit e0: GR[String], e1: GR[scala.math.BigDecimal], e2: GR[Option[Char]], e3: GR[Option[String]]): GR[BulkUpdateGuaranteeRow] = GR{
    prs => import prs._
      BulkUpdateGuaranteeRow.tupled((<<[String], <<[String], <<[scala.math.BigDecimal], <<?[Char], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<?[String], <<?[Char]))
  }
  /** Table description of table GREAT_BULK_UPDATE_GUARANTEE. Objects of this class serve as prototypes for rows in queries. */
  class BulkUpdateGuarantee(_tableTag: Tag) extends profile.api.Table[BulkUpdateGuaranteeRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_GUARANTEE") {
    def * = (definitionId, guaranteeId, version, changed, kind, kindIndex, debtorPortionPosition, subSubstitutionValue, nrsSuccessful) <> (BulkUpdateGuaranteeRow.tupled, BulkUpdateGuaranteeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(definitionId), Rep.Some(guaranteeId), Rep.Some(version), changed, Rep.Some(kind), Rep.Some(kindIndex), Rep.Some(debtorPortionPosition), subSubstitutionValue, nrsSuccessful).shaped.<>({r=>import r._; _1.map(_=> BulkUpdateGuaranteeRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7.get, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Primary key of BulkUpdateGuarantee (database name BUG_PK_DEFINITION_ID) */
    val pk = primaryKey("BUG_PK_DEFINITION_ID", (definitionId, guaranteeId, version, kind, kindIndex, debtorPortionPosition))

    /** Foreign key referencing BulkUpdateValue (database name BUG_FK_DEFINITION_ID) */
    lazy val bulkUpdateValueFk = foreignKey("BUG_FK_DEFINITION_ID", (definitionId, kind, kindIndex), BulkUpdateValue)(r => (r.definitionId, r.kind, r.kindIndex), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Guarantee (database name BUG_FK_VERSION) */
    lazy val guaranteeFk = foreignKey("BUG_FK_VERSION", (guaranteeId, version), GreatGuarantee)(r => (r.fileIdValue, r.guaranteeVersion), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BulkUpdateGuarantee */
  lazy val BulkUpdateGuarantee = new TableQuery(tag => new BulkUpdateGuarantee(tag))

  /** Entity class storing rows of table GreatBulkUpdateRun
    *  @param idValue Database column ID_VALUE SqlType(VARCHAR2), PrimaryKey, Length(10,true)
    *  @param execTimestamp Database column EXEC_TIMESTAMP SqlType(DATE)
    *  @param userObjectidc Database column USER_OBJECTIDC SqlType(VARCHAR2), Length(10,true)
    *  @param definitionIdValue Database column DEFINITION_ID_VALUE SqlType(VARCHAR2), Length(10,true)
    *  @param log Database column LOG SqlType(CLOB) */
  case class BulkUpdateRunRow(idValue: String, execTimestamp: Option[java.sql.Timestamp], userObjectidc: Option[String], definitionIdValue: Option[String], log: Option[java.sql.Clob])
  /** GetResult implicit for fetching BulkUpdateRunRow objects using plain SQL queries */
  implicit def GetResultBulkUpdateRunRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[java.sql.Clob]]): GR[BulkUpdateRunRow] = GR{
    prs => import prs._
      BulkUpdateRunRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Clob]))
  }
  /** Table description of table GREAT_BULK_UPDATE_RUN. Objects of this class serve as prototypes for rows in queries. */
  class BulkUpdateRun(_tableTag: Tag) extends profile.api.Table[BulkUpdateRunRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_RUN") {
    def * = (idValue, execTimestamp, userObjectidc, definitionIdValue, log) <> (BulkUpdateRunRow.tupled, BulkUpdateRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), execTimestamp, userObjectidc, definitionIdValue, log).shaped.<>({r=>import r._; _1.map(_=> BulkUpdateRunRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Foreign key referencing BulkUpdateDef (database name BUR_FK_DEFINITION_ID_VALUE) */
    lazy val bulkUpdateDefFk = foreignKey("BUR_FK_DEFINITION_ID_VALUE", definitionIdValue, BulkUpdateDef)(r => Rep.Some(r.idValue), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BulkUpdateRun */
  lazy val BulkUpdateRun = new TableQuery(tag => new BulkUpdateRun(tag))

  /** Entity class storing rows of table GreatBulkUpdateValue
    *  @param definitionId Database column DEFINITION_ID SqlType(VARCHAR2), Length(10,true)
    *  @param kind Database column KIND SqlType(VARCHAR2), Length(52,true)
    *  @param oldValue Database column OLD_VALUE SqlType(VARCHAR2), Length(52,true)
    *  @param newValue Database column NEW_VALUE SqlType(VARCHAR2), Length(52,true)
    *  @param subSubstitution Database column SUB_SUBSTITUTION SqlType(CHAR)
    *  @param kindIndex Database column KIND_INDEX SqlType(NUMBER) */
  case class BulkUpdateValueRow(definitionId: String, kind: String, oldValue: Option[String], newValue: Option[String], subSubstitution: Option[Char], kindIndex: scala.math.BigDecimal)
  /** GetResult implicit for fetching BulkUpdateValueRow objects using plain SQL queries */
  implicit def GetResultBulkUpdateValueRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Char]], e3: GR[scala.math.BigDecimal]): GR[BulkUpdateValueRow] = GR{
    prs => import prs._
      BulkUpdateValueRow.tupled((<<[String], <<[String], <<?[String], <<?[String], <<?[Char], <<[scala.math.BigDecimal]))
  }
  /** Table description of table GREAT_BULK_UPDATE_VALUE. Objects of this class serve as prototypes for rows in queries. */
  class BulkUpdateValue(_tableTag: Tag) extends profile.api.Table[BulkUpdateValueRow](_tableTag, Some("WERNER2"), "GREAT_BULK_UPDATE_VALUE") {
    def * = (definitionId, kind, oldValue, newValue, subSubstitution, kindIndex) <> (BulkUpdateValueRow.tupled, BulkUpdateValueRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(definitionId), Rep.Some(kind), oldValue, newValue, subSubstitution, Rep.Some(kindIndex)).shaped.<>({r=>import r._; _1.map(_=> BulkUpdateValueRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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

    /** Primary key of BulkUpdateValue (database name BUV_PK_DEFINITION_ID) */
    val pk = primaryKey("BUV_PK_DEFINITION_ID", (definitionId, kind, kindIndex))

    /** Foreign key referencing BulkUpdateDef (database name BUV_FK_DEFINITION_ID) */
    lazy val bulkUpdateDefFk = foreignKey("BUV_FK_DEFINITION_ID", definitionId, BulkUpdateDef)(r => r.idValue, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table BulkUpdateValue */
  lazy val BulkUpdateValue = new TableQuery(tag => new BulkUpdateValue(tag))


  /** Row type of table BalanceSheetReportDef */
  type BalanceSheetReportDefRow = HCons[String,HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Char],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for BalanceSheetReportDefRow providing default values if available in the database schema. */
  def BalanceSheetReportDefRow(idValue: String, kind: Option[String], reportDate: Option[java.sql.Timestamp], userName: Option[String], accEmail: Option[String], b40Active: Option[Char], b40EmailSubject: Option[String], b40EmailText: Option[String], b40CoverLetterFilePath: Option[String], b40DivisionTableFilePath: Option[String], b40ParameterFilePath: Option[String], frnActive: Option[Char], frnEmailSubject: Option[String], frnEmailText: Option[String], frnCoverLetterFilePath: Option[String], frnDivisionTableFilePath: Option[String], ownActive: Option[Char], ownEmailSubject: Option[String], ownEmailText: Option[String], ownCoverLetterFilePath: Option[String], ownDivisionTableFilePath: Option[String], bareCodes: Option[String], exdActive: Option[Char], exdEmailSubject: Option[String], exdEmailText: Option[String], exdCoverLetterFilePath: Option[String], exdReceivers: Option[String], sktfActive: Option[Char], sktfEmailSubject: Option[String], sktfEmailText: Option[String], sktfCoverLetterFilePath: Option[String], sktfReceivers: Option[String], rpaActive: Option[Char], rpaEmailSubject: Option[String], rpaEmailText: Option[String], rpaCoverLetterFilePath: Option[String], rpaMasterTableFilePath: Option[String]): BalanceSheetReportDefRow = {
    idValue :: kind :: reportDate :: userName :: accEmail :: b40Active :: b40EmailSubject :: b40EmailText :: b40CoverLetterFilePath :: b40DivisionTableFilePath :: b40ParameterFilePath :: frnActive :: frnEmailSubject :: frnEmailText :: frnCoverLetterFilePath :: frnDivisionTableFilePath :: ownActive :: ownEmailSubject :: ownEmailText :: ownCoverLetterFilePath :: ownDivisionTableFilePath :: bareCodes :: exdActive :: exdEmailSubject :: exdEmailText :: exdCoverLetterFilePath :: exdReceivers :: sktfActive :: sktfEmailSubject :: sktfEmailText :: sktfCoverLetterFilePath :: sktfReceivers :: rpaActive :: rpaEmailSubject :: rpaEmailText :: rpaCoverLetterFilePath :: rpaMasterTableFilePath :: HNil
  }
  /** GetResult implicit for fetching BalanceSheetReportDefRow objects using plain SQL queries */
  implicit def GetResultBalanceSheetReportDefRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Char]]): GR[BalanceSheetReportDefRow] = GR{
    prs => import prs._
      <<[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Char] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table GREAT_BALANCE_SHEET_REPORT_DEF. Objects of this class serve as prototypes for rows in queries. */
  class BalanceSheetReportDef(_tableTag: Tag) extends profile.api.Table[BalanceSheetReportDefRow](_tableTag, Some("WERNER2"), "GREAT_BALANCE_SHEET_REPORT_DEF") {
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
  /** Collection-like TableQuery object for table BalanceSheetReportDef */
  lazy val BalanceSheetReportDef = new TableQuery(tag => new BalanceSheetReportDef(tag))

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
  case class BalanceSheetReportRunRow(idValue: String, execTimestamp: Option[java.sql.Timestamp], userObjectidc: Option[String], status: Option[String], definitionIdValue: Option[String], zipFileLength: Option[scala.math.BigDecimal], zipFile: Option[java.sql.Blob], archived: Option[Char], runKind: Option[Char])
  /** GetResult implicit for fetching BalanceSheetReportRunRow objects using plain SQL queries */
  implicit def GetResultBalanceSheetReportRunRow(implicit e0: GR[String], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[java.sql.Blob]], e5: GR[Option[Char]]): GR[BalanceSheetReportRunRow] = GR{
    prs => import prs._
      BalanceSheetReportRunRow.tupled((<<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[java.sql.Blob], <<?[Char], <<?[Char]))
  }
  /** Table description of table GREAT_BALANCE_SHEET_REPORT_RUN. Objects of this class serve as prototypes for rows in queries. */
  class BalanceSheetReportRun(_tableTag: Tag) extends profile.api.Table[BalanceSheetReportRunRow](_tableTag, Some("WERNER2"), "GREAT_BALANCE_SHEET_REPORT_RUN") {
    def * = (idValue, execTimestamp, userObjectidc, status, definitionIdValue, zipFileLength, zipFile, archived, runKind) <> (BalanceSheetReportRunRow.tupled, BalanceSheetReportRunRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idValue), execTimestamp, userObjectidc, status, definitionIdValue, zipFileLength, zipFile, archived, runKind).shaped.<>({r=>import r._; _1.map(_=> BalanceSheetReportRunRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
  /** Collection-like TableQuery object for table BalanceSheetReportRun */
  lazy val BalanceSheetReportRun = new TableQuery(tag => new BalanceSheetReportRun(tag))

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
    lazy val greatBareDependantsFk = foreignKey("BBR_FK_BARE", bare, BareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBillingRun (database name BBR_FK_BILLING_RUN_IDC) */
    lazy val greatBillingRunFk = foreignKey("BBR_FK_BILLING_RUN_IDC", billingRunIdc, BillingRun)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatBareBillingRun */
  lazy val GreatBareBillingRun = new TableQuery(tag => new GreatBareBillingRun(tag))



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
    lazy val greatBareDependantsFk = foreignKey("GCRBD_FK_BARE_CODE", bareCode, BareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
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
    lazy val greatBareDependantsFk = foreignKey("CIT_FK_BARE", bare :: HNil, BareDependants)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBookEntry (database name CIT_FK_BOOK_ENTRY_IDC) */
    lazy val greatBookEntryFk = foreignKey("CIT_FK_BOOK_ENTRY_IDC", bookEntryIdc :: HNil, BookEntry)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name CIT_FK_COMMISSION_RECEIVER) */
    lazy val greatCommissionReceiverFk = foreignKey("CIT_FK_COMMISSION_RECEIVER", commissionReceiver :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name CIT_FK_TARGET_AMOUNT_CUR) */
    lazy val greatCurrencyFk = foreignKey("CIT_FK_TARGET_AMOUNT_CUR", targetAmountCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name CIT_FK_FILE_ID_VALUE) */
    lazy val greatGuaranteeFileFk = foreignKey("CIT_FK_FILE_ID_VALUE", fileIdValue :: HNil, GreatGuaranteeFile)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name CIT_FK_ORG_ID) */
    lazy val greatOrgFk = foreignKey("CIT_FK_ORG_ID", orgId :: HNil, Org)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatCostItem */
  lazy val GreatCostItem = new TableQuery(tag => new GreatCostItem(tag))

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
    lazy val greatAccountingAreaFk = foreignKey("INV_FK_INVOICE_ARE", invoiceAre :: HNil, AccountingArea)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatBillingRun (database name INV_FK_BILLING_RUN_IDC) */
    lazy val greatBillingRunFk = foreignKey("INV_FK_BILLING_RUN_IDC", billingRunIdc :: HNil, BillingRun)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCommissionReceiver (database name INV_FK_COMMISSION_RECEIVER) */
    lazy val greatCommissionReceiverFk = foreignKey("INV_FK_COMMISSION_RECEIVER", commissionReceiver :: HNil, GreatCommissionReceiver)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name INV_FK_AMOUNT_CUR) */
    lazy val greatCurrencyFk = foreignKey("INV_FK_AMOUNT_CUR", amountCur :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGuaranteeFile (database name INV_FK_FILE_ID_VALUE) */
    lazy val greatGuaranteeFileFk = foreignKey("INV_FK_FILE_ID_VALUE", fileIdValue :: HNil, GreatGuaranteeFile)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name INV_FK_INVOICE_ORG) */
    lazy val greatOrgFk6 = foreignKey("INV_FK_INVOICE_ORG", invoiceOrg :: HNil, Org)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name INV_FK_ISSUERS_ORG) */
    lazy val greatOrgFk7 = foreignKey("INV_FK_ISSUERS_ORG", issuersOrg :: HNil, Org)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
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
    lazy val greatCurrencyFk = foreignKey("ILI_FK_AMOUNT_CUR", amountCur, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
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
    lazy val greatBareDependantsFk = foreignKey("INVN_FK_BARE_GROUP_ID", bareGroupId, BareDependants)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
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
    lazy val greatBareDependantsFk = foreignKey("INVP_FK_BARE_GROUP", bareGroup, BareDependants)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name INVP_FK_INVOICED_AMOUNT_CURR0) */
    lazy val greatCurrencyFk = foreignKey("INVP_FK_INVOICED_AMOUNT_CURR0", invoicedAmountCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

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
    lazy val greatCurrencyFk = foreignKey("PAYM_FK_CURRENCY", currency :: HNil, Currency)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatOrg (database name PAYM_FK_INVOICE_ORG_ID) */
    lazy val greatOrgFk = foreignKey("PAYM_FK_INVOICE_ORG_ID", invoiceOrgId :: HNil, Org)(r => Rep.Some(r.objectidc) :: HNil, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (fileIdValue) (database name PAYM_IDX0) */
    val index1 = index("PAYM_IDX0", fileIdValue :: HNil)
  }
  /** Collection-like TableQuery object for table GreatPayment */
  lazy val GreatPayment = new TableQuery(tag => new GreatPayment(tag))



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
    lazy val greatCurrencyFk = foreignKey("PSE_FK_AMOUNT_CURRENCY", amountCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineContract (database name PSE_FK_LINE_ID) */
    lazy val greatGlineContractFk = foreignKey("PSE_FK_LINE_ID", lineId, GlineContract)(r => r.objectidc, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
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
    lazy val greatCurrencyFk = foreignKey("PSEH_FK_AMOUNT_CURRENCY", amountCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatGlineContractHistory (database name PSEH_FK_LINE_VERSION) */
    lazy val greatGlineContractHistoryFk = foreignKey("PSEH_FK_LINE_VERSION", (lineId, lineVersion), GlineContractHistory)(r => (r.objectidc, r.objectversionc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
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
    lazy val greatCurrencyFk1 = foreignKey("QRES_FK_BASE_LIABILITY_CURRE0", baseLiabilityCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name QRES_FK_CALC_RESERVES_ORIG_C3) */
    lazy val greatCurrencyFk2 = foreignKey("QRES_FK_CALC_RESERVES_ORIG_C3", calcReservesOrigCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name QRES_FK_HGB_CALCULATED_CURRE1) */
    lazy val greatCurrencyFk3 = foreignKey("QRES_FK_HGB_CALCULATED_CURRE1", hgbCalculatedCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing GreatCurrency (database name QRES_FK_USG_CALCULATED_CURRE2) */
    lazy val greatCurrencyFk4 = foreignKey("QRES_FK_USG_CALCULATED_CURRE2", usgCalculatedCurrency, Currency)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)

    /** Index over (debtorPortionId) (database name QRES_IDX0) */
    val index1 = index("QRES_IDX0", debtorPortionId)
  }
  /** Collection-like TableQuery object for table GreatQuarterlyReserves */
  lazy val GreatQuarterlyReserves = new TableQuery(tag => new GreatQuarterlyReserves(tag))



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
    lazy val greatDivisionUserFk = foreignKey("RC_FK_FROM_USER", fromUser, DivisionUser)(r => Rep.Some(r.objectidc), onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table GreatReconciliationProcess */
  lazy val GreatReconciliationProcess = new TableQuery(tag => new GreatReconciliationProcess(tag))


}
