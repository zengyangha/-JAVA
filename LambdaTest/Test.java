package LambdaTest;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("zhangsan", 12, 77));
        list.add(new Student("lisi", 44, 22));
        list.add(new Student("wangwu", 22, 44));
        list.add(new Student("laoliu", 66, 88));
        list.add(new Student("xiaoqi", 88, 11));

        findByAge(list);
        findByScore(list);
    }


    public static void findByAge(ArrayList<Student> students) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student stu : students) {
            if ((stu.getAge() > 50)) {
                list.add(stu);
            }
        }
        System.out.println("年龄大于50的有：");

        for (Student student : list) {
            System.out.println(student);
        }

    }

    public static void findByScore(ArrayList<Student> students) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student stu : students) {
            if ((stu.getScore() > 50)) {
                list.add(stu);
            }
        }
        System.out.println("分数大于50的有：");

        for (Student student : list) {
            System.out.println(student);
        }

    }


}
