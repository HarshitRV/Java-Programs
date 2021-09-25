package src.college;
import java.io.*;
class Table {
    public static void main(String[] args) {
        Console c = System.console();
       
        int n = Integer.parseInt(c.readLine("Enter the number to gerate a table: "));

        // Table with for loop
        System.out.println("Table with for loop");
        for (int i=1; i<=10; i++) {
            System.out.println(n +" x "+ i+" = "+n*i);
        }
        // Table with while loop
        System.out.println("Table with while loop");
        int i = 1;
        while(i<=10) {
            System.out.println(n +" x "+ i+" = "+n*i);
            i++;
        }
        //Table with do while loop
        System.out.println("Table with do while loop");
        i = 1;
        do {
            System.out.println(n +" x "+ i+" = "+n*i);
            i++;
        }while(i<=10);
    }
}