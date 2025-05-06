package _250506_Insurance_Company_Project_Completed;

public class BusinessAddress implements Address {
    private Object addressType = null;
    private addressType BUSINESS;
    private String addressBlock;
    private String city;
    private String zipCode;
    private String country;

    public BusinessAddress(addressType BUSINESS, String addressBlock, String city, String zipCode, String country) {
        this.addressType = addressType;
        this.addressBlock = addressBlock;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public addressType getAddressType() {
        return Address.addressType.BUSINESS;
    }

    public void setAddressType(addressType BUSINESS) {
        this.addressType = BUSINESS;
    }

    public String getAddressBlock() {
        return addressBlock;
    }

    public void setAddressBlock(String addressBlock) {
        this.addressBlock = addressBlock;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean addAddress() {
        return false;
    }

    @Override
    public boolean removeAddress() {
        return false;
    }


}
