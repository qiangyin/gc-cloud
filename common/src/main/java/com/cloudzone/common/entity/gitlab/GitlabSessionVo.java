package com.cloudzone.common.entity.gitlab;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gitlab Session
 *
 * @author rongzhihong@gome.com.cn
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabSessionVo", description = "Gitlab Session信息")
public class GitlabSessionVo extends GitlabUserVo {
    @ApiModelProperty(value = "用户Id", required = true, example = "H7kUpzM6ymD5Pd")
    private String privateToken;

    public GitlabSessionVo() {

    }

    public GitlabSessionVo(String privateToken, GitlabUserVo gitlabUserVo) {
        super(gitlabUserVo);
        this.privateToken = privateToken;
    }

    @Override
    public String getPrivateToken() {
        return privateToken;
    }

    @Override
    public void setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
    }

}
