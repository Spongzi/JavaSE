package com.ioStudy.io_2.printStream;

import java.io.PrintStream;

/**
 * 改变输出语句的位置到文件
 */
public class printDemo2 {
    public static void main(String[] args) {
        try (
                // 1. 创建一个对象
//                PrintStream ps = new PrintStream(new FileOutputStream("src/com/io_2/ps.txt"));
                PrintStream ps = new PrintStream("src/com/io_2/ps1.txt")
                // 打印功能没有区别--> PrintWriter
        ) {
            ps.println(97);
            ps.println("Hahah");
            ps.println("我的打印流输出的");
            // 改变输出语句的重定向！
            System.setOut(ps);
            System.out.println("我是张三");
            System.out.println("我是法外狂徒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
