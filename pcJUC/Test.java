package pcJUC;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {

    public static void main(String[] args) {
        BlockingQueue<Goods> queue = new ArrayBlockingQueue<>(1);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);

        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();
    }
}
//put：如果队列已满，调用 put 方法的线程会被阻塞，直到队列中有可用空间。
//take：如果队列为空，调用 take 方法的线程会被阻塞，直到队列中有可用元素