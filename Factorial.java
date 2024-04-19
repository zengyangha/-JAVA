package demo_test;

import java.util.Scanner;

public class Factorial {

    //阶乘：方式一：递归：（调用本身）
    static class FacotrialExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("现在是递归方法，请输入阶乘：");
            int number = sc.nextInt();
            int result = factorial(number);
            System.out.println("阶乘的结果为" + result);
        }
    }

    //递归函数：
    //缺点：因为每层栈调用时都要调用栈的空间，输入大额数字时可能会导致栈溢出，
    static public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    //递归阶乘和：
    static public class FacotrialExample1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想求前几个阶乘和：");
            int num = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += factorial1(i);
            }
            System.out.println("结果为：" + sum);

        }

        static public int factorial1(int n) {
            return n * factorial1(n - 1);
        }
    }


    //阶乘：迭代方法：
    static class FactorialExample2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("现在是迭代方法，请输入值：");
            int number = sc.nextInt();
            int poin = 1;
            for (int i = 1; i <= number; i++) {
                poin *= i;
            }
            System.out.println("结果为：" + poin);
        }

    }


    //阶乘和：
    //递归方法过于繁琐，用迭代方法最好
    static class FacotrialExample3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("现在是用迭代方法计算阶乘和，请输入数值：");
            int number = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                int poin = 1;//初始化每次循坏
                for (int j = 1; j <= i; j++) {
                    poin *= j;
                }
                sum += poin;
            }
            System.out.println("结果为：" + sum);


        }

    }

}
