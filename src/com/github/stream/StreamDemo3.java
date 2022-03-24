package com.github.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        System.out.println(names);

        names.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

        long count = names.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);

        names.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        names.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);

        // Map 加工方法：第一个参数原材料 -> 第二个参数是加工后的结果
        // 给集合元素的前面都加上一个老王的
        names.stream().map(s -> "老王的" + s).forEach(System.out::println);

        // 需求，把所有的名称，都加工成学生对象
//        names.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
        names.stream().map(Student::new).forEach(System.out::println);

        // 合并流
        Stream<String> s1 = names.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1", "Java2");
        Stream<String> concat = Stream.concat(s1, s2);
        concat.forEach(System.out::println);
    }
}
