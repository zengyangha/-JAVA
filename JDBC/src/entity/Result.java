package entity;

            //实体类
public class Result {

    private int result_id;
    private int student_no;
    private int subject_id;
    private int score;
    private String remark;


    public Result() {
    }

    public Result(int result_id, int student_no, int subject_id, int score, String remark) {
        this.result_id = result_id;
        this.student_no = student_no;
        this.subject_id = subject_id;
        this.score = score;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Result{" +
                "result_id=" + result_id +
                ", student_no=" + student_no +
                ", subject_id=" + subject_id +
                ", score=" + score +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getResult_id() {
        return result_id;
    }

    public void setResult_id(int result_id) {
        this.result_id = result_id;
    }

    public int getStudent_no() {
        return student_no;
    }

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
