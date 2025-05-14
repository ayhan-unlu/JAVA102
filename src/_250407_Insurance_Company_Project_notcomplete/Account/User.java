package _250407_Insurance_Company_Project_notcomplete.Account;

import _250407_Insurance_Company_Project_notcomplete.Address.Address;

import java.util.ArrayList;
import java.util.Date;

public class User /*extends Account*/{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private ArrayList<Address> addressList;
    private Date lastLoginDate;

    public User(){
    }

    public User(String firstName, String lastName, String email, String password, String occupation, int age/*, ArrayList<Address> addressList, Date lastLoginDate*/) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        addressList = new ArrayList<>();
        this.lastLoginDate = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString(){
        return "User : First Name : "+firstName+" Last Name: "+lastName+" Email: " +email+" Password: "+password+" Occupation: "+occupation+" Age: "+ age+" AddressList: "+ addressList+" Last Login Date: "+ lastLoginDate;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof User){
            User compare = (User) obj;
            return this.firstName.equals(compare.firstName) &&
                    this.lastName.equals(compare.lastName) &&
                    this.email.equals(compare.email) &&
                    this.password.equals(compare.password) &&
                    this.occupation.equals(compare.occupation)&&
                    this.age == compare.age;
        }
        return false;
    }
}
