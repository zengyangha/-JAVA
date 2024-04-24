package demo_test.PageClass;

public class IntegerDemo {
    public static void main(String[] args) {

        int a=10;
        //  a.  没有方法可用
        Integer i = new Integer(10);//已经装箱了
        //  i.  有方法可用，因为此时i成为了对象，

        //以下是通过方法手动进行类型转换
        Integer i2=Integer.valueOf(a);//装箱，让a从int类型变成Integer类型
        int i3=i.intValue();//拆箱，让i从Integer类型转成int类型

        System.out.println(a==i);//其实是会自动转换的

        Float v = new Float(3.14);
        Double v1 = new Double(3.14);

        System.out.println("--------------------------------------------");

        Integer k1=100;//会自动装箱，把包装类变成基本类型,该代码等同于==》 Integer k1=Integer.valueOf(100)
        Integer k2=100;

        Integer k3=200;
        Integer k4=200;
        System.out.println(k1==k2);
        System.out.println(k3==k4);
        //这里出现问题的原因要看Integer的valiuOf方法，
        //200依然超出范围，让k3和k4返回成了对象
        //限制范围是为了减少内存的使用

        System.out.println("--------------------------------------------");
        Integer j=10;
        int k=10;
        System.out.println(j==k);



        System.out.println("--------------------------------------------");

        //装箱：  基本数据类型==》类
        Integer t1=100;//自动装箱，基本类型会自动封装到与它相同类型的包装中==》 Integer k1=Integer.valueOf(100)
        //拆箱：  类==》基本数据类型
        int t2=new Integer(100);//自动拆箱，包装类对象自动转换成基本数据类型==》int t2=new Integer(100).intValue();


        Double d1=1.0;
        Double d2=1.0;
        Double d3=2.0;
        Double d4=2.0;
        System.out.println(d1==d2);
        System.out.println(d3==d4);

    }
}
