package com.bingove.layui.aop;

import java.lang.annotation.*;

/**
 * 日志注解
 *
 * @author 崔兴伟
 * @date 2017/11/23.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {
    String description();
}
