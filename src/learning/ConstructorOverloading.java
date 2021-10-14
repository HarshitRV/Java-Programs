package src.learning;

class Box{
    double width;
    double height;
    double depth;

    // Contrutor that takes object as parameter
    // to create clone of that object
    // This construtor is called when an object is passed as a parameter
    Box (Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // Constructor used when all three sides are specified
    Box (double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor used when a cube is created i.e speacifying only one side
    Box (double len){
        this.width = len;
        this.height = len;
        this.depth = len;
    }

    // default construtor
    Box (){
        width = -1;     // -1 indicates an uninitialized box
        height = -1;
        depth = -1;
    }   

    // Method that computes and returns the volume
    double volume(){
        return width*height*depth;
    }
}

class OverloadingCons{

    public static void main(String[] args) {
        // Creating objects of class Box

        // constructor with three parameters is called i.e contructor at line 18
        Box box1 = new Box(10, 20, 30); 
        // default constructor is called i.e construtor at line 32
        Box box2 = new Box();
        // constructor with 1 param is called i.e constructor at line 25

        Box box3 = new Box(10); 
        // constructor called when another object is passed as parameter
        // constructor at line 11 is called
        // the object cloneBox1 will have same properties as the box1
        Box clonedBox1 = new Box(box1); 

        // printing volume of all boxes
        System.out.println("Volume of box1 = "+ box1.volume());
        System.out.println("Volume of box2 = "+ box2.volume());
        System.out.println("Volume of box3 = "+ box3.volume());
        System.out.println("Volume of clonedBox1 = "+ clonedBox1.volume()+" which is same as volume of box1");
    }
   
    
}
