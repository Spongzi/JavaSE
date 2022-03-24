package com.ioStudy.IO.char_stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        // 目标：每次读取一个字符
        // 1. 创建一个字符输入流，与源文件接通
        Reader fr = new FileReader("src/com/IO/data.txt");

        // 2. 用循环，每次读取一个字符数组的数据
        char[] buffer = new char[1024]; // 每次读取1K字符

        // 3. 定义一个len，每次读取的字符
        int len = 0;

        // 4. 读取字符
        while ((len = fr.read(buffer)) != -1) {
            // 读多少倒多少
            System.out.print(new String(buffer, 0, len));
        }
    }
}
