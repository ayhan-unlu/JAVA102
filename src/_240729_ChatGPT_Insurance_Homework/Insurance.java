package _240729_ChatGPT_Insurance_Homework;

import java.util.Date;

abstract class Insurance {
    private String name;
    private double fee;
    private Date startDate;
    private Date endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Insurance(String name, double fee, Date startDate, Date endDate) {
        this.name = name;
        this.fee = fee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract double calculate();

    // Getters and Setters
}

// HealthInsurance sınıfı
class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Health insurance calculation logic
        return getFee() * 1.1; // Example calculation
    }
}

// ResidenceInsurance sınıfı
class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Residence insurance calculation logic
        return getFee() * 1.2; // Example calculation
    }
}

// TravelInsurance sınıfı
class TravelInsurance extends Insurance {
    public TravelInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Travel insurance calculation logic
        return getFee() * 1.15; // Example calculation
    }
}

// CarInsurance sınıfı
class CarInsurance extends Insurance {
    public CarInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Car insurance calculation logic
        return getFee() * 1.25; // Example calculation
    }
}
