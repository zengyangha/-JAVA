package demo_test.InterfaceMethod;

public class Pizza implements Food{

    //重写接口的默认行为
    @Override
    public void describe() {
        System.out.println("现在这里有个披萨");
    }
}
