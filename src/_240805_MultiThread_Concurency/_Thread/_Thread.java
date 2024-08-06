package _240805_MultiThread_Concurency._Thread;

public class _Thread {

    public static void main(String[] args) {

        System.out.println("The program started.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("The program finished.");

        System.out.println("###########");
        _Thread_Counter c1 = new _Thread_Counter("C1");
        _Thread_Counter c2 = new _Thread_Counter("C2");

        //c1.run();
        //c2.run();

         c1.start();
         c2.start();

    }

}
