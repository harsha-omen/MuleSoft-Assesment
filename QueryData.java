-- Querying data from Movies table --

package sqlitepracticedemo;
import java.sql.*;

public class Sqlitemovie {

	public static void main(String[] args) {
		Connection c = null;
	    Statement stmt = null;
	    try {
	    	c = DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\HARSHA\\OneDrive\\Desktop\\sqlite\\sqlite-tools-win32-x86-3380500\\sqlite-tools-win32-x86-3380500\\MOVIES.db");
	        c.setAutoCommit(false);
	        System.out.println("Opened database successfully");

	        stmt = c.createStatement();
	        ResultSet rs = stmt.executeQuery( "SELECT * FROM MOVIES;" );
	        while ( rs.next() ) {
	           String Moviename= rs.getString("Movie_name");

	           String  Leadactor = rs.getString("Lead_actor");
	  	 String  Leadactress = rs.getString("Lead_actress");
	           Integer Releaseyear  = rs.getInt("Release_year");
	           String  Directorname = rs.getString("Director_name");
	           System.out.println( "Movie = " + Moviename );
	           System.out.println( "Lead Actor = " + Leadactor );
	           System.out.println( "Lead Actress = " + Leadactress );
	           System.out.println( "Release year = " + Releaseyear );
	           System.out.println( "Director = " + Directorname );
	           System.out.println();
	        }
	        rs.close();
	        stmt.close();
	        c.close();
	      } catch ( Exception e ) {
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
	      }
	      System.out.println(" Querying done successfully");
	    }
	  }


