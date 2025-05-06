package _250506_Insurance_Company_Project_Completed;

import java.util.ArrayList;
import java.util.Scanner;

import static _250506_Insurance_Company_Project_Completed.Address.addressType.BUSINESS;
import static _250506_Insurance_Company_Project_Completed.Address.addressType.HOME;

public class AddressManager {
    User currentUser;

    AddressManager(User currentUser) {
        this.currentUser = currentUser;
    }

    public static ArrayList<Address> addPresetAddressList() {
        ArrayList<Address> presetAddressList = new ArrayList<>(2);
        presetAddressList.add(new HomeAddress(HOME, "", "presetCity", "presetZipCode", "presetCountry"));
        presetAddressList.add(new BusinessAddress(BUSINESS, "", "presetCity", "presetZipCode", "presetCountry"));
        return presetAddressList;
    }

    public static void addAddress(User currentUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose Address Type You want to add\nHome Address - 1 \nBusiness Address - 2");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Please enter The Country:");
            String addedCountry = scanner.next();
            System.out.println("Please enter ZipCode");
            String addedZipCode = scanner.next();
            System.out.println("Please enter the City");
            String addedCity = scanner.next();
            System.out.println("Please enter the AddressBlock");
            String addedAddressBlock = scanner.next();
            currentUser.getAddressList().addFirst(new HomeAddress(HOME, addedAddressBlock, addedCity, addedZipCode, addedCountry));
            System.out.println("Home Address is added");
        }
        if (input == 2) {
            System.out.println("Please Enter the Country:");
            String addedCountry = scanner.next();
            System.out.println("Please Enter the ZipCode:");
            String addedZipCode = scanner.next();
            System.out.println("Please Enter the City:");
            String addedCity = scanner.next();
            System.out.println("Please Enter the AddressBlock:");
            String addedAddressBlock = scanner.next();
            currentUser.getAddressList().addLast(new BusinessAddress(BUSINESS, addedAddressBlock, addedCity, addedZipCode, addedCountry));
            System.out.println("Business Address is Added");
        }
    }

    public static void deleteAddress(User currentUser) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose Address Type to Delete\nDelete Home Address - 11\nDelete Business Address - 22");
        int input = scanner.nextInt();

        if (input == 11) {
            currentUser.getAddressList().addFirst(new HomeAddress(HOME, "", "", "", ""));
            System.out.println("Home Address is deleted.");
        }
        if (input == 22) {
            currentUser.getAddressList().addLast(new BusinessAddress(BUSINESS, "", "", "", ""));
            System.out.println("Business Address is deleted.");
        }
    }
}
