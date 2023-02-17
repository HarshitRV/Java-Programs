// This program demonstrates how to connect to the my sql database

package src.college.understanding_DBConnectivity;

import java.sql.*;

public class ConnectionDB {
    public static void main(String[] args) {
        Connection con = null;
        try {

            // Connection data
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

            System.out.println("Success" + con);

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
