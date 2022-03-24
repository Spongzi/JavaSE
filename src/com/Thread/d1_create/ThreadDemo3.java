package com.Thread.d1_create;

/**
 * 多线程实现方式二，匿名内部类的实现
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程执行输出：" + i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}
