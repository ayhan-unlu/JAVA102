package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public abstract class Account implements Comparable<Account> {

    enum AuthenticationStatus {SUCCESS, FAIL};

    private User user;
    private ArrayList<Insurance> insuranceList;
    AuthenticationStatus status;
    private int type;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList <Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList <Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public AuthenticationStatus getStatus() {
        return this.status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public int getType(){
        return type;
    }

    public void setType(int type){
        this.type=type;
    }

    // private ArrayList accountList;
    // private TreeSet <User> userList;

    /*
     * Account(ArrayList accountList, AuthenticationStatus authenticationStatus,
     * User user, ArrayList insuranceList) {
     * this.accountList=accountList;
     * this.authenticationStatus = authenticationStatus;
     * this.user = user;
     * this.insuranceList = insuranceList;
     * }
     */

    final void showInfo() {
        System.out.println("User Information:\n");
        System.out.println(user.getUsersName() + " " + user.getSurname() + " " + user.getEmail() + " " + user.getAge());
    }

    public void login(String email, String password) throws InvalidAuthenticationException{
        if(!(user.getEmail().equals(email)&&user.getPassword().equals(password))){
            status=AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid email or password");
        }else{
            status=AuthenticationStatus.SUCCESS;
            user.setLastLoginDate();
        }
    }

    public abstract void addAddress(IAddress address);
    public abstract void removeAddress(IAddress address);

        public boolean isLogin(){
            return status==AuthenticationStatus.SUCCESS;
        }

        public abstract void addInsurance(Insurance i);






    /*
    public final void showUserInfo() {
        System.out.println();

        System.out.println("showUserInfo");
    }
 */
    /*
     * public void createAccountList(ArrayList accountList, AuthenticationStatus
     * authenticationStatus, User user,
     * ArrayList insuranceList) {
     * accountList.add(0, user);
     * accountList.add(1, authenticationStatus);
     * accountList.add(2, insuranceList);
     * }
     */

     @Override
     public int compareTo(Account o){
         return this.hashCode()-o.hashCode();
     }
 
     @Override
     public int hashCode(){
         return Objects.hash(user);
     }

     @Override
     public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(user, account.user);

    }

    // public Account(TreeSet <User> list){
    // this.list=list;
    // }

    // User user = new User(null, null, null, null, null, 0);

    // ArrayList <Account> accounts= new ArrayList<>();

    // User u1 = new User("A1", "Surname", "a1@user.com", "1234", "Soldier", 35, new
    // ArrayList<IAddress>(), "22.07.2024")
    // User user = new User();
    // ArrayList<Insurance> insuranceList=new ArrayList<>();

    // user.getInsuranceList(); Insurance ArrayList

}
