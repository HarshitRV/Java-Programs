package src.college.generics;

public class Printer<T> {
    private T data;
    Printer(T data){
        this.data = data;
    }

    void print(){
        System.out.println(data);
    }

    public static void main(String[] args) {
        Printer<Integer> printInt = new Printer<Integer>(10);
        printInt.print();

        Printer<Double> printDouble = new Printer<Double>(10.10);
        printDouble.print();

        Printer<String> printString = new Printer<String>("I am a generic class");
        printString.print();
    }
}