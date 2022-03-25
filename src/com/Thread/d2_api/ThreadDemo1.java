package com.Thread.d2_api;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread("张三~~");
//        t.setName("线程三"); 可以通过构造器来定义名字
        t.start();

        Thread t1 = new MyThread("李四~~");
//        t1.setName("线程二");
        t1.start();

        // 主线程的名字就是main
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程输出" + i);
        }
    }
}
