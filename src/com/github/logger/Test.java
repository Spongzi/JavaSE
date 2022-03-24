package com.github.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 目标：快速搭建LogBack 日志框架，记录程序执行情况到控制台到文件中
public class Test {
    // 得到日志对象, 代表了日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");

    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法可是执行");

            LOGGER.info("开始记录第二行日志， 我要开始计算除法");

            int a = 10;
            int b = 0;
            LOGGER.trace("a = " + a);
            LOGGER.trace("b = " + b);

            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能出现毛病:" + e);
        }

    }
}
