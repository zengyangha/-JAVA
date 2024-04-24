package demo_test.Exception;

public class FinallyDemo {

    //情况一：finally没有return
    static public class FinallyDemo1 {
        public static void main(String[] args) {
            System.out.println(test());
        }

        public static int test() {
            int num = 10;
            try {
                System.out.println("这是try");
                System.out.println();
                return num += 80;
            } catch (Exception e) {
                System.out.println("erroe");
            } finally {
                if (num > 20) {
                    System.out.println("num>20:" + num);
                }
                System.out.println("这是finally");
            }
            return num;
        }
    }
/*
结果为：
这是try

num>20:90
这是finally
90

显然  return num += 80;拆成两个语句，先执行num += 80，然后将其保存，在try return num执行前，
先将finall中的语句执行，再将num返回

 */


    //情况二,try和finally中都有return
    static public class FinallyDemo2 {
        public static void main(String[] args) {
            System.out.println(test());
        }

        public static int test() {
            int num = 10;
            try {
                System.out.println("这是try");
                System.out.println();
                return num += 80;
            } catch (Exception e) {
                System.out.println("erroe");
            } finally {
                if (num > 20) {
                    System.out.println("num>20:" + num);
                }
                System.out.println("这是finally");
                num = 100;
                return num;
            }
        }
    }

/*
finally 在return前执行
结果为：
这是try

num>20:90
这是finally
100

 */


    //情况三，在finally中改变返回值
    static public class FinallyDemo3 {
        public static void main(String[] args) {
            System.out.println(test());
        }

        public static int test() {
            int num = 10;
            try {
                System.out.println("这是try");
                System.out.println();
                return num += 80;
            } catch (Exception e) {
                System.out.println("erroe");
            } finally {
                if (num > 20) {
                    System.out.println("num>20,num=" + num);
                }
                System.out.println("这是finally");
                num = 100;
            }
            return num;
        }
    }
/*
结果为：
这是try

num>20,num=90
这是finally
90

 */


    //情况四：（num的值包装在Num类中）
    static public class FinallyDemo4 {
        public static void main(String[] args) {
            System.out.println(test().num);
        }

        static private Num test(){
            Num number = new Num();
            try {
                System.out.println("try");
                System.out.println();
                return number;
            }catch (Exception e){
                System.out.println("error");
            }finally {
                System.out.println("finally");
                number.num=100;
            }
            return number;
        }

    }

    static class Num{
        public int num=10;
    }
    /*
    结果为：
try

finally
100
     */





}
