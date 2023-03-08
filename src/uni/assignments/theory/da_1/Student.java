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

    void setCourses(String[] courses) {
        for (int i = 0; i < courses.length; i++) {
            this.courses[i] = courses[i];
        }
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
            System.out.println("\nStudent: " + (i + 1));

            System.out.print("Enter regn: ");
            String regn = br.readLine();

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter dob in YYYY-MM-DD format: ");
            String dob = br.readLine();

            System.out.print("Enter number of courses enrolled in: ");
            int numCourses = Integer.parseInt(br.readLine());
            String[] courses = new String[numCourses];
            for (int j = 0; j < numCourses; j++) {
                System.out.print("Enter course name " + (j + 1) + " : ");
                courses[j] = br.readLine();
            }

            Student st = new Student(name, regn, dob);
            st.setCourses(courses);
            students[i] = st;
        }

        System.out.println("\nStudent Details:");
        System.out.printf("%-20s %-20s %-10s%n", "Registration Number", "Name", "Age");
        for (Student student : students) {
            System.out.printf("%-20s %-20s %-10d%n", student.getRegnNum(), student.getName(), student.getAge());
        }
    }
}