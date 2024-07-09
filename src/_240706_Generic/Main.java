package _240706_Generic;

public class Main {
    public static void main(String[] args) {
        /*
         * // undefined
         * String str;
         * 
         * // null
         * String str1 = null;
         * // XX Integer str1=null;
         * 
         * // empty,space
         * String str2 = "";
         * 
         * String str3 = "12321";
         * 
         * Integer a = null;
         * Integer b = 12321;
         * 
         * // Nullable_String n = new Nullable_String(str3);
         * // Nullable_String n = new Nullable_String(str2);
         * Nullable_String n = new Nullable_String(str1);
         * // XXNullable_String n = new Nullable_String(str);
         * // n.run();
         * // Nullable_Integer n1=new Nullable_Integer(a);
         * Nullable_Integer n1 = new Nullable_Integer(b);
         * // n1.run();
         * 
         * Integer d = 12;
         * String str4="abc";
         * Integer f;
         * Integer g=null;
         * Nullable<Integer> n2 = new Nullable<>(g);
         * //n2.run();
         * 
         * Integer h=10;
         * String i="patika";
         * Double j=3.14;
         * String k="dev";
         * Test<String,Double, Integer> t = new Test<>(i,j,h);
         * 
         * t.setObj1(k);
         * 
         * //t.showInfo();
         * t.showInfoAsPro();
         */
        /*
         * String[] a = { "Java", "102", "Patika", "Dev" };
         * Integer[] b = { 1, 2, 3, 4 };
         * // Integer[] c = new Integer[10];
         * // c[0] = 1;
         * Character[] c = { 'J', 'A', 'V', 'A' };
         * 
         * /*
         * for (String i : a) {
         * System.out.println(i);
         * }
         * 
         * for (Integer i : b) {
         * System.out.println(i);
         * }
         * 
         * for (Character i : c) {
         * System.out.println(i);
         * }
         */
        // Print.printArray(a);
        // Print.printArray(b);
        // Print.printArray(c,a);

        // Student<Integer> str = new Student<>();
        // str.insert(123);

        // Integer,Double,Float extends Number

        //Integer a = null;
        //String str="abc";
        // Nullable <Integer> n=new Nullable<>(12);
        //Nullable<Integer> n = new Nullable<>(a);
        //XX Nullable <String> n=new Nullable<>(str);
        
        A aObject=null;
        Nullable<A> n = new Nullable<>(aObject);

//        Nullable<Integer> n = new Nullable<>(a);
        
        n.run();
    }
}
