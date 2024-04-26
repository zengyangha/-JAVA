package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo implements Comparator<Dog> {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(43);
        treeSet.add(1);
        treeSet.add(88);
        System.out.println(treeSet);
        System.out.println("----------------");

        //使用比较器时,不会调用equal方法

        //自动调用内部比较器
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(new Person("zhangsan", 18));
        treeSet1.add(new Person("lisi", 23));
        treeSet1.add(new Person("wangwu", 34));
        System.out.println(treeSet1);
        System.out.println("----------------------------");


//需要调用比较器，将该比较器传递到集合中
        //new TreeSetDemo()是因为该类实现了Comparator接口，则该类变成了比较器的子类
        TreeSet treeSet2 = new TreeSet(new TreeSetDemo());
        treeSet2.add(new Dog("zhangsan", 88));
        treeSet2.add(new Dog("lisi", 23));
        treeSet2.add(new Dog("wangwu", 18));
        System.out.println(treeSet2);
        System.out.println("----------------------------");

        //如果两个比较器同时使用：调用的还是外部比较器


    }

    //外部比较器
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else
            return 0;
    }
}
