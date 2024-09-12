// import java.util.ArrayList;
// import java.util.Scanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    // static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException, PlanException, PlanExceptionUserName {

        // Lab1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // MobilePhone personaPlan1Phone = new MobilePhone("Samsung Galaxy S20",
        // MobileType.Android, 128, 279.20);
        // MobilePhone BusinessPlan1Phone = new MobilePhone("Iphone 14", MobileType.IOS,
        // 256, 349.90);
        // MobilePhone personaPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.40);
        // MobilePhone BusinessPlan2Phone = new MobilePhone("Samsung Galaxy S23",
        // MobileType.IOS, 256, 349.90);
        // PersonalPlan personalPlan1 = new PersonalPlan(102, "Sara", personaPlan1Phone,
        // 10, 5, "Shiraz");
        // BusinessPlan businessPlan1 = new BusinessPlan(104, "John",
        // BusinessPlan1Phone, 20, 3, 50, 2);
        // PersonalPlan personalPlan2 = new PersonalPlan(102, "Mary", personaPlan2Phone,
        // 40, 10, "Tehran");
        // BusinessPlan businessPlan2 = new BusinessPlan(104, "Josh",
        // BusinessPlan2Phone, 70, 8, 5, 4);
        // ArrayList<Plan> Plans = new ArrayList<>(); // Mobile plan's list
        // Plans.add(personalPlan1);
        // Plans.add(businessPlan1);
        // Plans.add(personalPlan2);
        // Plans.add(businessPlan2);
        // for (Plan plan : Plans) { // Prints all plan's information
        // plan.print();
        // spaceMaker();
        // }
        // for (Plan plan : Plans) { // Converts all plan's information to string and
        // then prints it
        // System.out.println(plan);
        // spaceMaker();
        // }
        // double totalPayment = 0; // Calculates total monthly payment
        // for (Plan plan : Plans) {
        // totalPayment += plan.calcPayment(50.0);
        // }
        // System.out.println("Total Payment Is: " + totalPayment);
        // }
        // public static void spaceMaker() { // Makes space between each plan
        // information (for better UI)
        // System.out.println("");
        // }
        // Lab2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // // Mobile Phones information
        // MobilePhone personaPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.20);
        // MobilePhone BusinessPlan1Phone = new MobilePhone("Iphone 14", MobileType.IOS,
        // 256, 349.90);
        // MobilePhone personaPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.40);
        // MobilePhone BusinessPlan2Phone = new MobilePhone("Samsung Galaxy S23",
        // MobileType.IOS, 256, 349.90);
        // MobilePhone personalPlan3Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 64, 403.99);
        // // Expire Dates
        // MyDate expiryDate1 = new MyDate(10, 4, 2023);
        // MyDate expiryDate2 = new MyDate(27, 7, 2020);
        // MyDate expiryDate3 = new MyDate(6, 1, 2021);
        // MyDate expiryDate4 = new MyDate(29, 12, 2022);
        // MyDate expiryDate5 = new MyDate(21, 8, 2019);
        // // Making Plans
        // PersonalPlan personalPlan1 = new PersonalPlan(102, "Sara", personaPlan1Phone,
        // 10, 5, "Shiraz", expiryDate1);
        // BusinessPlan businessPlan1 = new BusinessPlan(104, "John",
        // BusinessPlan1Phone, 20, 3, 50, 2, expiryDate2);
        // PersonalPlan personalPlan2 = new PersonalPlan(108, "Mary", personaPlan2Phone,
        // 40, 10, "Tehran", expiryDate3);
        // BusinessPlan businessPlan2 = new BusinessPlan(106, "Josh",
        // BusinessPlan2Phone, 70, 8, 5, 4, expiryDate4);
        // PersonalPlan personalPlan3 = new PersonalPlan(130, "Shirin",
        // personalPlan3Phone, 55, 4, "Yazd", expiryDate5);
        // // Add User
        // Address addressUser1 = new Address(12, "William", "Honeyway", "Texas"); //
        // User address
        // User user1 = new User(100, "James", addressUser1); // User information
        // // Adding User Plans
        // user1.addPlan(personalPlan1);
        // user1.addPlan(businessPlan1);
        // user1.addPlan(personalPlan2);
        // user1.addPlan(businessPlan2);
        // user1.addPlan(personalPlan3);
        // if (user1.addPlan(personalPlan3)) {
        // user1.addPlan(personalPlan3);
        // } else {
        // System.out.println("Error: Same ID");
        // spaceMaker();
        // }
        // // Print plan
        // user1.print(); // Print user informations
        // spaceMaker();
        // System.out.println(user1.toString()); // Print user information in string
        // // Find plan
        // spaceMaker();
        // if (user1.findPlan(100) != null) {
        // System.out.println("Plan found");
        // } else {
        // System.out.println("Plan has not been found");
        // }
        // // Find plan and make some changes
        // if (user1.findPlan(104) != null) {
        // MobilePlan currentPlan = user1.findPlan(104);
        // currentPlan.print();
        // currentPlan.mobilePriceRise(0.1);
        // currentPlan.print();
        // currentPlan.setUserName("Robert");
        // currentPlan.setMobileModel("Iphone X");
        // System.out.println("Edited Successful!");
        // spaceMaker();
        // }
        // user1.setCity("Wollonging"); // Change user City
        // // Printing plan with new changes
        // System.out.println("New Changes");
        // user1.print();
        // spaceMaker();
        // // Changing Address by user choice input
        // spaceMaker();
        // System.out.print("Enter City: ");
        // String city = userInput.nextLine();
        // System.out.print("Enter Street: ");
        // String street = userInput.nextLine();
        // System.out.print("Enter Suburb: ");
        // String suburb = userInput.nextLine();
        // System.out.print("Enter Street Number: ");
        // int streetNum = userInput.nextInt();
        // userInput.nextLine();
        // user1.setCity(city);
        // user1.setStreet(street);
        // user1.setSuburb(suburb);
        // user1.setStreetNum(streetNum);
        // spaceMaker();
        // user1.print();
        // // Print total payments
        // spaceMaker();
        // System.out.println("Total Payment: " + user1.calcTotalPayments(10));
        // user1.mobilePriceRiseAll(0.1);
        // System.out.println("Total Payment (Rised Price): " +
        // user1.calcTotalPayments(10));
        // // Print filtered list of mobile medel
        // System.out.print("Enter mobile model: ");
        // String mobileModel = userInput.nextLine();
        // spaceMaker();
        // ArrayList<MobilePlan> filteredMobileModelPlans =
        // user1.filterByMobileModel(mobileModel);
        // for (MobilePlan plan : filteredMobileModelPlans) {
        // plan.print();
        // }
        // Lab3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // // Making user's addresses
        // Address addressUser1 = new Address(12, "William", "Honeyway", "Texas"); //
        // User address
        // Address addressUser2 = new Address(13, "John", "Flowerway", "Los Angles");
        // Address addressUSer3 = new Address(20, "James", "Roseway", "Sydney");
        // // Making users and mobile company
        // User user1 = new User(100, "James", addressUser1); // User information
        // User user2 = new User(102, "George", addressUser2);
        // User user3 = new User(104, "Mary", addressUSer3);
        // MobileCompany mobileCompany = new MobileCompany("Samo", "Farid", "1234", 10);
        // // Making mobile phone plans
        // MobilePhone personaPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.20);
        // MobilePhone personaPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.40);
        // MobilePhone personalPlan3Phone = new MobilePhone("Iphone 13pro",
        // MobileType.IOS, 64, 403.99);
        // MobilePhone businessPlan1Phone = new MobilePhone("Iphone 14", MobileType.IOS,
        // 256, 349.90);
        // MobilePhone businessPlan2Phone = new MobilePhone("Samsung Note 9",
        // MobileType.Android, 256, 269.00);
        // MobilePhone businessPlan3Phone = new MobilePhone("Nokia", MobileType.IOS,
        // 256, 349.90);
        // // Create expiry date
        // MyDate expiryDate1 = new MyDate(10, 4, 2023);
        // MyDate expiryDate2 = new MyDate(27, 7, 2020);
        // MyDate expiryDate3 = new MyDate(6, 1, 2021);
        // MyDate expiryDate4 = new MyDate(29, 12, 2022);
        // MyDate expiryDate5 = new MyDate(21, 8, 2019);
        // MyDate expiryDate6 = new MyDate(29, 5, 2018);
        // // Create Plan
        // PersonalPlan personalPlan1 = new PersonalPlan(101, "Sara", personaPlan1Phone,
        // 10, 5, "Shiraz", expiryDate1);
        // PersonalPlan personalPlan2 = new PersonalPlan(103, "Shirin",
        // personaPlan2Phone, 55, 4, "Yazd", expiryDate2);
        // BusinessPlan businessPlan1 = new BusinessPlan(109, "John",
        // businessPlan1Phone, 20, 3, 50, 2, expiryDate4);
        // BusinessPlan businessPlan2 = new BusinessPlan(111, "Josh",
        // businessPlan2Phone, 70, 8, 5, 4, expiryDate5);
        // // Username validation Check
        // String username = "farid";
        // String password = "1235";
        // if (!(mobileCompany.validateAdmin(username, password))) {
        // wrongUsernameOrPasswordMassage();
        // }
        // username = "aa";
        // password = "1234";
        // if (!(mobileCompany.validateAdmin(username, password))) {
        // wrongUsernameOrPasswordMassage();
        // }
        // username = "farid";
        // password = "1234";
        // if (mobileCompany.validateAdmin(username, password)) {
        // System.out.println("Wellcome Back!");
        // // Adding user test
        // addingUserResult(mobileCompany, user1);
        // addingUserResult(mobileCompany, user2);
        // addingUserResult(mobileCompany, user3);
        // addingUserResult(mobileCompany, user3);
        // spaceMaker();
        // // Adding plans test
        // addingPlansResult(mobileCompany, 100, personalPlan1);
        // addingPlansResult(mobileCompany, 100, businessPlan1);
        // addingPlansResult(mobileCompany, 102, personalPlan2);
        // addingPlansResult(mobileCompany, 102, businessPlan2);
        // spaceMaker();
        // // Adding plans with create plans methods in user
        // createPersonalPlanResult(mobileCompany, 104, "Mary", 105, personalPlan3Phone,
        // 40, 10, expiryDate3,
        // "Tehran");
        // createBusinessPlanResult(mobileCompany, 104, "Maral", 113,
        // businessPlan3Phone, 70, 8, expiryDate6, 5, 4);
        // createPersonalPlanResult(mobileCompany, 104, "Mary", 105, personalPlan3Phone,
        // 40, 10, expiryDate3,
        // "Tehran");
        // createPersonalPlanResult(mobileCompany, 105, "Mary", 115, personalPlan3Phone,
        // 40, 10, expiryDate3,
        // "Tehran");
        // spaceMaker();
        // // Print user information and its plans test
        // System.out.print("Please Enter user ID: ");
        // int userID = userInput.nextInt();
        // userInput.nextLine();
        // mobileCompany.printPlans(userID);
        // spaceMaker();
        // // Print user plan with userID and planID test
        // System.out.print("Please Enter user ID: ");
        // userID = userInput.nextInt();
        // userInput.nextLine();
        // System.out.print("Please Enter plan ID: ");
        // int planID = userInput.nextInt();
        // userInput.nextLine();
        // MobilePlan plan = mobileCompany.findPlan(userID, planID);
        // if (plan != null) {
        // plan.print();
        // } else {
        // System.out.println("No Information Found");
        // }
        // spaceMaker();
        // // Print all users in company test
        // mobileCompany.print();
        // spaceMaker();
        // // Raise the price of all plans and print all
        // mobileCompany.mobilePriceRise(0.01);
        // mobileCompany.print();
        // spaceMaker();
        // // Print User ID total payments
        // userID = 102;
        // double totalPayments = mobileCompany.calcTotalPayments(userID);
        // if (totalPayments >= 0) {
        // System.out.println("Total Payment for user ID: " + userID + " is: " +
        // totalPayments);
        // } else {
        // System.out.println("User ID not found");
        // }
        // spaceMaker();
        // // Print all total payments for all users
        // totalPayments = mobileCompany.calcTotalPayments();
        // System.out.println("all Total Payments in all users are: " + totalPayments);
        // spaceMaker();
        // // Using allPlan() and print it with MobilePlan methods
        // ArrayList<MobilePlan> plans = mobileCompany.allPlan();
        // MobilePlan.printPlans(plans);
        // spaceMaker();
        // // Using filterByExpiryDate method and print filtered list
        // MyDate date = new MyDate(5, 5, 2022);
        // ArrayList<MobilePlan> plans2 = mobileCompany.filterByExpiryDate(104, date);
        // MobilePlan.printPlans(plans2);
        // spaceMaker();
        // // Using filterByMobileModel method and print the filtered list for all users
        // String mobileModel = "s";
        // ArrayList<MobilePlan> plans3 =
        // mobileCompany.filterByMobileModel(mobileModel);
        // MobilePlan.printPlans(plans3);
        // spaceMaker();
        // // Using filterByMobileModel method and print the filtered list for all users
        // by
        // // asking user choices
        // System.out.print("Please enter year: ");
        // int year = userInput.nextInt();
        // userInput.nextLine();
        // System.out.print("Please enter month: ");
        // int month = userInput.nextInt();
        // userInput.nextLine();
        // System.out.print("Please enter day: ");
        // int day = userInput.nextInt();
        // userInput.nextLine();
        // MyDate date2 = new MyDate(day, month, year);
        // ArrayList<MobilePlan> plans4 = mobileCompany.filterByExpiryDate(date2);
        // MobilePlan.printPlans(plans4);
        // spaceMaker();
        // // Finding a user and save it and make some changes
        // int userId = 102;
        // User user = mobileCompany.findUser(userId);
        // System.out.print("Enter City: ");
        // String city = userInput.nextLine();
        // System.out.print("Enter Street: ");
        // String street = userInput.nextLine();
        // System.out.print("Enter Suburb: ");
        // String suburb = userInput.nextLine();
        // System.out.print("Enter Street Number: ");
        // int streetNum = userInput.nextInt();
        // userInput.nextLine();
        // user.setCity(city);
        // user.setStreet(street);
        // user.setSuburb(suburb);
        // user.setStreetNum(streetNum);
        // // user.setAddress(city, street, suburb, streetNum);
        // user.print();
        // } else {
        // wrongUsernameOrPasswordMassage();
        // }
        // Assignment 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // TestCase.planClassTestCode();
        // Lab 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // I used TestCase class for this lab
        // TestCase.planClassTestCode();
        // Lab 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // UserInterface.runUI();
        // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // TestCase.runLab6();
        // UserInterface.runMain();
        // Assignment 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // TestCase.runAssignment2();
        // TestCase.runLab4To6TestCode();
        // Lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        Login login = new Login();
