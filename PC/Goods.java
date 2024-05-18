package PC;

public class Goods {

    private String brand;
    private String name;

    //默认区域内没有商品，在等于true后，代表有商品
    private boolean flag=false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //消费者获取商品
    public synchronized void get() {
        //区域内没有产品，则进行堵塞
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("消费者取走了" + this.getBrand() + "---," + this.getName());
//取走完成
        flag=false;
        //唤醒生产者去继续生产
        notify();

    }

    //生产者生产商品
    public synchronized void set(String brand, String name) {
        //判断区域是否有商品，有就堵塞
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "---," + this.getName());
        //生产完成
        flag=true;
        //唤醒消费者
        notify();

    }
}
