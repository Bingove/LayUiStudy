package com.bingove.layui.utils;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * @Author 常冬军
 * @Date 2018/10/18 0018上午 10:17
 */
public class HttpUtils {
    /*
    * POST请求，给别人推送json数据
    * */
    public static String HttpPostWithJson(String url, String json) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();
            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);
            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(json, "utf-8");
            //  requestEntity.setContentEncoding("utf-8");
            requestEntity.setContentType("utf-8");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setEntity(requestEntity);
            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }

    /*
     * POST请求，给别人推送xml数据
     * */
    public static String HttpPostWithXml(String url, String xml) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();
            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);
            //第三步：给httpPost设置XML格式的参数
            StringEntity requestEntity = new StringEntity(xml, "utf-8");
            //  requestEntity.setContentEncoding("utf-8");
            requestEntity.setContentType("utf-8");
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
            httpPost.setEntity(requestEntity);
            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }
    /*
     * POST请求，没有任何参数
     * */
    public static String HttpPostWithJsonNoSource(String url) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();
            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);
            //第三步：给httpPost设置JSON格式的参数
          //  StringEntity requestEntity = new StringEntity(json, "utf-8");
            //  requestEntity.setContentEncoding("utf-8");
           // requestEntity.setContentType("utf-8");
            httpPost.setHeader("Content-type", "application/json");
          //  httpPost.setEntity(requestEntity);
            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }
    /*
     * GET请求
     * */
    public static String HttpGetWithJson(String url, String json) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();
            //第二步：创建httpGet对象
            HttpGet httpGet = new HttpGet(url);
            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(json, "utf-8");
            //  requestEntity.setContentEncoding("utf-8");
            requestEntity.setContentType("utf-8");
            httpGet.setHeader("Content-type", "application/json");
           // httpGet.setEntity(requestEntity);
            //第四步：发送HttpPost请求，获取返回值
           // returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }

    /*
     * GET请求  没有参数
     * */
    public static String HttpGetWithJsonNoSource(String url) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();
            //第二步：创建httpGet对象
            HttpGet httpGet = new HttpGet(url);
            //第三步：给httpPost设置JSON格式的参数
           // StringEntity requestEntity = new StringEntity(json, "utf-8");
            //  requestEntity.setContentEncoding("utf-8");
         //   requestEntity.setContentType("utf-8");
            httpGet.setHeader("Content-type", "application/json");
          //  httpPost.setEntity(requestEntity);
            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpGet, responseHandler); //调接口获取返回值时，必须用此方法
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }
}
