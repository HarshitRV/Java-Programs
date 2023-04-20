package src.uni.lab.strings;

import java.util.Scanner;

public class StringPro1 {
    String lineOfText;

    public StringPro1(String lineOfText) {
        this.lineOfText = lineOfText;
    }

    public void upperAndLower() {
        System.out.println(lineOfText.toUpperCase());
        System.out.println(lineOfText.toLowerCase());
    }

    public void countOccurences(char ch) {
        int index = lineOfText.indexOf(ch + "");
        int count = 0;
        if (index != -1) {
            count = 0;
            for (int i = 0; i < lineOfText.length(); i++) {
                if (lineOfText.charAt(i) == ch)
                    count++;
            }
            System.out.printf("%c occured for %d times", ch, count);
            return;
        }
        System.out.printf("%c occured for %d times", ch, count);
    }

    public void onlyLetterB() {
        String[] strArr = lineOfText.split(" ");
        for (String str : strArr) {
            if (str.charAt(0) == 'b' || str.charAt(0) == 'b')
                System.out.println(str);
        }
    }

    public void endingWithED() {
        String[] strArr = lineOfText.split(" ");
        for (String str : strArr) {
            if (str.endsWith("ED") || str.endsWith("ed"))
                System.out.println(str);
        }
    }

    public void reverseString() {
        String[] strArr = lineOfText.split(" ");
        for (int i = strArr.length; i >= 0; i++) {
            System.out.println(strArr[i]);
        }
    }

    void actions(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                upperAndLower();
                break;
            case 2:
                System.out.print("Enter character to search: ");
                countOccurences(sc.next().charAt(0));
                break;
            case 3:
                onlyLetterB();
                break;
            case 4:
                endingWithED();
                break;
            case 5:
                reverseString();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String lineOfText = sc.next();

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        new StringPro1(lineOfText).actions(choice);
        sc.close();
    }
}
