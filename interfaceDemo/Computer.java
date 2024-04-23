package demo_test.interfaceDemo;

public class Computer {

    public void show(CPU cpu,Menory menory){
        System.out.println("电脑配件组成如下：");
        System.out.println("CPU:"+cpu.type()+"\t频率为："+cpu.HZ());
        System.out.println("内存为："+menory.type());
    }
}
