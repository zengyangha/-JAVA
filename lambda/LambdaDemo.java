package lambda;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {

        //匿名内部类
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running----");
            }
        });
        thread.start();

        //lambda
        new Thread(()->{System.out.println("running2--------------");}).start();

        System.out.println("-----------------------------------------");

        //普通写法写匿名内部类排序
        //Arrays.asList将数组转换为一个固定大小的 List。这个方法可以方便地将一组元素转换为 List，从而利用集合类的功能
        List<String> list= Arrays.asList("aaaaa","bb","cccccc","d","eee");//
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        for (String str:list){
            System.out.println(str);
        }

        System.out.println("-----------------------------------------");


        //lambda
        Collections.sort(list,(a,b)->a.length()-b.length());
        list.forEach(System.out::println);


    }
}
