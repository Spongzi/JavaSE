package com.ioStudy.io_2.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 猜测，有读取序列化的内容
 * 反序列化！！！
 */
public class ObjectInputStreamDemo1 {
    public static void main(String[] args) {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/io_2/obj.txt"))
        ) {
            Object s = ois.readObject();
            assert s instanceof Student1;
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
