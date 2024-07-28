package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
        Scanner scan = new Scanner(System.in);

        String choice = " ";

        while (!choice.equals("3")) {
            System.out.println("1- Create an Account\n2- Login to Account\3- Exit\n4- Admin Login\nYour Choice:? ");
            choice = scan.nextLine();

            if (choice.equals("1")) {
                createAccount();
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

        System.out.println("Are you applying for an Enterprise? 1-->Yes 0-->No");
        int accountType = scan.nextInt();
        Account prop;

        if (accountType == 1) {
            prop = new Enterprise(user);
        } else  {
            prop = new Individual(user);
        } 

        accounts.add(prop);

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
     */
    // AccountManager a = new AccountManager(accountList);

    // TreeSet<Account> accountList= new TreeSet<>(new OrderByEmailComparator());

    @Override
    public int compareTo(Object o1) {
        return 0;
    }

    public void addAccount(TreeSet<Account> accountList, AuthenticationStatus authenticationStatus,
            TreeSet<User> userList) {

    }

    public void createAccountList(ArrayList accountList, AuthenticationStatus authenticationStatus, User user,
            ArrayList insuranceList) {
        accountList.add(0, user);
        accountList.add(1, authenticationStatus);
        accountList.add(2, insuranceList);
        System.out.println("Account List");

        Iterator iter = accountList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    public Account login(String email, String password, ArrayList<User> userList) {

        try {
            for (User u : userList) {
                System.out.println(u.getEmail() + "  " + u.getPassword());
                if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
                    // AuthenticationStatus.SUCCESS.returnAuthenticationStatus(1);
                    System.out.println(AuthenticationStatus.SUCCESS.getAuthenticationStatus());
                    System.out.println("Login confirmed**********");
                } else if (!email.equals(u.getEmail()) && password.equals(u.getPassword())) {
                    // AuthenticationStatus.SUCCESS.returnAuthenticationStatus(2);
                    System.out.println(AuthenticationStatus.FAIL.getAuthenticationStatus());
                    System.out.println("Access Denied.");
                }
            }
        }

        catch (Exception e) {
            System.out.println("InvalidAuthenticationException");
            // TODO: handle exception
        }
        return null;

    }

}
