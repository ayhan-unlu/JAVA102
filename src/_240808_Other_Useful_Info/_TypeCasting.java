package _240808_Other_Useful_Info;

public class _TypeCasting {
    public static void main(String[] args) {
        // Widening casting from smaller to the bigger

        int a = 10;
        double b = a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // Narrowing casting from bigger to smaller some data gets lost

        double pi = 3.14;
        int c = (int) pi;
        System.out.println("pi=" + pi);
        System.out.println("c=" + c);
        System.out.println((int) pi);

        byte d = 80;
        char e = (char) d;
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println((char) d);

        int f = 20;
        System.out.println("Integer f+f=" + (f + f));

        String str = String.valueOf(f);
        System.out.println("String str+str=" + (str + str));

        String str2 = "30";
        int g = Integer.parseInt(str2);
        System.out.println("String str2+str2=" + (str2 + str2));
        System.out.println("Integer g+g=" + (g + g));

    }
}
