package src.uni.lessons.generics;

import src.college.test;

public class Wildcard {

}

class TwoD {
    int x;
    int y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int a;

    FourD(int x, int y, int z, int a) {
        super(x, y, z);
        this.a = a;
    }
}

class Coordinates<T extends TwoD> {
    T[] arr;

    Coordinates(T[] arr) {
        this.arr = arr;
    }

    void printXY(Coordinates<? extends TwoD> c) {
        for (int i = 0; i < c.arr.length; i++) {
            System.out.println("x: " + c.arr[i].x + " : y: " + c.arr[i].y);
        }
    }

    void printXYZ(Coordinates<? extends ThreeD> c) {
        for (int i = 0; i < c.arr.length; i++) {
            System.out.println("x: " + c.arr[i].x + " : y: " + c.arr[i].y + " z: " + c.arr[i].z);
        }
    }

    public static void main(String[] args) {
        TwoD _2d = new TwoD(1, 2);
        TwoD _2d1 = new TwoD(3, 4);

        ThreeD _3d = new ThreeD(1, 2, 3);
        FourD _4d = new FourD(1, 2, 3, 4);

        TwoD[] twoDarr = new TwoD[2];

        twoDarr[0] = _2d;
        twoDarr[1] = _2d1;

        Coordinates<TwoD> coor = new Coordinates<>(twoDarr);
        coor.printXY(coor);
    }
}