package com.ioStudy.io_2.buffer_time;

import java.io.*;

public class bufferTimeDemo1 {
    public static final String SRC_FILE = "F:/Downloads/贝贝工具箱0711.zip";
    public static final String DEST_FILE = "src/com/io_2/";

    public static void main(String[] args) {
//        copy01(); // 使用低级的一个字节流按照一个一个字节的形式复制
        copy02(); // 使用低级的字节流按照一个一个字节数组的形式复制文件
        copy03(); // 缓冲流一个一个字节复制
        copy04(); // 缓冲流一个一个字节数组复制
    }

    private static void copy01() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "copy01.zip");
        ) {
            int b = 0;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy01 消耗的时间为：" + (endTime - startTime) + "毫秒");
    }

    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "copy02.zip");
        ) {
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy02 消耗的时间为：" + (endTime - startTime) + "毫秒");
    }


    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE + "copy03.zip");
                OutputStream bos = new BufferedOutputStream(os)
        ) {
            int b = 0;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy03 消耗的时间为：" + (endTime - startTime) + "毫秒");
    }

    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                // 包装一下
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE + "copy04.zip");
                OutputStream bos = new BufferedOutputStream(os)
        ) {
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy04 消耗的时间为：" + (endTime - startTime) + "毫秒");
    }

}
