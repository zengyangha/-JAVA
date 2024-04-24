package demo_test.PageClass;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println("获取当前时间：（默认格式）"+date);
        System.out.println("从1970年1月1日0时0分0秒到现在：："+date.getTime()+"秒");

        System.out.println("------------------------------");

        //DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  好看，规范
        //指定样式获得时间
        DateFormat simpleDateFormat = new SimpleDateFormat("y-M-d H:m:s");

        String str = simpleDateFormat.format(date);//Date转字符串
        System.out.println("以特定格式显示：（将会把Date属性变为字符串属性）：："+str);

        //将字符串转换成对应日期类
        Date date1 = simpleDateFormat.parse("2021-4-28 20:20:8");//解析日期，字符串转日期
        System.out.println("给特定时间转Date属性"+date1);

        Date date2 = simpleDateFormat.parse(str);//字符转Date
        System.out.println("与上面同样方法，只是这里时当前时间："+date2);

        System.out.println("----------------------------------");





//获取的是当前系统时间,(date慢慢淘汰，有新的Calendar类使用)
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar类表示当前时间："+calendar);
//打印台中：Gregorian,隔离日志，部分属性是从0开始
        System.out.println("-------------------------------");

        //设置指定时间的日历类：
        calendar.setTime(date1);
        System.out.println("calendar指定时间："+calendar);
        System.out.println("calendar指定该时间的常量属性："+calendar.get(Calendar.YEAR));//指定属性
        System.out.println("calendar指定该时间的常量属性："+calendar.get(Calendar.MONTH));
        System.out.println("calendar指定该时间的常量属性："+calendar.get(Calendar.DATE));
        System.out.println("calendar指定该时间的常量属性："+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("calendar指定该时间的常量属性："+calendar.get(Calendar.MINUTE));
        System.out.println("calendar指定该时间的常量属性："+calendar.get(Calendar.SECOND));






    }
}
