package com.Thread.d8_thread_pool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象，并且测试
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        /*ExecutorService pool = new ThreadPoolExecutor(int corePoolSize, 核心数量
        int maximumPoolSize, 最大线程数量
        long keepAliveTime, 最大存活时间
        TimeUnit unit, 时间单位
        BlockingQueue<Runnable> workQueue, 任务阻塞队列
        ThreadFactory threadFactory, // 线程工厂
        RejectedExecutionHandler handler) 任务拒绝策略*/

        // Executors.defaultThreadFactory() 默认初始化工厂
        // ThreadPoolExecutor.AbortPolicy() 默认拒绝策略
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        // 2. 给任务线程池处理
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
    }
}
