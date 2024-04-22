package demo_test.duotaiTest;

public class Test {


    public static void main(String[] args) {

//        计算单量车租价
        Car car = new Car("宝马",666,"1");
        System.out.println(car.calcRent(5));

        Bus bus = new Bus("金龙",888,20);
        System.out.println(bus.calcRent(5));

        //计算多辆车租价
        MotoVehicle[] moto=new MotoVehicle[4];//数组类型，抽象父类可以作为数组的类型来声明数组
        moto[0]=new Car("小米",999,"1");
        moto[1]=new Car("红米",333,"2");
        moto[2]=new Bus("白龙",567,13);
        moto[3]=new Tank("dongfeng",000,600);

        int totalMoney=calcRent(moto);
        System.out.println(totalMoney);

    }

    public static int calcRent(MotoVehicle[] moto){
        int totalMoney=0;
        for (int i=0;i<moto.length;i++){
            totalMoney+=moto[i].calcRent(5);
        }
        return totalMoney;
    }
}
