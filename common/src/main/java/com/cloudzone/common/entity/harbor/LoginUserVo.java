package com.cloudzone.common.entity.harbor;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 登录用户VO
 *
 * @author gaoyanlei
 * @since 2018/3/22
 */
@ApiModel(value = "LoginUserVo", description = "登录用户")
public class LoginUserVo {
    @ApiModelProperty(value = "用户名", required = true, example = "admin", dataType = "String")
    private String principal;

    @ApiModelProperty(value = "密码", required = true, example = "Harbor12345", dataType = "String")
    private String password;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
