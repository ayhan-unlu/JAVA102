package _250407_Insurance_Company_Project.Insurance;

import java.util.Date;

public abstract class Insurance {
    String name;
    double price;
    Date startDate;
    Date endDate;

    Insurance(String name, double price, Date startDate, Date endDate){
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    abstract double calculate();

}
