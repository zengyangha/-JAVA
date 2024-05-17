package ThreadDemo;

public class ThreadApiDemo extends Thread{

    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取当前线程名称
        System.out.println(thread.getName());
        //获取线程ID
        System.out.println(thread.getId());
        //获取线程优先级，一般范围为1-10，默认为5
        System.out.println(thread.getPriority());
        //设置线程优先级，（不是优先级越高就一定执行，只是执行概率变高）
        thread.setPriority(1);
        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread t1 = new Thread(threadApiDemo);
        t1.setPriority(10);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
        }



    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
        }
    }
}
