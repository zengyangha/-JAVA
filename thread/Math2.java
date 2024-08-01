package thread;

public class Math2 implements Runnable {
    private static int count = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        Math2 math2 = new Math2();
        new Thread(math2,"线程一").start();
        new Thread(math2,"线程二").start();


    }

    @Override
    public void run() {
        while (true) {

            try {
                synchronized (lock) {
                    if (count==101) {
                        lock.notify();
                        return;
                    }
                    if (count <= 100) {

                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;
                        lock.notify();
                        lock.wait();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
