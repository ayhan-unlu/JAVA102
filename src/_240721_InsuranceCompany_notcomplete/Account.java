package _240721_InsuranceCompany_notcomplete;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    enum AuthenticationStatus {
        SUCCESS, FAIL
    };

    private User user;
    private ArrayList<Insurance> insuranceList;
    AuthenticationStatus status;
    private int type;

    final void showInfo() {
        System.out.println("User Information:\n");
        System.out.println(user.getUsersName() + " " + user.getSurname() + " " + user.getEmail() + " " + user.getAge());
    }

    public void login(String email, String password) throws InvalidAuthenticationException {

        System.out.println("292");

        System.out.println(user.getEmail());
        System.out.println(email);
        System.out.println("293");

        if (!(user.getEmail().equals(email) && user.getPassword().equals(password))) {
            status = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid email or password");
        } else {
            status = AuthenticationStatus.SUCCESS;
            user.setLastLoginDate();
        }
    }

    public abstract void addAddress(Address address);

    public abstract void removeAddress(Address address);

    public boolean isLogin() {
        return status == AuthenticationStatus.SUCCESS;
    }


    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
    public abstract void addInsurance(Insurance i);


    public User getUser() {
        return user;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    @Override
    public int compareTo(Account o) {
        return this.hashCode() - o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Account account = (Account) obj;
        return Objects.equals(user, account.user);

    }


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

    /*
     * public final void showUserInfo() {
     * System.out.println();
     * 
     * System.out.println("showUserInfo");
     * }
     */
    /*
     * public void createAccountList(ArrayList accountList, AuthenticationStatus
     * authenticationStatus, User user,
     * ArrayList insuranceList) {
     * accountList.add(0, user);
     * accountList.add(1, authenticationStatus);
     * accountList.add(2, insuranceList);
     * }
         public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }


    public AuthenticationStatus getStatus() {
        return this.status;
    }

*/