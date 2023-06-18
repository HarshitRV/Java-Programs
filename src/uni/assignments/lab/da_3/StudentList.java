package src.uni.assignments.lab.da_3;

import java.util.*;

class Student {
    private String name;
    private int[] marks;
    private double avg_marks;

    Student(String name) {
        this.name = name;
        this.marks = new int[5];
        this.avg_marks = 0;
    }

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.setAvgMarks();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setAvgMarks() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        avg_marks = sum / 5;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAvgMarks() {
        return avg_marks;
    }

    public String toString() {
        return "[Name: " + name + ",Marks: " + Arrays.toString(marks) + ",Average Marks: " + avg_marks + "]";
    }
}

public class StudentList {
    private ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList<Student>(3);
    }

    public void addStudent(Student st) {
        list.add(st);
    }

    public void listStudentDetails() {
        list.sort(Comparator.comparingDouble(Student::getAvgMarks));

        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.printf("Name: %s | Avg Marks: %.2f %n", st.getName(), st.getAvgMarks());
        }
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName;
        int[] studentMarks;

        Student st;

        // StudentList
        StudentList studentList = new StudentList();

        System.out.println("Enter details of 3 students\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1));
            studentName = sc.next();
            System.out.println("Enter marks for " + studentName);
            studentMarks = new int[5];
            for (int j = 0; j < studentMarks.length; j++) {
                studentMarks[i] = sc.nextInt();
            }

            st = new Student(studentName, studentMarks);

            studentList.addStudent(st);
        }

        studentList.listStudentDetails();
    }
}
