package com.github.api.apiStringBuilder;

/*
 * 学会StringBuilder操作字符串，并且了解为什么性能好
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // ""
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(1);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("abc");
        // 支持链式编程
        sb1.append(123).append("as").append("123");
        System.out.println(sb1);

        // 支持反转
        sb1.reverse().append("123");
        System.out.println(sb1);

        // StringBuilder 只是拼接字符串的一个手段，最后还是会返回String类型。
        // 所有性能比较好
        // 最终的目的还是要恢复成String类型
        // 恢复成String 类型
        String rs = sb1.toString();
        System.out.println(rs);
    }
}


/*
 * StringBuilder 只是操作字符的一个手段，拼接修改反转
 * 最后还是返回成字符串
 */