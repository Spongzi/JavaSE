package com.github.regex;

import java.util.Scanner;

public class RegexText {
    public static void main(String[] args) {
        // 目标：校验 手机号码， 邮箱， 电话号码
        checkPhone();
        checkEmail();
        checkTel();
        checkMoney();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的手机号码:");
            String phone = sc.next();
            // 判断手机号码格式是否正确
            if (phone.matches("1[23456789]\\d{9}")) {
                System.out.println("手机号码格式正确，注册完成");
                break;
            } else {
                System.out.println("格式错误，请重新输入");
            }
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的邮箱:");
            String email = sc.next();
            // 判断邮箱格式是否正确
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("邮箱格式正确，注册完成");
                break;
            } else {
                System.out.println("格式错误，请重新输入");
            }
        }
    }

    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的电话号码:");
            String tel = sc.next();
            // 判断电话号码格式是否正确
            if (tel.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("电话号码格式正确，注册完成");
                break;
            } else {
                System.out.println("格式错误，请重新输入");
            }
        }
    }

    public static void checkMoney() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入金额:");
            String money = sc.next();
            // 判断电话号码格式是否正确
            if (money.matches("0?\\d*\\.?\\d{1,2}")) {
                System.out.println("金额格式正确，注册完成");
                break;
            } else {
                System.out.println("格式错误，请重新输入");
            }
        }
    }


}
