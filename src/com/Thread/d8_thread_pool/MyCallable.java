package com.Thread.d8_thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable() {
    }

    public MyCallable(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n;
        }
        return Thread.currentThread().getName() + "计算1-" + n + "的和为：" + sum;
    }
}
