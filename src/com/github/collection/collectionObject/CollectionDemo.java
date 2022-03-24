package com.github.collection.collectionObject;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. 定义集合中的数据
        Collection<Movie> movies = new ArrayList<>();

        // 2. 添加数据
        movies.add(new Movie("老炮1", 10, "张三"));
        movies.add(new Movie("老炮2", 9, "李四"));
        movies.add(new Movie("老炮3", 8, "王五"));

        // 3. 遍历集合容器中的每个电影数据
        movies.forEach(System.out::println);
    }
}
