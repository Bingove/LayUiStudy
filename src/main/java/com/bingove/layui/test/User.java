package com.bingove.layui.test;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/6/20 0020上午 10:10
 * @title: User
 * @ToDo
 */
public class User {
    private String userName;
    private String password;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public User() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String userName, String password, String address) {
        this.userName = userName;
        this.password = password;
        this.address = address;
    }
}
