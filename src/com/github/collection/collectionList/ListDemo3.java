package com.github.collection.collectionList;

import java.util.LinkedList;

public class ListDemo3 {
    public static void main(String[] args) {
        // LinkedList 可以完成队列结构，和栈结构(双链表)

        // 栈
        LinkedList<String> stack = new LinkedList<>();
        // 入栈
        stack.addFirst("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        System.out.println(stack);
        // 出栈
        System.out.println(stack.removeFirst());


        // 队列
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        queue.addLast("5");
        System.out.println(queue);
        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue);

    }
}
