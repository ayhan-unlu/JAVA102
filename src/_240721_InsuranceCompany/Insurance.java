package _240721_InsuranceCompany;

import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double price;
    private Date startingDate;
    private Date endDate;

<<<<<<< HEAD
    Insurance(String insuranceName, double price, Date startingDate, Date endDate){
=======
    Insurance (String insuranceName, double price, Date startingDate, Date endDate ){
>>>>>>> ea653ed14aa5f6a4b2dc405a0b5ec99c0fab769a
        this.insuranceName=insuranceName;
        this.price=price;
        this.startingDate=startingDate;
        this.endDate=endDate;
    }
<<<<<<< HEAD

    public String getInsuranceName(){
        return this.insuranceName;
    }
    public void setInsuranceName(String insuranceName){
        this.insuranceName=insuranceName;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public Date getStartingDate(){
        return this.startingDate;
    }
    public void setStartingDate(Date startingDate){
        this.startingDate=startingDate;
    }

    public Date getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Date endDate){
        this.endDate=endDate;
    }
    
=======
    public String getInsuranceName(){
        return insuranceName;
    }
    public void setInsuranceName (String insuranceName){
        this.insuranceName=insurance 
    }

>>>>>>> ea653ed14aa5f6a4b2dc405a0b5ec99c0fab769a
    public abstract void calculate();
    public abstract void addInsurance();

}
