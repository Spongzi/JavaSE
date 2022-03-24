package com.github.api.apiSystem;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");

        // System.exit(0); // JVM 停止

        // 获取时间毫秒值 从1970-1-1 00：00：00开始
        System.out.println(System.currentTimeMillis());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("输出的结果是" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("所消耗的时间为:" + ((endTime - startTime) / 1000.0));

        // 数组的拷贝
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[6];
        System.arraycopy(arr1, 2, arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("程序结束");
    }
}
