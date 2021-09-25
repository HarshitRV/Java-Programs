package src.college;
import java.io.*;

public class Divisible {
    public static void main(String[] args) {
        Console c = System.console();
        int num1 = Integer.parseInt(c.readLine("Enter num1: "));
        int num2 = Integer.parseInt(c.readLine("Enter num2: "));

        for(int i=num1; i<=num2; i++){
            if (i%5 == 0)
            System.out.println(i+" is divisible by 5");
        }
    }
}
