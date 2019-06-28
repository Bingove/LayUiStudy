package com.bingove.layui.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/20 0020上午 9:46
 * @title: RestTemplateUrl
 * @ToDo
 */
@Component  // 把普通的 pojo 实现注入   把普通pojo实例化到spring容器中
public class RestTemplateUrl {
    @Autowired
    RestTemplate restTemplate;

    /**
     * post请求，参数json
     *
     * @param url
     * @param requestJson
     * @return 返回结果，如果为failed 表示接口调用失败
     */
    public String postJsonUrl(String url, String requestJson) {
        String result = "failed";
        try {
            HttpHeaders headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type);
            HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
            result = restTemplate.postForObject(url, entity, String.class);
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * post请求，表单提交
     *
     * @param url
     * @param map
     * @return
     */
    public String postFormUrl(String url, Map<String, String> map) {
        String result = "failed";
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            if (map != null) {
                for (String key : map.keySet()) {
                    linkedMultiValueMap.add(key, map.get(key));
                    System.out.println(key + ": " + map.get(key));
                }
            }
            HttpEntity<LinkedMultiValueMap<String, String>> req = new HttpEntity<LinkedMultiValueMap<String, String>>(linkedMultiValueMap, headers);
            ResponseEntity<String> ret = restTemplate.postForEntity(url, req, String.class);
            result = ret.getBody();
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *  get 请求 有参数 或者无参数
     * @param url
     * @param map
     * @return
     */
    public String getUrl(String url, Map<String, String> map) {
        String result = "failed";
        try {
            String param = "?";
            String p="";
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println("Key = " + key + ", Value = " + value);
                    param += key + "=" + map.get(key) + "&";
                }
                p = param.substring(0,param.length()-1);
                System.out.println(p);
            }
            ResponseEntity<String> ret = restTemplate.getForEntity(url + p, String.class);
            result = ret.getBody();
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
        return result;
    }
}
