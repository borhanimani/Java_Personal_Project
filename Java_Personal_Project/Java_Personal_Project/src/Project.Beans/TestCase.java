import java.io.IOException;
import java.util.HashMap;

public class TestCase {

        // public static void planClassTestCode() throws CloneNotSupportedException {

        // // Plan class Test Code >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // subjectPrinter("Plan class Test Code >>>>>>>>>>>>>>>>>>>");

        // // Creating person plan mobile phone
        // MobilePhone personalPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.00);
        // MobilePhone businessPlan1Phone = new MobilePhone("iPhone 13 pro",
        // MobileType.IOS, 64, 405.00);
        // MobilePhone personalPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.00);
        // MobilePhone businessPlan2Phone = new MobilePhone("Samsung Note9",
        // MobileType.Android, 256, 620.00);
        // MobilePhone personalPlan3Phone = new MobilePhone("iPhone 14", MobileType.IOS,
        // 128, 640.00);
        // MobilePhone businessPlan3Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 256, 320.00);

        // // Creting person plan expiry date
        // MyDate personalPlan1ExpiryDate = new MyDate(15, 5, 2023);
        // MyDate businessPlan1ExpiryDate = new MyDate(20, 3, 2025);
        // MyDate personalPlan2ExpiryDate = new MyDate(1, 7, 2019);
        // MyDate businessPlan2ExpiryDate = new MyDate(20, 3, 2023);
        // MyDate personalPlan3ExpiryDate = new MyDate(7, 7, 2018);
        // MyDate businessPlan3ExpiryDate = new MyDate(23, 3, 2025);

        // // Creating persona and business plans
        // PersonalPlan personalPlan1 = new PersonalPlan(100, "Sara",
        // personalPlan1Phone, 10, 4, "Shiraz",
        // personalPlan1ExpiryDate);
        // BusinessPlan businessPlan1 = new BusinessPlan(101, "Josh",
        // businessPlan1Phone, 20, 3, 50, 2,
        // businessPlan1ExpiryDate);
        // PersonalPlan personalPlan2 = new PersonalPlan(102, "Nathan",
        // personalPlan2Phone, 55, 4, "London",
        // personalPlan2ExpiryDate);
        // BusinessPlan businessPlan2 = new BusinessPlan(103, "Shirin",
        // businessPlan2Phone, 20, 3, 60, 4,
        // businessPlan2ExpiryDate);
        // PersonalPlan personalPlan3 = new PersonalPlan(104, "Maral",
        // personalPlan3Phone, 10, 10, "Melbourne",
        // personalPlan3ExpiryDate);
        // BusinessPlan businessPlan3 = new BusinessPlan(105, "Omid",
        // businessPlan3Phone, 10, 3, 9, 4,
        // businessPlan3ExpiryDate);

        // boolean result;
        // MobilePlan foundPlan;
        // String stringPrint;
        // double totalPayment;
        // ArrayList<MobilePlan> mobileModelFilteredPlans = new ArrayList<>();
        // ArrayList<MobilePlan> expiryDateFilteredPlans = new ArrayList<>();
        // MyDate date = new MyDate(14, 2, 2020);

        // // Printing personalPlan1 and businessPlan3
        // subjectPrinter("Printing personalPlan1 and businessPlan3");
        // personalPlan1.print();
        // businessPlan3.print();
        // stringPrint = personalPlan1.toString();
        // System.out.println(stringPrint);
        // stringPrint = businessPlan3.toString();
        // System.out.println(stringPrint);
        // spaceMaker();

        // // Creating a list of plan and print it
        // subjectPrinter("Creating a list of plan and print it");
        // ArrayList<MobilePlan> plans = new ArrayList<>();
        // plans.add(personalPlan1);
        // plans.add(businessPlan1);
        // plans.add(personalPlan2);
        // plans.add(businessPlan2);
        // plans.add(personalPlan3);
        // plans.add(businessPlan3);
        // MobilePlan.printPlans(plans);
        // stringPrint = MobilePlan.printPlansToString(plans);
        // System.out.println(stringPrint);
        // spaceMaker();

        // // Printing total payment of personalPlan2
        // subjectPrinter("Printing payment price of personalPlan2");
        // totalPayment = personalPlan2.calcPayment(10);
        // System.out.println("total payment: " + totalPayment);
        // spaceMaker();

        // // Print total payment of plans
        // subjectPrinter("Print total payment of plans");
        // totalPayment = MobilePlan.calcTotalPayments(plans, 10);
        // System.out.println("total payment of all plans: " + totalPayment);
        // spaceMaker();

        // // Print total payment of price rise personalPlan3
        // subjectPrinter("Print total payment of price rise personalPlan3");
        // personalPlan3.mobilePriceRise(0.1);
        // totalPayment = personalPlan3.calcPayment(10);
        // System.out.println("total payment of personal plan3: " + totalPayment);
        // spaceMaker();

        // // Print total payment of price rise for all plans
        // subjectPrinter("Print total payment of price rise for all plans");
        // MobilePlan.mobilePriceRiseAll(plans, 0.1);
        // totalPayment = MobilePlan.calcTotalPayments(plans, 10);
        // System.out.println("total payment of rise price for all plans: " +
        // totalPayment);
        // spaceMaker();

        // // Finding iPhone models in plans list
        // subjectPrinter("Finding iPhone models in plans list");
        // mobileModelFilteredPlans = MobilePlan.fillterByMobileModel(plans, "iPhone");
        // resultFindingPlans(mobileModelFilteredPlans);
        // spaceMaker();

