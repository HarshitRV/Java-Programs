package src.uni.generics;

import java.util.Arrays;

public class Gen<T> {
    public T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Gen<Integer> gn = new Gen<>(10);
        System.out.println(gn.getClass().getSimpleName());
        System.out.println(gn.obj);
    }
}

class GenArr<T extends Number> {
    public T[] arr;
    GenArr(T[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        GenArr<Integer> genArr = new GenArr<>(arr);
        System.out.println(Arrays.toString(arr));
    }
}


class Arr {
    public Integer[] arr;
    Arr(Integer[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Arr a = new Arr(arr);
        System.out.println(a.arr);
    }
}

