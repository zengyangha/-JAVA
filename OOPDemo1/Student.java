package demo_test.OOPDemo1;

public class Student {
    int num=001;
    String sex="男";
    String name;

    void study(){
        System.out.println("正在学习");
    }

    String eat(String food){
        System.out.println("正在吃"+food);
        return food;
    }

    public static void main(String[] args) {

        //创建对象：
        Student st = new Student();

        st.name="张三";
        //使用属性：
        System.out.println("学生的名字为："+st.name);
        System.out.println("学生的性别为："+st.sex);
        System.out.println("学号为："+st.num);
        //使用方法
        st.eat("香蕉");
        st.study();
    }

}
