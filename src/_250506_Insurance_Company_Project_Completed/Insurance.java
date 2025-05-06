package _250506_Insurance_Company_Project_Completed;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Insurance {
    Account account;
    private String insuranceName;
    private double insuranceFee;
    private int accountTypeMultiplier=1;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Insurance> insuranceList = new ArrayList<>(4);

    public Insurance(String insuranceName, double insuranceFee, LocalDate startDate, LocalDate endDate) {
        this.insuranceName = insuranceName;
        this.insuranceFee = insuranceFee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public int getAccountTypeMultiplier(){return accountTypeMultiplier;}

    public void setAccountTypeMultiplier(int accountTypeMultiplier){
        this.accountTypeMultiplier= accountTypeMultiplier;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public abstract double calculate(double insuranceFee,int accountTypeMultiplier);
}
