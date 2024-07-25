package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.TreeSet;


public abstract class Account {
    
    // User u1 = new User("A1", "Surname", "a1@user.com", "1234", "Soldier", 35, new
    // ArrayList<IAddress>(), "22.07.2024")
   // User user = new User();
ArrayList<Insurance> insuranceList=new ArrayList<>();

    // user.getInsuranceList(); Insurance ArrayList
    public final void showUserInfo() {
        System.out.println();

        System.out.println("howUserInfo");
    }

    public int hashCode() {
        return 0;
    }

    public void equals() {
    }

}
