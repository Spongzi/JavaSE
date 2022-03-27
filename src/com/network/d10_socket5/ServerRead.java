
package com.network.d10_socket5;

import java.io.*;
import java.net.Socket;

public class ServerRead implements Runnable {
    private Socket socket;

    public ServerRead() {
    }

    public ServerRead(Socket socket) {
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
                // 把这个消息，进行转发给所有的socket管道
                sendMegToAll(message);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            ServerDemo.sockets.remove(socket);
        }
    }

    private void sendMegToAll(String message) throws IOException {
        for (Socket socket : ServerDemo.sockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(message);
            ps.flush();
        }
    }
}
