package pcJUC;

public class Goods {

    private String brand;
    private String name;

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
}
