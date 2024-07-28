package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.Date;

public class Individual extends Account {


  /*
   * private String insuranceName;
   * private Date startingDate;
   * private Date endDate;
   */
  private User user;

  public Individual() {
    this.setStatus(AuthenticationStatus.FAIL);
    this.setInsuranceList(new ArrayList<>());
    setType(0);
  }

  public Individual(User user) {
    this.user = user;
  }

  @Override
  public void addAddress(IAddress address){
    user.getAddressList().add(address);
  }

  @Override
  public void removeAddress(IAddress address){
    user.getAddressList().remove(address);
  }

  @Override
  public void addInsurance(Insurance i){
    User.getInsuranceList().add(i);
  }

  /*
   * Individual(ArrayList<Account> accountList, AuthenticationStatus
   * authenticationStatus, User user,
   * ArrayList<Insurance> insuranceList,
   * String insuranceName, double price, Date startingDate, Date endDate) {
   * super(accountList, authenticationStatus, user, insuranceList);
   * this.insuranceName = insuranceName;
   * this.startingDate = startingDate;
   * this.endDate = endDate;
   * }
   */
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
