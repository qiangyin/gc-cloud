package com.cloudzone.common.entity.gitlab;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gitlab Group
 *
 * @author rongzhihong@gome.com.cn
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabGroupVo", description = "Gitlab分组信息")
public class GitlabGroupVo {
    @ApiModelProperty(value = "分组Id", required = true, example = "2")
    private Integer id;
    @ApiModelProperty(value = "分组名称", required = true, example = "cloudzone")
    private String name;
    @ApiModelProperty(value = "分组相对路径", required = true, example = "cloudzone")
    private String path;
    @ApiModelProperty(value = "分组web访问路径", required = true, example = "http://10.112.101.94/groups/cloudzone")
    private String webUrl;

    public GitlabGroupVo() {

    }

    public GitlabGroupVo(Integer id, String name, String path, String webUrl) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.webUrl = webUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
