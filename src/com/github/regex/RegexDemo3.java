package com.github.regex;

import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ,4001003232";

        // 需求，从上面的内容中爬取电话号码和邮箱
        String regex = "(1[23456789]\\d{9})|" +
                "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|" +
                "(0\\d{2,6}-?\\d{5,20})|" +
                "(400-?\\d{3,9}-?\\d{3,9})";

        // 把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        // 3. 得到一个内容匹配器对象那个
        Matcher matcher = pattern.matcher(rs);

        // 4. 开始寻找
        while (matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
