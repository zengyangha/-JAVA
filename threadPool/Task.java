package threadPool;

public class Task implements Runnable{


    @Override
    public void run() {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+"----------正在执行");

    }
}
