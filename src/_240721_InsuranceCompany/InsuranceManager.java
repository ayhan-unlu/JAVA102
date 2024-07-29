package _240721_InsuranceCompany;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class InsuranceManager {

    User user;

    InsuranceManager() {

    }

    public Insurance createInsurance(User user) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select insurance type \n1- Health \n2- Residence\n3- Travel\n4- Car: ");
        int choice = scan.nextInt();
        System.out.print("Please enter the amount for the insurance:");
        double price = scan.nextDouble();
        if (choice == 1) {
            scan.close();
            return new HealthInsurance("Health Insurance", 1.98, Date.from(Instant.now()), user);
        }
        if (choice == 2) {
            scan.close();
            return new ResidenceInsurance("Residence Insurance", 1.48, Date.from(Instant.now()), user);
        }
        if (choice == 3) {
            scan.close();
            return new TravelInsurance("Travel Insurance", 1.30, Date.from(Instant.now()), user);
        }
        if (choice == 4) {
            scan.close();
            return new CarInsurance("Car Insurance", 1.30, Date.from(Instant.now()), user);
        }
        scan.close();
        return null;

    }

}