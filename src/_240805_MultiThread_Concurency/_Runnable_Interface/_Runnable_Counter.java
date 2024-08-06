package _240805_MultiThread_Concurency._Runnable_Interface;

public class _Runnable_Counter implements Runnable{

    private String name;

    public _Runnable_Counter(String name){
        this.name=name;
    }

    @Override
    public void run(){

        System.out.println(" Counter "+this.getName()+" "+"started.");
        for (int i=0;i<=100;i++){
            System.out.println(this.getName()+": "+i);
        }

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}
