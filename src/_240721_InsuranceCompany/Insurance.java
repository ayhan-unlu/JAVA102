package _240721_InsuranceCompany;

import java.util.Date;

public abstract class Insurance {

    private String name;
    private double price;
    private Date startingDate;
    private Date endDate;

    public abstract void calculate();
    public abstract void addInsurance();

}
