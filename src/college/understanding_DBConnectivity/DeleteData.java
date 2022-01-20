// Program to demonstrate on how to delete a data from the table using id.

package src.college.understanding_DBConnectivity;

import java.io.*;
import java.sql.*;

public class DeleteData {
    public static void main(String[] args) {
        Console c = System.console();
        Connection con = null;
        String id = c.readLine("Enter the id you wish to delete: ");

        try {
            
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "";

            // Establishing connection to Database.
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB\n");

            // Creating and exectuing the query.
            String queryStr = String.format("DELETE FROM t1 WHERE id=%s", id);
            Statement st = con.createStatement();
            // Returns 0 (int) if id doesn't exists after excuting query.
            int i = st.executeUpdate(queryStr);

            if (i == 0){
                System.out.println(id + " doesn't exists");
            } else {
                System.out.println("Deleted entry with id = " + id);
            }

        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Exiting...");
    }
}
