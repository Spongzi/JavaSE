package com.Thread.d2_api;

public class ThreadDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("你猜猜我要输出什么" + i);

            if (i == 3) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