        // // Finding expired dates after 2/14/2020 in plans list
        // subjectPrinter("Finding expiry dates after 2/14/2020 in plans list");
        // expiryDateFilteredPlans = MobilePlan.filterByExpiryDate(plans, date);
        // resultFindingPlans(expiryDateFilteredPlans);
        // spaceMaker();

        // // User class test code >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // subjectPrinter("User class test code >>>>>>>>>>>>>");

        // // Creating Users Addresses
        // Address user1Address = new Address(11, "Newtown", "Honeyway", "Texas");

        // // Creating User1
        // subjectPrinter("Creating User1");
        // User user1 = new User(1, "James", user1Address);
        // spaceMaker();

        // // Creating plans to user1
        // subjectPrinter("creating plans to user1");
        // result = user1.createPersonalPlan("sara", 100, personalPlan1Phone, 10, 4,
        // personalPlan1ExpiryDate,
        // "Shiraz");
        // resultAddingMassagePrinter(result);
        // result = user1.createBusinessPlan("Josh", 101, businessPlan1Phone, 20, 3, 50,
        // businessPlan1ExpiryDate, 2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // Adding plans to user1 test
        // subjectPrinter("adding plans to user1 test");
        // result = user1.addPlan(personalPlan2);
        // resultAddingMassagePrinter(result);
        // result = user1.addPlan(businessPlan2);
        // resultAddingMassagePrinter(result);
        // result = user1.addPlan(personalPlan3);
        // resultAddingMassagePrinter(result);
        // result = user1.addPlan(businessPlan3);
        // resultAddingMassagePrinter(result);
        // result = user1.addPlan(personalPlan3);
        // resultAddingMassagePrinter(result);
        // result = user1.addPlan(businessPlan3);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // Finding plan ID:100,103,107
        // foundPlan = user1.findPlan(100);
        // resultFindingMassagePrinter(foundPlan);
        // foundPlan = user1.findPlan(103);
        // resultFindingMassagePrinter(foundPlan);
        // foundPlan = user1.findPlan(107);
        // resultFindingMassagePrinter(foundPlan);
        // spaceMaker();

        // // Printing user1 information and Plans
        // subjectPrinter("Printing user1 information and Plans");
        // user1.print();
        // stringPrint = user1.toString();
        // spaceMaker();
        // System.out.println(stringPrint);
        // spaceMaker();

        // // Printing user1 information without Plans
        // subjectPrinter("Printing user1 information without Plans");
        // user1.printUserInformationWithoutPlans();
        // spaceMaker();

        // // Printing user1 plans and total payment without user1 information
        // subjectPrinter("Printing user1 plans and total payment without user1
        // information");
        // user1.printPlans(10);
        // spaceMaker();

        // // printing user1 plans total payment
        // subjectPrinter("print user1 plans total payment");
        // totalPayment = user1.calcTotalPayments(10);
        // System.out.println("user1 total payment: " + totalPayment);
        // spaceMaker();

        // // Calculating total payment with rise price 10 percent
        // subjectPrinter("Calculating total payment with rise price 10 percent");
        // user1.mobilePriceRiseAll(0.1);
        // totalPayment = user1.calcTotalPayments(10);
        // System.out.println("user1 total payment with price rise 0.1: " +
        // totalPayment);
        // spaceMaker();

        // // Finding samsung model and Print the found list
        // subjectPrinter("Finding samsung model and Print the found list");
        // mobileModelFilteredPlans = user1.filterByMobileModel("Samsung");
        // resultFindingPlans(mobileModelFilteredPlans);
        // System.out.println("Finding LG mobile model result:");
        // mobileModelFilteredPlans = user1.filterByMobileModel("LG");
        // resultFindingPlans(mobileModelFilteredPlans);
        // spaceMaker();

        // // Finding expired dates after 2/14/2020 in plans list
        // subjectPrinter("Finding expired dates after 2/14/2020 in plans list");
        // expiryDateFilteredPlans = user1.filterByExpiryDate(date);
        // resultFindingPlans(expiryDateFilteredPlans);
        // spaceMaker();

        // // Changing user1 address
        // subjectPrinter("Changing user1 address");
        // user1.setCity("New York");
        // user1.setSuburb("Rockhill");
        // user1.setStreet("Root");
        // user1.setStreetNum(16);
        // resultAddingMassagePrinter(true);
        // user1.printUserInformationWithoutPlans();
        // spaceMaker();

        // // MobileCompany class test code >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // subjectPrinter("MobileCompany class test code >>>>>>>>>>>>>");

        // // Create mobile company
        // MobileCompany mobileCompany = new MobileCompany("Samc", "Farbod", "bb1234",
        // 10);

        // // Creating and adding user1,2,3 to mobileCompany
        // subjectPrinter("Creating and adding user1,2,3 to mobileCompany");
        // result = mobileCompany.addUser("James", 1, user1Address);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser("James", 1, user1Address);
        // resultAddingMassagePrinter(result);
        // Address user2Address = new Address(15, "Oldtown", "Flowerway", "Los Angles");
        // Address user3Address = new Address(17, "Hardway", "Hiliard", "Sydney");
        // User user2 = new User(2, "George", user2Address);
        // User user3 = new User(3, "Mary", user3Address);
        // result = mobileCompany.addUser(user2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser(user3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser(user2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // Admin validation test
        // subjectPrinter("Admin validation test");
        // result = mobileCompany.validateAdmin("farbod", "bb1235");
        // if (!result) {
        // System.out.println("Validation Not Successful");
        // }
        // result = mobileCompany.validateAdmin("farbob", "bb1234");
        // if (!result) {
        // System.out.println("Validation Not Successful");
        // }
        // result = mobileCompany.validateAdmin("farbod", "bb1234");
        // if (result) {
        // System.out.println("Validation Successful");

