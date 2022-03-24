package com.github.collection.collectionList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个ArrayList实例
        List<String> list = new ArrayList<>();
        list.add("Mysql");
        list.add("Java");
        list.add("Mysql");

        // 在某个元素后面插入数据
        list.add(2, "HTML");
        System.out.println(list);

        // 根据索引删除元素
        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        // 根据索引取元素
        System.out.println(list.get(2));

        // 修改指定元素的
        System.out.println(list.set(2, "臭傻逼"));
        System.out.println(list);
    }
}
