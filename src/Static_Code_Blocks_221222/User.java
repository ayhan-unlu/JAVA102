package Static_Code_Blocks_221222;

/**
 * User
 */
public class User {

    public String name;
    public static int counter = 0;

    static {
        System.out.println("2. Static Code Block Star ted running!");

        int randomNumber = (int) (Math.random() * 10);
        System.out.println("3. Random Number created!");
        System.out.println("The Random Number : "+randomNumber);
        counter=randomNumber;
    }

    public User(String name) {
        this.name = name;
        System.out.println("4. Constructor method is executed!");
        System.out.println("5. Counter : "+counter);
        counter++;

    }

    static {
        System.out.println("I am a static code block!");
    }
}