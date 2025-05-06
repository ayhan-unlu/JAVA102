package _0_Insurance_Company;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager {
    /*

    public void login(ArrayList<String> inputInfo) {

        if ((inputInfo.get(0).equals("a")) && (inputInfo.get(1).equals("a"))) {
            System.out.println(inputInfo.get(0) + ", " + inputInfo.get(1) + " <--> a,a");
            //   authenticationStatus=AuthenticationStatus.SUCCESS;
        } else {
            try {
                System.out.println(inputInfo.get(0) + ", " + inputInfo.get(1) + " <-X-> a,a");
                throw new InvalidAuthenticationException("Email/Password not correct");
                // authenticationStatus=AuthenticationStatus.FAIL;
            } catch (InvalidAuthenticationException e) {
            }
        }
        //System.out.println(authenticationStatus);

        //return authenticationStatus;
     //   Account account = new Account() {
       // };

      //  return account;
    }
     */

    private static TreeSet<Account>accountSet = new TreeSet<>();
    private AuthenticationStatus statusUser;

    static {
        accountSet.add(new Enterprise(new User("a","a","a","a", "a", 20)));
        accountSet.add(new Enterprise(new User("b","b","b","b", "b", 20)));
        accountSet.add(new Individual(new User("c","c", "c", "c", "c", 20)));
    }

    public AuthenticationStatus getUserLoginStatus(){
        System.out.println("Account Manager-1");
        return statusUser;
    }

    public Account login(String email, String password) throws InvalidAuthenticationException{
        System.out.println("Account Manager-2");
        Iterator<Account> iter = accountSet.iterator();
        System.out.println("Account Manager-3");
        while(iter.hasNext()){
            System.out.println("Account Manager-4");
            Account curAcc = iter.next();
            System.out.println("Account Manager-5");
            Account acc = null;
            System.out.println("Account Manager-6");

            acc = curAcc.loginUser(email,password);
            System.out.println("Account Manager-7");

            if(acc!=null){
                System.out.println("Account Manager-8");
                this.statusUser = AuthenticationStatus.SUCCESS;
                System.out.println("Account Manager-9");
                return acc;
            }
        }
        System.out.println("Account Manager-10");
        this.statusUser = AuthenticationStatus.FAIL;
        System.out.println("You Are Re-Directed To The Main Menu");
        System.out.println("Account Manager-11");
        throw new InvalidAuthenticationException();
    }
}
