package src.getCreative.CrudApp;

import java.sql.*;

public class ReadData {
    Connection con;
    String tableName;
    String[] colNames = new String[10];

    ReadData(Connection con, String tableName){
        this.con = con;
        this.tableName = tableName;
    }
    
    void readData(){
        try {
            String query = "SELECT * FROM "+tableName;
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

    void getColumnNames(){
        try {
            DatabaseMetaData dmd = con.getMetaData();
            ResultSet columns = dmd.getColumns(null, null, "t1", null);
            int i = 0;
            while (columns.next()){
                colNames[i] = columns.getString("COLUMN_NAME");
            }
        } catch (Exception e){
            System.out.println(e);
        } 
    }
}