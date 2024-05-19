package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new Task());
            System.out.println("执行第"+i+"次");
        }
        executorService.shutdown();
    }
}
