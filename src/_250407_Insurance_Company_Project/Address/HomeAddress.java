package _250407_Insurance_Company_Project.Address;

public class HomeAddress implements Address {
    String homeAddress;

    HomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;

    }

    public String getAddress(){
        return homeAddress;
    }

    public void setAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }


}
