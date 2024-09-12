
public class PersonalPlan extends MobilePlan {

    protected String city;

    public PersonalPlan(int id, String userName, MobilePhone mobilePhone, int internetQuota, int capLimit,
            String city, MyDate expiryDate) throws PlanException, PlanExceptionUserName {
        super(id, userName, mobilePhone, internetQuota, capLimit, expiryDate);
        this.city = city;
    }

    @Override
    public void print() { // Prints the information
        super.print();
        System.out.println("| city: " + city);
    }

    @Override
    public String toString() { // Converts the information to string
        return super.toString() + "| city: " + this.city;
    }

    @Override
    public double calcPayment(double flatRate) { // Calculates the payment
        return ((mobilePhoneHandset.getPrice() / 24) + (super.capLimit / 20) + (super.internetQuota * 5)) + flatRate;
    }

    // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public PersonalPlan(PersonalPlan personalPlan) {
        super(personalPlan);
        this.city = personalPlan.city;
    }

    @Override
    public PersonalPlan clone() throws CloneNotSupportedException {
        PersonalPlan personalPlan = (PersonalPlan) super.clone();
        personalPlan.mobilePhoneHandset = mobilePhoneHandset.clone();
        personalPlan.expiryDate = expiryDate.clone();
        return personalPlan;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public String toDilimitedString() {
    // return "pp" + "," + super.toDilimitedString() + "," + this.city + "," +
    // "blank";
    // }
    // Assignment 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String toDilimitedString() {
        return "pp" + "," + super.toDilimitedString() + "," + this.city;
    }

    public String getCity() {
        return this.city;
    }
}
