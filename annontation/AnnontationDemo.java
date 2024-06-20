package annontation;

import java.lang.annotation.*;

public class AnnontationDemo {


    @MyAnnontation(grilFridend = "shangsan")
    public void show(){
        System.out.println("asd");
    }


    @Target({ElementType.METHOD,ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    @Documented
    @Inherited
    @interface MyAnnontation{

        String name() default "lisi";
        int age() default 44;
        String[] house() default {"a","b","c"};

        String grilFridend();


    }


}
