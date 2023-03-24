package src.uni.lab.interfaces;

interface GeometricObject {
    double getArea();

    double getParameter();
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    double getSide3() {
        return side3;
    }

    void setSide1(double side1) {
        this.side1 = side1;
    }

    void setSide2(double side2) {
        this.side2 = side2;
    }

    void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getParameter() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        double s = getParameter() / 2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}

class TriangleDriver {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 10, 10);
        System.out.println(triangle.getArea());
    }
}