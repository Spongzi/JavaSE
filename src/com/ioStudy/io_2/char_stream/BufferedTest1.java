package com.ioStudy.io_2.char_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给出师表排序
 */
public class BufferedTest1 {
    public static void main(String[] args) {
        try (
                // 1. 首先要定义一个可以读取到出师表中每一行的内容的东西
                BufferedReader br = new BufferedReader(new FileReader("src/com/io_2/csb.txt"));
                // 2. 要定义一个可以写入排好序的内容的
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/io_2/排好序的出师表.txt"))
        ){
            // 定义一个List集合用来存放读取出来的内容
            List<String> context = new ArrayList<>();
            // 首先读出每一行
            String line;
            while ((line = br.readLine()) != null) {
                // 将内容存放到List集合当中去
                context.add(line);
            }
            // 可以排序这个包！！！！ --> 字符串也可以！！！ --> 多用记住！！！
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");
            Collections.sort(context, (o1, o2) -> {
                return sizes.indexOf(o1.substring(0, o1.indexOf("."))) - sizes.indexOf(o2.substring(0, o2.indexOf(".")));
            });
            System.out.println(context);

            // 定义缓存区输出
            for (String s : context) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
