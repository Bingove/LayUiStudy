package com.bingove.layui.aop;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 日志管理
 *
 * @author 崔兴伟1
 * @date 2017/11/23.
 */
@Aspect
@Service
public class LoggerAdvice {
    private Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);

    @Before("within(com.bingove.layui..*) && @annotation(loggerManage)")
    public void addBeforeLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
        logger.debug("执行 " + loggerManage.description() + " 开始");
        logger.debug(joinPoint.getSignature().toString());
        logger.debug(parseParames(joinPoint.getArgs()));
    }

    @AfterReturning("within(com.bingove.layui..*) && @annotation(loggerManage)")
    public void addAfterReturningLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
        logger.debug("执行 " + loggerManage.description() + " 结束");
    }

    @AfterThrowing(pointcut = "within(com.bingove.layui..*) && @annotation(loggerManage)", throwing = "ex")
    public void addAfterThrowingLogger(JoinPoint joinPoint, LoggerManage loggerManage, Exception ex) {
        logger.error("执行 " + loggerManage.description() + " 异常", ex);
    }

    private String parseParames(Object[] parames) {
        if (null == parames || parames.length <= 0) {
            return "";
        }
        StringBuffer param = new StringBuffer("传入参数[{}] ");
        for (Object obj : parames) {
            param.append(ToStringBuilder.reflectionToString(obj)).append("  ");
        }
        return param.toString();
    }
}
