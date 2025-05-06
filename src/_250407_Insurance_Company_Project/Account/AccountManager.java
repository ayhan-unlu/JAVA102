package _250407_Insurance_Company_Project.Account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
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
        accountSet.add(new Enterprise(new User("a","a","a@a.com","a", "a", 20)));
        accountSet.add(new Enterprise(new User("b","b","b@b.com","b", "b", 20)));
        accountSet.add(new Individual(new User("c","c", "c@c.com", "c", "c", 20)));
    }

    public AuthenticationStatus getLoginStatusUser(){
        return statusUser;
    }

    public Account login(String email, String password) throws InvalidAuthenticationException{
        Iterator<Account> iter = accountSet.iterator();
        while(iter.hasNext()){
            Account curAcc = iter.next();
            Account acc = null;

            acc = curAcc.loginUser(email,password);

            if(acc!=null){
                this.statusUser = AuthenticationStatus.SUCCESS;
                return acc;
            }
        }
        this.statusUser = AuthenticationStatus.FAIL;
        throw new InvalidAuthenticationException();

    }
}
