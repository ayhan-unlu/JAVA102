package _240705_Nested_Inner_Classes;
// Outer Class
public class Out {
    public int a=5;
    public static int b=20;

// Inner Class
    public static class In{
         public static int a=10;
         
         public static void run(){
            System.out.println("Inner Class Run Method is Executed");
            int a=1;
            System.out.println(a);
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
            //System.out.println(Out.this.a);
        /// recursive    Out.this.run();
         }
    }
    public void run(){
        //In in=new In();
        //XXXX System.out.println(in.run());
        In.run();
        ///System.out.println(In.a);

    }
//    public In getIn(){
  //      In in = new In();
    //    return in;
  //  }
///
}
