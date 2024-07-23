package _240721_InsuranceCompany;

public class BusinessAddress implements IAddress{

    private String homeAddress;
    private String businessAddress;

    BusinessAddress(String homeAddress,String businessAddress){
        this.homeAddress=homeAddress;
        this.businessAddress=businessAddress;
    }

    @Override
    public void addAddress(String address){

    }
    @Override
    public void deleteAddress(String address){
        
    }

}
