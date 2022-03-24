package com.github.collection.CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionAPIDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        // 1. 添加元素，添加成功返回true
        c.add("你好");
        c.add("Java");
        c.add("Java");
        c.add("Mysql");
        c.add("HTML");
        c.add("HTML");
        System.out.println(c);

        // 2. 清空列表的所有元素
//        c.clear();
//        System.out.println(c);

        // 3. 判断集合是否为空
        System.out.println(c.isEmpty());

        // 4. 获取集合的大小
//        int size = c.size();
        System.out.println(c.size());

        // 5. 判断集合中是否有某个元素
        System.out.println(c.contains("Java"));
        System.out.println(c.contains("哈哈"));

        // 6. 删除某个元素：如果有多个元素，则默认删除第一个！
        System.out.println(c.remove("Java"));
        System.out.println(c);
        System.out.println(c.remove("java"));
        System.out.println(c);

        // 7. 把集合转化为数组
        Object[] arr = c.toArray();
        System.out.println("数组" + Arrays.toString(arr));


        System.out.println("-------------拓展-------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("哈哈");
        c2.add("你好");
        // addAll把c2集合的元素全部倒入到c1中去。
        c1.addAll(c2);
        System.out.println("我是c1元素: " + c1);
        System.out.println("我是c2元素: " + c2);
    }
}
