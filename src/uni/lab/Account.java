/**
 * @author - Harshit Kr Vishwakarma
 */

package src.uni.lab;

public class Account {
    private String name;
    private String number;
    private double balance;

    /**
     * 
     * @param name    String - Account holder name
     * @param number  String - Account holder number
     * @param balance double - Account holder balance
     */
    public Account(String name, String number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    /**
     * @param name String - Account holder name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param number String - Account holder account number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @param balance double - Account holder balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return String - Name of the account holder
     */
    public String getName() {
        return name;
    }

    /**
     * @return String - Account number of the account holder
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return double - Balance of the account holder
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param amount double - Amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount > balance)
            return;
        balance -= amount;
    }

    /**
     * @param amount double - Amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * @return double - Interest earned per annum at 6%
     */
    public double computeInterest() {
        return balance * 0.06;
    }

    public void details(){
        System.out.println("Account Name: " + this.getName());
        System.out.println("Account Number: " + this.getNumber());
        System.out.println("Account Balance: " + this.getBalance());
        System.out.println("Interest Earned: " + this.computeInterest());
    }

    public static void main(String[] args) {
        Account account = new Account("Harshit", "111", 1000000);
        account.deposit(100000);
        System.out.println("Updated balance: " + account.getBalance());

        account.withdraw(10000);
        System.out.println("Updated balance: " + account.getBalance());

        double interestEarned = account.computeInterest();
        System.out.println("Interest Earned: " + interestEarned + "\n");

        account.details();
    }
}