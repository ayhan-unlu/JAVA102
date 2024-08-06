package _240805_MultiThread_Concurency._CriticalSection_RaceCondition;

public class OrderMatic implements Runnable {

    private /*volatile*/int orderNumber;
    private final Object LOCK = new Object();

    public OrderMatic() {
        this.orderNumber = 0;

    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        /*
         * synchronized (LOCK) {
         * this.orderNumber++;
         * System.out.println(Thread.currentThread().getName() + " Order Number => " +
         * this.orderNumber);
         * 
         * }
         */
        increaseOrderNumber();

    }

    public synchronized void increaseOrderNumber() {
        this.orderNumber++;
        System.out.println(Thread.currentThread().getName() + " Order Number => " + this.orderNumber);

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

}
