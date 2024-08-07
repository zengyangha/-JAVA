package B8_5.entity;

import java.util.Date;

//实体类
public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private String desc;
    private Date Listing_date;

    public Goods(Integer id, String name, Double price, String desc, Date listing_date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
        Listing_date = listing_date;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", Listing_date=" + Listing_date +
                '}';
    }

    public Goods(Integer id, String name, Double price, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Goods(String name, Double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getListing_date() {
        return Listing_date;
    }

    public void setListing_date(Date listing_date) {
        Listing_date = listing_date;
    }
}
