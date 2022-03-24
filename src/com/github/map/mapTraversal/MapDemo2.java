package com.github.map.mapTraversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1. 添加元素
        maps.put("iPhone99", 109);
        maps.put("哇哇", 1);
        maps.put("张三", 10);
        maps.put("华为", 100);
        maps.put("生活用品", 101);
        System.out.println(maps);

        // 1. 要把Map集合转化为Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();

        // 2. 遍历Set对象
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
    }
}
