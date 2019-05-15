package com.xhs.api.service;

import com.xhs.api.model.User;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/14 0014上午 10:13
 * @title: DubboService
 * @ToDo
 */
public interface DubboService {
    void sayHello(String name);
    void getUser(User user);
}
