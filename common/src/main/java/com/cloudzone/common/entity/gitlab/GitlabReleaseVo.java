package com.cloudzone.common.entity.gitlab;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gitlab Release
 *
 * @author rongzhihong@gome.com.cn
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabReleaseVo", description = "发布信息")
public class GitlabReleaseVo {
    @ApiModelProperty(value = "标签名称", required = true, example = "test")
    private String tagName;
    @ApiModelProperty(value = "发布描述", required = true, example = "test")
    private String description;

    public GitlabReleaseVo() {

    }

    public GitlabReleaseVo(String tagName, String description) {
        this.tagName = tagName;
        this.description = description;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
