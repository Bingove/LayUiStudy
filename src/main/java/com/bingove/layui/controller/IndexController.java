package com.bingove.layui.controller;

import com.bingove.layui.utils.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/10 0010下午 14:45
 * @title: IndexController
 * @ToDo
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String login() {
        return "login111";
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/user/doLogin",method = RequestMethod.POST)
    @ResponseBody
    public ResultMap login(String code,String userPwd) {
        System.out.println("code  " + code);
        System.out.println("userPwd  " + userPwd);
        if ("admin".equals(code) && "123".equals(userPwd)) {
            return new ResultMap(true);
        }
        return null;
    }
}
