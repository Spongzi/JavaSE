package com.github.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    // 1. 看看set集合的特点：HashSet， LinkedHashSet， TreeSet
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("Mysql");
        set.add("HTML");
        System.out.println(set);
    }
}
