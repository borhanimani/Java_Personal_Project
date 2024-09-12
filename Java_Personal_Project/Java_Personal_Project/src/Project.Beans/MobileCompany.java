
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class MobileCompany implements Cloneable, Serializable {

    private String name;
    // private ArrayList<User> users;
    private String adminUsername;
    private String adminPassword;
    private int flatRate;

    // public void setAdminPassword(String password) {
    // this.adminPassword = password;
    // }
    // public String getAdminUsername() {
    // return this.adminUsername;
    // }
    // public MobileCompany(String name, String adminUsername, String adminPassword,
    // int flatRate) {
    // this.name = name;
    // this.adminUsername = adminUsername;
    // this.adminPassword = adminPassword;
    // this.flatRate = flatRate;
    // this.users = new ArrayList<>();
    // }
    // public boolean validateAdmin(String username, String password) {
    // return ((this.adminUsername.equalsIgnoreCase(username)) &&
    // (this.adminPassword.equals(password)));
    // }
    // public boolean addUser(User user) {
    // if (findUser(user.getuserID()) == null) {
    // this.users.add(user);
    // return true;
    // }
    // return false;
    // }
    // public boolean addUser(String name, int userID, Address address) {
    // User user = new User(userID, name, address);
    // return addUser(user);
    // }
    // public User findUser(int userID) {
    // for (User user : this.users) {
    // if (user.getuserID() == userID) {
    // return user;
    // }
    // }
    // return null;
    // }
    // public boolean addPlan(int userID, MobilePlan plan) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.addPlan(plan);
    // }
    // return false;
    // }
    // public MobilePlan findPlan(int userID, int planID) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.findPlan(planID);
    // }
    // return null;
    // }
    // public void printPlans(int userID) {
    // User user = findUser(userID);
    // if (user != null) {
    // user.print();
    // } else {
    // System.out.println("No User Found");
    // }
    // }
    // public void print() {
    // System.out.println("Company name: " + this.name + " Admin Username: " +
    // this.adminUsername + " Flat rate: "
    // + this.flatRate);
    // for (User user : this.users) {
    // user.printUserInformationWithoutPlans();
    // user.printPlans(this.flatRate);
    // }
    // }
    // public String toString() {
    // String result = "Company name: " + this.name + " Admin Username: " +
    // this.adminUsername + " Flat rate: "
    // + this.flatRate + "\n";
    // for (User user : users) {
    // result += user.toString() + "\n" + "\n";
    // }
    // return result;
    // }
    // public boolean createPersonalPlan(int userID, String username, int id,
    // MobilePhone mobilePhone, int internetQuota,
    // int capLimit, MyDate expiryDate, String city) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.createPersonalPlan(username, id, mobilePhone, internetQuota,
    // capLimit, expiryDate, city);
    // }
    // return false;
    // }
    // public boolean createBusinessPlan(int userID, String username, int id,
    // MobilePhone mobilePhone, int internetQuota,
    // int capLimit, MyDate expiryDate, int numberOfEmployees, int ABN) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.createBusinessPlan(username, id, mobilePhone, internetQuota,
    // capLimit, numberOfEmployees,
    // expiryDate, ABN);
    // }
    // return false;
    // }
    // public double calcTotalPayments(int userID) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.calcTotalPayments(this.flatRate);
    // }
    // return -1;
    // }
    // public double calcTotalPayments() {
    // double totalPayments = 0;
    // for (User user : this.users) {
    // totalPayments += user.calcTotalPayments(this.flatRate);
    // }
    // return totalPayments;
    // }
    // public boolean mobilePriceRise(int userID, double risePercent) {
    // User user = findUser(userID);
    // if (user != null) {
    // user.mobilePriceRiseAll(risePercent);
    // return true;
    // }
    // return false;
    // }
    // public void mobilePriceRise(double risePercent) {
    // for (User user : this.users) {
    // user.mobilePriceRiseAll(risePercent);
    // }
    // }
    // public ArrayList<MobilePlan> allPlan() {
    // ArrayList<MobilePlan> allPlans = new ArrayList<>();
    // for (User user : this.users) {
    // ArrayList<MobilePlan> userPlans = user.getPlans();
    // for (MobilePlan plan : userPlans) {
    // allPlans.add(plan);
    // }
    // }
    // return allPlans;
    // }
    // public ArrayList<MobilePlan> filterByMobileModel(int userID, String
    // mobileModel) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.filterByMobileModel(mobileModel);
    // }
    // return null;
    // }
    // public ArrayList<MobilePlan> filterByExpiryDate(int userID, MyDate date) {
    // User user = findUser(userID);
    // if (user != null) {
    // return user.filterByExpiryDate(date);
    // }
    // return null;
    // }
    // public ArrayList<MobilePlan> filterByMobileModel(String mobileModel) {
    // ArrayList<MobilePlan> totalFilteredPlans = new ArrayList<>();
    // for (User user : this.users) {
    // for (MobilePlan plan : user.filterByMobileModel(mobileModel)) {
    // totalFilteredPlans.add(plan);
    // }
    // }
    // return totalFilteredPlans;
    // }
    // public ArrayList<MobilePlan> filterByExpiryDate(MyDate date) {
    // ArrayList<MobilePlan> totalFilteredPlans = new ArrayList<>();
    // ArrayList<MobilePlan> userFilteredPlans = new ArrayList<>();
    // for (User user : this.users) {
    // userFilteredPlans = user.filterByExpiryDate(date);
    // for (MobilePlan plan : userFilteredPlans) {
    // totalFilteredPlans.add(plan);
    // }
    // }
    // return totalFilteredPlans;
    // }
    // // Assignemnt1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public void printUserInformationWithout(int userID) {
    // User user = findUser(userID);
    // if (user != null) {
    // user.printUserInformationWithoutPlans();
    // }
    // // else{
    // // System.out.println("No user ID found");
    // // } I didn't need this part of code because this method used in
    // UserInterface
    // // class\printUserInformation method
    // }
    // public boolean updateUserAddress(int userID, ArrayList<String> newAddress) {
    // User user = findUser(userID);
    // if (user != null) {
    // user.setStreetNum(Integer.parseInt(newAddress.get(0)));
    // user.setStreet(newAddress.get(1));
    // user.setSuburb(newAddress.get(2));
    // user.setCity(newAddress.get(3));
    // return true;
    // }
    // return false;
    // }
    // public ArrayList<String> populateDistincCityNames() {
    // ArrayList<String> populateDistincCities = new ArrayList<>();
    // for (User user : this.users) {
    // String city = user.getUserCity();
    // if (!(populateDistincCities.contains(city))) {
    // populateDistincCities.add(city);
    // }
    // }
    // return populateDistincCities;
    // }
    // public double getTotalPaymentForCity(String city) {
    // double totalPayment = 0;
    // for (User user : users) {
    // if (user.getUserCity().equals(city)) {
    // totalPayment += user.calcTotalPayments(this.flatRate);
    // }
    // }
    // return totalPayment;
    // }
    // public ArrayList<Double> getTotalPaymentPerCity(ArrayList<String> cities) {
    // ArrayList<Double> totalPaymentPerCity = new ArrayList<>();
    // ArrayList<String> populateDistincCities = new ArrayList<>();
    // populateDistincCities = populateDistincCityNames();
    // for (String city : populateDistincCities) {
    // totalPaymentPerCity.add(getTotalPaymentForCity(city));
    // }
    // return totalPaymentPerCity;
    // }
    // public static void reportPaymentPerCity(ArrayList<String> cities,
    // ArrayList<Double> payments) {
    // int listsSize = cities.size();
    // System.out.println("City Name Total Monthly Payment ");
    // for (int i = 0; i < listsSize; i++) {
    // String city = cities.get(i);
    // double totalMonthlyPayment = payments.get(i);
    // System.out.println(city + " $" + totalMonthlyPayment);
    // }
    // }
    // public boolean removeUserPlan(int userID, int planID) {
    // User user = findUser(userID);
    // if (user != null) {
    // user.removePlan(planID);
    // return true;
    // }
    // return false;
    // }
    // public boolean removeUser(int userID) {
    // User user = findUser(userID);
    // if (user != null) {
    // this.users.remove(user);
    // return true;
    // }
    // return false;
    // }
    // public ArrayList<String> populateDistinctMobileModels() {
    // ArrayList<String> populateDictinctMobileModels = new ArrayList<>();
    // ArrayList<String> populateDicrinctMobileModelsOfEachUser = new ArrayList<>();
    // for (User user : this.users) {
    // populateDicrinctMobileModelsOfEachUser = user.populateDistinctMobileModel();
    // for (String eachModelInUser : populateDicrinctMobileModelsOfEachUser) {
    // populateDictinctMobileModels.add(eachModelInUser);
    // }
    // }
    // return populateDictinctMobileModels;
    // }
    // public ArrayList<Integer> getTotalCountPerMobileModel(ArrayList<String>
    // mobileModels) {
    // ArrayList<Integer> totalCountPerMobileModel = new ArrayList<>();
    // ArrayList<Integer> totalCountPerMobileModelForEachUser = new ArrayList<>();
    // for (User user : this.users) {
    // totalCountPerMobileModelForEachUser =
    // user.getTotalCountPerMobileModel(mobileModels);
    // for (Integer eachModelInUser : totalCountPerMobileModelForEachUser) {
    // totalCountPerMobileModel.add(eachModelInUser);
    // }
    // }
    // return totalCountPerMobileModel;
    // }
    // public ArrayList<Double> getTotalPaymentPerMobileModel(ArrayList<String>
    // mobileModels) {
    // ArrayList<Double> totalPaymentPerMobileModel = new ArrayList<>();
    // ArrayList<Double> totalPaymentPerMobileModelForEachUser = new ArrayList<>();
    // for (User user : this.users) {
    // totalPaymentPerMobileModelForEachUser =
    // user.getTotalPaymentPerMobileModel(mobileModels, this.flatRate);
    // for (Double eachModelInUser : totalPaymentPerMobileModelForEachUser) {
    // totalPaymentPerMobileModel.add(eachModelInUser);
    // }
    // }
    // return totalPaymentPerMobileModel;
    // }
    // public static void reportPaymentsPerMobileModel(ArrayList<String>
    // mobileModels, ArrayList<Integer> counts,
    // ArrayList<Double> monthlyPayments) {
    // User.reportPaymentsPerMobileModel(mobileModels, counts, monthlyPayments);
    // }
    // public boolean addUserWithAutoGeneratingID(String name, Address address) {
    // User user = new User(name, address);
    // return addUser(user);
    // }
    // // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public MobileCompany(MobileCompany mobileCompany) {
    // this.name = mobileCompany.name;
    // this.adminUsername = mobileCompany.adminUsername;
    // this.adminPassword = mobileCompany.adminPassword;
    // this.flatRate = mobileCompany.flatRate;
    // this.users = new ArrayList<>();
    // }
    // @Override
    // public MobileCompany clone() throws CloneNotSupportedException {
    // MobileCompany mobileCompany = (MobileCompany) super.clone();
    // mobileCompany.users = new ArrayList<User>();
    // for (User user : this.users) {
    // mobileCompany.users.add(user.clone());
    // }
    // return mobileCompany;
    // }
    // public ArrayList<User> deepCopyUsers() throws CloneNotSupportedException {
    // ArrayList<User> deepCopy = new ArrayList<>();
    // deepCopy = User.deepCopy(this.users);
    // return deepCopy;
    // }
    // public ArrayList<User> shallowCopyUsers() {
    // ArrayList<User> shallowCopy = new ArrayList<>();
    // shallowCopy = User.shallowCopy(this.users);
    // return shallowCopy;
    // }
    // public ArrayList<User> sortUsers() {
    // Collections.sort(this.users);
    // return this.users;
    // }
    // Lab 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private HashMap<Integer, User> users;

    public MobileCompany(String name, String adminUsername, String adminPassword, int flatRate) {
        this.name = name;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.flatRate = flatRate;
        this.users = new HashMap<Integer, User>();
    }

    public void setAdminPassword(String password) {
        this.adminPassword = password;
    }

    public String getAdminUsername() {
        return this.adminUsername;
    }

    public int getFlatRate() {
        return this.flatRate;
    }

    public boolean validateAdmin(String username, String password) {
        return ((this.adminUsername.equalsIgnoreCase(username)) && (this.adminPassword.equals(password)));
    }

    public boolean addUser(User user) {
        if (findUser(user.getUserID()) == null) {
            this.users.put(user.getUserID(), user);
            return true;
        }
        return false;
    }

    public boolean addUser(String name, int userID, Address address) {
        User user = new User(userID, name, address);
        return addUser(user);
    }

    public User findUser(int userID) {
        return this.users.get(userID);
    }

    public boolean addPlan(int userID, MobilePlan plan) {
        User user = findUser(userID);
        if (user != null) {
            return user.addPlan(plan);
        }
        return false;
    }

    public MobilePlan findPlan(int userID, int planID) {
        User user = findUser(userID);
        if (user != null) {
            return user.findPlan(planID);
        }
        return null;
    }

    public void printPlans(int userID) {
        User user = findUser(userID);
        if (user != null) {
            User.print(user);
        } else {
            System.out.println("No User Found");
        }
    }

    public void print() {
        System.out.println("Company name: " + this.name + " Admin Username: " + this.adminUsername + " Flat rate: "
                + this.flatRate);
        for (User user : this.users.values()) {
            User.printUserInformationWithoutPlans(user);
            User.printPlans(user, this.flatRate);
        }
    }

    public String toString() {
        String result = "Company name: " + this.name + " Admin Username: " + this.adminUsername + " Flat rate: "
                + this.flatRate + "\n";
        for (User user : this.users.values()) {
            result += user.toString() + "\n";
        }
        return result;
    }

    public boolean createPersonalPlan(int userID, String username, int id, MobilePhone mobilePhone, int internetQuota,
            int capLimit, MyDate expiryDate, String city) throws PlanException, PlanExceptionUserName {
        User user = findUser(userID);
        if (user != null) {
            return user.createPersonalPlan(username, id, mobilePhone, internetQuota, capLimit, expiryDate, city);
        }
        return false;
    }

    public boolean createBusinessPlan(int userID, String username, int id, MobilePhone mobilePhone, int internetQuota,
            int capLimit, MyDate expiryDate, int numberOfEmployees, int ABN)
            throws PlanException, PlanExceptionUserName {
        User user = findUser(userID);
        if (user != null) {
            return user.createBusinessPlan(username, id, mobilePhone, internetQuota, capLimit, numberOfEmployees,
                    expiryDate, ABN);
        }
        return false;
    }

    public double calcTotalPayments(int userID) {
        User user = findUser(userID);
        if (user != null) {
            return User.calcTotalPayments(user, this.flatRate);
        }
        return -1;
    }

    // public double calcTotalPayments() {
    // double totalPayments = 0;
    // for (User user : this.users.values()) {
    // totalPayments += User.calcTotalPayments(user, this.flatRate);
    // }
    // return totalPayments;
    // }
    public boolean mobilePriceRise(int userID, double risePercent) {
        User user = findUser(userID);
        if (user != null) {
            User.mobilePriceRiseAll(user, risePercent);
            return true;
        }
        return false;
    }

//    public void mobilePriceRise(double risePercent) {
//        for (User user : this.users.values()) {
//            User.mobilePriceRiseAll(user, risePercent);
//        }
//    }
    // public ArrayList<MobilePlan> allPlan() {
    // ArrayList<MobilePlan> allPlans = new ArrayList<>();
    // for (User user : this.users.values()) {
    // HashMap<Integer, MobilePlan> userPlans = user.getPlans();
    // for (MobilePlan plan : userPlans.values()) {
    // allPlans.add(plan);
    // }
    // }
    // return allPlans;
    // }
    public ArrayList<MobilePlan> filterByMobileModel(int userID, String mobileModel) {
        User user = findUser(userID);
        if (user != null) {
            return User.filterByMobileModel(user, mobileModel);
        }
        return null;
    }

    public ArrayList<MobilePlan> filterByExpiryDate(int userID, MyDate date) {
        User user = findUser(userID);
        if (user != null) {
            return User.filterByExpiryDate(user, date);
        }
        return null;
    }

//    public ArrayList<MobilePlan> filterByMobileModel(String mobileModel) {
//        ArrayList<MobilePlan> totalFilteredPlans = new ArrayList<>();
//        for (User user : this.users.values()) {
//            for (MobilePlan plan : User.filterByMobileModel(user, mobileModel)) {
//                totalFilteredPlans.add(plan);
//            }
//        }
//        return totalFilteredPlans;
//    }
    public ArrayList<MobilePlan> filterByExpiryDate(MyDate date) {
        ArrayList<MobilePlan> totalFilteredPlans = new ArrayList<>();
        ArrayList<MobilePlan> userFilteredPlans = new ArrayList<>();
        for (User user : this.users.values()) {
            userFilteredPlans = User.filterByExpiryDate(user, date);
            for (MobilePlan plan : userFilteredPlans) {
                totalFilteredPlans.add(plan);
            }
        }
        return totalFilteredPlans;
    }

    public void printUserInformationWithout(int userID) {
        User user = findUser(userID);
        if (user != null) {
            User.printUserInformationWithoutPlans(user);
        }
        // else{
        // System.out.println("No user ID found");
        // } I didn't need this part of code because this method used in UserInterface
        // class\printUserInformation method
    }

    // public boolean updateUserAddress(int userID, ArrayList<String> newAddress) {
    // User user = findUser(userID);
    // if (user != null) {
    // user.setStreetNum(Integer.parseInt(newAddress.get(0)));
    // user.setStreet(newAddress.get(1));
    // user.setSuburb(newAddress.get(2));
    // user.setCity(newAddress.get(3));
    // return true;
    // }
    // return false;
    // }
    public ArrayList<String> populateDistincCityNames() {
        ArrayList<String> populateDistincCities = new ArrayList<>();
        for (User user : this.users.values()) {
            String city = user.getUserCity();
            if (!(populateDistincCities.contains(city))) {
                populateDistincCities.add(city);
            }
        }
        return populateDistincCities;
    }

    // public double getTotalPaymentForCity(String city) {
    // double totalPayment = 0;
    // for (User user : this.users.values()) {
    // if (user.getUserCity().equals(city)) {
    // totalPayment += User.calcTotalPayments(user, this.flatRate);
    // }
    // }
    // return totalPayment;
    // }
    // public ArrayList<Double> getTotalPaymentPerCity(ArrayList<String> cities) {
    // ArrayList<Double> totalPaymentPerCity = new ArrayList<>();
    // ArrayList<String> populateDistincCities = new ArrayList<>();
    // populateDistincCities = populateDistincCityNames();
    // for (String city : populateDistincCities) {
    // totalPaymentPerCity.add(getTotalPaymentForCity(city));
    // }
    // return totalPaymentPerCity;
    // }
//    public static void reportPaymentPerCity(ArrayList<String> cities, ArrayList<Double> payments) {
//        int listsSize = cities.size();
//        System.out.println("City Name                    Total Monthly Payment ");
//        for (int i = 0; i < listsSize; i++) {
//            String city = cities.get(i);
//            double totalMonthlyPayment = payments.get(i);
//            System.out.println(city + "                 $" + totalMonthlyPayment);
//        }
//    }
    public boolean removeUserPlan(int userID, int planID) {
        User user = findUser(userID);
        if (user != null) {
            user.removePlan(planID);
            return true;
        }
        return false;
    }

    public boolean removeUser(int userID) {
        User user = findUser(userID);
        if (user != null) {
            this.users.remove(userID);
            return true;
        }
        return false;
    }

    // public ArrayList<String> populateDistinctMobileModels() {
    // ArrayList<String> populateDictinctMobileModels = new ArrayList<>();
    // ArrayList<String> populateDicrinctMobileModelsOfEachUser = new ArrayList<>();
    // for (User user : this.users.values()) {
    // populateDicrinctMobileModelsOfEachUser = user.populateDistinctMobileModel();
    // for (String eachModelInUser : populateDicrinctMobileModelsOfEachUser) {
    // populateDictinctMobileModels.add(eachModelInUser);
    // }
    // }
    // return populateDictinctMobileModels;
    // }
    // public ArrayList<Integer> getTotalCountPerMobileModel(ArrayList<String>
    // mobileModels) {
    // ArrayList<Integer> totalCountPerMobileModel = new ArrayList<>();
    // ArrayList<Integer> totalCountPerMobileModelForEachUser = new ArrayList<>();
    // for (User user : this.users.values()) {
    // totalCountPerMobileModelForEachUser =
    // user.getTotalCountPerMobileModel(mobileModels);
    // for (Integer eachModelInUser : totalCountPerMobileModelForEachUser) {
    // totalCountPerMobileModel.add(eachModelInUser);
    // }
    // }
    // return totalCountPerMobileModel;
    // }
    // public ArrayList<Double> getTotalPaymentPerMobileModel(ArrayList<String>
    // mobileModels) {
    // ArrayList<Double> totalPaymentPerMobileModel = new ArrayList<>();
    // ArrayList<Double> totalPaymentPerMobileModelForEachUser = new ArrayList<>();
    // for (User user : this.users.values()) {
    // totalPaymentPerMobileModelForEachUser =
    // user.getTotalPaymentPerMobileModel(mobileModels, this.flatRate);
    // for (Double eachModelInUser : totalPaymentPerMobileModelForEachUser) {
    // totalPaymentPerMobileModel.add(eachModelInUser);
    // }
    // }
    // return totalPaymentPerMobileModel;
    // }
    // public static void reportPaymentsPerMobileModel(ArrayList<String>
    // mobileModels, ArrayList<Integer> counts,
    // ArrayList<Double> monthlyPayments) {
    // User.reportPaymentsPerMobileModel(mobileModels, counts, monthlyPayments);
    // }
    public boolean addUserWithAutoGeneratingID(String name, Address address) {
        User user = new User(name, address);
        return addUser(user);
    }

    public MobileCompany(MobileCompany mobileCompany) {
        this.name = mobileCompany.name;
        this.adminUsername = mobileCompany.adminUsername;
        this.adminPassword = mobileCompany.adminPassword;
        this.flatRate = mobileCompany.flatRate;
        this.users = new HashMap<Integer, User>();
    }

    @Override
    public MobileCompany clone() throws CloneNotSupportedException {
        MobileCompany mobileCompany = (MobileCompany) super.clone();
        mobileCompany.users = new HashMap<Integer, User>();
        for (User user : this.users.values()) {
            mobileCompany.users.put(user.getUserID(), user.clone());
        }
        return mobileCompany;
    }

    public ArrayList<User> deepCopyUsers() throws CloneNotSupportedException {
        ArrayList<User> deepCopy = new ArrayList<>();
        deepCopy = User.deepCopy(this.users);
        return deepCopy;
    }

    public ArrayList<User> shallowCopyUsers() {
        ArrayList<User> shallowCopy = new ArrayList<>();
        shallowCopy = User.shallowCopy(this.users);
        return shallowCopy;
    }

    // public ArrayList<User> sortUsers() {
    // ArrayList<User> shallowCopyPlanList = User.shallowCopy(this.users);
    // Collections.sort(shallowCopyPlanList);
    // return shallowCopyPlanList;
    // }
    // public HashMap<String, Double> getTotalPaymentPerCity() {
    // HashMap<String, Double> totalPaymentPerCity = new HashMap<>();
    // ArrayList<String> cities = populateDistincCityNames();
    // ArrayList<Double> totalPayments = getTotalPaymentPerCity(cities);
    // for (int i = 0; i < cities.size(); i++) {
    // totalPaymentPerCity.put(cities.get(i), totalPayments.get(i));
    // }
    // return totalPaymentPerCity;
    // }
    // public HashMap<String, Integer> getTotalCountPerMobileModel() {
    // HashMap<String, Integer> totalCountPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModel = populateDistinctMobileModels();
    // ArrayList<Integer> mobileModelCount =
    // getTotalCountPerMobileModel(mobileModel);
    // for (int i = 0; i < mobileModel.size(); i++) {
    // totalCountPerMobileModel.put(mobileModel.get(i), mobileModelCount.get(i));
    // }
    // return totalCountPerMobileModel;
    // }
    // public HashMap<String, Double> getTotalPaymentPerMobileModel(int flatRate) {
    // HashMap<String, Double> totalPaymentPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModels();
    // ArrayList<Double> mobileModelPayment =
    // getTotalPaymentPerMobileModel(mobileModels);
    // for (int i = 0; i < mobileModels.size(); i++) {
    // totalPaymentPerMobileModel.put(mobileModels.get(i),
    // mobileModelPayment.get(i));
    // }
    // return totalPaymentPerMobileModel;
    // }
    // public static String totalPaymentAndCountPerCityReport(HashMap<String,
    // Integer> totalCountPerCity,
    // HashMap<String, Double> totalPaymentPerCity) {
    // String report = "";
    // for (String name : totalCountPerCity.keySet()) {
    // report += "Mobile Model: " + name + " Total Payment: "
    // + totalPaymentPerCity.get(name) + " Average Monthly Payment: "
    // + (totalPaymentPerCity.get(name) / totalCountPerCity.get(name)) + "\n";
    // }
    // return report;
    // }
    // public static void reportPaymentsPerMobileModel(HashMap<String, Integer>
    // totalCountPerMobileModel,
    // HashMap<String, Double> totalPaymentPerMobileModel) {
    // User.reportPaymentsPerMobileModel(totalCountPerMobileModel,
    // totalPaymentPerMobileModel);
    // }
    public HashMap<String, Integer> getTotalCountPerCity() {
        HashMap<String, Integer> totalCountPerCity = new HashMap<>();
        ArrayList<String> cities = populateDistincCityNames();
        for (String city : cities) {
            int count = 0;
            for (Integer userID : this.users.keySet()) {
                if (users.get(userID).getUserCity().equalsIgnoreCase(city)) {
                    totalCountPerCity.put(city, count += 1);
                }
            }
        }
        return totalCountPerCity;
    }

    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public boolean load(String fileName) throws ClassNotFoundException, IOException {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
        } catch (IOException ex) {
            return false;
        }
        try {
            while (true) {
                MobileCompany mobileCompany = (MobileCompany) inputStream.readObject();
                this.name = mobileCompany.name;
                this.adminUsername = mobileCompany.adminUsername;
                this.adminPassword = mobileCompany.adminPassword;
                this.flatRate = mobileCompany.flatRate;
                this.users = mobileCompany.users;
            }
        } catch (EOFException ex) {
            // do nothing
        }
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save(String fileName) throws IOException {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        } catch (IOException ex) {
            return false;
        }
        try {
            outputStream.writeObject(this);
            outputStream.close();
            return true;
        } catch (IOException ex) {
            outputStream.close();
            return false;
        }
    }

    public String toDilimitedString() {
        String dilimitedStringUsers = "";
        for (User user : this.users.values()) {
            dilimitedStringUsers += user.toDilimiteString();
        }
        return this.name + "," + this.adminUsername + "," + this.adminPassword + "," + this.flatRate + ","
                + this.users.size() + "," + dilimitedStringUsers;
    }

    // public Boolean loadTextFile(String fileName) throws IOException,
    // PlanException {
    // this.users = new HashMap<>();
    // BufferedReader in = null;
    // try {
    // in = new BufferedReader(new FileReader(fileName));
    // } catch (IOException ex) {
    // return false;
    // }
    // try {
    // String currentLine = in.readLine();
    // while (currentLine != null) {
    // currentLine = currentLine.trim();
    // String[] lineFields = currentLine.split(",");
    // int lastUserInfoHome = 5;
    // String name = lineFields[0];
    // String adminUserName = lineFields[1];
    // String adminPassword = lineFields[2];
    // int flatRate = Integer.parseInt(lineFields[3]);
    // this.name = name;
    // this.adminUsername = adminUserName;
    // this.adminPassword = adminPassword;
    // this.flatRate = flatRate;
    // for (int i = 0; i < Integer.parseInt(lineFields[4]); i++) {
    // String currentUserName = lineFields[lastUserInfoHome];
    // int currentUserID = Integer.parseInt(lineFields[lastUserInfoHome + 1]);
    // Address userAddress = new
    // Address(Integer.parseInt(lineFields[lastUserInfoHome + 2]),
    // lineFields[lastUserInfoHome + 3], lineFields[lastUserInfoHome + 4],
    // lineFields[lastUserInfoHome + 5]);
    // int nextStep = 0;
    // addUser(currentUserName, currentUserID, userAddress);
    // for (int j = 0; j < Integer.parseInt(lineFields[lastUserInfoHome + 6]); j++)
    // {
    // nextStep = j * 14;
    // int currentId = Integer.parseInt(lineFields[(lastUserInfoHome + 8) +
    // nextStep]);
    // String currentName = lineFields[(lastUserInfoHome + 9) + nextStep];
    // int currentInternetQuota = Integer.parseInt(lineFields[(lastUserInfoHome +
    // 10) + nextStep]);
    // int currentCapLimit = Integer.parseInt(lineFields[(lastUserInfoHome + 11) +
    // nextStep]);
    // MobilePhone currentMobilePhoneHandset = new MobilePhone(
    // lineFields[(lastUserInfoHome + 12) + nextStep],
    // MobileType.valueOf(lineFields[(lastUserInfoHome + 13) + nextStep]),
    // Integer.parseInt(lineFields[(lastUserInfoHome + 14) + nextStep]),
    // Double.parseDouble(lineFields[(lastUserInfoHome + 15) + nextStep]));
    // MyDate currentExpiryDate = new MyDate(
    // Integer.parseInt(lineFields[(lastUserInfoHome + 16) + nextStep]),
    // Integer.parseInt(lineFields[(lastUserInfoHome + 17) + nextStep]),
    // Integer.parseInt(lineFields[(lastUserInfoHome + 18) + nextStep]));
    // switch (lineFields[(lastUserInfoHome + 7) + nextStep]) {
    // case "pp":
    // String currentCity = lineFields[(lastUserInfoHome + 19) + nextStep];
    // if (createPersonalPlan(currentUserID, currentName, currentId,
    // currentMobilePhoneHandset,
    // currentInternetQuota,
    // currentCapLimit, currentExpiryDate, currentCity) == false) {
    // return false;
    // }
    // break;
    // case "bp":
    // int currentNumberOfEmployees = Integer
    // .parseInt(lineFields[(lastUserInfoHome + 19) + nextStep]);
    // int cuurentABN = Integer.parseInt(lineFields[(lastUserInfoHome + 20) +
    // nextStep]);
    // if (createBusinessPlan(currentUserID, currentName, currentId,
    // currentMobilePhoneHandset,
    // currentInternetQuota, currentCapLimit, currentExpiryDate,
    // currentNumberOfEmployees,
    // cuurentABN) == false) {
    // return false;
    // }
    // break;
    // }
    // }
    // lastUserInfoHome = lastUserInfoHome + 20 + nextStep + 1;
    // currentLine = in.readLine();
    // }
    // }
    // in.close();
    // } catch (IOException ex) {
    // return false;
    // }
    // return true;
    // }
    // public Boolean saveTextFile(String fileName) throws IOException {
    // BufferedWriter out = null;
    // try {
    // out = new BufferedWriter(new FileWriter(fileName));
    // } catch (IOException e) {
    // return false;
    // }
    // out.write(toDilimitedString());
    // out.close();
    // return true;
    // }
    // public MobileCompany() {
    // }
    // Asignment 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public double getTotalPaymentForCity(String city) {
        double totalPayment = 0;
        for (User user : this.users.values()) {
            if (user.getUserCity().equalsIgnoreCase(city)) {
                totalPayment += User.calcTotalPayments(user, this.flatRate);
            }
        }
        return totalPayment;
    }

    public ArrayList<Double> getTotalPaymentPerCity(ArrayList<String> cities) {
        ArrayList<Double> totalPaymentPerCity = new ArrayList<>();
        for (String city : cities) {
            totalPaymentPerCity.add(getTotalPaymentForCity(city));
        }
        return totalPaymentPerCity;
    }

    public ArrayList<String> populateDistinctMobileModels() {
        ArrayList<String> populateDictinctMobileModels = new ArrayList<>();
        ArrayList<String> populateDicrinctMobileModelsOfEachUser = new ArrayList<>();
        for (User user : this.users.values()) {
            populateDicrinctMobileModelsOfEachUser = user.populateDistinctMobileModel();
            for (String eachModelInUser : populateDicrinctMobileModelsOfEachUser) {
                if (!(populateDictinctMobileModels.contains(eachModelInUser))) {
                    populateDictinctMobileModels.add(eachModelInUser);
                }
            }
        }
        return populateDictinctMobileModels;
    }

    public ArrayList<Integer> getTotalCountPerMobileModel(ArrayList<String> mobileModels) {
        ArrayList<Integer> totalCountPerMobileModel = new ArrayList<>();
        int totalCountPerMobileModelForEachUser;
        for (String mobileModel : mobileModels) {
            totalCountPerMobileModelForEachUser = 0;
            for (User user : this.users.values()) {
                totalCountPerMobileModelForEachUser += user.getTotalCountForMobileModel(mobileModel);
            }
            totalCountPerMobileModel.add(totalCountPerMobileModelForEachUser);
        }
        return totalCountPerMobileModel;
    }

    public ArrayList<Double> getTotalPaymentPerMobileModel(ArrayList<String> mobileModels) {
        ArrayList<Double> totalPaymentPerMobileModel = new ArrayList<>();
        Double totalPaymentPerMobileModelForEachUser;
        for (String mobileModel : mobileModels) {
            totalPaymentPerMobileModelForEachUser = 0.0;
            for (User user : this.users.values()) {
                totalPaymentPerMobileModelForEachUser += user.getTotalPaymentForMobileModel(mobileModel, flatRate);
            }
            totalPaymentPerMobileModel.add(totalPaymentPerMobileModelForEachUser);
        }
        return totalPaymentPerMobileModel;
    }

    // public HashMap<String, Double> getTotalPaymentPerCity() {
    // HashMap<String, Double> totalPaymentPerCity = new HashMap<>();
    // ArrayList<String> cities = populateDistincCityNames();
    // Double totalPayments;
    // for (String city : cities) {
    // totalPayments = 0.0;
    // totalPayments = getTotalPaymentForCity(city);
    // totalPaymentPerCity.put(city, totalPayments);
    // }
    // return totalPaymentPerCity;
    // }
