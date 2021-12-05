/*
    Method Overiding in java
*/
package src.learning.method_overriding;

class Figure {

    double dim1;
    double dim2;

    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area(){
        System.out.println("Area of figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure{

    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    // area() overridden
    double area(){
        return dim1*dim2;
    }
}

class Triangle extends Figure {

    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    // area() overidden 
    double area(){
        return (dim1*dim2)/2;
    }
}

class FindAreas {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("Area of r1 = "+r1.area());

        Triangle t1 = new Triangle(10, 20);
        System.out.println("Area of t1 = "+t1.area());
    }
}