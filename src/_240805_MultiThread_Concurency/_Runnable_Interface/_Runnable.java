package _240805_MultiThread_Concurency._Runnable_Interface;

public class _Runnable {

    public static void main(String[] args) {

        _Runnable_Counter c1=new _Runnable_Counter("c1");
        _Runnable_Counter c2=new _Runnable_Counter("c2");
        _Runnable_Counter c3=new _Runnable_Counter("c3");

        Thread t1= new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(c3);

        t1.start();
        t2.start();
        t3.start();

    }

}