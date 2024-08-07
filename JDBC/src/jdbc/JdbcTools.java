package jdbc;

import entity.Result;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//包名应该为utils，工具类
public class JdbcTools {

    private static String driver = null;
    private static String url = null;
    private static String user = null;
    private static String password = null;

    private static Connection connection = null;

    static {
        try {
            //创建配置文件对象，链接配置文件
            Properties properties = new Properties();
            //properties.load(new FileReader("jdbc.properties"));
            InputStream resourceAsStream = JdbcTools.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(resourceAsStream);

            //读取配置文件
            driver = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            user = properties.getProperty("jdbc.user");
            password = properties.getProperty("jdbc.password");

            System.out.println(driver + "\t" + url + "\t" + user + "\t" + password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //增删改通用方法，paremates是要传递的参数
    //Object... 相当于是数组
    public static int eUpdate(String sql, Object... params) {
        //受影响的行数
        int iret = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //参数不为空则传入参数
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject((i + 1), params[i]);
                }
            }
            iret = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//关闭资源
            closeAll(connection, preparedStatement, null);
        }
        return iret;
    }

    //查询表信息，返回集合对象
    public static List<Result> query(String sql, Object... params) {
        List<Result> list = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            list = new ArrayList<>();
            //得到链接
            connection = getConnection();
            //准备语句
            preparedStatement = connection.prepareStatement(sql);

            //传递参数
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject((i + 1), params[i]);
                }
            }
            //得到结果集
            resultSet = preparedStatement.executeQuery();

            //遍历结果集
            while (resultSet.next()) {//返回true或者false
                Result result = new Result();
                result.setResult_id(resultSet.getInt("Result_id"));
                result.setStudent_no(resultSet.getInt("Student_no"));
                result.setSubject_id(resultSet.getInt("Subject_id"));
                result.setScore(resultSet.getInt("Score"));
                result.setRemark(resultSet.getString("Remark"));

                list.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeAll(connection, preparedStatement, resultSet);
        }
        return list;
    }


    //获得链接,获得数据库的对象
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                //驱动程序管理器链接
                connection = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


    //关闭数据库资源
    public static void closeAll(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
