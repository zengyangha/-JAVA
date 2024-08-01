package thread;

public class XunHuang {

    private static final Object lock = new Object();
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                synchronized (lock) {
                    while (flag) { // 如果是主线程的轮次，子线程等待
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    // 子线程执行
                    for (int j = 1; j < 11; j++) {
                        System.out.println(Thread.currentThread().getName() + "\t" + j);
                    }
                    flag = true;
                    lock.notify(); // 唤醒主线程
                }
            }
        });
        thread.setName("子线程");
        thread.start();

        Thread thread2 =new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                synchronized (lock) {
                    while (!flag) { // 如果不是主线程的轮次，主线程等待
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    for (int j = 1; j < 101; j++) {
                        System.out.println("主线程: " + j);
                    }
                    flag = false;
                    lock.notify();
                }
            }
        });

        thread2.setName("主线程");
        thread2.start();

    }
}
