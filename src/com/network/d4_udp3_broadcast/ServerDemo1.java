package com.network.d4_udp3_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个socket
        DatagramSocket socket = new DatagramSocket(8888);

        // 2. 创建一个packet
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {

            // 3. 接收数据
            socket.receive(packet);

            int len = packet.getLength();
            String message = new String(buffer, 0, len);
            if ("exit".equals(message)) {
                System.out.println("服务端关闭中");
                socket.close();
                break;
            }
            System.out.println("接收的数据为：" + message + "\t这条信息来自：" + packet.getSocketAddress());
        }
    }
}
