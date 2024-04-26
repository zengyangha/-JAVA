package com.set;

public class Person implements Comparable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//此比较器按name长度比较（内部比较器）
    @Override
    public int compareTo(Object o) {
        Person p=(Person) o;
        if(p.name.length()>this.name.length()){
            return 1;
        } else if (p.name.length()<this.name.length()) {
            return -1;
        }else return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
