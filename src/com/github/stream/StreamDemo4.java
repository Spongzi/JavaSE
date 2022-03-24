package com.github.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
收集Stream流
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        System.out.println(names);

        // 转化为List
        Stream<String> stream = names.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = stream.collect(Collectors.toList());
        System.out.println(zhangList);

        // 转化为Set
        Stream<String> stream2 = names.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = stream2.collect(Collectors.toSet());
        System.out.println(zhangSet);


        // 转化为数组
        Stream<String> stream1 = names.stream().filter(s -> s.startsWith("张"));
//        Object[] objects = stream1.toArray();
        // 转化成字符串
        String[] arr = stream1.toArray(String[]::new);
        System.out.println("字符串数组" + Arrays.toString(arr));
    }
}
