package src.uni.lessons.collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.remove("F");
        System.out.println(ll);

        list.add(10);
        list.add(20);

        System.out.println(list);

        list.addFirst(5);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
