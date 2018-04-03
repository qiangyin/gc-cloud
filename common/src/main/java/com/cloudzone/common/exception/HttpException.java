package com.cloudzone.common.exception;


/**
 * Http请求异常
 *
 * @author tianyuliang@gome.com.cn
 * @since 2018/3/15
 */
public class HttpException extends RuntimeException {

    public HttpException(String message) {
        super(message);
    }

    public HttpException(Throwable cause) {
        super(cause);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }
}
