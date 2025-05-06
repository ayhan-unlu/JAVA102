package _250407_Insurance_Company_Project.Account;

import _250407_Insurance_Company_Project.Address.Address;
import _250407_Insurance_Company_Project.Address.AddressManager;
import _250407_Insurance_Company_Project.Insurance.Insurance;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public abstract class Account implements Comparable{
    //AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceList;
    //String inputEmail;
    //String inputPassword;


    public Account(/*AuthenticationStatus authenticationStatus, */User user/*, ArrayList<Insurance> insuranceList*/) {
        //this.authenticationStatus = authenticationStatus;
        this.user = user;
        insuranceList = new ArrayList<>();
    }
/*
    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }
*/
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList(){
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList){
        this.insuranceList = insuranceList;
    }

  /*  public String getInputEmail(){
        return inputEmail;
    }

    public void setInputEmail(String inputEmail){
        this.inputEmail=inputEmail;
    }

    public String getInputPassword(){
        return inputPassword;
    }

    public void setInputPassword(String inputPassword){
        this.inputPassword = inputPassword;
    }

   public Account() {
    }


    public AuthenticationStatus login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TO LOGIN");
        System.out.println("Please Enter The Email Address");
        inputEmail = scanner.nextLine();
        System.out.println("Please Enter The Password");
        inputPassword = scanner.nextLine();


        scanner.close();
        if ((inputEmail.equals("a")) && (inputPassword.equals("a"))) {
            System.out.println(inputEmail + ", " + inputPassword + " <--> a,a");

            authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            System.out.println(inputEmail + ", " + inputPassword + " <-X-> a,a");
            authenticationStatus = AuthenticationStatus.FAIL;
        }
        System.out.println(authenticationStatus);

        return authenticationStatus;
    }

 //   TreeSet<Account> accountTreeSet = new TreeSet<Account>();
*/
    public final void showUserInfo(/*User user*/) {
        System.out.println("User Information");
  //      System.out.println(user.getFirstName() + " " + user.getLastName() + " ");
        System.out.println(user.toString());
    }

    public void addAddress(Address a){
        AddressManager.addAddress(a,user);
    }

    public void removeAddress(Address a){
        _250407_Insurance_Company_Project.Address.AddressManager.removeAddress(a,user);
    }

    public Account loginUser(String email, String password){
        if(this.user.getEmail().equals(email)&&this.user.getPassword().equals(password)){
            return this;
        }else return null;
    }

    public abstract void addInsurance();

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if(user == null) {
            if (other.user != null)
                return false;
        }else if(!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        final int prime =30;
        int result = 1;
        result = prime *result +((user == null)?0:user.hashCode());
        return result;
    }

    @Override
    public int compareTo(Object obj){
        if (obj instanceof Account){
            Account compAcc = (Account) obj;
            return this.getUser().getFirstName().compareTo(compAcc.getUser().getFirstName())==0? this.getUser().getLastName().compareTo(compAcc.getUser().getLastName()):this.getUser().getFirstName().compareTo(compAcc.getUser().getFirstName());
        }
        return -1;
    }
}
