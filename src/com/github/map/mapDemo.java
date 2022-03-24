package com.github.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        // 1. 创建Map一个集合对象
//        Map<String, Integer> map = new HashMap<>(); // 一行经典的代码
        Map<String, Integer> map = new LinkedHashMap<>(); // 一行经典的代码
        map.put("鸿星尔克", 3);
        map.put("枸杞", 190);
        map.put("Java", 1);
        map.put("Java", 10);
        map.put(null, null);
        System.out.println(map);
    }
}
