package _221222_Static_Key_Word;

public class Player {

    public String name;
    public int id;
    // public static String game="CS";
    public static int count=22;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        // count++;
    }

    public void showName(){
        System.out.println(this.name);
        System.out.println(Player.count);
    }

    public static  void showName1(){
        Player p4 = new Player("vSCode",4);
        System.out.println(p4.name);
//        System.out.println(this.name);
    }
    /*
     * public void login() {
     * count++;
     * }
     */
}