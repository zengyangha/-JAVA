package threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTreadPoolDemo {



static public class Demo1{
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        System.out.println(System.currentTimeMillis());
        System.out.println("延迟2秒输出");

        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        },2, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

//每2秒打印
    static public class Demo2{
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        System.out.println(System.currentTimeMillis());


        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1----延迟1秒执行，后,每9秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,9, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2----延迟2秒执行，后,每7秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },2,7, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3------延迟3秒执行，后,每5秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },3,5, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程4延迟4秒执行，后,每2秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },4,2, TimeUnit.SECONDS);
    }
}

}
