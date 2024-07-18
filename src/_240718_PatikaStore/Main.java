package _240718_PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import _240717_Homework_BookSorter.OrderByBookNameComparator;

public class Main {

    public static void main(String[] args) {

        TreeSet<Brand> brandList = new TreeSet<>(new OrderByBrandNameComparator());

        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "HP"));
        brandList.add(new Brand(8, "Xiaomi"));
        brandList.add(new Brand(9, "Monster"));

        for (Brand brandId : brandList) {
            System.out.println(brandId.getBrandName());
        }

        System.out.println();
        System.out.println("#############################################");
        System.out.println();

        TreeSet<Notebook> notebookList = new TreeSet<>(new OrderByNotebookIdComparator());

        notebookList.add(new Notebook(1, 7000, 0, 1, "HUAWEI Matebook 14", "Huawei", 16, 512, 14.0));
        notebookList.add(new Notebook(2, 3699, 0, 1, "LENOVO V14 IGL", "Lenovo", 8, 1024, 14.0));
        notebookList.add(new Notebook(3, 8199, 0, 1, "ASUS Tuf Gaming", "Asus", 32, 2048, 15.6));

        for (Notebook notebookId : notebookList) {
            System.out.println(notebookId.getNotebookName());
        }

        
        System.out.println();
        System.out.println("#############################################");
        System.out.println();

        TreeSet<Mobile> mobileList = new TreeSet<>(new OrderByMobileIdComparator());
        mobileList.add(new Mobile(1, 3199, 0, 1, "SAMSUNG GALAXY A51", "Samsung", 128, 6.5, 4000, 6, "Black"));
        mobileList.add(new Mobile(2, 7379, 0, 1, "iPhone 11 64 GB", "Apple", 64, 6.1, 3046, 6, "Blue"));
        mobileList.add(new Mobile(3, 4012, 0, 1, "Redmi Note 10 Pro 8GB", "Xiaomi", 128, 6.5, 4000, 12, "White"));

        for (Mobile mobileId : mobileList) {
            System.out.println(mobileId.getMobileName());
        }

    }

}
