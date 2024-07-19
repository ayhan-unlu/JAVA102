package _240718_PatikaStore;

import java.util.TreeSet;

public class Mobile {

    private String açıklama = "    Features of Mobile Phone products:";
    private int mobileId;
    private int price;
    private int discountRate;
    private int stockAmount;
    private String mobileName;
    private String mobileBrand;
    private int phoneMemory;// Phone memory information (128 GB, 64 GB)
    private double screenSize;// (6.1 Inc)
    private int batteryPower;// (4000)
    private int RAM;// (6MB)
    private String color;// (Black,Red,Blue)

    Mobile(int mobileId, int price, int discountRate, int stockAmount, String mobileName, String mobileBrand,
            int phoneMemory, double screenSize, int batteryPower, int RAM, String color) {
        this.mobileId = mobileId;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.mobileName = mobileName;
        this.mobileBrand = mobileBrand;
        this.phoneMemory = phoneMemory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.RAM = RAM;
        this.color = color;
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(int phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printMobileFullList(TreeSet<Mobile> mobileList) {

        System.out.println("Mobile List\n");

        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.format("| %2s | %-22s | %9s | %13s | %12s | %-7s | %12s | %11s | %13s | %3s | %-5s |", "Id",
                "Name",
                "Price", "Discount Rate", "Stock Amount", "Brand", "Phone Memory", "Screen Size",
                "Battery Power",
                "RAM", "Color");
        System.out.println();
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        for (Mobile mobileId : mobileList) {
            System.out.format(
                    "| %2s | %-22s | %9s | %13s | %12s | %-7s | %12s | %11s | %13s | %3s | %-5s |",
                    mobileId.getMobileId(), mobileId.getMobileName(), mobileId.getPrice() + ".0 TL",
                    mobileId.getDiscountRate(), mobileId.getStockAmount(),
                    mobileId.getMobileBrand(),
                    mobileId.getPhoneMemory(), mobileId.getScreenSize(), mobileId.getBatteryPower(),
                    mobileId.getRAM(),
                    mobileId.getColor());
            System.out.println();
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

}
