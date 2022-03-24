package com.ioStudy.IO.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 使用文件字节输入流每次读取一个字节数组的数据
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/com/IO/data.txt");

        // 2. 定义一个字节数组，用于读取字节数组
//        byte[] bytes = new byte[3];
//
//
//        int len = is.read(bytes);
//        System.out.println("读取了几个字节" + len);
//        String rs = new String(bytes);
//        System.out.println(rs);
//
//        int len2 = is.read(bytes);
//        System.out.println("读取了几个字节" + len2);
//        // 读取多少倒出多少
//        String rs2 = new String(bytes, 0, len2);
//        System.out.println(rs2);

        // 3. 改进使用循环，每次循环取一个字节数组
        byte[] buffer = new byte[3];
        int len; // 记录每次读取的字节数
        while ((len = is.read(buffer)) != -1 ){
            // 读到多少倒出多少
            System.out.print(new String(buffer, 0, len));
        }
    }
}
