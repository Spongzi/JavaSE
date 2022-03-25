package com.Thread.d8_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用工具方法直接得到一个线程池对象
 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        // 1. 创建固定线程池的线程对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 2. 提交任务
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        // 此时以及没有多余的线程了
        pool.execute(new MyRunnable());
    }
}
