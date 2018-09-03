package com.cloudzone.common.entity;

import com.cloudzone.common.constant.ResponseCodes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import static com.cloudzone.common.constant.ResponseCodes.ServerError;
import static com.cloudzone.common.constant.ResponseCodes.Success;

/**
 * ResponseResult 返回前端的数据结构
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/11
 */
public class ResponseResult<T> implements Serializable {
    @ApiModelProperty(value = "响应编码", required = true, allowableValues = "200,400,500")
    private int code = 200;
    @ApiModelProperty(value = "响应描述", required = true)
    private String msg;

    @ApiModelProperty(value = "响应数据")
    private T data;

    public ResponseResult() {

    }

    public ResponseResult(T data) {
        this.data = data;
    }

    public ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(ResponseCodes codes, String msg, T data) {
        this.code = codes.getCode();
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResult newInstance(ResponseCodes code, String msg, T data) {
        return new ResponseResult(code, msg, data);
    }

    public static <T> ResponseResult newInstance(ResponseCodes code, T data) {
        return new ResponseResult(code, ResponseCodes.getDesc(code), data);
    }

    public static <T> ResponseResult newInstance(T data) {
        return new ResponseResult(Success, ResponseCodes.getDesc(Success), data);
    }

    public static ResponseResult error() {
        return new ResponseResult(ServerError, ResponseCodes.getDesc(ServerError), null);
    }

    public static <T> ResponseResult error(T data) {
        return new ResponseResult(ServerError, ResponseCodes.getDesc(ServerError), data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
