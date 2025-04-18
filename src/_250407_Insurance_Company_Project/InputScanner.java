package _250407_Insurance_Company_Project;

import _250407_Insurance_Company_Project.Insurance.Insurance;

import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
    String inputEmail;
    String inputPassword;
    ArrayList<String> inputInfo = new ArrayList(2);

    public InputScanner() {
    }

    public ArrayList<String> scanLoginInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TO LOGIN");
        System.out.println("Please Enter The Email Address");
        inputEmail = scanner.nextLine();
        System.out.println("Please Enter The Password");
        inputPassword = scanner.nextLine();
        inputInfo.add(inputEmail);
        inputInfo.add(inputPassword);

        System.out.println(inputInfo.toString());

        scanner.close();
        return inputInfo;
    }
}
