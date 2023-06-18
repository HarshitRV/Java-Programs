package src.uni.generics;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int marks;

    Student() {
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student[name: " + name + ", marks: " + marks + "]";
    }

    public int compareTo(Student st) {
        if (getMarks() > st.getMarks())
            return 1;
        return -1;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        sList.add(new Student("hrv", 1900));
        sList.add(new Student("kushc", 990));
        sList.add(new Student("harsh", 1020));

        for (Student s : sList) {
            System.out.println(s);
        }

        Collections.sort(sList);

        for (Student s : sList) {
            System.out.println(s);
        }
    }
}
