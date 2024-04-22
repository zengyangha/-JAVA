package demo_test.duotaiTest;

public class Car extends MotoVehicle{

    private String type;

    @Override
    public int calcRent(int day) {
        if (type.equals("0")){
            return 600*day;
        } else if (type.equals("1")) {
            return 500*day;
        } else if (type.equals("2")) {
            return 300*day;
        }else System.out.println("类型不匹配");
        return 0;
    }

    public Car(String type) {
        this.type = type;
    }

    public Car(String brand, int no, String type) {
        super(brand, no);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
