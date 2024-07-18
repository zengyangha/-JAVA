package demo_test.InnerDemo.demo2;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Iner inner=new Outer().new Iner();

        Outer.Iner2 inner2=new Outer.Iner2();

        outer.test();//间接访问
        System.out.println();

        inner.inerTest();//直接访问
        System.out.println();

        inner.show();

        //System.out.println(inner.age);  报错

        System.out.println();
        inner2.show();

        outer.show();

        //还有一种内部类叫匿名内部类，很重要

    }

}
