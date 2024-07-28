package _240721_InsuranceCompany;

import java.util.Date;

public class HealthInsurance extends Insurance{

    HealthInsurance(String insuranceName,double insurancePrice, Date insuranceDate,User user){
        super(insuranceName,insurancePrice,insuranceDate,user);
    }
    
    @Override
    public double calculate(double insurancePrice){
        System.out.println("Annual Health Insurance Plan costs : "+insurancePrice*12*0.90);
        return insurancePrice*12*0.90;
    }

//    @Override
  //  public void addInsurance(){
        
    //}

}
