package com.ioStudy.IO.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个文件字节流输入流管道与源文件接通
        FileInputStream inputStream = new FileInputStream("src/com/IO/data.txt");

        // 2. 读取一个字节返回
//        int b1 = inputStream.read();
//        System.out.println((char)b1);

        // 3. 使用循环改进
        // 定义了一个变量，记录每次读取的字节
//        int b;
//        while ((b = inputStream.read()) != -1) {
//            System.out.print((char) b);
//        }
    }
}
