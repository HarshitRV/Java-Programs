// Program to take data from the user and insert into the database

package src.college.understanding_DBConnectivity;

import java.sql.*;
import java.io.*;

public class DynamicDataEntryEx1 {
    public static void main(String[] args) {
        Console c = System.console();
        Connection con = null;

        int sno = Integer.parseInt(c.readLine("Enter sno : "));
        String name = c.readLine("Enter name : ");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB");

            // Query string to insert data into the DataBase.
            String query = String.format("INSERT INTO t1 values(%d, '%s')",sno, name);

            Statement st = con.createStatement();
            st.execute(query);

            System.out.println("Inserted the Data");

            query = "SELECT * FROM t1";
            ResultSet rs =  st.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString("id")+"\t"+rs.getString("name"));
            }

        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Exiting....");
    }
}
