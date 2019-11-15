package Java_cert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question52 {

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");

    try  {
      Statement stmt = conn.createStatement();
      String query = "SELECT ID FROM EMPLOYEE";
      stmt.execute(query);
      stmt.execute("SELECT ID FROM CUSTOMER");
     /* while (rs.next()) {
//process the results
        System.out.println("Employee ID: "+ rs.getInt("id"));
      }*/
    } catch (Exception e) {
      System.out.println (e.getMessage());
    }
  }

}

/*
Answer is C
Exception is thrown because ResultSet not open. It is automatically closed when stmt.executeQuery is called at line 13.
 */
