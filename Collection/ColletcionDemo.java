package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColletcionDemo {

    //java集合框架

    public static void main(String[] args) {


        Collection collection = new ArrayList();//ArrayList长度默认为10
        collection.add(1);//等同于：collection.add(new Interger(1));
        collection.add(true);
        collection.add("abc");
        collection.add("abc");


        ((ArrayList) collection).add(1, false);

        System.out.println(collection);

        System.out.println("------------------");

        ArrayList arrayList = new ArrayList();
        arrayList.add("duuu");
        arrayList.add(false);
        arrayList.add(2);
        arrayList.add(1, "wwwww");
        arrayList.set(0,"duuuuuuu");

        System.out.println(arrayList);

        Collection collection1 = new ArrayList();
        collection1.add("q");
        collection1.add("w");
        collection1.add("e");
        collection1.add("r");

        collection.addAll(collection1);
        System.out.println(collection);

        System.out.println("--------------");
        collection.clear();//只是情况元素，该对象集合没有被回收
        System.out.println(collection);

        System.out.println(collection1.contains("e"));

        System.out.println("--------------------------------");

        System.out.println(collection1.containsAll(collection));

        collection1.remove("r");
        System.out.println(collection1);

        //collection1.toArray().var
        Object[] objects = collection1.toArray();


        List list =new ArrayList();

    }
}
