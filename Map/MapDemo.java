package com.Map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map);
        System.out.println("-------------");


        //遍历：
        //Iteratable方法
        for (String string : map.keySet()) {
            System.out.println(string);
        }

        System.out.println("-----------------");

        for (Integer i:map.values()){
            System.out.println(i);
        }
        System.out.println("-----------------");

        //keySet方法，提供Key的集合，通过key获取value
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("-----------------");



        //map.values方法，提供values的集合,只能获取对应value值，不能根据value获取key
        Collection<Integer> values = map.values();
        for (Integer i:values){
            System.out.println(i);
        }

        System.out.println("-----------------");

        //迭代器：
        Set<String> keys1 = map.keySet();//获取key的集合
        Iterator<String> iterator=keys1.iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("-----------------");

        //Map.entry表示的是K-Y组合映射关系，key和value成组出现
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }



    }
}
