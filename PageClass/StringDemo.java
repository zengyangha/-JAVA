package demo_test.PageClass;

public class StringDemo {
    public static void main(String[] args) {

        String str1="abc";
        String str2 = new String("abc");
        System.out.println(str1==str2);//比的是首地址
        System.out.println((str1).equals(str2));//比的是内容

        //多看源码：
        System.out.println(str1.charAt(0));
        //数组复制并增加过程：
        System.out.println(str1.concat("lmn"));
        System.out.println();

        System.out.println("----------------------------");

        String a="abc";
        String b="lmn";
        String c="abclmn";


        String d=a+b;//程序编译的时候，这里a和b都是字符串， 他们分别指向两块对象的 内存的空间
        String e="abc"+"lmn";//这里直接指向字符串了

        String j=(a+b).intern();

        System.out.println(c==d);
        System.out.println(c==e);
        System.out.println(c==j);

        System.out.println("------------------- ---------");

        String p="a"+"b"+"c";//一个对象
        String p1="a";
        String p2="b";
        String p3="c";
        String p4=p1+p2+p3;//四个对象

        //字符串中，数组的引用不可变，并不是指数组的值不可变


        //还有StringBuff和StirngBuild,不详细介绍

    }
}
