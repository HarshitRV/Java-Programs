package src.uni.lab.cat_1.set_c;

// Write an application that inputs a line of text and determines
// the total number of occurrences of each letter of the alphabet 
// in the text. Uppercase and lowercase letters should be counted 
// together. Store the totals for each letter in an array, and print 
// the values in a tabular format after the totals have been determined.

import java.util.ArrayList;
import java.util.Scanner;

public class CountLetters {
    private String input;
    ArrayList<Character> chArr;
    ArrayList<Integer> count;

    public CountLetters(String input) {
        this.input = input;
        chArr = new ArrayList<>();
        count = new ArrayList<>();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void countLetters() {
        for (int i = 0; i < input.length(); i++) {
            if (chArr.contains(input.charAt(i)) || input.charAt(i) == ' ')
                continue;
            chArr.add(input.charAt(i));
            int occurence = 0;
            for (int j = i; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    occurence++;
                }
            }
            count.add(occurence);
        }
    }

    public void displayOccurences() {
        System.out.printf("%-10s %-5s\n", "Letter", "Frequency");
        for (int i = 0; i < chArr.size(); i++) {
            System.out.printf("%-10s %-5d\n", chArr.get(i), count.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CountLetters cl = new CountLetters(sc.nextLine());
        cl.countLetters();
        cl.displayOccurences();

        sc.close();
    }
}
