package _240805_MultiThread_Concurency._Thread;

public class _Thread_Counter extends Thread {

    public String name;

    public _Thread_Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        // System.out.println(Thread.currentThread().getName());
        // System.out.println(this.name+" started.");
        for (int i = 0; i < 100; i++) {
            System.out.println(this.name+":"+i);
        }
    }

}