//    public HashMap<String, Double> getTotalPaymentPerCity() {
//        HashMap<String, Double> totalPaymentPerCity = new HashMap<>();
//        for (User user : this.users.values()) {
//            Double totalPrice = totalPaymentPerCity.get(user.getUserCity());
//            if (totalPrice != null) {
//                totalPaymentPerCity.put(user.getUserCity(), totalPrice + User.calcTotalPayments(user, this.flatRate));
//            } else {
//                totalPaymentPerCity.put(user.getUserCity(), User.calcTotalPayments(user, this.flatRate));
//            }
//        }
//        return totalPaymentPerCity;
//    }
    // public HashMap<String, Integer> getTotalCountPerMobileModel() {
    // HashMap<String, Integer> totalCountPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModels();
    // int mobileModelCount;
    // for (String mobileModel : mobileModels) {
    // mobileModelCount = 0;
    // for (User user : this.users.values()) {
    // mobileModelCount += user.getTotalCountForMobileModel(mobileModel);
    // }
    // totalCountPerMobileModel.put(mobileModel, mobileModelCount);
    // }
    // return totalCountPerMobileModel;
    // }
    public HashMap<String, Integer> getTotalCountPerMobileModel() {
        HashMap<String, Integer> totalCountPerMobileModel = new HashMap<>();
        HashMap<String, Integer> totalCountPerMobileModelInEachUser = new HashMap<>();
        for (User user : this.users.values()) {
            totalCountPerMobileModelInEachUser = user.getTotalCountPerMobileModel();
            Integer count = totalCountPerMobileModel
                    .get(MobileCompany.returnMobileModel(totalCountPerMobileModelInEachUser));
            if (count != null) {
                totalCountPerMobileModel.put(MobileCompany.returnMobileModel(totalCountPerMobileModelInEachUser),
                        count + MobileCompany.returnCounter(totalCountPerMobileModelInEachUser));
            } else {
                totalCountPerMobileModel.put(MobileCompany.returnMobileModel(totalCountPerMobileModelInEachUser),
                        MobileCompany.returnCounter(totalCountPerMobileModelInEachUser));
            }
        }
        return totalCountPerMobileModel;
    }

    // public HashMap<String, Double> getTotalPaymentPerMobileModel() {
    // HashMap<String, Double> totalPaymentPerMobileModel = new HashMap<>();
    // ArrayList<String> mobileModels = populateDistinctMobileModels();
    // Double mobileModelPayment;
    // for (String mobileModel : mobileModels) {
    // mobileModelPayment = 0.0;
    // for (User user : this.users.values()) {
    // mobileModelPayment += user.getTotalPaymentForMobileModel(mobileModel,
    // this.flatRate);
    // }
    // totalPaymentPerMobileModel.put(mobileModel, mobileModelPayment);
    // }
    // return totalPaymentPerMobileModel;
    // }
    public HashMap<String, Double> getTotalPaymentPerMobileModel() {
        HashMap<String, Double> totalPaymentPerMobileModel = new HashMap<>();
        HashMap<String, Double> totalCountPerMobileModelInEachUser = new HashMap<>();
        for (User user : this.users.values()) {
            totalCountPerMobileModelInEachUser = user.getTotalPaymentPerMobileModel(this.flatRate);
            Double totalPrice = totalPaymentPerMobileModel
                    .get(MobileCompany.returnMobileModelPrice(totalCountPerMobileModelInEachUser));
            if (totalPrice != null) {
                totalPaymentPerMobileModel.put(MobileCompany.returnMobileModelPrice(totalCountPerMobileModelInEachUser),
                        totalPrice + MobileCompany.returnPrice(totalCountPerMobileModelInEachUser));
            } else {
                totalPaymentPerMobileModel.put(MobileCompany.returnMobileModelPrice(totalCountPerMobileModelInEachUser),
                        MobileCompany.returnPrice(totalCountPerMobileModelInEachUser));
            }
        }
        return totalPaymentPerMobileModel;
    }

    public void reportTotalPaymentsPerCity(HashMap<String, Double> totals,
            HashMap<String, Double> totalPaymentPerCity) {
        System.out.println(
                "Mobile Model                                        Total Monthly Payment");
        for (String mobileModel : totals.keySet()) {
            System.out
                    .println(mobileModel + "                                        $"
                            + totalPaymentPerCity.get(mobileModel));
        }
    }

