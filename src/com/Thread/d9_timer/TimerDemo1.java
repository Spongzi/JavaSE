package com.Thread.d9_timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 目标：Timer定时器的使用和了解
 */
public class TimerDemo1 {
    public static void main(String[] args) {
        // 1. 定义一个定时器
        Timer timer = new Timer(); // 定时器本身就是一个单线程

        // 2. 调用方法，处理定时器任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次~~");
            }
        }, 1000, 3000);
    }
}
