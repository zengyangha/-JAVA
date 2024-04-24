package demo_test.PageClass;

public enum EventEnum {

    //枚举类也是类,"小黑"为私有，通过方法获取
    XIAOHEI("小黑"),ZHANGSAN("张三"),WANGWU("王五");
    private String name;

    EventEnum(String name) {//已经默认public static finally了
        this.name = name;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println("1----------------");
        EventEnum[] ee=values();//values为该枚举类中的所有内容
        for (int i=0;i<ee.length;i++){
            System.out.println(ee[i]);
            System.out.println(ee[i].name);
        }
    }



}
