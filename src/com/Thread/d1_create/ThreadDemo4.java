package com.Thread.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 目标：学会线程创建方式三，实现callable接口，结合FutureTask完成
 */
public class ThreadDemo4 {
    public static void main(String[] args) throws Exception {
        // 3. 创建Callable对象
        Callable<String> call = new MyCallable(100);

        // 4. 把Callable交给FutureTask对象
        // FutureTask对象作用1：是Runnable的对象，实现了Runnable对象，可以交给Thread对象了
        // FutureTask对象作用2：线程调用完后可以通过调用get方法得到线程执行完的结果
        FutureTask<String> futureTask = new FutureTask<>(call);

        // 5. 交给Thread处理
        Thread t = new Thread(futureTask);

        // 6. 启动线程
        t.start();

        System.out.println(futureTask.get());
    }
}

// 1. 定义一个任务类，应该声明线程执行完毕后的结果数据类型
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * 2. 重写call方法（任务方法）
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程执行的结果是" + sum;
    }
}

