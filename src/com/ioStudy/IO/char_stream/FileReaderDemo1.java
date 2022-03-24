package com.ioStudy.IO.char_stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // 目标：每次读取一个字符
        // 1. 创建一个字符输入流，与源文件接通
        Reader fr = new FileReader("src/com/IO/data.txt");

        // 2. 读取一个返回一个没有字符的时候就返回-1
//        int code = fr.read();
//        System.out.println((char) code);

        // 3. 使用while循环改进
        int code = 0;
        while ((code = fr.read()) != -1) {
            System.out.print((char) code);
        }
    }
}
