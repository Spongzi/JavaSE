package com.ioStudy.properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("admin", "123456");
        properties.setProperty("suxu", "123567");
        properties.setProperty("sx", "123456789");

        /**
         * 参数一：保存管道 字符输出流管道
         * 参数二：保存心得
         */
        properties.store(new FileWriter("src/com/ioStudy/properties/user.properties"), "this is user. I am so happy!");
    }
}
