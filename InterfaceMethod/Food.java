package demo_test.InterfaceMethod;

public interface Food {

    //定义默认方法（行为）
    default void describe() {
        System.out.println("水是根本的食物");
    }

    //静态工厂方法
    static Food getFistFood() {
        return new Pizza();
    }

    static Food getSeconeFood() {
        return new Rice();
    }

    static void getThridFood(String food) {
        System.out.println("你想吃什么就吃什么，现在你想吃"+food+"?");
    }


}
