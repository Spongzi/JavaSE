package com.ioStudy.commons;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CommonsDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 完成文件赋值
        IOUtils.copy(new FileInputStream("src/com/ioStudy/commons/src.txt"),
                new FileOutputStream("src/com/ioStudy/commons/data.txt"));
    }
}
