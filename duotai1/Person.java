package demo_test.duotai1;

public class Person {

    public void feed(Pet pet) {//父类作为参数
        pet.feed();
    }

    public void play(Pet pet) {
        pet.play();
    }

    public Pet buyPet(int type) {//父类作为方法返回值
        if (type==1) {
            return new Dog();
        } else if (type==2) {
            return new Cat();
        }
        return null;
    }

    public static void show(Object obj) {
        if (obj instanceof Dog) {
            System.out.println("买了只狗");
        } else if (obj instanceof Cat) {
            System.out.println("买了只猫");
        }
    }

    public static void main(String[] args) {
        Person pe = new Person();
        Pet dog = new Dog();//该dog对象只能访问Pet类中定义的方法和属性,还有子类中重写了父类的方法可以用，除非向下转型
        Cat cat = new Cat();//这cat能访问Pet的公共方法和属性，还能访问cat类的方法和属性

        //feed是Pet的抽象方法
        pe.feed(dog);
        pe.feed(cat);//应用类型为Cat，但在上面feed方法中，会自动转换为Pet引用类型，称为向上转型

        pe.play(dog);
        pe.play(cat);//没有被重写也能使用父类的方法

        cat.sound();
        //dog.sound();  报错，因为该dog为Pet引用类型，要在该父类创建对应方法才行，除非像下面一样向下转型
        ((Dog)dog).sound();

        Pet pet1 = pe.buyPet(1);//Pet pet1=new Dog();
        Pet pet2 = pe.buyPet(2);//Pet pet2=new Cat();
        show(pet1);
        show(pet2);

    }


}
