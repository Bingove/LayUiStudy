package com.bingove.layui.controller;

import com.bingove.layui.config.RestTemplateConfig;
import com.bingove.layui.utils.HttpClientUtil;
import com.bingove.layui.utils.HttpUtils;
import com.bingove.layui.utils.RestTemplateUrl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/17 0017上午 11:07
 * @title: WeatherController
 * @ToDo
 */
@RestController
public class WeatherController {
    protected org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RestTemplateUrl restTemplateUrl;

    //https://www.apiopen.top/weatherApi?city=成都
    @RequestMapping(value = "/w", method = RequestMethod.GET)
    public void w(String city) {
        Map<String, String> map = new HashMap<>();
        map.put("city", city);
        String s = HttpClientUtil.doGet("https://www.apiopen.top/weatherApi", map);
        System.out.println(s);
    }

    @RequestMapping(value = "/w1", method = RequestMethod.GET)
    public void w1() {
        String result = "failed";
/*        try {
            String url = "http://localhost:6066/api/book";
           *//* HttpHeaders headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type);*//*
            String requestJson = "{'姓名':'张三','age':30''}";
           *//* HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
            result = restTemplate.postForObject(url, entity, String.class);*//*
            //result = restTemplateUrl.postJsonUrl(url, requestJson);
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
        System.out.println(result);*/
        String url = "http://localhost:6066/api/get";
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsna");
        map.put("age","37");
        map.put("address","河南省郑州市金水区豫星大厦");
        String s = restTemplateUrl.getUrl(url, null);
        System.out.println(s);
    }

    @RequestMapping(value = "/api/book", method = RequestMethod.POST)
    public String w2(@RequestBody String json) {
        logger.info(json);
        return "success";
    }

    @RequestMapping(value = "/api/form", method = RequestMethod.POST)
    public String w3(String name,String age) {
        logger.info("name " + name);
        logger.info("age " + age);
        return "success";
    }

    @RequestMapping(value = "/api/get", method = RequestMethod.GET)
    public String w4(String name,String age) {
        logger.info("name " + name);
        logger.info("age " + age);
        return "success";
    }
}
