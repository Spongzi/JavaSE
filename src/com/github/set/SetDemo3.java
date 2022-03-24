package com.github.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("张三", 20, '男');
        Student s2 = new Student("张三", 20, '男');
        Student s3 = new Student("李六", 23, '女');
        Student s4 = new Student("王八", 24, '女');

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);

        // Set去重复的原因，HashCode值和equals
    }
}
