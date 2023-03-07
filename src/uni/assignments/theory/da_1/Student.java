package src.uni.assignments.theory.da_1;

import java.time.LocalDate;
import java.time.Period;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Student {
    private String name;
    private String regnNum;
    private String dob; // must be in YYYY-MM-DD format
    private String[] courses;

    public Student(String name, String regnNum) {
        this.name = name;
        this.regnNum = regnNum;
        this.courses = new String[3];
    }

    public Student(String name, String regnNum, String dob) {
        this(name, regnNum);
        this.dob = dob;
    }

    void setName(String name) {
        this.name = name;
    }

    void setRegNum(String regnNum) {
        this.regnNum = regnNum;
    }

    void setDob(String dob) {
        this.dob = dob;
    }

    void setCourses(String course1, String course2, String course3) {
        this.courses[1] = course1;
        this.courses[2] = course2;
        this.courses[3] = course3;
    }

    String getName() {
        return name;
    }

    String getRegnNum() {
        return regnNum;
    }

    String getDob() {
        return dob;
    }

    String[] getCourses() {
        return courses;
    }

    int getAge() {
        LocalDate dob = LocalDate.parse(this.dob);
        LocalDate currDate = LocalDate.now();
        return Period.between(dob, currDate).getYears();
    }
}

class TestStudent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student[] students = new Student[3];

        System.out.println("Enter details for 3 students");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student: " + (i + 1));

            System.out.print("Enter regn: ");
            String regn = br.readLine();

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter dob in YYYY-MM-DD format: ");
            String dob = br.readLine();

            Student st = new Student(name, regn, dob);
            students[i] = st;
        }

        System.out.println("\nStudent Details:");
        System.out.printf("%-20s %-20s %-10s%n", "Registration Number", "Name", "Age");
        for (Student student : students) {
            System.out.printf("%-20s %-20s %-10d%n", student.getRegnNum(), student.getName(), student.getAge());
        }
    }
}