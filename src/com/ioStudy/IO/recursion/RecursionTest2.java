package com.ioStudy.IO.recursion;

public class RecursionTest2 {
    // 定义一个静态的成员遍历存储都可以买的酒数量
    public static int totalNumber; // 总数量
    public static int lastBottleNumber; // 记录每次剩余的瓶子个数
    public static int lastCoverNumber; // 记录每次剩余的盖子个数

    public static void main(String[] args) {
        BeerNumber(10);
        System.out.println("总数: " + totalNumber);
        System.out.println("剩余盖子数: " + lastCoverNumber);
        System.out.println("剩余瓶子数：" + lastBottleNumber);
    }

    /**
     * 2元1个， 4个换一瓶 2空瓶可以换1瓶
     */
    public static void BeerNumber(int money) {
        int Beer = money / 2; // 直接用钱可以买到的个数
        totalNumber += Beer;

        // 3. 把盖子 和 瓶子数换成钱
        int coverNumber = lastCoverNumber + Beer;
        int bottleNumber = lastBottleNumber + Beer;

        // 统计可以换算的钱
        int allMoney = 0;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;

        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = coverNumber % 2;

        if (allMoney >= 2) {
            BeerNumber(allMoney);
        }

    }
}
