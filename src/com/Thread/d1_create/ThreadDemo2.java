package com.Thread.d1_create;

/**
 * 目标：学会线程创建方式二，理解优缺点
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        // 创建任务类对象
        Runnable target = new MyRunnable();
        // 把任务对象交给Thread对象，并启动
        new Thread(target).start();

        for (int i = 0; i < 50; i++) {
            System.out.println("主线程执行输出：" + i + "~~~");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}
