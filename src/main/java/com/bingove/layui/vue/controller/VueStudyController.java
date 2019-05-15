package com.bingove.layui.vue.controller;

import com.bingove.layui.utils.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/15 0015上午 11:44
 * @title: VueStudyController
 * @ToDo
 */
@Controller
public class VueStudyController {
    @RequestMapping("/vue_study")
    public String vue_study() {
        return "/vue/vue_study";
    }

    @RequestMapping(value = "/post.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap vue_post(String name, int age) {
        System.out.println(name + "  ----  " + age);
        return new ResultMap(true, "success", "200");
    }

    @RequestMapping(value = "/try/ajax/demo_test_post.php", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap vue_post1(String name, String url) {
        System.out.println(name + "  ----  " + url);
        return new ResultMap(true, "success", "200");
    }

    @RequestMapping("/vue_form")
    public String vue_form() {
        return "/vue/vue_form";
    }
}
