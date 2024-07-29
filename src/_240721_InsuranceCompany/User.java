package _240721_InsuranceCompany;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {
    private final ArrayList<Address> addressList;
    static private final ArrayList<Insurance> insuranceList = new ArrayList<>();
    private String usersName;
    private String surname;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private Date lastLoginDate;

    User(String usersName, String surname, String email, String password, String occupation,
            int age) {
        this.addressList = new ArrayList<Address>();
        this.usersName = usersName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        lastLoginDate=new Date();
        lastLoginDate=Date.from(Instant.now());
    }

    public ArrayList<Address> getAddressList(){
        return addressList;
    }
/* because it is final 
    public void setAddressList(ArrayList<IAddress> addressList){
        this.addressList=addressList;
    }
 */
    public static ArrayList<Insurance> getInsuranceList(){
        return insuranceList;
    }

    

   /* cause final and also static
   public static  void setInsuranceList(ArrayList<Insurance> insuranceList){
        this.insuranceList=insuranceList;
    } */

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
        return email;
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

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate() {
        this.lastLoginDate = lastLoginDate;
    }

    public void addUsersToList(ArrayList<User> userList, User u) {
        userList.add(u);
    }

    public void printUserList(ArrayList<User> userList) {

        for (User ur : userList) {

            System.out.println();

            System.out.println("User's Name: " + ur.getUsersName() + " Surname: " + ur.getSurname() + " Email: "
                    + ur.getEmail() + " Password: " + ur.getPassword() + " Occupation:" + ur.getOccupation() + " Age: "
                    + ur.getAge());
        }
    }
    // TreeSet<User> list = new TreeSet<>(new OrderByEmailComparator());
}
