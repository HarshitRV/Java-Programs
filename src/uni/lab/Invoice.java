package src.uni.lab;

public class Invoice {
    private String partNumber;
    private String partDesc;
    private int partQuantity;
    private double partPrice;

    public Invoice(String partNumber, String partDesc, int partQuantity, double partPrice) {
        this.partNumber = partNumber;
        this.partDesc = partDesc;
        this.partQuantity = partQuantity;
        this.partPrice = partPrice;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public void setPartQuantity(int partQuantity) {
        if (partQuantity < 0) {
            this.partQuantity = 0;
            return;
        }
        this.partQuantity = partQuantity;
    }

    public void setPartPrice(double partPrice) {
        if (partPrice < 0) {
            this.partPrice = 0;
            return;
        }
        this.partPrice = partPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public int getPartQuantity() {
        return partQuantity;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public double getInvoiceAmount() {
        return partQuantity * partPrice;
    }

    public void displayPartDetails() {
        System.out.println("Part Number: " + this.getPartNumber());
        System.out.println("Part Desc: " + this.getPartDesc());
        System.out.println("Part Quantity: " + this.getPartQuantity());
        System.out.println("Part Price Per Unit: " + this.getPartPrice());
        System.out.println("Total Amount: " + this.getInvoiceAmount());
    }
}

class TestInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Quality Screws", 10, 100);
        invoice.displayPartDetails();
    }
}