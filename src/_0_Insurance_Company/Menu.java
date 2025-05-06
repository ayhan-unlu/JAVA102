package _0_Insurance_Company;

import java.util.Scanner;

public class Menu {


    public  void mainMenu() {
        Scanner scan = new Scanner(System.in);

        int menuInput;
        boolean condition = true;
        try {
            while (condition) {
                System.out.println("Menu-1");
                System.out.println("MAIN MENU\n1-LOG IN\n2-CREATE ACCOUNT\n0-EXIT\nPLEASE ENTER YOUR SELECTION(0-2):");
                menuInput = scan.nextInt();
                System.out.println("Menu-2");

                switch (menuInput) {

                    case 1 -> {
                        System.out.println("Menu-3");

                        System.out.println("LOGIN BEGINS");
                     //   logInMenu();
                        Menu.loginMenu();
                        System.out.println("Menu-4");

                    }
                    case 2 -> {
                        System.out.println("CREATE ACCOUNT BEGINS");
                    //    Menu.createAccount();
                    }

                    case 0 -> condition = false;
                    default -> System.out.println("Enter a number (0/1/2)");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void loginMenu() throws InvalidAuthenticationException {
        System.out.println("Menu-5");

        InputScanner inputScanner = new InputScanner();
        AccountManager accountManager = new AccountManager();
        System.out.println("Menu-6");

        Account account =null;
        System.out.println("Menu-7");


        try {
            System.out.println("Menu-8");

            inputScanner.scanLoginInfo();
            account=accountManager.login(inputScanner.inputEmail, inputScanner.inputPassword);
            System.out.println("Menu-9");
            if(accountManager.getUserLoginStatus()==AuthenticationStatus.SUCCESS){
               System.out.println("You Are Being Directed To The User Menu:");
            account.showUserInfo();
                Menu.userMenu();

           }
        }catch(InvalidAuthenticationException e){
            System.out.println("Menu-10");

            System.out.println(e.getMessage());
            System.out.println("Menu-11");

        }/*finally{
            System.out.println("Menu-12");
            System.out.println(accountManager.getUserLoginStatus());
            System.out.println("Menu-13");

            }*/


    }


    public static void userMenu() {
        System.out.println("Menu-14");


        System.out.println("Menu-15");
        boolean condition = true;
        System.out.println("Menu-16");
        Scanner input = new Scanner(System.in);
        System.out.println("Menu-171");
        String userMenuInput = input.next();

        System.out.println("Menu-172");

        while (condition) {
            System.out.println("Menu-18");
            System.out.println("USER MENU\n1-SHOW USER INFO2-");
            System.out.println("Menu-19");
            System.out.println("Menu-20");

            System.out.println("Menu-21");

            System.out.println(userMenuInput);
            System.out.println("Menu-22");
            System.out.println();

            switch (userMenuInput) {
         //       case 1 -> account.showUserInfo();
                case "" -> condition = false;
                default -> System.out.println("Please Enter your selection:");
            }


        }
  //      System.out.println(account.getUser().toString());

    }}

  /*      int menuInput;
        boolean condition = true;
        try {
            while (condition) {
                System.out.println("Menu-1");
                System.out.println("MAIN MENU\n1-LOG IN\n2-CREATE ACCOUNT\n0-EXIT\nPLEASE ENTER YOUR SELECTION(0-2):");
                menuInput = scan.nextInt();
                System.out.println("Menu-2");

                switch (menuInput) {

                    case 1 -> {
                        System.out.println("Menu-3");

                        System.out.println("LOGIN BEGINS");
                        //   logInMenu();
                        Menu.loginMenu();
                        System.out.println("Menu-4");

                    }
                    case 2 -> {
                        System.out.println("CREATE ACCOUNT BEGINS");
                        Menu.createAccount();
                    }

                    case 0 -> condition = false;
                    default -> System.out.println("Enter a number (0/1/2)");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void createAccount() {
    }
}
*/