package stream;

public class Person {

    private  String name;

    public Person() {
    }

    public static Person build(String name){
        Person person = new Person();
        person.setName(name);
        return person;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
