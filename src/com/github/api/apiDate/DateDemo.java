package com.github.api.apiDate;

import java.util.Date;

// 学会使用date类，获取时间信息
public class DateDemo {
    public static void main(String[] args) {
        // 1. 创建一个Date类： 代表当前日期的对象
        Date d = new Date();
        System.out.println(d);

        // 2. 获取时间毫秒值
        long time = d.getTime();
        // long l = System.currentTimeMillis(); // 使用System的库来获得时间毫秒值
        System.out.println(time);

        System.out.println("=================================");


        // 获得当前时间 即是Time
        // 将时间向后推移了一小时121秒
        time += (60 * 60 + 121) * 1000;
        // 将毫秒数转化为日期对象
        d.setTime(time);
        System.out.println(d);
    }
}
