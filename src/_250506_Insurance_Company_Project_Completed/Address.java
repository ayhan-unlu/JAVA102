package _250506_Insurance_Company_Project_Completed;

public interface Address {
    enum addressType {HOME, BUSINESS}

    String addressBlock = "";
    String city = "";
    String zipCode = "";
    String country = "";


    addressType getAddressType();

    String getAddressBlock();

    String getCity();

    String getZipCode();

    String getCountry();

    boolean addAddress();

    boolean removeAddress();
}
