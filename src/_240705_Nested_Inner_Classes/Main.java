package _240705_Nested_Inner_Classes;

public class Main {
    public static void main(String[] args) {
        //Out o = new Out();
        //o.run();


       //Out.In in = o.getIn();
       //in.run();
       //in.run();
    //Out.In.run();   
    //Local l = new Local();
    //l.run();

    Anonym a = new Anonym(){
        //public int a=35;
        @Override
        public void run(){
            
            System.out.println("Anonymously Written Run Method is Executed");
            print();
            System.out.println(this.a);

        }

        public void print(){
            System.out.println("Anonymous Print Method is Executed");
        }
    };
    a.run();
    //a.print();


    }


}
