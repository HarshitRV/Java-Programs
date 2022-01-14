// Program to demonstrate on how to fetch specific data from the database
// using userinput.
package src.college.understanding_DBConnectivity;

import java.sql.*;
import java.io.*;

public class ReadDataEx2 {
    public static void main(String[] args) {
        Console c = System.console();
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        String id = c.readLine("Enter the id to view the Data : ");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Searching...");

            String query = String.format("SELECT * FROM t1 WHERE id = %s", id);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()){
                System.out.println(rs.getString("id")+"\t"+rs.getString("name"));
            }else {
                System.out.println(String.format("No such data exist with id = %s", id));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Exiting...");
    }
}
