package demo_test;

public class PaiXu {

    //冒泡排序
    static public class Array1 {
        public static void main(String[] args) {

            int arr[] = {3, 6, 2, 8, 4, 1};
            System.out.println("未转化前：3,6,2,8,4,1");
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int poin = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = poin;
                    }
                }
            }
            System.out.println("转话后：");
            for (int j : arr) {
                System.out.print(j + "\t");
            }
        }
    }

    //选择排序
    static public class Array2 {
        public static void main(String[] args) {
            int arr[] = {3, 6, 2, 8, 4, 1};
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int poin = arr[i];
                        arr[i] = arr[j];
                        arr[j] = poin;
                    }
                }
            }
            System.out.println("转话后：");
            for (int j : arr) {
                System.out.print(j + "\t");
            }
        }
    }
}
