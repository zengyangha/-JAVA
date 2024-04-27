package com.泛型;

public class FanXingClass<A> {

//泛型类
    private int age;
    private A a;

    //泛型方法：
    public <Q> void fanXingMethod(Q q){
        System.out.println(q);
        System.out.println(a);

    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show(){
        System.out.println("age="+age+",A="+a);
    }



}
