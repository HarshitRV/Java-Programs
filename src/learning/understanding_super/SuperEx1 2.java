/*
    Understanding Super

    This program demostrate the need for super 
    in java. Using super we can initialize the private
    members of inherited class. 

    This also enhances security and make our code 
    reliable.
*/
package src.learning.understanding_super;

class BuildBox {
    private double width;
    private double height;
    private double depth;

    // construtor when all dimensions is given
    BuildBox(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor when object is cloned
    BuildBox(BuildBox obj){
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    // constrctor when cube is formed
    BuildBox(double height){
        this.width = this.height = this.depth = height;
    }

    // constructor when no mesurements are given
    BuildBox(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    void volume(){
        System.out.println("Volume: "+(this.width * this.height * this.depth));
    }
}

class BoxWeight extends BuildBox {
    double weight;

    // constructor when all dimensions are mentioned along with weigth
    BoxWeight(double weight, double width, double height, double depth){
        super(width, height, depth);
        this.weight = weight;
    }

    // constructor when BoxWeight object is cloned
    BoxWeight(BoxWeight obj){
        super(obj);
        this.weight = obj.weight;
    }

    // constructor when cube is created
    BoxWeight(double weight, double height){
        super(height);
        this.weight = weight; 
    }

    // constructor when no dimension and weight is given
    BoxWeight(){
        super();
        this.weight = -1;
    }
}

class DemoSuper {

    public static void main(String[] args) {
        // object with all three dimensions given along with the weight
        // constructor at line 39 is called
        BoxWeight b1 = new BoxWeight(100, 30, 20, 10);
        b1.volume();

        // cloned object
        // constructor at line 45 is called
        BoxWeight cloneBox = new BoxWeight(b1);
        cloneBox.volume();

        // cube object
        // constructor at line 51 is called
        BoxWeight cube = new BoxWeight(100, 20);
        cube.volume();

        // object when no dimensions or weight are given.
        // constructor at line 57 is called
        BoxWeight b2 = new BoxWeight();
        b2.volume();
    }
}
