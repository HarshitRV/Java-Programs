package src.learning.understanding_super;

class A{
    int i;
}

class B extends A{
    int i;   // overriding i in B

    B(int a, int b){
        super.i = a; // initializing the i of class A
        i = b;       // initializing the i of class B    
    } 
    
    void show(){
        System.out.println("i in superclass = "+super.i);
        System.out.println("i in subclass = "+i);
    }
}
class ShowDemo {
    public static void main(String[] args) {
        B b1 = new B(10, 5);
        b1.show();
    }
}