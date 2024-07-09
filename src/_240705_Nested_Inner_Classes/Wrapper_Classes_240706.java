package _240705_Nested_Inner_Classes;
public class Wrapper_Classes_240706 {

    public static void main(String[] args) {
        int a = 20;
        Integer b = 20;
        
        String str = "abc";
        Short s = 2;
        //XX String str1 =20;
        //XX String str1 = a.toString();
        String str1 = b.toString();

        String str2="10";
        //XX int c=str2;
        int c = Integer.parseInt(str2);

        System.out.println(Integer.max(5,15));

        System.out.println(Integer.sum(3,6));


        System.out.println(b);
        System.out.println(b+a);
        System.out.println(str);
        System.out.println(str1);

        System.out.println(str+str1+a);

        System.out.println(a+str2);
        System.out.println(a+c);
        System.out.println(Integer.parseInt(str2)+a);
    }
}
