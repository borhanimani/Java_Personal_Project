import java.io.Serializable;

public class Address implements Cloneable, Comparable<Address>, Serializable {

    private int streetNum;
    private String street;
    private String suburb;
    private String city;

    public Address(int streetNum, String street, String suburb, String city) {
        this.streetNum = streetNum;
        this.street = street;
        this.suburb = suburb;
        this.city = city;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void print() {
        System.out.print(this.city + " " + this.suburb + " " + this.street + " " + this.streetNum);
    }

    public String toString() {
        return this.city + " " + this.suburb + " " + this.street + " " + this.streetNum;
    }

    // Assignemnt1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public String getCity() {
        return city;
    }

    // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public Address(Address address) {
        this.streetNum = address.streetNum;
        this.street = address.street;
        this.suburb = address.suburb;
        this.city = address.city;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    public int compareTo(Address address) {
        return this.city.compareTo(address.city);
    }

    // Lab6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public String toDilimitedString() {
        return this.streetNum + "," + this.street + "," + this.suburb + "," + this.city;
    }
    
    // Lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    
    public int getStreetNum(){
        return this.streetNum;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    public String getSuburb(){
        return this.suburb;
    }
}
