package com.github.sort;

// 选择排序

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        // 1. 定义数组
        int[] arr = {5, 1, 3, 2};

        // 2. 定义一个循环, 控制几轮选择: arr.length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // 3. 定义内部循环
            for (int j = i + 1; j < arr.length; j++) {
                // 当前位：arr[i]
                // 如果有比较为数据更小的，则交换
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
