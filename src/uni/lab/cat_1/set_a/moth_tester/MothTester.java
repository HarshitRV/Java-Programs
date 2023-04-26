package src.uni.lab.cat_1.set_a.moth_tester;

import src.uni.lab.cat_1.set_a.moth.Moth;

public class MothTester {
    public static void main(String[] args) {
        Moth m = new Moth(10, 20);

        System.out.println("Initial postion and distance");
        m.toString();

        // moving to first light source
        m.moveToLight(15, 35);
        System.out.println("New postion and distance");
        System.out.println(m.toString());

        // moving to another light source
        m.moveToLight(23, 34);
        System.out.println(m.toString());
    }
}
