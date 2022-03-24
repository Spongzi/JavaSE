package com.ioStudy.io_2.serializable;

import java.io.Serializable;

/**
 * 对象如果要序列化，就必须实现Serializable接口
 */
public class Student1 implements Serializable {
    // 声明序列化的版本号
    // 序列化版本号和反序列化版本号一致才不会出错
    public static final long serialVersionUID = 2;
    private String name;
    private String loginName;
    // transient 修饰的成员变量不参与序列化
    private transient String password;
    private int age;

    public Student1() {
    }

    public Student1(String name, String loginName, String password, int age) {
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
