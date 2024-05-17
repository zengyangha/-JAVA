package ThreadDemo;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();

        //代理人：thread
        //被代理人：runnableDemo
        Thread thread = new Thread(runnableDemo);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
        }

    }
}
