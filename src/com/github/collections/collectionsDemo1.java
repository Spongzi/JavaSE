package com.github.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class collectionsDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        names.add("楚留香");
//        names.add("胡铁花");
//        names.add("张无忌");
//        names.add("陆小凤");

        // 批量添加数据
        Collections.addAll(names, "楚留香", "胡铁花", "张无忌", "陆小凤");
        System.out.println(names);

        // shuffle 打乱list数据顺序
        Collections.shuffle(names);
        System.out.println(names);

        // sort 将集合中元素按照默认规则排序.
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12, 23, 2, 4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        // sort 自定义排序规则
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 12, 23, 2, 4);
        System.out.println(list1);
        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);
    }
}
