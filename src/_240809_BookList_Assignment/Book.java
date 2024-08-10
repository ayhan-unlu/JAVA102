package _240809_BookList_Assignment;

import java.util.ArrayList;

public class Book {

    String name;
    int pageNumber;
    String author;
    int publicationDate;

    Book(String name, int pageNumber, String author, int publicationDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }



    // bookList={book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};
    // bookList[0]=book1;
    // bookList[1]=book2;
    // bookList[2]=book3;

}
