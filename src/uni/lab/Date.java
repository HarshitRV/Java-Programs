package src.uni.lab;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * 
     * @param day int - day of the year
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 
     * @param month int - month of the year
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 
     * @param year int - year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *  
     * @return int day
     */
    public int getDay() {
        return day;
    }

    /**
     *  
     * @return int month
     */
    public int getMonth() {
        return month;
    }

    /**
     * 
     * @return int year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return void - display date to the console
     */
    public void displayDate() {
        System.out.format("%d/%d/%d\n", this.getDay(), this.getMonth(), this.getYear());
    }
}

class TestDate {
    public static void main(String[] args) {
        Date today = new Date(19, 2, 2023);
        today.displayDate();

        today.setDay(10);
        today.setMonth(12);
        today.setYear(2024);

        today.displayDate();
    }
}