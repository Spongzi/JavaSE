package com.github.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Mysql");
        set.add("Java");
        set.add("张三");
        set.add("王五");

        System.out.println(set);
    }
}
