package jdbcsample;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSample {

  public static void main(String argv[]) {
    
   System.out.println("debut main");

    String strResultsetTime ="vide";
    String strResultsetSelect ="vide";

    // Get time from DB server
    try {
      String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;database=maBase" ;//localhost\\SQLEXPRESS";
      String username = "sa";
      String password = "P@ssword01";

      Connection conn = DriverManager.getConnection(url, username, password);
      
      //*** general info on connection
      DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
      System.out.println("  Driver name: " + dm.getDriverName());
      System.out.println("  Driver version: " + dm.getDriverVersion());
      System.out.println("  Product name: " + dm.getDatabaseProductName());
      System.out.println("  Product version: " + dm.getDatabaseProductVersion());      
      //********************************
      
      Statement stmt1 = conn.createStatement();
      Statement stmt2 = conn.createStatement();
      
      ResultSet resultSetTime = stmt1.executeQuery("SELECT CURRENT_TIMESTAMP");
      ResultSet resultSetSelect = stmt2.executeQuery("SELECT * from listecourses");
      
      if (resultSetTime.next()) {
    	  
    	  strResultsetTime = resultSetTime.getObject(1).toString();
      }
      System.out.println("Successfully executed query.  strResultsetTime : \n " + strResultsetTime + "\n\n");
      
      int i = 0;
      while (resultSetSelect.next()) {
    	if (i == 0)
    		System.out.println("Successfully executed query for time : ");
    	i++;
    	  strResultsetSelect = resultSetSelect.getString(1)+"  |  "+resultSetSelect.getString(2)+"  |  "+resultSetSelect.getString(3);
    	  System.out.println(strResultsetSelect);
      }

    } catch (Exception e) {
    	 e.printStackTrace() ;
     //System.out.println("Caught exception: " +  e.printStackTrace());
    }
  }
}