package emun.noEmun;

public class Sex {


    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Sex() {
    }

    public Sex(String desc) {
        this.desc = desc;
    }
    public void fun(){
        System.out.println("fun");
    }

    public static final Sex 男=new Sex("靓仔");
    public static final Sex 女=new Sex("靓女");


}
