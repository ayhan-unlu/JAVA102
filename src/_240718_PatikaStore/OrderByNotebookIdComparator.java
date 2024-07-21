package _240718_PatikaStore;

import java.util.Comparator;

public class OrderByNotebookIdComparator implements Comparator <Notebook>{
    @Override
    public int compare(Notebook o1,Notebook o2){
        return o1.getNotebookId()-o2.getNotebookId();
    }

}