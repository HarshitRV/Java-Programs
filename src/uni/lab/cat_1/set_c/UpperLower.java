package src.uni.lab.cat_1.set_c;

// Write an application that inputs a line of text and outputs 
// the text twice—once in all uppercase letters and once 
// in all lowercase letters.

import java.util.Scanner;

public class UpperLower {
    private String input;

    public UpperLower(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getLowerCase() {
        return input.toLowerCase();
    }

    public String getUpperCase() {
        return input.toUpperCase();
    }

    public void printUpperAndLower() {
        System.out.println("Upper case: " + getUpperCase());
        System.out.println("Lower case: " + getLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        UpperLower ul = new UpperLower(input);
        System.out.println(ul.getInput());
        ul.printUpperAndLower();

        sc.close();
    }
}
