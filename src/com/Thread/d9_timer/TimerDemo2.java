package com.Thread.d9_timer;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo2 {
    public static void main(String[] args) {
        // 1. 创建ScheduledExecutorService线程池，做定时器
        ScheduledExecutorService timer = Executors.newScheduledThreadPool(3);

        // 2. 开启定时器
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("AAA~~~~执行");
            }
        }, 0, 3000, TimeUnit.MILLISECONDS);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("BBB~~~~执行");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 3000, TimeUnit.MILLISECONDS);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("CCC~~~~执行");
            }
        }, 0, 3000, TimeUnit.MILLISECONDS);
    }
}
