package com.cloudzone.common.constant;

/**
 * 响应状态值
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/11
 */
public enum ResponseCodes {

    /**
     * Success        成功
     * NotAuth        未登录或Session已过期
     * NotPermission  未授权
     * ServerError    服务内部异常
     * ParamNotValid  参数格式无效、参数类型无效、参数名不正确
     * AuthNoPass     认证失败/授权失败
     * Custom         业务自定义状态码（对应描述信息由业务自定义）
     */
    Success(200), NotAuth(401), NotPermission(403), ServerError(500), ParamNotValid(600), AuthNoPass(700), Custom(800);

    private int code;

    ResponseCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static String getDesc(ResponseCodes code) {
        return ResponseDesc.getDesc(code.getCode());
    }

}
