package thread;

public class JJJJ2 {
        private int j = 0;

        // 同步方法增加j
        public synchronized void increment() {
            j++;
            System.out.println("Thread " + Thread.currentThread().getName() + " incremented j to: " + j);
        }

        // 同步方法减少j
        public synchronized void decrement() {
            j--;
            System.out.println("Thread " + Thread.currentThread().getName() + " decremented j to: " + j);
        }

        public static void main(String[] args) {
            JJJJ2 counter = new JJJJ2();

            // 创建内部类实现Runnable，用于增加j
            class Incrementer implements Runnable {
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        counter.increment();
                        try {
                            Thread.sleep(100);  // 暂停一段时间，模拟真实操作
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }

            // 创建内部类实现Runnable，用于减少j
            class Decrementer implements Runnable {
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        counter.decrement();
                        try {
                            Thread.sleep(100);  // 暂停一段时间，模拟真实操作
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }

            // 创建并启动两个增加和两个减少的线程
            new Thread(new Incrementer(), "Incrementer-1").start();
            new Thread(new Incrementer(), "Incrementer-2").start();
            new Thread(new Decrementer(), "Decrementer-1").start();
            new Thread(new Decrementer(), "Decrementer-2").start();
        }
    }