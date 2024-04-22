package demo_test.duotai1;

public class Dog extends Pet{


    @Override
    public void feed() {
        System.out.println("吃骨头");
    }


    public void sound(){
        System.out.println("wang wang");
    }

    public void play(){
        System.out.println("玩骨头");
    }

}
