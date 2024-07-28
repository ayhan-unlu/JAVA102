package _240721_InsuranceCompany;

import java.util.Scanner;

public class AddressManager {

    public static void addAddress(User user, IAddress address) {
        user.getAddressList().add(address);
    }

    public static void remove(User user, IAddress address) {
        user.getAddressList().remove(address);
    }

    public static IAddress createHomeAddress() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your home Address: ");
        String homeAddress = scan.nextLine();
        return new HomeAddress(homeAddress);
    }

    public static IAddress createBusinessAddress() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your business address: ");
        String businessAddress = scan.nextLine();
        return new BusinessAddress(businessAddress);
    }

}
