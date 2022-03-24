package com.Thread.d1_create;

/**
 * 目标：多线程创建方式一：继承thread类实现
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 3. new 一个新线程对象
        Thread t = new MyThread();
        // 4. 启动线程--> 最终执行的还是run方法
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

 /**
 * 1. 定义一个自己的线程， 必须要继承Thread
 */
class MyThread extends Thread {
     /**
      * 2. 重写run方法
      */
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println("子线程执行输出：" + i);
         }
     }
 }
