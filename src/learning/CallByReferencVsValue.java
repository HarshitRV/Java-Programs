/*
Pass by value vs pass by reference

Program to demonstrate pass by value and pass by reference.
*/
package src.learning;

// this class demostrates pass by value
// simple types are pass by value
class PassByValue {
    void method(int i, int j){
        i += 10;
        j += 20;
    }
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        PassByValue ob1 = new PassByValue();

        System.out.println("Value of a and b before calling method= "+ a+":"+b); // 10:20

        // calling the funtion method
        ob1.method(a, b);
        System.out.println("Value of a and b after calling method= "+ a+":"+b); // 10:20

        // In both the print statements the value of the variables are unaffected
        // insted of changing to 20 and 40 as one might think
        // this is pass by value
    }
}

// this class demonstrate pass by reference
// note that objects are pass by reference
class PassByReference{
    int a, b;

    // parameterized construtor
    PassByReference(int i, int j){
        a = i;
        b = j;
    }
    
    void method() {
        a += 10;    
        b += 20;    
    }
    public static void main(String[] args) {
       PassByReference obj1 = new PassByReference(10, 20);

       System.out.println("Value of a and b of obj1 before calling method= "+obj1.a+":"+obj1.b); // 10:20

       // calling the function method
       obj1.method();
       System.out.println("Value of a and b of obj1 after calling method= "+obj1.a+":"+obj1.b); // 20:40
       
       // here the reference to the values of a and b is passed to the 
       // funtion method and hence it was able to affect the original
       // values. This is pass by reference.
    }
}