//    public static void reportPaymentPerMobileModel(ArrayList<String> mobileModels, ArrayList<Integer> counts,
//            ArrayList<Double> monthlyPayments) {
//        User.reportPaymentsPerMobileModel(mobileModels, counts, monthlyPayments);
//    }
    public static void reportPaymentPerMobileModel(HashMap<String, Integer> counts,
            HashMap<String, Double> totals) {
        User.reportPaymentsPerMobileModel(counts, totals);
    }

    public HashMap<Integer, MobilePlan> allPlans() {
        HashMap<Integer, MobilePlan> allPlans = new HashMap<>();
        for (User user : this.users.values()) {
            HashMap<Integer, MobilePlan> userPlans = user.getPlans();
            for (MobilePlan plan : userPlans.values()) {
                allPlans.put(plan.getId(), plan);
            }
        }
        return allPlans;
    }

    public HashMap<Integer, User> getUsers() {
        return this.users;
    }

    public boolean loadFromTextFile(String fileName) throws IOException, PlanException {
        this.users = new HashMap<>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (IOException ex) {
            System.exit(1);
        }
        try {
            String currentLine = in.readLine();
            while (currentLine != null) {
                currentLine = currentLine.trim();
                String[] lineFields = currentLine.split(",");
                int lastUserInfoHome = 5;
                String name = lineFields[0];
                String adminUserName = lineFields[1];
                String adminPassword = lineFields[2];
                int flatRate = Integer.parseInt(lineFields[3]);
                this.name = name;
                this.adminUsername = adminUserName;
                this.adminPassword = adminPassword;
                this.flatRate = flatRate;
                for (int i = 0; i < Integer.parseInt(lineFields[4]); i++) {
                    HashMap<Integer, User> userWithCounter = User.readOneUser(lineFields, lastUserInfoHome);
                    addUser(User.returnUser(userWithCounter));
                    lastUserInfoHome = User.returnCounter(userWithCounter);
                }
                currentLine = in.readLine();
            }
        } catch (Exception e) {
            in.close();
            System.exit(1);
        }
        return true;
    }

    public boolean saveToTextFile(String fileName) throws IOException {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            System.exit(1);
        }
        out.write(toDilimitedString());
        out.close();
        return true;
    }

    public HashMap<Integer, User> deepCopyUserHashMap() throws CloneNotSupportedException {
        HashMap<Integer, User> deepCopy = new HashMap<>();
        deepCopy = User.deepCopyHashMap(this.users);
        return deepCopy;
    }

    public HashMap<Integer, User> shallowCopyUsersHashMap() {
        HashMap<Integer, User> shallowCopy = new HashMap<>();
        shallowCopy = User.shallowCopyHashMap(this.users);
        return shallowCopy;
    }

    public ArrayList<User> sortUsers() {
        ArrayList<User> shallowCopyPlanList = shallowCopyUsers();
        Collections.sort(shallowCopyPlanList);
        return shallowCopyPlanList;
    }

    public static String returnMobileModel(HashMap<String, Integer> mobileModelWithCount) {
        String result = null;
        for (String string : mobileModelWithCount.keySet()) {
            result = string;
        }
        return result;
    }

    public static Integer returnCounter(HashMap<String, Integer> mobileModelWithCount) {
        Integer result = 0;
        for (Integer counter : mobileModelWithCount.values()) {
            result = counter;
        }
        return result;
    }

    public static String returnMobileModelPrice(HashMap<String, Double> mobileModelWithPrice) {
        String result = null;
        for (String string : mobileModelWithPrice.keySet()) {
            result = string;
        }
        return result;
    }

    public static double returnPrice(HashMap<String, Double> mobileModelWithCount) {
        double result = 0.0;
        for (double counter : mobileModelWithCount.values()) {
            result = counter;
        }
        return result;
    }

    transient Comparator<User> compareBasedOnTotalPayment = new Comparator<User>() {

        public int compare(User user1, User user2) {
            if (!(User.calcTotalPayments(user1, flatRate) > User.calcTotalPayments(user2, flatRate))) {
                return 1;
            } else {
                return -1;
            }
        }

    };

    public ArrayList<User> sortUsersByMonthlyPayment() {
        ArrayList<User> userList = new ArrayList<>();
        for (User user : this.users.values()) {
            userList.add(user);
        }
        Collections.sort(userList, compareBasedOnTotalPayment);
        return userList;
    }

    public HashMap<String, ArrayList<User>> getUserPerCity() {
        HashMap<String, ArrayList<User>> userPerCity = new HashMap<>();
        ArrayList<String> cities = populateDistincCityNames();
        for (String city : cities) {
            ArrayList<User> users = new ArrayList<>();
            for (User user : this.users.values()) {
                if (user.getCity().equals(city)) {
                    users.add(user);
                }
            }
            userPerCity.put(city, users);
        }
        return userPerCity;
    }

    public HashMap<String, ArrayList<MobilePlan>> filterPlansByExpiryDate(MyDate expiryDate) {
        HashMap<String, ArrayList<MobilePlan>> filteredPlansByExpiryDate = new HashMap<>();
        ArrayList<MobilePlan> expiredPlansInUser = new ArrayList<>();
        for (User user : this.users.values()) {
            expiredPlansInUser = MobilePlan.filterByExpiryDate(user.getPlans(), expiryDate);
            filteredPlansByExpiryDate.put(user.getName(), expiredPlansInUser);
        }
        return filteredPlansByExpiryDate;
    }

    // Lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public boolean save() throws IOException {
    // String fileName = "mobileCompany.ser";
    // MobileCompany mobileCompany = new MobileCompany();
    // return mobileCompany.save(fileName);
    // }
    //
    // public static MobileCompany load() throws IOException, ClassNotFoundException
    // {
    // String fileName = "mobileCompany.ser";
    // MobileCompany mobileCompany = new MobileCompany();
    // if (mobileCompany.load(fileName) == true) {
    // return mobileCompany;
    // } else {
    // return null;
    // }
    // }
