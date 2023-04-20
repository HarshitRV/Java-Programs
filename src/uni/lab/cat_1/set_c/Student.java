package src.uni.lab.cat_1.set_c;

import java.util.Scanner;

// Develop a class called Student containing registration number, 
// name and total credits registered by a student. Define the set 
// and get method and a zero argument constructor for the class. 
// Read students’ information through keyboard. Develop a user-defined 
// exception called CreditsOutOfRange to throw exception whenever 
// the total number of credits registered by a student is either less 
// than 16 or greater than 24 and an exception called NameCaseException 
// should also be thrown if the name of a student is not entered in 
// uppercase letters and an exception called InvalidRegistrationNumber 
// if either the registration number does not start with 22MCA or the 
// registration number has less than nine characters. Show the usage of 
// these custom exceptions in try-catch-finally blocks inside a driver class.

public class Student {
    private String regnNo;
    private String name;
    private double credits;

    public Student() {
        regnNo = "";
        name = "";
        credits = 0.0d;
    }

    public String getRegnNo() {
        return regnNo;
    }

    public void setRegnNo(String regnNo) throws InvalidRegistrationNumber {
        if (!regnNo.startsWith("22MCA"))
            throw new InvalidRegistrationNumber("regnNum must start with 22MCA");

        if (regnNo.length() < 9)
            throw new InvalidRegistrationNumber("regnNum must be greater than or equal to 9");

        this.regnNo = regnNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameCaseException {
        String upperCaseName = name.toUpperCase();
        if (name != upperCaseName)
            throw new NameCaseException("name must be entered in upper cases only");
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) throws CreditsOutOfRange {
        if (credits < 16 || credits > 24)
            throw new CreditsOutOfRange("credits must be withing range of 16 to 24");
        this.credits = credits;
    }

}

class CreditsOutOfRange extends Exception {
    CreditsOutOfRange(String errMsg) {
        super(errMsg);
    }
}

class NameCaseException extends Exception {
    NameCaseException(String errMsg) {
        super(errMsg);
    }
}

class InvalidRegistrationNumber extends Exception {
    InvalidRegistrationNumber(String errMsg) {
        super(errMsg);
    }
}

class DriverStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        try {
            System.out.print("Enter regn num: ");
            String regnNum = sc.nextLine();

            st.setRegnNo(regnNum);
        } catch (InvalidRegistrationNumber e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            st.setName(name);
        } catch (NameCaseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.print("Enter credits: ");
            double credits = sc.nextDouble();
            st.setCredits(credits);
        } catch (CreditsOutOfRange e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        sc.close();
    }
}