package ThreadDemo;

public class Ticket {

    //四个线程出售5张票

    static public class Demo1 extends Thread{
        private static int ticket=5;

        @Override
        public void run() {
            while (ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
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




    static public class Demo2 implements Runnable{
        private int ticket=5;

        @Override
        public void run() {
            while (ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
            }
        }

        public static void main(String[] args) {
            Demo2 demo2 = new Demo2();

            Thread t1 = new Thread(demo2);
            Thread t2 = new Thread(demo2);
            Thread t3 = new Thread(demo2);
            Thread t4 = new Thread(demo2);

            t1.start();
            t2.start();
            t3.start();
            t4.start();

        }
    }

    static public class demo3 extends Thread{
        @Override
        public void run() {
            for (int i=1;i<100;i++){
                if (i%2==0){
                    System.out.println(Thread.currentThread().getName()+"  "+i);
                }
            }
        }

        public static void main(String[] args) {
            demo3 demo3 = new demo3();
            demo3.start();
        }
    }

static public class demo4 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"  "+i);
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
