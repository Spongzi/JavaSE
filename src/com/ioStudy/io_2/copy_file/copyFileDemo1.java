package com.ioStudy.io_2.copy_file;

import java.io.*;

/**
 * 完成文件的打印
 */
public class copyFileDemo1 {
    public static void main(String[] args) {
        try (
                // 1. 先定义一个读取字节流的实例 --> 缓冲
                InputStream is = new FileInputStream("F:\\BaiduNetdiskDownload\\2021 黑马 Java 后端入门到进阶教程\\第1阶段—Java SE基础\\1、Java基础--20天学会Java\\20天学会java—视频\\day18、日志框架、阶段项目\\08、影片下架、修改、展示排片信息，用户购票.mp4");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(is);
                // 2. 定义一个写入的过程
                OutputStream os = new FileOutputStream("src/com/io_2/copy_file/test.mp4");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
