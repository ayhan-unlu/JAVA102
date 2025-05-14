package _250407_Insurance_Company_Project_notcomplete.Address;

public abstract class HomeAddress implements Address {

    int id;
    String address;
    String city;
    String zipCode;
    String type;

    public HomeAddress (int id, String address, String city, String zipCode, String type){
        this.id=id;
        this.address=address;
        this.city=city;
        this.zipCode=zipCode;
        this.type=type;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getZipCode(){
        return zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }





}
