package _240805_MultiThread_Concurency._Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        NumberSorter numberSorter = new NumberSorter();

        Thread t1 = new Thread(numberSorter, "t1");
        Thread t2 = new Thread(numberSorter, "t2");
        Thread t3 = new Thread(numberSorter, "t3");
        Thread t4 = new Thread(numberSorter, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        /*
         * for (int i = 1; i <= 10000; i++) {
         * if (i <= 2500) {
         * t1.start();
         * } else if (i > 2500 && i <= 5000) {
         * t2.start();
         * } else if (i > 5000 && i <= 7500) {
         * t3.start();
         * } else {
         * t4.start();
         * }
         * }
         */
        // ExecutorService executor= Executors.newFixedThreadPool(4);

        // for(int i=0;i<10000;i++){
        // if(i<2500){

        // }
        // }
        // executor.execute(numberSorter);
        // executor.shutdown();
        // numberSorter.run();
    }


}
