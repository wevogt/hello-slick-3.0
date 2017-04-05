package utils.communication

/**
 * Created by werner on 15.08.15.
 *
 * Beispiel für Zugriff auf Mail-Account und neue ungelesen Nachrichten
 *
 * Hier über GMX-Account    (Programmparameter: imap.gmx.net xxx@gmx.de passwd)
 * Hier über Gmail-Account  (Programmparameter: imap.gmail.com 993 xxx@gmail.com passwd)
 *
 */
import javax.mail._

object ScalaImapSsl {

  def main(args: Array[String]) {
    val props = System.getProperties()
    props.setProperty("mail.store.protocol", "imaps")
    props.setProperty("mail.imaps.auth", "true")
    val session = Session.getDefaultInstance(props, null)
    val store = session.getStore("imaps")   // SSL-Verbindung über imaps
    //store.connect("imap.mail.yahoo.com", "<al@yahoo.com>", "password")
    try {
      // use imap.gmail.com for gmail
      if (args(0)=="imap.gmail.com") {
        val port :Int = args(1).toInt
        store.connect(args(0), port, args(2), args(3))
      } else {
        store.connect(args(0), args(1), args(2))
      }
      val inbox = store.getFolder("Inbox")
      inbox.open(Folder.READ_ONLY)

      // limit this to 50 message during testing
      val messages = inbox.getMessages()
      val limit = 50
      var count = 0
      for (message <- messages.reverse) {   // Sortierung aktuellste Nachrichten zuerst (umgekehrte Reihenfolge)
        if (message.getFlags.contains(Flags.Flag.RECENT) && !message.getFlags.contains(Flags.Flag.SEEN)) {  // neue nicht gelesene Nachrichten
          count = count + 1
          if (count > limit) System.exit(0)
          println(count + ": \tReceived: " + message.getSentDate + "\tSubject: " + message.getSubject())
        }
      }
      inbox.close(true)
    } catch {
      case e: NoSuchProviderException =>  e.printStackTrace()
        System.exit(1)
      case me: MessagingException =>      me.printStackTrace()
        System.exit(2)
    } finally {
      store.close()
    }
  }
}