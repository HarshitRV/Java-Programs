/*
    Understading Interfaces Example 2.

    1. This program demostrates the indirect way of
    achiving the multiple inheritance in java.

    2. This program also demonstrate on how to create the 
       objects of the interface.
*/
package src.college.understanding_interface;

interface Interface1 {
    void m1();
}

interface Interface2 {
    void m2();
}

// implementing two interfaces in the single class
// is an indirect way of doing multiple inheritance
// in java.
class DemoInterface1 implements Interface1, Interface2 {
    public void m1(){
        System.out.println("m1() from Interface1 is overridden in DemoInterface1");
    }
    public void m2(){
        System.out.println("m2() from Interface2 is overridden in DemoInterface1");
    }

    void m3(){
        System.out.println("m3() of DemoInterface1");
    }
    public static void main(String[] args) {
        // creating object of type DemoInterface1
        DemoInterface1 t1 = new DemoInterface1();
        t1.m1(); t1.m2(); t1.m3();

        // creating the object of Interfaces
        // through DemoInterface1

        Interface1 obj1 = new DemoInterface1();
        Interface2 obj2 = new DemoInterface1();

        // Interface1 and Interface2 can only call the method(s)
        // that are present within themselves

        // m1() is within the Interface1 hence it can be called 
        obj1.m1();

        // m2() is within the Interface2 hence it can be called 
        obj2.m2();

        // however m3() that is neither in Interface1 nor in 
        // Interface2 and hence can not be called.
    }
}

