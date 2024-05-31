package LambdaTest;


        //这个是函数式接口

@FunctionalInterface//这个注解可判断是否是函数式接口
public interface StudentFilter {
    boolean compare(Student student);


}
