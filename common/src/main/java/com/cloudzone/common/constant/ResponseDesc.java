package com.cloudzone.common.constant;

/**
 * @author tianyuliang@gome.com.cn
 * @since 2018/3/15
 */
public enum ResponseDesc {

    Success(200, "成功"),
    NotAuth(401, "操作前，请优先登录"),
    NotPermission(403, "未授权"),
    ServerError(500, "服务内部异常"),
    ParamNotValid(600, "参数异常"),
    AuthNoPass(700, "认证失败或授权失败"),
    Custom(800, "业务自定义描述"),;

    private int code;

    private String msg;

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

    ResponseDesc(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getDesc(int code) {
        for (ResponseDesc resp : ResponseDesc.values()) {
            if (resp.getCode() == code) {
                return resp.getMsg();
            }
        }
        return "未找到对应code=" + code + "的描述内容";
    }

    public static String getDesc(ResponseCodes respCode) {
        for (ResponseDesc resp : ResponseDesc.values()) {
            if (resp.getCode() == respCode.getCode()) {
                return resp.getMsg();
            }
        }
        return "未找到对应code=" + respCode.getCode() + "的描述内容";
    }

}
