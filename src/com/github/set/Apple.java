package com.github.set;

public class Apple {
    private String name;
    private String color;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, String color, double price, int weight) {
        this.color = color;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" + "color='" + color + '\'' + ", name='" + name + '\'' + ", price=" + price + ", weight=" + weight + '}';
    }

    /**
     * 方式一：类自定义比较规则
     *
     * @param o
     * @return
     */
//    @Override
//    public int compareTo(Apple o) {
//        // 按照重量进行比较
//        return this.weight - o.weight >= 0 ? 1 : -1;
//    }
}
