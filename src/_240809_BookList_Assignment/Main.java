package _240809_BookList_Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", 281, "Harper Lee", 1960);
        Book book2 = new Book("1984", 328, "George Orwell", 1949);
        Book book3 = new Book("Pride and Prejudice", 279, "Jane Austen", 1813);
        Book book4 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 1925);
        Book book5 = new Book("Moby-Dick", 585, "Herman Melville", 1851);
        Book book6 = new Book("War and Peace", 1225, "Leo Tolstoy", 1869);
        Book book7 = new Book("The Catcher in the Rye", 214, "J.D. Salinger", 1951);
        Book book8 = new Book("Brave New World", 268, "Huxley", 1932);
        Book book9 = new Book("Jane Eyre", 500, "Charlotte Brontë", 1847);
        Book book10 = new Book("The Hobbit", 310, "J.R.R. Tolkien", 1937);

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        HashMap<String, String> mapList = new HashMap<>(10);
        HashMap<String, String> mapList1 = new HashMap<>(10);

        for (int i = 0; i < 10; i++) {
            mapList.put(bookList.get(i).getName(), bookList.get(i).getAuthor());
        }
System.out.println("\nMap List with 'for'\n*****************************************************" );
        for (String key : mapList.keySet()) {
            System.out.println( key + "  ***  " + mapList.get(key));
        }
        System.out.println("\nMap List with stream Api and lambda \n*****************************************************" );
        bookList.stream().forEach(i -> mapList1.put(i.getName(), i.getAuthor()));

        System.out.println("Map List 1: " + mapList1);

        System.out.println("\nBooks which have 300+ pages\n*****************************************************" );
        bookList.stream().filter(i -> i.getPageNumber() > 300)
                .forEach(i -> System.out.println("Book Name: " + i.name + " - Page Number: " + i.pageNumber
                        + " - Author: " + i.author + " - Publication Date: " + i.publicationDate));


    }
}
