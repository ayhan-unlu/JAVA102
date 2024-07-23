package _240721_InsuranceCompany;

import java.util.ArrayList;

public interface IAddress {
    public static ArrayList<IAddress> addressList = new ArrayList<>();
    

    public void addAddress(String address);
    public void deleteAddress(String address);

}
