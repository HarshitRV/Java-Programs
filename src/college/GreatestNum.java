package src.college;
import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        in.close();

        if(n1 > n2)
            System.out.println(n1+" is greater than "+n2);
        else if(n1 == n2)
            System.out.println("Both numbers are equal");
        else
            System.out.println(n2+" is greater than "+n1);
    }
}
