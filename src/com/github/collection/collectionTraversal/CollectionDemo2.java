package com.github.collection.collectionTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("张三");
        c.add("李四");
        c.add("王五");

        System.out.println(c);

        for (String s : c) {
            System.out.println(s);
        }


        System.out.println("--------------");

        double[] scores = {1, 2, 3, 4, 5, 6};
        for (double score : scores) {
            System.out.println(score);
            if (score == 2) {
                score = 100; // 修改无意义！！！
            }
        }

        System.out.println(Arrays.toString(scores));
    }
}
