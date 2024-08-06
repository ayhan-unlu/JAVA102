package _240805_MultiThread_Concurency._ThreadPooling;

public class TP_OrderMatic implements Runnable {
    private int orderNumber;

    public TP_OrderMatic() {
        this.orderNumber = 0;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        increaseOrderNumber();
    }

    public synchronized void increaseOrderNumber() {
        orderNumber++;
        System.out.println(Thread.currentThread().getName() + " Order Number : " + orderNumber);
    }

}
