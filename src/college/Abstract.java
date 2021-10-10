package src.college;

// This is an abstract class
abstract class Ab {
    void display() {
        System.out.println("this is the program for calculating area of square and rectangle");
    }

    abstract void aos(int n1, int n2);
}

class Sq extends Ab {
    void aos(int n1, int n2) {
        System.out.println("area of square is " + (n1 * n1));
    }

    public static void main(String[] args) {
        Sq s = new Sq();
        int n1 = 10;
        s.aos(n1, n1);
    }
}

class Rt extends Ab {
    void aos(int n1, int n2) {

        System.out.println("area of reactangle is " + (n1 * n2));
    }

    public static void main(String[] args) {
        Rt s = new Rt();
        int n1 = 10, n2 = 20;
        s.aos(n1, n2);
    }

}