package demo_test.interfaceDemo;

public class AMDCpu implements CPU{
    @Override
    public String type() {
        return "AMD 7900XT CPU";
    }

    @Override
    public String HZ() {
        return "5.0G";
    }
}
