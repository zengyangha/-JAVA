package demo_test.duotaiTest;

public abstract class MotoVehicle {
    public int no;
    public String brand;

    public abstract int calcRent(int day);

    public MotoVehicle(){

    }

    public MotoVehicle(String brand,int no){
        this.brand=brand;
        this.no=no;
    }
}
