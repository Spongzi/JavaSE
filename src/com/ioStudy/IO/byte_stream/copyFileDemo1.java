package com.ioStudy.IO.byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class copyFileDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建一个写入操作
        OutputStream os = new FileOutputStream("src/com/IO/src.txt");
        // 写入文件
        os.write("我是资源文件，我要被拷贝了".getBytes(StandardCharsets.UTF_8));
        // 关闭资源
        os.close();
        
        // 读取操作
        InputStream is = new FileInputStream("src/com/IO/src.txt");
        // 读取资源文件中的内容，保存为字节
        byte[] buffer = is.readAllBytes();
        is.close();

        // 写入一个copy.txt
        OutputStream os2 = new FileOutputStream("src/com/IO/copy.txt");
        // 将读取的资源文件写入到copy文件中去
        os2.write(buffer);
        os2.close();
    }
}
