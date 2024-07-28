package _240721_InsuranceCompany;

import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDate;
    private final User user;

    public Insurance(String insuranceName, double insurancePrice, Date insuranceDate, User user){
        this.insuranceName=insuranceName;
        this.insurancePrice=insurancePrice;
        this.insuranceDate=insuranceDate;
        this.user=user;
    }

    public String getInsuranceName() {
        return this.insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePrice() {
        return this.insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceDate() {
        return this.insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public User getUser() {
        return this.user;
    }
/* because it is final 
    public void setUser(User user) {
        this.user = user;
    }
 */
    public abstract double calculate(double insurancePrice);

//    public abstract void addInsurance();

}
