package _240721_InsuranceCompany_notcomplete;

import java.util.ArrayList;

public class Enterprise extends Account {

    private User user;

    public Enterprise() {
        this.setStatus(AuthenticationStatus.FAIL);
        this.setInsuranceList(new ArrayList<>());
        setType(1);
    }

    public Enterprise(User user){
        this();
        this.user=user;
    }

    @Override
    public void addAddress(Address address){
        user.getAddressList().add(address);
    }

    @Override
    public void removeAddress(Address address){
        user.getAddressList().remove(address);
    }

    @Override
    public void addInsurance(Insurance i){
        User.getInsuranceList().add(i);
    }

    /*
     * @Override
     * public void calculate(){
     * 
     * }
     * 
     * @Override
     * public void addInsurance(){
     * 
     * }
     */
}