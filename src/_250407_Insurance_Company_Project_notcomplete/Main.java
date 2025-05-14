package _250407_Insurance_Company_Project_notcomplete;

import _250407_Insurance_Company_Project_notcomplete.Account.*;

import java.util.Scanner;

public class Main {

    public static void main(String[]args) {
/*        TreeSet<Account> accountList = new TreeSet<>(new OrderByEmailComparator());
        Menu.run();
        Address address1 = new HomeAddress(1,"a","a","a","1");
        Address address2 = new BusinessAddress(2,"b","b", "b","2");*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mail address!");
        String mailInput = input.nextLine();
        System.out.println("Now please enter your password:  ");
        String passwordInput = input.nextLine(); //bakalım
        AccountManager accountManager = new AccountManager();
        Account account;

        try {
            account = accountManager.login(mailInput, passwordInput);
        } catch (InvalidAuthenticationException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Login status : " + accountManager.getLoginStatusUser());
        }

    }



}