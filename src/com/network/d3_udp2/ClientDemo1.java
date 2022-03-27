package com.network.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 发送多个请求，直到发送exit，推出发送
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个DatagramSocket
        DatagramSocket socket = new DatagramSocket();

        do {
            // 2. 创建一个输入的语句
            String info = new Scanner(System.in).nextLine();
            // 3. 创建一个packet用来存放发送的数据
            byte[] buffer = info.getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);
            // 4. 发送数据
            socket.send(packet);
            // 判断是否发送了exit信息
            if ("exit".equals(info)) {
                System.out.println("客户端关闭中");
                socket.close();
                break;
            }
        } while (true);
    }
}
