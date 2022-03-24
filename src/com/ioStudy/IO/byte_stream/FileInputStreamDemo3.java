package com.ioStudy.IO.byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 目标：使用文件字节流输入流一次性读取完文件。可以解决乱码问题。
 */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/com/IO/data.txt");
        InputStream is = new FileInputStream(file);

        // 定义一个字节数组与文件的大小刚刚一致。
//        byte[] buffer = new byte[(int) file.length()];
//        int len = is.read(buffer);
//        System.out.println("读了多少个字节" + len);
//        System.out.println("文件的大小" + file.length());
//        System.out.println(new String(buffer));

        // 读取全部字节
        byte[] buffer = is.readAllBytes(); // 与上面代码效果保持一致
        System.out.println(new String(buffer));
    }
}
