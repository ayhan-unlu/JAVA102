package _240718_PatikaStore;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

        public static void main(String[] args) {

                TreeSet<Brand> brandList = new TreeSet<>(new OrderByBrandNameComparator());
                Brand b = new Brand(0, null);
                b.addPresetBrands(brandList);
                

                ArrayList<Notebook> notebookList = new ArrayList<>();
                Notebook n = new Notebook(0, 0, 0, 0, null, null, 0, 0, 0);
                n.addPresetNotebooks(notebookList);

                ArrayList<Mobile> mobileList = new ArrayList<>();
                Mobile m = new Mobile(0, 0, 0, 0, null, null, 0, 0, 0, 0, null);
                m.addPresetMobiles(mobileList);

                Menu menu = new Menu();
                menu.runMainMenu(b,brandList,n,notebookList,m,mobileList);

        }
}