package com.ioStudy.IO.byte_stream;

import java.io.*;

public class copyFileDemo2 {
    public static void main(String[] args) throws Exception {
        try (
                InputStream is = new FileInputStream("F:\\BaiduNetdiskDownload\\2021 黑马 Java 后端入门到进阶教程\\第1阶段—Java SE基础\\1、Java基础--20天学会Java\\20天学会java—视频\\day18、日志框架、阶段项目\\01、今日课程安排.mp4");
                OutputStream os = new FileOutputStream("src/com/IO/今日安排.mp4");
                Test test = new Test() // 这里会自动调用释放资源的方法
        ) {
            // 获取字节数
            byte[] buffer = new byte[1024];
            int len;

            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            System.out.println("复制完成！！！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Test implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("我他妈的被释放掉了");
    }
}
