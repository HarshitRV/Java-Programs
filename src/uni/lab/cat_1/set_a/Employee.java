package src.uni.lab.cat_1.set_a;

// Consider an abstract class Employee with an abstract method 
// generatePaySlip. Make Faculty and Staff the concrete subclasses of 
// Employee. An employee has a name, address, an office and a basic pay. 
// A faculty member has a rank and an additional academic pay apart from 
// the basic pay. If the rank of a faculty member is Professor then his 
// academic pay is 100000 rupees; otherwise it is 50000 rupees. The salary 
// of a faculty member is computed as the sum of the basic pay and the 
// academic pay. A staff member has a title and a pay depending on 
// her/his title. If the staff member is a manager then her/his salary 
// is computed as the sum of the basic pay and an additional allowance of 
// 30% of the basic pay; otherwise it is the sum of the basic pay and an 
// additional allowance of 10% of the basic pay. Develop a program that 
// creates an Employee, Faculty, and Staff object and invokes their generatePaySlip method.

public abstract class Employee {
    private String name;
    private String address;
    private String office;
    private double basicPay;

    public Employee(String name, String address, String office, double basicPay) {
        this.name = name;
        this.address = address;
        this.office = office;
        this.basicPay = basicPay;
    }

    public abstract String generatePaySlip();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

}

class Faculty extends Employee {
    private String rank;
    private double academicPay;

    Faculty(String name, String address, String office, double basicPay, String rank) {
        super(name, address, office, basicPay);
        this.rank = rank;
        if (rank == "Professor")
            academicPay = 100000;
        else
            academicPay = 50000;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
        setAcademicPay(rank);
    }

    public double getAcademicPay() {
        return academicPay;
    }

    public void setAcademicPay(String rank) {
        if (rank == "Professor")
            academicPay = 100000;
        academicPay = 50000;
    }

    public String generatePaySlip() {
        if (rank == "Professor")
            return "Payslip: " + (getBasicPay() + getAcademicPay());
        return "Payslip: " + (getBasicPay() + getAcademicPay());
    }
}

class Staff extends Employee {
    private String title;
    private double salary;

    Staff(String name, String address, String office, double basicPay, String title) {
        super(name, address, office, basicPay);
        this.title = title;
        if (title == "Manager")
            salary = basicPay + (basicPay * 0.3);
        else
            salary = basicPay + (basicPay * 0.1);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setSalary(title);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(String title) {
        if (title == "Manager")
            salary = getBasicPay() + (getBasicPay() * 0.3);
        else
            salary = getBasicPay() + (getBasicPay() * 0.1);
    }

    public void setAcademicPay(String title) {
        if (title == "Manager")
            salary = getBasicPay() + (getBasicPay() * 0.3);
        salary = getBasicPay() + (getBasicPay() * 0.1);
    }

    public String generatePaySlip() {
        return "Payslip: " + getSalary();
    }
}

class DriverEmployee {
    public static void main(String[] args) {
        Faculty fa = new Faculty("Harshit", "VNS", "PRP", 100000, "Professor");
        Staff st = new Staff("Shivam", "VLR", "PRP", 40000, "Manager");

        System.out.println(fa.generatePaySlip());
        System.out.println(st.generatePaySlip());
    }
}