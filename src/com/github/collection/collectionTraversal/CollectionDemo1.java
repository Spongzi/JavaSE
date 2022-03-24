package com.github.collection.collectionTraversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("张三");
        c.add("李四");
        c.add("王五");

        System.out.println(c);

        // 1. 得到当前集合的迭代器对象
        Iterator<String> iterator = c.iterator();

        // 可以通过next()直接得到一个元素
        // String next = iterator.next();
        // System.out.println(next);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=============================");
    }
}
