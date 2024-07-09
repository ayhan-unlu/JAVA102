package _221221_Access_Modifier.first;

public class First {
    // private String str;
    public String str;

    public First(String str) {
        this.str = str;
    }
    public void show(){
        System.out.println(this.str);
    }
    /*
     * private void showStr() {
     * System.out.println(this.str);
     * }
     * void show(){
     * this.showStr();
     * }
     */
}
