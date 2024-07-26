package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public abstract class Account{
    private TreeSet <User> list;

    public Account(TreeSet <User> list){
        this.list=list;
    }

    User user = new User(null, null, null, null, null, 0);

     ArrayList <Account> accounts= new ArrayList<>();
    






    
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
