package _250407_Insurance_Company_Project.Account;

import _250407_Insurance_Company_Project.Insurance.Insurance;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    AuthenticationStatus authenticationStatus;
    User user;
    ArrayList<Insurance> insuranceList;
    String inputEmail;
    String inputPassword;

    Account(AuthenticationStatus authenticationStatus, User user, ArrayList<Insurance> insuranceList) {
        this.authenticationStatus = authenticationStatus;
        this.user = user;
        this.insuranceList = insuranceList;
    }

    public Account(){}

    public AuthenticationStatus login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TO LOGIN");
        System.out.println("Please Enter The Email Address");
        inputEmail = scanner.nextLine();
        System.out.println("Please Enter The Password");
        inputPassword = scanner.nextLine();



        System.out.println(inputEmail+" <--> "+inputPassword);

//        System.out.println(authenticationStatus);


        scanner.close();
        if((inputEmail.equals("a"))&&(inputPassword.equals("a"))){
            authenticationStatus=AuthenticationStatus.SUCCESS;
        }else{
            authenticationStatus=AuthenticationStatus.FAIL;
        }
        System.out.println(authenticationStatus);

        return authenticationStatus;
    }
}
