package src.getCreative.CrudApp;

import java.sql.*;
import java.io.Console;

public class CustomQuery {
    Connection con;
    String tableName;
    Console c = System.console();
    
    CustomQuery (Connection con, String tableName){
        this.con = con;
        this.tableName = tableName;
    }

    void customQuery(){
        try {
            String query = c.readLine("Enter query string: ");
            Statement st = con.createStatement();

            if (query.contains("select")){
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    String data = String.format("%s\t%s\t%s", rs.getString("id"), rs.getString("name"), rs.getString("course"));
                    System.out.println(data);
                }
            } else {
                int i = st.executeUpdate(query);
                if (i != 0){
                    System.out.println(i+" row affected");
                } else {
                    System.out.println(i+ "id does'nt exists");
                }
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}