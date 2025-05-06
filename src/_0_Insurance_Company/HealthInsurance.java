package _0_Insurance_Company;

import java.util.Date;

public class HealthInsurance extends Insurance {
    String healthInsuranceType;

    HealthInsurance(String name, double price, Date startDate, Date endDate, String healthInsuranceType) {
        super(name, price, startDate, endDate);
        this.healthInsuranceType = healthInsuranceType;
    }

    public String getHealthInsuranceType(){
        return healthInsuranceType;
    }

    public void setHealthInsuranceType(String healthInsuranceType){
        this.healthInsuranceType=healthInsuranceType;
    }

    @Override
    double calculate(){
        return 1.2*price;
    }

}
