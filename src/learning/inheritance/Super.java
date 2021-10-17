// Program to demontrate the purpose of super keyword.

// Using super keyword we can access the constructor of
// Super class to create the object of subclass without 
// needing to access the variable member of the super class
// we can keep the super class variable member private.
package src.learning.inheritance;

class Box {
    private int height;
    private int width;
    private int depth;

    Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    int volume(){
        return this.height*this.width*this.depth;
    }
}

class BoxWeight extends Box{
    int weight;

    BoxWeight(int weight, int height, int width, int depth){
        super(height, width, depth);  // calling super class constructor
        this.weight = weight;
    }
}

class DemoUse {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 10, 20, 10);
        int volume = b1.volume();
        System.out.println("Volume: "+volume);
    }
}