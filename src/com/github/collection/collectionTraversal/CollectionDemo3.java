package com.github.collection.collectionTraversal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("张三");
        c.add("李四");
        c.add("王五");

        System.out.println(c);

        // lambda 遍历
        c.forEach(s -> System.out.println(s));
    }
}
