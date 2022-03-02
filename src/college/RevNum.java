package src.college;
import java.io.*;

public class RevNum {
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter a number to reverse:- "));
        int result = revNum(num);
        System.out.println("Reverse of "+num+" is "+result);
    }
    static int revNum (int num){
        int remainder, revNum=0;
        while (num > 0){
            remainder = num % 10;
            revNum = revNum * 10 + remainder;
            num = num/10;
        }
        return revNum;
    }
}
