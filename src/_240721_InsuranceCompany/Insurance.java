package _240721_InsuranceCompany;

import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double price;
    private Date startingDate;
    private Date endDate;

    Insurance (String insuranceName, double price, Date startingDate, Date endDate ){
        this.insuranceName=insuranceName;
        this.price=price;
        this.startingDate=startingDate;
        this.endDate=endDate;
    }
    public String getInsuranceName(){
        return insuranceName;
    }
    public void setInsuranceName (String insuranceName){
        this.insuranceName=insurance 
    }

    public abstract void calculate();
    public abstract void addInsurance();

}
