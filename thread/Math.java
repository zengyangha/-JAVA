package thread;

public class Math {
    private static int count = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (count > 100) {
                        lock.notify(); // 确保在退出前唤醒任何可能在等待的线程
                        return;
                    }
                    if (count % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;
                        lock.notify(); // 完成任务后，通知另一个线程
                    }
                    try {
                        if (count <= 100) {
                            lock.wait(); // 等待另一个线程的通知
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // 设置中断状态
                        return;
                    }
                }
            }
        }, "线程一").start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (count > 100) {
                        lock.notify(); // 确保在退出前唤醒任何可能在等待的线程
                        return;
                    }
                    if (count % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;
                        lock.notify(); // 完成任务后，通知另一个线程
                    }
                    try {
                        if (count <= 100) {
                            lock.wait(); // 等待另一个线程的通知
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // 设置中断状态
                        return;
                    }
                }
            }
        }, "线程二").start();

    }
}
