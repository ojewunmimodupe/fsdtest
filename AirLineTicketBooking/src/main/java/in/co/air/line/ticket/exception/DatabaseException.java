package in.co.air.line.ticket.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 */

public class DatabaseException  extends Exception
{
	/**
    * @param msg
    *            : Error message
    */
   public DatabaseException(String msg) {
       super(msg);
   }
}

