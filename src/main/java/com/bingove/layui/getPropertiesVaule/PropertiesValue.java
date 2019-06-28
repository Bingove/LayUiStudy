package com.bingove.layui.getPropertiesVaule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/17 0017上午 9:20
 * @title: PropertiesValue
 * @ToDo
 */
public class PropertiesValue {
    @Autowired
    private Environment env;

    public void get() {
        System.out.println(env.getProperty("userName"));
    }

}
