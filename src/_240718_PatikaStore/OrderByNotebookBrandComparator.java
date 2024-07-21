package _240718_PatikaStore;

import java.util.Comparator;

public class OrderByNotebookBrandComparator implements Comparator<Notebook>{

    @Override 
    public int compare(Notebook o1,Notebook o2){
        return o1.getNotebookBrand().compareTo(o2.getNotebookBrand());
    }

}
