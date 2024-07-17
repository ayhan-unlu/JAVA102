package _240716_Map.Tree_Map;

import java.util.Comparator;

public class OrderByNoComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1,Integer o2){
        return o1-o2;
    }


}
