package _240705_Nested_Inner_Classes;
public class Boxing_Unboxing {
    public static void main(String[] args) {
        // Boxing
        // Unboxing

        int a = 10;

        // Autoboxing
        Integer b = a; // Integer.valueOf(a)
System.out.println(b);
        // Boxing
        Integer c = Integer.valueOf(a);

        // Autounboxing

        int d = c; // c.intValue()
        System.out.println(d);
        //XX System.out.println(d.toString());
        System.out.println(c.toString());

        //Unboxing
        int i = c.intValue();
        System.out.println(i);

    }

}
