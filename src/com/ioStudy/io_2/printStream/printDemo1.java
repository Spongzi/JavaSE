package com.ioStudy.io_2.printStream;

import java.io.PrintStream;

/**
 * 学会使用打印流，高效 方便把数据写到文件中
 */
public class printDemo1 {
    public static void main(String[] args) {
        try (
                // 1. 创建一个对象
//                PrintStream ps = new PrintStream(new FileOutputStream("src/com/io_2/ps.txt"));
                PrintStream ps = new PrintStream("src/com/io_2/ps.txt")
                // 打印功能没有区别--> PrintWriter
        ) {
            ps.println(97);
            ps.println("Hahah");
            ps.println("我的打印流输出的");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
