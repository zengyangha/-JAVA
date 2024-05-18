package PC;

public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();

        Producter producter = new Producter(goods);
        Consumer consumer = new Consumer(goods);

        Thread t1 = new Thread(producter);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}
