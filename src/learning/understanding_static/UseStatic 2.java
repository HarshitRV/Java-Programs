/*
    Understanding Static

    This code demonstrate the use of 
    static variables, methods and block.
*/
package src.learning.understanding_static;

class UseStatic {
    // Static variables
    static int a = 3;
    static int b;

    // Static method
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    // Static block
    static {
        System.out.println("Static block initialized");
        b = a * 5;
    }
    public static void main(String[] args) {
        // calling the static method
        meth(10);
    }
}
