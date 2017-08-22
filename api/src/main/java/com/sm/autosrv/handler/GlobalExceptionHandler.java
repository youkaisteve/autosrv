package com.sm.autosrv.handler;

import com.sm.autosrv.common.exception.BusinessException;
import com.sm.autosrv.model.ErrorInfo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by youkai on 2017/8/13.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler()
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setUrl(req.getRequestURL().toString());

        if (e.getClass() == BusinessException.class) {
            r.setCode(ErrorInfo.BIZ_EXCEPTION);
            r.setMessage(e.getMessage());
        } else {
            r.setCode(ErrorInfo.EXCEPTION);
            r.setMessage("系统错误,请联系管理员");
            logger.error("message:%s\nstacktrace:%s", e.getMessage(), e.getStackTrace());
        }
        return r;
    }
}
