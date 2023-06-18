package src.uni.generics;

import java.util.*;

public class SortLenString {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String str1, String str2) {
                if (str1.length() > str2.length())
                    return 1;
                return -1;
            }
        };

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("hi");
        arr.add("biingo");

        System.out.println(arr);

        Collections.sort(arr, comp);

        System.out.println(arr);
    }
}
