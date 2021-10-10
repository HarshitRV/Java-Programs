//This Program shows the Implementation of the Interface using java with the help of taking input from the user this program calculates area of Square and Rectangle. 
package src.college;

import java.io.*;

interface Inf {
    void aos(int n1, int n2);
}

class Sqr implements Inf {
    public void aos(int n1, int n2) {
        System.out.println("area of square is " + (n1 * n2));
    }

    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("enter the number:"));

        Sqr s = new Sqr();

        s.aos(n, n);

    }
}

class Rac implements Inf {
    public void aos(int n1, int n2) {

        System.out.println("area of reactangle is " + (n1 * n2));
    }

    public static void main(String[] args) {
        Console c = System.console();
        int n1 = Integer.parseInt(c.readLine("enter the length:"));
        int n2 = Integer.parseInt(c.readLine("enter the breath:"));
        Rac s = new Rac();
        s.aos(n1, n2);
    }

}