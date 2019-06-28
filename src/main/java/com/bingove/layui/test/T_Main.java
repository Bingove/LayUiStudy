package com.bingove.layui.test;

import com.bingove.layui.utils.ResultMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/6/20 0020上午 10:09
 * @title: T_Main
 * @ToDo
 */
public class T_Main {
    public static void main(String[] args) {
        User user1 = new User("zhangsan", "123", "河南");
        User user2 = new User("lisi", "123", "河南");
        User user3 = new User("wangwu", "123", "河南");
        Map<String , User> map = new HashMap<>();
        map.put(user1.getUserName(),user1);
        map.put(user2.getUserName(),user2);
        map.put(user3.getUserName(),user3);
        ResultMap resultMap = new ResultMap();
        resultMap.setCode("200");
        resultMap.setSuccess(true);
        resultMap.setData(map);
    }
}
