package demo_test.PageClass;

public class EnumTest {
    public static void main(String[] args) {
        //这个用法low
        GenderEnum gender = GenderEnum.男;
        GenderEnum gender1 = GenderEnum.女;



        EventEnum ee=EventEnum.XIAOHEI;
        System.out.println("-------------------");
        ee.show();

        System.out.println("-------------------");

        String name=EventEnum.WANGWU.name();
        System.out.println(name);

        System.out.println("-------------------");

        EventEnum e1=EventEnum.ZHANGSAN;
        e1.show();

    }
}
