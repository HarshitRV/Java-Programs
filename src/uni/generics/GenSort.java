package src.uni.generics;

import java.util.Arrays;

public class GenSort<T extends Number> {
    private T[] arr;

    GenSort(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public void selectionSortArr() {
        int i, j, k;
        T temp;
        for (i = 0; i < arr.length - 1; i++) {
            k = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j].floatValue() < arr[k].floatValue()) {
                    k = j;
                }
            }
            temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = { 5, 4, 3, 2, 1 };
        Float[] floatArr = { 5.2f, 4.8f, 3.6f, 2.4f, 1.2f };

        GenSort<Integer> gsInt = new GenSort<>(intArr);
        GenSort<Float> gsFloat = new GenSort<>(floatArr);

        gsInt.selectionSortArr();
        gsFloat.selectionSortArr();

        System.out.println(Arrays.toString(gsInt.getArr()));
        System.out.println(Arrays.toString(gsFloat.getArr()));
    }
}