/**
 * The ‘this’ reference refers to the current object 
 * (invoking object i.e. object currently in use). ​
 * Members of ‘this’ are accessed by . (the period operator). i.e. this.member
 */

package src.college.this_keyword;

public class This {
    private int a;
    private int b;

    // Constructor #1
    public This(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Constructor #2
    public This(int x) {
        /**
         * Must be the first non-comment 
         * statement in this definition
        */
        this(x, x);
    }

    public void printValues() {
        System.out.println("Value of a: " + this.a);
        System.out.println("Value of b: " + this.b);
    }

    public static void main(String[] args) {
        // creating object with constructor #1.
        This t1 = new This(10, 20);

        // creating object with constructor #2
        This t2 = new This(10);

        t1.printValues();
        t2.printValues();
    }
}
