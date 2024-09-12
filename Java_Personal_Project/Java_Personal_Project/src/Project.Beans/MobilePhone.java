
import java.io.Serializable;

public class MobilePhone implements Cloneable, Serializable {

    private String model;
    private int memorySize;
    private double price;
    private MobileType mobileType;

    public MobilePhone(String model, MobileType mobileType, int memorySize, double price) {
        this.model = model;
        this.memorySize = memorySize;
        this.price = price;
        this.mobileType = mobileType;
    }

    public double getPrice() { // Gets price
        return this.price;
    }

    public void print() { // Prints the information
        System.out.print(
                "| Phone: " + this.model + " Type: " + this.mobileType + " Memory Size: " + this.memorySize + "GB"
                + " Price: " + this.price);
    }

    public String toString() { // Converts the information to string
        return "| Phone: Model: " + this.model + " Type: " + this.mobileType + " Memory Size: " + this.memorySize
                + "GB" + " Price: "
                + this.price;
    }

    public String getMobileModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorySize() {
        return this.memorySize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MobileType getMobileType() {
        return this.mobileType;
    }

    public void priceRise(double rise) {
        this.price = this.price * (1 + rise);
    }

    // public boolean modelIsSameAsCalledMobileModel(String mobileModel) {
    // String currentMobileModel = this.model;
    // currentMobileModel = currentMobileModel.toLowerCase();
    // mobileModel = mobileModel.toLowerCase();
    // if (currentMobileModel.equalsIgnoreCase(mobileModel)) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public MobilePhone(MobilePhone mobilePhone) {
        this.model = mobilePhone.model;
        this.memorySize = mobilePhone.memorySize;
        this.price = mobilePhone.price;
    }

    @Override
    public MobilePhone clone() {
        return new MobilePhone(model, mobileType, memorySize, price);
    }

    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String toDilimitedString() {
        return this.model + "," + this.mobileType + "," + this.memorySize + "," + this.price;
    }

    //lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void setMobileType(String type) {
        this.mobileType = MobileType.valueOf(type);
    }

    public void setMemorySize(int size) {
        this.memorySize = size;
    }
}
