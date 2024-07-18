package _240718_PatikaStore;

public class Brand {

    private int brandId;
    private String brandName;

    Brand (int brandId,String brandName){
        this.brandId=brandId;
        this.brandName=brandName;
    }

    public int getBrandId(){
        return brandId;
    }
    public void setBrandId(int brandId){
        this.brandId=brandId;
    }

    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }



}
