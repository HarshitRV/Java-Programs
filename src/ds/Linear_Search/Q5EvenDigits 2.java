// Question: Find the number of digits in an integer number.
package src.ds.Linear_Search;

import java.util.*;

// Method-1: using strings to find the number of digits.
class Q5EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 123, 34533, 213, 6, 7328963 };

        System.out.println("Even digits numbers = "+evenDigits(arr));
    }
    static ArrayList<Integer> evenDigits(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            String n = ""+num;
            int len = n.length();
            if(len%2==0){
                list.add(num);
            }
        }
        return list;
    }
}

// Method-2: without strings
class countDigits {
    int count = 0, num;
    countDigits(int num){
        if (num < 0){
            num *= -1;
        }
        this.num = num;
    }
    int digits(){
        if (num == 0){
            return 1;
        }
        while(num > 0){
            num /= 10;
            count ++;
        } 
        return count;  
    }

    public static void main(String[] args) {
        countDigits obj = new countDigits(-1000000000);
        System.out.println("Number of digits = "+obj.digits());
    }
}

// Method-3
// fastest method to find the number of digits in an integer
// best solution
class numDigits {
    public int digits(int num){
        if(num<0){
            num *= -1;
        }
        return (int) Math.log10(num) + 1;
    }

    public static void main(String[] args) {
        numDigits Obj = new numDigits();
        System.out.println(Obj.digits(-1000));
    }
}