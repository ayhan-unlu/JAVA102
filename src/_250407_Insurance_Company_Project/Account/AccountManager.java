package _250407_Insurance_Company_Project.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {

    public Account login(ArrayList<String> inputInfo) {

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
        Account account = new Account() {
        };

        return account;
    }
}
