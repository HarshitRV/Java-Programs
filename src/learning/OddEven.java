package src.learning;
import java.io.*;

public class OddEven {
    public static void main(String[] args) {
        Console c = System.console();
        String num = c.readLine("Enter the number to check: ");
        int n = Integer.parseInt(num);

        if (n % 2 == 0){
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
    }
}
