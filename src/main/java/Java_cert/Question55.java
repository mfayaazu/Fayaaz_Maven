package Java_cert;

import java.sql.*;


public class Question55 {

    public static void main(String[] args) throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Oct@2019");
            String query = "select * from Fayaaz.item where id=110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Id"));
                System.out.println("DESCRIPTION: " + rs.getString("descrip"));
                System.out.println("PRICE: " + rs.getDouble("price"));
                System.out.println("QUANTITY: " + rs.getInt("quantity"));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


//output:
/*
ID: 110
DESCRIPTION: fayaaz
PRICE: 110.0
QUANTITY: 10
 */

//correct answer us D. the code will show all the information about item 110;