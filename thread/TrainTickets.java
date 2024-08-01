package thread;

public class TrainTickets implements Runnable {
    private static int tickets = 100;
    private static final Object lock = new Object();

    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 售出了1张票，剩余票数: " + --tickets);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        TrainTickets seller = new TrainTickets();
        new Thread(seller, "售票点1").start();
        new Thread(seller, "售票点2").start();
        new Thread(seller, "售票点3").start();
        new Thread(seller, "售票点4").start();
        new Thread(seller, "售票点5").start();


    }
}
