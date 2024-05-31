package lambdaDemo;

import java.util.concurrent.Callable;

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




    }
}
