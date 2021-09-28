package src.college;
import java.io.*;

public class StringLetter {
    public static void main(String[] args) {
        Console c = System.console();
        String name = c.readLine("Enter your name: ");

        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}