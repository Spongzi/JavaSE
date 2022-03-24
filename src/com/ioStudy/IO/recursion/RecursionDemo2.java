package com.ioStudy.IO.recursion;

public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    /**
     * 递归的三要素
     * 1. 递归的公式：f(n) = f(n-1)*n;
     * 2. 递归的终结点：f(1)
     * 3. 递归的方向必须走向终结点
     * @param n 递归的次数
     * @return 返回最终的结果
     */
    public static int f(int n){
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) * n;
        }
    }
}
