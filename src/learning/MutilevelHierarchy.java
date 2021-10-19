/*
    Multilevel Hierarchy

    This program demonstrate the multilevel 
    Hierarchy in java.

    To understand this code one must need concept
    of Inheritance, the super keyword and construtors
    in java.
*/
package src.learning;

class BoxClass {
    private double width;
    private double height;
    private double depth;

    // constructor for when no value is give for dimensions
    BoxClass(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // construtor when all three value are specified
    BoxClass(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor when a cube is created
    BoxClass(double length){
        this.width = this.height = this.depth = length;
    }

    // constructor when cloning another object of BoxClass
    BoxClass(BoxClass obj){
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    // funtion to return the volume of object
    double volume(){
        return this.width*this.height*this.depth;
    }
}

class BoxWeightClass extends BoxClass{
    private double weight;

    // constructor when no dimensions and weigth is given
    BoxWeightClass(){
        super();
        this.weight = -1;
    }

    // constructor when all values are given
    BoxWeightClass(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }

    // constructor when a cube is created
    BoxWeightClass(double length, double weight){
        super(length);
        this.weight = weight;
    }

    // constructor when a object is cloned
    BoxWeightClass(BoxWeightClass obj){
        super(obj);
        this.weight = obj.weight;
    }

    // function to return weigth of the object
    double showWeigth(){
        return this.weight;
    }
}

class BoxPriceClass extends BoxWeightClass{
    private float price;

    // constructor when no info is given
    BoxPriceClass(){
        super();
        this.price = -1;
    }

    // constructor when all info is given
    BoxPriceClass(double width, double height, double depth, double weigth, float price){
        super(width, height, depth, weigth);
        this.price = price;
    }

    // constructor when cube is created 
    BoxPriceClass(double length, double weight, float price){
        super(length, weight);
        this.price = price;
    }

    // constructor when object is cloned
    BoxPriceClass(BoxPriceClass obj){
        super(obj);
        this.price = obj.price;
    }

    float showPrice(){
        return this.price;
    }
}

public class MutilevelHierarchy {
    public static void main(String[] args) {

        // constructor at line 89 is called
        BoxPriceClass mybox1 = new BoxPriceClass();

        // construtor at line 95 is called
        BoxPriceClass mybox2 = new BoxPriceClass(40, 30, 20, 100, 1500);

        // constructor at line 100 is called
        BoxPriceClass cubeBox = new BoxPriceClass(40, 100, 1500);

        // constructor at line 106 is called
        BoxPriceClass cloneBox = new BoxPriceClass(mybox1);

        // Printing the volumes of each box.
        System.out.println("Volume of mybox1 = "+mybox1.volume());
        System.out.println("Volume of mybox2 = "+mybox2.volume());
        System.out.println("Volume of cubeBox = "+cubeBox.volume());
        System.out.println("Volume of cloneBox = "+cloneBox.volume());
        
        // Printing the price of each box.
        System.out.println("Price of mybox1 = "+mybox1.showPrice());
        System.out.println("Price of mybox2 = "+mybox2.showPrice());
        System.out.println("Price of cubeBox = "+cubeBox.showPrice());
        System.out.println("Price of cloneBox = "+cloneBox.showPrice());
    }
}
