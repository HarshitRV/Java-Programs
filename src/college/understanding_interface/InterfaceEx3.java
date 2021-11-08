/*
    Understading Interfaces Example 3.

    This program demostrates the multiple inheritence in Interfaces.
*/
package src.college.understanding_interface;

interface Interface_1 {
    void m1();
}

// inheriting Interface_1 in Interface_2
interface Interface_2 extends Interface_1{
    void m2();
}

// implementing the Interface_2 which inherits the Interface_1 
// in DemoInterface2 class.
class DemoInterface2 implements Interface_2 {

    // overriding the m1 of Interface_1 which has been inheritted by Interface_2 
    // in DemoInterface2 class
    public void m1(){
        System.out.println("m1() from Interface_1 which has been Inheritted by Interface_2 is overridden in DemoInterface2");
    }

    // overriding the m2 of interface Interface_2 in class DemoInterface2 
    public void m2(){
        System.out.println("m2() from Interface_2 which has been overridden in DemoInterface2");
    }

    void m3(){
        System.out.println("m3() of DemoInterface2");
    }
    public static void main(String[] args) {
        // creating object of type DemoInterface2
        DemoInterface2 t1 = new DemoInterface2();
        t1.m1(); t1.m2(); t1.m3();

        // crating the object of Interfaces
        // through DemoInterface2
        Interface_1 obj1 = new DemoInterface2();
        Interface_2 obj2 = new DemoInterface2();

        // Interface1 and Interface2 can only call the method(s)
        // that are present within themselves

        // m1() is within the Interface_1 hence it can be called 
        obj1.m1();

        // m2() is within the Interface_2 hence it can be called 
        obj2.m2();

        // m1() is inherited by Interface_2 so it can be called by
        // the interface Interface_2 as well.
        obj2.m1();

        // however m3() that is neither in Interface_1 nor in 
        // Interface_2 and hence can not be called.
    }
}

