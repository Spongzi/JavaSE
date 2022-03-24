package com.github.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类的形式


        // 正常的写法
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("我游泳贼6");
            }
        };
        go(s1);


        // Lambda 的写法
        Swimming s2 = ()-> {
            System.out.println("我游泳不行");
        };
        go(s2);


        // 继续简化
        go(() -> System.out.println("我很吊！你信不信！"));
    }

    public static void go (Swimming s) {
        System.out.println("开始。。。");
        s.swim();
        System.out.println("结束。。。");
    }
}

@FunctionalInterface // 加上这个注解，这个接口必须是函数式接口，里面只能由一个抽象类接口
interface Swimming {
    void swim();
}