package com.泛型;

import java.util.ArrayList;

public class FanXingDemo {


    public static void main(String[] args) {

        //泛型
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("abc");
        list.add("true");
        list.add(new Person("zhangsan", 18).toString());

        System.out.println(list);


        for (String point : list) {
            System.out.println(point);
        }

        System.out.println("-------------");

        InterfaceFanTest<String> fanXingInterface = new InterfaceFanTest<>();
        fanXingInterface.test1("abc");

        InterfaceFanTest<Integer> fanXingInterface2 = new InterfaceFanTest<>();
        fanXingInterface2.test1(123);
        System.out.println(fanXingInterface2.test());


        System.out.println("-----------------");
        InterfaceFanTest1 fanXingInterface1 = new InterfaceFanTest1();
        fanXingInterface1.test1("pppp");




    }

}
