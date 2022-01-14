// Program to demonstrate on how to read data from the database

package src.college.understanding_DBConnectivity;

import java.sql.*;

public class ReadDataEx1 {
    public static void main(String[] args) {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB");

            // Query string to read everything from the DataBase.
            String query = "SELECT * FROM t1";

            Statement st = con.createStatement();
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
