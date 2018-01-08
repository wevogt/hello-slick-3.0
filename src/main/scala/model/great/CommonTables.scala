package model.great

object CommonTables extends {
  val profile = slick.jdbc.OracleProfile
} with CommonTables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait CommonTables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import model.great.AdminTables._
  import model.great.GuaranteeAllTables._
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(GreatArchivingBarcode.schema, GreatArchivingIxosResult.schema, GreatArchivingMetadata.schema, GreatArchivingTransported.schema, GreatAuditLog.schema, GreatBatchDriver.schema, GreatBatchJobDescription.schema, GreatBatchJobRun.schema, GreatEnterprise.schema, GreatGmsState.schema, GreatGmsTransfer.schema, GreatGmsTransferEntity.schema, GreatImport.schema, GreatInternatTexts.schema, GreatMessageAttachment.schema, GreatMessageEvent.schema, GreatMessageInfo.schema, GreatOpenftParameter.schema, GreatReminderRun.schema, GreatServerstatsSnapshot.schema, GreatUniqueIds.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema


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


}
