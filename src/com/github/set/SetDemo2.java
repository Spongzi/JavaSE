package com.github.set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 目标：学会获取对象的哈希值，并且确认
        String name = "张三";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1 = "李四";
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
    }
}
