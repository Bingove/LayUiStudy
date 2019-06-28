package com.bingove.layui.utils;


import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

/**
 * 描述:
 * http请求工具类
 *
 * @author 王鹏飞
 * @create 2019-06-14 09:28
 */

public class HttpUtil {
    /**
     * 支持的Http method
     *
     */
    private static int connectTimeout = 3000;
    private static int readTimeout = 3000;
    private static String charset = "utf-8";
    private static enum HttpMethod {
        POST,DELETE,GET,PUT,HEAD;
    };

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static String invokeUrl(String url, Map params, Map<String,String> headers, int connectTimeout, int readTimeout, String encoding, HttpMethod method){
        //构造请求参数字符串
        StringBuilder paramsStr = null;
        if(params != null){
            paramsStr = new StringBuilder();
            Set<Map.Entry> entries = params.entrySet();
            for(Map.Entry entry:entries){
                String value = (entry.getValue()!=null)?(String.valueOf(entry.getValue())):"";
                paramsStr.append(entry.getKey() + "=" + value + "&");
            }
            //只有POST方法才能通过OutputStream(即form的形式)提交参数
            if(method != HttpMethod.POST){
                url += "?"+paramsStr.toString();
            }
        }

        URL uUrl = null;
        HttpURLConnection conn = null;
        BufferedWriter out = null;
        BufferedReader in = null;
        try {
            //创建和初始化连接
            uUrl = new URL(url);
            conn = (HttpURLConnection) uUrl.openConnection();
            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            conn.setRequestMethod(method.toString());
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //设置连接超时时间
            conn.setConnectTimeout(connectTimeout);
            //设置读取超时时间
            conn.setReadTimeout(readTimeout);
            //指定请求header参数
            if(headers != null && headers.size() > 0){
                Set<String> headerSet = headers.keySet();
                for(String key:headerSet){
                    conn.setRequestProperty(key, headers.get(key));
                }
            }

            if(paramsStr != null && method == HttpMethod.POST){
                //发送请求参数
                out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(),encoding));
                out.write(paramsStr.toString());
                out.flush();
            }

            //接收返回结果
            StringBuilder result = new StringBuilder();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(),encoding));
            if(in != null){
                String line = "";
                while ((line = in.readLine()) != null) {
                    result.append(line);
                }
            }
            return result.toString();
        } catch (Exception e) {
            //log.error("调用接口["+url+"]失败！请求URL："+url+"，参数："+params,e);
            //处理错误流，提高http连接被重用的几率
            try {
                byte[] buf = new byte[100];
                InputStream es = conn.getErrorStream();
                if(es != null){
                    while (es.read(buf) > 0) {;}
                    es.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (in !=null) {
                    in.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            //关闭连接
            if (conn != null){
                conn.disconnect();
            }
        }
        return null;
    }

    /**
     * POST方法提交Http请求，语义为“增加” <br/>
     * 注意：Http方法中只有POST方法才能使用body来提交内容
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String post(String url, Map params, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.POST);
    }
    /**
     * POST方法提交Http请求，语义为“增加” <br/>
     * 注意：Http方法中只有POST方法才能使用body来提交内容
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @return
     */
    public static String post(String url, Map params){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.POST);
    }
    /**
     * POST方法提交Http请求，语义为“增加” <br/>
     * 注意：Http方法中只有POST方法才能使用body来提交内容
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param headers 请求头参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String post(String url, Map params, Map<String,String> headers, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,headers,connectTimeout,readTimeout,charset, HttpMethod.POST);
    }

    /**
     * GET方法提交Http请求，语义为“查询”
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String get(String url, Map params, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.GET);
    }
    /**
     * GET方法提交Http请求，语义为“查询”
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @return
     */
    public static String get(String url, Map params){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.GET);
    }
    /**
     * GET方法提交Http请求，语义为“查询”
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param headers 请求头参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String get(String url, Map params, Map<String,String> headers,int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,headers,connectTimeout,readTimeout,charset, HttpMethod.GET);
    }

    /**
     * PUT方法提交Http请求，语义为“更改” <br/>
     * 注意：PUT方法也是使用url提交参数内容而非body，所以参数最大长度收到服务器端实现的限制，Resin大概是8K
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String put(String url, Map params, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.PUT);
    }

    /**
     * PUT方法提交Http请求，语义为“更改” <br/>
     * 注意：PUT方法也是使用url提交参数内容而非body，所以参数最大长度收到服务器端实现的限制，Resin大概是8K
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param headers 请求头参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String put(String url, Map params, Map<String,String> headers,int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,headers,connectTimeout,readTimeout,charset, HttpMethod.PUT);
    }

    /**
     * DELETE方法提交Http请求，语义为“删除”
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String delete(String url, Map params, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.DELETE);
    }

    /**
     * DELETE方法提交Http请求，语义为“删除”
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param headers 请求头参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String delete(String url, Map params, Map<String,String> headers, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,headers,connectTimeout,readTimeout,charset, HttpMethod.DELETE);
    }

    /**
     * HEAD方法提交Http请求，语义同GET方法  <br/>
     * 跟GET方法不同的是，用该方法请求，服务端不返回message body只返回头信息，能节省带宽
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String head(String url, Map params, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,null,connectTimeout,readTimeout,charset, HttpMethod.HEAD);
    }

    /**
     * HEAD方法提交Http请求，语义同GET方法  <br/>
     * 跟GET方法不同的是，用该方法请求，服务端不返回message body只返回头信息，能节省带宽
     * @param url 资源路径（如果url中已经包含参数，则params应该为null）
     * @param params 参数
     * @param headers 请求头参数
     * @param connectTimeout 连接超时时间（单位为ms）
     * @param readTimeout 读取超时时间（单位为ms）
     * @param charset 字符集（一般该为“utf-8”）
     * @return
     */
    public static String head(String url, Map params, Map<String,String> headers, int connectTimeout, int readTimeout, String charset){
        return invokeUrl(url,params,headers,connectTimeout,readTimeout,charset, HttpMethod.HEAD);
    }

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
}
