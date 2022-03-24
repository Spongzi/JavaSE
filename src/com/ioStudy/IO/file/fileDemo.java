package com.ioStudy.IO.file;

/*
目标：学会操作File对象定位操作系统的文件(文件 文件夹的)
 */

import java.io.File;

public class fileDemo {
    public static void main(String[] args) {
        // 创建File对象 (指定了文件路径)
        // 路径写法： "E:\笔记\Go\assets\1.jpg"
        //             "E:/笔记/Go/assets/1.jpg"
        File file = new File("E:\\JavaStudy\\JavaSE\\src\\logback.xml");
        long size = file.length(); // 文件的字节大小
        System.out.println(size);

        // file常见创建对象，支持绝对路径，也支持相对路径(**)
        File f1 = new File("E:\\JavaStudy\\JavaSE\\src\\logback.xml");
        System.out.println(f1.length());

        // 相对路径，一般定位模块中的文件的
        File f2 = new File("src/logback.xml");
        System.out.println(f2.length());

        // 3. File创建对象，可以是文件也可以是文件夹
        File f3 = new File("E:\\JavaStudy\\JavaSE\\src");
        System.out.println(f3.exists());
    }
}
