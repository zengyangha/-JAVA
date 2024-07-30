package callAble.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Callable callable = new MyCallable();

        //实例化一个FutureTask对象,
        FutureTask<Integer> futureTask = new FutureTask(callable);

        new Thread(futureTask,"callAble线程").start();


        //有返回值，用FutureTask来接收
        Integer i = futureTask.get();

        System.out.println("最终结果为："+i);




    }
}
