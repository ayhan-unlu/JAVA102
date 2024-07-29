package _240721_InsuranceCompany;

import java.util.Scanner;

public class GetInput {

//    private String loginEmail;
//    private String loginPassword;

    Scanner scan = new Scanner(System.in);

    public String getEmailInput(){
        System.out.println("Please enter your email address to login");
        
        return scan.next();
        
    }
    public String getPasswordInput(){
        System.out.println("Please enter your password.");
        return scan.next();
        
    }



    
    

}
