package com.bingove.layui.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 返回封装结果类
 *
 * @author 崔兴伟
 * @date 2017/11/18.
 */
public class ResultMap implements Serializable {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 提示消息
     */
    private String msg;
    /**
     * 消息码
     */
    private String code;
    /**
     * 返回数据
     */
    private Object data;

    public ResultMap() {
        this.success = false;
    }

    public ResultMap(boolean success) {
        this.success = success;
    }

    public ResultMap(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResultMap(boolean success, String msg, String code) {
        this.success = success;
        this.msg = msg;
        this.code = code;
    }

    public ResultMap(boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public ResultMap(boolean success, List<?> list) {
        this.success = success;
        this.msg = msg;
        this.data = list;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
