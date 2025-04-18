package _250407_Insurance_Company_Project;

import _250407_Insurance_Company_Project.Account.AccountManager;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);


    public static void run() {
        int menuInput;
        boolean condition = true;
        try {
            while (condition) {
                System.out.println("MAIN MENU\n1-LOG IN\n2-CREATE ACCOUNT\n0-EXIT\nPLEASE ENTER YOUR SELECTION(0-2):");
                menuInput = scan.nextInt();

                switch (menuInput) {
                    case 1 -> {
                        System.out.println("LOGIN BEGINS");
                        // logInMenu();
                        Menu.run1();
                    }
                    case 2 -> {
                        System.out.println("CREATE ACCOUNT BEGINS");
                        Menu.createAccount();
                    }

                    case 0 -> condition = false;
                    default -> System.out.println("Enter a number (0/1/2)");
                }
            }
        } catch (
                Exception e) {
            e.getMessage();
        }
    }

    public static void run1() {

        InputScanner inputScanner = new InputScanner();
        AccountManager accountManager = new AccountManager();
        accountManager.login(inputScanner.scanLoginInfo());
    }

    public static void runFromMac(){

    }


    public static void logInMenu() {

    }

    public static void createAccount() {
    }
}
