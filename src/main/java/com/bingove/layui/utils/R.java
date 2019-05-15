package com.bingove.layui.utils;

/**
 * @Author 常冬军
 * @Date 2019/2/26 0026下午 16:35
 */
public class R {
    private String msg;
    private boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public R() {
    }

    public R(String msg, boolean success) {
        this.msg = msg;
        this.success = success;
    }
}
