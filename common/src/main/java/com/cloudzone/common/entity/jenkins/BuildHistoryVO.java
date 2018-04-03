package com.cloudzone.common.entity.jenkins;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * BuildHistoryVO 构建历史
 *
 * @author zhoufei
 * @since 2018/3/20
 */
@ApiModel(value = "BuildHistoryVO", description = "项目构建历史信息")
public class BuildHistoryVO {
    @ApiModelProperty(value = "项目Id", required = true, example = "1009", dataType = "Long")
    private Long projectId;
    @ApiModelProperty(value = "项目名称", required = true, example = "gc-cloud", dataType = "String")
    private String projectName;
    @ApiModelProperty(value = "构建Id", required = true, example = "1024", dataType = "Long")
    private Long buildId;
    @ApiModelProperty(value = "构建用户", required = true, example = "cloudzone", dataType = "String")
    private String buildUser;
    @ApiModelProperty(value = "构建时间", required = true, example = "2018-01-01 10:00", dataType = "Date")
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date buildDate;
    @ApiModelProperty(value = "构建时长", required = true, example = "500", dataType = "Integer")
    private Long buildDuration;
    @ApiModelProperty(value = "构建状态", required = true, example = "1", dataType = "Integer")
    private Integer buildStatus;

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

    public Long getBuildId() {
        return buildId;
    }

    public void setBuildId(Long buildId) {
        this.buildId = buildId;
    }

    public String getBuildUser() {
        return buildUser;
    }

    public void setBuildUser(String buildUser) {
        this.buildUser = buildUser;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Long getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(Long buildDuration) {
        this.buildDuration = buildDuration;
    }

    public Integer getBuildStatus() {
        return buildStatus;
    }

    public void setBuildStatus(Integer buildStatus) {
        this.buildStatus = buildStatus;
    }
}
