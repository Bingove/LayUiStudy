package com.xhs.api.model;

import java.io.Serializable;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/14 0014下午 15:33
 * @title: User
 * @ToDo
 */
public class User implements Serializable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
