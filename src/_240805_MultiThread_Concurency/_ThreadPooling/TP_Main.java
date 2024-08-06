package _240805_MultiThread_Concurency._ThreadPooling;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TP_Main {
    public static void main(String[] args) {

        TP_OrderMatic oMatic = new TP_OrderMatic();
        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            pool.execute(oMatic);
        }

        System.out.println(oMatic.getOrderNumber());
        pool.shutdown();
    }

}
