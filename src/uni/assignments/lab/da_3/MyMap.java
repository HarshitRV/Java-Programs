package src.uni.assignments.lab.da_3;

import java.util.*;

public class MyMap<K, V> {
    private K key;
    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setItem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyMap<Integer, String> myMap1 = new MyMap<Integer, String>(1, "Java");
        MyMap<Integer, String> myMap2 = new MyMap<Integer, String>(2, "JavaScript");

        ArrayList<MyMap> myMapList = new ArrayList<>();
        myMapList.add(myMap1);
        myMapList.add(myMap2);

        for (MyMap item : myMapList) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
