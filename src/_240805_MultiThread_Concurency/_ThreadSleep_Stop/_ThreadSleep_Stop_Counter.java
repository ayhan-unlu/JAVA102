package _240805_MultiThread_Concurency._ThreadSleep_Stop;

public class _ThreadSleep_Stop_Counter implements Runnable {

    private String name;
    private int delayDigit;
    private boolean isRun = true;

    public _ThreadSleep_Stop_Counter(String name, int delayDigit) {
        this.name = name;
        this.delayDigit = delayDigit;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(this.name + " started.");
        int i = 0;
        while (isRun) {
            // for (int i = 1; i <= 100; i++) {

            // if (this.delayDigit == 1) {
            try {
                Thread.sleep(1000L * delayDigit);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            // }
            System.out.println(this.name + " : " + i++);
            if(i==10){isRun=false;}
            // }
        }
    }

    public void stop() {
        this.isRun = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDelayDigit() {
        return delayDigit;
    }

    public void setDelayDigit(int delayDigit) {
        this.delayDigit = delayDigit;
    }

}
