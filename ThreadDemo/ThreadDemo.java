package ThreadDemo;

public class ThreadDemo extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        //两个线程
        threadDemo.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "=======" + i);
        }

    }
}
