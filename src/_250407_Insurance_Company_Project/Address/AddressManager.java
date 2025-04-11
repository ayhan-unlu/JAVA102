package _250407_Insurance_Company_Project.Address;

import _250407_Insurance_Company_Project.Account.User;


public class AddressManager {

    public static void addAddressList(User user, Address address){
        user.getAddressList().add(address);
    }

    public static void removeAddressList(User user, Address address){
        user.getAddressList().remove(address);
    }
}
