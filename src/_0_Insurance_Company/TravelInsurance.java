package _0_Insurance_Company;

import java.util.Date;

public class TravelInsurance extends Insurance {
    String travelType;

    TravelInsurance(String name, double price, Date startDate, Date endDate, String travelType){
        super(name, price, startDate, endDate);
        this.travelType = travelType;
    }

    public String getTravelType(){
        return travelType;
    }

    public void setTravelType(String travelType){
        this.travelType=travelType;
    }

    @Override
    double calculate(){
        return 1.3*price;
    }
}
