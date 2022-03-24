package com.github.regex;

import java.util.Arrays;

public class RegexDemo2 {
    public static void main(String[] args) {
        String names = "小路sjkahd哈哈哈sajkdh";
        String[] arrs = names.split("\\w+");
        System.out.println(Arrays.toString(arrs));
    }
}
