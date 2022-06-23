 --Table Creation--    

package sqlitepracticedemo;
import java.sql.*;

public class SQLitemovie{

    public static void main( String args[] )
      {
        Connection c = null;
        Statement stmt = null;
        try {
          c = DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\HARSHA\\OneDrive\\Desktop\\sqlite\\sqlite-tools-win32-x86-3380500\\sqlite-tools-win32-x86-3380500\\MOVIES.db");
          System.out.println("Opened database successfully");
    
          stmt = c.createStatement();
          String sql = "CREATE TABLE MOVIES " +
                       "(Movie_name TEXT  NOT NULL," +
                       " Lead_actor    TEXT    NOT NULL, " + 
                       " Lead_actress TEXT    NOT NULL, " + 
                       " Release_year  INTEGER NOT NULL, " + 
                       " Director_name TEXT NOT NULL)"; 
          stmt.executeUpdate(sql);    
          stmt.close();    
          c.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("Table created successfully");
      }
