package com.ioStudy.IO.char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 先创建一个writer对象
        Writer fw = new FileWriter("src/com/IO/writer.txt");

        // 2. 写入数据
        // a. 写入一个字符串
        fw.write("哈哈哈，我是最棒的");
        // b. 写入一个字符
        fw.write(97);
        // c. 写一个字符数组出去
        fw.write("我是最棒的".toCharArray());
        // d. 写字符串的一部分进去
        fw.write(new String("哈哈哈哈哈哈啊哈哈"), 2, 3);

        // 3. 刷新
        fw.flush();

        // 4. 关闭
        fw.close();
    }
}
