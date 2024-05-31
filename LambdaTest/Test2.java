package LambdaTest;

import java.util.ArrayList;


        //与tset相比，这个如果要添加需求，只需写多个实现类
public class Test2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("zhangsan", 12, 77));
        list.add(new Student("lisi", 44, 22));
        list.add(new Student("wangwu", 22, 44));
        list.add(new Student("laoliu", 66, 88));
        list.add(new Student("xiaoqi", 88, 11));


        getByFilter(list, new AgeFilter());
        System.out.println("------------------------------------");
        getByFilter(list, new ScoreFilter());
    }

    public static void getByFilter(ArrayList<Student> students, StudentFilter filter) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (filter.compare(student)) {
                list.add(student);
            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }


}
