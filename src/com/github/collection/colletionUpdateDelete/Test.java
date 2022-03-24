package com.github.collection.colletionUpdateDelete;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // 1. 准备数据
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Go");
        list.add("Python");
        list.add("Mysql");
        list.add("Python");

        // 2. 获取迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String ele = iterator.next();
            if ("Java".equals(ele)) {
//                list.remove("Java");
                iterator.remove();
            }
        }
    }
}
