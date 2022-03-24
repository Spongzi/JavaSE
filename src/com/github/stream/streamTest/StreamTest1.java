package com.github.stream.streamTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static double allMoney = 0;

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 10000, 5000, null));
        one.add(new Employee("孙悟空", '男', 120000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 5000, null));
        one.add(new Employee("白龙马", '男', 20000, 5000, null));

        ArrayList<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 12345, 9000, null));
        two.add(new Employee("李逵", '男', 121231, 9000, null));
        two.add(new Employee("西门庆", '男', 1222, 9000, "被打"));
        two.add(new Employee("潘金莲", '女', 122222, 9000, "被打"));
        two.add(new Employee("武大郎", '女', 12000, 0, "下毒"));

        // 1. 开发部的最高工资
//        Employee employee = one.stream().
//                max(Comparator.comparingInt(o -> (o.getSalary() + o.getBonus())))
//                .get();
//        System.out.println(employee);
        TopEmployee topEmployee = one.stream()
                .max(Comparator.comparing(o -> (o.getSalary() + o.getBonus())))
                .map(e -> new TopEmployee(e.getName(), e.getSalary() + e.getBonus()))
                .get();
        System.out.println(topEmployee);

        // 2. 统计平均工资
        one.stream()
                .sorted(Comparator.comparing(o -> (o.getSalary() + o.getBonus())))
                .skip(1)
                .limit(one.size() - 2)
                .forEach(e -> {
                    // 求出总和
                    allMoney += (e.getSalary() + e.getBonus());
                });
        System.out.println("一部门的平均工资是" + allMoney / (one.size() - 2));

        allMoney = 0;

        // 求出两个部门的平均工资
        Stream<Employee> concat = Stream.concat(one.stream(), two.stream());
        concat.sorted(Comparator.comparing(o -> (o.getSex() + o.getBonus())))
                .skip(1)
                .limit(one.size() + two.size() - 2)
                .forEach(e -> allMoney += (e.getSalary() + e.getBonus()));

        // 使用BigDecimal
        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println("两个开发部的整体平均薪资" + a.divide(b, 2, RoundingMode.HALF_UP));
    }
}
