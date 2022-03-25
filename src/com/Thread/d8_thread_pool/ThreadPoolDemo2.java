package com.Thread.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolDemo2 {
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
        Future<String> f1 = pool.submit(new MyCallable(10));
        Future<String> f2 = pool.submit(new MyCallable(20));
        Future<String> f3 = pool.submit(new MyCallable(30));
        Future<String> f4 = pool.submit(new MyCallable(40));
        Future<String> f5 = pool.submit(new MyCallable(50));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
