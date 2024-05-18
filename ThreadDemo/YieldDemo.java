package ThreadDemo;

public class YieldDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun);
        t1.start();

        for (int i = 0; i < 10; i++) {

            if (i==3){
                Thread.yield();//从执行状态重新进入就绪状态，跳过堵塞状态
                System.out.println(Thread.currentThread().getName() + "-------" + i+"线程礼让一次");
            }else {
                System.out.println(Thread.currentThread().getName() + "-------" + i+"正常执行");
            }
        }
    }
}
