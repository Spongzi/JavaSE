package com.github.api.apiStringBuilder;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String print = print(arr);
        System.out.println(print);
    }

    public static String print(int[] arr) {
        StringBuilder sb = new StringBuilder("该数组的内容为:");
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(i).append(i == arr.length - 1? "":", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
