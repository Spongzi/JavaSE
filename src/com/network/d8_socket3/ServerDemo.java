package com.network.d8_socket3;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 完成socket网络编程的服务端, 实现服务端可以处理多个客户端
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(7777);

        while (true) {
            // 调用accept 等待客户端socket连接请求
            Socket socket = serverSocket.accept();

            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            
            // 开始处理socket对象
            new Thread(new ServerReadThread(socket)).start();
        }
    }
}
