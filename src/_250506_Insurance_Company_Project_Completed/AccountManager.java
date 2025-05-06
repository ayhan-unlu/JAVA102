package _250506_Insurance_Company_Project_Completed;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> accountSet;
    Account account;
    ArrayList<Insurance> presetInsuranceList;


    public AccountManager(TreeSet<Account> accountSet) {
        this.accountSet = accountSet;
        presetInsuranceList = Account.addPresetInsuranceList();


    }

    public void addPresetAccounts(TreeSet<Account> accountSet) {
        accountSet.add(new Enterprise(AuthenticationStatus.FAIL, new User("", "", "", "", "", 0, null, LocalDate.now()), null));
        accountSet.add(new Enterprise(AuthenticationStatus.FAIL, new User("a", "a", "a", "a", "a", 1, AddressManager.addPresetAddressList(), LocalDate.now()), presetInsuranceList));
        accountSet.add(new Enterprise(AuthenticationStatus.FAIL, new User("b", "b", "b", "b", "b", 2, AddressManager.addPresetAddressList(), LocalDate.now()), presetInsuranceList));

        accountSet.add(new Individual(AuthenticationStatus.FAIL, new User("c", "c", "c", "c", "c", 3, AddressManager.addPresetAddressList(), LocalDate.now()), presetInsuranceList));
        accountSet.add(new Individual(AuthenticationStatus.FAIL, new User("d", "d", "d", "d", "d", 4, AddressManager.addPresetAddressList(), LocalDate.now()), presetInsuranceList));
        accountSet.add(new Individual(AuthenticationStatus.FAIL, new User("f", "f", "f", "f", "f", 5, AddressManager.addPresetAddressList(), LocalDate.now()), presetInsuranceList));

    }

    public TreeSet<Account> addNewAccount(TreeSet<Account> accountSet) {
        int selection;
        String name,surname,email,password,occupation;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter which type of Account you want to Create (1-2):\n1- Individual Account 2- Enterprise Account");
        selection=scan.nextInt();
        System.out.println("Please enter your name:");
        name=scan.next();
        System.out.println("Please enter your surname:");
        surname=scan.next();
        System.out.println("Please enter your email address:(This will be used to login your account)");
        email=scan.next();
        System.out.println("Please enter your password:(Password is case-sensitive)");
        password=scan.next();
        System.out.println("Please enter your occupation: ");
        occupation = scan.next();
        System.out.println("Please enter your age:");
        age=scan.nextInt();
        if (selection==1) {
            Account addedAccount = new Individual(AuthenticationStatus.FAIL, new User(name, surname,email,password, occupation,age,AddressManager.addPresetAddressList(), LocalDate.now()), presetInsuranceList);
            accountSet.add(addedAccount);
        }
        if(selection==2){
            Account addedAccount = new Enterprise(AuthenticationStatus.FAIL, new User(name,surname,email,password,occupation,age,AddressManager.addPresetAddressList(),LocalDate.now()),presetInsuranceList);
            accountSet.add(addedAccount);
        }
        System.out.println("Account Created\nTo enter Home/Business addresses and Insurances please use USER MENU after logging in.\nWelcome....");
        return accountSet;
    }

    public Account login(String inputEmail, String inputPassword, TreeSet<Account> accountSet) throws InvalidAuthenticationException {

        Iterator<Account> iter = accountSet.iterator();

        Account foundAccount = accountSet.first();

        while (iter.hasNext()) {
            Account a = iter.next();
            if ((a.getUser().getEmail().equals(inputEmail)) && (a.getUser().getPassword().equals(inputPassword))) {
                System.out.println("You have succesfully logged in");
                a.setAuthenticationStatus(AuthenticationStatus.SUCCESS);
                foundAccount = a;
                System.out.println("Authentication Status :" + foundAccount.getAuthenticationStatus());
                System.out.print("User " + foundAccount.getUser().getEmail());
            }
        }
        if (!AuthenticationStatus.SUCCESS.equals(foundAccount.getAuthenticationStatus())) {
            System.out.println("NOT FOUND");
            System.out.println("Authentication Status :" + foundAccount.getAuthenticationStatus());
            throw new InvalidAuthenticationException();
        }
        return foundAccount;
    }
}
