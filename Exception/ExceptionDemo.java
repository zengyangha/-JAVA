package demo_test.Exception;

public class ExceptionDemo {

    //普通抛出异常：
    static public class ExceptionDemo1{
        public static void main(String[] args) {

            try {
                show();
            }catch (Exception e){
                System.out.println("catrch error");
            }
        }

        public static void show() throws Exception{//throws为声明异常，作用是往外抛出异常
            String gender="888";
            if ((gender).equals("man")){
                System.out.println("man");
            } else if ((gender).equals("woman")) {
                System.out.println("woman");
            }else {
                throw new Exception();
            }

        }
    }

    //自定义抛出异常
    static public class ExceptionDemo2{
        public static void main(String[] args) {

            try {
                show();
            }catch (Exception e){//这里写GenderException也可
                System.out.println("catrch error");
            }
        }

        public static void show() throws Exception{//这里写GenderException也可
            String gender="888";
            if ((gender).equals("man")){
                System.out.println("man");
            } else if ((gender).equals("woman")) {
                System.out.println("woman");
            }else {
                //throw new GenderException();
                throw new GenderException("gender is wrong");
            }

        }



    }


}
