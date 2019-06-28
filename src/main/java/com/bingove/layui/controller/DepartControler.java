package com.bingove.layui.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bingove.layui.test.M;
import com.bingove.layui.test.User;
import com.bingove.layui.utils.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping("/q")
    @ResponseBody
    public ResultMap getDepart1() {
        User user1 = new User("zhangsan", "123", "河南");
        User user2 = new User("lisi", "123", "河南");
        User user3 = new User("wangwu", "123", "河南");
        Map<String, User> map = new HashMap<>();
        map.put(user1.getUserName(), user1);
        map.put(user2.getUserName(), user2);
        map.put(user3.getUserName(), user3);
        ResultMap resultMap = new ResultMap();
        resultMap.setCode("200");
        resultMap.setSuccess(true);
        resultMap.setData(map);
        return resultMap;
    }

    @PostMapping("/q1")
    @ResponseBody
    public ResultMap getDepart3(@RequestBody JSONObject jsonObject) {
        String s = jsonObject.toString();
        System.out.println(s);
        User user = JSON.toJavaObject(jsonObject, User.class);
        String s1 = JSONObject.toJSONString(user, true);
        System.out.println(s1);
        System.out.println(user.toString());
        //System.out.println(user);
        ResultMap resultMap = new ResultMap();
        resultMap.setCode("200");
        resultMap.setSuccess(true);
        return resultMap;
    }

    @PostMapping("/q2")
    @ResponseBody
    public ResultMap getLove() {
        M m = new M("20190613152809myWIQ0ct1","4101000005","04-郑州市中心医院","11111");
        // 通知 中心
/*        try {
        } catch (Exception e) {
            log.info("通知中心异常");
            e.printStackTrace();
        }*/
        try {
            Map map = Map_JaveBeanUtil.convertBean(m);
            String url = "http://127.0.0.1:8016/api/hospital/stationReceiveNoticeSuccess";
            String post = HttpClientUtil.doPostJson(url,JSONObject.toJSONString(m));
            System.out.println(post);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

       /* String url = "http://121.40.106.120:6699/api/hospital/stationReceiveNoticeSuccess";
        String push = PushMessage.push(url, m);
        System.out.println(push);*/
        ResultMap resultMap = new ResultMap();
        resultMap.setCode("200");
        resultMap.setSuccess(true);
        return resultMap;
    }

    @PostMapping("/api/station/stationReceiveNoticeSuccess")
    @ResponseBody
    public ResultMap getLoveq(@RequestBody String json) {
        System.out.println(json);

       /* String url = "http://121.40.106.120:6699/api/hospital/stationReceiveNoticeSuccess";
        String push = PushMessage.push(url, m);
        System.out.println(push);*/
        ResultMap resultMap = new ResultMap();
        resultMap.setCode("200");
        resultMap.setSuccess(true);
        return resultMap;
    }
}