//        login.setVisible(true);
//        
        //Lab 8 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        MobileCompany mobileCompany = new MobileCompany();
//
//        User user1 = new User(01, "John Lee", new Address(12, "Honey", "Rock", "Melborne"), "john123", "password");
////        User user2 = new User(02, "Sara Mokhtari", new Address(23, "Rocky", "Ice", "Tehran"), "Sara123", "password2");
////        User user3 = new User(03, "Joe William", new Address(44, "Moonstreet", "lee", "Texas"), "Joe12", "password3");
//
//        //Making MobilePhones
//        MobilePhone phone1 = new MobilePhone("ihohne 12", MobileType.IOS, 256, 300.00);
//        MobilePhone phone2 = new MobilePhone("Iphone 13", MobileType.IOS, 512, 550.99);
//        MobilePhone phone3 = new MobilePhone("Iphone 11", MobileType.IOS, 128, 230.00);
//
//        //Making Plans
//        MobilePlan plan1 = new PersonalPlan(3000001, "USR000123U", phone1, 13, 30, "NewYork", new MyDate(11, 1, 2025));
//        MobilePlan plan2 = new BusinessPlan(3000002, "USR001230U", phone2, 1, 50, 10, 20, new MyDate(1, 1, 2020));
//        MobilePlan plan3 = new PersonalPlan(3000003, "USR001234U", phone3, 3, 10, "Tehran", new MyDate(4, 5, 2026));
//        ArrayList<MobilePlan> plans = new ArrayList<>();
//        plans.add(plan1);
//        plans.add(plan2);
//        plans.add(plan3);
//
//        //Adding Users and Plans to MobileCompany
//        //user1
//        mobileCompany.addUser(user1);
//        mobileCompany.addPlan(user1.getUserID(), plan1);
//        mobileCompany.addPlan(user1.getUserID(), plan2);
//        mobileCompany.addPlan(user1.getUserID(), plan3);
        //user2
