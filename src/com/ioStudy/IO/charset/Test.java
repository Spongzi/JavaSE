package com.ioStudy.IO.charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1. 编码：把文字转化成字节
        String name = "我爱你中国"; // 一个中文3个字节(UTF-8)  GBK: --> 一个中文两个字节
        byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        bytes = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2. 解码：把字节转化成对应的中文形式(编码前 和 编码后的字符集必须一致，否则乱码)
        String rs = new String(bytes); // 默认使用utf8
        rs = new String(bytes, "GBK"); // 使用GBK解码
        System.out.println(rs);
    }
}
