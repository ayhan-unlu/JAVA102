package _240729_ChatGPT_Insurance_Homework;

import java.util.ArrayList;
import java.util.Date;

// Address arayüzü
interface Address {
    String getAddressDetails();
}

// HomeAddress sınıfı
class HomeAddress implements Address {
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressDetails() {
        return "Home Address: " + address;
    }
}

// BusinessAddress sınıfı
class BusinessAddress implements Address {
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressDetails() {
        return "Business Address: " + address;
    }
}
