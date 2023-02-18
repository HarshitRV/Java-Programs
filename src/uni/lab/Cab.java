package src.uni.lab;

public class Cab {
    private String regnNumber;
    private String driverName;
    private double rate;
    private double totalDistance;

    public Cab(String regnNumber, String driverName, double rate) {
        this.regnNumber = regnNumber;
        this.driverName = driverName;
        this.rate = rate;
        this.totalDistance = 0;
    }

    /**
     * @param regnNumber String - Driver registeration number
     */
    public void setRegnNumber(String regnNumber) {
        this.regnNumber = regnNumber;
    }

    /**
     * @param driverName String - Driver name
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * 
     * @param rate double - Rate per km
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * 
     * @param totalDistance double - Total distance covered
     */
    public void setTotalDistance(double totalDistance) {
        if (totalDistance < 0)
            return;
        this.totalDistance += totalDistance;
    }

    /**
     * 
     * @return String - Driver registeration number
     */
    public String getRegnNumber() {
        return regnNumber;
    }

    /**
     * 
     * @return String -  Driver name
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 
     * @return double - Rate per km
     */
    public double getRate() {
        return rate;
    }

    /**
     * 
     * @return double - Total distance covered in a day
     */
    public double getTotalDistance() {
        return totalDistance;
    }

    /**
     * 
     * @return double - Daily income
     */
    public double computeDailyIncome() {
        return totalDistance * rate;
    }
}

class Income {
    public static void main(String[] args) {
        Cab[] cabs = new Cab[3];

        for (int i = 0; i < 3; i++) {
            cabs[i] = new Cab(""+(i + 1000), "Cam", 5);
            cabs[i].setTotalDistance(Math.floor((Math.random()) * 100));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nRegn Number: " + cabs[i].getRegnNumber());
            System.out.println("Driver name: " + cabs[i].getDriverName());
            System.out.println("Income: " + cabs[i].computeDailyIncome());
        }
    }
}