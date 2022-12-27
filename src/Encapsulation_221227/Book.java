package Encapsulation_221227;

public class Book {
    private String bookName;
    private int pageNumber;

    public Book(String bookName, int pageNumber) {
        this.bookName = bookName;
        if (pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber = pageNumber;
    }

    public int getPageNumber(){
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber){
        if (pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber = pageNumber;
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
}
