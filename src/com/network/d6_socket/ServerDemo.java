package com.network.d6_socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 完成socket网络编程的服务端
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(7777);

        // 调用accept 等待客户端socket连接请求
        Socket socket = serverSocket.accept();

        // 获取一个字节输入流
        InputStream is = socket.getInputStream();

        // 把字节流转化成字符输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        // 按行读取消息
        String message;
        while ((message = br.readLine()) != null) {
            System.out.println("获取的消息是" + message + "\t 发送消息的地址是:" + socket.getRemoteSocketAddress());
        }
    }
}
