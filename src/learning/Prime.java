package src.learning;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a number to check: ");
       int n = in.nextInt();

       boolean ans = prime(n);
       System.out.println(ans);
        
       in.close();
    }
    static boolean prime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
    
}