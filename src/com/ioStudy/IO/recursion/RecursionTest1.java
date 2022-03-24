package com.ioStudy.IO.recursion;

public class RecursionTest1 {
    public static void main(String[] args) {
        System.out.println(eatPeach(1));
    }

    /**
     * 目标猴子吃桃
     * 公式: f(x) - f(x) / 2 - 1 = f(x+1)
     *      2f(x) - f(x) - 2 = 2f(x+1)
     *      f(x) = 2f(x+1) + 2
     * @param day 第几天？
     * @return 返回当天吃的桃子个数
     */
    public static double eatPeach(int day) {
        if (day == 10) {
            return 1;
        } else {
            return 2 * eatPeach(day + 1) + 2;
        }
    }
}
