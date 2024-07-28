package _240721_InsuranceCompany;

import java.util.Date;

public class TravelInsurance extends Insurance{

    TravelInsurance(String insuranceName,double insurancePrice, Date insuranceDate, User user){
        super(insuranceName,insurancePrice,insuranceDate,user);
    }

    @Override
    public double calculate(double insurancePrice){

        System.out.println("3-Month long Travel Insurance costs : "+insurancePrice*3);
        return insurancePrice*3*0.99;

    }
//@Override
  //  public void addInsurance(){
        
    //}
}
