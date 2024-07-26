package com.序列化;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        fun1();
        fun2();


    }

    private static void fun2() throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"));
        //重构成对象
        Object obj=ois.readObject();

        if (obj instanceof Student){
            Student student=(Student) obj;
            System.out.println(student);
            System.out.println(student.getTeacher());
        }
    }

    private static void fun1() throws IOException {
        Student student = new Student("张三", "购物袋");
        student.setTeacher(new Teacher("李四","沃尔玛"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student"));

        oos.writeObject(student);

        oos.close();

        System.out.println("ok");
    }


}
