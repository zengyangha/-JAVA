package demo_test.interfaceDemo;

public class InterCpu implements CPU{
    @Override
    public String type() {
        return "inter i5 cpu";
    }

    @Override
    public String HZ() {
        return "频率为3.8";
    }
}
