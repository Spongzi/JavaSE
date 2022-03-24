package com.github.stream.streamTest;

public class TopEmployee {
    private String name;
    private double money;

    public TopEmployee() {
    }

    public TopEmployee(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public TopEmployee(Employee employee) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "TopEmployee{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