//        mobileCompany.addUser(user2);
//        mobileCompany.addPlan(user2.getUserID(), plan2);
//        mobileCompany.addPlan(user2.getUserID(), plan1);
//        mobileCompany.addPlan(user2.getUserID(), plan3);
//
////        user3
//        mobileCompany.addUser(user3);
//        mobileCompany.addPlan(user3.getUserID(), plan3);
//        mobileCompany.addPlan(user3.getUserID(), plan2);
//        mobileCompany.addPlan(user3.getUserID(), plan1);
        // filtering plan usernames with 123
//        mobileCompany.allPlans().values().stream().filter(x -> x.userName.contains("123")).forEach(System.out::println);
//        spaceMaker();
//
//        // filtering plan usernames with 123 and show payments 
//        mobileCompany.allPlans().values().stream().filter(x -> x.userName.contains("123")).map(x -> x.calcPayment(0)).forEach(System.out::println);
//        spaceMaker();
//
//        // filter plan by payment and show first plan
//        MobilePlan filteredPlan = mobileCompany.allPlans().values().stream().filter(x -> x.calcPayment(0) <= 50 && x.calcPayment(0) >= 20).findFirst().get();
//        System.out.println("Username: " + filteredPlan.getUserName() + " ID: " + filteredPlan.getId() + " monthly Payment: " + filteredPlan.calcPayment(0));
//
//        //filter plans by payments and show all of them 
//        mobileCompany.allPlans().values().stream().filter(x -> x.calcPayment(0) <= 50 && x.calcPayment(0) >= 20).forEach(x -> System.out.println("Username: " + x.getUserName() + " ID: " + x.getId() + " monthly Payment: " + x.calcPayment(0)));
//        spaceMaker();
//
//        //writing method fliterPlans
//        Predicate<MobilePlan> criteria1 = x -> x.getMobilePhone().getMobileType().toString().equals("IOS");
//        ArrayList<MobilePlan> filteredPlans = filterPlans(plans, criteria1);
//        filteredPlans.stream().sorted(Comparator.comparing(x -> x.getMobilePhone().getPrice())).forEach(x -> System.out.println(x));
//        spaceMaker();
//
//        //agregate plans by expiry date year
////        plans.stream().collect(Collectors.groupingBy(x->x.getExpiryDate().getDateYear())).forEach(System.out::println);
//        Login login = new Login();
//        login.setVisible(true);

        // Assignment #3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>......
        Login login = new Login();
        login.setVisible(true);
