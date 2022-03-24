package com.ioStudy.io_2.char_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 缓冲字符输出流的使用，学会它多出来的一个功能
 */
public class BufferedWriterDemo1 {
    public static void main(String[] args) {
        try (
                // 1. 首先创建一个写入的对象
                Writer writer = new FileWriter("src/com/io_2/test.txt", true);
                // 2. 把writer包装成BufferedWriter
                BufferedWriter bw = new BufferedWriter(writer);
        ) {
            bw.write("你好，我是张大炮");
            bw.newLine();
            bw.write("哈哈哈，你好张大炮。我来试一试我的换行好不好使");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
