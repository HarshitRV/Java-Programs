package src.getCreative.CrudApp;

import java.sql.*;
import java.io.Console;

public class InsertRecord {
    Connection con;
    String tableName;
    Console c = System.console();
    
    InsertRecord(Connection con, String tableName){
        this.con = con;
        this.tableName = tableName;
    }

    void insertRecord(){
        try {
            String id = c.readLine("Enter the id: ");
            String name = c.readLine("Enter the name: ");
            String course = c.readLine("Enter the course: ");
            String query = String.format("INSERT INTO %s VALUES(%s, '%s', '%s')",tableName, id, name, course);
            Statement st = con.createStatement();

            int i = st.executeUpdate(query);
            if (i != 0){
                System.out.println(i+" row inserted");
            } else {
                System.out.println(i+ "id does'nt exists");
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}