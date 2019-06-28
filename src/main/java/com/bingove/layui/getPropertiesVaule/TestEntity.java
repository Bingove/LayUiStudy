package com.bingove.layui.getPropertiesVaule;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/17 0017上午 9:39
 * @title: TestEntity
 * @ToDo
 */
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:/config/abc.properties")
public class TestEntity {
    private String userName;
    private String password;

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
}
