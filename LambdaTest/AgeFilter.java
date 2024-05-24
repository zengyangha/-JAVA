package LambdaTest;

public class AgeFilter implements StudentFilter{
    @Override
    public boolean compare(Student student) {
        return student.getAge()>50;
    }
}
