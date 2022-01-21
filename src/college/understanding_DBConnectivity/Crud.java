// Combining all the operations into one program.

package src.college.understanding_DBConnectivity;

import java.sql.*;

import java.io.Console;

public class Crud {
    public static void main(String[] args) {
        readRecord();
        System.out.println("--------------------------\n");
        Console c = System.console();

        System.out.println("1 - Create the new record");
        System.out.println("2 - Display all record");
        System.out.println("3 - Update a record");
        System.out.println("4 - Delete a record");
        System.out.println("5 - Run custom query");

        while (true) {
            String ch = c.readLine("Enter your choice: ");

            switch (ch) {
                case "1":
                    addRecord();
                    break;
                case "2":
                    readRecord();
                    break;
                case "3":
                    updateRecord();
                    break;
                case "4":
                    deleteRecord();
                    break;
                case "5":
                    customQuery();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            String again = c.readLine("Perform another query?(y/n): ");
            if (again.equals("n")) {
                break;
            }
        }

    }

    static void connectDB(String query) {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            try {
                if (query != null) {
                    int i = st.executeUpdate(query);

                    if (i != 0) {
                        System.out.println(i + " row affected\n");
                        readRecord();
                    } else {
                        System.out.println(i + " does'nt exists\n");
                    }
                } else {
                    ResultSet rs = st.executeQuery("SELECT * FROM Students");
                    displayData(rs);
                }
            } catch (java.sql.SQLException e) {
                ResultSet rs = st.executeQuery(query);
                displayData(rs);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void addRecord() {
        Console c = System.console();

        String id = c.readLine("\nEnter id : ");
        String name = c.readLine("Enter student name: ");
        String course = c.readLine("Enter student coursename : ");

        String query = String.format("INSERT INTO Students VALUES(%s, '%s', '%s')", id, name, course);
        connectDB(query);
    }

    static void readRecord() {
        connectDB(null);
    }

    static void updateRecord() {
        Console c = System.console();

        String id = c.readLine("\nEnter id : ");
        String colName = c.readLine("Enter name of the column: ");
        String newValue = c.readLine("Enter new value: ");

        String query = String.format("UPDATE Students SET %s = '%s' WHERE id = %s", colName, newValue, id);
        connectDB(query);
    }

    static void deleteRecord() {
        Console c = System.console();
        String id = c.readLine("\nEnter the id you wish to delete: ");
        String query = String.format("DELETE FROM Students WHERE id=%s", id);
        connectDB(query);
    }

    static void customQuery() {
        Console c = System.console();
        String query = c.readLine("Input query: ");
        connectDB(query);
    }

    static void displayData(ResultSet rs) {
        try {
            System.out.println("id\tname\tcourse");
            System.out.println("--------------------------");
            while (rs.next()) {
                String data = String.format("%s\t%s\t%s\t", rs.getString("id"), rs.getString("name"),
                        rs.getString("course"));
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}