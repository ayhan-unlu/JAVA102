package _250407_Insurance_Company_Project_notcomplete.Address;

import _250407_Insurance_Company_Project_notcomplete.Account.User;

import java.util.ArrayList;


public class AddressManager {
/*
    public static void addAddressList(User user, Address address){
        user.getAddressList().add(address);
    }

    public static void removeAddressList(User user, Address address){
        user.getAddressList().remove(address);
    }

 */
    private static ArrayList<Address> current = new ArrayList<>();

    public static boolean addAddress(Address address, User user){
        int indexNumber = searchAddressFromUser(address,user);
        if (indexNumber !=-1)
            return false;

            user.getAddressList().add(address);
            return true;
    }

    public static boolean removeAddress(Address address, User user){
        int indexNumber = searchAddressFromUser(address,user);

        if (indexNumber == -1 )
            return false;
        user.getAddressList().remove(indexNumber);
        return true;
    }

    public static int searchAddressFromUser(Address address, User user){
        current = user.getAddressList();

        for (int i=0; i< current.size();i++){
            if(address.equals(current.get(i))){return i;}
        }return -1;
    }
}
