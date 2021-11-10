/*
    Understading Interfaces Example 1.

    This program domonstrate the interfaces in java.
    Interface are very similar to abstract classes

    1. Interfaces are collection of public abstract method(s),
       and public final variable(constant(s)).

    2. Interface methods are by default public abstract and
       and variables are by default public final.

    3. When the interfaces are implemented in a class,
       the access modifier should never be depreciated
       it should remain same or higher.
*/
package src.college.understanding_interface;

interface Inf1 {
    public abstract void m1();  // can also be written just as void m1()
    public abstract void m2();  // can also be written just as void m2()
    public final int NUM = 100; // can also be written as int NUM = 100
}

class DemoInterfaceEx1 implements Inf1{
    
    // the access modifiers of the interface member shouldn't be decresed 
    // it should be same or higher
    public void m1(){
        System.out.println("m1() from Inf1 overridden in DemoInterface1");
    }

    public void m2(){
        System.out.println("m2() from Inf1 overridden in DemoInterface1");
    }
    public static void main(String[] args) {
        
    }
}