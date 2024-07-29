package _240721_InsuranceCompany;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> accounts;
    User currentUser;
    Account account;

    AccountManager() {
        accounts = new TreeSet<>();
        run();
    }

    public void run() {

        // ArrayList<User> userList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String choice = " ";

        while (!choice.equals("3")) {
            System.out.println("1- Create an Account\n2- Login to Account\n3- Exit\n4- Admin Login\nYour Choice:? ");
            choice = scan.nextLine();

            if (choice.equals("1")) {
                createAccount();
            } else if (choice.equals("2")) {
                System.out.println("Please enter your email: ");
                String Email = scan.nextLine();
                System.out.println("Please enter your password: ");
                String Password = scan.nextLine();
                System.out.println("21");
                login(Email, Password);
                System.out.println("22");
            } else if (choice.equals("4")) {
                System.out.println("Printing all accounts and passwords in the System...");
                for (Account a : getAccounts())
                    System.out.println("Email: " + a.getUser().getEmail() + "\nPassword: " + a.getUser().getPassword());
                System.out.println("Printing all Insurance List in the System...");
                for (Insurance i : User.getInsuranceList())
                    System.out.println("Customer Name: " + i.getUser().getUsersName() + "\nInsurance Name: "
                            + i.getInsuranceName() + "Insurance Price: " + i.getInsurancePrice());
            }
        }
        
    }

    public void createAccount() {
        Scanner scan = new Scanner(System.in);

        String usersName, surname, email, password, occupation;
        int age;

        System.out.println("Please enter your name:");
        usersName = scan.nextLine();
        System.out.println("Please enter your surname:");
        surname = scan.nextLine();
        System.out.println("Please enter your email:");
        email = scan.nextLine();
        System.out.println("Please enter your password:");
        password = scan.nextLine();
        System.out.println("Please enter your occupation:");
        occupation = scan.nextLine();
        System.out.println("Please enter your age:");
        age = scan.nextInt();

        User user = new User(usersName, surname, email, password, occupation, age);

        System.out.println();

        System.out.println("Are you applying for Individual Account? 1-->Yes 0-->No");
        int accountType = scan.nextInt();

        System.out.println("11");
        Account prop;
        System.out.println("12");

        if (accountType == 1) {
            System.out.println("13");
            prop = new Individual(user);
            System.out.println("14");
        } else {
            prop = new Enterprise(user);
        }

        accounts.add(prop);
    }

    public void login(String email, String password) {
        System.out.println("23");
        for (Account account : accounts) {
            System.out.println("24");
            try {
                System.out.println("25");

                account.login(email, password);
                System.out.println("26");

                if (account.isLogin()) {
                    System.out.println("27");
                    currentUser = account.getUser();
                    this.account = account;
                    System.out.println("28");
                    if (account.getType() == 1) {
                        System.out.println("29");
                        individualUserProcess();
                        System.out.println("291");
                    } else {
                        enterpriseUserProcess();
                    }
                    break;
                }
            } catch (InvalidAuthenticationException e) {
            }
        }
    }

    public void individualUserProcess() {
        System.out.println("Welcome " + currentUser.getUsersName());

        String choice = "1";

        while (!choice.equals("q")) {
            Scanner scan = new Scanner(System.in);

            System.out.println("\n1- Show My Info:");
            System.out.println("\n2- Add Insurance:");
            System.out.println("\n3- Show Insurance List:");
            System.out.println("\n4- Add Address:");
            System.out.println("\n5- Show All Addresses:");
            choice = scan.nextLine();

            if (choice.equals("1")) {
                account.showInfo();
            } else if (choice.equals("2")) {
                InsuranceManager insuranceManager = new InsuranceManager();
                account.addInsurance(insuranceManager.createInsurance(currentUser));
            } else if (choice.equals("3")) {
                for (Insurance insurance : account.getUser().getInsuranceList()) {
                    System.out.println(
                            "\nName: " + insurance.getInsuranceName() + "\nPrice: " + insurance.getInsurancePrice());
                }
            } else if (choice.equals("4")) {
                account.addAddress(AddressManager.createHomeAddress());
            } else if (choice.equals("5")) {
                for (Address address : currentUser.getAddressList()) {
                    System.out.println(currentUser.getAddressList());

                }
            }
            scan.close();
        }

    }

    public void enterpriseUserProcess() {
    }

    public TreeSet<Account> getAccounts() {
        return this.accounts;
    }

}

