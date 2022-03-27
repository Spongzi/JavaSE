package com.network.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * 发送端 --> 一发一收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建发送端对象, 发送端自带默认的端口号
        DatagramSocket socket = new DatagramSocket();

        // 2. 创建一个数据包对象，封装数据
        /*
           public DatagramPacket(byte buf[], int length, InetAddress address, int port
           参数一： 封装要发送的数据(韭菜)
           参数二：要发送数据的大小
           参数三：服务端的IP地址
           参数四：端口号
         */
        byte[] buf = "你好,我是韭菜".getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 8888);

        // 3. 发送数据
        socket.send(packet);

        // 4. 关闭管道
        socket.close();
    }
}
