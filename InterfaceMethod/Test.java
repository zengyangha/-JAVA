package demo_test.InterfaceMethod;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //通过创建实例对象
        Food pizza = new Pizza();

        //直接使用接口的默认方法
        pizza.describe();

        //创建food的实例对象,使用静态方法获取食物，是典型的工厂模式
        //这样可以不用在这个类中创建实例，提供静态方法来创建实例对象
        Food getSecondFood=Food.getSeconeFood();
        getSecondFood.describe();

        Water water = new Water();
        water.describe();

        //Food food=Food.getThridFood("香蕉");  错误,无返回类型
        System.out.println("输入你想吃什么：");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        
        Food.getThridFood(str);


    }
}
