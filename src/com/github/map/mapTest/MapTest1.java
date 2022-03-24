package com.github.map.mapTest;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        // 定义四个地点
        List<String> place = new ArrayList<>();
        Collections.addAll(place, "A", "B", "C", "D");

        // 1. 要求程序记录每个学生选择的情况
        // 使用一个map集合存储
        Map<String, List<String>> data = new HashMap<>();

        // 生成一个随机数生成器
        Random r = new Random();

        // 2. 把学生选择的数据存入进去。
        /*
            List<String> selects = new ArrayList<>();
            Collections.addAll(selects, "A", "C");
            data.put("小明", selects);

            List<String> selects1 = new ArrayList<>();
            Collections.addAll(selects1, "A", "C", "D");
            data.put("张三", selects1);

            List<String> selects2 = new ArrayList<>();
            Collections.addAll(selects2, "A", "B", "C", "D");
            data.put("张三", selects2);
        */
        for (int i = 0; i < 80; i++) {
            List<String> selects = new ArrayList<>();
            int Num = r.nextInt(place.size());
            if (Num == 0) {
                Num = r.nextInt(place.size());
            }
            for (int j = 0; j < Num; j++) {
                selects.add(place.get(r.nextInt(place.size())));
            }
            data.put("学生" + i, selects);
        }

        System.out.println(data);

        // 3. 统计每个地点人们的选择
        Map<String, Integer> result = new HashMap<>();

        // 4. 提取所有人选择的景点的信息
        Collection<List<String>> values = data.values();

        for (List<String> value : values) {
            for (String s : value) {
                // 有没有包含这个今典
                if (result.containsKey(s)) {
                    result.put(s, result.get(s) + 1);
                } else {
                    result.put(s, 1);
                }
            }
        }

        System.out.println(result);
    }
}
