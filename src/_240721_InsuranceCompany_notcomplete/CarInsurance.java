package _240721_InsuranceCompany_notcomplete;

import java.util.Date;

public class CarInsurance extends Insurance {

    CarInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }

    @Override
    public double calculate(double insurancePrice) {
        System.out.println("Annual Car Insurance Plan costs : "+ insurancePrice*12*0.90);
        return insurancePrice*12*0.90;
    }


//    @Override
  //  public void addInsurance() {

    //}

}
