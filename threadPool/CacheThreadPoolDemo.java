package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();//创建线程池对象
        for (int i = 0; i < 2000; i++) {
            executorService.execute(new Task());
        }
        executorService.shutdown();//关闭池
    }
}
