package com.sm.autosrv.aspect;

/**
 * Created by youkai on 2017/8/14.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {
    Logger logger = LoggerFactory.getLogger(getClass());
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("within(com.sm.autosrv..*)")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.debug("RESPONSE : " + ret);
        logger.debug("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }
}
