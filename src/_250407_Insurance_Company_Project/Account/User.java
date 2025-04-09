package _250407_Insurance_Company_Project.Account;

import _240721_InsuranceCompany.Address;

import java.util.ArrayList;
import java.util.Date;

public class User {
    String firstName;
    String lastName;
    String email;
    String password;
    String occupation;
    int age;
    ArrayList<Address> addressList;
    Date lastLoginDate;

    User(String firstName, String lastName, String email, String password, String occupation, int age, ArrayList<Address> addressList, Date lastLoginDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        this.addressList = addressList;
        this.lastLoginDate = lastLoginDate;
    }
}
