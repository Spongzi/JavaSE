package com.github.map.mapTraversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1. 添加元素
        maps.put("iPhone99", 109);
        maps.put("哇哇", 1);
        maps.put("张三", 10);
        maps.put("华为", 100);
        maps.put("生活用品", 10);
        System.out.println(maps);

        // 2. 获取键
        Set<String> keys = maps.keySet();
        // 3. 遍历每个键，根据键获取值
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println("key:" + key + "value" + value);
        }
    }
}
