package B8_5.utils;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

public class Tools {

    private static String driver;
    private static String url;
    private static String user;
    private static String password;


    static {
        try {
            //读取配置文件
            Properties properties = new Properties();
            properties.load(Tools.class.getClassLoader().getResourceAsStream("jdbc.properties"));

            driver = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            user = properties.getProperty("jdbc.user");
            password = properties.getProperty("jdbc.password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //数据库链接池，得到一个链接对象
    public static DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }


}
