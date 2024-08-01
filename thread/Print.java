package thread;

public class Print {
    private int number = 1;
    private char letter = 'A';

    public static void main(String[] args) {
        Print point = new Print();
        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                while (point.number <= 52) {
                    System.out.print(point.number++);
                    if (point.number <= 52) {
                        System.out.print(point.number++);
                    }
                    try {
                        lock.notify();
                        if (point.number <= 52) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();  // 确保最后可以退出
            }
        }).start();

        new Thread(() -> {
            synchronized (lock) {
                while (point.letter <= 'Z') {
                    System.out.print(point.letter++);
                    try {
                        lock.notify();
                        if (point.letter <= 'Z') {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }).start();

    }
}
