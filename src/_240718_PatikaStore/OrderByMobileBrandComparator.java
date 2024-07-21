package _240718_PatikaStore;

import java.util.Comparator;

public class OrderByMobileBrandComparator implements Comparator<Mobile>{

    @Override
    public int compare(Mobile o1,Mobile o2){
        return o1.getMobileBrand().compareTo(o2.getMobileBrand());
    }

}
