package emun.uesEnum;

public enum Sex {

    男("靓仔"),
    购物袋,
    女("靓女");

// 属性，描述信息
    public String desc;

public void fun(){
    System.out.println("fun");
}

    //构造
    private Sex() {
    }

    Sex(String desc) {
        this.desc = desc;
    }
}
