package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Itera {
    //

    //迭代器：
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");

        //iterator 方法

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------");
        //Arraylist的Iterable方法
        for (String point : arrayList) {
            System.out.println(point);
        }


    }


}