/*
 * private TreeSet<Account> accountList = new TreeSet<>();
 * 
 * 
 * AccountManager(TreeSet<Account> accountList) {
 * this.accountList = accountList;
 * }
 * 
 * public TreeSet<Account> getAccountList() {
 * return accountList;
 * }
 * 
 * public void setAccountList(TreeSet<Account> accountList) {
 * this.accountList = accountList;
 * }
 * 
 * // AccountManager a = new AccountManager(accountList);
 * 
 * // TreeSet<Account> accountList= new TreeSet<>(new OrderByEmailComparator());
 * 
 * /*
 * 
 * @Override
 * public int compareTo(Object o1) {
 * return 0;
 * }
 */

/*
 * System.out.println("Welcome " + currentUser.getUsersName());
 * 
 * String choice = "1";
 * 
 * while (!choice.equals("q")) {
 * System.out.println(
 * "\n1- Show My Info: \n2- Get Insurance: \n3- Get Insurance List\n4- Add Address\n5- Show All Addresses: \nPlease enter your choice: "
 * );
 * Scanner scan = new Scanner(System.in);
 * choice = scan.nextLine();
 * 
 * if (choice.equals("1")) {
 * account.showInfo();
 * } else if (choice.equals(2)) {
 * InsuranceManager insuranceManager = new InsuranceManager();
 * account.addInsurance(insuranceManager.createInsurance(currentUser));
 * } else if (choice.equals("3")) {
 * for (Insurance insurance : account.getUser().getInsuranceList()) {
 * System.out.println(
 * "Name: " + insurance.getInsuranceName() + "\nPrice: " +
 * insurance.getInsurancePrice());
 * }
 * } else if (choice.equals("4")) {
 * account.addAddress(AddressManager.createHomeAddress());
 * } else if (choice.equals("5")) {
 * for (IAddress address : currentUser.getAddressList()) {
 * System.out.println(currentUser.getAddressList());
 * }
 * }
 * 
 * }
 */
/*
 * public Account login(String email, String password, ArrayList<User> userList)
 * {
 * 
 * try {
 * for (User u : userList) {
 * System.out.println(u.getEmail() + "  " + u.getPassword());
 * if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
 * // AuthenticationStatus.SUCCESS.returnAuthenticationStatus(1);
 * System.out.println(AuthenticationStatus.SUCCESS.getAuthenticationStatus());
 * System.out.println("Login confirmed**********");
 * } else if (!email.equals(u.getEmail()) && password.equals(u.getPassword())) {
 * // AuthenticationStatus.SUCCESS.returnAuthenticationStatus(2);
 * System.out.println(AuthenticationStatus.FAIL.getAuthenticationStatus());
 * System.out.println("Access Denied.");
 * }
 * }
 * }
 * 
 * catch (Exception e) {
 * System.out.println("InvalidAuthenticationException");
 * }
 * return null;
 * 
 * }
 */

// public void setAccounts(TreeSet<Account> accounts) {
// this.accounts = accounts;
// }

// public User getCurrentUser() {
// return this.currentUser;
// }

// public void setCurrentUser(User currentUser) {
// this.currentUser = currentUser;
// }

// public Account getAccount() {
// return this.account;
// }

// public void setAccount(Account account) {
// this.account = account;
// }

/*
 * public void addAccount(TreeSet<Account> accountList, AuthenticationStatus
 * authenticationStatus,
 * TreeSet<User> userList) {
 * 
 * }
 * 
 * public void createAccountList(ArrayList accountList, AuthenticationStatus
 * authenticationStatus, User user,
 * ArrayList insuranceList) {
 * accountList.add(0, user);
 * accountList.add(1, authenticationStatus);
 * accountList.add(2, insuranceList);
 * System.out.println("Account List");
 * 
 * Iterator iter = accountList.iterator();
 * 
 * while (iter.hasNext()) {
 * System.out.println(iter.next());
 * }
 * 
 * }
 * 
 * // ArrayList<User> userList = new ArrayList<>();
 * // user.addUsersToList(userList, user);
 * 
 * // for (User u : userList) {
 * // System.out.println(u.getUsersName() + " " + u.getAge() + " " +
 * u.getOccupation() + " " + u.getSurname()
 * // + " " + " " + " " + " ");
 * // }
 * // System.out.println(user.getEmail() + " " + user.getPassword());
 */
