package com.github.sort;

import java.util.Arrays;

// 二分查找
public class binarySearch {
    public static void main(String[] args) {
        // 1. 定义一个数组, 和要查询的数据
        int []arr = {6, 1, 2, 7, 9, 3, 4, 5, 8, 7};
        int target = 1;

        // 得到结果
        int result = binarySearch1(arr, target);
        System.out.println(result != -1? "查询成功，数据的下标是"+result:"查询失败");
    }

    public static int binarySearch1(int []arr, int target) {
        // 2. 给数组排序
        Arrays.sort(arr);

        // 3. 开始二分查找，定义左和右边的临界值
        int left = 0;
        int right = arr.length - 1;

        // 开始遍历
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target){
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
