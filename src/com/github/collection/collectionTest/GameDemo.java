package com.github.collection.collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {

    // 1. 定义一个静态的集合存储54张牌
    public static List<Card> allCars = new ArrayList<>();

    // 2. 做牌，定义静态代码块初始牌
    static {
        // 3. 定义点数，个数确定，类型确定，使用数据
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4. 定义花色：个数确定，类型确定，使用数据
        String[] colors = {"♥", "♦", "♣", "♠"};
        // 5. 组合点数和花色
        int index = 0; // 记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6. 封装成一个对象
                Card c = new Card(size, color, index);
                // 存储到集合容器中去
                allCars.add(c);
            }
        }
        // 8. 大小王存储到集合中去
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "🃏", ++index);
        Collections.addAll(allCars, c1, c2);
        System.out.println("新牌" + allCars);
    }

    public static void main(String[] args) {
        // 9. 洗牌
        Collections.shuffle(allCars);
        System.out.println("洗牌后" + allCars);

        // 10. 发牌(定义三个玩家，每个玩家的牌也是一个容器)
        List<Card> ZhangSan = new ArrayList<>();
        List<Card> LiSi = new ArrayList<>();
        List<Card> WangWu = new ArrayList<>();
        
        // 11. 开始发牌，发51张牌，留三张牌作为底牌
        for (int i = 0; i < allCars.size() - 3; i++) {
            // 先拿到当前牌对象
            Card c = allCars.get(i);
            // 循环求余
            if (i % 3 == 0) {
                ZhangSan.add(c);
            } else if (i % 3 == 1) {
                LiSi.add(c);
            } else {
                WangWu.add(c);
            }
        }

        // 12. 最后拿到三张底牌(把最后三张牌截取成一个子集合)
        List<Card> lastThreeCards = allCars.subList(allCars.size() - 3, allCars.size());

        // 13. 给玩家的牌排序(从大到小)
        sortCards(ZhangSan);
        sortCards(LiSi);
        sortCards(WangWu);

        // 14. 输出玩家的牌
        System.out.println("张三的牌：" + ZhangSan);
        System.out.println("李四的牌：" + LiSi);
        System.out.println("王五的牌：" + WangWu);
        System.out.println("三张底牌：" + lastThreeCards);
    }

    /**
     * 给牌排序
     * @param cards
     */
    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, Comparator.comparingInt(Card::getIndex));
    }
}
