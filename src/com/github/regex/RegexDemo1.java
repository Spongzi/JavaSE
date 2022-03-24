package com.github.regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("123123"));
        System.out.println(checkQQ2("12345"));
    }

    public static boolean checkQQ2(String qq) {
        // \d 代表是全部数字
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq) {
        // 1. 判断QQ号码长度是否满足
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        // 判断QQ里面是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            // 判断这个字符是不是数组，不是数组直接返回false
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    // 校验密码
    public static boolean checkPassword(String password) {
        return password != null && password.matches("\\w{6,}");
    }

    // 验证码 必须是数组和字符， 必须是四位
    public static boolean checkYzm(String yzm) {
        return yzm != null && yzm.matches("\\w&[^_]{4}");
    }
}
