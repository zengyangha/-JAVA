package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");

        System.out.println(linkedList);

        linkedList.add(0, 321);//其下标指的是Node

        System.out.println(linkedList);

        System.out.println("---------------------------------");

        //迭代器
        Iterator iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------");
        for (Object i : linkedList) {
            System.out.println(i);
        }

        System.out.println("---------------------------------");

        for(int i=0;i< linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }



    }

}
