package com.network.d6_socket;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 目标：完成socket网络编程入门案例的开发，一发一收
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        // 参数一：服务器地址
        // 参数二：服务器端口号
        Socket socket = new Socket("127.0.0.1", 7777);

        // 从socket通信管道中获取一个字节输出流 负责发送数据
        OutputStream os = socket.getOutputStream();

        // 打印流 --> 把低级的字节流包装成高级的打印流
        PrintStream ps = new PrintStream(os);

        // 4. 发送消息
        ps.println("你好，我是tcp客户端，我是你爹！");

        ps.flush();
    }
}
