package com.泛型;

public class FanXingClassTest {

    public static void main(String[] args) {

        //泛型类
        FanXingClass<Integer> fxt = new FanXingClass<>();
        fxt.setAge(1);
        fxt.setA(2);
        fxt.show();

        FanXingClass<String> fxt1 = new FanXingClass<>();
        fxt1.setA("zhangsan");
        fxt1.setAge(18);
        fxt1.show();

        FanXingClass<Person> fxt2 = new FanXingClass<>();
        fxt2.setA(new Person("lisi",88));
        fxt2.show();

        System.out.println("--------------");
        System.out.println();



        FanXingClass<String> fxt3 = new FanXingClass<>();
fxt3.setA("tttt");
fxt3.fanXingMethod("qqqqq");
        System.out.println("------");
fxt3.fanXingMethod(123);
fxt3.fanXingMethod(new Person("lisi",88));



    }


}
