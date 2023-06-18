package src.uni.lessons.generics;

public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] arr;

    MyClass(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T item = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (item.compareTo(arr[1]) < 0)
                item = arr[i];
        }
        return item;
    }

    public T max() {
        T item = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (item.compareTo(arr[1]) > 0)
                item = arr[i];
        }
        return item;
    }

    public static void main(String[] args) {
        Integer[] arr = { 10, 20, 30, 55, 5 };
        MyClass<Integer> mc = new MyClass<>(arr);

        System.out.println(mc.max());
        System.out.println(mc.min());
    }
}
