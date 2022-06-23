-- Inserting the Data into the table --

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
	      String sql = "INSERT INTO MOVIES values ('Moonfall','PatrickWilson','HalleBerry',2022,'RolandEmmerich');"; 
	                  
	      stmt.executeUpdate(sql);

	      sql ="INSERT INTO MOVIES values ('Passengers','ChrisPratt','JenniferLawrence',2016,'MortenTyldum');";
	      stmt.executeUpdate(sql);

	      sql = "INSERT INTO MOVIES values ('TheMazeRunner','DylanOBrien','KayaScodelario',2014,'WesBall');";
	      stmt.executeUpdate(sql);

	      sql = "INSERT INTO MOVIES values ('BirdBox','TrevanteRhodes','SandraBullock',2018,'SusanneBier');";
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }
	}
