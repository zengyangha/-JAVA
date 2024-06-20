package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {


    //通过数组生成
    static void gen1() {
        String[] strs = {"a", "b", "c", "d"};
        //数组转stream
        Stream<String> strs1 = Stream.of(strs);
        strs1.forEach(System.out::println);
    }

    //通过集合生成
    static void gen2() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

    //通过generate生成
    static void gen3() {
        Stream<Integer> generate = Stream.generate(() -> 1);
        //以下的注意，因为没有限制，所以会不断运行
        //  generate.forEach(System.out::println);

//加了限制
        generate.limit(10).forEach(System.out::println);
    }

    //使用iterator
    static void gen4() {
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(10).forEach(System.out::println);

    }


    //其他方式：
    static void gen5() {
        String str = "asdfghjkl";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);
    }

    public static void main(String[] args) {

        //stream生成操作
        gen1();
        System.out.println("-------------------");
        gen2();
        System.out.println("-------------------");
        gen3();
        System.out.println("------- ------------");
        gen4();
        System.out.println("-------------------");
        gen5();
        System.out.println("-------------------");


        //中间操作
        System.out.println("-----中间操作-------------");
        Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter((x) -> x % 2 == 0).forEach(System.out::println);
        System.out.println("-------------------");
        long count = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).count();
        System.out.println(count);
        System.out.println("-------------------");

        //这里使用了 mapToInt 方法，它将流中的元素映射为 int 类型，由于原始流中的元素已经是 Integer 类型，
        // 这个操作相当于将 Integer 映射为 int。
        // Lambda 表达式 x -> x 表示的是一个身份映射(identity mapping)，即每个元素映射为其自身。
        //mapToInt作用是将一个 Stream<Integer> 转换为 IntStream，以便能够使用 IntStream 的 sum 方法来计算所有偶数元素的和
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
        System.out.println("-------------------");

        Integer i1 = Arrays.asList(1, 2, 3, 4, 5, 6).stream().max((a, b) -> a - b).get();
        System.out.println(i1);
        System.out.println("-------------------");

        Integer i2 = Arrays.asList(1, 2, 3, 4, 5, 6).stream().min((a, b) -> a - b).get();
        System.out.println(i2);

        System.out.println("-------------------");

        //顺序流：如果你使用的是顺序流（stream()），findAny 的行为与 findFirst 相同，会返回第一个元素。
        //Optional 是一个泛型类，可以包含任意类型的值,
        // Optional 是一个容器类，它可以包含一个非空的值，也可以为空。Optional 用于避免出现空指针异常
        Optional<Integer> any = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter((x) -> x % 2 == 0).findAny();
        System.out.println(any.get());
        System.out.println("-------------------");

        Optional<Integer> find = Arrays.asList(1, 3, 5, 6).stream().filter((x) -> {
            System.out.println("正在运行");
            return x % 2 == 0;
        }).findFirst();

        System.out.println(find.get());
        System.out.println("-------------------");

        Optional<Integer> min = Arrays.asList(1, 2, 3, 4, 5, 6).stream().sorted().findFirst();
        System.out.println(min.get());

        Optional<Integer> max = Arrays.asList(1, 2, 3, 4, 5, 6).stream().sorted((x, y) -> y - x).findFirst();
        System.out.println(max.get());
        System.out.println("-------------------");

        Arrays.asList("a", "bb", "ccc", "dddd").stream().sorted().forEach(System.out::println);
        System.out.println("-------------------");

        Arrays.asList("a", "bb", "ccc", "dddd").stream().sorted((x, y) -> y.length() - x.length()).forEach(System.out::println);


        System.out.println("-------------------");
        //将集合过滤的同时返回一个集合对象
        List<Integer> collect = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("-------------------");
        //去重
        Arrays.asList(1, 2, 2, 2, 5, 6).stream().distinct().forEach(System.out::println);
        System.out.println("-------------------");
        Arrays.asList(1, 2, 2, 2, 5, 6).stream().collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("-------------------");

        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).forEach(System.out::println);
        System.out.println("-------------------");

        String str="11,22,33,44,55";
        //分割后将字符串转为int类型
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
        //实例方法引用
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        System.out.println("-------------------");
        //打印数值，同时打印和结果
        //peek 方法主要用于调试或在处理流水线中的某个步骤中查看每个元素的状态
        int sum1 = Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum();
        System.out.println("和为"+sum1);

        System.out.println("-------------------");

        String str2="aa,bb,cc,dd,cc";
        //map 方法接受一个函数作为参数，这个函数会被应用到流中的每个元素上,用于将一个流中的每个元素应用一个函数，并将结果收集到一个新的流中
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        System.out.println("-------------------");

        //构造方法引用
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        System.out.println("-------------------");

        Stream.of(str2.split(",")).map(x->Person.build(x)).forEach(System.out::println);
        System.out.println("-------------------");

        //静态方法引用
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);




    }
}


















