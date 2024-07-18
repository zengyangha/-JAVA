package demo_test.InnerDemo.demo1;

public class Out {

    public String name="西门庆";
    private int age=18;

    public class Inner{
        private String name="潘金莲";
        private int age=20;

        public void show(){
            System.out.println(name);  //外部类和内部类属性同名时，就近原则
            System.out.println(Out.this.age);
            System.out.println("----");
            System.out.println(Out.this.name);
            System.out.println(age);
        }
    }

    //通过方法创建内部类对象
        public void test1(){
            Inner inner = new Inner();
            inner.show();
        }

}
