package Java_cert;

import java.sql.*;

public class Question70 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Oct@2019");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                ResultSet.CONCUR_UPDATABLE);
            st.execute("SELECT * FROM Fayaaz.employee");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                if (rs.getInt(1) == 112) {
                    rs.updateString(2, "Jack");
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        } catch (SQLException ex) {
            System.out.println("Exception is raised");
        }
    }
}


//output: 112 Jerry

//Correct answer is C
