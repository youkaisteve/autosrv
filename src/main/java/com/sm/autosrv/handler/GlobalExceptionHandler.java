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
    @ExceptionHandler()
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setUrl(req.getRequestURL().toString());

        if (e.getClass() == BizException.class) {
            r.setCode(ErrorInfo.BIZ_EXCEPTION);
            r.setMessage(e.getMessage());
        } else {
            r.setCode(ErrorInfo.EXCEPTION);
            r.setMessage("系统错误,请联系管理员");
        }
        return r;
    }
}
