package com.github.arrarys;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 55, 23, 24};
        // 返回数组内容，toString
        System.out.println(Arrays.toString(arr));

        // 排序(默认是升序排序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 二分搜索
        int i = Arrays.binarySearch(arr, 24);
        System.out.println(arr[i]);
    }
}
