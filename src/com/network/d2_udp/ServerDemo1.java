package com.network.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建接收端对象
        DatagramSocket socket = new DatagramSocket(8888);

        // 2. 创建一个接收包
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 3. 等待接收数据
        socket.receive(packet);

        // 4. 取出数据即可
        // 读多少，到多少
        System.out.println("收到了数据" + new String(buffer, 0, packet.getLength()));
        // 获取发送端的ip和端口
        System.out.println(packet.getSocketAddress());
        System.out.println(packet.getPort());

        // 5. 关闭
        socket.close();
    }
}
