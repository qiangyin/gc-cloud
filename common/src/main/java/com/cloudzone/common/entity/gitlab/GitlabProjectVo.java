package com.cloudzone.common.entity.gitlab;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Gitlab Project
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabProjectVo", description = "获得某个用户分组下的所有项目")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitlabProjectVo {
    @ApiModelProperty(value = "项目Id", required = true, example = "7")
    private Integer id;
    @ApiModelProperty(value = "项目名称", required = true, example = "console")
    private String name;
    @ApiModelProperty(value = "项目描述", required = true, example = "容器管理后台")
    private String description;
    @ApiModelProperty(value = "默认分支", required = true, example = "master")
    private String defaultBranch;
    @ApiModelProperty(value = "项目相对路径", required = true, example = "console")
    private String path;
    @ApiModelProperty(value = "空间下的项目路径", required = true, example = "cloudzone/console")
    private String pathWithNamespace;
    @ApiModelProperty(value = "sshUrl", required = true, example = "git\\@10.112.101.94:cloudzone/console.git")
    private String sshUrl;
    @ApiModelProperty(value = "webUrl", required = true, example = "http://10.112.101.94/cloudzone/console")
    private String webUrl;
    @ApiModelProperty(value = "httpUrl", required = true, example = "http://10.112.101.94/cloudzone/console.git")
    private String httpUrl;
    @ApiModelProperty(value = "项目名称", required = true, example = "2018-03-21 12:01:35")
    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastActivityAt;


    public GitlabProjectVo() {

    }

    public GitlabProjectVo(Integer id, String name, String description,
                           String defaultBranch, String path, String pathWithNamespace,
                           String sshUrl, String webUrl, String httpUrl, Date lastActivityAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.defaultBranch = defaultBranch;
        this.path = path;
        this.pathWithNamespace = pathWithNamespace;
        this.sshUrl = sshUrl;
        this.webUrl = webUrl;
        this.httpUrl = httpUrl;
        this.lastActivityAt = lastActivityAt;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public Date getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(Date lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }
}
