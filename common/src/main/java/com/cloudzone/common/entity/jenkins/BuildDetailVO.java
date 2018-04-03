package com.cloudzone.common.entity.jenkins;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * BuildDetailVO 构建详情
 *
 * @author zhoufei
 * @since 2018/3/22
 */
@ApiModel(value = "BuildDetailVO", description = "构建任务详情")
public class BuildDetailVO {
    @ApiModelProperty(value = "项目Id", required = true, example = "1009", dataType = "Long")
    private Long projectId;

    @ApiModelProperty(value = "项目名称", required = true, example = "gc-cloud", dataType = "String")
    private String projectName;

    @ApiModelProperty(value = "创建用户", required = true, example = "cloudzone", dataType = "String")
    private String userName;

    @ApiModelProperty(value = "项目描述", required = true, example = "容器云平台", dataType = "String")
    private String des;

    @ApiModelProperty(value = "创建时间", required = true, example = "2018-01-01 10:00", dataType = "Date")
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date createTime;

    @ApiModelProperty(value = "更新时间", required = true, example = "2018-01-01 10:00", dataType = "Date")
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date updateTime;

    @ApiModelProperty(value = "构建配置信息", required = true)
    private BuildConfigVO buildConfig;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BuildConfigVO getBuildConfig() {
        return buildConfig;
    }

    public void setBuildConfig(BuildConfigVO buildConfig) {
        this.buildConfig = buildConfig;
    }
}
