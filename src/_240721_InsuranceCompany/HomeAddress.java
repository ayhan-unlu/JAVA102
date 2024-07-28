package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeAddress implements IAddress {
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public void addAddress(String address) {
        // addressList.add()

    }

    @Override
    public void remove() {

    }

    @Override
    public void editAddress(String address) {

    }

    /*
     * public void printAddressList(ArrayList addressList) {
     * 
     * Iterator<Integer> iter = addressList.iterator();
     * while (iter.hasNext()) {
     * System.out.println(iter.next());
     * }
     * }
     */
}
