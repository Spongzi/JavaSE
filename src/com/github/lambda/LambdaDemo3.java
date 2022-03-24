package com.github.lambda;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        // 对sort的进行简化
        Integer []ages = {4, 1, 6, 123, 23, 3};

        // 对ages进行降序排序
        Arrays.sort(ages, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(ages));
    }
}
