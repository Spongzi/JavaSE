package com.network.d8_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReadThread implements Runnable {
    private Socket socket;

    public ServerReadThread() {
    }

    public ServerReadThread(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        InputStream is = null;
        try {
            // 获取一个字节输入流
            is = socket.getInputStream();

            // 把字节流转化成字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // 按行读取消息
            String message;
            while ((message = br.readLine()) != null) {
                System.out.println("获取的消息是" + message + "\t 发送消息的地址是:" + socket.getRemoteSocketAddress());
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
        }
    }
}
