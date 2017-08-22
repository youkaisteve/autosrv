package com.sm.autosrv.model;

/**
 * Created by youkai on 2017/8/13.
 */
public class ErrorInfo<T> {
    public static final Integer OK = 0;
    public static final Integer BIZ_EXCEPTION = 1;
    public static final Integer EXCEPTION = 2;
    private Integer code;
    private String message;
    private String url;
    private T data;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
