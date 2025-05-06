package _0_Insurance_Company;

import java.util.Date;

public class ResidenceInsurance extends Insurance {
    String residenceType;

    ResidenceInsurance(String name, double price, Date startDate, Date endDate, String residenceType){
        super(name, price, startDate, endDate);
        this.residenceType = residenceType;
    }

    public String getResidenceType(){
        return residenceType;
    }

    public void setResidenceType(String residenceType){
        this.residenceType=residenceType;
    }

    @Override
    double calculate(){
        return 1.3*price;
    }
}
