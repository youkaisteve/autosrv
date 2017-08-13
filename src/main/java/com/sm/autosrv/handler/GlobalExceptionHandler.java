package com.sm.autosrv.handler;

import com.sm.autosrv.domain.common.BizException;
import com.sm.autosrv.domain.model.ErrorInfo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by youkai on 2017/8/13.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, BizException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.BIZ_EXCEPTION);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
