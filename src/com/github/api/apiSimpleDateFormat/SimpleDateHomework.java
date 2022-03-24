package com.github.api.apiSimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateHomework {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 秒杀开始的时间
        Date startTime = simpleDateFormat.parse("2020年11月11日 00:00:00");

        // 秒杀结束的时间
        Date endTime = simpleDateFormat.parse("2020年11月11日 00:10:00");

        // 小贾下单的时间
        Date JiaTime = simpleDateFormat.parse("2020年11月11日 00:03:47");

        // 小皮下单的时间
        Date PiTime = simpleDateFormat.parse("2020年11月11日 00:10:11");

        if (JiaTime.before(endTime) && JiaTime.after(startTime)) {
            System.out.println("小贾参加了秒杀活动");
        } else {
            System.out.println("小贾没有参加秒杀活动");
        }
        if (PiTime.before(endTime) && PiTime.after(startTime)) {
            System.out.println("小皮参加了秒杀活动");
        } else {
            System.out.println("小皮没有参加秒杀活动");
        }
    }
}
