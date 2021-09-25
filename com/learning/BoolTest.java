package com.learning;
class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is "+ b);

        b = true;
        System.out.println("b is "+ b);

        //boolean controls the if statements
        if(b) System.out.println("This will be executed");

        b = false;

        if(b) System.out.println("This will not be executed");

        //boolean are use in outcome of a relational operator
        System.out.println("10 > 9 is : "+ (10 > 9));
    }
}