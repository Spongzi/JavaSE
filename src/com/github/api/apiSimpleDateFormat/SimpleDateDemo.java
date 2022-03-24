package com.github.api.apiSimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat 时间毫秒数的格式化
public class SimpleDateDemo {
    public static void main(String[] args) throws ParseException {
        // 先获取时间
        Date date = new Date();
        // 然后日期格式化该毫秒数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a"); // a 根据时间取上午取下午, EEE代表星期
        String format = sdf.format(date);
        System.out.println(format);



        // 求2021年08月06日11点11分11秒，往后走2天14小时49分06秒后的时间是多少
        Date date1 = new Date();
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-8-06 11:11:11");
        System.out.println(parse);
        long time = parse.getTime() + ((62 * 60 + 49) * 60 + 6) * 1000;
        String format1 = sdf.format(time);
        System.out.println(format1);
    }
}
