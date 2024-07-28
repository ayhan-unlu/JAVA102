package _240721_InsuranceCompany;

import java.util.ArrayList;

public interface Address {
    // final String addressTypeA = "Home Address";
    // final String addressTypeB = "Business Address";

    // static ArrayList<IAddress> addressList = new ArrayList<>();

    public void addAddress(String address);

    public void remove();

    public void editAddress(String address);

}
