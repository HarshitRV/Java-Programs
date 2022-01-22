package src.getCreative.CrudApp;

import java.sql.*;
import java.io.Console;

public class DeleteRecord {
    Connection con;
    String tableName;
    Console c = System.console();

    DeleteRecord(Connection con, String tableName){
        this.con = con;
        this.tableName = tableName;
    }

    void deleteRecord(){
        try {
            String id = c.readLine("Enter the id: ");
            String query = String.format("DELETE FROM %s WHERE id=%s",tableName, id);
            Statement st = con.createStatement();

            int i = st.executeUpdate(query);
            if (i != 0){
                System.out.println(i+" row deleted");
            } else {
                System.out.println(i+ "id does'nt exists");
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}