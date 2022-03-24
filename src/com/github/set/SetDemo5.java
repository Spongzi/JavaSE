package com.github.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // 不重复，无索引，可排序
        set.add(23);
        set.add(24);
        set.add(8);
        set.add(12);
        System.out.println(set);

        System.out.println("============字符串============");
        Set<String> set1 = new TreeSet<>(); // 不重复，无索引，可排序
        set1.add("Java");
        set1.add("Mysql");
        set1.add("Python");
        set1.add("UI");
        set1.add("AUI");
        set1.add("ab");
        System.out.println(set1);

        System.out.println("============对象============");
        // 方式二：比较器
        Set<Apple> set2 = new TreeSet<>((o1, o2) -> o1.getWeight() - o2.getWeight() > 0 ? 1 : -1); // 不重复，无索引，可排序
        set2.add(new Apple("红富士", "红色", 9.9, 500));
        set2.add(new Apple("绿富士", "绿色", 19.9, 500));
        set2.add(new Apple("路苹果", "橙色", 29.9, 100));
        set2.add(new Apple("黄富士", "黄色", 39.9, 500));
        System.out.println(set2);
    }
}
