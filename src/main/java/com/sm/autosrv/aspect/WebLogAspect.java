package com.sm.autosrv.aspect;

/**
 * Created by youkai on 2017/8/14.
 */

import com.sm.autosrv.common.log.CommonLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {
    CommonLog logger = CommonLog.getLogger(getClass());
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
        logger.error("RESPONSE : " + ret);
        logger.debug("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }
}
