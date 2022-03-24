package com.ioStudy.IO.recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("========TEST被执行=======");
        test(); // 方法递归
    }
}
