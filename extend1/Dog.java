package demo_test.extend1;

public class Dog extends Pet {
    private String sound;


    public static void main(String[] args) {


    }

    public void play() {
        super.climb();
        super.play();
        System.out.println("在摇尾巴");
        super.play();
    }

    public String toString(){
        return super.toString()+"dog sound is"+sound;
    }

    @Override
    public void cry() {
        System.out.println("dog cry");
    }

    //构造函数
    public Dog() {
//        super();  自动生成，可写可不写
        System.out.println("Dog  无参构造方法");
    }

    public Dog(String name, int age, String gender, String sound) {
//        this();  //这里不能放
        super(name, age, gender);//必须放第一位
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
