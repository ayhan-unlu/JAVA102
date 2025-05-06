package _0_Insurance_Company;

import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
    String inputEmail;
    String inputPassword;
    ArrayList<String> inputInfo = new ArrayList(2);

    public InputScanner() {
    }

    public ArrayList<String> scanLoginInfo() {
        System.out.println("TO LOGIN");
        System.out.println("Please Enter The Email Address");
        System.out.println("Input Scanner-1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Scanner-2");

        inputEmail = scanner.nextLine();
        System.out.println("Input Scanner-3");

        System.out.println("Please Enter The Password");
        inputPassword = scanner.nextLine();
        System.out.println("Input Scanner-4");

        inputInfo.add(inputEmail);
        System.out.println("Input Scanner-5");

        inputInfo.add(inputPassword);
        System.out.println("Input Scanner-6");

        System.out.println(inputInfo.toString());
        System.out.println("Input Scanner-7");

        scanner.close();
        System.out.println("Input Scanner-8");
        return inputInfo;
    }
}
