package src.learning;
import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Console c = System.console();
        Scanner in = new Scanner(System.in);

        double ans = 0;

        while (true) {
            char op = c.readLine("Enter a operator: ").trim().charAt(0);
            if (op == 'x' || op == 'X') {
                break;
            }
            System.out.print("Enter two numbers: ");
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            
            switch (op) {
                case '+': ans = num1 + num2; System.out.println("Sum: "+ans); break;
                case '-': ans = num1 - num2; System.out.println("Difference: "+ans);break;
                case '*': ans = num1 * num2; System.out.println("Product: "+ans);break;
                case '/': if (num2 != 0){
                            ans = num1/num2;
                            }else 
                                System.out.println("Cannot divide by 0");
                        break;          
                case '%': ans = num1 % num2; System.out.println("Remainder: "+ans); break;
                default: System.out.println("Invalid operator!");
            }
        }

        System.out.println("Result of calculation : "+ ans);
        in.close();
    }
}
