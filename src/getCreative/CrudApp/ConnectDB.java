package src.getCreative.CrudApp;

import java.sql.*;

public class ConnectDB {

    String dbName;
    
    ConnectDB(){
        this.dbName = "test";
    }

    ConnectDB(String dbName){
        this.dbName = dbName;
    }

    Connection connectDB(){
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/"+dbName;
        String user = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB : "+dbName);
        } catch (Exception e){
            System.out.println(e);
        }

        return con;
    }
}