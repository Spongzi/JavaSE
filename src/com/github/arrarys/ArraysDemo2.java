package com.github.arrarys;

import java.util.Arrays;
import java.util.Comparator;

// 自定义数组排序
public class ArraysDemo2 {
    public static void main(String[] args) {
        // 1. 数组对于默认值特性的数组是升序排序的
        int[] ages = {43, 21, 12, 23};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // 2. 需求：降序排序(自定义比较对象)
        Integer[] ages1 = {43, 21, 12, 23};
        // 参数1: 被排序的数组 必须是引用类型的元素
        // 参数2: 匿名内部类对象，代表了以恶搞比较器对象
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 指定比较的规则
                // 如果认为左边的数据 大于 右边的数据 返回正整数
                // 如果认为左边的数据 小于 右边的数据 返回负整数
                // 如果认为左边数据 等于 右边数据 返回0
                // return o1 - o2; // 默认升序
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(ages1));

        Student[] students = new Student[3];
        students[0] = new Student("张三", 13, 190);
        students[1] = new Student("里斯", 18, 160);
        students[2] = new Student("王五", 22, 187);

        // 按年龄
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 升序排序
            }
        });
        System.out.println(Arrays.toString(students));

        // 按身高-->小数
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
