// Program to demonstrate how to search for a data in mysql using java

package src.getCreative.CrudApp;

import java.sql.*;
import java.io.Console;

public class Searching {
    Connection con;
    String tableName;
    String[] colNames = new String[10];

    Searching(Connection con, String tableName){
        this.con = con;
        this.tableName = tableName;
    }
    
    void searchData(){

        Console c = System.console();
        String colName = c.readLine("Enter column name: ");
        String searchStr = c.readLine("Search: ");
        String s = "%";

        try {
                                                                //          %<>% 
            String query = String.format("SELECT * FROM %s WHERE %s LIKE  '%s%s%s' ORDER BY id", tableName, colName,s, searchStr, s);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                String data = String.format("%s\t%s\t%s", rs.getString("id"), rs.getString("name"), rs.getString("course"));
                System.out.println(data);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}