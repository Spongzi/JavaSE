package com.github.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 目标： 明确Collection集合的特点
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(false);
        list.add(false);
        System.out.println(list);

        // 无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add(false);
        list1.add(false);
        System.out.println(list1);


        // 泛型的演示
        Collection<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("Java");
        System.out.println(list2);

//        Collection<int> list3 = new ArrayList<>();
    }
}
