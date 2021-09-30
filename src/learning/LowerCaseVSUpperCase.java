package src.learning;
import java.io.*;

public class LowerCaseVSUpperCase {
    public static void main(String[] args) {
        Console c = System.console();
        
        char ch = c.readLine("Enter a char: ").trim().charAt(0);

        if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase letter");
        else
            System.out.println("Uppercase letter");
    }
}
