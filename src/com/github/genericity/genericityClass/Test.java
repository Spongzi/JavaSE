package com.github.genericity.genericityClass;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mysql");

        list.remove("Java");
    }
}
