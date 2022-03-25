package com.Thread.d2_api;

public class MyThread extends Thread {

    public MyThread() {
    }

    // 来代替setName
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程输出" + i);
        }
    }
}
