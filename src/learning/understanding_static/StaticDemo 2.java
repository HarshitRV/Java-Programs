package src.learning.understanding_static;

class StaticDemo {
    // static variables
    static int a = 10;
    static int b = 20;
    
    // static method
    static void callMe(){
        System.out.println(a+":"+b);
    }
}

// creating another class to access the static
// variables and methods in StaticDemo class
// without having to create the object of that
// class

class CallStatic {
    public static void main(String[] args) {
        // calling the static variable of another class
        System.out.println("a of StaticDemo: "+StaticDemo.a);
        System.out.println("b of StaticDemo: "+StaticDemo.b);

        // calling the static method of another class
        StaticDemo.callMe();
    }
}