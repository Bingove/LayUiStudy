package com.bingove.layui.getPropertiesVaule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/17 0017上午 9:26
 * @title: TestController
 * @ToDo
 */
@RestController
public class TestController {
    @Autowired
    private Environment env;
    @Autowired
    TestEntity testEntity;
    @RequestMapping("/pro")
    public void pro() {
        System.out.println(env.getProperty("url"));
    }

    @RequestMapping("/t")
    public void pro1() {
        System.out.println(testEntity.getUserName() + " ---  " + testEntity.getPassword());
    }
}
