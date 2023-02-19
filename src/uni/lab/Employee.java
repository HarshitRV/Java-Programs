package src.uni.lab;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     *  
     * @param firstName String - Employee first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @param lastName String - Employee last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @param salary double - Employee salary
     */
    public void setSalary(double salary) {
        if (salary < 0)
            return;
        this.salary = salary;
    }

    /**
     * 
     * @return String - Employee first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @return String - Employee last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @return double - Employee salary
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * 
     * @param raise float - Raise in employee salary in percentage
     */
    public void raiseSalay(float raise) {
        salary += salary * (raise / 100);
    }

    /**
     * @return void -  Displays employee details to the console
     */
    public void displayEmployeeDetails() {
        System.out.println("\nFirst Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Salary: " + this.getSalary());
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ram", "Rahuvanshi", 1000000);
        Employee emp2 = new Employee("Laxman", "Raguvanshi", 500000);

        // Displaying employees details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        System.out.println("\nRam yearly salary: " + emp1.getSalary());
        System.out.println("Laxman yearly salary: " + emp2.getSalary());

        // Raising both salary by 10%
        emp1.raiseSalay(10);
        emp2.raiseSalay(10);

        System.out.println("\nRam yearly salary now: " + emp1.getSalary());
        System.out.println("Laxman yearly salary now: " + emp2.getSalary());
    }
}
