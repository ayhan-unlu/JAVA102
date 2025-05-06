package _0_Insurance_Company;

import java.util.Date;

public class CarInsurance extends Insurance {

    String carBrand;

    CarInsurance(String name, double price, Date startDate, Date endDate, String carBrand) {
        super(name, price, startDate, endDate);
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    double calculate() {
        return 1.1 * price;
    }
}
