package Static_Code_Blocks_221222;

public class MainUser {
    public static void main(String[] args) {

        System.out.println("1. The Program Started running!");
        
        User u1 = new User("Ayhan");
        User u2 = new User("Beyhan");
        User u3 = new User("Kayhan");
        User u4 = new User("Ceyhan");

        System.out.println("Last User counter: "+User.counter);
        System.out.println("6. The Program is finished !");
    }
}
