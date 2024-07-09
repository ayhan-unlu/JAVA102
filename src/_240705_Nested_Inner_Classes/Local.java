package _240705_Nested_Inner_Classes;

public class Local {

    public void run(){


        //Local Class Nearby
        class Nearby{
            private int a;

            public Nearby(int a){
                this.a = a;
            }

            public int getA(){
            return a;}

            public void setA(int a){
                this.a=a;
            }
        }
        Nearby n = new Nearby(15);
        System.out.println("Local Class Run Method is Executed");
        System.out.println(n.getA());
    }

    public void print(){
        //Nearby n = new Nearby(16);
    }

}
