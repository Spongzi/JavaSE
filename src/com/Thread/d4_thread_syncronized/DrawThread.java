package com.Thread.d4_thread_syncronized;

/**
 * 取钱类线程
 */
public class DrawThread extends Thread {
    private Account account;

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        // 取钱操作
        account.drawMoney(100000);
    }
}
