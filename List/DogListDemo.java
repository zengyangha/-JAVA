package com.List;

import java.util.ArrayList;
import java.util.List;

public class DogListDemo {
    public static void main(String[] args) {


        Dog dog = new Dog("大黄","red");
        Dog dog1 = new Dog("大黑","green");
        Dog dog2 = new Dog("丧彪","back");

        List list = new ArrayList();
        list.add(dog);
        list.add(dog2);
        list.add(dog2);

        System.out.println(list);

        System.out.println(list.size());

        list.remove(0);
        System.out.println(list);

        Dog dog3 = new Dog("丧彪","back");
        System.out.println(list.contains(dog3));

    }
}
