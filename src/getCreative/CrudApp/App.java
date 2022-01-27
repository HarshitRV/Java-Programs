package src.getCreative.CrudApp;

import java.sql.Connection;

import java.io.Console;

public class App {
    public static void main(String[] args) {

        // Connecting with the Database
        ConnectDB connect = new ConnectDB("college_db");
        Connection con = connect.connectDB();

        InsertRecord ins = new InsertRecord(con, "Students");
        ReadData rd = new ReadData(con, "Students");

        System.out.println("---------------------------");
        System.out.println("id\tname\tcourse");
        System.out.println("---------------------------");
        rd.readData();
        System.out.println("---------------------------");

        UpdateRecord update = new UpdateRecord(con, "Students");

        DeleteRecord delete = new DeleteRecord(con, "Students");

        Searching search = new Searching(con, "Students");

        CustomQuery cq = new CustomQuery(con, "Students");

        Console c = System.console();

        while (true) {
            
            System.out.println("\n1. Create Record");
            System.out.println("2. Read Data");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Search Data");
            System.out.println("6. Custom Query");

            String choice = c.readLine("Enter your option(1/2/3/4/5): ");
            switch (choice) {
                case "1":
                    ins.insertRecord();
                    break;
                case "2":
                    System.out.println("---------------------------");
                    System.out.println("id\tname\tcourse");
                    System.out.println("---------------------------");
                    rd.readData();
                    System.out.println("---------------------------");
                    break;
                case "3":
                    update.updateRecord();
                    break;
                case "4":
                    delete.deleteRecord();
                    break;
                case "5":
                    search.searchData();
                    break;
                case "6":
                    cq.customQuery();
                    break;
                default:
                    System.out.println("Invalid option");
            }
            choice = c.readLine("Another operation?(y): ").toLowerCase();
            if (!choice.equals("y")) {
                System.out.println("Exiting....");
                break;
            }
        }
    }
}