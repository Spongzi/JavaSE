package com.ioStudy.io_2.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 学会对象序列化，使用ObjectOutputStream把内存中的对象存入到磁盘文件中
 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) {
        // 1. 创建学生对象
        Student1 s = new Student1("张三", "1234", "1234", 1);

        try (
                // 2. 将对象存入到文件中去(对象序列化)
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/io_2/obj.txt"));
        ) {
            // 3. 直接调用序列化方法
            oos.writeObject(s);
            System.out.println("序列化完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
