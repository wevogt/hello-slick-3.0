
//import org.h2.engine.Database
import java.sql.{Clob, Timestamp}

import model.great.AdminTables.PersonRow
import model.great.CommonTables.AuditLogRow
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

import scala.concurrent.Await
import scala.concurrent.duration.Duration

// The main application
object GreatDBSetup extends App {

  val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("great-h2mem-test")
  import dbConfig.profile.api._
  import slick.dbio.DBIO
  import slick.lifted
  import slick.lifted.TableQuery

  import scala.concurrent.Future

  implicit val ec = scala.concurrent.ExecutionContext.global
  try {

    val auditLogs: TableQuery[model.great.CommonTables.AuditLog] = lifted.TableQuery[model.great.CommonTables.AuditLog]
    val persons: TableQuery[model.great.AdminTables.Person] = lifted.TableQuery[model.great.AdminTables.Person]
//    val commonTables: TableQuery[model.great.CommonTables.schema] = lifted.TableQuery[model.great.CommonTables]

    val setupAction: DBIO[Unit] = DBIO.seq(
      // Create the schema by combining the DDLs for the Suppliers and Coffees
      // tables using the query interfaces
      (
        model.great.AdminTables.Person.schema ++
        model.great.MasterDataTables.Country.schema ++
        model.great.MasterDataTables.Language.schema ++
        model.great.MasterDataTables.AccountingArea.schema ++
        model.great.AdminTables.UserAccount.schema ++
        model.great.AdminTables.Division.schema ++
        model.great.AdminTables.DivisionUser.schema ++
        model.great.AdminTables.UserGroup.schema ++
        model.great.CommonTables.MessageEvent.schema ++
        model.great.CommonTables.MessageInfo.schema ++
        model.great.CommonTables.MessageAttachment.schema ++
        auditLogs.schema).create
//      (model.great.CommonTables.schema.createStatements),

      ,persons    += new model.great.AdminTables.PersonRow( personKey =" 001", name = Some("Peter Pan"), None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
      ,persons    += new model.great.AdminTables.PersonRow( personKey =" 002", name = Some("Norma Jean"), None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
      ,persons    += new model.great.AdminTables.PersonRow( personKey =" 003", name = Some("Peter Fonda"), None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
      ,auditLogs  += model.great.CommonTables.AuditLogRow("00001", Some("Bond"), Some(new Timestamp(System.currentTimeMillis()))  , None, Some("division"))
      ,auditLogs  += model.great.CommonTables.AuditLogRow("00002", Some("Peter Pan"), Some(new Timestamp(System.currentTimeMillis()))  , None, Some("division neu"))
    )

    val setupFuture: Future[Unit] = dbConfig.db.run(setupAction)

    val f = setupFuture.flatMap { _ =>

      val allAuditLogsAction: DBIO[Seq[model.great.CommonTables.AuditLogRow]] =
        auditLogs.result

      val allAuditLogs: Future[Seq[AuditLogRow]] =
        dbConfig.db.run(allAuditLogsAction)


      allAuditLogs.map { allAuditLogs =>
        allAuditLogs.foreach(println)
//        allAuditLogs.foreach(_.what.getOrElse("default") -> println)
      }

      val allPersonsAction: DBIO[Seq[model.great.AdminTables.PersonRow]] =
        persons.result

      val allPersons: Future[Seq[PersonRow]] =
        dbConfig.db.run(allPersonsAction)

      allPersons.map { allPersons =>
        allPersons.foreach(println)
      }

    } (ec)

      /*
          }.flatMap { _ =>

            /* Streaming */

            val coffeeNamesAction: StreamingDBIO[Seq[String], String] =
              coffees.map(_.name).result

            val coffeeNamesPublisher: DatabasePublisher[String] =
              dbConfig.db.stream(coffeeNamesAction)

            coffeeNamesPublisher.foreach(println)

          }.flatMap { _ =>

            /* Filtering / Where */

            // Construct a query where the price of Coffees is > 9.0
            val filterQuery: Query[Coffees, (String, Int, Double, Int, Int), Seq] =
              coffees.filter(_.price > 9.0)

            // Print the SQL for the filter query
            println("Generated SQL for filter query:\n" + filterQuery.result.statements)

            // Execute the query and print the Seq of results
            db.run(filterQuery.result.map(println))

          }.flatMap { _ =>

            /* Update */

            // Construct an update query with the sales column being the one to update
            val updateQuery: Query[Rep[Int], Int, Seq] = coffees.map(_.sales)

            val updateAction: DBIO[Int] = updateQuery.update(1)

            // Print the SQL for the Coffees update query
            println("Generated SQL for Coffees update:\n" + updateQuery.updateStatement)

            // Perform the update
            db.run(updateAction.map { numUpdatedRows =>
              println(s"Updated $numUpdatedRows rows")
            })

          }.flatMap { _ =>

            /* Delete */

            // Construct a delete query that deletes coffees with a price less than 8.0
            val deleteQuery: Query[Coffees,(String, Int, Double, Int, Int), Seq] =
              coffees.filter(_.price < 8.0)

            val deleteAction = deleteQuery.delete

            // Print the SQL for the Coffees delete query
            println("Generated SQL for Coffees delete:\n" + deleteAction.statements)

            // Perform the delete
            db.run(deleteAction).map { numDeletedRows =>
              println(s"Deleted $numDeletedRows rows")
            }

          }.flatMap { _ =>

            /* Sorting / Order By */

            val sortByPriceQuery: Query[Coffees, (String, Int, Double, Int, Int), Seq] =
              coffees.sortBy(_.price)

            println("Generated SQL for query sorted by price:\n" +
              sortByPriceQuery.result.statements)

            // Execute the query
            db.run(sortByPriceQuery.result).map(println)

          }.flatMap { _ =>

            /* Query Composition */

            val composedQuery: Query[Rep[String], String, Seq] =
              coffees.sortBy(_.name).take(3).filter(_.price > 9.0).map(_.name)

            println("Generated SQL for composed query:\n" +
              composedQuery.result.statements)

            // Execute the composed query
            db.run(composedQuery.result).map(println)

          }.flatMap { _ =>

            /* Joins */

            // Join the tables using the relationship defined in the Coffees table
            val joinQuery: Query[(Rep[String], Rep[String]), (String, String), Seq] = for {
              c <- coffees if c.price > 9.0
              s <- c.supplier
            } yield (c.name, s.name)

            println("Generated SQL for the join query:\n" + joinQuery.result.statements)

            // Print the rows which contain the coffee name and the supplier name
            db.run(joinQuery.result).map(println)

          }.flatMap { _ =>

            /* Computed Values */

            // Create a new computed column that calculates the max price
            val maxPriceColumn: Rep[Option[Double]] = coffees.map(_.price).max

            println("Generated SQL for max price column:\n" + maxPriceColumn.result.statements)

            // Execute the computed value query
            db.run(maxPriceColumn.result).map(println)

          }.flatMap { _ =>

            /* Manual SQL / String Interpolation */

            // A value to insert into the statement
            val state = "CA"

            // Construct a SQL statement manually with an interpolated value
            val plainQuery = sql"select SUP_NAME from SUPPLIERS where STATE = $state".as[String]

            println("Generated SQL for plain query:\n" + plainQuery.statements)

            // Execute the query
            db.run(plainQuery).map(println)

          }
     */
          Await.result(f, Duration.Inf)

  } finally dbConfig.db.close
}
