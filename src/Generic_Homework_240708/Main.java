package Generic_Homework_240708;

public class Main {
    public static void main(String[] args) {
         MyList<Integer> list = new MyList<>();

         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.add(70);
         list.add(80);
         list.add(90);

         list.print();

         list.remove(0);
         list.print();

System.out.println("Third index data is "+         list.get(2));


    }

}
