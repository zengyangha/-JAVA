package threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPollDemo {
    public static void main(String[] args) {
        // 创建线程池，核心线程数为2，最大线程数为4，空闲线程存活时间为50秒，任务队列大小为5
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 50, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));

        // 提交多个任务给线程池
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + "---正在执行，获取随机数:" + Math.random());
                    }
                }
            });
        }

        // 关闭线程池
        threadPoolExecutor.shutdown();
    }
}
