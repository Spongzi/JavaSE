package com.ioStudy.io_2.transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 不同编码
 */
public class transferStreamDemo1 {
    public static void main(String[] args) {
        try (
                // 这是代码utf8 文件utf8 情况 不会报错！
                // BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/io_2/test.txt"));

                // 读取GBK文件
                BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/io_2/test2"));
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
