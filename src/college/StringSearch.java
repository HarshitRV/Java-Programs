package src.college;
import java.io.*;

public class StringSearch {
    public static void main(String[] args) {
        Console c = System.console();

        String mainStr = c.readLine("Enter main string: ");
        String searchStr = c.readLine("Enter search string: ");

        if (mainStr.indexOf(searchStr) == -1){
            System.out.println("The search string is not in main string");
        } else {
            System.out.println("The string "+searchStr+" starts at index "+mainStr.indexOf(searchStr));
        }
    }
}
