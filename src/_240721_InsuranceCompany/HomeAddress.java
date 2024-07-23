package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeAddress implements IAddress {
    private String homeAddress;
    HomeAddress(String homeAddress){
        this.homeAddress=homeAddress;
    }

    @Override
    public void addAddress(String address){
        addressList.add()
        

    }

    @Override
    public void deleteAddress(String address){
        
    }

    public void printAddressList(ArrayList addressList){

        Iterator <Integer> iter= addressList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
