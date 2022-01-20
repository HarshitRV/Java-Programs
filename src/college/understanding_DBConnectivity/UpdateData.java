// Program to demonstrate on how to update a particular record in the database.

package src.college.understanding_DBConnectivity;

import java.io.*;
import java.sql.*;

public class UpdateData {
    public static void main(String[] args) {
        Console c = System.console();
        Connection con = null;

        String id = c.readLine("Enter id : ");
        String colName = c.readLine("Enter name of the column: ");
        String newValue = c.readLine("Enter new value: ");

        try {
            // Connection data
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "";

            // Establishing connection to the database.
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB\n");

            // Creating and executing query.                    ' ' <- don't miss this
            String queryStr = String.format("UPDATE t1 SET %s = '%s' WHERE id = %s",colName, newValue, id);
            Statement st = con.createStatement();
            int i = st.executeUpdate(queryStr);

            if (i == 0){
                System.out.println(id + " doesn't exists");
            } else {
                System.out.println("Updated data with id = " + id);
            }

        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Exiting...");
    }
}
