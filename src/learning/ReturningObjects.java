/*
    Returning objects

    This program demostrates how we can return objects in methods.
*/
package src.learning;

class Test2 {
    int a;
    
    // constructor
    Test2(int i){
        a = i;
    }

    // method that creates new object
    // by taking in the value of original object
    // and incremeting by 10
    Test2 increByTen(){
        Test2 temp = new Test2(a + 10);
        return temp;
    }
}

class ReturnObject {
    public static void main(String[] args) {
        Test2 obj1 = new Test2(10);
        Test2 obj2;

        obj2 = obj1.increByTen(); // this function will return a object of type Test2

        System.out.println("obj1.a = "+obj1.a);  // prints obj1.a = 10
        System.out.println("obj2.a = "+obj2.a);  // prints obj2.a = 20
    }
}
