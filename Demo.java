package demo_test;

import java.util.Scanner;

public class Demo {

    //十进制转二进制
    static public class Demo1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入：");
            int num = sc.nextInt();
            String str = "";

            while (num != 0) {
                int i = num % 2;
                str = i + str;
                num = num / 2;
            }
            System.out.println("结果为：" + str);

        }
    }

    //百钱买百鸡：
    // 现在有100元，要买100只鸡，公鸡5元一只，母鸡3元一只，小鸡3只一元，每种能买几只
    //穷举法
    static public class Demo2 {
        public static void main(String[] args) {
            for (int x = 1; x <= 20; x++) {
                for (int y = 1; y <= 33; y++) {
                    int z = 100 - y - x;
                    if (5 * x + 4 * y + z / 3 == 100) {
                        System.out.println("可以买：" + x + "只公鸡," + y + "只母鸡," + z + "只小鸡");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("zz");
        }
    }


    //计算两点距离
    static public class Poin {
        int x, y;

        //构造方法：
        public Poin(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /*
        也可：
        public void ser(int xx,int yy){
        x=xx;
        y=yy;
        }
         */


        //Poin p 为引用类型
        public double mathGet(Poin p) {
            return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
        }

        public void switchPoin(Poin p) {
            int a = p.x;
            p.x = x;
            x = a;

            int b = p.y;
            p.y = y;
            y = b;
        }

        public void show() {
            System.out.println(x + "\t" + y);
        }

        public static void main(String[] args) {
            Poin p1 = new Poin(3, 5);
            Poin p2 = new Poin(2, 4);
            System.out.println(p1.mathGet(p2));
            p1.switchPoin(p2);
            p1.show();
            p2.show();
        }
    }

//    static public class Person{
//        private String name;
//        private int age;
//
//        public void display(){
//            System.out.println(name+"\t"+age);
//        }
//
//        public void setName(String name){
//            this.name=name;
//        }
//
//        public void setAge(int age){
//            this.age=age;
//        }
//
//        public static void main(String[] args) {
//            Person pe = new Person();
//            pe.setName("zhangsan");
//            pe.setAge(18);
//            pe.display();
//        }
//
//    }

    static public class Person1 {
        private String name;
        private int age;

        public Person1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println(name + "\t" + age);
        }

        public static void show() {
            System.out.println("这是静态方法");
        }

        public static void show2() {
            System.out.println("这是通过实例访问静态方法，但不建议，最好用类访问静态的");
        }

        public static void main(String[] args) {
            Person1 pe = new Person1("zhangsa", 18);
            pe.display();//非静态方法需对象调用

            show();//静态方法可在类中直接使用
            pe.show2();//
        }
    }


    //初识继承
    static public class Test {
        public static void main(String[] args) {
            new ChildClass().f();/////
        }
    }

    static class FatherClass {
        public int value;

        public void f() {
            value = 100;
            System.out.println("father value:" + value);
        }
    }

    static class ChildClass extends FatherClass {
        public int value;

        public void f() {
            super.f();
            value = 200;
            System.out.println("childClass value:" + value);
            System.out.println(value);
            System.out.println(super.value);

        }

    }

}
