package com.Thread.d8_thread_pool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了: Hello World" + i);
        }
    }
}
