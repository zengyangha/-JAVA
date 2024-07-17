package demo_test.InterfaceMethod;

public class Rice implements Food{

    //重写接口的默认行为
    @Override
    public void describe() {
        System.out.println("现在这样有一碗米饭");
    }
}
