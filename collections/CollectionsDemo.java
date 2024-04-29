package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {


    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, "aaa", "bb", "c");
        System.out.println(arrayList);

        //匿名内部类（new Comparator<String>()）
        arrayList.sort(new Comparator<String>() {      //new Comparator
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else return 0;
            }
        });
        System.out.println(arrayList);

        System.out.println("--------");


        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println(arrayList);
        System.out.println("--------");


        Collections.sort(arrayList);
        System.out.println(arrayList);
        //二分查找，要先排序，不然找不到指定元素
        System.out.println(Collections.binarySearch(arrayList, "aaa"));

        System.out.println("--------");
        Collections.fill(arrayList,"lisi");
        System.out.println(arrayList);

    }
}
