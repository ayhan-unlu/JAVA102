package _240718_PatikaStore;

import java.util.Comparator;

public class OrderByMobileIdComparator implements Comparator<Mobile>{

    @Override

    public int compare (Mobile o1, Mobile o2){
        return o1.getMobileId()-o2.getMobileId();
    }

}
