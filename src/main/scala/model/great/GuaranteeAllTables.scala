package model.great

// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object GuaranteeAllTables extends {
  val profile = slick.jdbc.OracleProfile
} with GuaranteeAllTables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait GuaranteeAllTables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  import model.great.BackOfficeTables._
  import model.great.CommonTables._
  import model.great.MasterDataTables._
  import model.great.AdminTables._

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(GreatAccountConsumption.schema, GreatAnnotatedAmount.schema, GreatConsumption.schema, GreatContractConsumption.schema, GreatDebtorPortion.schema, GreatExemptions.schema, GreatGassociation.schema, GreatGassociationHistory.schema, GreatGassociationMember.schema, GreatGuarantee.schema, GreatGuaranteeAttachment.schema, GreatGuaranteeFile.schema, GreatGuaranteeScheduler2.schema, GreatRequest.schema, GreatSettlement.schema, GreatSviewConstraint.schema, GreatUnitAttributeChoice.schema, GreatUnitAttributes.schema, GreatWorkflowStep.schema).reduceLeft(_ ++ _)
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
