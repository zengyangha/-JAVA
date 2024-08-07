package Fist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

    public static void main(String[] args) throws Exception {

//加载驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");

        //驱动程序管理器 链接,问号为传参
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?serverTimezone=Hongkong","root","123456");

        //编写sql语句
        String sql="insert into grade values(?,?)";

        //准备语句，预编译的statement子接口，支持？占位符
        PreparedStatement ps = connection.prepareStatement(sql);

        //传递参数
        ps.setInt(1,7);
        ps.setString(2,"gg");

        //调用方法,执行方法
        int i = ps.executeUpdate();

        System.out.println(i>0?"插入成功":"插入失败");

        ps.close();
        connection.close();

    }
}
