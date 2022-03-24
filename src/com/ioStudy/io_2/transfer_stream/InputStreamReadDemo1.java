package com.ioStudy.io_2.transfer_stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReadDemo1 {
    public static void main(String[] args) {
        try (
                // 读取GBK文件
                InputStream is = new FileInputStream("src/com/io_2/test2");
                InputStreamReader inputStreamReader = new InputStreamReader(is, "GBK");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
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
