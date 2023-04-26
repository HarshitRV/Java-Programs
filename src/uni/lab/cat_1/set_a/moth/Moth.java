package src.uni.lab.cat_1.set_a.moth;

import java.text.DecimalFormat;

// Develop the class Moth in a package that models a 
// moth flying along a straight line. A moth has a position 
// determined by its coordinates with respect to an origin 
// and the distance from the origin. Provide getter and setter 
// method for position and distance of the moth. Override the 
// toString method of the Object class. When a moth moves toward 
// a point of light, its new position is halfway between its 
// old position and the position of the light source. 
// Supply a constructor to initialize the position of a 
// moth and the methods to move a moth toward light and to 
// retrieve the current position of the moth. Develop the MothTester 
// class in another package containing the main method and it should 
// construct a moth, move it toward a couple of light sources, 
// and check the moth’s position.

public class Moth {
    private int x;
    private int y;
    private double distance;

    public Moth(int x, int y) {
        this.x = x;
        this.y = y;
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance() {
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    public void setPostion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveToLight(int x, int y) {
        this.x = (this.x + x) / 2;
        this.y = (this.y + y) / 2;
    }

    @Override
    public String toString() {
        return "Pos: ( " + getX() + " , " + getY() + " )\nDistance: " + new DecimalFormat("0.00").format(getDistance());
    }
}
