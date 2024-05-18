package ThreadDemo;

public class SleepDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
            if (i==3){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
