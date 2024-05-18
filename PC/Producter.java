package PC;

public class Producter implements Runnable {
    private Goods goods;

    public Producter(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                goods.set("小米", "su7");
            } else {
                goods.set("华为", "mate20");
            }


        }
    }
}
