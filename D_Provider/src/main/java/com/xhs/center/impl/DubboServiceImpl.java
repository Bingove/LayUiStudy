package com.xhs.center.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xhs.api.model.User;
import com.xhs.api.service.DubboService;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/14 0014上午 10:14
 * @title: DubboServiceImpl
 * @ToDo
 */
@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {
    @Override
    public void sayHello(String name) {
        System.out.println("name -- " + name);
    }

    @Override
    public void getUser(User user) {
        System.out.println(user.getAge() + "  --  " + user.getName());
    }
}
