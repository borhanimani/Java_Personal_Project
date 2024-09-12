import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    // static Scanner userInput = new Scanner(System.in);

    // public static void main(String[] args) {
    // MobileCompany mobileCompany = new MobileCompany("Samc", "Farbod", "bb1234",
    // 10);
    // mainMenu(mobileCompany);
    // userInput.close();
    // }

    // private static ArrayList<String> getPlansSimilarInformation() {
    // ArrayList<String> planInformationList = new ArrayList<>();
    // ArrayList<Integer> dateParameters = new ArrayList<>();
    // String id = getString("Please enter plan ID: ");
    // String name = getString("Please enter name: ");
    // String intenetQuota = getString("Please enter intenet quota: ");
    // String caplimit = getString("Please enter cap limit: ");
    // String mobileModel = getString("Please enter mobile model: ");
    // String mobileMemorySize = getString("Please Enter mobile memory size:");
    // String mobilePrice = getString("Please enter mobile price: ");
    // dateParameters = getExpiryDate();
    // planInformationList.add(id);
    // planInformationList.add(name);
    // planInformationList.add(intenetQuota);
    // planInformationList.add(caplimit);
    // planInformationList.add(mobileModel);
    // planInformationList.add(mobileMemorySize);
    // planInformationList.add(mobilePrice);
    // for (int i = 0; i < dateParameters.size(); i++) {
    // planInformationList.add(Integer.toString(dateParameters.get(i)));
    // }
    // return planInformationList;
    // }

    // private static ArrayList<Integer> getExpiryDate() {
    // ArrayList<Integer> dateParameters = new ArrayList<>();
    // int day = getInt("Please enter expiry day");
    // int month = getInt("Please enter expiry month");
    // int year = getInt("Please enter expiry year");
    // dateParameters.add(day);
    // dateParameters.add(month);
    // dateParameters.add(year);
    // return dateParameters;
    // }

    // private static String getString(String command) {
    // System.out.println(command);
    // String name = userInput.nextLine();
    // return name;
    // }

    // private static int getInt(String command) {
    // System.out.println(command);
    // int id = userInput.nextInt();
    // userInput.nextLine();
    // return id;
    // }

    // private static ArrayList<String> getAdress() {
    // ArrayList<String> address = new ArrayList<>();
    // System.out.println("Please enter address city:");
    // String city = userInput.nextLine();
    // System.out.println("Please enter address suburb:");
    // String suburb = userInput.nextLine();
    // System.out.println("Please enter address street:");
    // String street = userInput.nextLine();
    // System.out.println("Please enter address street number:");
    // String streetNum = userInput.nextLine();
    // address.add(streetNum);
    // address.add(street);
    // address.add(suburb);
    // address.add(city);
    // return address;
    // }

    // public static void adminMenuPrinter() {
    // System.out.println("1. Test code");
    // System.out.println("2. Create User");
    // System.out.println("3. Crete user with Automation ID");
    // System.out.println("4. Create Personal Plan");
    // System.out.println("5. Create Business Plan");
    // System.out.println("6. Print User Inforamtion");
    // System.out.println("7. Filter by Mobile Model");
    // System.out.println("8. Filter by Expiry Date");
    // System.out.println("9. Update Address");
    // System.out.println("10. Print Populate Distinct Cities ");
    // System.out.println("11. Print Total Payment for City");
    // System.out.println("12. Print Report Total Payment for Each City");
    // System.out.println("13. Remove Plan");
    // System.out.println("14. Remove User");
    // System.out.println("15. Change Password");
    // System.out.println("16. Print Populate Distinct Mobile Models");
    // System.out.println("17. Print Report Total Payment for Each Mobile Models");
    // System.out.println("18. Logout");
    // System.out.println("\n Please enter your choice:");
    // }

    // public static void userAddPlanOptionPrinter() {
    // System.out.println("1. Create Personal Plan");
    // System.out.println("2. Create Business Plan");
    // System.out.println("3. Return To User Menu");
    // }

    // public static void userMenuOptionPrinter() {
    // System.out.println("1. Add Plan");
    // System.out.println("2. Print Plan");
    // System.out.println("3. Change Address");
    // System.out.println("4. Remove Plan");
    // System.out.println("5. Return to Main Menu");
    // }

    // public static void mainMenuOptionPrinter() {
    // System.out.println("1. Admin Login");
    // System.out.println("2. User Login");
    // System.out.println("3. Exit Program");
    // }

    // public static void mainMenu(MobileCompany mobileCompany) {
    // mainMenuOptionPrinter();
    // int userChoice = getInt("\nPlease choose an option: ");
    // switch (userChoice) {
    // case 1:
    // adminEntryValidation(mobileCompany);
    // break;
    // case 2:
    // userMenu(mobileCompany);
    // break;
    // case 3:
    // // Exit Program
    // return;
    // default:
    // System.out.println("please enter from options below");
    // mainMenu(mobileCompany);
    // break;
    // }
    // }

    // public static void userMenu(MobileCompany mobileCompany) {
    // userMenuOptionPrinter();
    // int userChoice = getInt("Please choose an option: ");
    // switch (userChoice) {
    // case 1:
    // userAddPlanOptionPrinter();
    // userChoice = getInt("\nPlease choose an option: ");
    // switch (userChoice) {
    // case 1:
    // createPersonalPlan(mobileCompany);
    // break;
    // case 2:
    // createBusinessPlan(mobileCompany);
    // break;
    // default:
    // System.out.println("please enter from options below");
    // userAddPlanOptionPrinter();
    // break;
    // }
    // break;
    // case 2:
    // printUserInformation(mobileCompany);
    // break;
    // case 3:
    // updateAddress(mobileCompany);
    // break;
    // case 4:
    // removePlan(mobileCompany);
    // break;
    // case 5:
    // mainMenu(mobileCompany);
    // default:
    // System.out.println("please enter from options below");
    // userMenu(mobileCompany);
    // break;
    // }
    // }

    // public static void adminMenu(MobileCompany mobileCompany) {
    // int userChoice = 0;
    // while (userChoice != 18) {
    // adminMenuPrinter();
    // userChoice = userInput.nextInt();
    // userInput.nextLine();
    // switch (userChoice) {
    // case 1:
    // TestCase.planClassTestCode();
    // break;
    // case 2:
    // addUser(mobileCompany);
    // break;
    // case 3:
    // addUserWithAutomationID(mobileCompany);
    // break;
    // case 4:
    // createPersonalPlan(mobileCompany);
    // break;
    // case 5:
    // createBusinessPlan(mobileCompany);
    // break;
    // case 6:
    // printUserInformation(mobileCompany);
    // break;
    // case 7:
    // printFilterByMobileModel(mobileCompany);
    // break;
    // case 8:
    // printFilterByExpiryDate(mobileCompany);
    // break;
    // case 9:
    // updateAddress(mobileCompany);
    // break;
    // case 10:
    // printPopulateDistinctCityName(mobileCompany);
    // break;
    // case 11:
    // printTotalPaymentForCity(mobileCompany);
    // break;
    // case 12:
    // printReportPaymentPerCity(mobileCompany);
    // break;
    // case 13:
    // removePlan(mobileCompany);
    // break;
    // case 14:
    // removeUser(mobileCompany);
    // break;
    // case 15:
    // changeAdminPassword(mobileCompany);
    // break;
    // case 16:
    // printPopulateDistinctMobileModels(mobileCompany);
    // break;
    // case 17:
    // printReportPaymentPerMobileMode();
    // case 18:
    // // system will logout
    // break;
    // default:
    // System.out.println("please enter from options below");
    // break;
    // }
    // }
    // mainMenu(mobileCompany);
    // }

    // private static MobileType getMobileType() {
    // int mobileType = getInt("Please enter choice: \n 1. Android \n 2.IOS \n 3.
    // Windows");
    // switch (mobileType) {
    // case 1:
    // return MobileType.Android;
    // case 2:
    // return MobileType.IOS;
    // case 3:
    // return MobileType.Windows;
    // default:
    // System.out.println("please choose options below");
    // getMobileType();
    // }
    // return null;
    // }

    // public static void adminEntryValidation(MobileCompany mobileCompany) {
    // System.out.println("Please enter username: ");
    // String username = userInput.nextLine();
    // System.out.println("Please enter password: ");
    // String password = userInput.nextLine();
    // boolean isValid = mobileCompany.validateAdmin(username, password);
    // if (!isValid) {
    // System.out.println("Wrong username or password");
    // System.out.println("");
    // mainMenu(mobileCompany);
    // }
    // System.out.println("\n\n\n\n\n\n\n\n\n\n");
    // System.out.println("Welcome!");
    // System.out.println("");
    // adminMenu(mobileCompany);
    // }

    // private static void printReportPaymentPerMobileMode() {
    // ArrayList<String> mobileModelsList = new ArrayList<>();
    // ArrayList<Integer> mobileModelCount = new ArrayList<>();
    // ArrayList<Double> mobileModelTotalPayments = new ArrayList<>();
    // MobileCompany.reportPaymentsPerMobileModel(mobileModelsList,
    // mobileModelCount, mobileModelTotalPayments);
    // }

    // private static void printPopulateDistinctMobileModels(MobileCompany
    // mobileCompany) {
    // ArrayList<String> mobileModelsList = new ArrayList<>();
    // mobileModelsList = mobileCompany.populateDistinctMobileModels();
    // for (String mobileModel : mobileModelsList) {
    // System.out.println(mobileModel);
    // }
    // }

    // private static void removeUser(MobileCompany mobileCompany) {
    // int userID = getInt("Please enter user ID: ");
    // boolean result = mobileCompany.removeUser(userID);
    // if (result) {
    // System.out.println("User removed successfuly");
    // } else {
    // System.out.println("No user with ID: " + userID + " found");
    // }
    // }

    // private static void changeAdminPassword(MobileCompany mobileCompany) {
    // String password = getString("Please enter new password: ");
    // String userChoice = getString("Do you want to Change password (Y / N)");
    // if (userChoice.equals("Y")) {
    // mobileCompany.setAdminPassword(password);
    // System.out.println("Password updated successfuly!");
    // } else {
    // System.out.println("Password updating canceled");
    // mainMenu(mobileCompany);
    // }
    // }

    // private static void removePlan(MobileCompany mobileCompany) {
    // int userID = getInt("Please enter user ID: ");
    // int planID = getInt("Please enter plan ID: ");
    // boolean result = mobileCompany.removeUserPlan(userID, planID);
    // if (result) {
    // System.out.println("Plan removed successfuly");
    // } else {
    // System.out.println("Removing Failed, please Check user ID or plan ID to be
    // availble.");
    // }
    // }

    // private static void printReportPaymentPerCity(MobileCompany mobileCompany) {
    // ArrayList<String> cities = new ArrayList<>();
    // ArrayList<Double> payments = new ArrayList<>();
    // MobileCompany.reportPaymentPerCity(cities, payments);
    // }

    // private static void printTotalPaymentForCity(MobileCompany mobileCompany) {
    // String city = getString("Please enter city: ");
    // double totalPayment = mobileCompany.getTotalPaymentForCity(city);
    // System.out.println(city + ": " + totalPayment);
    // }

    // private static void printPopulateDistinctCityName(MobileCompany
    // mobileCompany) {
    // ArrayList<String> cities = new ArrayList<>();
    // cities = mobileCompany.populateDistincCityNames();
    // for (String city : cities) {
    // System.out.println(city);
    // }
    // }

    // private static void updateAddress(MobileCompany mobileCompany) {
    // ArrayList<String> addressinformlist = new ArrayList<>();
    // int userID = getInt("Please enter user ID: ");
    // addressinformlist = getAdress();
    // boolean result = mobileCompany.updateUserAddress(userID, addressinformlist);
    // if (result) {
    // System.out.println("Address updated successfuly");
    // } else {
    // System.out.println("No user ID found");
    // }
    // }

    // private static void printFilterByExpiryDate(MobileCompany mobileCompany) {
    // ArrayList<Integer> dateParameter = new ArrayList<>();
    // ArrayList<MobilePlan> filterdPlans = new ArrayList<>();
    // int userId = getInt("please enter user ID: ");
    // dateParameter = getExpiryDate();
    // MyDate date = new MyDate(dateParameter.get(0), dateParameter.get(1),
    // dateParameter.get(2));
    // filterdPlans = mobileCompany.filterByExpiryDate(userId, date);
    // if (filterdPlans.size() != 0) {
    // MobilePlan.printPlans(filterdPlans);
    // } else {
    // System.out.println("No expired plan found");
    // }
    // }

    // private static void printFilterByMobileModel(MobileCompany mobileCompany) {
    // ArrayList<MobilePlan> filterdPlans = new ArrayList<>();
    // String mobileModel = getString("Please enter mobile model");
    // filterdPlans = mobileCompany.filterByMobileModel(mobileModel);
    // MobilePlan.printPlans(filterdPlans);
    // }

    // private static void printUserInformation(MobileCompany mobileCompany) {
    // int userID = getInt("Please enter user ID: ");
    // mobileCompany.printUserInformationWithout(userID);
    // mobileCompany.printPlans(userID);
    // }

    // private static void createPersonalPlan(MobileCompany mobileCompany) {
    // ArrayList<String> planInformationList = new ArrayList<>();
    // int userID = getInt("Please enter userID");
    // planInformationList = getPlansSimilarInformation();
    // MobileType mobileType = getMobileType();
    // String city = getString("Please enter city");
    // MobilePhone mobilePhone = new MobilePhone(planInformationList.get(4),
    // mobileType,
    // Integer.parseInt(planInformationList.get(5)),
    // Double.parseDouble(planInformationList.get(6)));
    // MyDate expiryDate = new MyDate(Integer.parseInt(planInformationList.get(7)),
    // Integer.parseInt(planInformationList.get(8)),
    // Integer.parseInt(planInformationList.get(9)));
    // boolean result = mobileCompany.createPersonalPlan(userID,
    // planInformationList.get(1),
    // Integer.parseInt(planInformationList.get(0)), mobilePhone,
    // Integer.parseInt(planInformationList.get(2)),
    // Integer.parseInt(planInformationList.get(3)), expiryDate, city);
    // if (result) {
    // System.out.println("Plan added successfuly");
    // } else {
    // System.out.println("addition failed(Same ID) , please check user ID or plan
    // ID.");
    // }
    // }

    // private static void createBusinessPlan(MobileCompany mobileCompany) {
    // ArrayList<String> planInformationList = new ArrayList<>();
    // int userID = getInt("Please enter userID");
    // planInformationList = getPlansSimilarInformation();
    // MobileType mobileType = getMobileType();
    // int numberOfEmployees = getInt("Please enter number of employees");
    // int ABN = getInt("Please enter ABN");
    // MobilePhone mobilePhone = new MobilePhone(planInformationList.get(4),
    // mobileType,
    // Integer.parseInt(planInformationList.get(5)),
    // Double.parseDouble(planInformationList.get(6)));
    // MyDate expiryDate = new MyDate(Integer.parseInt(planInformationList.get(7)),
    // Integer.parseInt(planInformationList.get(8)),
    // Integer.parseInt(planInformationList.get(9)));
    // boolean result = mobileCompany.createBusinessPlan(userID,
    // planInformationList.get(1),
    // Integer.parseInt(planInformationList.get(0)), mobilePhone,
    // Integer.parseInt(planInformationList.get(2)),
    // Integer.parseInt(planInformationList.get(3)), expiryDate, numberOfEmployees,
    // ABN);
    // if (result) {
    // System.out.println("Plan added successfuly");
    // } else {
    // System.out.println("addition failed(Same ID) , please check user ID or plan
    // ID.");
    // }
    // }

    // private static void addUser(MobileCompany mobileCompany) {
    // String name = getString("Please enter user name: ");
    // int id = getInt("Please enter user ID: ");
    // ArrayList<String> addressParameterList = getAdress();
    // Address address = new Address(Integer.parseInt(addressParameterList.get(0)),
    // addressParameterList.get(1),
    // addressParameterList.get(2), addressParameterList.get(3));
    // boolean addingResult = mobileCompany.addUser(name, id, address);
    // if (addingResult) {
    // System.out.println("\n User added successfuly!");
    // } else {
    // System.out.println("Same ID, this ID have already added.");
    // }
    // }

    // private static void addUserWithAutomationID(MobileCompany mobileCompany) {
    // String name = getString("Please enter user name: ");
    // ArrayList<String> addressParameterList = getAdress();
    // Address address = new Address(Integer.parseInt(addressParameterList.get(0)),
    // addressParameterList.get(1),
    // addressParameterList.get(2), addressParameterList.get(3));
    // boolean addingResult = mobileCompany.addUserWithAutoGeneratingID(name,
    // address);
    // if (addingResult) {
    // System.out.println("\n User added successfuly!");
    // } else {
    // System.out.println("Same ID, this ID have already added.");
    // }
    // }

    // Lab 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public static void runUI() {
    // MobileCompany mobileCompany = new MobileCompany("A", "AA", "aa", 0);
    // adminMenu(mobileCompany);
    // }

    // private static ArrayList<String> getPlansSimilarInformation() {
    // ArrayList<String> planInformationList = new ArrayList<>();
    // ArrayList<Integer> dateParameters = new ArrayList<>();
    // String id = getString("Please enter plan ID: ");
    // String name = getString("Please enter name: ");
    // String intenetQuota = getString("Please enter intenet quota: ");
    // String caplimit = getString("Please enter cap limit: ");
    // String mobileModel = getString("Please enter mobile model: ");
    // String mobileMemorySize = getString("Please Enter mobile memory size:");
    // String mobilePrice = getString("Please enter mobile price: ");
    // dateParameters = getExpiryDate();
    // planInformationList.add(id);
    // planInformationList.add(name);
    // planInformationList.add(intenetQuota);
    // planInformationList.add(caplimit);
    // planInformationList.add(mobileModel);
    // planInformationList.add(mobileMemorySize);
    // planInformationList.add(mobilePrice);
    // for (int i = 0; i < dateParameters.size(); i++) {
    // planInformationList.add(Integer.toString(dateParameters.get(i)));
    // }
    // return planInformationList;
    // }

    // private static ArrayList<Integer> getExpiryDate() {
    // ArrayList<Integer> dateParameters = new ArrayList<>();
    // int day = getInt("Please enter expiry day");
    // int month = getInt("Please enter expiry month");
    // int year = getInt("Please enter expiry year");
    // dateParameters.add(day);
    // dateParameters.add(month);
    // dateParameters.add(year);
    // return dateParameters;
    // }

    // private static String getString(String command) {
    // Scanner userInput = new Scanner(System.in);
    // System.out.println(command);
    // String name = userInput.nextLine();
    // return name;
    // }

    // private static int getInt(String command) {
    // Scanner userInput = new Scanner(System.in);
    // System.out.println(command);
    // int id = userInput.nextInt();
    // userInput.nextLine();
    // return id;
    // }

    // private static ArrayList<String> getAdress() {
    // Scanner userInput = new Scanner(System.in);
    // ArrayList<String> address = new ArrayList<>();
    // System.out.println("Please enter address city:");
    // String city = userInput.nextLine();
    // System.out.println("Please enter address suburb:");
    // String suburb = userInput.nextLine();
    // System.out.println("Please enter address street:");
    // String street = userInput.nextLine();
    // System.out.println("Please enter address street number:");
    // String streetNum = userInput.nextLine();
    // address.add(streetNum);
    // address.add(street);
    // address.add(suburb);
    // address.add(city);
    // return address;
    // }

    // public static void adminMenuPrinter() {
    // System.out.println("1. Test code");
    // System.out.println("2. Create User");
    // System.out.println("3. Create Personal Plan");
    // System.out.println("4. Create Business Plan");
    // System.out.println("5. Print User Inforamtion");
    // System.out.println("6. Filter by Mobile Model");
    // System.out.println("7. Filter by Expiry Date");
    // System.out.println("8. Update Address");
    // System.out.println("9. Print Total Payments Per Mobile Model for User");
    // System.out.println("10. Print Total Payments Per City for Users");
    // System.out.println("11. Print Total Payments Per Mobile Model for Users");
    // System.out.println("12. Logout");
    // System.out.println("\n Please enter your choice:");
    // }

    // public static void adminMenu(MobileCompany mobileCompany) {
    // int userChoice = 0;
    // while (userChoice != 12) {
    // adminMenuPrinter();
    // Scanner userInput = new Scanner(System.in);
    // userChoice = userInput.nextInt();
    // userInput.nextLine();
    // switch (userChoice) {
    // case 1:
    // TestCase.runLab5();
    // break;
    // case 2:
    // addUser(mobileCompany);
    // break;
    // case 3:
    // createPersonalPlan(mobileCompany);
    // break;
    // case 4:
    // createBusinessPlan(mobileCompany);
    // break;
    // case 5:
    // printUserInformation(mobileCompany);
    // break;
    // case 6:
    // printFilterByMobileModel(mobileCompany);
    // break;
    // case 7:
    // printFilterByExpiryDate(mobileCompany);
    // break;
    // case 8:
    // updateAddress(mobileCompany);
    // break;
    // case 9:
    // printReportPaymentPerMobileMode(mobileCompany);
    // break;
    // case 10:
    // printTotalPaymentForCity(mobileCompany);
    // break;
    // case 11:
    // printReportPaymentPerMobileModeForAllUsers(mobileCompany);
    // break;
    // case 12:
    // // system will logout
    // break;
    // default:
    // System.out.println("please enter from options below");
    // break;
    // }
    // }
    // }

    // private static MobileType getMobileType() {
    // int mobileType = getInt("Please enter choice: \n 1. Android \n 2.IOS \n 3.
    // Windows");
    // switch (mobileType) {
    // case 1:
    // return MobileType.Android;
    // case 2:
    // return MobileType.IOS;
    // case 3:
    // return MobileType.Windows;
    // default:
    // System.out.println("please choose options below");
    // getMobileType();
    // }
    // return null;
    // }

    // private static void printReportPaymentPerMobileMode(MobileCompany
    // mobileCompany) {
    // boolean result = false;
    // int id = 0;
    // while (result == false) {
    // try {
    // id = getInt("Please Enter User ID: ");
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again");
    // }
    // User user = mobileCompany.findUser(id);
    // if (user != null) {
    // System.out.println("user: " + id);
    // String message = MobileCompany.totalPaymentAndCountPerMobileModelReport(
    // user.getTotalCountPerMobileModel(),
    // user.getTotalPaymentPerMobileModel(mobileCompany.getFlatRate()));
    // System.out.println(message);
    // } else {
    // System.out.println("user not found");
    // }
    // }
    // }

    // private static void printReportPaymentPerMobileModeForAllUsers(MobileCompany
    // mobileCompany) {
    // String message = MobileCompany.totalPaymentAndCountPerMobileModelReport(
    // mobileCompany.getTotalCountPerMobileModel(),
    // mobileCompany.getTotalPaymentPerCity());
    // System.out.println(message);
    // }

    // private static void printTotalPaymentForCity(MobileCompany mobileCompany) {
    // String message =
    // MobileCompany.totalPaymentAndCountPerCityReport(mobileCompany.getTotalCountPerCity(),
    // mobileCompany.getTotalPaymentPerCity());
    // System.out.println(message);
    // }

    // private static void updateAddress(MobileCompany mobileCompany) {
    // ArrayList<String> addressinformlist = new ArrayList<>();
    // int userID = getInt("Please enter user ID: ");
    // addressinformlist = getAdress();
    // boolean result = mobileCompany.updateUserAddress(userID, addressinformlist);
    // if (result) {
    // System.out.println("Address updated successfuly");
    // } else {
    // System.out.println("No user ID found");
    // }
    // }

    // private static void printFilterByExpiryDate(MobileCompany mobileCompany) {
    // ArrayList<Integer> dateParameter = new ArrayList<>();
    // ArrayList<MobilePlan> filterdPlans = new ArrayList<>();
    // int userId = getInt("please enter user ID: ");
    // dateParameter = getExpiryDate();
    // MyDate date = new MyDate(dateParameter.get(0), dateParameter.get(1),
    // dateParameter.get(2));
    // filterdPlans = mobileCompany.filterByExpiryDate(userId, date);
    // if (filterdPlans.size() != 0) {
    // MobilePlan.printPlans(filterdPlans);
    // } else {
    // System.out.println("No expired plan found");
    // }
    // }

    // private static void printFilterByMobileModel(MobileCompany mobileCompany) {
    // ArrayList<MobilePlan> filterdPlans = new ArrayList<>();
    // String mobileModel = getString("Please enter mobile model");
    // filterdPlans = mobileCompany.filterByMobileModel(mobileModel);
    // MobilePlan.printPlans(filterdPlans);
    // }

    // private static void printUserInformation(MobileCompany mobileCompany) {
    // int userID = getInt("Please enter user ID: ");
    // mobileCompany.printUserInformationWithout(userID);
    // mobileCompany.printPlans(userID);
    // }

    // private static void createPersonalPlan(MobileCompany mobileCompany) {
    // boolean result = false;
    // int userID = 0;
    // ArrayList<String> planInformationList = new ArrayList<>();
    // MobileType mobileType = null;
    // while (result == false) {
    // try {
    // userID = getInt("Please enter userID");
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // planInformationList = getPlansSimilarInformation();
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // mobileType = getMobileType();
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // String city = getString("Please enter city");
    // MobilePhone mobilePhone = new MobilePhone(planInformationList.get(4),
    // mobileType,
    // Integer.parseInt(planInformationList.get(5)),
    // Double.parseDouble(planInformationList.get(6)));
    // MyDate expiryDate = new MyDate(Integer.parseInt(planInformationList.get(7)),
    // Integer.parseInt(planInformationList.get(8)),
    // Integer.parseInt(planInformationList.get(9)));
    // boolean addResult = mobileCompany.createPersonalPlan(userID,
    // planInformationList.get(1),
    // Integer.parseInt(planInformationList.get(0)), mobilePhone,
    // Integer.parseInt(planInformationList.get(2)),
    // Integer.parseInt(planInformationList.get(3)), expiryDate, city);
    // if (addResult) {
    // System.out.println("Plan added successfuly");
    // } else {
    // System.out.println("addition failed(Same ID) , please check user ID or plan
    // ID.");
    // }
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again");
    // }
    // }

    // }

    // private static void createBusinessPlan(MobileCompany mobileCompany) {
    // ArrayList<String> planInformationList = new ArrayList<>();
    // boolean result = false;
    // int userID = 0;
    // MobileType mobileType = null;
    // int numberOfEmployees = 0;
    // int ABN = 0;
    // while (result == false) {
    // try {
    // userID = getInt("Please enter userID");
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // planInformationList = getPlansSimilarInformation();
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // mobileType = getMobileType();
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // mobileType = getMobileType();
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // numberOfEmployees = getInt("Please enter number of employees");
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // ABN = getInt("Please enter ABN");
    // MobilePhone mobilePhone = new MobilePhone(planInformationList.get(4),
    // mobileType,
    // Integer.parseInt(planInformationList.get(5)),
    // Double.parseDouble(planInformationList.get(6)));
    // MyDate expiryDate = new MyDate(Integer.parseInt(planInformationList.get(7)),
    // Integer.parseInt(planInformationList.get(8)),
    // Integer.parseInt(planInformationList.get(9)));
    // boolean addResult = mobileCompany.createBusinessPlan(userID,
    // planInformationList.get(1),
    // Integer.parseInt(planInformationList.get(0)), mobilePhone,
    // Integer.parseInt(planInformationList.get(2)),
    // Integer.parseInt(planInformationList.get(3)), expiryDate, numberOfEmployees,
    // ABN);
    // if (addResult) {
    // System.out.println("Plan added successfuly");
    // } else {
    // System.out.println("addition failed(Same ID) , please check user ID or plan
    // ID.");
    // }
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // }

    // private static void addUser(MobileCompany mobileCompany) {
    // boolean result = false;
    // String name = "";
    // int id = 0;
    // while (result == false) {
    // try {
    // name = getString("Please enter user name: ");
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // getInt("Please enter user ID: ");
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // result = false;
    // while (result == false) {
    // try {
    // ArrayList<String> addressParameterList = getAdress();
    // Address address = new Address(Integer.parseInt(addressParameterList.get(0)),
    // addressParameterList.get(1),
    // addressParameterList.get(2), addressParameterList.get(3));
    // boolean addingResult = mobileCompany.addUser(name, id, address);
    // if (addingResult) {
    // System.out.println("\n User added successfuly!");
    // } else {
    // System.out.println("Same ID, this ID have already added.");
    // }
    // result = true;
    // } catch (InputMismatchException e) {
    // System.out.println("Please try again your name");
    // }
    // }
    // }

    // private static void addUserWithAutomationID(MobileCompany mobileCompany) {
    // String name = getString("Please enter user name: ");
    // ArrayList<String> addressParameterList = getAdress();
    // Address address = new Address(Integer.parseInt(addressParameterList.get(0)),
    // addressParameterList.get(1),
    // addressParameterList.get(2), addressParameterList.get(3));
    // boolean addingResult = mobileCompany.addUserWithAutoGeneratingID(name,
    // address);
    // if (addingResult) {
    // System.out.println("\n User added successfuly!");
    // } else {
    // System.out.println("Same ID, this ID have already added.");
    // }
    // }

    // lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public static void runMain() throws IOException, ClassNotFoundException {
    //     int option = getInt("1. enter\n2. load\n3. exit");
    //     while (option != 3) {
    //         switch (option) {
    //             case 1:
    //                 MobileCompany mobileCompany = new MobileCompany("Samc", "Admin", "adminp", 10);
    //                 runUI(mobileCompany);
    //                 break;
    //             case 2:
    //                 MobileCompany mobileCompany2 = new MobileCompany();
    //                 mobileCompany2 = loadFile();
    //                 runUI(mobileCompany2);
    //         }
    //     }
    // }

    // public static void runUI(MobileCompany mobileCompany) throws IOException {
    //     uiMenu();
    //     int option = getInt("Please Choose an option: ");
    //     while (option != 5) {
    //         uiMenu();
    //         option = getInt("Please Choose an option: ");
    //         switch (option) {
    //             case 1:
    //                 addUser(mobileCompany);
    //                 break;
    //             case 2:
    //                 addPlan(mobileCompany);
    //                 break;
    //             case 3:
    //                 mobileCompany.print();
    //                 break;
    //             case 4:
    //                 saveFile(mobileCompany);
    //                 break;
    //         }
    //     }
    // }

    // public static void uiMenu() {
    //     System.out.println("1. Add User");
    //     System.out.println("2. Add Plan");
    //     System.out.println("3. Print All Information");
    //     System.out.println("4. Save");
    //     System.out.println("5. Exit");
    // }

    // public static String getString(String message) {
    //     Scanner userInput = new Scanner(System.in);
    //     System.out.println(message);
    //     return userInput.nextLine();
    // }

    // public static Integer getInt(String message) {
    //     Scanner userInput = new Scanner(System.in);
    //     System.out.println(message);
    //     int input = userInput.nextInt();
    //     userInput.nextLine();
    //     return input;
    // }

    // public static void addUser(MobileCompany mobileCompany) {
    //     String username = getString("Please Enter username");
    //     String userAdress = getString("Please enter user address like example(street number,street,suburb,city)");
    //     Address address = makeAddress(userAdress);
    //     mobileCompany.addUserWithAutoGeneratingID(username, address);
    //     System.out.println("user added successfuly!");
    //     System.out.println("");
    // }

    // public static void addPlan(MobileCompany mobileCompany) {
    //     int option = getInt("1. New Personal Plan\n2. New Business Plan");
    //     String initialInformation = getString(
    //             "Please enter information:(user Id,plan id,name,internet Quota, cap limit)");
    //     String mobileinfo = getString("Enter mobile information:(model,type,memory size,price)");
    //     String expiryDate = getString("expiry date: (day,month,year)");
    //     String[] initialinfo = initialInformation.split(",");
    //     switch (option) {
    //         case 1:
    //             String city = getString("enter city");
    //             mobileCompany.createPersonalPlan(Integer.parseInt(initialinfo[0]), initialinfo[2],
    //                     Integer.parseInt(initialinfo[1]), makeHandsetMobile(mobileinfo),
    //                     Integer.parseInt(initialinfo[3]), Integer.parseInt(initialinfo[4]),
    //                     makeExpiryDate(expiryDate), city);
    //             break;
    //         case 2:
    //             int numberOfEmployees = getInt("enter number of employees");
    //             int ABN = getInt("enter ABN");
    //             mobileCompany.createBusinessPlan(Integer.parseInt(initialinfo[0]), initialinfo[2],
    //                     Integer.parseInt(initialinfo[1]), makeHandsetMobile(mobileinfo),
    //                     Integer.parseInt(initialinfo[3]), Integer.parseInt(initialinfo[4]),
    //                     makeExpiryDate(expiryDate), numberOfEmployees, ABN);
    //             break;
    //     }
    //     System.out.println("Plan added successfuly");
    // }

    // public static Address makeAddress(String address) {
    //     String[] addressParts = address.split(",");
    //     Address newAddress = new Address(Integer.parseInt(addressParts[0]), addressParts[1], addressParts[2],
    //             addressParts[3]);
    //     return newAddress;
    // }

    // public static MyDate makeExpiryDate(String expiryDate) {
    //     String[] expiryDateS = expiryDate.split(",");
    //     MyDate expDate = new MyDate(Integer.parseInt(expiryDateS[0]), Integer.parseInt(expiryDateS[1]),
    //             Integer.parseInt(expiryDateS[2]));
    //     return expDate;
    // }

    // public static MobilePhone makeHandsetMobile(String mobileInfo) {
    //     String[] mobileInfoS = mobileInfo.split(",");
    //     MobilePhone phone = new MobilePhone(mobileInfoS[0], MobileType.valueOf(mobileInfoS[1]),
    //             Integer.parseInt(mobileInfoS[2]), Double.parseDouble(mobileInfoS[3]));
    //     return phone;
    // }

    // public static void saveFile(MobileCompany mobileCompany) throws IOException {
    //     int option = getInt("1. txt save\n2. ser save");
    //     boolean result = false;
    //     switch (option) {
    //         case 1:
    //             String fileName = getString("please write file name with (.txt) at the end of it");
    //             result = mobileCompany.saveTextFile(fileName);
    //             break;
    //         case 2:
    //             String fileName2 = getString("please write file name with (.ser) at the end of it");
    //             result = mobileCompany.save(fileName2);
    //             break;
    //     }
    //     if (result) {
    //         System.out.println("saved successfuly");
    //     } else {
    //         System.out.println("saving failed");
    //     }
    // }

    // public static MobileCompany loadFile() throws IOException, ClassNotFoundException {
    //     MobileCompany mobileCompany = new MobileCompany();
    //     int option = getInt("1. txt load\n2. ser load");
    //     boolean result = false;
    //     switch (option) {
    //         case 1:
    //             String fileName = getString("please write file name with (.txt) at the end of it");
    //             result = mobileCompany.loadTextFile(fileName);
    //             break;
    //         case 2:
    //             String fileName2 = getString("please write file name with (.ser) at the end of it");
    //             result = mobileCompany.load(fileName2);
    //             break;
    //     }
    //     if (result) {
    //         System.out.println("loaded successfuly");
    //         return mobileCompany;
    //     } else {
    //         System.out.println("loading failed");
    //         return null;
    //     }

    // }

}
