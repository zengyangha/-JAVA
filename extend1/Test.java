package demo_test.extend1;

public class Test {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //根据方法赋值
        dog1.setName("dahuang");
        dog1.setAge(18);
        dog1.setGender("boy");
        dog1.setSound("haha");

        System.out.println(dog1.getName());

        //构造方法赋值
        Dog dog2 = new Dog("xiaohei",17,"gril","oo");
        System.out.println(dog2.getName());

        dog1.play();

        //toString()用法：
        //Pet pet = new Pet();//抽象对象实例化，无意义
       // System.out.println(pet);
        System.out.println(dog1);
        dog1.cry();


    }
}
