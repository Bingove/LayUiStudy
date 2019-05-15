package com.bingove.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/14 0014下午 18:55
 * @title: DepartControler
 * @ToDo
 */
@Controller
public class DepartControler {
    @RequestMapping("/zi/departaddlist")
    public String getDepart() {
        return "/zi/departaddlist";
    }
}
