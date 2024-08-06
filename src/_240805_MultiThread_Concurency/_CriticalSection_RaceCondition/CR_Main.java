package _240805_MultiThread_Concurency._CriticalSection_RaceCondition;

import java.util.ArrayList;
import java.util.List;

public class CR_Main {
    public static void main(String[] args) throws InterruptedException {

        OrderMatic oMatic = new OrderMatic();
        List<Thread> orders = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(oMatic);
            orders.add(t);
            t.start();

        }

        for (Thread t : orders) {
            t.join();
        }

        System.out.println(oMatic.getOrderNumber());
        /*
         * Thread t1= new Thread(oMatic);
         * 
         * t1.start();
         * t1.join();
         * 
         * Thread t2=new Thread(oMatic);
         * t2.start();
         * t2.join();
         * 
         * System.out.println(oMatic.getOrderNumber());
         */
    }

}
