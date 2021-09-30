package src.learning;
import java.io.*;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, nextNum = num1 + num2;

        Console c =  System.console();
    
        int n = Integer.parseInt(c.readLine("Enter the number of terms: "));

        for (int i=0; i<n; i++){
            System.out.print(num1+" ");
            num1 = num2;
            num2 = nextNum;
            nextNum = num1 + num2;
        }

        System.out.println();
        System.out.println("The "+n+"th term is "+(num2-num1));
    }
}
