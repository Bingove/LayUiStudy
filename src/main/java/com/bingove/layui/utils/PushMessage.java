package com.bingove.layui.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author 常冬军
 * @Date 2018/10/19 0019上午 9:54
 */
public class PushMessage {
    public static String push(String url, Object o) {
        String s = JSONObject.toJSONString(o);
        //String s = JSONArray.toJSONString(o);
        String s1 = HttpUtils.HttpPostWithJson(url, s);
        return s1;
    }
    public static String pushGet(String url, Object o) {
        String s = JSONObject.toJSONString(o);
        //String s = JSONArray.toJSONString(o);
        String s1 = HttpUtils.HttpPostWithJson(url, s);
        return s1;
    }

}
