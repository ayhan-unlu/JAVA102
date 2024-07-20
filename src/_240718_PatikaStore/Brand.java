package _240718_PatikaStore;

import java.util.TreeSet;

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

    public void printBrandFullList(TreeSet<Brand> brandList){
        System.out.format("%8s", "Brands");
        System.out.println();
        for (Brand brandId : brandList) {
                System.out.println(brandId.getBrandName());
        }

    }
public void addPresetBrands(TreeSet<Brand> brandList){

    brandList.add(new Brand(1, "Samsung"));
    brandList.add(new Brand(2, "Lenovo"));
    brandList.add(new Brand(3, "Apple"));
    brandList.add(new Brand(4, "Huawei"));
    brandList.add(new Brand(5, "Casper"));
    brandList.add(new Brand(6, "Asus"));
    brandList.add(new Brand(7, "HP"));
    brandList.add(new Brand(8, "Xiaomi"));
    brandList.add(new Brand(9, "Monster"));

}

}
