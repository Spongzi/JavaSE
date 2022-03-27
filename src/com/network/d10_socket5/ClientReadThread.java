package com.network.d10_socket5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReadThread implements Runnable {
    private Socket socket;

    public ClientReadThread() {
    }

    public ClientReadThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            // 获取一个字节输入流
            InputStream is = socket.getInputStream();

            // 把字节流转化成字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // 按行读取消息
            String message;
            while ((message = br.readLine()) != null) {
                System.out.println("获取的消息是：" + message);
            }
        } catch (Exception e) {
            System.out.println("服务器把你干掉了");
        }
    }
}
