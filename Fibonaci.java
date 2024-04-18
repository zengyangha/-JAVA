package demo_test;

import java.util.Scanner;

public class Fibonaci {

    //斐波那契数列：
    //0 1 1 2 3 5 8 13 21 34
    //  1 2 3 4 5 6  7 8   9
    //实际是f(n)=f(n-2)+f(n-1)
    //可用递归和迭代，迭代总比递归好
    //方法一：递归
    static public class FibonaciExample0 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想知道第几个斐波那契数：");
            int num = sc.nextInt();
            int result = getFibo(num);
            System.out.println("结果为：" + result);

        }

        static public int getFibo(int n) {
            if (n <= 1) {
                return n;
            } else {
                return getFibo(n - 2) + getFibo(n - 1);
            }
        }

    }

    //迭代计算多多位：
    static public class FibonaciExample1{
        public static void main(String[] args) {
            System.out.println("输入你想知道多少个斐波那契数列：");
            Scanner sc = new Scanner(System.in);
            int num= sc.nextInt();
            System.out.println("结果为：");
            for (int i=1;i<=num;i++){
                int result=getFibo1(i);
                System.out.print(result+"\t");
            }

        }

        static public int getFibo1(int n) {
            if (n <= 1) {
                return n;
            } else {
                return getFibo1(n - 2) + getFibo1(n - 1);
            }
        }


    }



    //0 1 1 2 3 5 8 13 21 34
    //1 2 3 4 5 6 7 8 9  10
    //方法二：迭代：
    static public class FibonaciExample2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想知道第几个斐波那契数：");
            int num = sc.nextInt();
            int result = getFibo2(num);
            System.out.println("结果为：" + result);
        }


        static public int getFibo2(int n) {
            int a = 0, b = 1;
            int sum;
            if (n == 1) {
                return 0;
            } else if (n == 2) {
                return 1;
            } else {
                for (int i = 2; i < n; i++) {
                    sum = a + b;
                    a = b;
                    b = sum;
                }
                return b;
            }
        }
    }

    //列出十以内的斐波那契数列：
    static public class FibonaciExample3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想知道多少个斐波那契数列：");
            int num = sc.nextInt();
            int count = 0;
            for (int i = 1; i < num + 1; i++) {
                int result = getFibo3(i);
                System.out.print(result + "\t");
                count++;
                if (count >= 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }

        static public int getFibo3(int n) {
            int a = 0, b = 1;
            int sum;
            if (n == 1) {
                return 0;
            } else if (n == 2) {
                return 1;
            } else {
                for (int i = 2; i < n; i++) {
                    sum = a + b;
                    a = b;
                    b = sum;
                }
                return b;
            }
        }
    }


}
