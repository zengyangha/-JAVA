package demo_test.duotaiTest;

public class Bus extends MotoVehicle{

    private int seatCount;

    @Override
    public int calcRent(int day) {
        if (seatCount>16){
            return 1500*day;
        }else {
            return 800*day;
        }
    }

    public Bus(int seatCount) {
        this.seatCount = seatCount;
    }

    public Bus(String brand, int no, int seatCount) {
        super(brand, no);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
