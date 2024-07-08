public class Boxing_Unboxing_240706 {
    public static void main(String[] args) {
        // Boxing
        // Unboxing

        int a = 10;

        // Autoboxing
        Integer b = a; // Integer.valueOf(a)

        // Boxing
        Integer c = Integer.valueOf(a);

        // Autounboxing

        int d = c; // c.intValue()
        System.out.println(d);
        //XX System.out.println(d.toString());
        System.out.println(c.toString());

        //Unboxing
        int i = c.intValue();

    }

}
