// Program to convert integer numbers into digits

package src.challenges.HarshitRV;

import java.io.*;

public class NumberToDigits {
    public static void main(String[] args) {
        try {

            Console c = System.console();

            String input = c.readLine("Enter a number: ");
            int len = 1;

            int num = Integer.parseInt(input);
            int digit;
          

            while (num > 0) {
                digit = num % 10;
                System.out.println("Digit at place " + (int) Math.pow(10.0, len) + "th = " + digit);
                len++;
                num = num / 10;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
