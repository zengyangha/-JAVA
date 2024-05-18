package ThreadDemo;

import java.util.Objects;

public class Demo {

    //交替轮转打印1-10
    static public class Demo1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-------" + i);
                try {
                    Thread.sleep(1050);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void main(String[] args) {
            Demo1 demo1 = new Demo1();
            Thread t1 = new Thread(demo1);
            t1.start();

            for (int i = 10; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + "-------" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    //两个账户取款
    static public class Demo2 implements Runnable {
        private int count = 1000;

        @Override
        public void run() {
            while (count > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.getMoney();
            }

        }


        public synchronized void getMoney() {

            if (Objects.equals(Thread.currentThread().getName(), "张三") && count >= 300) {
                System.out.println("张三正在取款,取款300元");
                count -= 300;
                System.out.println("账户余额" + count);
                System.out.println(Thread.currentThread().getName() + "取款完成");
            } else if (Objects.equals(Thread.currentThread().getName(), "李四") && count >= 200) {
                System.out.println("李四正在取款,取款200元");
                count -= 200;
                System.out.println("账户余额" + count);
                System.out.println(Thread.currentThread().getName() + "取款完成");
            } else System.out.println("账户余额不足" + Thread.currentThread().getName() + "取款失败");

        }

        public static void main(String[] args) {
            Demo2 demo2 = new Demo2();
            Thread t1 = new Thread(demo2, "张三");
            Thread t2 = new Thread(demo2, "李四");

            t1.start();//张三
            t2.start();//李四

        }
    }
}
