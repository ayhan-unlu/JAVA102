package _240721_InsuranceCompany;

import java.util.ArrayList;

public interface IAddress {
    final String addressTypeA = "Home Address";
    final String addressTypeB = "Business Address";

    // static ArrayList<IAddress> addressList = new ArrayList<>();

    void addAddress(String address);

    void deleteAddress(String address);

}