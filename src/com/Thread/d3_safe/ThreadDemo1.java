package com.Thread.d3_safe;

/**
 * 模拟取钱
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 1. 定义一个线程类, 创建一个共享账户对象
        Account account = new Account("NC-111", 100000);

        // 2. 创建2个取钱线程对象
        new DrawThread("小红", account).start();
        new DrawThread("小明", account).start();

        System.out.println(account.getMoney());
    }
}