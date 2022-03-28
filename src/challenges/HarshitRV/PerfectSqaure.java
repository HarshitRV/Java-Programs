package src.challenges.HarshitRV;

import java.io.Console;
public class PerfectSqaure {
    static boolean isPerfectSquare(int num){
        double squareRoot = Math.sqrt(num); // 25 -> 5.0 3.3, 2.5 -> 3.0 2.0
        System.out.println(squareRoot);
        System.out.println(Math.floor(squareRoot));
        return (squareRoot - Math.floor(squareRoot) == 0);
    }
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter a number to check: "));
        if(isPerfectSquare(num)){
            System.out.println(num+" is perfect square.");
        } else {
            System.out.println(num+" is not a perfect square.");
        }
    }
}

