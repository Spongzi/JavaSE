package com.ioStudy.IO.byte_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个文件字符输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("src/com/IO/out.txt");

        // 2. 写数据出去
        /*os.write('a');
        os.write('徐');*/
        os.write('a');
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));

        // 3. 写一组数据
        byte[] buffer = {'a', 97, 99, '\r', '\n'};
        os.write(buffer);

        byte[] buffer1 = "我是中国人".getBytes(StandardCharsets.UTF_8);
        os.write(buffer1);

        // 写数据必须刷新数据，刷新了之后可以继续使用
        os.flush();
        // 释放资源, 包含了刷新，不可以继续使用
        os.close();

    }
}