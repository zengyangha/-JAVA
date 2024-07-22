package emun.uesEnum;

import emun.uesEnum.Sex;

public class Test {

    public static void main(String[] args) {

        Sex[] values = Sex.values();

        for (Sex sex : values
        ) {
            //name()方法是系统的方法，表示得到当前枚举的名字
            String name = sex.name();
            //使用自定义属性
            String desc= sex.desc;

            System.out.println(name+":"+desc);
        }

        Sex sex1 = Sex.购物袋;
        sex1.fun();


    }


}
