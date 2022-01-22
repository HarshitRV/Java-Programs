package src.getCreative.CrudApp;

import java.sql.*;
import java.io.Console;

public class UpdateRecord {
    Connection con;
    String tableName;
    Console c = System.console();

    UpdateRecord(Connection con, String tableName){
        this.con = con;
        this.tableName = tableName;
    }

    void updateRecord(){
        try {
            String id = c.readLine("Enter the id: ");
            String colName = c.readLine("Enter the column name: ");
            String newValue = c.readLine("Enter new value: ");
            String query = String.format("UPDATE %s SET %s = '%s' WHERE id = %s ",tableName, colName, newValue, id);
            Statement st = con.createStatement();

            int i = st.executeUpdate(query);
            if (i != 0){
                System.out.println(i+" row updated");
            } else {
                System.out.println(i+ "id does'nt exists");
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}