        // // Finding user ID:1,5
        // subjectPrinter("Finding user ID:1,5");
        // User foundUser;
        // foundUser = mobileCompany.findUser(1);
        // resultFindingUserMassagePrinter(foundUser);
        // foundUser = mobileCompany.findUser(5);
        // resultFindingUserMassagePrinter(foundUser);
        // spaceMaker();

        // // Creating and adding plans
        // subjectPrinter("Creating and adding plans");
        // result = mobileCompany.createPersonalPlan(1, "Sara", 100, personalPlan1Phone,
        // 10, 4,
        // personalPlan1ExpiryDate, "Shiraz");
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.createPersonalPlan(1, "Sara", 100, personalPlan1Phone,
        // 10, 4,
        // personalPlan1ExpiryDate, "Shiraz");
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.createBusinessPlan(1, "Josh", 101, businessPlan1Phone,
        // 20, 3,
        // businessPlan1ExpiryDate, 50, 2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.createBusinessPlan(1, "Josh", 101, businessPlan1Phone,
        // 20, 3,
        // businessPlan1ExpiryDate, 50, 2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, personalPlan2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, businessPlan2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(3, personalPlan3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(3, businessPlan3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, personalPlan2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, businessPlan2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // Finding plans test
        // subjectPrinter(
        // "Finding plan ID:100 once with user ID:1,2 and once finding plan ID:107 with
        // user ID:1 successful and not successful message");
        // foundPlan = mobileCompany.findPlan(1, 100);
        // resultFindingMassagePrinter(foundPlan);
        // foundPlan = mobileCompany.findPlan(2, 100);
        // resultFindingMassagePrinter(foundPlan);
        // foundPlan = mobileCompany.findPlan(1, 107);
        // resultFindingMassagePrinter(foundPlan);
        // spaceMaker();

        // // Printing all information
        // subjectPrinter("Printing all information");
        // mobileCompany.print();
        // stringPrint = mobileCompany.toString();
        // System.out.println(stringPrint);
        // spaceMaker();

        // // Calculating user2 total payments
        // subjectPrinter("Calculating user2 total payments");
        // totalPayment = mobileCompany.calcTotalPayments(2);
        // System.out.println("user2 total payments: " + totalPayment);
        // totalPayment = mobileCompany.calcTotalPayments(4);
        // if (totalPayment == -1) {
        // System.out.println("User Not Found");
        // }

        // // Calculating all users total payments
        // subjectPrinter("Calculating all users total payments");
        // totalPayment = mobileCompany.calcTotalPayments();
        // System.out.println("total payments: " + totalPayment);
        // spaceMaker();

        // // Printing user3,4
        // subjectPrinter("Printing user3,4");
        // mobileCompany.printPlans(3);
        // mobileCompany.printPlans(4);
        // spaceMaker();

        // // Printing all users plans
        // subjectPrinter("Printing all users plans");
        // ArrayList<MobilePlan> allPlans = new ArrayList<>();
        // allPlans = mobileCompany.allPlan();
        // MobilePlan.printPlans(allPlans);
        // spaceMaker();

        // // Finding expired dates after 2/14/2020 in plans of user3 list
        // subjectPrinter("Finding expired dates after 2/14/2020 in plans of user3
        // list");
        // expiryDateFilteredPlans = mobileCompany.filterByExpiryDate(3, date);
        // resultFindingPlans(expiryDateFilteredPlans);
        // spaceMaker();

        // // Finding expired dates after 2/14/2020 in all users plans
        // subjectPrinter("Finding expired dates after 2/14/2020 in all users plans");
        // expiryDateFilteredPlans = mobileCompany.filterByExpiryDate(date);
        // resultFindingPlans(expiryDateFilteredPlans);
        // spaceMaker();

        // // Finding Nokia model and Print the found list in users2
        // subjectPrinter("Finding Nokia model and Print the found list in users2");
        // mobileModelFilteredPlans = mobileCompany.filterByMobileModel(3, "Nokia");
        // resultFindingPlans(mobileModelFilteredPlans);
        // spaceMaker();

        // // Finding Nokia model and Print the found list in all users
        // subjectPrinter("Finding Nokia model and Print the found list in all users");
        // mobileModelFilteredPlans = mobileCompany.filterByMobileModel("Nokia");
        // resultFindingPlans(mobileModelFilteredPlans);
        // spaceMaker();
        // }

        // Lab 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // // Creating person plan mobile phone
        // MobilePhone personalPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.00);
        // MobilePhone businessPlan1Phone = new MobilePhone("iPhone 13 pro",
        // MobileType.IOS, 64, 405.00);
        // MobilePhone personalPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.00);
        // MobilePhone businessPlan2Phone = new MobilePhone("Samsung Note9",
        // MobileType.Android, 256, 620.00);
        // MobilePhone personalPlan3Phone = new MobilePhone("iPhone 14", MobileType.IOS,
        // 128, 640.00);
        // MobilePhone businessPlan3Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 256, 320.00);

        // // Creting person plan expiry date
        // MyDate personalPlan1ExpiryDate = new MyDate(15, 5, 2023);
        // MyDate businessPlan1ExpiryDate = new MyDate(20, 3, 2025);
        // MyDate personalPlan2ExpiryDate = new MyDate(1, 7, 2019);
        // MyDate businessPlan2ExpiryDate = new MyDate(20, 3, 2023);
        // MyDate personalPlan3ExpiryDate = new MyDate(7, 7, 2018);
        // MyDate businessPlan3ExpiryDate = new MyDate(23, 3, 2025);

        // // Creating persona and business plans
        // PersonalPlan personalPlan2 = new PersonalPlan(102, "Nathan",
        // personalPlan2Phone, 55, 4, "London",
        // personalPlan2ExpiryDate);
        // BusinessPlan businessPlan2 = new BusinessPlan(103, "Shirin",
        // businessPlan2Phone, 20, 3, 60, 4,
        // businessPlan2ExpiryDate);
        // PersonalPlan personalPlan3 = new PersonalPlan(104, "Maral",
        // personalPlan3Phone, 10, 10, "Melbourne",
        // personalPlan3ExpiryDate);
        // BusinessPlan businessPlan3 = new BusinessPlan(105, "Omid",
        // businessPlan3Phone, 10, 3, 9, 4,
        // businessPlan3ExpiryDate);

        // // Creating Addresses
        // Address user1Address = new Address(11, "Newtown", "Honeyway", "Texas");
        // Address user2Address = new Address(15, "Oldtown", "Flowerway", "Los Angles");
        // Address user3Address = new Address(17, "Hardway", "Hiliard", "Sydney");
        // boolean result;

        // // Create mobile company
        // MobileCompany mobileCompany = new MobileCompany("Samc", "Farbod", "bb1234",
        // 10);

        // // Creating and adding user1,2,3 to mobileCompany
        // subjectPrinter("Lab 4");
        // subjectPrinter("Creating and adding user1,2,3 to mobileCompany");
        // result = mobileCompany.addUser("James", 1, user1Address);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser("James", 1, user1Address);
        // resultAddingMassagePrinter(result);
        // User user2 = new User(2, "George", user2Address);
        // User user3 = new User(3, "Mary", user3Address);
        // result = mobileCompany.addUser(user2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser(user3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser(user2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // Admin validation test
        // subjectPrinter("Admin validation test");
        // result = mobileCompany.validateAdmin("farbod", "bb1235");
        // if (!result) {
        // System.out.println("Validation Not Successful");
        // }
        // result = mobileCompany.validateAdmin("farbob", "bb1234");
        // if (!result) {
        // System.out.println("Validation Not Successful");
        // }
        // result = mobileCompany.validateAdmin("farbod", "bb1234");
        // if (result) {
        // System.out.println("Validation Successful");

        // // Finding user ID:1,5
        // subjectPrinter("Finding user ID:1,5");
        // User foundUser;
        // foundUser = mobileCompany.findUser(1);
        // resultFindingUserMassagePrinter(foundUser);
        // foundUser = mobileCompany.findUser(5);
        // resultFindingUserMassagePrinter(foundUser);
        // spaceMaker();

        // // Creating and adding plans
        // subjectPrinter("Creating and adding plans");
        // result = mobileCompany.createPersonalPlan(1, "Sara", 100, personalPlan1Phone,
        // 10, 4,
        // personalPlan1ExpiryDate, "Shiraz");
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.createPersonalPlan(1, "Sara", 100, personalPlan1Phone,
        // 10, 4,
        // personalPlan1ExpiryDate, "Shiraz");
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.createBusinessPlan(1, "Josh", 101, businessPlan1Phone,
        // 20, 3,
        // businessPlan1ExpiryDate, 50, 2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.createBusinessPlan(1, "Josh", 101, businessPlan1Phone,
        // 20, 3,
        // businessPlan1ExpiryDate, 50, 2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, personalPlan2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, businessPlan2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(3, personalPlan3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(3, businessPlan3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, personalPlan2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addPlan(2, businessPlan2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // Create shallow and deepCopy for all users
        // subjectPrinter("Create shallow and deepCopy for all users");
        // ArrayList<MobilePlan> plans = new ArrayList<>();
        // plans = mobileCompany.allPlan();
        // ArrayList<MobilePlan> shallowCopy = new ArrayList<>();
        // ArrayList<MobilePlan> deepCopy = new ArrayList<>();
        // shallowCopy = MobilePlan.shallowCopy(plans);
        // deepCopy = MobilePlan.deepCopy(plans);
        // spaceMaker();

        // // change user1 personal plan1 city and cap limit
        // subjectPrinter("change personal plan city and cap limit");

        // plans.get(0).setCity("New York");
        // plans.get(0).setCapLimit(50);

        // // Making new plan
        // result = mobileCompany.createPersonalPlan(1, "Lindsey", 106,
        // personalPlan1Phone, 70, 55,
        // personalPlan3ExpiryDate, "Ohio");
        // resultAddingMassagePrinter(result);

        // // change user1 business plan1 mobile model and expiry date
        // subjectPrinter("change user1 business plan1 mobile model and expiry date");
        // plans = mobileCompany.allPlan();
        // plans.get(1).setMobileModel("Iphone 10");
        // plans.get(1).changeDate(1, 1, 2020);

        // // Sorting users's plans (I used user1)
        // subjectPrinter("Sorting users's plans (I used user1)");
        // ArrayList<MobilePlan> user1Plans = new ArrayList<>();
        // user1Plans = mobileCompany.findUser(1).sortPlansByDate();
        // MobilePlan.printPlans(user1Plans);
        // spaceMaker();

        // // Printing all plans
        // subjectPrinter("orginal");
        // MobilePlan.printPlans(plans);
        // spaceMaker();
        // subjectPrinter("shallow copy");
        // MobilePlan.printPlans(shallowCopy);
        // spaceMaker();
        // subjectPrinter("deep copy");
        // MobilePlan.printPlans(deepCopy);
        // spaceMaker();

        // // Making shallow and deep copy of users
        // subjectPrinter("Making shallow and deep copy of users");
        // ArrayList<User> usersShallowCopy = new ArrayList<>();
        // ArrayList<User> usersDeepCopy = new ArrayList<>();
        // usersShallowCopy = mobileCompany.shallowCopyUsers();
        // usersDeepCopy = mobileCompany.deepCopyUsers();
        // mobileCompany.print();
        // spaceMaker();

        // // Adding new user
        // subjectPrinter("Adding new user");
        // Address user4Address = new Address(12, "GreenPark ", "hilli", "Luftansa");
        // result = mobileCompany.addUser("Kim", 4, user4Address);
        // resultAddingMassagePrinter(result);

        // // Changing user3 city to London
        // subjectPrinter("Changing user3 city to London");
        // mobileCompany.findUser(3).setCity("London");
        // mobileCompany.print();
        // spaceMaker();

        // // Sorting users (by address)
        // subjectPrinter("Sorting users (by address)");
        // ArrayList<User> users = new ArrayList<>();
        // users = mobileCompany.sortUsers();
        // subjectPrinter("Orginal");
        // for (User user : users) {
        // User.print(user);
        // }
        // spaceMaker();
        // subjectPrinter("shallow copy");
        // for (User user : usersShallowCopy) {
        // User.print(user);
        // }
        // spaceMaker();
        // subjectPrinter("deep copy");
        // for (User user : usersDeepCopy) {
        // User.print(user);
        // }
        // spaceMaker();

        // // Making clone mobileCompany
        // subjectPrinter("Making Clone mobile company");
        // MobileCompany mobileCompanyCloneVersion;
        // mobileCompanyCloneVersion = mobileCompany.clone();
        // subjectPrinter("Orginal Mobile Company");
        // mobileCompany.print();
        // plans = mobileCompany.allPlan();
        // MobilePlan.printPlans(plans);
        // spaceMaker();
        // subjectPrinter("Clone Mobile Company");
        // mobileCompanyCloneVersion.print();
        // plans = mobileCompanyCloneVersion.allPlan();
        // MobilePlan.printPlans(plans);
        // spaceMaker();
        // result = mobileCompany.removeUserPlan(3, 104);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.removeUserPlan(3, 105);
        // resultAddingMassagePrinter(result);
        // subjectPrinter("Orginal Mobile Company (After Removing user3 plans(plan ID:
        // 104, 105))");
        // mobileCompany.print();
        // plans = mobileCompany.allPlan();
        // MobilePlan.printPlans(plans);
        // spaceMaker();
        // subjectPrinter("Clone Mobile Company (After Removing user3 plans(plan ID:
        // 104, 105))");
        // mobileCompanyCloneVersion.print();
        // plans = mobileCompanyCloneVersion.allPlan();
        // MobilePlan.printPlans(plans);
        // spaceMaker();
        // Lab 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // public static void runLab5() {
        // // Creating person plan mobile phone
        // MobilePhone personalPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.00);
        // MobilePhone businessPlan1Phone = new MobilePhone("iPhone 13 pro",
        // MobileType.IOS, 64, 405.00);
        // MobilePhone personalPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.00);
        // MobilePhone businessPlan2Phone = new MobilePhone("Samsung Note9",
        // MobileType.Android, 256, 620.00);
        // MobilePhone personalPlan3Phone = new MobilePhone("iPhone 14", MobileType.IOS,
        // 128, 640.00);
        // MobilePhone businessPlan3Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 256, 320.00);

        // // Creting person plan expiry date
        // MyDate personalPlan1ExpiryDate = new MyDate(15, 5, 2023);
        // MyDate businessPlan1ExpiryDate = new MyDate(20, 3, 2025);
        // MyDate personalPlan2ExpiryDate = new MyDate(1, 7, 2019);
        // MyDate businessPlan2ExpiryDate = new MyDate(20, 3, 2023);
        // MyDate personalPlan3ExpiryDate = new MyDate(7, 7, 2018);
        // MyDate businessPlan3ExpiryDate = new MyDate(23, 3, 2025);

        // // Creating persona and business plans
        // PersonalPlan personalPlan2 = new PersonalPlan(102, "Nathan",
        // personalPlan2Phone, 55, 4, "London",
        // personalPlan2ExpiryDate);
        // BusinessPlan businessPlan2 = new BusinessPlan(103, "Shirin",
        // businessPlan2Phone, 20, 3, 60, 4,
        // businessPlan2ExpiryDate);
        // PersonalPlan personalPlan3 = new PersonalPlan(104, "Maral",
        // personalPlan3Phone, 10, 10, "Melbourne",
        // personalPlan3ExpiryDate);
        // BusinessPlan businessPlan3 = new BusinessPlan(105, "Omid",
        // businessPlan3Phone, 10, 3, 9, 4,
        // businessPlan3ExpiryDate);

        // // Creating Addresses
        // Address user1Address = new Address(11, "Newtown", "Honeyway", "Texas");
        // Address user2Address = new Address(15, "Oldtown", "Flowerway", "Los Angles");
        // Address user3Address = new Address(17, "Hardway", "Hiliard", "Sydney");
        // boolean result;

        // // Create mobile company
        // MobileCompany mobileCompany = new MobileCompany("Samc", "Farbod", "bb1234",
        // 10);

        // // Creating and adding user1,2,3 to mobileCompany
        // subjectPrinter("Lab 4");
        // subjectPrinter("Creating and adding user1,2,3 to mobileCompany");
        // result = mobileCompany.addUser("James", 1, user1Address);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser("James", 1, user1Address);
        // resultAddingMassagePrinter(result);
        // User user2 = new User(2, "George", user2Address);
        // User user3 = new User(3, "Mary", user3Address);
        // result = mobileCompany.addUser(user2);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser(user3);
        // resultAddingMassagePrinter(result);
        // result = mobileCompany.addUser(user2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // get total payment per city
        // subjectPrinter("get total payment per city");
        // String message =
        // MobileCompany.totalPaymentAndCountPerCityReport(mobileCompany.getTotalCountPerCity(),
        // mobileCompany.getTotalPaymentPerCity());
        // System.out.println(message);
        // spaceMaker();

        // // get total payment per mobile model
        // subjectPrinter("get total payment per mobile model");
        // message =
        // MobileCompany.totalPaymentAndCountPerMobileModelReport(mobileCompany.getTotalCountPerMobileModel(),
        // mobileCompany.getTotalPaymentPerMobileModel(mobileCompany.getFlatRate()));
        // System.out.println(message);
        // spaceMaker();

        // }

        // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // public static void runLab6() throws IOException, ClassNotFoundException,
        // PlanException, PlanExceptionUserName {

        // Boolean result;

        // // Testing mobile Plan saves and loads
        // // saving .ser
        // subjectPrinter("Testing mobile plan saves and loads");
        // MyDate personalPlan1ExpiryDate = new MyDate(15, 5, 2023);
        // MyDate businessPlan1ExpiryDate = new MyDate(20, 3, 2025);
        // MobilePhone personalPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.00);
        // MobilePhone businessPlan1Phone = new MobilePhone("iPhone 13 pro",
        // MobileType.IOS, 64, 405.00);
        // PersonalPlan personalPlan1 = new PersonalPlan(3000111, "USR123456U",
        // personalPlan1Phone, 10, 4, "Shiraz",
        // personalPlan1ExpiryDate);
        // BusinessPlan businessPlan1 = new BusinessPlan(3000222, "Josh",
        // businessPlan1Phone, 20, 3, 50, 2,
        // businessPlan1ExpiryDate);
        // HashMap<Integer, MobilePlan> plans = new HashMap<>();
        // plans.put(personalPlan1.getId(), personalPlan1);
        // plans.put(businessPlan1.getId(), businessPlan1);
        // String mobilePlanTestfileName1 = "mobilePlanTestingS.ser";
        // result = MobilePlan.save(plans, mobilePlanTestfileName1);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // loading .ser
        // System.out.println("loading .ser");
        // HashMap<Integer, MobilePlan> loadPlans = new HashMap<>();
        // loadPlans = MobilePlan.load(mobilePlanTestfileName1);
        // if (loadPlans != null) {
        // for (MobilePlan plan : loadPlans.values()) {
        // plan.print();
        // }
        // } else {
        // System.out.println("Loadind Failed");
        // }
        // spaceMaker();

        // // saving .txt
        // System.out.println("saving .txt");
        // String mobilePlanTestfileName2 = "mobilePlanTestingT.txt";
        // result = MobilePlan.saveTextFile(plans, mobilePlanTestfileName2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // loading .txt
        // System.out.println("loading .txt");
        // loadPlans = MobilePlan.loadTextFile(mobilePlanTestfileName2);
        // if (loadPlans != null) {
        // for (MobilePlan plan : loadPlans.values()) {
        // plan.print();
        // }
        // } else {
        // System.out.println("Loadind Failed");
        // }
        // spaceMaker();
        // spaceMaker();

        // // Testing user saves and loads
        // // saving .ser
        // subjectPrinter("Testing user saves and loads");
        // System.out.println("saving .ser");
        // Address user1Address = new Address(11, "Newtown", "Honeyway", "Texas");
        // User user1 = new User(1, "Samanta", user1Address);
        // user1.addPlan(personalPlan1);
        // user1.addPlan(businessPlan1);
        // String userTestingFile1 = "UserTestingS.ser";
        // HashMap<Integer, User> users = new HashMap<>();
        // users.put(user1.getUserID(), user1);
        // result = User.save(users, userTestingFile1);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // loading .ser
        // System.out.println("loading .ser");
        // users.clear();
        // users = User.load(userTestingFile1);
        // for (User user : users.values()) {
        // User.print(user);
        // }
        // spaceMaker();

        // // saving .txt
        // System.out.println("saving .txt");
        // String userTestingFile2 = "UserTestingT.txt";
        // result = User.saveTextFile(users, userTestingFile2);
        // resultAddingMassagePrinter(result);
        // HashMap<Integer, User> users2 = new HashMap<>();
        // spaceMaker();

        // // loading .txt
        // System.out.println("loading .txt");
        // users.clear();
        // users2 = User.loadTextFile(userTestingFile2);
        // for (User user : users2.values()) {
        // User.print(user);
        // }
        // spaceMaker();
        // spaceMaker();

        // // testing mobile company saves and loads
        // subjectPrinter("testing mobile company saves and loads");
        // MyDate personalPlan2ExpiryDate = new MyDate(1, 7, 2019);
        // MyDate businessPlan2ExpiryDate = new MyDate(20, 3, 2023);
        // MobilePhone personalPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
        // 64, 250.00);
        // MobilePhone businessPlan2Phone = new MobilePhone("Samsung Note9",
        // MobileType.Android, 256, 620.00);
        // PersonalPlan personalPlan2 = new PersonalPlan(3000333, "Nathan",
        // personalPlan2Phone, 55, 4, "London",
        // personalPlan2ExpiryDate);
        // BusinessPlan businessPlan2 = new BusinessPlan(3000444, "Shirin",
        // businessPlan2Phone, 20, 3, 60, 4,
        // businessPlan2ExpiryDate);
        // Address user2Address = new Address(15, "Oldtown", "Flowerway", "Los Angles");
        // User user2 = new User(2, "Micheal", user2Address);
        // MobileCompany mobileCompany = new MobileCompany("Samc2", "Admin", "adminp",
        // 10);
        // mobileCompany.addUser(user1);
        // mobileCompany.addUser(user2);
        // mobileCompany.addPlan(1, personalPlan1);
        // mobileCompany.addPlan(1, businessPlan1);
        // mobileCompany.addPlan(2, personalPlan2);
        // mobileCompany.addPlan(2, businessPlan2);

        // // saving .ser
        // System.out.println("saving .ser");
        // String companyTestingFile1 = "mobileCompanytestingFileS.ser";
        // result = mobileCompany.save(companyTestingFile1);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // loading .ser
        // System.out.println("loading .ser");
        // MobileCompany mobileCompanyEmpty = new MobileCompany();
        // result = mobileCompanyEmpty.load(companyTestingFile1);
        // resultAddingMassagePrinter(result);
        // mobileCompanyEmpty.print();
        // spaceMaker();

        // // saving .txt
        // System.out.println("saving .txt");
        // String companyTestingFile2 = "mobileCompanytestingFileT.txt";
        // result = mobileCompany.saveToTextFile(companyTestingFile2);
        // resultAddingMassagePrinter(result);
        // spaceMaker();

        // // loading .txt
        // System.out.println("loading .txt");
        // MobileCompany mobileCompanyEmpty2 = new MobileCompany();
        // result = mobileCompanyEmpty2.loadFromTextFile(companyTestingFile2);
        // if (result == false) {
        // System.out.println("No File Found");
        // } else {
        // resultAddingMassagePrinter(result);
        // mobileCompanyEmpty2.print();
        // spaceMaker();
        // }

        // subjectPrinter("Test Done");
        // }

        // Assignment 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // public static void runAssignment2() throws PlanException, IOException,
        // ClassNotFoundException {
        // MobileCompany company = new MobileCompany();
        // MyDate businessPlan1ExpiryDate = new MyDate(20, 3, 2025);
        // MobilePhone personalPlan1Phone = new MobilePhone("Samsung S20",
        // MobileType.Android, 128, 279.00);
        // Address user1Address = new Address(15, "Oldtown", "Flowerway", "Los Angles");

        // // testing binary file and list of plans
        // MobilePlan.save(company.allPlans(), "plans.ser");
        // HashMap<Integer, MobilePlan> plans = MobilePlan.load("plans.ser");
        // MobilePlan.printPlans(plans);
        // plans.put(12, new PersonalPlan(3000112, "PBBB", personalPlan1Phone, 30, 20,
        // "Tehran",
        // businessPlan1ExpiryDate));
        // MobilePlan.save(plans, "plans.ser");
        // plans.clear();
        // plans = MobilePlan.load("plans.ser");
        // MobilePlan.printPlans(plans);

        // // ------------------------------------------------------------------------
        // // testing binary file and list of users
        // User.save(company.getUsers(), "users.ser");
        // HashMap<Integer, User> users = User.load("users.ser");
        // User.printUsers(users);
        // User usr = new User(120, "A", user1Address);
        // usr.addPlan(new PersonalPlan(3000344, "PAAA", personalPlan1Phone, 10, 5,
        // "Shiraz",
        // businessPlan1ExpiryDate));
        // users.put(120, usr);
        // User.save(users, "users.ser");
        // users.clear();
        // users = User.load("users.ser");
        // User.printUsers(users);

        // //
        // -----------------------------------------------------------------------------
        // // testing text file and list of plans with toDilimitedString
        // MobilePlan.saveTextFile(company.allPlans(), "plans.txt");
        // plans.clear();
        // plans = MobilePlan.loadTextFile("plans.txt");
        // MobilePlan.printPlans(plans);
        // plans.put(12, new PersonalPlan(3000112, "PBBB", personalPlan1Phone, 30, 20,
        // "Tehran",
        // businessPlan1ExpiryDate));
        // MobilePlan.saveTextFile(plans, "plans.txt");
        // plans.clear();
        // plans = MobilePlan.load("plans.txt");
        // MobilePlan.printPlans(plans);

        // //
        // ------------------------------------------------------------------------------
        // // testing text file and list of users with toDilimitedString
        // User.saveTextFile(company.getUsers(), "users.txt");
        // users.clear();
        // users = User.loadTextFile("users.txt");
        // User.printUsers(users);
        // usr = new User(20, "B", user1Address);
        // usr.addPlan(new PersonalPlan(3000222, "CC", personalPlan1Phone, 10, 40,
        // "Sari",
        // businessPlan1ExpiryDate));
        // users.put(120, usr);
        // User.saveTextFile(users, "users.txt");
        // users.clear();
        // users = User.loadTextFile("users.txt");
        // User.printUsers(users);

        // // ----------------------------------------------------------------------
        // // mobileCompany and binary file
        // company.save("company.ser");
        // MobileCompany mobileCompany1 = new MobileCompany();// using default
        // constructor
        // mobileCompany1.load("company.ser");// all users and all plans are loaded
        // System.out.println(mobileCompany1);
        // mobileCompany1.addUser("Jack", 11, user1Address);
        // mobileCompany1.addPlan(11, new PersonalPlan(3000011, "John",
        // personalPlan1Phone, 50, 1, "Culumbus",
        // businessPlan1ExpiryDate));
        // mobileCompany1.save("company.ser");
        // MobileCompany mobileCompany2 = new MobileCompany();
        // mobileCompany2.load("company.ser");
        // System.out.println(mobileCompany2);

        // // -------------------------------------------------------------------
        // // mobileCompany and text file
        // company.saveToTextFile("company.txt");
        // mobileCompany1 = new MobileCompany();// using default constructor
        // mobileCompany1.loadFromTextFile("company.txt");// all users and all plans are
        // loaded
        // System.out.println(mobileCompany1);
        // mobileCompany1.addUser("Jack", 11, user1Address);
        // mobileCompany1.addPlan(11, new PersonalPlan(3000011, "John",
        // personalPlan1Phone, 50, 1, "Culumbus",
        // businessPlan1ExpiryDate));
        // mobileCompany1.saveToTextFile("company.txt");
        // mobileCompany2 = new MobileCompany();
        // mobileCompany2.loadFromTextFile("company.txt");
        // System.out.println(mobileCompany2);
        // }

        public static void runLab4To6TestCode() throws PlanException, PlanExceptionUserName {

                subjectPrinter("runLab4To6TestCode");

                // test MobilePlan
                subjectPrinter("test MobilePlan");

                // adding plan
                // Creating person plan mobile phone
                MobilePhone personalPlan1Phone = new MobilePhone("Samsung S20",
                                MobileType.Android, 128, 279.00);
                MobilePhone businessPlan1Phone = new MobilePhone("iPhone 13 pro",
                                MobileType.IOS, 64, 405.00);
                MobilePhone personalPlan2Phone = new MobilePhone("Nokia", MobileType.Windows,
                                64, 250.00);
                MobilePhone businessPlan2Phone = new MobilePhone("Samsung Note9",
                                MobileType.Android, 256, 620.00);
                MobilePhone personalPlan3Phone = new MobilePhone("iPhone 14", MobileType.IOS,
                                128, 640.00);
                MobilePhone businessPlan3Phone = new MobilePhone("Nokia", MobileType.Windows,
                                256, 320.00);

                // Creting person plan expiry date
                MyDate personalPlan1ExpiryDate = new MyDate(15, 5, 2023);
                MyDate businessPlan1ExpiryDate = new MyDate(20, 3, 2025);
                MyDate personalPlan2ExpiryDate = new MyDate(1, 7, 2019);
                MyDate businessPlan2ExpiryDate = new MyDate(20, 3, 2023);
                MyDate personalPlan3ExpiryDate = new MyDate(7, 7, 2018);
                MyDate businessPlan3ExpiryDate = new MyDate(23, 3, 2025);

                // Creating persona and business plans
                PersonalPlan personalPlan1 = new PersonalPlan(3000111, "USR000002U",
                                personalPlan1Phone, 10, 4, "Shiraz",
                                personalPlan1ExpiryDate);
                BusinessPlan businessPlan1 = new BusinessPlan(3000222, "USR000002U",
                                businessPlan1Phone, 20, 3, 50, 2,
                                businessPlan1ExpiryDate);
                PersonalPlan personalPlan2 = null;
                try {
                        personalPlan2 = new PersonalPlan(4, "USR000003U",
                                        personalPlan2Phone, 55, 4, "London",
                                        personalPlan2ExpiryDate);
                } catch (Exception e) {
                        // TODO: handle exception
                }
                personalPlan2.print();
                // BusinessPlan businessPlan2 = new BusinessPlan(3000444, "USR000004U",
                // businessPlan2Phone, 20, 3, 60, 4,
                // businessPlan2ExpiryDate);
                // PersonalPlan personalPlan3 = new PersonalPlan(3000555, "USR000005U",
                // personalPlan3Phone, 10, 10, "Melbourne",
                // personalPlan3ExpiryDate);
                // BusinessPlan businessPlan3 = new BusinessPlan(3000666, "USR000006U",
                // businessPlan3Phone, 10, 3, 9, 4,
                // businessPlan3ExpiryDate);

        }

        private static void resultAddingMassagePrinter(Boolean result) { // checks the result of adding something like
                                                                         // plan
                                                                         // or user and prints proper prompt
                if (result) {
                        System.out.println("Changes done successfuly!");
                } else {
                        System.out.println("Same ID");
                }
        }

        private static void spaceMaker() { // Makes space between each plan information (for better UI)
                System.out.println("");
        }

        private static void subjectPrinter(String subject) {
                System.out.println("------------------- " + subject + " -------------------");
        }
}
