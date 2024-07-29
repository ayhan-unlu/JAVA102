package _240718_PatikaStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Notebook {

    private int notebookId;
    private int price;
    private int discountRate;
    private int stockAmount;
    private String notebookName;
    private String notebookBrand;
    private int RAM;// (8GB)
    private int storage;// (512 SSDs)
    private double screenSize;// (14 inches)

    Notebook(int notebookId, int price, int discountRate, int stockAmount, String notebookName, String notebookBrand,
            int RAM, int storage, double screenSize) {
        this.notebookId = notebookId;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.notebookName = notebookName;
        this.notebookBrand = notebookBrand;
        this.RAM = RAM;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(int notebookId) {
        this.notebookId = notebookId;
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

    public String getNotebookName() {
        return notebookName;
    }

    public void setNotebookName(String notebookName) {
        this.notebookName = notebookName;
    }

    public String getNotebookBrand() {
        return notebookBrand;
    }

    public void setNotebookBrand(String notebookBrand) {
        this.notebookBrand = notebookBrand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void addPresetNotebooks(ArrayList<Notebook> notebookList) {

        notebookList.add(new Notebook(1, 7000, 0, 1, "HUAWEI Matebook 14", "Huawei", 16, 512, 14.0));
        notebookList.add(new Notebook(2, 3699, 0, 1, "LENOVO V14 IGL", "Lenovo", 8, 1024, 14.0));
        notebookList.add(new Notebook(3, 8199, 0, 1, "ASUS Tuf Gaming", "Asus", 32, 2048, 15.6));

    }

    public void printNotebookListById(ArrayList<Notebook> notebookList) {
        System.out.println("Notebook List by Id\n");
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
        if (notebookList.size() == 0) {
            System.out.println(" No notebook left in the list");
        }
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------\n");

    }

    public void printNotebookListByBrand(ArrayList<Notebook> notebookList) {
        TreeSet<Notebook> newNotebookList = convertNotebookListToBrandOrderedList(notebookList);
        System.out.println("Notebook List by Brand\n");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------\n");
        System.out.format("| %-18s | %2s | %9s | %13s | %12s | %-6s | %3s | %7s | %11s |", "Name", "Id",
                "Price",
                "Discount Rate",
                "Stock Amount", "Brand", "RAM", "Storage", "Screen Size");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------\n");
        for (Notebook notebookId : newNotebookList) {
            System.out.format("| %-18s | %2s | %9s | %13s | %12s | %-6s | %3s | %7s | %11s |",
                    notebookId.getNotebookName(), notebookId.getNotebookId(), notebookId.getPrice() + ".0 TL",
                    notebookId.getDiscountRate(),
                    notebookId.getStockAmount(),
                    notebookId.getNotebookBrand(), notebookId.getRAM(),
                    notebookId.getStorage(), notebookId.getScreenSize());
            System.out.println();
        }
        if (notebookList.size() == 0) {
            System.out.println(" No notebook left in the list");
        }
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------\n");

    }

    public TreeSet<Notebook> convertNotebookListToBrandOrderedList(ArrayList<Notebook> notebookList) {
        TreeSet<Notebook> newNotebookList = new TreeSet<>(new OrderByNotebookBrandComparator());
        for (Notebook n : notebookList) {
            newNotebookList.add(n);

        }

        return newNotebookList;
    }

    public void deleteNotebook(int notebookId, ArrayList<Notebook> notebookList) {

        Iterator<Notebook> iter = notebookList.iterator();

        while (iter.hasNext()) {
            Notebook n = iter.next();

            if (n.getNotebookId() == notebookId) {
                iter.remove();
            }
        }
    }

    public void addNotebook(ArrayList<Notebook> notebookList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the information about the Notebook you want to add: ");

        System.out.print("Price: ");
        int price = scan.nextInt();
        System.out.print("Discount Rate: ");
        int discountRate = scan.nextInt();
        System.out.print("Stock Amount: ");
        int stockAmount = scan.nextInt();
        System.out.print("Notebook Name: ");
        String notebookName = scan.nextLine();
        System.out.print("Notebook Brand: ");
        String notebookBrand = scan.nextLine();
        System.out.print(" RAM: ");
        int RAM = scan.nextInt();
        System.out.print(" Storage: ");
        int storage = scan.nextInt();
        System.out.print(" Screen Size: ");
        double screenSize = scan.nextDouble();
        notebookList.add(new Notebook(notebookList.size() + 1, price, discountRate, stockAmount, notebookName,
                notebookBrand, RAM,
                storage, screenSize));
        scan.close();
    }

}
