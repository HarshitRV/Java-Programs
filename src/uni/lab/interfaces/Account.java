package src.uni.lab.interfaces;

interface BankAccount {
    double withdraw(float amount);
    void deposit(float amount);
}

class Account implements BankAccount{
    private String number;
    private float balance;

    Account(String number){
        this.number = number;
        balance = 0;
    }

    Account(String number, float balance){
        this(number);
        this.balance = balance;
    }

    String getNumber(){
        return number;
    }

    float getBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance = amount;
    }

    public double withdraw(float amount){
        if(balance < amount) return -1;
        balance -= amount;
        return amount;
    }
}

class CreditCardAccount implements BankAccount{
    private String number;
    int limit;

    CreditCardAccount(String number){
        this.number = number;
        limit = 10000;
    }

    CreditCardAccount(String number, int limit){
        this(number);
        this.limit = limit;
    }

    String getNumber(){
        return number;
    }

    int getLimit(){
        return limit;
    }

    public double withdraw(float amount){
        if(limit < amount) return -1;
        limit -= amount;
        return amount;
    }

    public void deposit(float amount){
        double fees = 0.005 * amount;
        limit -= fees;
        limit += amount;
    }
}

class DriverAccounts{
    public static void main(String[] args) {
        Account a = new Account("1111");
        a.deposit(100);
        System.out.println(a.withdraw(50));
        System.out.println("Balance: " + a.getBalance());

        CreditCardAccount b = new CreditCardAccount("2222");
        b.withdraw(1000);
        System.out.println("Limit: "+ b.getLimit());
    }
}