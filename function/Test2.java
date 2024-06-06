package function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test2 {

    public static void main(String[] args) {

        //构造方法引用
        Supplier<Person> s1 = () -> new Person();
        s1.get();

        Supplier<Person> s2 = Person::new;
        s2.get();

        Supplier<List> listSupplier = ArrayList::new;
        Supplier<Set> setSupplier = HashSet::new;

        Consumer<String> stringConsumer = (str) -> new Account(str);
        Consumer<String> stringConsumer2 = Account::new;
        stringConsumer.accept("sdas");
        stringConsumer2.accept("sdas");

        System.out.println("-----------------");

        Function<String,Account> stringAccountFunction=(str)->new Account(str);
        Function<String,Account> stringAccountFunction2= Account::new;
        stringAccountFunction.apply("dddddd");
        stringAccountFunction2.apply("dddddd");


    }


}
