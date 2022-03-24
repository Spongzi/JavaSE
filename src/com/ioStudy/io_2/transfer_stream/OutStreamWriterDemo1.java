package com.ioStudy.io_2.transfer_stream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutStreamWriterDemo1 {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("src/com/io_2/h.txt");
                // 为空的时候默认为utf8
                OutputStreamWriter osw = new OutputStreamWriter(os, "GBK");
                BufferedWriter bufferedWriter = new BufferedWriter(osw);
        ) {
            bufferedWriter.write("你猜猜我是谁！？");
            bufferedWriter.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
