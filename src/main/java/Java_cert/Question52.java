package Java_cert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question52 {

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:h2:mem:default");
    String query = "SELECT id FROM Employee";
    try (Statement stmt = conn.createStatement()) {
      ResultSet rs = stmt.executeQuery(query);
      stmt.executeQuery("SELECT id FROM Customer");
      while (rs.next()) {
//process the results
        System.out.println("Employee ID: "+ rs.getInt("id"));
      }
    } catch (Exception e) {
      System.out.println ("Error");
    }
  }

}
