package _250407_Insurance_Company_Project.Address;

public class BusinessAddress implements Address {
    String businessAddress;

     BusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getAddress() {
        return businessAddress;
    }

    public void setAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }
}
