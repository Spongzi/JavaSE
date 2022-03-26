package com.InetAddress.d1_InetAddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 获取本机地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println("主机名: " + localHost.getHostName());
        System.out.println("主机地址: " + localHost.getHostAddress());

        // 2. 获取域名IP对象
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println("主机名：" + baidu.getHostName());
        System.out.println("主机地址：" + baidu.getHostAddress());

        InetAddress spongzi = InetAddress.getByName("www.spongzi.top");
        System.out.println(spongzi.getHostName());
        System.out.println(spongzi.getHostAddress());

        // 3. 获取公网IP对象
        InetAddress address = InetAddress.getByName("119.91.222.72");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());

        // 4. 判断是否能通：ping 5s之前测试是否可通
        System.out.println(address.isReachable(5000));
    }
}
