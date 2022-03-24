package com.ioStudy.io_2.char_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 给出师表排序
 */
public class BufferedTest2 {
    public static void main(String[] args) {
        try (
            // 1. 想办法读取出没有排好序的出师表内容
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/io_2/csb.txt"));

            // 2. 定义一个可以写入操作的方法
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/io_2/csbpx.txt"))
                ){

            // 3. 定义一个可以存储句子的容器 --> List
            List<String> contextList = new ArrayList<>();

            // 4. 去遍历文章内容，进行存储
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // 5. 将读取到的内容存入到容器中
                contextList.add(line);
            }

            // 6. 将读取到的内容进行排序
            // 6.1 定义一个容器用来给每个特定的文字赋值大小
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

            // 6.2 进行排序(自定义规则)
            contextList.sort(Comparator.comparingInt(o -> sizes.indexOf(o.split("\\.")[0])));
            System.out.println(contextList);
            // 7. 将排好的内容写入文件
            for (String s : contextList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            System.out.println("张三.王五".split("\\.")[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
