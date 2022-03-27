package com.network.d5_udp5_multicast;

import java.net.*;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个socket
        MulticastSocket socket = new MulticastSocket(8888);

        // 把当前接接收端加入到一个组播当中，绑定到同一个组播IP中
        socket.joinGroup(InetAddress.getByName("224.0.1.1"));

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
