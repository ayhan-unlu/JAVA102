package _0_Insurance_Company;


public class Main {

    public  static void main(String[]args) {
       // run();
        System.out.println("Main-1");
        Menu menu = new Menu();
        menu.mainMenu();
        System.out.println("Main-2");


    }

    public static void run(){
/*        TreeSet<Account> accountList = new TreeSet<>(new OrderByEmailComparator());
  */

    /*    Address address1 = new HomeAddress(1,"a","a","a","1");
        Address address2 = new BusinessAddress(2,"b","b", "b","2");*/
/*
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your email address: ");
        String inputEmail = scan.nextLine();
        System.out.println("Please enter your password: ");
        String inputPassword = scan.nextLine();

        AccountManager accountManager = new AccountManager();
        Account account;

        try{
            account = accountManager.login(inputEmail,inputPassword);
        }catch (InvalidAuthenticationException e){
            e.printStackTrace();
        }finally{
            System.out.println("Login Status : " + accountManager.getLoginStatusUser() );
        }
*/    }



}