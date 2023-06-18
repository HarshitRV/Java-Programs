package src.uni.lessons.generics;

public class GenMath {
    static <T extends Comparable<T>, V> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5 };

        if (isIn(1, arr)) {
            System.out.println("1 is in");
        }
    }
}
