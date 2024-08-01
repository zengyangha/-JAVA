package thread;


public class Person implements Runnable {
    private static final Object lock = new Object();


    @Override
    public void run() {
        passCave();
    }

    private void passCave() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + "正在通过山洞");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName()  + " 已通过");
        }
    }

    public static void main(String[] args) {

        Person person = new Person();

        for (int i = 1; i <= 10; i++) {

            new Thread(person,i+"号选手").start();

        }
    }

}