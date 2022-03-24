package com.github.genericity.genericityMethod;

public class GenericDemo1 {
    public static void main(String[] args) {
        String []names = {"小路", "芙蓉", "小何"};
        printArray(names);

        Integer []ages = {10, 20, 30};
        printArray(ages);
    }

    public static <T> void printArray(T []arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "":", ");
            }
            sb.append("]");
            System.out.println(sb);

        } else {
            System.out.println((Object) null);
        }
    }
}
