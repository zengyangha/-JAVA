package demo_test.InnerDemo.demo2;

public class Outer {

    private int id=666;
    private String name="zhang san";

public void show(){
    System.out.println("这是外部类 方法");

    class MethodInerClass{//方法内部类,只能在该方法中使用、创建对象等，所以没有staic
        private String name="lao liu";
        public void test(){
            System.out.println("方法内部类的方法");
        }
    }

    new MethodInerClass().test();//在该方法内创建对象
}

public void test(){
    System.out.println("这是是外部类方法 test");
    Iner iner = new Iner();
    System.out.println("外部类可用对象间接访问内类的私有属性"+iner.age);//外部类可用对象访问内类的私有属性
}

    class Iner {//当作类型为class的成员变量

        private int age=18;

        private String name="lisi";
        public void inerTest(){
            System.out.println("这是是内部类方法inerTest 可直接使用外类属性\t"+id);
        }
        public void show(){
            System.out.println("内部类 调用外类同属性名，内部属性："+name);
            System.out.println("外部属性："+Outer.this.name);
            System.out.println("同过内类方法访问内类私有属性："+age);
        }

    }

    static class Iner2{//静态内部类
        private String name="wang wu";

        public void show(){
            System.out.println("这是静态内部类");
        }

    }


    public static void main(String[] args) {
        Iner inner=new Outer().new Iner();//在外类入口中可省略外类类型

        Iner2 inner2=new Outer.Iner2();//

    }

}
