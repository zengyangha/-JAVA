package LambdaTest;

public class ScoreFilter implements StudentFilter{
    @Override
    public boolean compare(Student student) {
        return student.getScore()>50;
    }
}
