package src.ds.Array_ds;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(10);

        String[] arr = {"Hello", "Hi", "How are you?"};

        for (int i = 0; i<arr.length; i++){
            list.add(arr[i]);
        }

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
    }
}
