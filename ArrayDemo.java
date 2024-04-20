package demo_test;

import java.util.Scanner;

public class ArrayDemo {

    static public class ArrayDemo1 {
        public static void main(String[] args) {


            int[] arr1 = new int[3];
            int[] arr2 = new int[]{1, 2, 3};
//直接初始化操作
            int[] arr3 = {1, 2, 3};
//            int[] arr;
//            arr={1,2,3};这个写法是错误的

            Scanner sc = new Scanner(System.in);
            System.out.println("输入3课成绩：");
            int arr4[] = new int[3];
            for (int i = 0; i < 3; i++) {
                arr4[i] = sc.nextInt();
            }
            System.out.println("输入完毕,成绩为:");
            for (int i = 0; i < 3; i++) {
                System.out.print(arr4[i] + "\t");
            }
            System.out.println();

            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += arr4[i];
            }
            int ave = sum / 3;
            System.out.print("平均分为：" + ave);
        }

    }


    //二维数组
    static public class ArrayDemo2 {
        public static void main(String[] args) {
            int[][] arr = new int[4][];//第一步必须分配空间
            arr[0] = new int[2];
            arr[1] = new int[1];
            arr[2] = new int[2];
            arr[3] = new int[]{6, 7, 8};

            arr[0][0] = 1;
            arr[0][1] = 2;

            arr[1][0] = 3;

            arr[2][0] = 4;
            arr[2][1] = 5;


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }


        }
    }

}
