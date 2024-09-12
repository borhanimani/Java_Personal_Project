
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class User implements Cloneable, Comparable<User>, Serializable {

    private String name;
    private int userID;
    private Address address;
    // private ArrayList<MobilePlan> plans;

    // public User(int id, String name, Address address) {
    // this.userID = id;
    // this.name = name;
    // this.address = address;
    // this.plans = new ArrayList<>();
    // }
    // public void setCity(String city) {
    // address.setCity(city);
    // }
    // public void setStreet(String street) {
    // address.setStreet(street);
    // }
    // public void setSuburb(String suburb) {
    // address.setSuburb(suburb);
    // }
    // public void setStreetNum(int streetNum) {
    // address.setStreetNum(streetNum);
    // }
    // public boolean addPlan(MobilePlan plan) {
    // if (findPlan(plan.id) == null) {
    // this.plans.add(plan);
    // return true;
    // } else {
    // return false;
    // }
    // }
    // public MobilePlan findPlan(int planID) {
    // for (MobilePlan plan : this.plans) {
    // if (plan.id == planID) {
    // return plan;
    // }
    // }
    // return null;
    // }
    // public void print() {
    // System.out.print("User: ID:" + this.userID + " Name: " + this.name + "
    // Address: ");
    // address.print();
    // System.out.println(" Plans:");
    // MobilePlan.printPlans(this.plans);
    // }
    // public String toString() {
    // return "User: ID:" + this.userID + " Name: " + this.name + " Address: " +
    // address.toString() + " Plans: " + "\n"
    // + MobilePlan.printPlansToString(plans);
    // }
    // public void printPlans(int flatRate) {
    // MobilePlan.printPlans(plans);
    // System.out.println("Total Payment: " + calcTotalPayments(flatRate));
    // }
    // public double calcTotalPayments(int flatRate) {
    // return MobilePlan.calcTotalPayments(this.plans, flatRate);
    // }
    // public void mobilePriceRiseAll(double risePercent) {
    // MobilePlan.mobilePriceRiseAll(this.plans, risePercent);
    // }
    // public ArrayList<MobilePlan> filterByMobileModel(String mobileModel) {
    // ArrayList<MobilePlan> filteredPlans =
    // MobilePlan.fillterByMobileModel(this.plans, mobileModel);
    // return filteredPlans;
    // }
    // // Lab3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public boolean createPersonalPlan(String userName, int id, MobilePhone
    // mobilePhone, int internetQuota, int capLimit,
    // MyDate expiryDate, String city) {
    // PersonalPlan personalPlan = new PersonalPlan(id, userName, mobilePhone,
    // internetQuota, capLimit, city,
    // expiryDate);
    // return addPlan(personalPlan);
    // }
    // public boolean createBusinessPlan(String userName, int id, MobilePhone
    // mobilePhone, int internetQuota, int capLimit,
    // int numberOfEmployees,
    // MyDate expiryDate, int ABN) {
    // BusinessPlan businessPlan = new BusinessPlan(id, userName, mobilePhone,
    // internetQuota, capLimit,
    // numberOfEmployees, ABN,
    // expiryDate);
    // return addPlan(businessPlan);
    // }
    // public ArrayList<MobilePlan> filterByExpiryDate(MyDate date) {
    // return MobilePlan.filterByExpiryDate(this.plans, date);
    // }
    // public int getuserID() {
    // return this.userID;
    // }
    // public ArrayList<MobilePlan> getPlans() {
    // return this.plans;
    // }
    // public void printUserInformationWithoutPlans() {
    // System.out.println("User: ID:" + this.userID + " Name: " + this.name + "
    // Address: ");
    // address.print();
    // }
    // // public void setAddress(String city, String street, String suburb, int
    // // streetNum) {
    // // address.setCity(city);
    // // address.setStreet(street);
    // // address.setSuburb(suburb);
    // // address.setStreetNum(streetNum);
    // // }
    // // Assignemnt1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // private static int ID; // Typically this attribute must be at the top part of
    // class but I wrote in
    // // assingment 1 part
    // public User(String name, Address address) {
    // ID += 1;
    // this.userID = ID;
    // this.name = name;
    // this.address = address;
    // this.plans = new ArrayList<>();
    // }
    // public String getUserCity() {
    // return address.getCity();
    // }
    // public boolean removePlan(int planID) {
    // for (MobilePlan plan : plans) {
    // if (plan.getId() == planID) {
    // plans.remove(plan);
    // return true;
    // }
    // }
    // return false;
    // }
    // public ArrayList<String> populateDistinctMobileModel() {
    // ArrayList<String> populateDistincCities = new ArrayList<>();
    // for (MobilePlan plan : this.plans) {
    // String mobileModel = plan.getMobileModel();
    // if (!(populateDistincCities.contains(mobileModel))) {
    // populateDistincCities.add(mobileModel);
    // }
    // }
    // return populateDistincCities;
    // }
    // public int getTotalCountForMobileModel(String mobileModel) {
    // int numberOfPlans = 0;
    // for (MobilePlan plan : this.plans) {
    // if (plan.getMobileModel().equals(mobileModel)) {
    // numberOfPlans += 1;
    // }
    // }
    // return numberOfPlans;
    // }
    // public double getTotalPaymentForMobileModel(String mobileModel, int flatRate)
    // {
    // double totalPayment = 0;
    // for (MobilePlan plan : this.plans) {
    // if (plan.getMobileModel().equals(mobileModel)) {
    // totalPayment += plan.calcPayment(flatRate);
    // }
    // }
    // return totalPayment;
    // }
    // public ArrayList<Integer> getTotalCountPerMobileModel(ArrayList<String>
    // mobileModels) {
    // ArrayList<Integer> totalCountPerMobileModel = new ArrayList<>();
    // for (String mobileModel : mobileModels) {
    // int numberOfPlansPerMobileModel = getTotalCountForMobileModel(mobileModel);
    // totalCountPerMobileModel.add(numberOfPlansPerMobileModel);
    // }
    // return totalCountPerMobileModel;
    // }
    // public ArrayList<Double> getTotalPaymentPerMobileModel(ArrayList<String>
    // mobileModels, int flatRate) {
    // ArrayList<Double> totalPaymentPerMobileModel = new ArrayList<>();
    // for (String mobileModel : mobileModels) {
    // double numberOfPlansPerMobileModel =
    // getTotalPaymentForMobileModel(mobileModel, flatRate);
    // totalPaymentPerMobileModel.add(numberOfPlansPerMobileModel);
    // }
    // return totalPaymentPerMobileModel;
    // }
    // public static void reportPaymentsPerMobileModel(ArrayList<String>
    // mobileModels, ArrayList<Integer> counts,
    // ArrayList<Double> monthlyPayments) {
    // int listSize = mobileModels.size();
    // System.out.println(
    // "Mobile Model Number of The Model Average Monthly Payment");
    // for (int i = 0; i < listSize; i++) {
    // System.out.println(mobileModels.get(i) + " " + counts.get(i)
    // + " $" + monthlyPayments.get(i));
    // }
    // }
    // // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public User(User user) {
    // this.userID = user.userID;
    // this.name = user.name;
    // this.address = user.address;
    // this.plans = new ArrayList<>();
    // }
    // public User clone() throws CloneNotSupportedException {
    // User user = (User) super.clone();
    // user.address = address.clone();
    // user.plans = new ArrayList<MobilePlan>();
    // for (MobilePlan plan : this.plans) {
    // user.plans.add(plan.clone());
    // }
    // return user;
    // }
    // public static ArrayList<User> shallowCopy(ArrayList<User> users) {
    // ArrayList<User> shallowCopy = new ArrayList<User>();
    // for (User user : users) {
    // shallowCopy.add(user);
    // }
    // return shallowCopy;
    // }
    // public static ArrayList<User> deepCopy(ArrayList<User> users) throws
    // CloneNotSupportedException {
    // ArrayList<User> deepCopy = new ArrayList<User>();
    // for (User user : users) {
    // deepCopy.add(user.clone());
    // }
    // return deepCopy;
    // }
    // public ArrayList<MobilePlan> deepCopyPlans() throws
    // CloneNotSupportedException {
    // ArrayList<MobilePlan> deepCopyPlans = new ArrayList<>();
    // deepCopyPlans = MobilePlan.deepCopy(this.plans);
    // return deepCopyPlans;
    // }
    // public ArrayList<MobilePlan> shallowCopyUsers() {
    // ArrayList<MobilePlan> shallowCopyPlans = new ArrayList<>();
    // shallowCopyPlans = MobilePlan.shallowCopy(this.plans);
    // return shallowCopyPlans;
    // }
    // public int compareTo(User user) {
    // return this.address.compareTo(user.address);
    // }
    // public int compareTo1(User user, int flatRate) {
    // if (this.calcTotalPayments(flatRate) > user.calcTotalPayments(flatRate)) {
    // return 1;
    // } else if (this.calcTotalPayments(flatRate) <
    // user.calcTotalPayments(flatRate)) {
    // return -1;
    // } else {
    // return 0;
    // }
    // }
    // public ArrayList<MobilePlan> sortPlansByDate() {
    // Collections.sort(this.plans);
    // return this.plans;
    // }
    // Lab 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private HashMap<Integer, MobilePlan> plans;

    public User(int id, String name, Address address) {
        this.userID = id;
        this.name = name;
        this.address = address;
        this.plans = new HashMap<Integer, MobilePlan>();
    }

    // public User(String name, Address address) {
    // ID += 1;
    // this.userID = ID;
    // this.name = name;
    // this.address = address;
    // this.plans = new HashMap<Integer, MobilePlan>();
    // }
    public User(User user) {
        this.userID = user.userID;
        this.name = user.name;
        this.address = user.address;
        this.plans = new HashMap<Integer, MobilePlan>();
    }

    // public void setCity(String city) {
    // address.setCity(city);
    // }
    //
    // public void setStreet(String street) {
    // address.setStreet(street);
    // }
    //
    // public void setSuburb(String suburb) {
    // address.setSuburb(suburb);
    // }
    //
    // public void setStreetNum(int streetNum) {
    // address.setStreetNum(streetNum);
    // }
    //
    // public int getUserID() {
    // return this.userID;
    // }
    public boolean addPlan(MobilePlan plan) {
        if (findPlan(plan.id) == null) {
            this.plans.put(plan.id, plan);
            return true;
        } else {
            return false;
        }
    }

    // public boolean createPersonalPlan(String userName, int id, MobilePhone
    // mobilePhone, int internetQuota, int capLimit,
    // MyDate expiryDate, String city) throws PlanException, PlanExceptionUserName {
    // PersonalPlan personalPlan = new PersonalPlan(id, userName, mobilePhone,
    // internetQuota, capLimit, city,
    // expiryDate);
    // return addPlan(personalPlan);
    // }
    // public boolean createBusinessPlan(String userName, int id, MobilePhone
    // mobilePhone, int internetQuota, int capLimit,
    // int numberOfEmployees,
    // MyDate expiryDate, int ABN) throws PlanException, PlanExceptionUserName {
    // BusinessPlan businessPlan = new BusinessPlan(id, userName, mobilePhone,
    // internetQuota, capLimit,
    // numberOfEmployees, ABN,
    // expiryDate);
    // return addPlan(businessPlan);
    // }
    public MobilePlan findPlan(int planID) {
        return this.plans.get(planID);
    }

    public static void print(User user) {
        System.out.print("User: ID:" + user.userID + " Name: " + user.name + " Address: ");
        user.address.print();
        System.out.println(" Plans:");
        MobilePlan.printPlans(user.plans);
    }

//    public static String toString(User user) {
//        return "User: ID:" + user.userID + " Name: " + user.name + " Address: " + user.address.toString() + " Plans: "
//                + "\n"
//                + MobilePlan.printPlansToString(user.plans);
//    }
    // public static void printPlans(User user, int flatRate) {
    // MobilePlan.printPlans(user.plans);
    // System.out.println("Total Payment: " + User.calcTotalPayments(user,
    // flatRate));
    // }
    public static double calcTotalPayments(User user, int flatRate) {
        return MobilePlan.calcTotalPayments(user.plans, flatRate);
    }

    public static void mobilePriceRiseAll(User user, double risePercent) {
        MobilePlan.mobilePriceRiseAll(user.plans, risePercent);
    }

    public static ArrayList<MobilePlan> filterByMobileModel(User user, String mobileModel) {
        ArrayList<MobilePlan> filteredPlans = MobilePlan.fillterByMobileModel(user.plans, mobileModel);
        return filteredPlans;
    }

    public static ArrayList<MobilePlan> filterByExpiryDate(User user, MyDate date) {
        return MobilePlan.filterByExpiryDate(user.plans, date);
    }

    public HashMap<Integer, MobilePlan> getPlans() {
        return this.plans;
    }

    public static void printUserInformationWithoutPlans(User user) {
        System.out.println("User: ID:" + user.userID + " Name: " + user.name + " Address: ");
        user.address.print();
    }

    // public void setAddress(String city, String street, String suburb, int
    // streetNum) {
    // address.setCity(city);
    // address.setStreet(street);
    // address.setSuburb(suburb);
    // address.setStreetNum(streetNum);
    // }
    private static int ID; // Typically this attribute must be at the top part of class but I wrote in
    // assingment 1 part

    public String getUserCity() {
        return address.getCity();
    }

    public boolean removePlan(int planID) {
        for (MobilePlan plan : this.plans.values()) {
            if (plan.getId() == planID) {
                plans.remove(planID);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> populateDistinctMobileModel() {
        ArrayList<String> populateDistincCities = new ArrayList<>();
        for (MobilePlan plan : this.plans.values()) {
            String mobileModel = plan.getMobileModel();
            if (!(populateDistincCities.contains(mobileModel))) {
                populateDistincCities.add(mobileModel);
            }
        }
        return populateDistincCities;
    }

    public int getTotalCountForMobileModel(String mobileModel) {
        int numberOfPlans = 0;
        for (MobilePlan plan : this.plans.values()) {
            if (plan.getMobileModel().equals(mobileModel)) {
                numberOfPlans += 1;
            }
        }
        return numberOfPlans;
    }

    public double getTotalPaymentForMobileModel(String mobileModel, int flatRate) {
        double totalPayment = 0;
        for (MobilePlan plan : this.plans.values()) {
            if (plan.getMobileModel().equals(mobileModel)) {
                totalPayment += plan.calcPayment(flatRate);
            }
        }
        return totalPayment;
    }

    public ArrayList<Integer> getTotalCountPerMobileModel(ArrayList<String> mobileModels) {
        ArrayList<Integer> totalCountPerMobileModel = new ArrayList<>();
        for (String mobileModel : mobileModels) {
            int numberOfPlansPerMobileModel = getTotalCountForMobileModel(mobileModel);
            totalCountPerMobileModel.add(numberOfPlansPerMobileModel);
        }
        return totalCountPerMobileModel;
    }

    public ArrayList<Double> getTotalPaymentPerMobileModel(ArrayList<String> mobileModels, int flatRate) {
        ArrayList<Double> totalPaymentPerMobileModel = new ArrayList<>();
        for (String mobileModel : mobileModels) {
            double numberOfPlansPerMobileModel = getTotalPaymentForMobileModel(mobileModel, flatRate);
            totalPaymentPerMobileModel.add(numberOfPlansPerMobileModel);
        }
        return totalPaymentPerMobileModel;
    }

    // public static void reportPaymentsPerMobileModel(ArrayList<String>
    // mobileModels, ArrayList<Integer> counts,
    // ArrayList<Double> monthlyPayments) {
    // int listSize = mobileModels.size();
    // System.out.println(
    // "Mobile Model Number of Counts Average Monthly Payment");
    // for (int i = 0; i < listSize; i++) {
    // System.out
    // .println(mobileModels.get(i) + " $" + monthlyPayments.get(i)
    // + " $"
    // + (monthlyPayments.get(i) / counts.get(i)));
    // }
    // }
    public User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.address = address.clone();
        user.plans = new HashMap<Integer, MobilePlan>();
        for (MobilePlan plan : this.plans.values()) {
            user.plans.put(plan.getId(), plan.clone());
        }
        return user;
    }

    // public static ArrayList<User> shallowCopy(ArrayList<User> users) {
    // ArrayList<User> shallowCopy = new ArrayList<User>();
    // for (User user : users) {
    // shallowCopy.add(user);
    // }
    // return shallowCopy;
    // }
    // public static ArrayList<User> deepCopy(ArrayList<User> users) throws
    // CloneNotSupportedException {
    // ArrayList<User> deepCopy = new ArrayList<User>();
    // for (User user : users) {
    // deepCopy.add(user.clone());
    // }
    // return deepCopy;
    // }
    public ArrayList<MobilePlan> deepCopyPlans() throws CloneNotSupportedException {
        ArrayList<MobilePlan> deepCopyPlans = new ArrayList<MobilePlan>();
        deepCopyPlans = MobilePlan.deepCopy(this.plans);
        return deepCopyPlans;
    }

    public ArrayList<MobilePlan> shallowCopyUsers() {
        ArrayList<MobilePlan> shallowCopyPlans = new ArrayList<MobilePlan>();
        shallowCopyPlans = MobilePlan.shallowCopy(this.plans);
        return shallowCopyPlans;
    }

    public int compareTo(User user) {
        return this.address.compareTo(user.address);
    }

    // public int compareTo1(User user, int flatRate) {
    // if (User.calcTotalPayments(user, flatRate) > User.calcTotalPayments(user,
    // flatRate)) {
    // return 1;
    // } else if (User.calcTotalPayments(user, flatRate) <
    // User.calcTotalPayments(user, flatRate)) {
    // return -1;
    // } else {
    // return 0;
    // }
    // }
    // public ArrayList<MobilePlan> sortPlansByDate() {
    // ArrayList<MobilePlan> shallowCopyPlanList =
    // MobilePlan.shallowCopy(this.plans);
    // Collections.sort(shallowCopyPlanList);
    // return shallowCopyPlanList;
    // }
    public static ArrayList<User> shallowCopy(HashMap<Integer, User> users) {
        ArrayList<User> shallowCopy = new ArrayList<>();
        for (User user : users.values()) {
            shallowCopy.add(user);
        }
        return shallowCopy;
    }

    public static ArrayList<User> deepCopy(HashMap<Integer, User> users) throws CloneNotSupportedException {
        ArrayList<User> deepCopy = new ArrayList<>();
        for (User user : users.values()) {
            deepCopy.add(user.clone());
        }
        return deepCopy;
    }

    public static HashMap<Integer, User> shallowCopyHashMap(HashMap<Integer, User> users) {
        HashMap<Integer, User> shallowCopy = new HashMap<Integer, User>();
        for (User user : users.values()) {
            shallowCopy.put(user.userID, user);
        }
        return shallowCopy;
    }

    public static HashMap<Integer, User> deepCopyHashMap(HashMap<Integer, User> users)
            throws CloneNotSupportedException {
        HashMap<Integer, User> deepCopy = new HashMap<Integer, User>();
        for (User user : users.values()) {
            deepCopy.put(user.userID, user.clone());
        }
        return deepCopy;
    }

    // public HashMap<String, Integer> getTotalCountPerMobileModel() {
    // HashMap<String, Integer> totalCountPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModel();
    // ArrayList<Integer> mobileModelCount =
    // getTotalCountPerMobileModel(mobileModels);
    // for (int i = 0; i < mobileModels.size(); i++) {
    // totalCountPerMobileModel.put(mobileModels.get(i), mobileModelCount.get(i));
    // }
    // return totalCountPerMobileModel;
    // }
    // public HashMap<String, Double> getTotalPaymentPerMobileModel(int flatRate) {
    // HashMap<String, Double> totalPaymentPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModel();
    // ArrayList<Double> mobileModelPayment =
    // getTotalPaymentPerMobileModel(mobileModels, flatRate);
    // for (int i = 0; i < mobileModels.size(); i++) {
    // totalPaymentPerMobileModel.put(mobileModels.get(i),
    // mobileModelPayment.get(i));
    // }
    // return totalPaymentPerMobileModel;
    // }
    // public static String totalPaymentAndCountPerMobileModelReport(HashMap<String,
    // Integer> totalCountPerMobileModel,
    // HashMap<String, Double> totalPaymentPerMobileModel) {
    // String report = "";
    // for (String name : totalCountPerMobileModel.keySet()) {
    // report += "Mobile Model: " + name + " Total Payment: " +
    // totalPaymentPerMobileModel.get(name)
    // + " Average Monthly Payment: "
    // + (totalPaymentPerMobileModel.get(name) / totalCountPerMobileModel.get(name))
    // + "\n";
    // }
    // return report;
    // }
    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static HashMap<Integer, User> load(String fileName) throws
    // IOException, ClassNotFoundException {
    // ObjectInputStream inputStream = null;
    // HashMap<Integer, User> users = new HashMap<>();
    // try {
    // inputStream = new
    // ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
    // } catch (Exception e) {
    // inputStream.close();
    // return null;
    // }
    // try {
    // while (true) {
    // User inputUser = (User) inputStream.readObject();
    // users.put(inputUser.getUserID(), inputUser);
    // }
    // } catch (EOFException ex) {
    // // do nothing
    // }
    // try {
    // if (inputStream != null) {
    // inputStream.close();
    // }
    // } catch (IOException ex) {
    // return null;
    // }
    // return users;
    // }
    // public static Boolean save(HashMap<Integer, User> users, String fileName)
    // throws IOException {
    // ObjectOutputStream outputStream = null;
    // try {
    // outputStream = new
    // ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
    // } catch (IOException ex) {
    // return false;
    // }
    // try {
    // for (User user : users.values()) {
    // outputStream.writeObject(user);
    // }
    // outputStream.close();
    // return true;
    // } catch (IOException ex) {
    // outputStream.close();
    // return false;
    // }
    // }
    public String toDilimiteString() {
        String dilimitedStringPlans = "";
        for (MobilePlan plan : this.plans.values()) {
            dilimitedStringPlans += plan.toDilimitedString() + ",";
        }
        return this.name + "," + this.userID + "," + this.address.toDilimitedString() + "," + this.plans.size() + ","
                + dilimitedStringPlans;
    }

    // public static HashMap<Integer, User> loadTextFile(String fileName) throws
    // IOException, PlanException {
    // HashMap<Integer, User> users = new HashMap<>();
    // BufferedReader in = null;
    // try {
    // in = new BufferedReader(new FileReader(fileName));
    // } catch (Exception e) {
    // return null;
    // }
    // try {
    // String currentLine = in.readLine();
    // while (currentLine != null) {
    // currentLine = currentLine.trim();
    // String[] lineFields = currentLine.split(",");
    // String currentUserName = lineFields[0];
    // int currentUserID = Integer.parseInt(lineFields[1]);
    // Address address = new Address(Integer.parseInt(lineFields[2]), lineFields[3],
    // lineFields[4],
    // lineFields[5]);
    // User user = new User(currentUserID, currentUserName, address);
    // for (int i = 0; i < Integer.parseInt(lineFields[6]); i++) {
    // int nextStep = i * 14;
    // int currentId = Integer.parseInt(lineFields[8 + nextStep]);
    // String currentName = lineFields[9 + nextStep];
    // int currentInternetQuota = Integer.parseInt(lineFields[10 + nextStep]);
    // int currentCapLimit = Integer.parseInt(lineFields[11 + nextStep]);
    // MobilePhone currentMobilePhoneHandset = new MobilePhone(lineFields[12 +
    // nextStep],
    // MobileType.valueOf(lineFields[13 + nextStep]),
    // Integer.parseInt(lineFields[14 + nextStep]), Double.parseDouble(lineFields[15
    // + nextStep]));
    // MyDate currentExpiryDate = new MyDate(Integer.parseInt(lineFields[16 +
    // nextStep]),
    // Integer.parseInt(lineFields[17 + nextStep]),
    // Integer.parseInt(lineFields[18 + nextStep]));
    // switch (lineFields[7 + nextStep]) {
    // case "pp":
    // String currentCity = lineFields[19 + nextStep];
    // user.createPersonalPlan(currentName, currentId, currentMobilePhoneHandset,
    // currentInternetQuota,
    // currentCapLimit, currentExpiryDate, currentCity);
    // break;
    // case "bp":
    // int currentNumberOfEmployees = Integer.parseInt(lineFields[19 + nextStep]);
    // int cuurentABN = Integer.parseInt(lineFields[20 + nextStep]);
    // user.createBusinessPlan(currentName, currentId, currentMobilePhoneHandset,
    // currentInternetQuota,
    // currentCapLimit, currentNumberOfEmployees, currentExpiryDate, cuurentABN);
    // break;
    // }
    // }
    // users.put(user.userID, user);
    // currentLine = in.readLine();
    // }
    // } catch (IOException ex) {
    // in.close();
    // return null;
    // }
    // in.close();
    // return users;
    // }
    // public static Boolean saveTextFile(HashMap<Integer, User> users, String
    // fileName) throws IOException {
    // BufferedWriter out = null;
    // try {
    // out = new BufferedWriter(new FileWriter(fileName));
    // } catch (IOException ex) {
    // return false;
    // }
    // for (User user : users.values()) {
    // out.write(user.toDilimiteString());
    // }
    // out.close();
    // return true;
    // }
    // Assignment 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//    public static void reportPaymentsPerMobileModel(ArrayList<String> mobileModels, ArrayList<Integer> counts,
//            ArrayList<Double> monthlyPayments) {
//        int listSize = mobileModels.size();
//        System.out.println(
//                "Mobile Model                                        Total Monthly Payment                                       Average Monthly Payment");
//        for (int i = 0; i < listSize; i++) {
//            System.out
//                    .println(mobileModels.get(i) + "                                        $" + monthlyPayments.get(i)
//                            + "                                                         $"
//                            + (monthlyPayments.get(i) / counts.get(i)));
//        }
//    }
    // public HashMap<String, Integer> getTotalCountPerMobileModel() {
    // HashMap<String, Integer> totalCountPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModel();
    // int mobileModelCount = 0;
    // for (String mobileModel : mobileModels) {
    // mobileModelCount = getTotalCountForMobileModel(mobileModel);
    // totalCountPerMobileModel.put(mobileModel, mobileModelCount);
    // }
    // return totalCountPerMobileModel;
    // }
    public HashMap<String, Integer> getTotalCountPerMobileModel() {
        HashMap<String, Integer> totalCountPerMobileModel = new HashMap<>();
        for (MobilePlan plan : this.plans.values()) {
            Integer counter = totalCountPerMobileModel.get(plan.getMobileModel());
            if (counter != null) {
                totalCountPerMobileModel.put(plan.getMobileModel(), counter + 1);
            } else {
                totalCountPerMobileModel.put(plan.getMobileModel(), 1);
            }
        }
        return totalCountPerMobileModel;
    }

    // public HashMap<String, Double> getTotalPaymentPerMobileModel(int flatRate) {
    // HashMap<String, Double> totalPaymentPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModel();
    // Double mobileModelPayment = 0.0;
    // for (String mobileModel : mobileModels) {
    // mobileModelPayment = getTotalPaymentForMobileModel(mobileModel, flatRate);
    // totalPaymentPerMobileModel.put(mobileModel, mobileModelPayment);
    // }
    // return totalPaymentPerMobileModel;
    // }
    public HashMap<String, Double> getTotalPaymentPerMobileModel(int flatRate) {
        HashMap<String, Double> totalPaymentPerMobileModel = new HashMap<>();
        for (MobilePlan plan : this.plans.values()) {
            Double totalPrice = totalPaymentPerMobileModel.get(plan.getMobileModel());
            if (totalPrice != null) {
                totalPaymentPerMobileModel.put(plan.getMobileModel(), totalPrice + plan.calcPayment(flatRate));
            } else {
                totalPaymentPerMobileModel.put(plan.getMobileModel(), plan.calcPayment(flatRate));
            }
        }
        return totalPaymentPerMobileModel;
    }

    public static void reportPaymentsPerMobileModel(HashMap<String, Integer> counts,
            HashMap<String, Double> totals) {
        System.out.println(
                "Mobile Model                                        Total Monthly Payment                                       Average Monthly Payment");
        for (String mobileModel : counts.keySet()) {
            System.out
                    .println(mobileModel + "                                        $"
                            + totals.get(mobileModel)
                            + "                                                         $"
                            + (totals.get(mobileModel)
                            / counts.get(mobileModel)));
        }
    }

    public static boolean saveTextFile(HashMap<Integer, User> users, String fileName) throws IOException {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException ex) {
            System.exit(1);
        }
        for (User user : users.values()) {
            out.write(user.toDilimiteString() + "\n");
        }
        out.close();
        return true;
    }

    public static HashMap<Integer, User> loadTextFile(String fileName)
            throws IOException, PlanException, NumberFormatException, PlanExceptionUserName {
        HashMap<Integer, User> users = new HashMap<>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            System.exit(1);
        }
        try {
            String currentLine = in.readLine();
            while (currentLine != null) {
                currentLine = currentLine.trim();
                String[] lineFields = currentLine.split(",");
                HashMap<Integer, User> userWithCounter = User.readOneUser(lineFields, 0);
                for (User user : userWithCounter.values()) {
                    users.put(user.userID, user);
                }
                currentLine = in.readLine();
            }
        } catch (IOException ex) {
            in.close();
            System.exit(1);
        }
        in.close();
        return users;
    }

    public static HashMap<Integer, User> load(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = null;
        HashMap<Integer, User> users = new HashMap<>();
        try {
            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
        } catch (Exception e) {
            inputStream.close();
            System.exit(1);
        }
        try {
            while (true) {
                User inputUser = (User) inputStream.readObject();
                users.put(inputUser.getUserID(), inputUser);
            }
        } catch (EOFException ex) {
            // do nothing
        }
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException ex) {
            System.exit(1);
        }
        return users;
    }

    public static boolean save(HashMap<Integer, User> users, String fileName) throws IOException {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        } catch (IOException ex) {
            System.exit(1);
        }
        try {
            for (User user : users.values()) {
                outputStream.writeObject(user);
            }
            outputStream.close();
        } catch (IOException ex) {
            outputStream.close();
            System.exit(1);
        }
        return true;
    }

    public static HashMap<Integer, User> readOneUser(String[] lineFields, int index)
            throws NumberFormatException, PlanException, PlanExceptionUserName {
        HashMap<Integer, User> userWithCounter = new HashMap<>();
        String currentUserName = lineFields[index];
        int currentUserID = Integer.parseInt(lineFields[index + 1]);
        Address address = new Address(Integer.parseInt(lineFields[index + 2]), lineFields[index + 3],
                lineFields[index + 4],
                lineFields[index + 5]);
        User user = new User(currentUserID, currentUserName, address);
        int counter = index + 7;
        for (int i = 0; i < Integer.parseInt(lineFields[index + 6]); i++) {
            MobilePlan plan = MobilePlan.readOnePlan(lineFields, counter);
            user.addPlan(plan);
            if (plan instanceof PersonalPlan) {
                counter += 13;
            } else {
                counter += 14;
            }
        }
        userWithCounter.put(counter, user);
        return userWithCounter;
    }

    public static User returnUser(HashMap<Integer, User> userWithCounter) {
        User result = null;
        for (User user : userWithCounter.values()) {
            result = user;
        }
        return result;
    }

    public static Integer returnCounter(HashMap<Integer, User> userWithCounter) {
        Integer result = 0;
        for (Integer counter : userWithCounter.keySet()) {
            result = counter;
        }
        return result;
    }

    public ArrayList<MobilePlan> shallowCopyPlans() {
        ArrayList<MobilePlan> shallowCopy = new ArrayList<>();
        shallowCopy = MobilePlan.shallowCopy(this.plans);
        return shallowCopy;
    }

    public HashMap<Integer, MobilePlan> deepCopyPlansHashMap() throws CloneNotSupportedException {
        HashMap<Integer, MobilePlan> deepCopy = new HashMap<>();
        deepCopy = MobilePlan.deepCopyHashMap(this.plans);
        return deepCopy;
    }

    public HashMap<Integer, MobilePlan> shallowCopyPlansHashMap() {
        HashMap<Integer, MobilePlan> shallowCopy = new HashMap<>();
        shallowCopy = MobilePlan.shallowCopyHashMap(this.plans);
        return shallowCopy;
    }

    public ArrayList<MobilePlan> sortPlansByDate() {
        ArrayList<MobilePlan> shallowCopyPlanList = shallowCopyPlans();
        Collections.sort(shallowCopyPlanList);
        return shallowCopyPlanList;
    }

    public static void printUsers(HashMap<Integer, User> users) {
        for (User user : users.values()) {
            System.out.println(user);
        }
    }

    public User(String name, Address address) {
        ID += 1;
        this.userID = ID;
        this.name = name;
        this.address = address;
        this.plans = new HashMap<Integer, MobilePlan>();
    }
    //
    // public String getCity() {
    // return this.address.getCity();
    // }
    //
    // public String getName() {
    // return this.name;
    // }

    // Lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private String username;
    private String password;

    public User(int id, String name, Address address, String username, String password) {
        this.userID = id;
        this.name = name;
        this.address = address;
        this.username = username;
        this.password = password;
        this.plans = new HashMap<Integer, MobilePlan>();
    }

    public boolean validateUser(String username, String password) {
        if ((this.username.equalsIgnoreCase(username)) && (this.password.equals(password))) {
            return true;
        } else {
            return false;
        }
    }

    public int getUserID() {
        return this.userID;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getCity() {
        return this.address.getCity();
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // lab 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public boolean createPersonalPlan(String userName, int id, MobilePhone mobilePhone, int internetQuota, int capLimit,
            MyDate expiryDate, String city) throws PlanException, PlanExceptionUserName {

        PersonalPlan personalPlan = null;
        try {
            personalPlan = new PersonalPlan(id, userName, mobilePhone, internetQuota, capLimit, city,
                    expiryDate);
        } catch (PlanException e) {
            personalPlan = new PersonalPlan(e.getNewID(), userName, mobilePhone, internetQuota, capLimit, city,
                    expiryDate);
        }
        return addPlan(personalPlan);
    }

    public boolean createBusinessPlan(String userName, int id, MobilePhone mobilePhone, int internetQuota, int capLimit,
            int numberOfEmployees,
            MyDate expiryDate, int ABN) throws PlanException, PlanExceptionUserName {
        BusinessPlan businessPlan = null;
        try {
            businessPlan = new BusinessPlan(id, userName, mobilePhone, internetQuota, capLimit, numberOfEmployees, ABN,
                    expiryDate);
        } catch (PlanException e) {
            businessPlan = new BusinessPlan(e.getNewID(), userName, mobilePhone, internetQuota, capLimit,
                    numberOfEmployees, ABN, expiryDate);
        }
        return addPlan(businessPlan);
    }

    public static void printPlans(User user, int flatRate) {
        user.plans.values().stream().forEach(x -> x.print());
    }

    public static ArrayList<User> shallowCopy(ArrayList<User> users) {
        ArrayList<User> shallowCopy = users;
        return shallowCopy;
    }

    public static ArrayList<User> deepCopy(ArrayList<User> users) throws CloneNotSupportedException {
        return (ArrayList<User>) (users.stream().collect(Collectors.toCollection(ArrayList::new)));
    }

    public double calcTotalpaymentForEachUser(int flatRate) {
        return this.plans.values().stream().map(x -> x.calcPayment(flatRate)).reduce(0.00, (x, y) -> x + y);
    }

    // Assignment #3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String toString() {
        return "User: ID:" + this.userID + " Name: " + this.name + " Address: " + this.address.toString() + " Plans: "
                + "\n"
                + MobilePlan.printPlansToString(this.plans);
    }

    public static String reportPaymentsPerMobileModel(ArrayList<String> mobileModels, ArrayList<Integer> counts,
            ArrayList<Double> monthlyPayments) {
        String message = "";
        int listSize = mobileModels.size();
        message += "Mobile Model" + "\t\t" + "Total Premium" + "\t\t" + "Average Premium" + "\t" + "Number Of Models" + "\n";
        for (int i = 0; i < listSize; i++) {
            message += (mobileModels.get(i) + "\t\t" + String.format("$%.2f", monthlyPayments.get(i)) + "\t\t" + String.format("$%.2f", (monthlyPayments.get(i) / counts.get(i)))) + "\t\t" + counts.get(i) + "\n";
        }
        return message;
    }
}
