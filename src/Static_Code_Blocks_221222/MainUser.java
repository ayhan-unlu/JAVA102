package Static_Code_Blocks_221222;

public class MainUser {
    public static void main(String[] args) {

        System.out.println("1. The Program Started running!");
        
        User u1 = new User("Ayhan");
        User u2 = new User("Patika");
        User u3 = new User("Dev");
        User u4 = new User("Kodluyoruz");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println("Last User counter: "+User.counter);
        System.out.println("6. The Program is finished !");
    }
}
