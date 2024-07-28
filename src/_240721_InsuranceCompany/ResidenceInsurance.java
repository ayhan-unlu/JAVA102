package _240721_InsuranceCompany;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

    ResidenceInsurance(String insuranceName, double insurancePrice,Date insuranceDate, User user){
        super(insuranceName, insurancePrice, insuranceDate,user);
    }

    @Override
    public double  calculate(double insurancePrice){
        System.out.println("Annual Residental Insurance Plan costs : "+insurancePrice*12*0.95);
        return insurancePrice*12*0.95;
    }

//    @Override
  //  public void addInsurance(){
        
    //}
}
