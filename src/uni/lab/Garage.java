package src.uni.lab;

public class Garage {
    private double minimumFee;
    private double additionalPerHourFee;
    private double maxFee;

    public Garage() {
        minimumFee = 2;
        additionalPerHourFee = 0.5;
        maxFee = 10;
    }

    /**
     *  
     * @return double - Minimum garage fee
     */
    public double getMinimumFee() {
        return minimumFee;
    }

    /**
     * 
     * @return double - Addition per hour garage fee
     */
    public double getAdditionalPerHourFee() {
        return additionalPerHourFee;
    }

    /**
     * 
     * @return double - Max fee of the garage
     */
    public double getMaxFee() {
        return maxFee;
    }

    /**
     * 
     * @param minimumFee double - Minimum garage fee
     */
    public void setMinimumFee(double minimumFee) {
        this.minimumFee = minimumFee;
    }

    /**
     * 
     * @param additionalPerHourFee double - Additional per hour garage fee
     */
    public void setAdditionalPerHourFee(double additionalPerHourFee) {
        this.additionalPerHourFee = additionalPerHourFee;
    }

    /**
     *      
     * @param maxFee double - Max garage fee
     */
    public void setMaxFee(double maxFee) {
        this.maxFee = maxFee;
    }

    /**
     * 
     * @param hours int - Total hours vehicle parked
     * @return double - Charges for hours parked
     */
    public double calculateCharge(int hours) {
        if (hours == 24) {
            return maxFee;
        }
        if (hours > 3) {
            return minimumFee + ((hours - 3) * additionalPerHourFee);
        }
        return minimumFee;
    }
}

class TestGarage {
    public static void main(String[] args) {
        Garage g = new Garage();

        System.out.println("Parking charges for 3hours: " + g.calculateCharge(3));
        System.out.println("Parking charges for 5hours: " + g.calculateCharge(5));
        System.out.println("Parking charges for 24hours: " + g.calculateCharge(24));
    }
}