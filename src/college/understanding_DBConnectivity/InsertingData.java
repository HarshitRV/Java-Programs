// Program to insert data into the table

package src.college.understanding_DBConnectivity;

import java.sql.*;

public class InsertingData {
    public static void main(String[] args) {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB");

            // Query string to insert data into the DataBase.
            String query = "INSERT INTO t1 values(1, 'Harshit')";

            Statement st = con.createStatement();
            st.execute(query);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Exiting....");
    }
}
