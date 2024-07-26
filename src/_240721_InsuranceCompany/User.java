package _240721_InsuranceCompany;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class User {

    private String usersName;
    private String surname;
    private String email;
    private String password;
    private String occupation;
    private int age;
    // private ArrayList<String> addressList;// ??? need care
    private SimpleDateFormat lastLoginDate;

    User(String usersName, String surname, String email, String password, String occupation, int age/*
                                                                                                     * ,
                                                                                                     * ArrayList<String>
                                                                                                     * addressList ,
                                                                                                     * SimpleDateFormat
                                                                                                     * lastLoginDate
                                                                                                     */) {
        this.usersName = usersName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        // this.addressList = addressList;
        // this.lastLoginDate=lastLoginDate;
    }

    public String getUsersName() {
        return this.usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * public ArrayList<String> getAddress() {
     * return addressList;
     * }
     * 
     * public void setAddress(ArrayList<String> addressList) {
     * this.addressList = addressList;
     * }
     */

    public SimpleDateFormat getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(SimpleDateFormat lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void addUsersToList(TreeSet<User> list, User u) {
        list.add(u);
    }

    public void printUserList(TreeSet<User> list) {

        for (User ur : list) {

            System.out.println();

            System.out.println("User's Name: " + ur.getUsersName() + " Surname: " + ur.getSurname() + " Email: "
                    + ur.getEmail() + " Password: " + ur.getPassword() + " Occupation:" + ur.getOccupation() + " Age: "
                    + ur.getAge());
        }
    }
    // TreeSet<User> list = new TreeSet<>(new OrderByEmailComparator());
}
