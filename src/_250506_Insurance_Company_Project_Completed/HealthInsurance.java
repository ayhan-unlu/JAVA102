package _250506_Insurance_Company_Project_Completed;

import java.time.LocalDate;

public class HealthInsurance extends Insurance {

    public HealthInsurance(String insuranceName, double insuranceFee, LocalDate startDate, LocalDate endDate) {
        super(insuranceName, 23 * insuranceFee, startDate, endDate);
        if(account !=null){
            int accountTypeMultiplier=1;
            if(account.getClass()==Enterprise.class){
                accountTypeMultiplier = 2;
            }
            calculate(insuranceFee,accountTypeMultiplier);
        }
    }

    @Override
    public double calculate(double insuranceFee,int accountTypeMultiplier) {

        insuranceFee = 20 * insuranceFee*accountTypeMultiplier;
        return insuranceFee;
    }
}
