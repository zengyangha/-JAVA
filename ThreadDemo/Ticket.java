package ThreadDemo;

public class Ticket {

    //四个线程出售5张票


    //每次启动线程对象时都会创建自己的对象属性，相当于每个线程操作自己的属性，没有公用属性，除非设置staric
    //每次访问共享对象时，数据不一样，需要线程同步
    static public class Demo1 extends Thread {
        private static int ticket = 5;

        @Override
        public void run() {
            while (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }
        }

        public static void main(String[] args) {
            Demo1 t1 = new Demo1();
            Demo1 t2 = new Demo1();
            Demo1 t3 = new Demo1();
            Demo1 t4 = new Demo1();

            t1.start();
            t2.start();
            t3.start();
            t4.start();

        }
    }


    //每次只创建了一个共享对象，所有线程都能实现共享资源
    //每次访问共享对象时，数据不一样，需要线程同步（加锁）
    //以下是同步代码块实现同步
    static public class Demo2 implements Runnable {
        private int ticket = 5;

        //同步代码块
        @Override
        public void run() {
            //休眠该线程让其他线程抢占
//            while (ticket > 0) {
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                synchronized (this) {
//                    if (ticket > 0) {
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
//                    }
//                }
//            }

            while (ticket>0){

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                this.safe();
            }
        }

        //同步方法
        public synchronized void safe() {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                }
            }


        public static void main(String[] args) {
            Demo2 demo2 = new Demo2();

            Thread t1 = new Thread(demo2, "A");
            Thread t2 = new Thread(demo2, "B");
            Thread t3 = new Thread(demo2, "C");
            Thread t4 = new Thread(demo2, "D");

            t1.start();
            t2.start();
            t3.start();
            t4.start();

        }
    }


    static public class demo3 extends Thread {
        @Override
        public void run() {
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + "  " + i);
                }
            }
        }

        public static void main(String[] args) {
            demo3 demo3 = new demo3();
            demo3.start();
        }
    }

    static public class demo4 implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + "  " + i);
                }
            }
        }

        public static void main(String[] args) {
            demo4 demo4 = new demo4();
            Thread thread = new Thread(demo4);
            thread.start();


        }

    }

}
