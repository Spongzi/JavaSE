package com.ioStudy.io_2.buffer_stream;

import java.io.*;

public class bufferedInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        try (
                InputStream is = new FileInputStream("F:\\BaiduNetdiskDownload\\2021 黑马 Java 后端入门到进阶教程\\第1阶段—Java SE基础\\1、Java基础--20天学会Java\\20天学会java—视频\\day18、日志框架、阶段项目\\01、今日课程安排.mp4");
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream("src/com/io_2/今日安排.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 获取字节数
            byte[] buffer = new byte[1024];
            int len;

            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

            System.out.println("复制完成！！！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
