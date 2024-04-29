package com.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysClassDemo {
    public static void main(String[] args) {


        //数组转list
        int[] array=new int[]{1,2,3,4};
        List<Integer> list = Arrays.asList(1,2,3,4);//Arrays.as

        //list转数组
        Object[] objects = list.toArray();//list.toArray

    }
}
