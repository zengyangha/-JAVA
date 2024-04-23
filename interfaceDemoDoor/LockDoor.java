package demo_test.interfaceDemoDoor;


//实现类，将门定义继承，将锁为接口，还有其他接口就加,衔接
public class LockDoor extends Door implements Lock {


    @Override
    public void opendoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }

    @Override
    public void closeLock() {
        System.out.println("关锁");
    }





}
