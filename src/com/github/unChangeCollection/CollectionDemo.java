package com.github.unChangeCollection;

import java.util.List;

/**
 * 目标： 不可变集合
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 不可变的list
        List<Double> list = List.of(510.12, 2000.2, 123.3, 12334.4);
//        list.add(8.2);
        System.out.println(list);
    }
}
