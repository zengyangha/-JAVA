package Fist;

import entity.Result;
import jdbc.JdbcTools;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {

    }

    //删
    private static void fun4() {
        String sql="delete from result where result_id=?";
        Object[] params={2};
        int i=JdbcTools.eUpdate(sql,params);
        System.out.println(i>0?"删除成功":"删除失败");
    }

    //修改
    private static void fun3() {
        String sql="update result set student_no=?,subject_id=?,score=?,remark=? where result_id=?";
        Object[] params={88,88,88,88,2};
        int i=JdbcTools.eUpdate(sql,params);
        System.out.println(i>0?"修改成功":"修改失败");
    }

    //查询
    private static void fun2() {
        String sql="Select * from result";
        List<Result> list=JdbcTools.query(sql,null);
        System.out.println("成绩ID\t"+"学生学号\t"+"科目ID\t"+"成绩\t"+"备注\t");
//        list.forEach(System.out::println);


        for (Result result : list) {
            System.out.print(result.getResult_id()+"\t"+result.getStudent_no()+"\t"+
                    result.getSubject_id()+"\t"+result.getScore()+"\t"+result.getRemark()+"\n"
                    );

        }
    }

    //添加
    private static void fun1() {
        String sql="insert into result values(?,?,?,?,?)";
        Object[] params={6,6,6,6,"sadasd"};
        int i = JdbcTools.eUpdate(sql, params);

        System.out.println(i>0?"插入成功":"插入失败");
    }
}
