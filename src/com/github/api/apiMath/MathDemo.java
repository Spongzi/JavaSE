package com.github.api.apiMath;

public class MathDemo {
    public static void main(String[] args) {
        // abs 绝对值
        System.out.println(Math.abs(-10));

        // 向下取整 ceil
        System.out.println(Math.ceil(1.0)); // 1.0
        System.out.println(Math.ceil(1.1));

        // 向下取证 floor
        System.out.println(Math.floor(1.0)); // 1.0
        System.out.println(Math.floor(1.1));

        // 四舍五入 round
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.6));

        // 取三到九之间的随机数
        int v = (int)(Math.random() * 6) + 1;
        System.out.println();
    }
}
