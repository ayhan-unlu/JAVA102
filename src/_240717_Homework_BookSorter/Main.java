package _240717_Homework_BookSorter;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        TreeSet<Book> bookSet=new TreeSet<>(new OrderByBookNameComparator());

        bookSet.add(new Book("Afterlives", 275,"Abdulrazak Gurnah",2021));
        bookSet.add(new Book("Dokuzuncu Hariciye Koğuşu", 10, "Peyami Safa", 1980));
        bookSet.add(new Book("Yaban", 250, "Yakup Kadri Karaosmanoğlu", 1970));
        bookSet.add(new Book("Kaşağı", 150, "Ömer Seyfettin", 1985));
        bookSet.add(new Book("Simyacı", 130, "Paulo Coelho", 1990));

        System.out.println("Order By Book Name");
        System.out.println("###################");
        for(Book b:bookSet){
            System.out.println("BookName: "+b.getBookName()+", \t AuthorName: "+b.getAuthorName()+", \t PageNumber: "+b.getPageNumber()+", \t PublishDate: "+b.getPublishDate());
        }

        TreeSet <Book> bookSet2=new TreeSet<>(new OrderByPageNumberComparator());
        bookSet2.addAll(bookSet);
        System.out.println("Order By Page Number");
        System.out.println("###################");
        for (Book b : bookSet2) {
            System.out.println("BookName: "+b.getBookName()+", AuthorName: "+b.getAuthorName()+", PageNumber: "+b.getPageNumber()+", PublishDate: "+b.getPublishDate());
        }

    }

}
