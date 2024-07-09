package _221227_Encapsulation;

//Encapsulation
//Inheritance
//Polimorphism
//Abstraction
public class MainEncapsulation {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord of the Rings", -100);
        // lordOfTheRings.pageNumber=-1000;
        lordOfTheRings.setPageNumber(-1000);
        System.out.println(harryPotter.getBookName());
        System.out.println(lordOfTheRings.getPageNumber());

        System.out.println(lordOfTheRings.getBookName());

        lordOfTheRings.setBookName("ABC");
        System.out.println(lordOfTheRings.getBookName());
    }
}
