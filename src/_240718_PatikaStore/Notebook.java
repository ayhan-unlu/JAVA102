package _240718_PatikaStore;

import java.util.TreeSet;

public class Notebook {

    private int notebookId;
    private int price;
    private int discountRate;
    private int stockAmount;
    private String notebookName;
    private String notebookBrand;
    private int RAM;//(8GB) 
    private int storage;//(512 SSDs) 
    private double screenSize;// (14 inches)

    Notebook(int notebookId,int price,int discountRate,int stockAmount,String notebookName,String notebookBrand,int RAM,int storage,double screenSize){
        this.notebookId=notebookId;
        this.price=price;
        this.discountRate=discountRate;
        this.stockAmount=stockAmount;
        this.notebookName=notebookName;
        this.notebookBrand=notebookBrand;
        this.RAM=RAM;
        this.storage=storage;
        this.screenSize=screenSize;
    }

    public int getNotebookId(){
        return notebookId;
    }
    public void setNotebookId(int notebookId){
        this.notebookId=notebookId;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public int getDiscountRate(){
        return discountRate;
    }
    public void setDiscountRate(int discountRate){
        this.discountRate=discountRate;
    }

    public int getStockAmount(){
        return stockAmount;
    }
    public void setStockAmount(int stockAmount){
        this.stockAmount=stockAmount;
    }

    public String getNotebookName(){
        return notebookName;
    }
    public void setNotebookName(String notebookName){
        this.notebookName=notebookName;
    }

    public String getNotebookBrand(){
        return notebookBrand;
    }
    public void setNotebookBrand(String notebookBrand){
        this.notebookBrand=notebookBrand;
    }

    public int getRAM(){
        return RAM;
    }
    public void setRAM(int RAM){
        this.RAM=RAM;
    }

    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage=storage;
    }

    public double getScreenSize(){
        return screenSize;
    }
    public void setScreenSize(double screenSize){
        this.screenSize=screenSize;
    }

    public void printAllNotebookList(TreeSet<Notebook> notebookList){
        System.out.println("Notebook List\n");
        System.out.println(
                        "--------------------------------------------------------------------------------------------------------------\n");
        System.out.format("| %2s | %-18s | %9s | %13s | %12s | %-6s | %3s | %7s | %11s |", "ID", "Name",
                        "Price",
                        "Discount Rate",
                        "Stock Amount", "Brand", "RAM", "Storage", "Screen Size");
        System.out.println();
        System.out.println(
                        "--------------------------------------------------------------------------------------------------------------\n");
        for (Notebook notebookId : notebookList) {
                System.out.format("| %2s | %-18s | %9s | %13s | %12s | %-6s | %3s | %7s | %11s |",
                                notebookId.getNotebookId(),
                                notebookId.getNotebookName(), notebookId.getPrice() + ".0 TL",
                                notebookId.getDiscountRate(),
                                notebookId.getStockAmount(),
                                notebookId.getNotebookBrand(), notebookId.getRAM(),
                                notebookId.getStorage(), notebookId.getScreenSize());
                System.out.println();
        }
        System.out.println(
                        "--------------------------------------------------------------------------------------------------------------\n");


    }
}
