package lambdaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) throws Exception {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running1----");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> {
            System.out.println("running2---------");
        };
        runnable2.run();

        Runnable runnable3 = () -> System.out.println("running3-----");
        runnable3.run();


        Callable<String> callable1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "calling1-----";
            }
        };

        System.out.println(callable1.call());


        Callable<String> callable2 = () -> {
            return "calling2--------";
        };
        System.out.println(callable2.call());

        Callable<String> callable3 = () -> "calling3";
        System.out.println(callable3.call());

        System.out.println("----------------------------");


        //多种写法：
        StudentDao studentDao1 = new StudentDao() {
            @Override
            public void inser(Student student) {
                System.out.println("插入学生信息");
            }
        };

        StudentDao studentDao2 = (student) -> {
            System.out.println("插入一个学生对象,student:" + student);
        };

        //Student可以不用写
        StudentDao studentDao3 = (Student student) -> System.out.println("插入一个学生对象，student3:" + student);

        studentDao1.inser(new Student());
        studentDao2.inser(new Student());
        studentDao3.inser(new Student());

        System.out.println("--------------");


        TeacherDao teacherDao1= new TeacherDao(){
            @Override
            public int get(Teacher teacher) {
                return 1;
            }
        };

        TeacherDao teacherDao2=(teacher)->{return 2;};
        TeacherDao teacherDao3=(Teacher teacher)->{return 3;};
        TeacherDao teacherDao4=(teacher)->4;
        TeacherDao teacherDao5=(Teacher teacher)->5;

        System.out.println(teacherDao1.get(new Teacher()));
        System.out.println(teacherDao2.get(new Teacher()));
        System.out.println(teacherDao3.get(new Teacher()));
        System.out.println(teacherDao4.get(new Teacher()));
        System.out.println(teacherDao5.get(new Teacher()));

        System.out.println("--------------");

        //java提供一系列函数式接口，用来接受后续传入的逻辑，但对输入有要求
        Function<String,Integer> f1=(str)->{return  str.length();};
        System.out.println(f1.apply("adad88899"));

        System.out.println("--------------");

        Supplier<String> s1=()->{return "asas";};
        Supplier<String> s2=()->"asas";

        System.out.println(s1.get());
        System.out.println(s2.get());

        System.out.println("--------------");

        Consumer<String> c1=(str)-> System.out.println(str);
        c1.accept("jjyy123");

        System.out.println("--------------");

        Runnable run2=()->get();
        run2.run();//不处理

        Runnable run1=()->{int i=get();
            System.out.println(i);
        };
        run1.run();

        System.out.println("--------------");

        LambdaInterface lamda1=()->get();
        LambdaInterface lambd2=()->212;
        LambdaInterface lambd3=()->true?1:0;
        System.out.println(lamda1.get());
        System.out.println(lambd2);
        System.out.println(lambd3);
        System.out.println("--------------");

        //方法引用：
        List<String> list= Arrays.asList("a","b","c");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("--------------");
        list.forEach(System.out::println);

    }

    static int get(){
        return 1;
    }

    static String find(){
        return "find";
    }

    static void print(){
        find();
    }

}
