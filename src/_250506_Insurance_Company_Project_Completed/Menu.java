package _250506_Insurance_Company_Project_Completed;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Menu {
    TreeSet<Account> accountSet;

    Menu(TreeSet<Account> accountSet) {
        this.accountSet = accountSet;
    }

    public void printMainMenu() {
        System.out.println("\nInsurance Company Management Panel");
        System.out.println("1- Login\n2- Create an Account\n0- Exit");
        System.out.println("Please enter your selection(0-2): ");
    }

    public void printUserMenu() {
        System.out.println("\nWelcome to the User Menu");
        System.out.println("1-Display User Information\n2-Address Menu\n3-Insurance Menu\n0-Back To Main Menu");
        System.out.println("Please enter your selection(0-3):");
    }

    public void printAddressMenu() {
        System.out.println("\nWelcome to the Address Menu");
        System.out.println("1-Add Address\n2-Delete Address\n0-Return to User Menu");
        System.out.println("Please enter your selection(0-2):");
    }

    public void printInsuranceMenu() {
        System.out.println("\nWelcome to the Insurance Menu");
        System.out.println("1-Add Insurance\n2-Delete Insurance\n0-Return to User Menu");
        System.out.println("Please enter your selection(0-2):");
    }

    public void printExitMessage() {
        System.out.println("\nThanks for visiting us. Bye for Now");
    }

    public void printInvalidSelectionMessage() {
        System.out.println("\nPlease enter 0, 1 or 2");
    }


    public void runMainMenu(TreeSet<Account> accountSet) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printMainMenu();
                int selection = scan.nextInt();

                switch (selection) {
                    case 0:
                        printExitMessage();
                        isExit = false;
                        break;

                    case 1:
                        runLoginMenu(accountSet);
                        break;

                    case 2:
                        runCreateAccountMenu(accountSet);
                        runMainMenu(accountSet);
                        break;

                    default:
                        printInvalidSelectionMessage();
                        runMainMenu(accountSet);
                        break;
                }
                isExit = false;
            } catch (Exception e) {
                e.getMessage();
                runMainMenu(accountSet);
            }
        }
        scan.close();
    }


    public TreeSet<Account> runLoginMenu(TreeSet<Account> accountSet) {

        ArrayList<String> loginInfo;
        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                LoginInfoScanner loginInfoScanner = new LoginInfoScanner();
                loginInfo = loginInfoScanner.getInputInformation();
                AccountManager accountManager = new AccountManager(accountSet);
                Account loggedInAccount = accountManager.login(loginInfo.get(0), loginInfo.get(1), accountSet);
                runUserMenu(accountSet, loggedInAccount);
                loggedInAccount.showUserInfo(loggedInAccount);
            } catch (InvalidAuthenticationException invalidAuthenticationException) {
                invalidAuthenticationException.getMessage();
            }
        }
        return accountSet;
    }

    public TreeSet<Account> runCreateAccountMenu(TreeSet<Account> accountSet) {
        AccountManager accountManager = new AccountManager(accountSet);

        accountSet = accountManager.addNewAccount(accountSet);

        Account.addPresetInsuranceList();
        return accountSet;
    }

    public TreeSet<Account> runUserMenu(TreeSet<Account> accountSet, Account loggedInAccount) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printUserMenu();
                int selection = scan.nextInt();

                switch (selection) {
                    case 0:
                        runMainMenu(accountSet);
                        isExit = false;
                        break;
                    case 1:
                        loggedInAccount.showUserInfo(loggedInAccount);
                        runUserMenu(accountSet, loggedInAccount);
                    case 2:
                        runAddressMenu(accountSet, loggedInAccount);

                    case 3:
                        runInsuranceMenu(accountSet, loggedInAccount);

                    default:
                        printInvalidSelectionMessage();
                        break;
                }
                isExit = false;
            } catch (Exception e) {
                e.getMessage();
                runUserMenu(accountSet, loggedInAccount);
            }
        }
        return accountSet;
    }

    public TreeSet<Account> runAddressMenu(TreeSet<Account> accountSet, Account loggedInAccount) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printAddressMenu();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        runUserMenu(accountSet, loggedInAccount);
                        isExit = false;
                        break;

                    case 1:
                        AddressManager.addAddress(loggedInAccount.getUser());
                        runAddressMenu(accountSet, loggedInAccount);

                    case 2:
                        AddressManager.deleteAddress(loggedInAccount.getUser());
                        runAddressMenu(accountSet, loggedInAccount);

                    default:
                        printInvalidSelectionMessage();
                        break;
                }
                isExit = false;
            } catch (Exception e) {
                e.getMessage();
                runAddressMenu(accountSet, loggedInAccount);
            }
        }
        return accountSet;
    }

    public TreeSet<Account> runInsuranceMenu(TreeSet<Account> accountSet, Account loggedInAccount) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printInsuranceMenu();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        runUserMenu(accountSet, loggedInAccount);
                        isExit = false;
                        break;

                    case 1:
                        loggedInAccount.addInsurance(accountSet, loggedInAccount);
                        runInsuranceMenu(accountSet, loggedInAccount);

                    case 2:
                        loggedInAccount.deleteInsurance(accountSet, loggedInAccount);
                        runInsuranceMenu(accountSet, loggedInAccount);

                   default:
                        printInvalidSelectionMessage();
                        break;
                }
                isExit = false;
            } catch (Exception e) {
                e.getMessage();
                runInsuranceMenu(accountSet, loggedInAccount);
            }
        }
        return accountSet;
    }
}