//        AdminUI adminUI = new AdminUI();
//        adminUI.setVisible(true);
    }

    public static ArrayList<MobilePlan> filterPlans(ArrayList<MobilePlan> plans, Predicate<MobilePlan> criteria) {

        return (ArrayList<MobilePlan>) (plans.stream().filter(criteria)).collect(Collectors.toList());
    }

    public static void spaceMaker() { // Makes space between each plan information (for better UI)
        System.out.println("");
    }

    public static void wrongUsernameOrPasswordMassage() {
        System.out.println("Wrong username or password");
    }

    public static void succsessMassage() {
        System.out.println("Changes done succsessfuly!");
    }

    public static void sameUserIDMassage() {
        System.out.println("you all ready have same ID");
    }

    public static void sameUserIDAndPlanIDMassage() {
        System.out.println("Error, please check the user ID or plan repeatation");
    }

    public static void addingUserResult(MobileCompany mobileCompany, User user1) {
        if (mobileCompany.addUser(user1)) {
            succsessMassage();
        } else {
            sameUserIDMassage();
        }
    }

    public static void addingPlansResult(MobileCompany mobileCompany, int userID, MobilePlan plan) {
        if (mobileCompany.addPlan(userID, plan)) {
            succsessMassage();
        } else {
            sameUserIDAndPlanIDMassage();
        }
    }

    public static void createPersonalPlanResult(MobileCompany mobileCompany, int userID, String username, int id,
            MobilePhone mobilePhone, int internetQuota,
            int capLimit, MyDate expiryDate, String city) throws PlanException, PlanExceptionUserName {
        if (mobileCompany.createPersonalPlan(userID, username, id, mobilePhone, internetQuota, capLimit, expiryDate,
                city)) {
            succsessMassage();
        } else {
            sameUserIDAndPlanIDMassage();
        }
    }

    public static void createBusinessPlanResult(MobileCompany mobileCompany, int userID, String username, int id,
            MobilePhone mobilePhone, int internetQuota, int capLimit, MyDate expiryDate, int numberOfEmployees,
            int ABN) throws PlanException, PlanExceptionUserName {
        if (mobileCompany.createBusinessPlan(userID, username, id, mobilePhone, internetQuota, capLimit, expiryDate,
                numberOfEmployees, ABN)) {
            succsessMassage();
        } else {
            sameUserIDAndPlanIDMassage();
        }
    }
}
