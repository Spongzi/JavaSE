package com.github.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很慢");
            }
        };

    }
}

abstract class Animal {
    public void run(){};
}