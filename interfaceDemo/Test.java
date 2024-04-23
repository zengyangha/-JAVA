package demo_test.interfaceDemo;

public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        CPU cpu = new InterCpu();
        Menory menory = new KingMenory();

        computer.show(cpu,menory);

    }
}
