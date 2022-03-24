package com.github.map.mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {
    public static void main(String[] args) {
        // 1. 把80个学生选择的数据拿进来
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);

        // 2. 定义一个Map集合，用来存储投票后得到的结果
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            // 判断Map集合中是否存在这个键
            if (result.containsKey(ch)) {
                // 让其值加一
                result.put(ch, result.get(ch) + 1);
            } else {
                // 说明第一次被选择
                result.put(ch, 1);
            }
        }
        // 输出map集合
        System.out.println(result);
    }
}
