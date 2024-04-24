package demo_test.Exception;

public class GenderException extends Exception{

    //定义构造方法
    public GenderException(){
        System.out.println("gender errror");
    }

    public GenderException(String str){
        System.out.println(str);
    }

}
