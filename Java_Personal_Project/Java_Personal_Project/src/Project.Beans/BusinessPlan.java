
public class BusinessPlan extends MobilePlan {

    protected int numberOfEmployees;
    protected int ABN;

    public BusinessPlan(int id, String userName, MobilePhone mobilePhone, int internetQuota, int capLimit,
            int numberOfEmployees, int ABN, MyDate expiryDate) throws PlanException, PlanExceptionUserName {
        super(id, userName, mobilePhone, internetQuota, capLimit, expiryDate);
        this.numberOfEmployees = numberOfEmployees;
        this.ABN = ABN;
    }

    @Override
    public void print() { // Prints the information
        super.print();
        System.out.println("| Number of Employees: " + this.numberOfEmployees + " ABN: " + this.ABN);
    }

    @Override
    public String toString() { // Converts the information to string
        return super.toString() + "| Number of Employees: " + this.numberOfEmployees + " ABN: " + this.ABN;
    }

    @Override
    public double calcPayment(double flatRate) { // Calculates the payment
        double businessPlanBaseFormula = (((mobilePhoneHandset.getPrice() / 24) + (super.capLimit / 10)
                + (super.internetQuota * 10))
                + flatRate);
        if (numberOfEmployees > 10) {
            businessPlanBaseFormula += ((this.numberOfEmployees - 10) * 50);
            return businessPlanBaseFormula;
        } else {
            return businessPlanBaseFormula;
        }
    }

    // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public BusinessPlan(BusinessPlan businessPlan) {
        super(businessPlan);
        this.numberOfEmployees = businessPlan.numberOfEmployees;
        this.ABN = businessPlan.ABN;
    }

    @Override
    public BusinessPlan clone() throws CloneNotSupportedException {
        BusinessPlan businessPlan = (BusinessPlan) super.clone();
        businessPlan.mobilePhoneHandset = mobilePhoneHandset.clone();
        businessPlan.expiryDate = expiryDate.clone();
        return businessPlan;
    }

    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String toDilimitedString() {
        return "bp" + "," + super.toDilimitedString() + "," + this.numberOfEmployees + "," + this.ABN;
    }

    public int getABN() {
        return this.ABN;
    }

    public int getNumberOfEmployee() {
        return this.numberOfEmployees;
    }

    //lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void setABN(int abn) {
        this.ABN = abn;
    }

    public void setNumberOfEmployee(int nOP) {
        this.numberOfEmployees = nOP;
    }
}
