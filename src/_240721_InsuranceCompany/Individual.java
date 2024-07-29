package _240721_InsuranceCompany;

import java.util.ArrayList;

public class Individual extends Account {
  private User user;

  public Individual() {
    this.setStatus(AuthenticationStatus.FAIL);
    this.setInsuranceList(new ArrayList<>());
    setType(0);
  }

  public Individual(User user) {
    System.out.println("15");
    this.user = user;
    System.out.println("16");
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

}
