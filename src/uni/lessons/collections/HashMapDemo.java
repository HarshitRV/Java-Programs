package src.uni.lessons.collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(10, "HRV");
        hm.put(5, "kush");
        hm.put(2, "harsh");

        System.out.println(hm);

        Set<Map.Entry<Integer, String>> set = hm.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> item= itr.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
