package demo_test.duotaiTest;

public class Tank extends MotoVehicle{

    private int weight;

    @Override
    public int calcRent(int day) {
        return 50*day*weight;
    }

    public Tank(){

    }

    public Tank(String brand, int no, int weight) {
        super(brand, no);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
