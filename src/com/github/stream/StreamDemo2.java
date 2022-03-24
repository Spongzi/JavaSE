package com.github.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // Collection集合获取流
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        // Map 集合获取流
        HashMap<String, Integer> map = new HashMap<>();

        // 键流
        Stream<String> keyStream = map.keySet().stream();
        // 值流
        Stream<Integer> valueStream = map.values().stream();
        // 键值对
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        // 数组获取流
        String[] names = {"张三", "李四", "哈哈哈"};
        Stream<String> nameStream = Arrays.stream(names);

        Stream<String> nameStream1 = Stream.of(names);

    }
}
