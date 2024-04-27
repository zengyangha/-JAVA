package com.泛型;

public class Person {
    private String nane;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "nane='" + nane + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String nane, int age) {
        this.nane = nane;
        this.age = age;
    }
}
