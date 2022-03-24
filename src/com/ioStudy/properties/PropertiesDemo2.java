package com.ioStudy.properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        // 需求：Properties读取属性文件中的键值对信息(读取)
        Properties properties = new Properties();
        System.out.println(properties);

        // 加载属性文件中的键值对数据到属性对象properties中去
        properties.load(new FileReader("src/com/ioStudy/properties/user.properties"));

        System.out.println(properties);

        System.out.println(properties.get("sx"));
    }
}
