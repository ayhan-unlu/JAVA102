package _240717_Homework_BookSorter;

import java.util.Comparator;

public class OrderByPageNumberComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1,Book o2){
        return o1.getPageNumber()-o2.getPageNumber();
    }

}
