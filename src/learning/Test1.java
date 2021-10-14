/*
Using objects as Parameters

This program demostrates the use of objects as parameters.
*/

package src.learning;

class Test1 {
    // Member variable
    int a, b;

    // Parametrized Constructor
    Test1(int i, int j){
        a = i;
        b = j;
    }

    // Function to check if two objects values are equal
    boolean equals(Test1 o){
        if(o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}

class Main {
    public static void main(String[] args) {
        // creating object ob1, ob2 and ob3
        Test1 ob1 = new Test1(10, 20);
        Test1 ob2 = new Test1(10, 20);
        Test1 ob3 = new Test1(100, 200);

        // Comparing and printing the result

        // comparing ob1 and ob2
        System.out.println("ob1 == ob2: "+ ob1.equals(ob2));

        // comparing ob1 and ob3
        System.out.println("ob1 == ob3: "+ ob1.equals(ob3));
    }
}
