package com.ioStudy.io_2.char_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * 学会使用缓冲字符输入流，提高字符输入流的性能，新增按照行读取的方法
 */
public class BufferedReaderDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：每次读取一个字符
        // 1. 创建一个字符输入流，与源文件接通
        Reader fr = new FileReader("src/com/IO/data.txt");
        BufferedReader bfr = new BufferedReader(fr);

        // 2. 用循环，每次读取一个字符数组的数据
//        char[] buffer = new char[1024]; // 每次读取1K字符
//
//        // 3. 定义一个len，每次读取的字符
//        int len = 0;
//
//        // 4. 读取字符
//        while ((len = bfr.read(buffer)) != -1) {
//            // 读多少倒多少
//            System.out.print(new String(buffer, 0, len));
//        }

        // 行读
        String context;
        while ((context = bfr.readLine()) != null) {
            System.out.println(context);
        }
    }
}
