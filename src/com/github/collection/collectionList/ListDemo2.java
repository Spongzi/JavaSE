package com.github.collection.collectionList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        // 1. 定义一个ArrayList
        List<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");

        // 1. 迭代器遍历
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        // 2. 增强for循环
//        for (String str : list) {
//            System.out.println(str);
//        }

        // 3. Lambda表达式
        list.forEach(System.out::println);

        // 4. for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
