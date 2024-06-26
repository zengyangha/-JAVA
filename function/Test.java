package function;

import java.util.function.*;

public class Test {

    public static String put() {
        System.out.println("put....");
        return "put";
    }

    public static void getSize(int size) {
        System.out.println(size);
    }

    public static String toBig(String str) {
        return str.toUpperCase();
    }

    public static Integer getLength(String str1, String str2) {
        return str1.length() + str2.length();
    }


    public static void main(String[] args) {
        // 使用Lambda表达式来实现Supplier接口
        Supplier<String> s1 = () -> Test.put();
        // 调用Supplier的get方法
        System.out.println(s1.get());

        System.out.println("--------------------");

        //静态方法引用：
        Supplier<String> s2 = Test::put;
        System.out.println(s2.get());

        System.out.println("--------------------");

        Supplier<String> s3 = Fun::point;
        System.out.println(s3.get());
        System.out.println("--------------------");

        Consumer<Integer> c1 = Test::getSize;
        Consumer<Integer> c2 = (size) -> Test.getSize(size);
        c1.accept(888);
        c2.accept(999);


        System.out.println("--------------------");
//引用了 String 类的实例方法 toUpperCase
//        Function<String, String> f1 = (str) -> str.toUpperCase();
        Function<String, String> f1 = String::toUpperCase;
//        Function<String, String> f2 = (str) -> Test.toBig(str);
        Function<String, String> f2 = Test::toBig;
        Function<String, String> f3 = Test::toBig;
        Function<String, String> f4 = Fun::toBig;
        System.out.println(f1.apply("asd"));
        System.out.println(f2.apply("asd"));
        System.out.println(f3.apply("asd"));
        System.out.println(f4.apply("asd"));

        System.out.println("--------------------");

        BiFunction<String, String, Integer> bf1 = (a, b) -> a.length() + b.length();
        BiFunction<String, String, Integer> bf2 = (Test::getLength);
        System.out.println(bf1.apply("abc", "scf"));
        System.out.println(bf2.apply("abc", "sf"));

        System.out.println("--------------------");

        //实例方法引用：（调用非静态方法）
        System.out.println(new Test().get());

        Supplier<String> supplier1 = () -> new Test().get();

        Supplier<String> supplier2 = new Test()::get;
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

        System.out.println("--------------------");

        Consumer<String> consumer1 = (size) -> new Test().getSize(size);
        consumer1.accept("abcd");

        Consumer<String> consumer2 = new Test()::getSize;
        consumer2.accept("efghi");

        Function<String, String> f5 = new Test()::getBig;
        System.out.println(f5.apply("asd"));


        //对象方法引用（）
        Test test = new Test();
        Consumer<String> consumer3 = test::getSize;
        consumer1.accept("213");
        consumer2.accept("213");
        consumer3.accept("213");

        System.out.println("--------------------");

        //对象方法引用
        //泛型类型确保了 accept 方法的参数类型正确
//        Consumer<Fun> funConsumer1=(Fun aa)->new Fun().ffff();
        Consumer<Fun> funConsumer1 = Fun::ffff;
        funConsumer1.accept(new Fun());

        Consumer<Fun> funConsumer2 = (Fun bb) -> new Fun2().ffff();//(Fun bb)可改为一个无意义参数，但注意必须以泛型内为标准
        funConsumer2.accept(new Fun());

        Consumer<Fun2> funConsumer9 = (Fun2 bb) -> new Fun().ffff();//(Fun bb)可改为一个无意义参数，但注意必须以泛型内为标准
        funConsumer9.accept(new Fun2());

        //报错Fun2
//        Consumer<Fun> funConsumer3=(Fun2 A)->new Fun2().ffff();
//        Consumer<Fun> funConsumer3=Fun2::ffff;

        Consumer<Fun2> funConsumer3 = Fun2::ffff;
        funConsumer3.accept(new Fun2());

        System.out.println("--------------------");

        BiConsumer<Fun2, String> biConsumer1 = (fun2, str) -> new Fun2().show(str);
        BiConsumer<Fun2, String> biConsumer2 = Fun2::show;
        biConsumer1.accept(new Fun2(), "aasd");
        biConsumer2.accept(new Fun2(), "aasd");

    }

    public String getBig(String str) {
        return str.toUpperCase();
    }

    public void getSize(String size) {
        System.out.println(size);
    }

    public String get() {
        return "get....";
    }

}
