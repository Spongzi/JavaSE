package com.Thread.d6_thread_syncronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    // final 修饰后唯一不可变
    public final Lock LOCK = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(double drawMoney) {
        // 得到线程名称--> 谁来取钱
        String u = Thread.currentThread().getName();
        LOCK.lock();
        try {
            if (this.money >= drawMoney) {
                // 1. 取钱
                System.out.println(u + "成功取出" + drawMoney);
                // 2. 更新余额
                this.money -= drawMoney;
                // 3. 打印余额
                System.out.println("余额:" + this.money);
            } else {
                System.out.println(u + "来取钱,余额不足");
            }
        } finally {
            LOCK.unlock();
        }
    }
}
