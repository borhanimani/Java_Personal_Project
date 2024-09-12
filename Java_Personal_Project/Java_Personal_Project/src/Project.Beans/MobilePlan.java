
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public abstract class MobilePlan implements Cloneable, Comparable<MobilePlan>, Serializable {

    protected String userName;
    protected int id;
    protected int internetQuota;
    protected int capLimit;
    protected MobilePhone mobilePhoneHandset;
    protected MyDate expiryDate;

    // public MobilePlan(int id, String userName, MobilePhone mobilePhone, int
    // internetQuota, int capLimit,
    // MyDate expiryDate) {
    // this.id = id;
    // this.userName = userName;
    // this.internetQuota = internetQuota;
    // this.capLimit = capLimit;
    // this.mobilePhoneHandset = mobilePhone;
    // this.expiryDate = expiryDate;
    // }
    public void print() { // Prints the information
        System.out.print("ID: " + this.id + " Name: " + this.userName + " Internet Quota: " + this.internetQuota
                + " Cap Limit: " + this.capLimit);
        this.mobilePhoneHandset.print();
        System.out.print("Expiry Date: ");
        this.expiryDate.print();
    }

    public String toString() { // Converts the information to string
        return "ID: " + Integer.toString(id) + " Name: " + this.userName + " Internet Quota: "
                + this.internetQuota + " Cap Limit: " + this.capLimit + mobilePhoneHandset.toString()
                + this.expiryDate.toString();
    }

    public abstract double calcPayment(double flatRate); // Calculates the payment

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String newName) {
        this.userName = newName;
    }

    public void setMobileModel(String model) {
        this.mobilePhoneHandset.setModel(model);
    }

    public int getInternetQuota() {
        return this.internetQuota;
    }

    public int getCapLimit() {
        return this.capLimit;
    }

    public static String printPlansToString(ArrayList<MobilePlan> plans) {
        String plansInString = "";
        for (MobilePlan plan : plans) {
            plansInString += plan.toString() + "\n";
        }
        return plansInString;
    }

    // public static void printPlans(ArrayList<MobilePlan> plans) { // Print all
    // plans
    // for (MobilePlan plan : plans) {
    // plan.print();
    // }
    // }
    // public static double calcTotalPayments(ArrayList<MobilePlan> plans, int
    // flatRate) { // Calculate all plan list
    // // payment
    // double totalPayment = 0;
    // for (MobilePlan plan : plans) {
    // totalPayment += plan.calcPayment(flatRate);
    // }
    // return totalPayment;
    // }
    public void mobilePriceRise(double risePercent) { // Calculates mobile price rice
        this.mobilePhoneHandset.priceRise(risePercent);
    }

    // public static void mobilePriceRiseAll(ArrayList<MobilePlan> plans, double
    // risePercent) {
    // for (MobilePlan plan : plans) {
    // plan.mobilePriceRise(risePercent);
    // }
    // }
    // public static ArrayList<MobilePlan>
    // fillterByMobileModel(ArrayList<MobilePlan> plans, String mobileModel) { //
    // Filters
    // // plan
    // // list
    // // by
    // // mobile
    // // model
    // ArrayList<MobilePlan> sameMobileModels = new ArrayList<>();
    // for (MobilePlan plan : plans) {
    // if (plan.mobilePhoneHandset.getMobileModel().contains(mobileModel)) {
    // sameMobileModels.add(plan);
    // }
    // }
    // return sameMobileModels;
    // }
    // public static ArrayList<MobilePlan>
    // fillterByMobileModel2(ArrayList<MobilePlan> plans, String mobileModel) {
    // ArrayList<MobilePlan> sameMobileModels = new ArrayList<>();
    // for (MobilePlan plan : plans) {
    // if (plan.mobilePhoneHandset.modelIsSameAsCalledMobileModel(mobileModel)) {
    // sameMobileModels.add(plan);
    // }
    // }
    // return sameMobileModels;
    // }
    // Lab3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static ArrayList<MobilePlan> filterByExpiryDate(ArrayList<MobilePlan>
    // plans, MyDate date) {
    // ArrayList<MobilePlan> expiredPlans = new ArrayList<>();
    // for (MobilePlan plan : plans) {
    // if (!plan.expiryDate.isNotExpired(date)) {
    // expiredPlans.add(plan);
    // }
    // }
    // return expiredPlans;
    // }
    public int getId() {
        return id;
    }

    public String getMobileModel() {
        return mobilePhoneHandset.getMobileModel();
    }

    // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public MobilePlan(MobilePlan mobilePlan) {
        this.id = mobilePlan.id;
        this.userName = mobilePlan.userName;
        this.internetQuota = mobilePlan.internetQuota;
        this.capLimit = mobilePlan.capLimit;
        this.mobilePhoneHandset = new MobilePhone(mobilePhoneHandset);
        this.expiryDate = new MyDate(expiryDate);
    }

    @Override
    public MobilePlan clone() throws CloneNotSupportedException {
        MobilePlan mobilePlan = (MobilePlan) super.clone();
        mobilePlan.mobilePhoneHandset = mobilePhoneHandset.clone();
        mobilePlan.expiryDate = expiryDate.clone();
        return mobilePlan;
    }

    // public static ArrayList<MobilePlan> shallowCopy(ArrayList<MobilePlan> plans)
    // {
    // ArrayList<MobilePlan> shallowCopy = new ArrayList<MobilePlan>();
    // for (MobilePlan plan : plans) {
    // shallowCopy.add(plan);
    // }
    // return shallowCopy;
    // }
    // public static ArrayList<MobilePlan> deepCopy(ArrayList<MobilePlan> plans)
    // throws CloneNotSupportedException {
    // ArrayList<MobilePlan> deepCopy = new ArrayList<MobilePlan>();
    // for (MobilePlan plan : plans) {
    // deepCopy.add(plan.clone());
    // }
    // return deepCopy;
    // }
    public int compareTo1(MobilePlan mobilePlan) {
        return this.expiryDate.compareTo(mobilePlan.expiryDate);
    }

    public void setCity(String city) {
    }

    public void setCapLimit(int capLimit) {
        this.capLimit = capLimit;
    }

    public void changeDate(int day, int month, int year) {
        expiryDate.changeDate(day, month, year);
    }

    // Lab 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void printPlans(HashMap<Integer, MobilePlan> plans) {
        for (MobilePlan plan : plans.values()) {
            plan.print();
        }
    }

    public static String printPlansToString(HashMap<Integer, MobilePlan> plans) {
        String plansInString = "";
        for (MobilePlan plan : plans.values()) {
            plansInString += plan.toString() + "\n";
        }
        return plansInString;
    }

    public static ArrayList<MobilePlan> filterByExpiryDate(HashMap<Integer, MobilePlan> plans, MyDate date) {
        ArrayList<MobilePlan> expiredPlans = new ArrayList<>();
        for (MobilePlan plan : plans.values()) {
            if (!plan.expiryDate.isNotExpired(date)) {
                expiredPlans.add(plan);
            }
        }
        return expiredPlans;
    }

    public static ArrayList<MobilePlan> fillterByMobileModel(HashMap<Integer, MobilePlan> plans, String mobileModel) {
        ArrayList<MobilePlan> sameMobileModels = new ArrayList<>();
        for (MobilePlan plan : plans.values()) {
            if (plan.mobilePhoneHandset.getMobileModel().contains(mobileModel)) {
                sameMobileModels.add(plan);
            }
        }
        return sameMobileModels;
    }

    public static double calcTotalPayments(HashMap<Integer, MobilePlan> plans, int flatRate) {
        double totalPayment = 0;
        for (MobilePlan plan : plans.values()) {
            totalPayment += plan.calcPayment(flatRate);
        }
        return totalPayment;
    }

    // public static void mobilePriceRiseAll(HashMap<Integer, MobilePlan> plans,
    // double risePercent) {
    // for (MobilePlan plan : plans.values()) {
    // plan.mobilePriceRise(risePercent);
    // }
    // }

    public static ArrayList<MobilePlan> shallowCopy(HashMap<Integer, MobilePlan> plans) {
        ArrayList<MobilePlan> shallowCopy = new ArrayList<>();
        for (MobilePlan plan : plans.values()) {
            shallowCopy.add(plan);
        }
        return shallowCopy;
    }

    public static ArrayList<MobilePlan> deepCopy(HashMap<Integer, MobilePlan> plans) throws CloneNotSupportedException {
        ArrayList<MobilePlan> deepCopy = new ArrayList<MobilePlan>();
        for (MobilePlan plan : plans.values()) {
            deepCopy.add(plan.clone());
        }
        return deepCopy;
    }

    // public static HashMap<Integer, MobilePlan>
    // shallowCopyHashMap(HashMap<Integer, MobilePlan> plans) {
    // HashMap<Integer, MobilePlan> shallowCopy = new HashMap<Integer,
    // MobilePlan>();
    // for (MobilePlan plan : plans.values()) {
    // shallowCopy.put(plan.id, plan);
    // }
    // return shallowCopy;
    // }

    // public static HashMap<Integer, MobilePlan> deepCopyHashMap(HashMap<Integer,
    // MobilePlan> plans)
    // throws CloneNotSupportedException {
    // HashMap<Integer, MobilePlan> deepCopy = new HashMap<Integer, MobilePlan>();
    // for (MobilePlan plan : plans.values()) {
    // deepCopy.put(plan.id, plan.clone());
    // }
    // return deepCopy;
    // }

    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // public static HashMap<Integer, MobilePlan> load(String fileName) throws
    // IOException, ClassNotFoundException {
    // ObjectInputStream inputStream = null;
    // HashMap<Integer, MobilePlan> plans = new HashMap<>();
    // try {
    // inputStream = new
    // ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
    // } catch (Exception e) {
    // return null;
    // }
    // try {
    // while (true) {
    // MobilePlan inputPlan = (MobilePlan) inputStream.readObject();
    // plans.put(inputPlan.getId(), inputPlan);
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
    // return plans;
    // }
    // public static Boolean save(HashMap<Integer, MobilePlan> plans, String
    // fileName) throws IOException {
    // ObjectOutputStream outputStream = null;
    // try {
    // outputStream = new
    // ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
    // } catch (IOException ex) {
    // return false;
    // }
    // try {
    // for (MobilePlan plan : plans.values()) {
    // outputStream.writeObject(plan);
    // }
    // outputStream.close();
    // return true;
    // } catch (IOException ex) {
    // outputStream.close();
    // return false;
    // }
    // }
    public String toDilimitedString() {
        return this.id + "," + this.userName + "," + this.internetQuota + "," + this.capLimit + ","
                + this.mobilePhoneHandset.toDilimitedString() + "," + this.expiryDate.toDilimtedString();
    }

    // public static HashMap<Integer, MobilePlan> loadTextFile(String fileName)
    // throws IOException, PlanException {
    // HashMap<Integer, MobilePlan> plans = new HashMap<>();
    // BufferedReader in = null;
    // try {
    // in = new BufferedReader(new FileReader(fileName));
    // } catch (IOException ex) {
    // return null;
    // }
    // try {
    // String currentLine = in.readLine();
    // while (currentLine != null) {
    // currentLine = currentLine.trim();
    // String[] lineFields = currentLine.split(",");
    // int currentId = Integer.parseInt(lineFields[1]);
    // String currentUserName = lineFields[2];
    // int currentInternetQuota = Integer.parseInt(lineFields[3]);
    // int currentCapLimit = Integer.parseInt(lineFields[4]);
    // MobilePhone currentMobilePhoneHandset = new MobilePhone(lineFields[5],
    // MobileType.valueOf(lineFields[6]),
    // Integer.parseInt(lineFields[7]), Double.parseDouble(lineFields[8]));
    // MyDate currentExpiryDate = new MyDate(Integer.parseInt(lineFields[9]),
    // Integer.parseInt(lineFields[10]),
    // Integer.parseInt(lineFields[11]));
    // switch (lineFields[0]) {
    // case "pp":
    // String currentCity = lineFields[12];
    // PersonalPlan personalPlan = new PersonalPlan(currentId, currentUserName,
    // currentMobilePhoneHandset,
    // currentInternetQuota, currentCapLimit, currentCity, currentExpiryDate);
    // plans.put(personalPlan.getId(), personalPlan);
    // break;
    // case "bp":
    // int currentNumberOfEmployees = Integer.parseInt(lineFields[12]);
    // int cuurentABN = Integer.parseInt(lineFields[13]);
    // BusinessPlan businessPlan = new BusinessPlan(currentId, currentUserName,
    // currentMobilePhoneHandset,
    // currentInternetQuota, currentCapLimit, currentNumberOfEmployees, cuurentABN,
    // currentExpiryDate);
    // plans.put(businessPlan.getId(), businessPlan);
    // break;
    // }
    // currentLine = in.readLine();
    // }
    // } catch (IOException ex) {
    // in.close();
    // return null;
    // }
    // in.close();
    // return plans;
    // }
    public static boolean saveTextFile(HashMap<Integer, MobilePlan> plans, String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        for (MobilePlan plan : plans.values()) {
            out.write(plan.toDilimitedString() + "\n");
        }
        out.close();
        return true;
    }

    // Assignment 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static HashMap<Integer, MobilePlan> load(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = null;
        HashMap<Integer, MobilePlan> plans = new HashMap<>();
        try {
            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
        } catch (Exception e) {
            System.exit(1);
        }
        try {
            while (true) {
                MobilePlan inputPlan = (MobilePlan) inputStream.readObject();
                plans.put(inputPlan.getId(), inputPlan);
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
        return plans;
    }

    public static boolean save(HashMap<Integer, MobilePlan> plans, String fileName) throws IOException {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        } catch (IOException ex) {
            System.exit(1);
        }
        try {
            for (MobilePlan plan : plans.values()) {
                outputStream.writeObject(plan);
            }
            outputStream.close();
        } catch (IOException ex) {
            outputStream.close();
            System.exit(1);
        }
        return true;
    }

    public static HashMap<Integer, MobilePlan> loadTextFile(String fileName)
            throws IOException, PlanException, NumberFormatException, PlanExceptionUserName {
        HashMap<Integer, MobilePlan> plans = new HashMap<>();
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
                MobilePlan plan = MobilePlan.readOnePlan(lineFields, 0);
                plans.put(plan.id, plan);
                currentLine = in.readLine();
            }
        } catch (IOException ex) {
            in.close();
            System.exit(1);
        }
        in.close();
        return plans;
    }

    public static MobilePlan readOnePlan(String[] lineFields, int index)
            throws NumberFormatException, PlanException, PlanExceptionUserName {
        int currentId = Integer.parseInt(lineFields[index + 1]);
        String currentUserName = lineFields[index + 2];
        int currentInternetQuota = Integer.parseInt(lineFields[index + 3]);
        int currentCapLimit = Integer.parseInt(lineFields[index + 4]);
        MobilePhone currentMobilePhoneHandset = new MobilePhone(lineFields[index + 5],
                MobileType.valueOf(lineFields[index + 6]),
                Integer.parseInt(lineFields[index + 7]), Double.parseDouble(lineFields[index + 8]));
        MyDate currentExpiryDate = new MyDate(Integer.parseInt(lineFields[index + 9]),
                Integer.parseInt(lineFields[index + 10]),
                Integer.parseInt(lineFields[index + 11]));
        switch (lineFields[index]) {
            case "pp":
                String currentCity = lineFields[index + 12];
                PersonalPlan personalPlan = new PersonalPlan(currentId, currentUserName,
                        currentMobilePhoneHandset,
                        currentInternetQuota, currentCapLimit, currentCity, currentExpiryDate);
                return personalPlan;
            case "bp":
                int currentNumberOfEmployees = Integer.parseInt(lineFields[index + 12]);
                int cuurentABN = Integer.parseInt(lineFields[index + 13]);
                BusinessPlan businessPlan = new BusinessPlan(currentId, currentUserName,
                        currentMobilePhoneHandset,
                        currentInternetQuota, currentCapLimit, currentNumberOfEmployees, cuurentABN,
                        currentExpiryDate);
                return businessPlan;
        }
        return null;
    }

    // public MobilePlan(int id, String userName, MobilePhone mobilePhone, int
    // internetQuota, int capLimit,
    // MyDate expiryDate) throws PlanException, PlanExceptionUserName {
    // if ((id < 3000000 || id > 3999999)) {
    // this.id = (int) ((Math.random() * ((3999999 - 3000000) + 1)) + 3000000);
    // throw new PlanException(this.id);
    // } else {
    // this.id = id;
    // }
    // if (!(Pattern.matches("[U]{1}[S]{1}[R]{1}[0-9]{6}[U]{1}", userName))) {
    // throw new PlanExceptionUserName(userName);
    // } else {
    // this.userName = userName;
    // }
    // this.internetQuota = internetQuota;
    // this.capLimit = capLimit;
    // this.mobilePhoneHandset = mobilePhone;
    // this.expiryDate = expiryDate;
    // }
    public MobilePhone getMobilePhone() {
        return this.mobilePhoneHandset;
    }

    public MyDate getExpiryDate() {
        return this.expiryDate;
    }

    // lab
    // 7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void setInternetQuota(int internetquota) {
        this.internetQuota = internetquota;
    }

    public int compareTo(MobilePlan mobilePlan) {
        return this.userName.compareTo(mobilePlan.getUserName());
    }

    // lab 8
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public MobilePlan(int id, String userName, MobilePhone mobilePhone, int internetQuota, int capLimit,
            MyDate expiryDate) throws PlanException, PlanExceptionUserName {
        if (!(Pattern.matches("[U]{1}[S]{1}[R]{1}[0-9]{6}[U]{1}", userName))) {
            throw new PlanExceptionUserName(userName);
        } else {
            this.userName = userName;
        }
        if ((id < 3000000 || id > 3999999)) {
            throw new PlanException(id);
        } else {
            this.id = id;
        }
        this.internetQuota = internetQuota;
        this.capLimit = capLimit;
        this.mobilePhoneHandset = mobilePhone;
        this.expiryDate = expiryDate;
    }

    public static void printPlans(ArrayList<MobilePlan> plans) { // Print all plans
        plans.forEach(System.out::println);
    }

    public static double calcTotalPayments(ArrayList<MobilePlan> plans, int flatRate) { // Calculate all plan list
        // payment
        return plans.stream().mapToDouble(x -> x.calcPayment(flatRate)).sum();
    }

    public static ArrayList<MobilePlan> fillterByMobileModel(ArrayList<MobilePlan> plans, String mobileModel) { // Filters
        // plan
        // list
        // by
        // mobile
        // model
        return (ArrayList<MobilePlan>) (plans.stream().filter(x -> x.getMobileModel().contains(mobileModel))
                .collect(Collectors.toList()));
    }

    public static void mobilePriceRiseAll(ArrayList<MobilePlan> plans, double risePercent) {
        plans.stream().forEach(x -> x.mobilePriceRise(risePercent));
    }

    public static ArrayList<MobilePlan> shallowCopy(ArrayList<MobilePlan> plans) {
        ArrayList<MobilePlan> shallowCopy = plans;
        return shallowCopy;
    }

    public static ArrayList<MobilePlan> deepCopy(ArrayList<MobilePlan> plans) throws CloneNotSupportedException {
        return (ArrayList<MobilePlan>) (plans.stream().collect(Collectors.toCollection(ArrayList::new)));
    }

    public static ArrayList<MobilePlan> filterByExpiryDate(ArrayList<MobilePlan> plans, MyDate date) {
        return (ArrayList<MobilePlan>) (plans.stream().filter(x -> x.expiryDate.isNotExpired(date) == false)
                .collect(Collectors.toList()));
    }

    public static void mobilePriceRiseAll(HashMap<Integer, MobilePlan> plans, double risePercent) {
        plans.values().stream().forEach(x -> x.mobilePriceRise(risePercent));
    }

    public static HashMap<Integer, MobilePlan> shallowCopyHashMap(HashMap<Integer, MobilePlan> plans) {
        HashMap<Integer, MobilePlan> shallowCopy = plans;
        return shallowCopy;
    }

    public static HashMap<Integer, MobilePlan> deepCopyHashMap(HashMap<Integer, MobilePlan> plans)
            throws CloneNotSupportedException {
        HashMap<Integer, MobilePlan> deepCopy = new HashMap<Integer, MobilePlan>();
        for (MobilePlan plan : plans.values()) {
            deepCopy.put(plan.id, plan.clone());
        }
        return deepCopy;
    }
}
