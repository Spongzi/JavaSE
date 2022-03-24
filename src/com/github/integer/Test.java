package com.github.integer;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer s = 10;
        Integer age = null;
        System.out.println(s);


        String num = "100";
        int score = Integer.parseInt(num);
        System.out.println(score);

        Double aDouble = Double.valueOf(num);
        System.out.println(aDouble);
    }
}
