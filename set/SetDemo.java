package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("123");
        set.add(1);
        set.add(true);
        set.add("123");
        System.out.println(set);
    }

}
