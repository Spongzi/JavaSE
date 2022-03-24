package com.github.map.mapAPI;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1. 添加元素
        maps.put("iPhone99", 109);
        maps.put("哇哇", 1);
        maps.put("张三", 1);
        maps.put("华为", 100);
        maps.put("生活用品", 10);
        System.out.println(maps);

        // 2. 清空集合
//        maps.clear();
//        System.out.println(maps);

        // 3. 判断集合是否为空, 为空返回true
        System.out.println(maps.isEmpty());

        // 4. 根据键获取值
        System.out.println(maps.get("华为"));

        // 5. 根据键删除某个元素
        System.out.println(maps.remove("iPhone99"));

        // 6. 判断是否包含某个键，包含返回true
        System.out.println(maps.containsKey("华为"));
        System.out.println(maps.containsKey("iPhone99"));

        // 7. 判断是否包含某个值
        System.out.println(maps.containsValue(100));
        System.out.println(maps.containsValue(19));

        // 8. 获取全度的键集合
        Set<String> set = maps.keySet();
        System.out.println(set);

        // 9. 获取全部值的商品
        Collection<Integer> values = maps.values();
        System.out.println(values);

        // 10. 集合的大小
        System.out.println(maps.size());

        // 11. 合并其他map集合
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("jvav", 1);
        maps.putAll(map1);
        System.out.println(maps);
    }
}
