package _240805_MultiThread_Concurency._ThreadSleep_Stop;

public class _ThreadSleep_Stop {

    public static void main(String[] args) throws InterruptedException{
        _ThreadSleep_Stop_Counter c1 = new _ThreadSleep_Stop_Counter("c1", 1);
        Thread t1 = new Thread(c1);
        // Thread t1= new Thread(new _ThreadSleep_Stop_Counter("c1",1));
        t1.start();
//        Thread.sleep(4000);
      //   c1.stop();

        _ThreadSleep_Stop_Counter c2 = new _ThreadSleep_Stop_Counter("c2", 2);
        Thread t2 = new Thread(c2);
        // Thread t2=new Thread(new _ThreadSleep_Stop_Counter("c2",2));
        t2.start();
  //      Thread.sleep((4000));
    //    c2.stop();

    }

}
