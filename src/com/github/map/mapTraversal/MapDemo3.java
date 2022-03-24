package com.github.map.mapTraversal;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1. 添加元素
        maps.put("iPhone99", 109);
        maps.put("哇哇", 11);
        maps.put("张三", 10);
        maps.put("华为", 100);
        maps.put("生活用品", 10);
        System.out.println(maps);

        maps.forEach((key, value) -> System.out.println("key: " + key + " = value:" + value));
    }
}
