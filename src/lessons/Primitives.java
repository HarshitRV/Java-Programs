package src.lessons;

public class Primitives {   //attributes and methods  = members
    int CON = 10; // constant are always capital  // attribute //memeber
    int con = 10;   // attribute  // member

    int hello (){    //method  member
        System.out.println("Hello");
        return 10;
    }
    public static void main(String[] args) {  // funtion or method   member
    
        byte a = 10;
        int num = 20;
        short sh = 30;

        char ch = 'a'; 
        char ch2 = 23;

        Primitives p1 = new Primitives();
        p1.hello(); 
        int n = p1.hello();
        System.out.println("DONE");
    }
}

// primitives -  which cannot be broken down
/*

byte // 8 bit 
short // 16bit -32167 -   32168  0   0  0  1  0  1  0  0 =    

                       256    128   64   32   16   8   4 2 1  =

char // 16bit // a * 10 = 21 * 10 = 210.
int // 32bit 2^31 + 1
long // 64bit
float // 32 bit  // 2.42423442423423423 , 2 -> 2.0  2.1 + 2.2 = 4
double // 64bit  // 468284.4792794912792179129479

Non Primitives

String = "a string" -- a , s ,t  

*/