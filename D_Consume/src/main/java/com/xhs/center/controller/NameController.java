package com.xhs.center.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xhs.api.model.User;
import com.xhs.api.service.DubboService;
import groovy.util.logging.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/14 0014上午 10:49
 * @title: NameController
 * @ToDo
 */
@Slf4j
@RestController
@RequestMapping("/dubbo")
public class NameController {
    @Reference(version = "1.0.0")
    DubboService dubboService;


    @RequestMapping("/sayHello")
    public String sayHello() {
        System.out.println("dubbo开始调用");
        dubboService.sayHello("consumer 请求服务");
        return "sayHello";
    }

    @RequestMapping("/sayHello1")
    public String sayHello1() {
        System.out.println("dubbo开始调用");
        User u = new User();
        u.setAge(90);
        u.setName("ooo");
        dubboService.getUser(u);
        return "sayHello";
    }
}
