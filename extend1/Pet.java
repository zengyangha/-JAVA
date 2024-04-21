package demo_test.extend1;

public abstract class Pet {//Pet为父类，也是抽象类，可写成public abstract clsaa Pet,
    // 用来限制抽象

    private String name;
    private int age;
    private String gender;


    public static void main(String[] args) {

    }

    public void play() {//如果该类是抽象方法，则不在需要构造方法，因为抽象类不能实例化，这里仅此为子类进行调用
        System.out.println("玩耍");
    }

    public void climb(){
        System.out.println("pet climb");
    }

    public String toString(){
        return "name:"+name+"age:"+age+"gender";
    }

    public abstract void cry();//抽象方法

    //构造方法：
    public Pet() {
        System.out.println("Pet 无参构造方法");
    }

    public Pet(String name, int age, String gender) {
       // this();   //这里会调用上面的Pet()
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
