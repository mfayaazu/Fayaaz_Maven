package Java_cert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question29 {
    static Connection newConnection=null;
    public static Connection getDBConnection(){
        try{
            Connection con = DriverManager.getConnection("jdbc:h2:mem:default");
            newConnection=con;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getDBConnection();
        Statement st = newConnection.createStatement();
        st.executeUpdate("INSERT INTO STUDENT VALUES (101,'PRIYANKA')");
    }
}

//Correct option is C: A SQLException is thrown as runtime.
//The connection is created in try with resources.
//So is closed when try clause finishes.
//Creating statement upon closed connection produces SQLException.