//    public void save() throws IOException {
//        ObjectOutputStream outputSream = new ObjectOutputStream(
//                Files.newOutputStream(Paths.get("mobileCompanyUser.ser")));
//        outputSream.writeObject(this);
//        outputSream.close();
//    }
//
//    public static MobileCompany load() throws IOException, ClassNotFoundException {
//        ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("mobileCompanyUser.ser")));
//        MobileCompany mobileCompany = (MobileCompany) inputStream.readObject();
//        inputStream.close();
//        return mobileCompany;
//    }
    public User validateUser(String username, String password) {
        for (User user : this.users.values()) {
            if (user.validateUser(username, password)) {
                return user;
            }
        }
        return null;
    }

    public MobileCompany() {
        this.users = new HashMap<>();
    }

    // Lab 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public double calcTotalPayments() {
        return (double) (this.allPlans().values().stream().map(x -> x.calcPayment(flatRate)).reduce(0.00, (x, y) -> x + y));
    }

    public void mobilePriceRise(double risePercent) {
        this.users.values().stream().forEach(x -> mobilePriceRise(x.getUserID(), risePercent));
    }

    public ArrayList<MobilePlan> filterByMobileModel(String mobileModel) {
        return (ArrayList<MobilePlan>) (this.allPlans().values().stream().filter(x -> x.getMobileModel().contains(mobileModel)));
    }

    public HashMap<String, Double> getTotalPaymentPerCity() {
        HashMap<String, Double> totalPaymentPerCity = new HashMap<>();
        for (User user : this.users.values()) {
            Double totalPrice = totalPaymentPerCity.get(user.getUserCity());
            if (totalPrice != null) {
                totalPaymentPerCity.put(user.getUserCity(), totalPrice + User.calcTotalPayments(user, this.flatRate));
            } else {
                totalPaymentPerCity.put(user.getUserCity(), User.calcTotalPayments(user, this.flatRate));
            }
        }
        return totalPaymentPerCity;
    }

    // Assignment #3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String getAdminPassword() {
        return this.adminPassword;
    }

    public static String reportPaymentPerCity(ArrayList<String> cities, ArrayList<Double> payments) {
        int listsSize = cities.size();
        String message = "";
        message += ("City Name" + "\t\t" + "Total Monthly Payment") + "\n";
        for (int i = 0; i < listsSize; i++) {
            String city = cities.get(i);
            double totalMonthlyPayment = payments.get(i);
            message += (city + "\t\t" + String.format("$%.2f", totalMonthlyPayment) + "\n");
        }
        return message;
    }

    public static String reportPaymentPerMobileModel(ArrayList<String> mobileModels, ArrayList<Integer> counts,
            ArrayList<Double> monthlyPayments) {
        return User.reportPaymentsPerMobileModel(mobileModels, counts, monthlyPayments);
    }

    public void save() throws IOException {
        ObjectOutputStream outputSream = new ObjectOutputStream(
                Files.newOutputStream(Paths.get("mobileCompany.ser")));
        outputSream.writeObject(this);
        outputSream.close();
    }

    public static MobileCompany load() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("mobileCompany.ser")));
        MobileCompany mobileCompany = (MobileCompany) inputStream.readObject();
        inputStream.close();
        return mobileCompany;
    }

    public void setAdminUsername(String username) {
        this.adminUsername = username;
    }

    public void setFlatrate(int flatrate) {
        this.flatRate = flatrate;
    }

    public void setCompanyName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return this.name;
    }
}
