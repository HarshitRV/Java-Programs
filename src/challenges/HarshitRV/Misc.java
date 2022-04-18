package src.challenges.HarshitRV;

import java.io.Console;

class ArmstrongNum{
    public static void main(String[] args) {
        try{
            Console c = System.console();
            String num = c.readLine("Enter a number: ");

            int sum = 0;
            double pow = num.length();
            
            for(int i = 0; i<num.length(); i++){
                double n = Double.parseDouble(num.charAt(i)+"");
                sum += Math.pow(n, (double) pow);
            }
            if(num.equals(sum+"")){
                System.out.println(num+" is armstrong");
            }else{
                System.out.println(num+" is not armstrong");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class PalindromString{
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("Enter a string: ");
        String rev = "";
        String rev2 = "";

        for(int i=0; i<str.length(); i++){
            rev = str.charAt(i)+ rev;
        } // e+h = eh, h+e = h1, car == rac , c = c+""= a + c == r + ac ==rac

        for(int i=str.length() - 1; i>=0; i--){
            rev2 = rev2 + str.charAt(i);
        }

        System.out.println(rev);
        System.out.println(rev2);

        if(str.equals(rev)){
            System.out.println("Palindrom string");
        }else{
            System.out.println("Not a palindrome string");
        }
    }
}

class LeapYear{
    public static void main(String[] args) {
        Console c = System.console();
        int year = Integer.parseInt(c.readLine("Enter a year"));

        if(year%4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not leap year");
                }
            }else{
                System.out.println("Leap");
            }
        }else{
            System.out.println("Not Leap");
        }
    }
}

class IntegerIntoDigits {

    public static void main(String[] args) {
        Console c = System.console();
        String num = c.readLine("Enter a number");
        usingString(num);
        usingInterger(Integer.parseInt(num));
    }

    static void usingString(String str){
        // "123" -> '1', 2, 3
        for(int i=0; i<str.length(); i++){
            System.out.println(String.format("Integer at index %d is %d", i, Integer.parseInt(str.charAt(i)+"")));
        }
    }

    static void usingInterger(int num){
        int remainder, count=1;
        while(num>0){
            remainder = num%10;
            System.out.println(String.format("Digit at %d th place  is %d", (int) Math.pow(10, count++), remainder));
            num /= 10;
        }
    }
}

class PrimenNum {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 100){
            if(checkPrime(num))
                System.out.println(num);
            
            num++;
        }
    }

    static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }

        int c = 2;
        while(c*c <= n){
            if(n%c == 0) return false;

            c++;
        }

        return c*c > n;
    }
}