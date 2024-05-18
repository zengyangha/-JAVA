package pcJUC;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {
    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods;
            if (i % 2 == 0) {
                goods = new Goods("小米", "su7");
            } else {
                goods = new Goods("华为", "mate20");
            }
            System.out.println("生产者开始生产" + goods.getBrand() + "----," + goods.getName());

            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 恢复中断状态
                System.out.println("生产者被中断");
                return;
            }
        }
    }
}
