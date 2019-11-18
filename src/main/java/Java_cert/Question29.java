package Java_cert;

import java.sql.*;

public class Question29 {
    static Connection newConnection=null;
    public static Connection getDBConnection(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Oct@2019");
            newConnection=con;
            return newConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        //getDBConnection();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Oct@2019");
        newConnection = con;
        Statement st =newConnection.createStatement();
        st.executeUpdate("insert into Fayaaz.student values (102,'Abhinav')");


    }
}

//Correct option is C: A SQLException is thrown as runtime.
//The connection is created in try with resources.
//So is closed when try clause finishes.
//Creating statement upon closed connection produces SQLException.