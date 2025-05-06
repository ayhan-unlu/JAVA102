package _250506_Insurance_Company_Project_Completed;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginInfoScanner {
    ArrayList<String> inputInfo = new ArrayList(2);

    Scanner scan = new Scanner(System.in);

    public ArrayList<String> getInputInformation() {
        printLoginMenu();
        System.out.println("Please Enter The Email Address");
        String inputEmail = scan.nextLine();
        inputInfo.add(inputEmail);
        System.out.println("Please Enter Password");
        String inputPassword = scan.nextLine();
        inputInfo.add(inputPassword);

        return inputInfo;
    }

    public void printLoginMenu() {
        System.out.println("Welcome to Login Menu\nPlease enter the required information");
    }
}
